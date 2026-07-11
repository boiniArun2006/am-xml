package qwH;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C implements fuX, iwV, vd, stX.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final UGc f72505n;
    private String nr;
    private final Q rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final r f72506t;

    public C(UGc date, Q time, r offset, String str) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f72505n = date;
        this.rl = time;
        this.f72506t = offset;
        this.nr = str;
    }

    @Override // qwH.fuX
    public Integer E2() {
        return this.f72505n.E2();
    }

    @Override // qwH.iwV
    public void HI(Integer num) {
        this.rl.HI(num);
    }

    @Override // qwH.vd
    public void Ik(Integer num) {
        this.f72506t.Ik(num);
    }

    @Override // qwH.iwV
    public Integer J2() {
        return this.rl.J2();
    }

    @Override // qwH.fuX
    public Integer KN() {
        return this.f72505n.KN();
    }

    public final UGc N() {
        return this.f72505n;
    }

    @Override // qwH.vd
    public Integer O() {
        return this.f72506t.O();
    }

    @Override // qwH.fuX
    public void S(Integer num) {
        this.f72505n.S(num);
    }

    @Override // stX.w6
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public C nr() {
        return new C(this.f72505n.nr(), this.rl.nr(), this.f72506t.nr(), this.nr);
    }

    @Override // qwH.iwV
    public Integer Uo() {
        return this.rl.Uo();
    }

    @Override // qwH.fuX
    public Integer ViF() {
        return this.f72505n.ViF();
    }

    @Override // qwH.vd
    public Integer WPU() {
        return this.f72506t.WPU();
    }

    @Override // qwH.fuX
    public void X(Integer num) {
        this.f72505n.X(num);
    }

    @Override // qwH.iwV
    public void XQ(Integer num) {
        this.rl.XQ(num);
    }

    @Override // qwH.iwV
    public void Z(Integer num) {
        this.rl.Z(num);
    }

    @Override // qwH.iwV
    public void aYN(Integer num) {
        this.rl.aYN(num);
    }

    @Override // qwH.iwV
    public Integer az() {
        return this.rl.az();
    }

    @Override // qwH.fuX
    public void ck(Integer num) {
        this.f72505n.ck(num);
    }

    @Override // qwH.iwV
    public void e(Integer num) {
        this.rl.e(num);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return Intrinsics.areEqual(c2.f72505n, this.f72505n) && Intrinsics.areEqual(c2.rl, this.rl) && Intrinsics.areEqual(c2.f72506t, this.f72506t) && Intrinsics.areEqual(c2.nr, this.nr);
    }

    @Override // qwH.fuX
    public Integer fD() {
        return this.f72505n.fD();
    }

    @Override // qwH.iwV
    public fm.j g() {
        return this.rl.g();
    }

    @Override // qwH.vd
    public void gh(Boolean bool) {
        this.f72506t.gh(bool);
    }

    public int hashCode() {
        int iHashCode = (this.f72505n.hashCode() ^ this.rl.hashCode()) ^ this.f72506t.hashCode();
        String str = this.nr;
        return iHashCode ^ (str != null ? str.hashCode() : 0);
    }

    @Override // qwH.fuX
    public void iF(Integer num) {
        this.f72505n.iF(num);
    }

    @Override // qwH.iwV
    public void mUb(CN3 cn3) {
        this.rl.mUb(cn3);
    }

    @Override // qwH.vd
    public Boolean n() {
        return this.f72506t.n();
    }

    public final r nHg() {
        return this.f72506t;
    }

    @Override // qwH.fuX
    public void nY(Integer num) {
        this.f72505n.nY(num);
    }

    @Override // qwH.iwV
    public CN3 o() {
        return this.rl.o();
    }

    @Override // qwH.iwV
    public void qie(fm.j jVar) {
        this.rl.qie(jVar);
    }

    @Override // qwH.vd
    public void r(Integer num) {
        this.f72506t.r(num);
    }

    @Override // qwH.iwV
    public Integer rl() {
        return this.rl.rl();
    }

    public final Q s7N() {
        return this.rl;
    }

    @Override // qwH.iwV
    public Integer t() {
        return this.rl.t();
    }

    @Override // qwH.fuX
    public Integer te() {
        return this.f72505n.te();
    }

    @Override // qwH.vd
    public void ty(Integer num) {
        this.f72506t.ty(num);
    }

    public final void v(String str) {
        this.nr = str;
    }

    public final String wTp() {
        return this.nr;
    }

    @Override // qwH.vd
    public Integer xMQ() {
        return this.f72506t.xMQ();
    }

    public /* synthetic */ C(UGc uGc, Q q2, r rVar, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new UGc(null, null, null, null, null, 31, null) : uGc, (i2 & 2) != 0 ? new Q(null, null, null, null, null, null, 63, null) : q2, (i2 & 4) != 0 ? new r(null, null, null, null, 15, null) : rVar, (i2 & 8) != 0 ? null : str);
    }
}
