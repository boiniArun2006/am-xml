package androidx.privacysandbox.ads.adservices.customaudience;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "()Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "customAudience", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JoinCustomAudienceRequest {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CustomAudience customAudience;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof JoinCustomAudienceRequest) {
            return Intrinsics.areEqual(this.customAudience, ((JoinCustomAudienceRequest) other).customAudience);
        }
        return false;
    }

    public int hashCode() {
        return this.customAudience.hashCode();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final CustomAudience getCustomAudience() {
        return this.customAudience;
    }

    public String toString() {
        return "JoinCustomAudience: customAudience=" + this.customAudience;
    }
}
