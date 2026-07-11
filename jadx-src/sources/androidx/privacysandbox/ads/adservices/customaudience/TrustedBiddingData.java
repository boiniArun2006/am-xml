package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/net/Uri;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroid/net/Uri;", "rl", "()Landroid/net/Uri;", "trustedBiddingUri", "", "Ljava/util/List;", "()Ljava/util/List;", "trustedBiddingKeys", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TrustedBiddingData {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Uri trustedBiddingUri;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final List trustedBiddingKeys;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustedBiddingData)) {
            return false;
        }
        TrustedBiddingData trustedBiddingData = (TrustedBiddingData) other;
        return Intrinsics.areEqual(this.trustedBiddingUri, trustedBiddingData.trustedBiddingUri) && Intrinsics.areEqual(this.trustedBiddingKeys, trustedBiddingData.trustedBiddingKeys);
    }

    public int hashCode() {
        return (this.trustedBiddingUri.hashCode() * 31) + this.trustedBiddingKeys.hashCode();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final List getTrustedBiddingKeys() {
        return this.trustedBiddingKeys;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final Uri getTrustedBiddingUri() {
        return this.trustedBiddingUri;
    }

    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.trustedBiddingUri + " trustedBiddingKeys=" + this.trustedBiddingKeys;
    }
}
