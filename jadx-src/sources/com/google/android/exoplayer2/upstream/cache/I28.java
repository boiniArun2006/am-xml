package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.VersionTable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.AtomicFile;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Ln;
import com.google.common.collect.xZD;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class I28 {
    private w6 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private w6 f58436O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap f58437n;
    private final SparseBooleanArray nr;
    private final SparseArray rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SparseBooleanArray f58438t;

    private static final class j implements w6 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final String[] f58439O = {"id", "key", TtmlNode.TAG_METADATA};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final DatabaseProvider f58440n;
        private String nr;
        private final SparseArray rl = new SparseArray();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f58441t;

        private void J2(SQLiteDatabase sQLiteDatabase, int i2) {
            sQLiteDatabase.delete((String) Assertions.checkNotNull(this.nr), "id = ?", new String[]{Integer.toString(i2)});
        }

        private Cursor KN() {
            return this.f58440n.getReadableDatabase().query((String) Assertions.checkNotNull(this.nr), f58439O, null, null, null, null, null);
        }

        private static void Uo(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private void mUb(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            VersionTable.setVersion(sQLiteDatabase, 1, (String) Assertions.checkNotNull(this.f58441t), 1);
            Uo(sQLiteDatabase, (String) Assertions.checkNotNull(this.nr));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.nr + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        private void t(SQLiteDatabase sQLiteDatabase, Ml ml) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            I28.S(ml.nr(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(ml.f58446n));
            contentValues.put("key", ml.rl);
            contentValues.put(TtmlNode.TAG_METADATA, byteArray);
            sQLiteDatabase.replaceOrThrow((String) Assertions.checkNotNull(this.nr), null, contentValues);
        }

        private static String xMQ(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void delete() throws DatabaseIOException {
            O(this.f58440n, (String) Assertions.checkNotNull(this.f58441t));
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public boolean exists() {
            return VersionTable.getVersion(this.f58440n.getReadableDatabase(), 1, (String) Assertions.checkNotNull(this.f58441t)) != -1;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void load(HashMap map, SparseArray sparseArray) throws DatabaseIOException {
            Assertions.checkState(this.rl.size() == 0);
            try {
                if (VersionTable.getVersion(this.f58440n.getReadableDatabase(), 1, (String) Assertions.checkNotNull(this.f58441t)) != 1) {
                    SQLiteDatabase writableDatabase = this.f58440n.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        mUb(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                Cursor cursorKN = KN();
                while (cursorKN.moveToNext()) {
                    try {
                        Ml ml = new Ml(cursorKN.getInt(0), (String) Assertions.checkNotNull(cursorKN.getString(1)), I28.o(new DataInputStream(new ByteArrayInputStream(cursorKN.getBlob(2)))));
                        map.put(ml.rl, ml);
                        sparseArray.put(ml.f58446n, ml.rl);
                    } finally {
                    }
                }
                cursorKN.close();
            } catch (SQLiteException e2) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e2);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void n(Ml ml, boolean z2) {
            if (z2) {
                this.rl.delete(ml.f58446n);
            } else {
                this.rl.put(ml.f58446n, null);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void rl(Ml ml) {
            this.rl.put(ml.f58446n, ml);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void storeFully(HashMap map) throws DatabaseIOException {
            try {
                SQLiteDatabase writableDatabase = this.f58440n.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    mUb(writableDatabase);
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        t(writableDatabase, (Ml) it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.rl.clear();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void storeIncremental(HashMap map) throws DatabaseIOException {
            if (this.rl.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f58440n.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i2 = 0; i2 < this.rl.size(); i2++) {
                    try {
                        Ml ml = (Ml) this.rl.valueAt(i2);
                        if (ml == null) {
                            J2(writableDatabase, this.rl.keyAt(i2));
                        } else {
                            t(writableDatabase, ml);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.rl.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        public j(DatabaseProvider databaseProvider) {
            this.f58440n = databaseProvider;
        }

        private static void O(DatabaseProvider databaseProvider, String str) throws DatabaseIOException {
            try {
                String strXMQ = xMQ(str);
                SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    VersionTable.removeVersion(writableDatabase, 1, str);
                    Uo(writableDatabase, strXMQ);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        public static void nr(DatabaseProvider databaseProvider, long j2) throws DatabaseIOException {
            O(databaseProvider, Long.toHexString(j2));
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void initialize(long j2) {
            String hexString = Long.toHexString(j2);
            this.f58441t = hexString;
            this.nr = xMQ(hexString);
        }
    }

    private static class n implements w6 {
        private boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final AtomicFile f58442O;
        private CN3 Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final boolean f58443n;
        private final SecureRandom nr;
        private final Cipher rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final SecretKeySpec f58444t;

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void Uo(HashMap map) throws Throwable {
            CN3 cn3;
            DataOutputStream dataOutputStream;
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream outputStreamStartWrite = this.f58442O.startWrite();
                CN3 cn32 = this.Uo;
                if (cn32 == null) {
                    this.Uo = new CN3(outputStreamStartWrite);
                } else {
                    cn32.n(outputStreamStartWrite);
                }
                cn3 = this.Uo;
                dataOutputStream = new DataOutputStream(cn3);
            } catch (Throwable th) {
                th = th;
            }
            try {
                dataOutputStream.writeInt(2);
                int iT = 0;
                dataOutputStream.writeInt(this.f58443n ? 1 : 0);
                if (this.f58443n) {
                    byte[] bArr = new byte[16];
                    ((SecureRandom) Util.castNonNull(this.nr)).nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        ((Cipher) Util.castNonNull(this.rl)).init(1, (Key) Util.castNonNull(this.f58444t), new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(cn3, this.rl));
                    } catch (InvalidAlgorithmParameterException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e3) {
                        e = e3;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(map.size());
                for (Ml ml : map.values()) {
                    J2(ml, dataOutputStream);
                    iT += t(ml, 2);
                }
                dataOutputStream.writeInt(iT);
                this.f58442O.endWrite(dataOutputStream);
                Util.closeQuietly(null);
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream2 = dataOutputStream;
                Util.closeQuietly(dataOutputStream2);
                throw th;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void initialize(long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void n(Ml ml, boolean z2) {
            this.J2 = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void rl(Ml ml) {
            this.J2 = true;
        }

        private void J2(Ml ml, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(ml.f58446n);
            dataOutputStream.writeUTF(ml.rl);
            I28.S(ml.nr(), dataOutputStream);
        }

        private boolean O(HashMap map, SparseArray sparseArray) throws Throwable {
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            if (!this.f58442O.exists()) {
                return true;
            }
            DataInputStream dataInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(this.f58442O.openRead());
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                int i2 = dataInputStream.readInt();
                if (i2 >= 0 && i2 <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.rl == null) {
                            Util.closeQuietly(dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            this.rl.init(2, (Key) Util.castNonNull(this.f58444t), new IvParameterSpec(bArr));
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.rl));
                        } catch (InvalidAlgorithmParameterException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        }
                    } else if (this.f58443n) {
                        this.J2 = true;
                    }
                    int i3 = dataInputStream.readInt();
                    int iT = 0;
                    for (int i5 = 0; i5 < i3; i5++) {
                        Ml mlNr = nr(i2, dataInputStream);
                        map.put(mlNr.rl, mlNr);
                        sparseArray.put(mlNr.f58446n, mlNr.rl);
                        iT += t(mlNr, i2);
                    }
                    int i7 = dataInputStream.readInt();
                    boolean z2 = dataInputStream.read() == -1;
                    if (i7 == iT && z2) {
                        Util.closeQuietly(dataInputStream);
                        return true;
                    }
                    Util.closeQuietly(dataInputStream);
                    return false;
                }
                Util.closeQuietly(dataInputStream);
                return false;
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    Util.closeQuietly(dataInputStream2);
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    Util.closeQuietly(dataInputStream2);
                }
                throw th;
            }
        }

        private int t(Ml ml, int i2) {
            int i3;
            int iHashCode;
            int iHashCode2 = (ml.f58446n * 31) + ml.rl.hashCode();
            if (i2 < 2) {
                long contentLength = ContentMetadata.getContentLength(ml.nr());
                i3 = iHashCode2 * 31;
                iHashCode = (int) (contentLength ^ (contentLength >>> 32));
            } else {
                i3 = iHashCode2 * 31;
                iHashCode = ml.nr().hashCode();
            }
            return i3 + iHashCode;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void delete() {
            this.f58442O.delete();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public boolean exists() {
            return this.f58442O.exists();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void load(HashMap map, SparseArray sparseArray) {
            Assertions.checkState(!this.J2);
            if (O(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f58442O.delete();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void storeIncremental(HashMap map) throws Throwable {
            if (this.J2) {
                storeFully(map);
            }
        }

        public n(File file, byte[] bArr, boolean z2) {
            boolean z3;
            Cipher cipherMUb;
            SecretKeySpec secretKeySpec;
            if (bArr == null && z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            Assertions.checkState(z3);
            if (bArr != null) {
                Assertions.checkArgument(bArr.length == 16);
                try {
                    cipherMUb = I28.mUb();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                    throw new IllegalStateException(e2);
                }
            } else {
                Assertions.checkArgument(!z2);
                cipherMUb = null;
                secretKeySpec = null;
            }
            this.f58443n = z2;
            this.rl = cipherMUb;
            this.f58444t = secretKeySpec;
            this.nr = z2 ? new SecureRandom() : null;
            this.f58442O = new AtomicFile(file);
        }

        private Ml nr(int i2, DataInputStream dataInputStream) throws IOException {
            DefaultContentMetadata defaultContentMetadataO;
            int i3 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i2 >= 2) {
                defaultContentMetadataO = I28.o(dataInputStream);
            } else {
                long j2 = dataInputStream.readLong();
                ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
                ContentMetadataMutations.setContentLength(contentMetadataMutations, j2);
                defaultContentMetadataO = DefaultContentMetadata.EMPTY.copyWithMutationsApplied(contentMetadataMutations);
            }
            return new Ml(i3, utf, defaultContentMetadataO);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.I28.w6
        public void storeFully(HashMap map) throws Throwable {
            Uo(map);
            this.J2 = false;
        }
    }

    private interface w6 {
        void delete();

        boolean exists();

        void initialize(long j2);

        void load(HashMap map, SparseArray sparseArray);

        void n(Ml ml, boolean z2);

        void rl(Ml ml);

        void storeFully(HashMap map);

        void storeIncremental(HashMap map);
    }

    public static boolean Ik(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Cipher mUb() {
        if (Util.SDK_INT == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    private Ml nr(String str) {
        int iTy = ty(this.rl);
        Ml ml = new Ml(iTy, str);
        this.f58437n.put(str, ml);
        this.rl.put(iTy, str);
        this.nr.put(iTy, true);
        this.f58436O.rl(ml);
        return ml;
    }

    public Ml HI(String str) {
        Ml ml = (Ml) this.f58437n.get(str);
        return ml == null ? nr(str) : ml;
    }

    public Ml KN(String str) {
        return (Ml) this.f58437n.get(str);
    }

    public void XQ() {
        this.f58436O.storeIncremental(this.f58437n);
        int size = this.f58438t.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.rl.remove(this.f58438t.keyAt(i2));
        }
        this.f58438t.clear();
        this.nr.clear();
    }

    public void Z() {
        xZD it = Ln.az(this.f58437n.keySet()).iterator();
        while (it.hasNext()) {
            r((String) it.next());
        }
    }

    public Set az() {
        return this.f58437n.keySet();
    }

    public void ck(long j2) {
        w6 w6Var;
        this.f58436O.initialize(j2);
        w6 w6Var2 = this.J2;
        if (w6Var2 != null) {
            w6Var2.initialize(j2);
        }
        if (this.f58436O.exists() || (w6Var = this.J2) == null || !w6Var.exists()) {
            this.f58436O.load(this.f58437n, this.rl);
        } else {
            this.J2.load(this.f58437n, this.rl);
            this.f58436O.storeFully(this.f58437n);
        }
        w6 w6Var3 = this.J2;
        if (w6Var3 != null) {
            w6Var3.delete();
            this.J2 = null;
        }
    }

    public String qie(int i2) {
        return (String) this.rl.get(i2);
    }

    public void r(String str) {
        Ml ml = (Ml) this.f58437n.get(str);
        if (ml != null && ml.Uo() && ml.xMQ()) {
            this.f58437n.remove(str);
            int i2 = ml.f58446n;
            boolean z2 = this.nr.get(i2);
            this.f58436O.n(ml, z2);
            if (z2) {
                this.rl.remove(i2);
                this.nr.delete(i2);
            } else {
                this.rl.put(i2, null);
                this.f58438t.put(i2, true);
            }
        }
    }

    public Collection xMQ() {
        return Collections.unmodifiableCollection(this.f58437n.values());
    }

    public I28(DatabaseProvider databaseProvider, File file, byte[] bArr, boolean z2, boolean z3) {
        boolean z4;
        j jVar;
        if (databaseProvider == null && file == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        Assertions.checkState(z4);
        this.f58437n = new HashMap();
        this.rl = new SparseArray();
        this.f58438t = new SparseBooleanArray();
        this.nr = new SparseBooleanArray();
        if (databaseProvider != null) {
            jVar = new j(databaseProvider);
        } else {
            jVar = null;
        }
        n nVar = file != null ? new n(new File(file, "cached_content_index.exi"), bArr, z2) : null;
        if (jVar != null && (nVar == null || !z3)) {
            this.f58436O = jVar;
            this.J2 = nVar;
        } else {
            this.f58436O = (w6) Util.castNonNull(nVar);
            this.J2 = jVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S(DefaultContentMetadata defaultContentMetadata, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setEntrySet = defaultContentMetadata.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry<String, byte[]> entry : setEntrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public static void Uo(DatabaseProvider databaseProvider, long j2) throws DatabaseIOException {
        j.nr(databaseProvider, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DefaultContentMetadata o(DataInputStream dataInputStream) throws IOException {
        int i2 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            String utf = dataInputStream.readUTF();
            int i5 = dataInputStream.readInt();
            if (i5 >= 0) {
                int iMin = Math.min(i5, 10485760);
                byte[] bArrCopyOf = Util.EMPTY_BYTE_ARRAY;
                int i7 = 0;
                while (i7 != i5) {
                    int i8 = i7 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i8);
                    dataInputStream.readFully(bArrCopyOf, i7, iMin);
                    iMin = Math.min(i5 - i8, 10485760);
                    i7 = i8;
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException("Invalid value size: " + i5);
            }
        }
        return new DefaultContentMetadata(map);
    }

    static int ty(SparseArray sparseArray) {
        int iKeyAt;
        int size = sparseArray.size();
        int i2 = 0;
        if (size == 0) {
            iKeyAt = 0;
        } else {
            iKeyAt = sparseArray.keyAt(size - 1) + 1;
        }
        if (iKeyAt < 0) {
            while (i2 < size && i2 == sparseArray.keyAt(i2)) {
                i2++;
            }
            return i2;
        }
        return iKeyAt;
    }

    public int J2(String str) {
        return HI(str).f58446n;
    }

    public void O(String str, ContentMetadataMutations contentMetadataMutations) {
        Ml mlHI = HI(str);
        if (mlHI.rl(contentMetadataMutations)) {
            this.f58436O.rl(mlHI);
        }
    }

    public ContentMetadata gh(String str) {
        Ml mlKN = KN(str);
        if (mlKN != null) {
            return mlKN.nr();
        }
        return DefaultContentMetadata.EMPTY;
    }
}
