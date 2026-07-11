package ln;

import aB.AbstractC1501Ml;
import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ln.l3D;
import uK.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class s4 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n f70542v = new n(null);
    private final boolean E2;
    private final Hh.qz HI;
    private final boolean Ik;
    private final boolean J2;
    private final int KN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final int f70543N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f70544O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final boolean f70545S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final boolean f70546T;
    private final int Uo;
    private final boolean ViF;
    private final boolean WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final boolean f70547X;
    private final boolean XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final long f70548Z;
    private final boolean aYN;
    private final boolean az;
    private final boolean ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f70549e;
    private final boolean fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f70550g;
    private final int gh;
    private final boolean iF;
    private final boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f70551n;
    private final boolean nHg;
    private final boolean nY;
    private final boolean nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f70552o;
    private final boolean qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Hh.qz f70553r;
    private final boolean rl;
    private final dF.Wre s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final uK.n f70554t;
    private final boolean te;
    private final Ml ty;
    private final boolean wTp;
    private final int xMQ;

    public interface Ml {
        ci n(Context context, A72.j jVar, bAP.n nVar, bAP.Ml ml, Pl pl, boolean z2, boolean z3, eO eOVar, A72.fuX fux, A72.C c2, FSZ.Q q2, FSZ.Q q3, Hh.qz qzVar, FSZ.aC aCVar, AbstractC1501Ml abstractC1501Ml, int i2, int i3, boolean z4, int i5, C2267j c2267j, boolean z5, int i7);
    }

    public static final class j {
        public boolean E2;
        public boolean HI;
        public Hh.qz Ik;
        public boolean J2;
        public boolean KN;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f70555N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public uK.n f70556O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public long f70557S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public boolean f70558T;
        public boolean Uo;
        public boolean ViF;
        public boolean WPU;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public boolean f70559X;
        public boolean XQ;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public Hh.qz f70560Z;
        public boolean aYN;
        public int az;
        public Ml ck;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f70561e;
        public boolean fD;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f70562g;
        public int gh;
        public int iF;
        public int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final l3D.j f70563n;
        public boolean nHg;
        public boolean nY;
        public boolean nr;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f70564o;
        public boolean qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f70565r;
        public boolean rl;
        public boolean s7N;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f70566t;
        public boolean te;
        public boolean ty;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f70567v;
        public dF.Wre wTp;
        public int xMQ;

        public j(l3D.j configBuilder) {
            Intrinsics.checkNotNullParameter(configBuilder, "configBuilder");
            this.f70563n = configBuilder;
            this.xMQ = 1000;
            this.az = 2048;
            Hh.qz qzVarN = Hh.Pl.n(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(qzVarN, "of(...)");
            this.f70560Z = qzVarN;
            this.ViF = true;
            this.nY = true;
            this.iF = 20;
            this.f70555N = 30;
            this.wTp = new dF.Wre(false, false, 3, null);
        }

        public final s4 n() {
            return new s4(this, null);
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    public static final class w6 implements Ml {
        @Override // ln.s4.Ml
        public ci n(Context context, A72.j byteArrayPool, bAP.n imageDecoder, bAP.Ml progressiveJpegConfig, Pl downsampleMode, boolean z2, boolean z3, eO executorSupplier, A72.fuX pooledByteBufferFactory, A72.C pooledByteStreams, FSZ.Q bitmapMemoryCache, FSZ.Q encodedMemoryCache, Hh.qz diskCachesStoreSupplier, FSZ.aC cacheKeyFactory, AbstractC1501Ml platformBitmapFactory, int i2, int i3, boolean z4, int i5, C2267j closeableReferenceFactory, boolean z5, int i7) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(byteArrayPool, "byteArrayPool");
            Intrinsics.checkNotNullParameter(imageDecoder, "imageDecoder");
            Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
            Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
            Intrinsics.checkNotNullParameter(executorSupplier, "executorSupplier");
            Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
            Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
            Intrinsics.checkNotNullParameter(bitmapMemoryCache, "bitmapMemoryCache");
            Intrinsics.checkNotNullParameter(encodedMemoryCache, "encodedMemoryCache");
            Intrinsics.checkNotNullParameter(diskCachesStoreSupplier, "diskCachesStoreSupplier");
            Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
            Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
            Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
            return new ci(context, byteArrayPool, imageDecoder, progressiveJpegConfig, downsampleMode, z2, z3, executorSupplier, pooledByteBufferFactory, bitmapMemoryCache, encodedMemoryCache, diskCachesStoreSupplier, cacheKeyFactory, platformBitmapFactory, i2, i3, z4, i5, closeableReferenceFactory, z5, i7);
        }
    }

    public /* synthetic */ s4(j jVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar);
    }

    public final n.j ViF() {
        return null;
    }

    private s4(j jVar) {
        this.f70551n = jVar.f70566t;
        this.rl = jVar.nr;
        this.f70554t = jVar.f70556O;
        this.nr = jVar.J2;
        this.f70544O = jVar.Uo;
        this.J2 = jVar.KN;
        this.Uo = jVar.xMQ;
        this.KN = jVar.mUb;
        this.xMQ = jVar.gh;
        this.mUb = jVar.qie;
        this.gh = jVar.az;
        this.qie = jVar.ty;
        this.az = jVar.HI;
        Ml ml = jVar.ck;
        this.ty = ml == null ? new w6() : ml;
        Hh.qz BOOLEAN_FALSE = jVar.Ik;
        if (BOOLEAN_FALSE == null) {
            BOOLEAN_FALSE = Hh.Pl.rl;
            Intrinsics.checkNotNullExpressionValue(BOOLEAN_FALSE, "BOOLEAN_FALSE");
        }
        this.HI = BOOLEAN_FALSE;
        this.ck = jVar.f70565r;
        this.Ik = jVar.f70564o;
        this.f70553r = jVar.f70560Z;
        this.f70552o = jVar.XQ;
        this.f70548Z = jVar.f70557S;
        this.XQ = jVar.WPU;
        this.f70545S = jVar.aYN;
        this.WPU = jVar.ViF;
        this.aYN = jVar.nY;
        this.ViF = jVar.f70562g;
        this.nY = jVar.te;
        this.f70550g = jVar.iF;
        this.f70547X = jVar.f70558T;
        this.f70543N = jVar.f70555N;
        this.te = jVar.fD;
        this.iF = jVar.E2;
        this.fD = jVar.f70561e;
        this.E2 = jVar.f70559X;
        this.f70549e = jVar.rl;
        this.f70546T = jVar.nHg;
        this.nHg = jVar.s7N;
        this.s7N = jVar.wTp;
        this.wTp = jVar.f70567v;
    }

    public final boolean E2() {
        return this.aYN;
    }

    public final Ml HI() {
        return this.ty;
    }

    public final boolean Ik() {
        return this.fD;
    }

    public final int J2() {
        return this.KN;
    }

    public final boolean KN() {
        return this.f70545S;
    }

    public final boolean N() {
        return this.qie;
    }

    public final int O() {
        return this.xMQ;
    }

    public final boolean S() {
        return this.f70544O;
    }

    public final Hh.qz T() {
        return this.HI;
    }

    public final boolean Uo() {
        return this.f70546T;
    }

    public final boolean WPU() {
        return this.nr;
    }

    public final boolean X() {
        return this.ck;
    }

    public final boolean XQ() {
        return this.J2;
    }

    public final int Z() {
        return this.f70550g;
    }

    public final uK.n aYN() {
        return this.f70554t;
    }

    public final long az() {
        return this.f70548Z;
    }

    public final boolean ck() {
        return this.E2;
    }

    public final boolean e() {
        return this.f70552o;
    }

    public final boolean fD() {
        return this.ViF;
    }

    public final boolean g() {
        return this.rl;
    }

    public final boolean gh() {
        return this.XQ;
    }

    public final boolean iF() {
        return this.WPU;
    }

    public final boolean mUb() {
        return this.iF;
    }

    public final boolean n() {
        return this.te;
    }

    public final boolean nHg() {
        return this.az;
    }

    public final boolean nY() {
        return this.wTp;
    }

    public final boolean nr() {
        return this.mUb;
    }

    public final Hh.qz o() {
        return this.f70553r;
    }

    public final int qie() {
        return this.gh;
    }

    public final boolean r() {
        return this.f70549e;
    }

    public final int rl() {
        return this.f70543N;
    }

    public final boolean s7N() {
        return this.f70551n;
    }

    public final int t() {
        return this.Uo;
    }

    public final boolean te() {
        return this.nY;
    }

    public final dF.Wre ty() {
        return this.s7N;
    }

    public final boolean xMQ() {
        return this.Ik;
    }
}
