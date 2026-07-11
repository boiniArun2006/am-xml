package com.facebook.imagepipeline.request;

import Hh.C;
import Hh.Dsr;
import Hh.I28;
import android.net.Uri;
import android.os.Build;
import dX.C1954n;
import dX.CN3;
import dX.Ml;
import dX.Wre;
import dX.fuX;
import java.io.File;
import ln.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class j {
    private static boolean ViF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final I28 f52634g = new C0754j();
    private static boolean nY;
    protected int HI;
    private final boolean Ik;
    private final boolean J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private File f52635O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Pl f52636S;
    private final boolean Uo;
    private final String WPU;
    private final Boolean XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final jl.I28 f52637Z;
    private final int aYN;
    private final Wre az;
    private final boolean ck;
    private final fuX gh;
    private final CN3 mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f52638n;
    private final int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Ic.n f52639o;
    private final C1954n qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Boolean f52640r;
    private final n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Uri f52641t;
    private final w6 ty;
    private final Ml xMQ;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.request.j$j, reason: collision with other inner class name */
    class C0754j implements I28 {
        @Override // Hh.I28
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Uri apply(j jVar) {
            if (jVar != null) {
                return jVar.WPU();
            }
            return null;
        }

        C0754j() {
        }
    }

    public enum n {
        SMALL,
        DEFAULT,
        DYNAMIC
    }

    public enum w6 {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f52649n;

        public int rl() {
            return this.f52649n;
        }

        w6(int i2) {
            this.f52649n = i2;
        }

        public static w6 n(w6 w6Var, w6 w6Var2) {
            if (w6Var.rl() > w6Var2.rl()) {
                return w6Var;
            }
            return w6Var2;
        }
    }

    private static int ViF(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (vn.I28.HI(uri)) {
            return 0;
        }
        if (uri.getPath() != null && vn.I28.az(uri)) {
            return eVO.j.t(eVO.j.rl(uri.getPath())) ? 2 : 3;
        }
        if (vn.I28.qie(uri)) {
            return 4;
        }
        if (vn.I28.xMQ(uri)) {
            return 5;
        }
        if (vn.I28.ty(uri)) {
            return 6;
        }
        if (vn.I28.KN(uri)) {
            return 7;
        }
        return vn.I28.ck(uri) ? 8 : -1;
    }

    public synchronized File S() {
        try {
            if (this.f52635O == null) {
                C.Uo(this.f52641t.getPath());
                this.f52635O = new File(this.f52641t.getPath());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f52635O;
    }

    public static j n(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.aYN(uri).n();
    }

    public static j rl(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return n(Uri.parse(str));
    }

    public int HI() {
        CN3 cn3 = this.mUb;
        if (cn3 != null) {
            return cn3.f63505n;
        }
        return 2048;
    }

    public boolean Ik() {
        return this.J2;
    }

    public int J2() {
        return this.aYN;
    }

    public Pl KN() {
        return this.f52636S;
    }

    public int O() {
        return this.HI;
    }

    public String Uo() {
        return this.WPU;
    }

    public Uri WPU() {
        return this.f52641t;
    }

    public fuX XQ() {
        return this.gh;
    }

    public Boolean Z() {
        return this.XQ;
    }

    public int aYN() {
        return this.nr;
    }

    public Ic.n az() {
        return this.f52639o;
    }

    public Wre ck() {
        return this.az;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (ViF) {
            int i2 = this.f52638n;
            int i3 = jVar.f52638n;
            if (i2 != 0 && i3 != 0 && i2 != i3) {
                return false;
            }
        }
        if (this.Uo == jVar.Uo && this.ck == jVar.ck && this.Ik == jVar.Ik && Dsr.n(this.f52641t, jVar.f52641t) && Dsr.n(this.rl, jVar.rl) && Dsr.n(this.WPU, jVar.WPU) && Dsr.n(this.f52635O, jVar.f52635O) && Dsr.n(this.qie, jVar.qie) && Dsr.n(this.xMQ, jVar.xMQ) && Dsr.n(this.mUb, jVar.mUb) && Dsr.n(this.az, jVar.az) && Dsr.n(this.ty, jVar.ty) && Dsr.n(Integer.valueOf(this.HI), Integer.valueOf(jVar.HI)) && Dsr.n(this.f52640r, jVar.f52640r) && Dsr.n(this.XQ, jVar.XQ) && Dsr.n(this.f52636S, jVar.f52636S) && Dsr.n(this.gh, jVar.gh) && this.KN == jVar.KN) {
            Ic.n nVar = this.f52639o;
            lN.Ml mlN = nVar != null ? nVar.n() : null;
            Ic.n nVar2 = jVar.f52639o;
            if (Dsr.n(mlN, nVar2 != null ? nVar2.n() : null) && this.aYN == jVar.aYN) {
                return true;
            }
        }
        return false;
    }

    public Boolean g() {
        return this.f52640r;
    }

    public boolean gh() {
        return this.Uo;
    }

    public int hashCode() {
        boolean z2 = nY;
        int i2 = z2 ? this.f52638n : 0;
        if (i2 != 0) {
            return i2;
        }
        Ic.n nVar = this.f52639o;
        int iN = tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(tc4.j.n(0, this.rl), this.f52641t), Boolean.valueOf(this.Uo)), this.qie), this.az), this.ty), Integer.valueOf(this.HI)), Boolean.valueOf(this.ck)), Boolean.valueOf(this.Ik)), this.xMQ), this.f52640r), this.mUb), this.gh), nVar != null ? nVar.n() : null), this.XQ), this.f52636S), Integer.valueOf(this.aYN)), Boolean.valueOf(this.KN));
        if (z2) {
            this.f52638n = iN;
        }
        return iN;
    }

    public boolean mUb() {
        return Build.VERSION.SDK_INT >= 29 && this.KN;
    }

    public n nr() {
        return this.rl;
    }

    public CN3 o() {
        return this.mUb;
    }

    public w6 qie() {
        return this.ty;
    }

    public jl.I28 r() {
        return this.f52637Z;
    }

    public C1954n t() {
        return this.qie;
    }

    public int ty() {
        CN3 cn3 = this.mUb;
        if (cn3 != null) {
            return cn3.rl;
        }
        return 2048;
    }

    public Ml xMQ() {
        return this.xMQ;
    }

    protected j(ImageRequestBuilder imageRequestBuilder) {
        fuX fuxIk;
        this.rl = imageRequestBuilder.nr();
        Uri uriR = imageRequestBuilder.r();
        this.f52641t = uriR;
        this.nr = ViF(uriR);
        this.J2 = imageRequestBuilder.WPU();
        this.Uo = imageRequestBuilder.XQ();
        this.KN = imageRequestBuilder.mUb();
        this.xMQ = imageRequestBuilder.xMQ();
        this.mUb = imageRequestBuilder.HI();
        if (imageRequestBuilder.Ik() == null) {
            fuxIk = fuX.t();
        } else {
            fuxIk = imageRequestBuilder.Ik();
        }
        this.gh = fuxIk;
        this.qie = imageRequestBuilder.t();
        this.az = imageRequestBuilder.ty();
        this.ty = imageRequestBuilder.gh();
        boolean Z2 = imageRequestBuilder.Z();
        this.ck = Z2;
        int iO = imageRequestBuilder.O();
        this.HI = Z2 ? iO : iO | 48;
        this.Ik = imageRequestBuilder.S();
        this.f52640r = imageRequestBuilder.U();
        this.f52639o = imageRequestBuilder.qie();
        this.f52637Z = imageRequestBuilder.az();
        this.XQ = imageRequestBuilder.ck();
        this.f52636S = imageRequestBuilder.KN();
        this.aYN = imageRequestBuilder.J2();
        this.WPU = imageRequestBuilder.Uo();
    }

    public boolean nY(int i2) {
        if ((i2 & O()) == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return Dsr.rl(this).rl("uri", this.f52641t).rl("cacheChoice", this.rl).rl("decodeOptions", this.xMQ).rl("postprocessor", this.f52639o).rl("priority", this.az).rl("resizeOptions", this.mUb).rl("rotationOptions", this.gh).rl("bytesRange", this.qie).rl("resizingAllowedOverride", this.XQ).rl("downsampleOverride", this.f52636S).t("progressiveRenderingEnabled", this.J2).t("localThumbnailPreviewsEnabled", this.Uo).t("loadThumbnailOnly", this.KN).rl("lowestPermittedRequestLevel", this.ty).n("cachesDisabled", this.HI).t("isDiskCacheEnabled", this.ck).t("isMemoryCacheEnabled", this.Ik).rl("decodePrefetches", this.f52640r).n("delayMs", this.aYN).toString();
    }
}
