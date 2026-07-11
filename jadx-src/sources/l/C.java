package l;

import GJW.xuv;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final okd.j f70345n;
    private final Float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final xuv f70346t;

    public C(okd.j jVar, Float f3, xuv xuvVar) {
        this.f70345n = jVar;
        this.rl = f3;
        this.f70346t = xuvVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return this.f70345n == c2.f70345n && Intrinsics.areEqual((Object) this.rl, (Object) c2.rl) && Intrinsics.areEqual(this.f70346t, c2.f70346t);
    }

    public static /* synthetic */ C rl(C c2, okd.j jVar, Float f3, xuv xuvVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jVar = c2.f70345n;
        }
        if ((i2 & 2) != 0) {
            f3 = c2.rl;
        }
        if ((i2 & 4) != 0) {
            xuvVar = c2.f70346t;
        }
        return c2.n(jVar, f3, xuvVar);
    }

    public final okd.j O() {
        return this.f70345n;
    }

    public int hashCode() {
        okd.j jVar = this.f70345n;
        int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
        Float f3 = this.rl;
        int iHashCode2 = (iHashCode + (f3 == null ? 0 : f3.hashCode())) * 31;
        xuv xuvVar = this.f70346t;
        return iHashCode2 + (xuvVar != null ? xuvVar.hashCode() : 0);
    }

    public final C n(okd.j jVar, Float f3, xuv xuvVar) {
        return new C(jVar, f3, xuvVar);
    }

    public final Float nr() {
        return this.rl;
    }

    public final xuv t() {
        return this.f70346t;
    }

    public String toString() {
        return "CloudBackupViewModelState(operation=" + this.f70345n + ", cloudJobProgress=" + this.rl + ", cloudJob=" + this.f70346t + ")";
    }

    public /* synthetic */ C(okd.j jVar, Float f3, xuv xuvVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : jVar, (i2 & 2) != 0 ? null : f3, (i2 & 4) != 0 ? null : xuvVar);
    }
}
