package MoG;

import MoG.Xo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class n extends C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f6767n;
    private final H7v.j nr;
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final d2n.Wre f6768t;

    public /* synthetic */ n(String str, j jVar, d2n.Wre wre, H7v.j jVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jVar, wre, jVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Xo.j.nr(n(), nVar.n()) && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f6768t, nVar.f6768t) && Intrinsics.areEqual(this.nr, nVar.nr);
    }

    private n(String str, j jVar, d2n.Wre wre, H7v.j jVar2) {
        super(null);
        this.f6767n = str;
        this.rl = jVar;
        this.f6768t = wre;
        this.nr = jVar2;
    }

    @Override // MoG.Xo
    public String n() {
        return this.f6767n;
    }

    public final H7v.j nr() {
        return this.nr;
    }

    public final j rl() {
        return this.rl;
    }

    public final d2n.Wre t() {
        return this.f6768t;
    }

    public String toString() {
        return "FMAnimatedItem(id=" + ((Object) Xo.j.J2(n())) + ", asset=" + this.rl + ", portionTimeRange=" + this.f6768t + ", speed=" + this.nr + ')';
    }

    public int hashCode() {
        return (((((Xo.j.O(n()) * 31) + this.rl.hashCode()) * 31) + this.f6768t.hashCode()) * 31) + this.nr.hashCode();
    }
}
