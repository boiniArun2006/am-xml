package kgE;

import com.alightcreative.account.IAPItemType;
import com.alightcreative.account.LicenseStore;
import com.alightcreative.account.PurchasePeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class psW {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f70115O;
    private final String Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f70116n;
    private final PurchasePeriod nr;
    private final LicenseStore rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final IAPItemType f70117t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psW)) {
            return false;
        }
        psW psw = (psW) obj;
        return Intrinsics.areEqual(this.f70116n, psw.f70116n) && this.rl == psw.rl && this.f70117t == psw.f70117t && Intrinsics.areEqual(this.nr, psw.nr) && this.f70115O == psw.f70115O && Intrinsics.areEqual(this.J2, psw.J2) && Intrinsics.areEqual(this.Uo, psw.Uo);
    }

    public psW(String sku, LicenseStore store, IAPItemType itemType, PurchasePeriod period, long j2, String priceCurrencyCode, String price) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f70116n = sku;
        this.rl = store;
        this.f70117t = itemType;
        this.nr = period;
        this.f70115O = j2;
        this.J2 = priceCurrencyCode;
        this.Uo = price;
    }

    public final LicenseStore J2() {
        return this.rl;
    }

    public final String O() {
        return this.J2;
    }

    public int hashCode() {
        return (((((((((((this.f70116n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f70117t.hashCode()) * 31) + this.nr.hashCode()) * 31) + Long.hashCode(this.f70115O)) * 31) + this.J2.hashCode()) * 31) + this.Uo.hashCode();
    }

    public final IAPItemType n() {
        return this.f70117t;
    }

    public final long nr() {
        return this.f70115O;
    }

    public final PurchasePeriod rl() {
        return this.nr;
    }

    public final String t() {
        return this.Uo;
    }

    public String toString() {
        return "PastPurchase(sku=" + this.f70116n + ", store=" + this.rl + ", itemType=" + this.f70117t + ", period=" + this.nr + ", priceAmountMicros=" + this.f70115O + ", priceCurrencyCode=" + this.J2 + ", price=" + this.Uo + ")";
    }
}
