package com.alightcreative.account;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Set;
import kgE.K;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%Jv\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b7\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010#R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010%¨\u0006>"}, d2 = {"Lcom/alightcreative/account/LicenseInfo;", "", "", "valid", "Lcom/alightcreative/account/LicenseType;", "type", "Lcom/alightcreative/account/LicenseStore;", "store", "", "productId", "autoRenewing", "orderNumber", "Lcom/alightcreative/account/PurchasePeriod;", "period", "", "expires", "", "LkgE/K;", "benefits", "<init>", "(ZLcom/alightcreative/account/LicenseType;Lcom/alightcreative/account/LicenseStore;Ljava/lang/String;ZLjava/lang/String;Lcom/alightcreative/account/PurchasePeriod;Ljava/lang/Long;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "component1", "()Z", "component2", "()Lcom/alightcreative/account/LicenseType;", "component3", "()Lcom/alightcreative/account/LicenseStore;", "component4", "component5", "component6", "component7", "()Lcom/alightcreative/account/PurchasePeriod;", "component8", "()Ljava/lang/Long;", "component9", "()Ljava/util/Set;", "copy", "(ZLcom/alightcreative/account/LicenseType;Lcom/alightcreative/account/LicenseStore;Ljava/lang/String;ZLjava/lang/String;Lcom/alightcreative/account/PurchasePeriod;Ljava/lang/Long;Ljava/util/Set;)Lcom/alightcreative/account/LicenseInfo;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getValid", "Lcom/alightcreative/account/LicenseType;", "getType", "Lcom/alightcreative/account/LicenseStore;", "getStore", "Ljava/lang/String;", "getProductId", "getAutoRenewing", "getOrderNumber", "Lcom/alightcreative/account/PurchasePeriod;", "getPeriod", "Ljava/lang/Long;", "getExpires", "Ljava/util/Set;", "getBenefits", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LicenseInfo {
    public static final int $stable = 8;
    private final boolean autoRenewing;
    private final Set<K> benefits;
    private final Long expires;
    private final String orderNumber;
    private final PurchasePeriod period;
    private final String productId;
    private final LicenseStore store;
    private final LicenseType type;
    private final boolean valid;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LicenseInfo copy$default(LicenseInfo licenseInfo, boolean z2, LicenseType licenseType, LicenseStore licenseStore, String str, boolean z3, String str2, PurchasePeriod purchasePeriod, Long l2, Set set, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = licenseInfo.valid;
        }
        if ((i2 & 2) != 0) {
            licenseType = licenseInfo.type;
        }
        if ((i2 & 4) != 0) {
            licenseStore = licenseInfo.store;
        }
        if ((i2 & 8) != 0) {
            str = licenseInfo.productId;
        }
        if ((i2 & 16) != 0) {
            z3 = licenseInfo.autoRenewing;
        }
        if ((i2 & 32) != 0) {
            str2 = licenseInfo.orderNumber;
        }
        if ((i2 & 64) != 0) {
            purchasePeriod = licenseInfo.period;
        }
        if ((i2 & 128) != 0) {
            l2 = licenseInfo.expires;
        }
        if ((i2 & 256) != 0) {
            set = licenseInfo.benefits;
        }
        Long l5 = l2;
        Set set2 = set;
        String str3 = str2;
        PurchasePeriod purchasePeriod2 = purchasePeriod;
        boolean z4 = z3;
        LicenseStore licenseStore2 = licenseStore;
        return licenseInfo.copy(z2, licenseType, licenseStore2, str, z4, str3, purchasePeriod2, l5, set2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getValid() {
        return this.valid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LicenseType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LicenseStore getStore() {
        return this.store;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOrderNumber() {
        return this.orderNumber;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PurchasePeriod getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getExpires() {
        return this.expires;
    }

    public final Set<K> component9() {
        return this.benefits;
    }

    public final LicenseInfo copy(boolean valid, LicenseType type, LicenseStore store, String productId, boolean autoRenewing, String orderNumber, PurchasePeriod period, Long expires, Set<? extends K> benefits) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        return new LicenseInfo(valid, type, store, productId, autoRenewing, orderNumber, period, expires, benefits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LicenseInfo)) {
            return false;
        }
        LicenseInfo licenseInfo = (LicenseInfo) other;
        return this.valid == licenseInfo.valid && this.type == licenseInfo.type && this.store == licenseInfo.store && Intrinsics.areEqual(this.productId, licenseInfo.productId) && this.autoRenewing == licenseInfo.autoRenewing && Intrinsics.areEqual(this.orderNumber, licenseInfo.orderNumber) && Intrinsics.areEqual(this.period, licenseInfo.period) && Intrinsics.areEqual(this.expires, licenseInfo.expires) && Intrinsics.areEqual(this.benefits, licenseInfo.benefits);
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.valid) * 31) + this.type.hashCode()) * 31) + this.store.hashCode()) * 31) + this.productId.hashCode()) * 31) + Boolean.hashCode(this.autoRenewing)) * 31;
        String str = this.orderNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PurchasePeriod purchasePeriod = this.period;
        int iHashCode3 = (iHashCode2 + (purchasePeriod == null ? 0 : purchasePeriod.hashCode())) * 31;
        Long l2 = this.expires;
        return ((iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31) + this.benefits.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LicenseInfo(boolean z2, LicenseType type, LicenseStore store, String productId, boolean z3, String str, PurchasePeriod purchasePeriod, Long l2, Set<? extends K> benefits) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.valid = z2;
        this.type = type;
        this.store = store;
        this.productId = productId;
        this.autoRenewing = z3;
        this.orderNumber = str;
        this.period = purchasePeriod;
        this.expires = l2;
        this.benefits = benefits;
    }

    public final boolean getAutoRenewing() {
        return this.autoRenewing;
    }

    public final Set<K> getBenefits() {
        return this.benefits;
    }

    public final Long getExpires() {
        return this.expires;
    }

    public final String getOrderNumber() {
        return this.orderNumber;
    }

    public final PurchasePeriod getPeriod() {
        return this.period;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final LicenseStore getStore() {
        return this.store;
    }

    public final LicenseType getType() {
        return this.type;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public String toString() {
        return "[LicenseInfo: " + (this.valid ? "VALID" : "NOT-VALID") + " " + this.store.name() + "/" + this.type.name() + " pid=" + this.productId + " " + (this.autoRenewing ? "AUTO-RENEW" : "SINGLE") + " period=" + this.period + " expire=" + this.expires + " benefits=" + CollectionsKt.joinToString$default(this.benefits, "/", null, null, 0, null, null, 62, null) + "]";
    }
}
