package R5;

import com.alightcreative.account.PurchasePeriod;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Wre {
    private final Long J2;
    private final Integer KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f8670O;
    private final Integer Uo;
    private final String az;
    private final String gh;
    private final Long mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8671n;
    private final PurchasePeriod nr;
    private final PurchasePeriod qie;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f8672t;
    private final long ty;
    private final Integer xMQ;

    public Wre(String price, long j2, String priceCurrencyCode, PurchasePeriod pricePeriod, String str, Long l2, Integer num, Integer num2, Integer num3, Long l5, String str2, PurchasePeriod purchasePeriod) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(pricePeriod, "pricePeriod");
        this.f8671n = price;
        this.rl = j2;
        this.f8672t = priceCurrencyCode;
        this.nr = pricePeriod;
        this.f8670O = str;
        this.J2 = l2;
        this.Uo = num;
        this.KN = num2;
        this.xMQ = num3;
        this.mUb = l5;
        this.gh = str2;
        this.qie = purchasePeriod;
        this.az = str != null ? str : price;
        this.ty = l2 != null ? l2.longValue() : j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wre)) {
            return false;
        }
        Wre wre = (Wre) obj;
        return Intrinsics.areEqual(this.f8671n, wre.f8671n) && this.rl == wre.rl && Intrinsics.areEqual(this.f8672t, wre.f8672t) && Intrinsics.areEqual(this.nr, wre.nr) && Intrinsics.areEqual(this.f8670O, wre.f8670O) && Intrinsics.areEqual(this.J2, wre.J2) && Intrinsics.areEqual(this.Uo, wre.Uo) && Intrinsics.areEqual(this.KN, wre.KN) && Intrinsics.areEqual(this.xMQ, wre.xMQ) && Intrinsics.areEqual(this.mUb, wre.mUb) && Intrinsics.areEqual(this.gh, wre.gh) && Intrinsics.areEqual(this.qie, wre.qie);
    }

    public static /* synthetic */ Wre rl(Wre wre, String str, long j2, String str2, PurchasePeriod purchasePeriod, String str3, Long l2, Integer num, Integer num2, Integer num3, Long l5, String str4, PurchasePeriod purchasePeriod2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wre.f8671n;
        }
        return wre.n(str, (i2 & 2) != 0 ? wre.rl : j2, (i2 & 4) != 0 ? wre.f8672t : str2, (i2 & 8) != 0 ? wre.nr : purchasePeriod, (i2 & 16) != 0 ? wre.f8670O : str3, (i2 & 32) != 0 ? wre.J2 : l2, (i2 & 64) != 0 ? wre.Uo : num, (i2 & 128) != 0 ? wre.KN : num2, (i2 & 256) != 0 ? wre.xMQ : num3, (i2 & 512) != 0 ? wre.mUb : l5, (i2 & 1024) != 0 ? wre.gh : str4, (i2 & 2048) != 0 ? wre.qie : purchasePeriod2);
    }

    public final long J2() {
        return this.ty;
    }

    public final PurchasePeriod KN() {
        return this.qie;
    }

    public final String O() {
        return this.az;
    }

    public final Integer Uo() {
        return this.xMQ;
    }

    public final String az() {
        return this.f8672t;
    }

    public final Integer gh() {
        return this.Uo;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f8671n.hashCode() * 31) + Long.hashCode(this.rl)) * 31) + this.f8672t.hashCode()) * 31) + this.nr.hashCode()) * 31;
        String str = this.f8670O;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.J2;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.Uo;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.KN;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.xMQ;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l5 = this.mUb;
        int iHashCode7 = (iHashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str2 = this.gh;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PurchasePeriod purchasePeriod = this.qie;
        return iHashCode8 + (purchasePeriod != null ? purchasePeriod.hashCode() : 0);
    }

    public final Long mUb() {
        return this.mUb;
    }

    public final Wre n(String price, long j2, String priceCurrencyCode, PurchasePeriod pricePeriod, String str, Long l2, Integer num, Integer num2, Integer num3, Long l5, String str2, PurchasePeriod purchasePeriod) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(pricePeriod, "pricePeriod");
        return new Wre(price, j2, priceCurrencyCode, pricePeriod, str, l2, num, num2, num3, l5, str2, purchasePeriod);
    }

    public final String nr() {
        return this.f8670O;
    }

    public final String qie() {
        return this.f8671n;
    }

    public final Integer t() {
        return this.KN;
    }

    public String toString() {
        return "SubscriptionItem(price=" + this.f8671n + ", priceAmountMicros=" + this.rl + ", priceCurrencyCode=" + this.f8672t + ", pricePeriod=" + this.nr + ", discountPrice=" + this.f8670O + ", discountPriceAmountMicros=" + this.J2 + ", periodDiscountPercentage=" + this.Uo + ", discountPercentage=" + this.KN + ", freeTrialDays=" + this.xMQ + ", introPriceAmountMicros=" + this.mUb + ", introPrice=" + this.gh + ", introPeriod=" + this.qie + ")";
    }

    public final PurchasePeriod ty() {
        return this.nr;
    }

    public final String xMQ() {
        return this.gh;
    }

    public /* synthetic */ Wre(String str, long j2, String str2, PurchasePeriod purchasePeriod, String str3, Long l2, Integer num, Integer num2, Integer num3, Long l5, String str4, PurchasePeriod purchasePeriod2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, str2, purchasePeriod, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : l2, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : num2, (i2 & 256) != 0 ? null : num3, (i2 & 512) != 0 ? null : l5, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? null : purchasePeriod2);
    }
}
