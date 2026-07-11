package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.l;
import j$.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00012J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0012\u0010 R\u0019\u0010&\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\r\u0010%R\u0019\u0010'\u001a\u0004\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010-\u001a\u0004\u0018\u00010(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u00101\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b)\u00100¨\u00063"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "nr", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "buyer", "rl", "Ljava/lang/String;", "Uo", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroid/net/Uri;", "t", "Landroid/net/Uri;", "O", "()Landroid/net/Uri;", "dailyUpdateUri", "biddingLogicUri", "", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "Ljava/util/List;", "()Ljava/util/List;", l.f62638S, "j$/time/Instant", "J2", "Lj$/time/Instant;", "()Lj$/time/Instant;", "activationTime", "expirationTime", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "KN", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "xMQ", "()Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "userBiddingSignals", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "()Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "trustedBiddingSignals", "Builder", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomAudience {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata and from toString */
    private final Instant activationTime;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata and from toString */
    private final AdSelectionSignals userBiddingSignals;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final List ads;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata and from toString */
    private final Instant expirationTime;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AdTechIdentifier buyer;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final Uri biddingLogicUri;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final Uri dailyUpdateUri;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata and from toString */
    private final TrustedBiddingData trustedBiddingSignals;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCustomAudience.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomAudience.kt\nandroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
    public static final class Builder {
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomAudience)) {
            return false;
        }
        CustomAudience customAudience = (CustomAudience) other;
        return Intrinsics.areEqual(this.buyer, customAudience.buyer) && Intrinsics.areEqual(this.name, customAudience.name) && Intrinsics.areEqual(this.activationTime, customAudience.activationTime) && Intrinsics.areEqual(this.expirationTime, customAudience.expirationTime) && Intrinsics.areEqual(this.dailyUpdateUri, customAudience.dailyUpdateUri) && Intrinsics.areEqual(this.userBiddingSignals, customAudience.userBiddingSignals) && Intrinsics.areEqual(this.trustedBiddingSignals, customAudience.trustedBiddingSignals) && Intrinsics.areEqual(this.ads, customAudience.ads);
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final Instant getExpirationTime() {
        return this.expirationTime;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final TrustedBiddingData getTrustedBiddingSignals() {
        return this.trustedBiddingSignals;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Uri getDailyUpdateUri() {
        return this.dailyUpdateUri;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((this.buyer.hashCode() * 31) + this.name.hashCode()) * 31;
        Instant instant = this.activationTime;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.expirationTime;
        int iHashCode3 = (((iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 31) + this.dailyUpdateUri.hashCode()) * 31;
        AdSelectionSignals adSelectionSignals = this.userBiddingSignals;
        int iHashCode4 = (iHashCode3 + (adSelectionSignals != null ? adSelectionSignals.hashCode() : 0)) * 31;
        TrustedBiddingData trustedBiddingData = this.trustedBiddingSignals;
        return ((((iHashCode4 + (trustedBiddingData != null ? trustedBiddingData.hashCode() : 0)) * 31) + this.biddingLogicUri.hashCode()) * 31) + this.ads.hashCode();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Instant getActivationTime() {
        return this.activationTime;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final List getAds() {
        return this.ads;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Uri getBiddingLogicUri() {
        return this.biddingLogicUri;
    }

    public String toString() {
        return "CustomAudience: buyer=" + this.biddingLogicUri + ", name=" + this.name + ", activationTime=" + this.activationTime + ", expirationTime=" + this.expirationTime + ", dailyUpdateUri=" + this.dailyUpdateUri + ", userBiddingSignals=" + this.userBiddingSignals + ", trustedBiddingSignals=" + this.trustedBiddingSignals + ", biddingLogicUri=" + this.biddingLogicUri + ", ads=" + this.ads;
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final AdSelectionSignals getUserBiddingSignals() {
        return this.userBiddingSignals;
    }
}
