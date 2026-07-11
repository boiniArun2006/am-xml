package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.storage.C;
import com.google.firebase.storage.g9s;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import oW.InterfaceC2314n;
import org.json.JSONException;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class qf extends g9s {
    private final O6.n HI;
    private final InterfaceC2314n Ik;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private volatile C f60889S;
    private boolean XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private O6.w6 f60890Z;
    private final Uri az;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile String f60891g;
    private final o qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC2436n f60893r;
    private volatile long te;
    private final long ty;
    private static final Random E2 = new Random();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static O6.I28 f60888e = new O6.Wre();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    static Clock f60887X = DefaultClock.getInstance();
    private final AtomicLong ck = new AtomicLong(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f60892o = 262144;
    private volatile Uri WPU = null;
    private volatile Exception aYN = null;
    private volatile Exception ViF = null;
    private volatile int nY = 0;
    private int iF = 0;
    private final int fD = 1000;

    class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ X3O.I28 f60894n;

        j(X3O.I28 i28) {
            this.f60894n = i28;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f60894n.te(O6.Dsr.t(qf.this.Ik), O6.Dsr.rl(qf.this.f60893r), qf.this.qie.J2().qie());
        }
    }

    public class n extends g9s.n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final C f60896O;
        private final Uri nr;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final long f60897t;

        n(Exception exc, long j2, Uri uri, C c2) {
            super(exc);
            this.f60897t = j2;
            this.nr = uri;
            this.f60896O = c2;
        }

        public long n() {
            return this.f60897t;
        }
    }

    qf(o oVar, C c2, byte[] bArr) {
        Preconditions.checkNotNull(oVar);
        Preconditions.checkNotNull(bArr);
        I28 i28Ty = oVar.ty();
        this.ty = bArr.length;
        this.qie = oVar;
        this.f60889S = c2;
        InterfaceC2314n interfaceC2314nT = i28Ty.t();
        this.Ik = interfaceC2314nT;
        InterfaceC2436n interfaceC2436nRl = i28Ty.rl();
        this.f60893r = interfaceC2436nRl;
        this.az = null;
        this.HI = new O6.n(new ByteArrayInputStream(bArr), 262144);
        this.XQ = true;
        this.te = i28Ty.mUb();
        this.f60890Z = new O6.w6(i28Ty.n().qie(), interfaceC2314nT, interfaceC2436nRl, i28Ty.az());
    }

    private boolean a(int i2) {
        if (i2 != 308) {
            return i2 >= 200 && i2 < 300;
        }
        return true;
    }

    private boolean D(X3O.I28 i28) {
        try {
            Log.d("UploadTask", "Waiting " + this.iF + " milliseconds");
            f60888e.n(this.iF + E2.nextInt(250));
            boolean zNxk = Nxk(i28);
            if (zNxk) {
                this.iF = 0;
            }
            return zNxk;
        } catch (InterruptedException e2) {
            Log.w("UploadTask", "thread interrupted during exponential backoff.");
            Thread.currentThread().interrupt();
            this.ViF = e2;
            return false;
        }
    }

    private boolean GR(boolean z2) {
        X3O.Dsr dsr = new X3O.Dsr(this.qie.HI(), this.qie.J2(), this.WPU);
        if ("final".equals(this.f60891g)) {
            return false;
        }
        if (z2) {
            if (!Y(dsr)) {
                return false;
            }
        } else if (!Nxk(dsr)) {
            return false;
        }
        if ("final".equals(dsr.Ik("X-Goog-Upload-Status"))) {
            this.aYN = new IOException("The server has terminated the upload session");
            return false;
        }
        String strIk = dsr.Ik("X-Goog-Upload-Size-Received");
        long j2 = !TextUtils.isEmpty(strIk) ? Long.parseLong(strIk) : 0L;
        long j3 = this.ck.get();
        if (j3 > j2) {
            this.aYN = new IOException("Unexpected error. The server lost a chunk update.");
            return false;
        }
        if (j3 >= j2) {
            return true;
        }
        try {
            if (this.HI.n((int) r7) != j2 - j3) {
                this.aYN = new IOException("Unexpected end of stream encountered.");
                return false;
            }
            if (this.ck.compareAndSet(j3, j2)) {
                return true;
            }
            Log.e("UploadTask", "Somehow, the uploaded bytes changed during an uploaded.  This should nothappen");
            this.aYN = new IllegalStateException("uploaded bytes changed unexpectedly.");
            return false;
        } catch (IOException e2) {
            Log.e("UploadTask", "Unable to recover position in Stream during resumable upload", e2);
            this.aYN = e2;
            return false;
        }
    }

    private void J() {
        String strS = this.f60889S != null ? this.f60889S.S() : null;
        if (this.az != null && TextUtils.isEmpty(strS)) {
            strS = this.qie.ty().n().qie().getContentResolver().getType(this.az);
        }
        if (TextUtils.isEmpty(strS)) {
            strS = "application/octet-stream";
        }
        X3O.aC aCVar = new X3O.aC(this.qie.HI(), this.qie.J2(), this.f60889S != null ? this.f60889S.Ik() : null, strS);
        if (Y(aCVar)) {
            String strIk = aCVar.Ik("X-Goog-Upload-URL");
            if (TextUtils.isEmpty(strIk)) {
                return;
            }
            this.WPU = Uri.parse(strIk);
        }
    }

    private boolean Nxk(X3O.I28 i28) {
        i28.te(O6.Dsr.t(this.Ik), O6.Dsr.rl(this.f60893r), this.qie.J2().qie());
        return I(i28);
    }

    private boolean Y(X3O.I28 i28) {
        this.f60890Z.nr(i28);
        return I(i28);
    }

    private boolean k() {
        if (!"final".equals(this.f60891g)) {
            return true;
        }
        if (this.aYN == null) {
            this.aYN = new IOException("The server has terminated the upload session", this.ViF);
        }
        eF(64, false);
        return false;
    }

    private void piY() {
        try {
            this.HI.nr(this.f60892o);
            int iMin = Math.min(this.f60892o, this.HI.rl());
            X3O.CN3 cn3 = new X3O.CN3(this.qie.HI(), this.qie.J2(), this.WPU, this.HI.O(), this.ck.get(), iMin, this.HI.J2());
            if (!D(cn3)) {
                this.f60892o = 262144;
                Log.d("UploadTask", "Resetting chunk size to " + this.f60892o);
                return;
            }
            this.ck.getAndAdd(iMin);
            if (!this.HI.J2()) {
                this.HI.n(iMin);
                int i2 = this.f60892o;
                if (i2 < 33554432) {
                    this.f60892o = i2 * 2;
                    Log.d("UploadTask", "Increasing chunk size to " + this.f60892o);
                    return;
                }
                return;
            }
            try {
                this.f60889S = new C.n(cn3.ty(), this.qie).n();
                eF(4, false);
                eF(128, false);
            } catch (JSONException e2) {
                Log.e("UploadTask", "Unable to parse resulting metadata from upload:" + cn3.az(), e2);
                this.aYN = e2;
            }
        } catch (IOException e3) {
            Log.e("UploadTask", "Unable to read bytes for uploading", e3);
            this.aYN = e3;
        }
    }

    @Override // com.google.firebase.storage.g9s
    o X() {
        return this.qie;
    }

    @Override // com.google.firebase.storage.g9s
    void jB() {
        this.f60890Z.t();
        if (!eF(4, false)) {
            Log.d("UploadTask", "The upload cannot continue as it is not in a valid state.");
            return;
        }
        if (this.qie.gh() == null) {
            this.aYN = new IllegalArgumentException("Cannot upload to getRoot. You should upload to a storage location such as .getReference('image.png').putFile...");
        }
        if (this.aYN != null) {
            return;
        }
        if (this.WPU == null) {
            J();
        } else {
            GR(false);
        }
        boolean zDR0 = dR0();
        while (zDR0) {
            piY();
            zDR0 = dR0();
            if (zDR0) {
                eF(4, false);
            }
        }
        if (!this.XQ || g() == 16) {
            return;
        }
        try {
            this.HI.t();
        } catch (IOException e2) {
            Log.e("UploadTask", "Unable to close stream.", e2);
        }
    }

    @Override // com.google.firebase.storage.g9s
    protected void nHg() {
        this.f60890Z.n();
        X3O.fuX fux = this.WPU != null ? new X3O.fuX(this.qie.HI(), this.qie.J2(), this.WPU) : null;
        if (fux != null) {
            Z.rl().J2(new j(fux));
        }
        this.aYN = StorageException.t(Status.RESULT_CANCELED);
        super.nHg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.firebase.storage.g9s
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public n M7() {
        return new n(StorageException.O(this.aYN != null ? this.aYN : this.ViF, this.nY), this.ck.get(), this.WPU, this.f60889S);
    }

    private boolean I(X3O.I28 i28) {
        int iHI = i28.HI();
        if (this.f60890Z.rl(iHI)) {
            iHI = -2;
        }
        this.nY = iHI;
        this.ViF = i28.J2();
        this.f60891g = i28.Ik("X-Goog-Upload-Status");
        if (a(this.nY) && this.ViF == null) {
            return true;
        }
        return false;
    }

    private boolean dR0() {
        boolean z2;
        if (g() == 128) {
            return false;
        }
        if (Thread.interrupted()) {
            this.aYN = new InterruptedException();
            eF(64, false);
            return false;
        }
        if (g() == 32) {
            eF(256, false);
            return false;
        }
        if (g() == 8) {
            eF(16, false);
            return false;
        }
        if (!k()) {
            return false;
        }
        if (this.WPU == null) {
            if (this.aYN == null) {
                this.aYN = new IllegalStateException("Unable to obtain an upload URL.");
            }
            eF(64, false);
            return false;
        }
        if (this.aYN != null) {
            eF(64, false);
            return false;
        }
        if (this.ViF == null && this.nY >= 200 && this.nY < 300) {
            z2 = false;
        } else {
            z2 = true;
        }
        long jElapsedRealtime = f60887X.elapsedRealtime() + this.te;
        long jElapsedRealtime2 = f60887X.elapsedRealtime() + ((long) this.iF);
        if (z2) {
            if (jElapsedRealtime2 <= jElapsedRealtime && GR(true)) {
                this.iF = Math.max(this.iF * 2, 1000);
            } else {
                if (k()) {
                    eF(64, false);
                }
                return false;
            }
        }
        return true;
    }

    @Override // com.google.firebase.storage.g9s
    protected void U() {
        Z.rl().KN(fD());
    }

    qf(o oVar, C c2, InputStream inputStream) {
        Preconditions.checkNotNull(oVar);
        Preconditions.checkNotNull(inputStream);
        I28 i28Ty = oVar.ty();
        this.ty = -1L;
        this.qie = oVar;
        this.f60889S = c2;
        InterfaceC2314n interfaceC2314nT = i28Ty.t();
        this.Ik = interfaceC2314nT;
        InterfaceC2436n interfaceC2436nRl = i28Ty.rl();
        this.f60893r = interfaceC2436nRl;
        this.HI = new O6.n(inputStream, 262144);
        this.XQ = false;
        this.az = null;
        this.te = i28Ty.mUb();
        this.f60890Z = new O6.w6(oVar.J2().qie(), interfaceC2314nT, interfaceC2436nRl, i28Ty.az());
    }
}
