package com.bendingspoons.monopoly.product;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.Wre;
import com.bendingspoons.monopoly.product.Offer;
import com.bendingspoons.monopoly.product.PricingPhase;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;
import x0X.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001(BO\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012JX\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00022\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010\u0012¨\u0006)"}, d2 = {"Lcom/bendingspoons/monopoly/product/Offer;", "", "", "productId", "basePlanId", "offerId", "", "offerTags", "offerToken", "Lcom/bendingspoons/monopoly/product/PricingPhase;", "pricingPhases", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lcom/bendingspoons/monopoly/product/Offer;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getBasePlanId", "getOfferId", "Ljava/util/List;", "getOfferTags", "getOfferToken", "getPricingPhases", "Companion", "j", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Offer {
    private final String basePlanId;
    private final String offerId;
    private final List<String> offerTags;
    private final String offerToken;
    private final List<PricingPhase> pricingPhases;
    private final String productId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.bendingspoons.monopoly.product.Offer$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final n t(final Wre.I28 offerDetails, final String productId) {
            Intrinsics.checkNotNullParameter(offerDetails, "offerDetails");
            Intrinsics.checkNotNullParameter(productId, "productId");
            return w6.n(new Function0() { // from class: KNH.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Offer.Companion.rl(offerDetails, productId);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Offer rl(Wre.I28 i28, String str) {
            String strRl = i28.rl();
            if (strRl != null) {
                List listN = i28.O().n();
                Intrinsics.checkNotNullExpressionValue(listN, "getPricingPhaseList(...)");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listN, 10));
                int i2 = 0;
                for (Object obj : listN) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Wre.w6 w6Var = (Wre.w6) obj;
                    PricingPhase.Companion jVar = PricingPhase.INSTANCE;
                    Intrinsics.checkNotNull(w6Var);
                    n nVarT = jVar.t(w6Var);
                    if (!(nVarT instanceof n.C1266n)) {
                        if (nVarT instanceof n.w6) {
                            arrayList.add((PricingPhase) ((n.w6) nVarT).n());
                            i2 = i3;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        throw new IllegalArgumentException("Failed to convert pricing phase at index " + i2 + ".", (Throwable) ((n.C1266n) nVarT).n());
                    }
                }
                String strN = i28.n();
                Intrinsics.checkNotNullExpressionValue(strN, "getBasePlanId(...)");
                List listT = i28.t();
                Intrinsics.checkNotNullExpressionValue(listT, "getOfferTags(...)");
                String strNr = i28.nr();
                Intrinsics.checkNotNullExpressionValue(strNr, "getOfferToken(...)");
                return new Offer(str, strN, strRl, listT, strNr, arrayList);
            }
            throw new IllegalArgumentException("offerDetails.offerId must not be null");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Offer copy$default(Offer offer, String str, String str2, String str3, List list, String str4, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = offer.productId;
        }
        if ((i2 & 2) != 0) {
            str2 = offer.basePlanId;
        }
        if ((i2 & 4) != 0) {
            str3 = offer.offerId;
        }
        if ((i2 & 8) != 0) {
            list = offer.offerTags;
        }
        if ((i2 & 16) != 0) {
            str4 = offer.offerToken;
        }
        if ((i2 & 32) != 0) {
            list2 = offer.pricingPhases;
        }
        String str5 = str4;
        List list3 = list2;
        return offer.copy(str, str2, str3, list, str5, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    public final List<String> component4() {
        return this.offerTags;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    public final List<PricingPhase> component6() {
        return this.pricingPhases;
    }

    public final Offer copy(@Json(name = "product_id") String productId, @Json(name = "base_plan_id") String basePlanId, @Json(name = "offer_id") String offerId, @Json(name = "offer_tags") List<String> offerTags, @Json(name = "offer_token") String offerToken, @Json(name = "pricing_phases") List<PricingPhase> pricingPhases) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(pricingPhases, "pricingPhases");
        return new Offer(productId, basePlanId, offerId, offerTags, offerToken, pricingPhases);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) other;
        return Intrinsics.areEqual(this.productId, offer.productId) && Intrinsics.areEqual(this.basePlanId, offer.basePlanId) && Intrinsics.areEqual(this.offerId, offer.offerId) && Intrinsics.areEqual(this.offerTags, offer.offerTags) && Intrinsics.areEqual(this.offerToken, offer.offerToken) && Intrinsics.areEqual(this.pricingPhases, offer.pricingPhases);
    }

    public int hashCode() {
        return (((((((((this.productId.hashCode() * 31) + this.basePlanId.hashCode()) * 31) + this.offerId.hashCode()) * 31) + this.offerTags.hashCode()) * 31) + this.offerToken.hashCode()) * 31) + this.pricingPhases.hashCode();
    }

    public String toString() {
        return "Offer(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", offerTags=" + this.offerTags + ", offerToken=" + this.offerToken + ", pricingPhases=" + this.pricingPhases + ")";
    }

    public Offer(@Json(name = "product_id") String productId, @Json(name = "base_plan_id") String basePlanId, @Json(name = "offer_id") String offerId, @Json(name = "offer_tags") List<String> offerTags, @Json(name = "offer_token") String offerToken, @Json(name = "pricing_phases") List<PricingPhase> pricingPhases) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(offerTags, "offerTags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(pricingPhases, "pricingPhases");
        this.productId = productId;
        this.basePlanId = basePlanId;
        this.offerId = offerId;
        this.offerTags = offerTags;
        this.offerToken = offerToken;
        this.pricingPhases = pricingPhases;
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final List<String> getOfferTags() {
        return this.offerTags;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final String getProductId() {
        return this.productId;
    }
}
