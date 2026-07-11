package kgE;

import com.alightcreative.account.IAPItemType;
import com.alightcreative.account.PurchasePeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {
    private final PurchasePeriod J2;
    private final long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f70110O;
    private final String Uo;
    private final String gh;
    private final PurchasePeriod mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f70111n;
    private final IAPItemType nr;
    private final Long qie;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f70112t;
    private final String xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f70111n, jVar.f70111n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f70112t, jVar.f70112t) && this.nr == jVar.nr && this.f70110O == jVar.f70110O && Intrinsics.areEqual(this.J2, jVar.J2) && Intrinsics.areEqual(this.Uo, jVar.Uo) && this.KN == jVar.KN && Intrinsics.areEqual(this.xMQ, jVar.xMQ) && Intrinsics.areEqual(this.mUb, jVar.mUb) && Intrinsics.areEqual(this.gh, jVar.gh) && Intrinsics.areEqual(this.qie, jVar.qie);
    }

    public j(String sku, String skuTitle, String skuDescription, IAPItemType itemType, int i2, PurchasePeriod period, String price, long j2, String priceCurrencyCode, PurchasePeriod purchasePeriod, String str, Long l2) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(skuTitle, "skuTitle");
        Intrinsics.checkNotNullParameter(skuDescription, "skuDescription");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        this.f70111n = sku;
        this.rl = skuTitle;
        this.f70112t = skuDescription;
        this.nr = itemType;
        this.f70110O = i2;
        this.J2 = period;
        this.Uo = price;
        this.KN = j2;
        this.xMQ = priceCurrencyCode;
        this.mUb = purchasePeriod;
        this.gh = str;
        this.qie = l2;
    }

    public final String J2() {
        return this.Uo;
    }

    public final String KN() {
        return this.xMQ;
    }

    public final PurchasePeriod O() {
        return this.J2;
    }

    public final long Uo() {
        return this.KN;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f70111n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f70112t.hashCode()) * 31) + this.nr.hashCode()) * 31) + Integer.hashCode(this.f70110O)) * 31) + this.J2.hashCode()) * 31) + this.Uo.hashCode()) * 31) + Long.hashCode(this.KN)) * 31) + this.xMQ.hashCode()) * 31;
        PurchasePeriod purchasePeriod = this.mUb;
        int iHashCode2 = (iHashCode + (purchasePeriod == null ? 0 : purchasePeriod.hashCode())) * 31;
        String str = this.gh;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.qie;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final int mUb() {
        return this.f70110O;
    }

    public final PurchasePeriod n() {
        return this.mUb;
    }

    public final IAPItemType nr() {
        return this.nr;
    }

    public final String rl() {
        return this.gh;
    }

    public final Long t() {
        return this.qie;
    }

    public String toString() {
        return "AvailablePurchase(sku=" + this.f70111n + ", skuTitle=" + this.rl + ", skuDescription=" + this.f70112t + ", itemType=" + this.nr + ", trialDays=" + this.f70110O + ", period=" + this.J2 + ", price=" + this.Uo + ", priceAmountMicros=" + this.KN + ", priceCurrencyCode=" + this.xMQ + ", introPeriod=" + this.mUb + ", introPrice=" + this.gh + ", introPriceAmountMicros=" + this.qie + ")";
    }

    public final String xMQ() {
        return this.f70111n;
    }
}
