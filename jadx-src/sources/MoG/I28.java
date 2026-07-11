package MoG;

import MoG.Xo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 extends Xo {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final sz.j f6753O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f6754n;
    private final H7v.j nr;
    private final Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final d2n.Wre f6755t;

    public /* synthetic */ I28(String str, Wre wre, d2n.Wre wre2, H7v.j jVar, sz.j jVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, wre, wre2, jVar, jVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        return Xo.j.nr(n(), i28.n()) && Intrinsics.areEqual(this.rl, i28.rl) && Intrinsics.areEqual(this.f6755t, i28.f6755t) && Intrinsics.areEqual(this.nr, i28.nr) && Intrinsics.areEqual(this.f6753O, i28.f6753O);
    }

    private I28(String str, Wre wre, d2n.Wre wre2, H7v.j jVar, sz.j jVar2) {
        super(null);
        this.f6754n = str;
        this.rl = wre;
        this.f6755t = wre2;
        this.nr = jVar;
        this.f6753O = jVar2;
    }

    public final H7v.j O() {
        return this.nr;
    }

    @Override // MoG.Xo
    public String n() {
        return this.f6754n;
    }

    public final d2n.Wre nr() {
        return this.f6755t;
    }

    public final Wre rl() {
        return this.rl;
    }

    public final sz.j t() {
        return this.f6753O;
    }

    public String toString() {
        return "FMAudibleItem(id=" + ((Object) Xo.j.J2(n())) + ", asset=" + this.rl + ", portionTimeRange=" + this.f6755t + ", speed=" + this.nr + ", audibleOptions=" + this.f6753O + ')';
    }

    public int hashCode() {
        return (((((((Xo.j.O(n()) * 31) + this.rl.hashCode()) * 31) + this.f6755t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f6753O.hashCode();
    }
}
