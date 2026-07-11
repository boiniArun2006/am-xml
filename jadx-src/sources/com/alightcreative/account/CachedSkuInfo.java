package com.alightcreative.account;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/alightcreative/account/CachedSkuInfo;", "", "skus", "", "Lcom/alightcreative/account/SKUInfo;", "<init>", "(Ljava/util/List;)V", "getSkus", "()Ljava/util/List;", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CachedSkuInfo {
    public static final int $stable = 8;
    private final List<SKUInfo> skus;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CachedSkuInfo copy$default(CachedSkuInfo cachedSkuInfo, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = cachedSkuInfo.skus;
        }
        return cachedSkuInfo.copy(list);
    }

    public final List<SKUInfo> component1() {
        return this.skus;
    }

    public final CachedSkuInfo copy(List<SKUInfo> skus) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        return new CachedSkuInfo(skus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CachedSkuInfo) && Intrinsics.areEqual(this.skus, ((CachedSkuInfo) other).skus);
    }

    public int hashCode() {
        return this.skus.hashCode();
    }

    public String toString() {
        return "CachedSkuInfo(skus=" + this.skus + ")";
    }

    public CachedSkuInfo(List<SKUInfo> skus) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        this.skus = skus;
    }

    public final List<SKUInfo> getSkus() {
        return this.skus;
    }
}
