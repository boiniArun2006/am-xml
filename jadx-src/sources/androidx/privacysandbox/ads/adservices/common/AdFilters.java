package androidx.privacysandbox.ads.adservices.common;

import android.adservices.common.AdFilters;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdFilters;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/adservices/common/AdFilters;", c.f62177j, "()Landroid/adservices/common/AdFilters;", "Landroidx/privacysandbox/ads/adservices/common/FrequencyCapFilters;", "Landroidx/privacysandbox/ads/adservices/common/FrequencyCapFilters;", "getFrequencyCapFilters", "()Landroidx/privacysandbox/ads/adservices/common/FrequencyCapFilters;", "frequencyCapFilters", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalFeatures.Ext8OptIn
public final class AdFilters {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final FrequencyCapFilters frequencyCapFilters;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AdFilters) {
            return Intrinsics.areEqual(this.frequencyCapFilters, ((AdFilters) other).frequencyCapFilters);
        }
        return false;
    }

    public int hashCode() {
        FrequencyCapFilters frequencyCapFilters = this.frequencyCapFilters;
        if (frequencyCapFilters != null) {
            return frequencyCapFilters.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AdFilters: frequencyCapFilters=" + this.frequencyCapFilters;
    }

    public final android.adservices.common.AdFilters n() {
        android.adservices.common.FrequencyCapFilters frequencyCapFiltersRl;
        AdFilters.Builder builderN = fuX.n();
        FrequencyCapFilters frequencyCapFilters = this.frequencyCapFilters;
        if (frequencyCapFilters != null) {
            frequencyCapFiltersRl = frequencyCapFilters.rl();
        } else {
            frequencyCapFiltersRl = null;
        }
        android.adservices.common.AdFilters adFiltersBuild = builderN.setFrequencyCapFilters(frequencyCapFiltersRl).build();
        Intrinsics.checkNotNullExpressionValue(adFiltersBuild, "Builder()\n            .s…s())\n            .build()");
        return adFiltersBuild;
    }
}
