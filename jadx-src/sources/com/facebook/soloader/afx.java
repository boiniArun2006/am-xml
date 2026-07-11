package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class afx extends com.facebook.soloader.I28 implements com.facebook.soloader.n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String[] f53028O;
    protected final Context nr;

    protected static abstract class I28 implements Closeable {
        public abstract void Uo(File file);

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public abstract w6[] rl();

        public void n(Ml ml, byte[] bArr, File file) {
            qz.nr("fb-UnpackingSoSource", "extracting DSO " + ml.rl().f53035n);
            File file2 = new File(file, ml.rl().f53035n);
            try {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                    try {
                        int iAvailable = ml.available();
                        if (iAvailable > 1) {
                            SysUtil.nr(randomAccessFile.getFD(), iAvailable);
                        }
                        SysUtil.n(randomAccessFile, ml.f53030t, Integer.MAX_VALUE, bArr);
                        randomAccessFile.setLength(randomAccessFile.getFilePointer());
                        if (file2.setExecutable(true, false)) {
                            randomAccessFile.close();
                        } else {
                            throw new IOException("cannot make file executable: " + file2);
                        }
                    } finally {
                    }
                } catch (IOException e2) {
                    qz.rl("fb-UnpackingSoSource", "error extracting dso  " + file2 + " due to: " + e2);
                    SysUtil.t(file2);
                    throw e2;
                }
            } finally {
                if (file2.exists() && !file2.setWritable(false)) {
                    qz.rl("SoLoader", "Error removing " + file2 + " write permission from directory " + file + " (writable: " + file.canWrite() + ")");
                }
            }
        }

        protected I28() {
        }
    }

    protected static final class Ml implements Closeable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6 f53029n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final InputStream f53030t;

        public int available() {
            return this.f53030t.available();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f53030t.close();
        }

        public w6 rl() {
            return this.f53029n;
        }

        public Ml(w6 w6Var, InputStream inputStream) {
            this.f53029n = w6Var;
            this.f53030t = inputStream;
        }
    }

    class j implements FilenameFilter {
        j() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str.equals("dso_state") || str.equals("dso_lock") || str.equals("dso_deps")) ? false : true;
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ o f53032O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f53033n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ File f53034t;

        n(boolean z2, File file, o oVar) {
            this.f53033n = z2;
            this.f53034t = file;
            this.f53032O = oVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            qz.J2("fb-UnpackingSoSource", "starting syncer worker");
            try {
                try {
                    if (this.f53033n) {
                        SysUtil.J2(afx.this.f53018n);
                    }
                    afx.Z(this.f53034t, (byte) 1, this.f53033n);
                    qz.J2("fb-UnpackingSoSource", "releasing dso store lock for " + afx.this.f53018n + " (from syncer thread)");
                    this.f53032O.close();
                } catch (Throwable th) {
                    qz.J2("fb-UnpackingSoSource", "releasing dso store lock for " + afx.this.f53018n + " (from syncer thread)");
                    this.f53032O.close();
                    throw th;
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private static boolean qie(int i2) {
        return (i2 & 2) != 0;
    }

    private static boolean r(int i2) {
        return (i2 & 1) != 0;
    }

    protected abstract I28 HI(boolean z2);

    public void ck() throws IOException {
        O(2);
    }

    public static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f53035n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final String f53036t;

        public w6(String str, String str2) {
            this.f53035n = str;
            this.f53036t = str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean Ik(o oVar, int i2) throws IOException {
        byte b2;
        RandomAccessFile randomAccessFile;
        File file = new File(this.f53018n, "dso_state");
        byte[] bArrAz = az();
        boolean zQie = qie(i2);
        if (zQie || mUb(bArrAz)) {
            b2 = 0;
        } else {
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                if (randomAccessFile.length() == 1) {
                    try {
                        b2 = randomAccessFile.readByte();
                    } catch (IOException e2) {
                        qz.J2("fb-UnpackingSoSource", "dso store " + this.f53018n + " regeneration interrupted: " + e2.getMessage());
                    }
                    if (b2 == 1) {
                        qz.J2("fb-UnpackingSoSource", "dso store " + this.f53018n + " regeneration not needed: state file clean");
                    } else {
                        b2 = 0;
                    }
                    randomAccessFile.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b2 == 1) {
            return false;
        }
        boolean z2 = (i2 & 4) == 0;
        qz.J2("fb-UnpackingSoSource", "so store dirty: regenerating");
        Z(file, (byte) 0, z2);
        xMQ();
        I28 i28HI = HI(zQie);
        try {
            i28HI.Uo(this.f53018n);
            i28HI.close();
            randomAccessFile = new RandomAccessFile(new File(this.f53018n, "dso_deps"), "rw");
            try {
                randomAccessFile.write(bArrAz);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.close();
                n nVar = new n(z2, file, oVar);
                if (r(i2)) {
                    new Thread(nVar, "SoSync:" + this.f53018n.getName()).start();
                } else {
                    nVar.run();
                }
                return true;
            } finally {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } catch (Throwable th3) {
            if (i28HI != null) {
                try {
                    i28HI.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Z(File file, byte b2, boolean z2) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b2);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z2) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException e2) {
            qz.KN("fb-UnpackingSoSource", "state file sync failed", e2);
        }
    }

    public static File ty(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    private void xMQ() throws IOException {
        File[] fileArrListFiles = this.f53018n.listFiles(new j());
        if (fileArrListFiles == null) {
            throw new IOException("unable to list directory " + this.f53018n);
        }
        for (File file : fileArrListFiles) {
            qz.J2("fb-UnpackingSoSource", "Deleting " + file);
            SysUtil.t(file);
        }
    }

    @Override // com.facebook.soloader.ci
    protected void O(int i2) throws IOException {
        SysUtil.ty(this.f53018n);
        if (!this.f53018n.canWrite() && !this.f53018n.setWritable(true)) {
            throw new IOException("error adding " + this.f53018n.getCanonicalPath() + " write permission");
        }
        o oVar = null;
        try {
            try {
                o oVarXMQ = SysUtil.xMQ(this.f53018n, new File(this.f53018n, "dso_lock"));
                try {
                    qz.J2("fb-UnpackingSoSource", "locked dso store " + this.f53018n);
                    if (!this.f53018n.canWrite() && !this.f53018n.setWritable(true)) {
                        throw new IOException("error adding " + this.f53018n.getCanonicalPath() + " write permission");
                    }
                    if (!Ik(oVarXMQ, i2)) {
                        qz.nr("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f53018n);
                        oVar = oVarXMQ;
                    }
                    if (oVar != null) {
                        qz.J2("fb-UnpackingSoSource", "releasing dso store lock for " + this.f53018n);
                        oVar.close();
                    } else {
                        qz.J2("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f53018n + " (syncer thread started)");
                    }
                    if (!this.f53018n.canWrite() || this.f53018n.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + this.f53018n.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    oVar = oVarXMQ;
                    if (oVar != null) {
                        qz.J2("fb-UnpackingSoSource", "releasing dso store lock for " + this.f53018n);
                        oVar.close();
                    } else {
                        qz.J2("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f53018n + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (!this.f53018n.canWrite() || this.f53018n.setWritable(false)) {
                    throw th2;
                }
                throw new IOException("error removing " + this.f53018n.getCanonicalPath() + " write permission");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    protected boolean mUb(byte[] bArr) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f53018n, "dso_deps"), "rw");
            try {
                if (randomAccessFile.length() != 0) {
                    int length = (int) randomAccessFile.length();
                    byte[] bArr2 = new byte[length];
                    if (randomAccessFile.read(bArr2) == length) {
                        boolean zGh = gh(bArr2, bArr);
                        randomAccessFile.close();
                        return zGh;
                    }
                    qz.J2("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                }
                randomAccessFile.close();
                return true;
            } finally {
            }
        } catch (IOException e2) {
            qz.KN("fb-UnpackingSoSource", "failed to compare whether deps changed", e2);
            return true;
        }
    }

    @Override // com.facebook.soloader.n
    public void n() throws Throwable {
        try {
            o oVarXMQ = SysUtil.xMQ(this.f53018n, new File(this.f53018n, "dso_lock"));
            if (oVarXMQ != null) {
                oVarXMQ.close();
            }
        } catch (Exception e2) {
            qz.t("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to acquire file lock for " + getClass().getName() + " (" + this.f53018n + "): ", e2);
        }
    }

    public void o(String[] strArr) {
        this.f53028O = strArr;
    }

    protected afx(Context context, String str) {
        super(ty(context, str), 1);
        this.nr = context;
    }

    protected byte[] az() {
        Parcel parcelObtain = Parcel.obtain();
        I28 i28HI = HI(false);
        try {
            w6[] w6VarArrRl = i28HI.rl();
            parcelObtain.writeInt(w6VarArrRl.length);
            for (w6 w6Var : w6VarArrRl) {
                parcelObtain.writeString(w6Var.f53035n);
                parcelObtain.writeString(w6Var.f53036t);
            }
            i28HI.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            if (i28HI != null) {
                try {
                    i28HI.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    protected boolean gh(byte[] bArr, byte[] bArr2) {
        return !Arrays.equals(bArr, bArr2);
    }
}
