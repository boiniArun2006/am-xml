package com.alightcreative.account;

import androidx.compose.runtime.internal.StabilityInferred;
import com.applovin.sdk.AppLovinEventParameters;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Set;
import kgE.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0018¨\u0006-"}, d2 = {"Lcom/alightcreative/account/SKUInfo;", "", "Lcom/alightcreative/account/IAPItemType;", "type", "Lcom/alightcreative/account/PurchasePeriod;", "period", "", AppLovinEventParameters.PRODUCT_IDENTIFIER, "", "expires", "", "LkgE/K;", "benefits", "<init>", "(Lcom/alightcreative/account/IAPItemType;Lcom/alightcreative/account/PurchasePeriod;Ljava/lang/String;JLjava/util/Set;)V", "component1", "()Lcom/alightcreative/account/IAPItemType;", "component2", "()Lcom/alightcreative/account/PurchasePeriod;", "component3", "()Ljava/lang/String;", "component4", "()J", "component5", "()Ljava/util/Set;", "copy", "(Lcom/alightcreative/account/IAPItemType;Lcom/alightcreative/account/PurchasePeriod;Ljava/lang/String;JLjava/util/Set;)Lcom/alightcreative/account/SKUInfo;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/alightcreative/account/IAPItemType;", "getType", "Lcom/alightcreative/account/PurchasePeriod;", "getPeriod", "Ljava/lang/String;", "getSku", "J", "getExpires", "Ljava/util/Set;", "getBenefits", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SKUInfo {
    public static final int $stable = 8;
    private final Set<K> benefits;
    private final long expires;
    private final PurchasePeriod period;
    private final String sku;
    private final IAPItemType type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SKUInfo copy$default(SKUInfo sKUInfo, IAPItemType iAPItemType, PurchasePeriod purchasePeriod, String str, long j2, Set set, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iAPItemType = sKUInfo.type;
        }
        if ((i2 & 2) != 0) {
            purchasePeriod = sKUInfo.period;
        }
        if ((i2 & 4) != 0) {
            str = sKUInfo.sku;
        }
        if ((i2 & 8) != 0) {
            j2 = sKUInfo.expires;
        }
        if ((i2 & 16) != 0) {
            set = sKUInfo.benefits;
        }
        Set set2 = set;
        String str2 = str;
        return sKUInfo.copy(iAPItemType, purchasePeriod, str2, j2, set2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IAPItemType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PurchasePeriod getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getExpires() {
        return this.expires;
    }

    public final Set<K> component5() {
        return this.benefits;
    }

    public final SKUInfo copy(IAPItemType type, PurchasePeriod period, String sku, long expires, Set<? extends K> benefits) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        return new SKUInfo(type, period, sku, expires, benefits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SKUInfo)) {
            return false;
        }
        SKUInfo sKUInfo = (SKUInfo) other;
        return this.type == sKUInfo.type && Intrinsics.areEqual(this.period, sKUInfo.period) && Intrinsics.areEqual(this.sku, sKUInfo.sku) && this.expires == sKUInfo.expires && Intrinsics.areEqual(this.benefits, sKUInfo.benefits);
    }

    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.period.hashCode()) * 31) + this.sku.hashCode()) * 31) + Long.hashCode(this.expires)) * 31) + this.benefits.hashCode();
    }

    public String toString() {
        return "SKUInfo(type=" + this.type + ", period=" + this.period + ", sku=" + this.sku + ", expires=" + this.expires + ", benefits=" + this.benefits + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SKUInfo(IAPItemType type, PurchasePeriod period, String sku, long j2, Set<? extends K> benefits) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.type = type;
        this.period = period;
        this.sku = sku;
        this.expires = j2;
        this.benefits = benefits;
    }

    public final Set<K> getBenefits() {
        return this.benefits;
    }

    public final long getExpires() {
        return this.expires;
    }

    public final PurchasePeriod getPeriod() {
        return this.period;
    }

    public final String getSku() {
        return this.sku;
    }

    public final IAPItemType getType() {
        return this.type;
    }
}
