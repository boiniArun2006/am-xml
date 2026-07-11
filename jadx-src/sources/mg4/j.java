package mg4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {
    private final kgE.j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final kgE.j f70990O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final kgE.j f70991n;
    private final kgE.j nr;
    private final kgE.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final kgE.j f70992t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f70991n, jVar.f70991n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f70992t, jVar.f70992t) && Intrinsics.areEqual(this.nr, jVar.nr);
    }

    public j(kgE.j noTrialSubscription, kgE.j jVar, kgE.j jVar2, kgE.j jVar3) {
        Intrinsics.checkNotNullParameter(noTrialSubscription, "noTrialSubscription");
        this.f70991n = noTrialSubscription;
        this.rl = jVar;
        this.f70992t = jVar2;
        this.nr = jVar3;
        this.f70990O = jVar2 != null ? jVar2 : noTrialSubscription;
        this.J2 = jVar3 != null ? jVar3 : jVar;
    }

    public final kgE.j O() {
        return this.f70991n;
    }

    public int hashCode() {
        int iHashCode = this.f70991n.hashCode() * 31;
        kgE.j jVar = this.rl;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        kgE.j jVar2 = this.f70992t;
        int iHashCode3 = (iHashCode2 + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
        kgE.j jVar3 = this.nr;
        return iHashCode3 + (jVar3 != null ? jVar3.hashCode() : 0);
    }

    public final kgE.j n() {
        return this.J2;
    }

    public final kgE.j nr() {
        return this.f70992t;
    }

    public final kgE.j rl() {
        return this.f70990O;
    }

    public final kgE.j t() {
        return this.rl;
    }

    public String toString() {
        return "SubscriptionGroup(noTrialSubscription=" + this.f70991n + ", freeTrialSubscription=" + this.rl + ", noTrialDiscountedSubscription=" + this.f70992t + ", freeTrialDiscountedSubscription=" + this.nr + ")";
    }
}
