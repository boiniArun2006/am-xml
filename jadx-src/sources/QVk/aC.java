package QVk;

import QVk.n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class aC extends fuX {
    private int E2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Pl f8204N;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Object f8205S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private I28 f8206T;
    private long ViF;
    private Object WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private Throwable f8207X;
    private Object XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private String f8208Z;
    private long aYN;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8209e;
    private boolean fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f8210g;
    private long iF;
    private long nHg;
    private long nY;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f8211o;
    private long s7N;
    private long te;
    private n.j wTp;

    public final void WPU() {
        this.f8208Z = null;
        this.XQ = null;
        this.f8205S = null;
        this.WPU = null;
        this.fD = false;
        this.E2 = -1;
        this.f8209e = -1;
        this.f8207X = null;
        this.f8206T = I28.J2;
        this.f8204N = Pl.J2;
        this.wTp = null;
        aYN();
        o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aC(C infra) {
        super(infra);
        Intrinsics.checkNotNullParameter(infra, "infra");
        this.aYN = -1L;
        this.ViF = -1L;
        this.nY = -1L;
        this.f8210g = -1L;
        this.te = -1L;
        this.iF = -1L;
        this.E2 = -1;
        this.f8209e = -1;
        this.f8206T = I28.J2;
        this.f8204N = Pl.J2;
        this.nHg = -1L;
        this.s7N = -1L;
    }

    public final void E2(Throwable th) {
        this.f8207X = th;
    }

    public final void N(Object obj) {
        this.XQ = obj;
    }

    public final Wre P5() {
        return new Wre(mUb(), this.f8211o, this.f8208Z, this.XQ, this.f8205S, this.WPU, this.aYN, this.ViF, this.nY, this.f8210g, this.te, this.iF, J2(), ty(), this.fD, this.E2, this.f8209e, this.f8207X, this.f8204N, this.nHg, this.s7N, null, this.wTp, n(), HI(), t(), nr(), rl(), r(), Ik(), qie(), ck(), CollectionsKt.toList(gh()), az(), KN(), xMQ(), Uo(), O());
    }

    public final void T(I28 i28) {
        Intrinsics.checkNotNullParameter(i28, "<set-?>");
        this.f8206T = i28;
    }

    public final void U(boolean z2) {
        this.f8204N = z2 ? Pl.f8188r : Pl.f8187o;
    }

    public final void ViF(Object obj) {
        this.f8205S = obj;
    }

    public final void X(Object obj) {
        this.WPU = obj;
    }

    public final void Xw(String str) {
        this.f8208Z = str;
    }

    public final void aYN() {
        this.te = -1L;
        this.iF = -1L;
        this.aYN = -1L;
        this.nY = -1L;
        this.f8210g = -1L;
        this.nHg = -1L;
        this.s7N = -1L;
        gh().clear();
        XQ(false);
        Z(null);
        S(null);
    }

    public final void bzg(boolean z2) {
        this.fD = z2;
    }

    public final void e(n.j jVar) {
        this.wTp = jVar;
    }

    public final void fD(long j2) {
        this.aYN = j2;
    }

    public final void g(long j2) {
        this.nY = j2;
    }

    public final void iF(long j2) {
        this.ViF = j2;
    }

    public final void jB(long j2) {
        this.nHg = j2;
    }

    public final void nHg(long j2) {
        this.iF = j2;
    }

    public final void nY(long j2) {
        this.f8210g = j2;
    }

    public final void rV9(int i2) {
        this.E2 = i2;
    }

    public final void s7N(long j2) {
        this.te = j2;
    }

    public final void te(String str) {
        this.f8211o = str;
    }

    public final void v(int i2) {
        this.f8209e = i2;
    }

    public final void wTp(long j2) {
        this.s7N = j2;
    }
}
