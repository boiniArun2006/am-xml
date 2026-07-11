package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.collection.ArraySet;
import gAe.I28;
import gAe.Pl;
import gAe.o;
import gAe.qz;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import mV.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class EncryptedSharedPreferences implements SharedPreferences {
    final I28 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final gAe.j f41931O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final SharedPreferences f41932n;
    final String nr;
    final CopyOnWriteArrayList rl = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final String f41933t;

    private static final class Editor implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final EncryptedSharedPreferences f41935n;
        private final SharedPreferences.Editor rl;
        private final AtomicBoolean nr = new AtomicBoolean(false);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final List f41936t = new CopyOnWriteArrayList();

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.putInt(EncryptedType.BOOLEAN.t());
            byteBufferAllocate.put(z2 ? (byte) 1 : (byte) 0);
            t(str, byteBufferAllocate.array());
            return this;
        }

        private void n() {
            if (this.nr.getAndSet(false)) {
                for (String str : this.f41935n.getAll().keySet()) {
                    if (!this.f41936t.contains(str) && !this.f41935n.Uo(str)) {
                        this.rl.remove(this.f41935n.nr(str));
                    }
                }
            }
        }

        private void rl() {
            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f41935n.rl) {
                Iterator it = this.f41936t.iterator();
                while (it.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f41935n, (String) it.next());
                }
            }
        }

        private void t(String str, byte[] bArr) {
            if (this.f41935n.Uo(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f41936t.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair pairO = this.f41935n.O(str, bArr);
                this.rl.putString((String) pairO.first, (String) pairO.second);
            } catch (GeneralSecurityException e2) {
                throw new SecurityException("Could not encrypt data: " + e2.getMessage(), e2);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.nr.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f3) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(EncryptedType.FLOAT.t());
            byteBufferAllocate.putFloat(f3);
            t(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(EncryptedType.INT.t());
            byteBufferAllocate.putInt(i2);
            t(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
            byteBufferAllocate.putInt(EncryptedType.LONG.t());
            byteBufferAllocate.putLong(j2);
            t(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 8);
            byteBufferAllocate.putInt(EncryptedType.STRING.t());
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bytes);
            t(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            if (set == null) {
                set = new ArraySet();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size + 4);
            byteBufferAllocate.putInt(EncryptedType.STRING_SET.t());
            for (byte[] bArr : arrayList) {
                byteBufferAllocate.putInt(bArr.length);
                byteBufferAllocate.put(bArr);
            }
            t(str, byteBufferAllocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f41935n.Uo(str)) {
                this.rl.remove(this.f41935n.nr(str));
                this.f41936t.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }

        Editor(EncryptedSharedPreferences encryptedSharedPreferences, SharedPreferences.Editor editor) {
            this.f41935n = encryptedSharedPreferences;
            this.rl = editor;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            n();
            this.rl.apply();
            rl();
            this.f41936t.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            n();
            try {
                return this.rl.commit();
            } finally {
                rl();
                this.f41936t.clear();
            }
        }
    }

    private enum EncryptedType {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f41943n;

        public static EncryptedType rl(int i2) {
            if (i2 == 0) {
                return STRING;
            }
            if (i2 == 1) {
                return STRING_SET;
            }
            if (i2 == 2) {
                return INT;
            }
            if (i2 == 3) {
                return LONG;
            }
            if (i2 == 4) {
                return FLOAT;
            }
            if (i2 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int t() {
            return this.f41943n;
        }

        EncryptedType(int i2) {
            this.f41943n = i2;
        }
    }

    public enum PrefKeyEncryptionScheme {
        AES256_SIV("AES256_SIV");


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f41946n;

        o rl() {
            return qz.n(this.f41946n);
        }

        PrefKeyEncryptionScheme(String str) {
            this.f41946n = str;
        }
    }

    public enum PrefValueEncryptionScheme {
        AES256_GCM("AES256_GCM");


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f41949n;

        o rl() {
            return qz.n(this.f41949n);
        }

        PrefValueEncryptionScheme(String str) {
            this.f41949n = str;
        }
    }

    /* JADX INFO: renamed from: androidx.security.crypto.EncryptedSharedPreferences$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f41934n;

        static {
            int[] iArr = new int[EncryptedType.values().length];
            f41934n = iArr;
            try {
                iArr[EncryptedType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41934n[EncryptedType.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41934n[EncryptedType.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41934n[EncryptedType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41934n[EncryptedType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41934n[EncryptedType.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    boolean Uo(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new Editor(this, this.f41932n.edit());
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap map = new HashMap();
        for (Map.Entry<String, ?> entry : this.f41932n.getAll().entrySet()) {
            if (!Uo(entry.getKey())) {
                String strT = t(entry.getKey());
                map.put(strT, J2(strT));
            }
        }
        return map;
    }

    String nr(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return B8M.I28.nr(this.J2.n(str.getBytes(StandardCharsets.UTF_8), this.f41933t.getBytes()));
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt key. " + e2.getMessage(), e2);
        }
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.rl.add(onSharedPreferenceChangeListener);
    }

    String t(String str) {
        try {
            String str2 = new String(this.J2.rl(B8M.I28.n(str, 0), this.f41933t.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not decrypt key. " + e2.getMessage(), e2);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.rl.remove(onSharedPreferenceChangeListener);
    }

    EncryptedSharedPreferences(String str, String str2, SharedPreferences sharedPreferences, gAe.j jVar, I28 i28) {
        this.f41933t = str;
        this.f41932n = sharedPreferences;
        this.nr = str2;
        this.f41931O = jVar;
        this.J2 = i28;
    }

    private Object J2(String str) {
        if (!Uo(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String strNr = nr(str);
                String string = this.f41932n.getString(strNr, null);
                if (string == null) {
                    return null;
                }
                boolean z2 = false;
                byte[] bArrN = B8M.I28.n(string, 0);
                gAe.j jVar = this.f41931O;
                Charset charset = StandardCharsets.UTF_8;
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(jVar.rl(bArrN, strNr.getBytes(charset)));
                byteBufferWrap.position(0);
                int i2 = byteBufferWrap.getInt();
                EncryptedType encryptedTypeRl = EncryptedType.rl(i2);
                if (encryptedTypeRl != null) {
                    switch (AnonymousClass1.f41934n[encryptedTypeRl.ordinal()]) {
                        case 1:
                            int i3 = byteBufferWrap.getInt();
                            ByteBuffer byteBufferSlice = byteBufferWrap.slice();
                            byteBufferWrap.limit(i3);
                            String string2 = charset.decode(byteBufferSlice).toString();
                            if (string2.equals("__NULL__")) {
                                return null;
                            }
                            return string2;
                        case 2:
                            return Integer.valueOf(byteBufferWrap.getInt());
                        case 3:
                            return Long.valueOf(byteBufferWrap.getLong());
                        case 4:
                            return Float.valueOf(byteBufferWrap.getFloat());
                        case 5:
                            if (byteBufferWrap.get() != 0) {
                                z2 = true;
                            }
                            return Boolean.valueOf(z2);
                        case 6:
                            ArraySet arraySet = new ArraySet();
                            while (byteBufferWrap.hasRemaining()) {
                                int i5 = byteBufferWrap.getInt();
                                ByteBuffer byteBufferSlice2 = byteBufferWrap.slice();
                                byteBufferSlice2.limit(i5);
                                byteBufferWrap.position(byteBufferWrap.position() + i5);
                                arraySet.add(StandardCharsets.UTF_8.decode(byteBufferSlice2).toString());
                            }
                            if (arraySet.size() == 1 && "__NULL__".equals(arraySet.az(0))) {
                                return null;
                            }
                            return arraySet;
                        default:
                            throw new SecurityException("Unhandled type for encrypted pref value: " + encryptedTypeRl);
                    }
                }
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i2);
            } catch (GeneralSecurityException e2) {
                throw new SecurityException("Could not decrypt value. " + e2.getMessage(), e2);
            }
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    public static SharedPreferences n(Context context, String str, MasterKey masterKey, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) {
        return rl(str, masterKey.n(), context, prefKeyEncryptionScheme, prefValueEncryptionScheme);
    }

    public static SharedPreferences rl(String str, String str2, Context context, PrefKeyEncryptionScheme prefKeyEncryptionScheme, PrefValueEncryptionScheme prefValueEncryptionScheme) {
        to2.n.n();
        jc.j.rl();
        Context applicationContext = context.getApplicationContext();
        Pl plNr = new j.n().qie(prefKeyEncryptionScheme.rl()).ty(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).az("android-keystore://" + str2).J2().nr();
        Pl plNr2 = new j.n().qie(prefValueEncryptionScheme.rl()).ty(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).az("android-keystore://" + str2).J2().nr();
        return new EncryptedSharedPreferences(str, str2, applicationContext.getSharedPreferences(str, 0), (gAe.j) plNr2.gh(gAe.j.class), (I28) plNr.gh(I28.class));
    }

    Pair O(String str, byte[] bArr) {
        String strNr = nr(str);
        return new Pair(strNr, B8M.I28.nr(this.f41931O.n(bArr, strNr.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!Uo(str)) {
            return this.f41932n.contains(nr(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z2) {
        Object objJ2 = J2(str);
        if (objJ2 instanceof Boolean) {
            return ((Boolean) objJ2).booleanValue();
        }
        return z2;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f3) {
        Object objJ2 = J2(str);
        if (objJ2 instanceof Float) {
            return ((Float) objJ2).floatValue();
        }
        return f3;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i2) {
        Object objJ2 = J2(str);
        if (objJ2 instanceof Integer) {
            return ((Integer) objJ2).intValue();
        }
        return i2;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j2) {
        Object objJ2 = J2(str);
        if (objJ2 instanceof Long) {
            return ((Long) objJ2).longValue();
        }
        return j2;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object objJ2 = J2(str);
        if (objJ2 instanceof String) {
            return (String) objJ2;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Set arraySet;
        Object objJ2 = J2(str);
        if (objJ2 instanceof Set) {
            arraySet = (Set) objJ2;
        } else {
            arraySet = new ArraySet();
        }
        if (arraySet.size() > 0) {
            return arraySet;
        }
        return set;
    }
}
