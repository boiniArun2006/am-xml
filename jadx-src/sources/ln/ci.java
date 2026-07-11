package ln;

import aB.AbstractC1501Ml;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.producers.C1864m;
import com.facebook.imagepipeline.producers.C1865o;
import com.facebook.imagepipeline.producers.Fl;
import com.facebook.imagepipeline.producers.LEl;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.M5;
import com.facebook.imagepipeline.producers.P;
import com.facebook.imagepipeline.producers.QaP;
import com.facebook.imagepipeline.producers.R6;
import com.facebook.imagepipeline.producers.Zs;
import com.facebook.imagepipeline.producers.fg;
import com.facebook.imagepipeline.producers.l4Z;
import com.facebook.imagepipeline.producers.o7q;
import com.facebook.imagepipeline.producers.pO;
import com.facebook.imagepipeline.producers.xZD;
import com.facebook.imagepipeline.producers.yg;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class ci {
    protected final FSZ.aC HI;
    protected final FSZ.Ml Ik;
    protected final bAP.Ml J2;
    protected final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected final bAP.n f70490O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected final C2267j f70491S;
    protected final Pl Uo;
    protected final int WPU;
    protected boolean XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    protected final int f70492Z;
    protected final boolean aYN;
    protected final FSZ.Q az;
    protected final FSZ.Ml ck;
    protected final A72.fuX gh;
    protected final eO mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected ContentResolver f70493n;
    protected final A72.j nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final int f70494o;
    protected final Hh.qz qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final AbstractC1501Ml f70495r;
    protected Resources rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected AssetManager f70496t;
    protected final FSZ.Q ty;
    protected final boolean xMQ;

    public ci(Context context, A72.j jVar, bAP.n nVar, bAP.Ml ml, Pl pl, boolean z2, boolean z3, eO eOVar, A72.fuX fux, FSZ.Q q2, FSZ.Q q3, Hh.qz qzVar, FSZ.aC aCVar, AbstractC1501Ml abstractC1501Ml, int i2, int i3, boolean z4, int i5, C2267j c2267j, boolean z5, int i7) {
        this.f70493n = context.getApplicationContext().getContentResolver();
        this.rl = context.getApplicationContext().getResources();
        this.f70496t = context.getApplicationContext().getAssets();
        this.nr = jVar;
        this.f70490O = nVar;
        this.J2 = ml;
        this.Uo = pl;
        this.KN = z2;
        this.xMQ = z3;
        this.mUb = eOVar;
        this.gh = fux;
        this.ty = q2;
        this.az = q3;
        this.qie = qzVar;
        this.HI = aCVar;
        this.f70495r = abstractC1501Ml;
        this.ck = new FSZ.Ml(i7);
        this.Ik = new FSZ.Ml(i7);
        this.f70494o = i2;
        this.f70492Z = i3;
        this.XQ = z4;
        this.WPU = i5;
        this.f70491S = c2267j;
        this.aYN = z5;
    }

    public static C1865o KN(l4Z l4z, l4Z l4z2) {
        return new C1865o(l4z, l4z2);
    }

    public static com.facebook.imagepipeline.producers.j n(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.j(l4z);
    }

    public o7q E2(l4Z l4z) {
        return new o7q(l4z);
    }

    public l4Z HI(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.SPz(this.az, this.HI, l4z);
    }

    public com.facebook.imagepipeline.producers.u Ik() {
        return new com.facebook.imagepipeline.producers.u(this.mUb.J2(), this.gh, this.f70496t);
    }

    public com.facebook.imagepipeline.producers.aC J2(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.aC(l4z, this.f70494o, this.f70492Z, this.XQ);
    }

    public com.facebook.imagepipeline.producers.Dsr O(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.Dsr(this.ty, this.HI, l4z);
    }

    public com.facebook.imagepipeline.producers.rv6 S() {
        return new com.facebook.imagepipeline.producers.rv6(this.mUb.J2(), this.gh, this.rl);
    }

    public com.facebook.imagepipeline.producers.C Uo(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.C(this.az, this.qie, this.HI, this.ck, this.Ik, l4z);
    }

    public l4Z ViF(P p2) {
        return new Zs(this.gh, this.nr, p2);
    }

    public com.facebook.imagepipeline.producers.h WPU() {
        return new com.facebook.imagepipeline.producers.h(this.mUb.O(), this.f70493n);
    }

    public Fl X(R6[] r6Arr) {
        return new Fl(r6Arr);
    }

    public com.facebook.imagepipeline.producers.M XQ() {
        return new com.facebook.imagepipeline.producers.M(this.mUb.J2(), this.gh);
    }

    public LocalExifThumbnailProducer Z() {
        return new LocalExifThumbnailProducer(this.mUb.Uo(), this.gh, this.f70493n);
    }

    public com.facebook.imagepipeline.producers.K aYN() {
        return new com.facebook.imagepipeline.producers.K(this.mUb.J2(), this.f70493n);
    }

    public com.facebook.imagepipeline.producers.UGc az(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.UGc(this.qie, this.HI, l4z);
    }

    public com.facebook.imagepipeline.producers.ci ck(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.ci(this.qie, this.HI, this.ck, this.Ik, l4z);
    }

    public QaP e(l4Z l4z) {
        return new QaP(5, this.mUb.n(), l4z);
    }

    public fg fD(l4Z l4z, boolean z2, UM7.Ml ml) {
        return new fg(this.mUb.O(), this.gh, l4z, z2, ml);
    }

    public yg g(l4Z l4z) {
        return new yg(this.ty, this.HI, l4z);
    }

    public com.facebook.imagepipeline.producers.l3D gh(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.l3D(l4z, this.mUb.t());
    }

    public LEl iF() {
        return new LEl(this.mUb.J2(), this.gh, this.f70493n);
    }

    public com.facebook.imagepipeline.producers.eO mUb(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.eO(this.nr, this.mUb.nr(), this.f70490O, this.J2, this.Uo, this.KN, this.xMQ, l4z, this.WPU, this.f70491S, null, Hh.Pl.rl);
    }

    public C1864m nY(l4Z l4z) {
        return new C1864m(this.qie, this.HI, this.gh, this.nr, l4z);
    }

    public com.facebook.imagepipeline.producers.fuX nr(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.fuX(this.HI, l4z);
    }

    public com.facebook.imagepipeline.producers.Ln o() {
        return new com.facebook.imagepipeline.producers.Ln(this.mUb.J2(), this.gh, this.f70493n);
    }

    public com.facebook.imagepipeline.producers.s4 qie(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.s4(this.qie, this.HI, l4z);
    }

    public com.facebook.imagepipeline.producers.qf r() {
        return new com.facebook.imagepipeline.producers.qf(this.mUb.J2(), this.gh, this.f70493n);
    }

    public l4Z rl(l4Z l4z, M5 m5) {
        return new xZD(l4z, m5);
    }

    public com.facebook.imagepipeline.producers.CN3 t(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.CN3(this.ty, this.HI, l4z);
    }

    public pO te(l4Z l4z) {
        return new pO(l4z, this.f70495r, this.mUb.O());
    }

    public com.facebook.imagepipeline.producers.r ty(l4Z l4z) {
        return new com.facebook.imagepipeline.producers.r(this.HI, this.aYN, l4z);
    }

    public com.facebook.imagepipeline.producers.Xo xMQ() {
        return new com.facebook.imagepipeline.producers.Xo(this.gh);
    }
}
