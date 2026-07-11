package B7;

import android.view.Surface;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class Pl {
    private final Z4.n J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Oe.w6 f245O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MoG.CN3 f246n;
    private final Surface nr;
    private final Object rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f247t;

    public /* synthetic */ Pl(MoG.CN3 cn3, Object obj, long j2, Surface surface, Oe.w6 w6Var, Z4.n nVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cn3, obj, j2, surface, w6Var, nVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pl)) {
            return false;
        }
        Pl pl = (Pl) obj;
        return Intrinsics.areEqual(this.f246n, pl.f246n) && Intrinsics.areEqual(this.rl, pl.rl) && d2n.Ml.KN(this.f247t, pl.f247t) && Intrinsics.areEqual(this.nr, pl.nr) && Intrinsics.areEqual(this.f245O, pl.f245O) && Intrinsics.areEqual(this.J2, pl.J2);
    }

    private Pl(MoG.CN3 cn3, Object obj, long j2, Surface surface, Oe.w6 w6Var, Z4.n nVar) {
        this.f246n = cn3;
        this.rl = obj;
        this.f247t = j2;
        this.nr = surface;
        this.f245O = w6Var;
        this.J2 = nVar;
        if (d2n.CN3.nr(cn3.Uo(), j2)) {
            return;
        }
        throw new IllegalArgumentException(("Time (" + ((Object) d2n.Ml.ck(j2)) + ") outside composition range (" + cn3.Uo() + ").").toString());
    }

    public final long J2() {
        return this.f247t;
    }

    public final Oe.w6 O() {
        return this.f245O;
    }

    public int hashCode() {
        int iHashCode = this.f246n.hashCode() * 31;
        Object obj = this.rl;
        int iHashCode2 = (((((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + d2n.Ml.qie(this.f247t)) * 31) + this.nr.hashCode()) * 31) + this.f245O.hashCode()) * 31;
        Z4.n nVar = this.J2;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final Object n() {
        return this.rl;
    }

    public final Surface nr() {
        return this.nr;
    }

    public final Z4.n rl() {
        return new Z4.n(this.f246n.J2(), this.f247t, null);
    }

    public final Z4.n t() {
        return this.J2;
    }

    public String toString() {
        return "CompositionRenderState(composition=" + this.f246n + ", compositionInstruction=" + this.rl + ", time=" + ((Object) d2n.Ml.ck(this.f247t)) + ", surface=" + this.nr + ", surfaceSize=" + this.f245O + ", predictedGraphicSlice=" + this.J2 + ')';
    }
}
