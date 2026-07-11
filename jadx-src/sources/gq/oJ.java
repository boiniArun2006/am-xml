package gq;

import java.util.Objects;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class oJ {
    private final pUk.UGc J2;
    private final Integer KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final pUk.UGc f67822O;
    private final com.google.protobuf.C Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final uh.vd f67823n;
    private final l4Z nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f67824t;

    oJ(uh.vd vdVar, int i2, long j2, l4Z l4z, pUk.UGc uGc, pUk.UGc uGc2, com.google.protobuf.C c2, Integer num) {
        this.f67823n = (uh.vd) AbstractC2418c.rl(vdVar);
        this.rl = i2;
        this.f67824t = j2;
        this.J2 = uGc2;
        this.nr = l4z;
        this.f67822O = (pUk.UGc) AbstractC2418c.rl(uGc);
        this.Uo = (com.google.protobuf.C) AbstractC2418c.rl(c2);
        this.KN = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oJ.class == obj.getClass()) {
            oJ oJVar = (oJ) obj;
            if (this.f67823n.equals(oJVar.f67823n) && this.rl == oJVar.rl && this.f67824t == oJVar.f67824t && this.nr.equals(oJVar.nr) && this.f67822O.equals(oJVar.f67822O) && this.J2.equals(oJVar.J2) && this.Uo.equals(oJVar.Uo) && Objects.equals(this.KN, oJVar.KN)) {
                return true;
            }
        }
        return false;
    }

    public pUk.UGc J2() {
        return this.f67822O;
    }

    public int KN() {
        return this.rl;
    }

    public long O() {
        return this.f67824t;
    }

    public uh.vd Uo() {
        return this.f67823n;
    }

    public oJ gh(com.google.protobuf.C c2, pUk.UGc uGc) {
        return new oJ(this.f67823n, this.rl, this.f67824t, this.nr, uGc, this.J2, c2, null);
    }

    public int hashCode() {
        return (((((((((((((this.f67823n.hashCode() * 31) + this.rl) * 31) + ((int) this.f67824t)) * 31) + this.nr.hashCode()) * 31) + this.f67822O.hashCode()) * 31) + this.J2.hashCode()) * 31) + this.Uo.hashCode()) * 31) + Objects.hashCode(this.KN);
    }

    public oJ mUb(pUk.UGc uGc) {
        return new oJ(this.f67823n, this.rl, this.f67824t, this.nr, this.f67822O, uGc, this.Uo, this.KN);
    }

    public Integer n() {
        return this.KN;
    }

    public com.google.protobuf.C nr() {
        return this.Uo;
    }

    public oJ qie(long j2) {
        return new oJ(this.f67823n, this.rl, j2, this.nr, this.f67822O, this.J2, this.Uo, this.KN);
    }

    public pUk.UGc rl() {
        return this.J2;
    }

    public l4Z t() {
        return this.nr;
    }

    public String toString() {
        return "TargetData{target=" + this.f67823n + ", targetId=" + this.rl + ", sequenceNumber=" + this.f67824t + ", purpose=" + this.nr + ", snapshotVersion=" + this.f67822O + ", lastLimboFreeSnapshotVersion=" + this.J2 + ", resumeToken=" + this.Uo + ", expectedCount=" + this.KN + '}';
    }

    public oJ xMQ(Integer num) {
        return new oJ(this.f67823n, this.rl, this.f67824t, this.nr, this.f67822O, this.J2, this.Uo, num);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oJ(uh.vd vdVar, int i2, long j2, l4Z l4z) {
        pUk.UGc uGc = pUk.UGc.f72007t;
        this(vdVar, i2, j2, l4z, uGc, uGc, com.google.firebase.firestore.remote.nKK.f60448Z, null);
    }
}
