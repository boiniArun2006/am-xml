package FjR;

import GJW.lej;
import VyM.w6;
import android.graphics.Bitmap;
import androidx.view.Lifecycle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml {
    private final n HI;
    private final lej J2;
    private final w6.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final lej f3011O;
    private final lej Uo;
    private final n az;
    private final Boolean gh;
    private final Bitmap.Config mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lifecycle f3012n;
    private final lej nr;
    private final Boolean qie;
    private final Z.Dsr rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Z.CN3 f3013t;
    private final n ty;
    private final Z.I28 xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return Intrinsics.areEqual(this.f3012n, ml.f3012n) && Intrinsics.areEqual(this.rl, ml.rl) && this.f3013t == ml.f3013t && Intrinsics.areEqual(this.nr, ml.nr) && Intrinsics.areEqual(this.f3011O, ml.f3011O) && Intrinsics.areEqual(this.J2, ml.J2) && Intrinsics.areEqual(this.Uo, ml.Uo) && Intrinsics.areEqual(this.KN, ml.KN) && this.xMQ == ml.xMQ && this.mUb == ml.mUb && Intrinsics.areEqual(this.gh, ml.gh) && Intrinsics.areEqual(this.qie, ml.qie) && this.az == ml.az && this.ty == ml.ty && this.HI == ml.HI;
    }

    public final w6.j HI() {
        return this.KN;
    }

    public final lej J2() {
        return this.f3011O;
    }

    public final Lifecycle KN() {
        return this.f3012n;
    }

    public final n O() {
        return this.ty;
    }

    public final lej Uo() {
        return this.nr;
    }

    public final Z.Dsr az() {
        return this.rl;
    }

    public final Z.I28 gh() {
        return this.xMQ;
    }

    public int hashCode() {
        Lifecycle lifecycle = this.f3012n;
        int iHashCode = (lifecycle != null ? lifecycle.hashCode() : 0) * 31;
        Z.Dsr dsr = this.rl;
        int iHashCode2 = (iHashCode + (dsr != null ? dsr.hashCode() : 0)) * 31;
        Z.CN3 cn3 = this.f3013t;
        int iHashCode3 = (iHashCode2 + (cn3 != null ? cn3.hashCode() : 0)) * 31;
        lej lejVar = this.nr;
        int iHashCode4 = (iHashCode3 + (lejVar != null ? lejVar.hashCode() : 0)) * 31;
        lej lejVar2 = this.f3011O;
        int iHashCode5 = (iHashCode4 + (lejVar2 != null ? lejVar2.hashCode() : 0)) * 31;
        lej lejVar3 = this.J2;
        int iHashCode6 = (iHashCode5 + (lejVar3 != null ? lejVar3.hashCode() : 0)) * 31;
        lej lejVar4 = this.Uo;
        int iHashCode7 = (iHashCode6 + (lejVar4 != null ? lejVar4.hashCode() : 0)) * 31;
        w6.j jVar = this.KN;
        int iHashCode8 = (iHashCode7 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        Z.I28 i28 = this.xMQ;
        int iHashCode9 = (iHashCode8 + (i28 != null ? i28.hashCode() : 0)) * 31;
        Bitmap.Config config = this.mUb;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.gh;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.qie;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        n nVar = this.az;
        int iHashCode13 = (iHashCode12 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        n nVar2 = this.ty;
        int iHashCode14 = (iHashCode13 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        n nVar3 = this.HI;
        return iHashCode14 + (nVar3 != null ? nVar3.hashCode() : 0);
    }

    public final n mUb() {
        return this.HI;
    }

    public final Boolean n() {
        return this.gh;
    }

    public final lej nr() {
        return this.J2;
    }

    public final Z.CN3 qie() {
        return this.f3013t;
    }

    public final Boolean rl() {
        return this.qie;
    }

    public final Bitmap.Config t() {
        return this.mUb;
    }

    public final lej ty() {
        return this.Uo;
    }

    public final n xMQ() {
        return this.az;
    }

    public Ml(Lifecycle lifecycle, Z.Dsr dsr, Z.CN3 cn3, lej lejVar, lej lejVar2, lej lejVar3, lej lejVar4, w6.j jVar, Z.I28 i28, Bitmap.Config config, Boolean bool, Boolean bool2, n nVar, n nVar2, n nVar3) {
        this.f3012n = lifecycle;
        this.rl = dsr;
        this.f3013t = cn3;
        this.nr = lejVar;
        this.f3011O = lejVar2;
        this.J2 = lejVar3;
        this.Uo = lejVar4;
        this.KN = jVar;
        this.xMQ = i28;
        this.mUb = config;
        this.gh = bool;
        this.qie = bool2;
        this.az = nVar;
        this.ty = nVar2;
        this.HI = nVar3;
    }
}
