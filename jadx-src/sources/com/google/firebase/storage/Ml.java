package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.firebase.storage.g9s;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Ml extends g9s {
    private O6.w6 HI;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f60848Z;
    private long az;
    private final Uri qie;
    private o ty;
    private long ck = -1;
    private String Ik = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile Exception f60850r = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f60849o = 0;

    public class j extends g9s.n {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final long f60851t;

        j(Exception exc, long j2) {
            super(exc);
            this.f60851t = j2;
        }

        public long n() {
            return this.f60851t;
        }

        public long rl() {
            return Ml.this.FX();
        }
    }

    private boolean B(int i2) {
        if (i2 != 308) {
            return i2 >= 200 && i2 < 300;
        }
        return true;
    }

    private int M(InputStream inputStream, byte[] bArr) {
        int i2;
        int i3 = 0;
        boolean z2 = false;
        while (i3 != bArr.length && (i2 = inputStream.read(bArr, i3, bArr.length - i3)) != -1) {
            try {
                i3 += i2;
                z2 = true;
            } catch (IOException e2) {
                this.f60850r = e2;
            }
        }
        if (z2) {
            return i3;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.g9s
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public j M7() {
        return new j(StorageException.O(this.f60850r, this.f60848Z), this.az + this.f60849o);
    }

    long FX() {
        return this.ck;
    }

    @Override // com.google.firebase.storage.g9s
    o X() {
        return this.ty;
    }

    @Override // com.google.firebase.storage.g9s
    void jB() {
        String str;
        if (this.f60850r != null) {
            eF(64, false);
            return;
        }
        if (eF(4, false)) {
            do {
                this.az = 0L;
                this.f60850r = null;
                this.HI.t();
                X3O.w6 w6Var = new X3O.w6(this.ty.HI(), this.ty.J2(), this.f60849o);
                this.HI.O(w6Var, false);
                this.f60848Z = w6Var.HI();
                this.f60850r = w6Var.J2() != null ? w6Var.J2() : this.f60850r;
                boolean zJ = B(this.f60848Z) && this.f60850r == null && g() == 4;
                if (zJ) {
                    this.ck = ((long) w6Var.r()) + this.f60849o;
                    String strIk = w6Var.Ik("ETag");
                    if (!TextUtils.isEmpty(strIk) && (str = this.Ik) != null && !str.equals(strIk)) {
                        Log.w("FileDownloadTask", "The file at the server has changed.  Restarting from the beginning.");
                        this.f60849o = 0L;
                        this.Ik = null;
                        w6Var.iF();
                        U();
                        return;
                    }
                    this.Ik = strIk;
                    try {
                        zJ = J(w6Var);
                    } catch (IOException e2) {
                        Log.e("FileDownloadTask", "Exception occurred during file write.  Aborting.", e2);
                        this.f60850r = e2;
                    }
                }
                w6Var.iF();
                if (zJ && this.f60850r == null && g() == 4) {
                    eF(128, false);
                    return;
                }
                File file = new File(this.qie.getPath());
                if (file.exists()) {
                    this.f60849o = file.length();
                } else {
                    this.f60849o = 0L;
                }
                if (g() == 8) {
                    eF(16, false);
                    return;
                }
                if (g() == 32) {
                    if (eF(256, false)) {
                        return;
                    }
                    Log.w("FileDownloadTask", "Unable to change download task to final state from " + g());
                    return;
                }
            } while (this.az > 0);
            eF(64, false);
        }
    }

    @Override // com.google.firebase.storage.g9s
    protected void nHg() {
        this.HI.n();
        this.f60850r = StorageException.t(Status.RESULT_CANCELED);
    }

    Ml(o oVar, Uri uri) {
        this.ty = oVar;
        this.qie = uri;
        I28 i28Ty = oVar.ty();
        this.HI = new O6.w6(i28Ty.n().qie(), i28Ty.t(), i28Ty.rl(), i28Ty.gh());
    }

    private boolean J(X3O.I28 i28) throws IOException {
        FileOutputStream fileOutputStream;
        InputStream inputStreamZ = i28.Z();
        if (inputStreamZ != null) {
            File file = new File(this.qie.getPath());
            if (!file.exists()) {
                if (this.f60849o <= 0) {
                    if (!file.createNewFile()) {
                        Log.w("FileDownloadTask", "unable to create file:" + file.getAbsolutePath());
                    }
                } else {
                    throw new IOException("The file to download to has been deleted.");
                }
            }
            boolean z2 = true;
            if (this.f60849o > 0) {
                Log.d("FileDownloadTask", "Resuming download file " + file.getAbsolutePath() + " at " + this.f60849o);
                fileOutputStream = new FileOutputStream(file, true);
            } else {
                fileOutputStream = new FileOutputStream(file);
            }
            try {
                byte[] bArr = new byte[262144];
                while (z2) {
                    int iM = M(inputStreamZ, bArr);
                    if (iM == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, iM);
                    this.az += (long) iM;
                    if (this.f60850r != null) {
                        Log.d("FileDownloadTask", "Exception occurred during file download. Retrying.", this.f60850r);
                        this.f60850r = null;
                        z2 = false;
                    }
                    if (!eF(4, false)) {
                        z2 = false;
                    }
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                inputStreamZ.close();
                return z2;
            } catch (Throwable th) {
                fileOutputStream.flush();
                fileOutputStream.close();
                inputStreamZ.close();
                throw th;
            }
        }
        this.f60850r = new IllegalStateException("Unable to open Firebase Storage stream.");
        return false;
    }

    @Override // com.google.firebase.storage.g9s
    protected void U() {
        Z.rl().Uo(fD());
    }
}
