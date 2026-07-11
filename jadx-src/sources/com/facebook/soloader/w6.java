package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.C;
import com.facebook.soloader.afx;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class w6 extends C {
    private final int KN;

    protected class j extends C.n {

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        private final int f53050Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final File f53051o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f53052r;

        j(C c2, boolean z2) {
            super(c2);
            this.f53052r = z2;
            this.f53051o = new File(w6.this.nr.getApplicationInfo().nativeLibraryDir);
            this.f53050Z = w6.this.KN;
        }

        @Override // com.facebook.soloader.C.n
        protected C.j[] T() {
            C.j[] jVarArr = this.f53011n;
            if (jVarArr != null) {
                return jVarArr;
            }
            C.j[] jVarArrZ = Z();
            this.f53011n = jVarArrZ;
            if (this.f53052r) {
                qz.Uo("BackupSoSource", "Unconditonally extracting all DSOs from zip");
                return this.f53011n;
            }
            if ((this.f53050Z & 1) == 0) {
                qz.Uo("BackupSoSource", "Self-extraction preferred (PREFER_ANDROID_LIBS_DRIECTORY not set)");
                return this.f53011n;
            }
            for (C.j jVar : jVarArrZ) {
                if (jB(jVar.f53009O, jVar.f53035n)) {
                    return this.f53011n;
                }
            }
            C.j[] jVarArr2 = new C.j[0];
            this.f53011n = jVarArr2;
            return jVarArr2;
        }

        boolean jB(ZipEntry zipEntry, String str) {
            String name = zipEntry.getName();
            File file = new File(this.f53051o, str);
            try {
                if (!file.getCanonicalPath().startsWith(this.f53051o.getCanonicalPath())) {
                    qz.n("BackupSoSource", "Not allowing consideration of " + name + ": " + str + " not in lib dir.");
                    return false;
                }
                if (!file.isFile()) {
                    qz.Uo("BackupSoSource", "Allowing consideration of " + name + ": " + str + " not in system lib dir");
                    return true;
                }
                long length = file.length();
                long size = zipEntry.getSize();
                if (length == size) {
                    qz.Uo("BackupSoSource", "Not allowing consideration of " + name + ": deferring to libdir");
                    return false;
                }
                qz.Uo("BackupSoSource", "Allowing consideration of " + file + ": sysdir file length is " + length + ", but the file is " + size + " bytes long in the APK");
                return true;
            } catch (IOException e2) {
                qz.Uo("BackupSoSource", "Not allowing consideration of " + name + ": " + str + ", IOException when constructing path: " + e2.toString());
                return false;
            }
        }
    }

    public w6(Context context, File file, String str, int i2) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.KN = i2;
    }

    @Override // com.facebook.soloader.afx
    protected afx.I28 HI(boolean z2) {
        return new j(this, z2);
    }

    public boolean S() throws IOException {
        j jVar = new j(this, false);
        try {
            boolean z2 = jVar.Z().length != 0;
            jVar.close();
            return z2;
        } catch (Throwable th) {
            try {
                jVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.facebook.soloader.afx
    protected byte[] az() throws IOException {
        File canonicalFile = this.J2.getCanonicalFile();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile.getPath());
            parcelObtain.writeLong(canonicalFile.lastModified());
            parcelObtain.writeInt(SysUtil.Uo(this.nr));
            if ((this.KN & 1) == 0) {
                parcelObtain.writeByte((byte) 0);
                return parcelObtain.marshall();
            }
            String str = this.nr.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                parcelObtain.writeByte((byte) 1);
                return parcelObtain.marshall();
            }
            parcelObtain.writeByte((byte) 2);
            parcelObtain.writeString(canonicalFile2.getPath());
            parcelObtain.writeLong(canonicalFile2.lastModified());
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.facebook.soloader.I28, com.facebook.soloader.ci
    public String t() {
        return "BackupSoSource";
    }
}
