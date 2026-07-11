package hz;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hz.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class C2163j {
    private Integer HI;
    private Drawable J2;
    private Drawable KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Drawable f68042O;
    private Drawable Uo;
    private Integer az;
    private Integer ck;
    private final Integer gh;
    private final Integer mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f68043n;
    private Integer nr;
    private Integer qie;
    private Integer rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Integer f68044t;
    private Integer ty;
    private final Integer xMQ;

    public C2163j(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12) {
        this.f68043n = num;
        this.rl = num2;
        this.f68044t = num3;
        this.nr = num4;
        this.f68042O = drawable;
        this.J2 = drawable2;
        this.Uo = drawable3;
        this.KN = drawable4;
        this.xMQ = num5;
        this.mUb = num6;
        this.gh = num7;
        this.qie = num8;
        this.az = num9;
        this.ty = num10;
        this.HI = num11;
        this.ck = num12;
    }

    public /* synthetic */ C2163j(Integer num, Integer num2, Integer num3, Integer num4, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : num2, (i2 & 4) != 0 ? null : num3, (i2 & 8) != 0 ? null : num4, (i2 & 16) != 0 ? null : drawable, (i2 & 32) != 0 ? null : drawable2, (i2 & 64) != 0 ? null : drawable3, (i2 & 128) != 0 ? null : drawable4, (i2 & 256) != 0 ? null : num5, (i2 & 512) != 0 ? null : num6, (i2 & 1024) != 0 ? null : num7, (i2 & 2048) != 0 ? null : num8, (i2 & 4096) != 0 ? null : num9, (i2 & 8192) != 0 ? null : num10, (i2 & 16384) != 0 ? null : num11, (i2 & 32768) != 0 ? null : num12);
    }

    public final Integer HI() {
        return this.az;
    }

    public final void Ik(Drawable drawable) {
        this.Uo = drawable;
    }

    public final Integer J2() {
        return this.f68043n;
    }

    public final Integer KN() {
        return this.rl;
    }

    public final Drawable O() {
        return this.f68042O;
    }

    public final void S(Integer num) {
        this.rl = num;
    }

    public final Drawable Uo() {
        return this.J2;
    }

    public final void WPU(Drawable drawable) {
        this.KN = drawable;
    }

    public final void XQ(Drawable drawable) {
        this.J2 = drawable;
    }

    public final void Z(Integer num) {
        this.f68043n = num;
    }

    public final void aYN(Integer num) {
        this.nr = num;
    }

    public final Integer az() {
        return this.mUb;
    }

    public final Integer ck() {
        return this.ty;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2163j)) {
            return false;
        }
        C2163j c2163j = (C2163j) obj;
        return Intrinsics.areEqual(this.f68043n, c2163j.f68043n) && Intrinsics.areEqual(this.rl, c2163j.rl) && Intrinsics.areEqual(this.f68044t, c2163j.f68044t) && Intrinsics.areEqual(this.nr, c2163j.nr) && Intrinsics.areEqual(this.f68042O, c2163j.f68042O) && Intrinsics.areEqual(this.J2, c2163j.J2) && Intrinsics.areEqual(this.Uo, c2163j.Uo) && Intrinsics.areEqual(this.KN, c2163j.KN) && Intrinsics.areEqual(this.xMQ, c2163j.xMQ) && Intrinsics.areEqual(this.mUb, c2163j.mUb) && Intrinsics.areEqual(this.gh, c2163j.gh) && Intrinsics.areEqual(this.qie, c2163j.qie) && Intrinsics.areEqual(this.az, c2163j.az) && Intrinsics.areEqual(this.ty, c2163j.ty) && Intrinsics.areEqual(this.HI, c2163j.HI) && Intrinsics.areEqual(this.ck, c2163j.ck);
    }

    public final Integer gh() {
        return this.HI;
    }

    public int hashCode() {
        Integer num = this.f68043n;
        int iHashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.rl;
        int iHashCode2 = (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f68044t;
        int iHashCode3 = (iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.nr;
        int iHashCode4 = (iHashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Drawable drawable = this.f68042O;
        int iHashCode5 = (iHashCode4 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.J2;
        int iHashCode6 = (iHashCode5 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.Uo;
        int iHashCode7 = (iHashCode6 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31;
        Drawable drawable4 = this.KN;
        int iHashCode8 = (iHashCode7 + (drawable4 != null ? drawable4.hashCode() : 0)) * 31;
        Integer num5 = this.xMQ;
        int iHashCode9 = (iHashCode8 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Integer num6 = this.mUb;
        int iHashCode10 = (iHashCode9 + (num6 != null ? num6.hashCode() : 0)) * 31;
        Integer num7 = this.gh;
        int iHashCode11 = (iHashCode10 + (num7 != null ? num7.hashCode() : 0)) * 31;
        Integer num8 = this.qie;
        int iHashCode12 = (iHashCode11 + (num8 != null ? num8.hashCode() : 0)) * 31;
        Integer num9 = this.az;
        int iHashCode13 = (iHashCode12 + (num9 != null ? num9.hashCode() : 0)) * 31;
        Integer num10 = this.ty;
        int iHashCode14 = (iHashCode13 + (num10 != null ? num10.hashCode() : 0)) * 31;
        Integer num11 = this.HI;
        int iHashCode15 = (iHashCode14 + (num11 != null ? num11.hashCode() : 0)) * 31;
        Integer num12 = this.ck;
        return iHashCode15 + (num12 != null ? num12.hashCode() : 0);
    }

    public final Integer mUb() {
        return this.nr;
    }

    public final Integer n() {
        return this.xMQ;
    }

    public final Integer nr() {
        return this.f68044t;
    }

    public final void o(Drawable drawable) {
        this.f68042O = drawable;
    }

    public final Integer qie() {
        return this.gh;
    }

    public final void r(Integer num) {
        this.f68044t = num;
    }

    public final Integer rl() {
        return this.qie;
    }

    public final Drawable t() {
        return this.Uo;
    }

    public String toString() {
        return "VectorTextViewParams(drawableLeftRes=" + this.f68043n + ", drawableRightRes=" + this.rl + ", drawableBottomRes=" + this.f68044t + ", drawableTopRes=" + this.nr + ", drawableLeft=" + this.f68042O + ", drawableRight=" + this.J2 + ", drawableBottom=" + this.Uo + ", drawableTop=" + this.KN + ", compoundDrawablePadding=" + this.xMQ + ", iconWidth=" + this.mUb + ", iconHeight=" + this.gh + ", compoundDrawablePaddingRes=" + this.qie + ", tintColor=" + this.az + ", widthRes=" + this.ty + ", heightRes=" + this.HI + ", squareSizeRes=" + this.ck + ")";
    }

    public final Integer ty() {
        return this.ck;
    }

    public final Drawable xMQ() {
        return this.KN;
    }
}
