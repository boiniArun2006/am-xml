package FjR;

import GJW.OU;
import GJW.lej;
import VyM.w6;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w6 {
    private final n HI;
    private final Z.I28 J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final w6.j f3061O;
    private final Bitmap.Config Uo;
    private final n az;
    private final Drawable gh;
    private final Drawable mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final lej f3062n;
    private final lej nr;
    private final Drawable qie;
    private final lej rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final lej f3063t;
    private final n ty;
    private final boolean xMQ;

    public w6(lej lejVar, lej lejVar2, lej lejVar3, lej lejVar4, w6.j jVar, Z.I28 i28, Bitmap.Config config, boolean z2, boolean z3, Drawable drawable, Drawable drawable2, Drawable drawable3, n nVar, n nVar2, n nVar3) {
        this.f3062n = lejVar;
        this.rl = lejVar2;
        this.f3063t = lejVar3;
        this.nr = lejVar4;
        this.f3061O = jVar;
        this.J2 = i28;
        this.Uo = config;
        this.KN = z2;
        this.xMQ = z3;
        this.mUb = drawable;
        this.gh = drawable2;
        this.qie = drawable3;
        this.az = nVar;
        this.ty = nVar2;
        this.HI = nVar3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f3062n, w6Var.f3062n) && Intrinsics.areEqual(this.rl, w6Var.rl) && Intrinsics.areEqual(this.f3063t, w6Var.f3063t) && Intrinsics.areEqual(this.nr, w6Var.nr) && Intrinsics.areEqual(this.f3061O, w6Var.f3061O) && this.J2 == w6Var.J2 && this.Uo == w6Var.Uo && this.KN == w6Var.KN && this.xMQ == w6Var.xMQ && Intrinsics.areEqual(this.mUb, w6Var.mUb) && Intrinsics.areEqual(this.gh, w6Var.gh) && Intrinsics.areEqual(this.qie, w6Var.qie) && this.az == w6Var.az && this.ty == w6Var.ty && this.HI == w6Var.HI;
    }

    public final Z.I28 HI() {
        return this.J2;
    }

    public final w6.j Ik() {
        return this.f3061O;
    }

    public final lej J2() {
        return this.f3063t;
    }

    public final Drawable KN() {
        return this.gh;
    }

    public final Bitmap.Config O() {
        return this.Uo;
    }

    public final n Uo() {
        return this.ty;
    }

    public final n az() {
        return this.HI;
    }

    public final lej ck() {
        return this.nr;
    }

    public final lej gh() {
        return this.f3062n;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f3062n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f3063t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f3061O.hashCode()) * 31) + this.J2.hashCode()) * 31) + this.Uo.hashCode()) * 31) + Boolean.hashCode(this.KN)) * 31) + Boolean.hashCode(this.xMQ)) * 31;
        Drawable drawable = this.mUb;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.gh;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.qie;
        return ((((((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.az.hashCode()) * 31) + this.ty.hashCode()) * 31) + this.HI.hashCode();
    }

    public final lej mUb() {
        return this.rl;
    }

    public final w6 n(lej lejVar, lej lejVar2, lej lejVar3, lej lejVar4, w6.j jVar, Z.I28 i28, Bitmap.Config config, boolean z2, boolean z3, Drawable drawable, Drawable drawable2, Drawable drawable3, n nVar, n nVar2, n nVar3) {
        return new w6(lejVar, lejVar2, lejVar3, lejVar4, jVar, i28, config, z2, z3, drawable, drawable2, drawable3, nVar, nVar2, nVar3);
    }

    public final boolean nr() {
        return this.xMQ;
    }

    public final n qie() {
        return this.az;
    }

    public final boolean t() {
        return this.KN;
    }

    public final Drawable ty() {
        return this.mUb;
    }

    public final Drawable xMQ() {
        return this.qie;
    }

    public /* synthetic */ w6(lej lejVar, lej lejVar2, lej lejVar3, lej lejVar4, w6.j jVar, Z.I28 i28, Bitmap.Config config, boolean z2, boolean z3, Drawable drawable, Drawable drawable2, Drawable drawable3, n nVar, n nVar2, n nVar3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? OU.t().p0N() : lejVar, (i2 & 2) != 0 ? OU.rl() : lejVar2, (i2 & 4) != 0 ? OU.rl() : lejVar3, (i2 & 8) != 0 ? OU.rl() : lejVar4, (i2 & 16) != 0 ? w6.j.rl : jVar, (i2 & 32) != 0 ? Z.I28.f12265O : i28, (i2 & 64) != 0 ? kYF.C.J2() : config, (i2 & 128) != 0 ? true : z2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? null : drawable, (i2 & 1024) != 0 ? null : drawable2, (i2 & 2048) == 0 ? drawable3 : null, (i2 & 4096) != 0 ? n.f3050O : nVar, (i2 & 8192) != 0 ? n.f3050O : nVar2, (i2 & 16384) != 0 ? n.f3050O : nVar3);
    }
}
