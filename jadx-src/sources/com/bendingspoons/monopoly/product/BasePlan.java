package com.bendingspoons.monopoly.product;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.Wre;
import com.bendingspoons.monopoly.Period;
import com.bendingspoons.monopoly.product.BasePlan;
import com.bendingspoons.monopoly.product.RecurrenceMode;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import x0X.n;
import x0X.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u001e\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0001FBw\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0080\u0001\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\f2\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0018J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b8\u0010\u0018R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b\r\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010$R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b<\u0010\u001bR\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058F¢\u0006\u0006\u001a\u0004\b=\u0010\u001bR\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058F¢\u0006\u0006\u001a\u0004\b?\u0010\u001bR\u0011\u0010B\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bA\u0010\"R\u0011\u0010D\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bC\u0010\"¨\u0006G"}, d2 = {"Lcom/bendingspoons/monopoly/product/BasePlan;", "", "", "productId", "basePlanId", "", "tags", "offerToken", "", "priceAmountMicros", "priceCurrencyCode", "formattedPrice", "", "isAutoRenewing", "Lcom/bendingspoons/monopoly/Period;", "period", "Lcom/bendingspoons/monopoly/product/Offer;", "offers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLcom/bendingspoons/monopoly/Period;Ljava/util/List;)V", "offerId", "getOffer", "(Ljava/lang/String;)Lcom/bendingspoons/monopoly/product/Offer;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()J", "component6", "component7", "component8", "()Z", "component9", "()Lcom/bendingspoons/monopoly/Period;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLcom/bendingspoons/monopoly/Period;Ljava/util/List;)Lcom/bendingspoons/monopoly/product/BasePlan;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getBasePlanId", "Ljava/util/List;", "getTags", "getOfferToken", "J", "getPriceAmountMicros", "getPriceCurrencyCode", "getFormattedPrice", "Z", "Lcom/bendingspoons/monopoly/Period;", "getPeriod", "getOffers", "getFreeTrialOffers", "freeTrialOffers", "getIntroPriceOffers", "introPriceOffers", "getHasFreeTrial", "hasFreeTrial", "getHasIntroPrice", "hasIntroPrice", "Companion", "j", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBasePlan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasePlan.kt\ncom/bendingspoons/monopoly/product/BasePlan\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n774#2:115\n865#2,2:116\n774#2:118\n865#2,2:119\n1#3:121\n*S KotlinDebug\n*F\n+ 1 BasePlan.kt\ncom/bendingspoons/monopoly/product/BasePlan\n*L\n57#1:115\n57#1:116,2\n61#1:118\n61#1:119,2\n*E\n"})
public final /* data */ class BasePlan {
    private final String basePlanId;
    private final String formattedPrice;
    private final boolean isAutoRenewing;
    private final String offerToken;
    private final List<Offer> offers;
    private final Period period;
    private final long priceAmountMicros;
    private final String priceCurrencyCode;
    private final String productId;
    private final List<String> tags;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.bendingspoons.monopoly.product.BasePlan$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final n t(final Wre.I28 basePlan, final String productId, final List offers) {
            Intrinsics.checkNotNullParameter(basePlan, "basePlan");
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(offers, "offers");
            return w6.n(new Function0() { // from class: KNH.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BasePlan.Companion.rl(basePlan, productId, offers);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BasePlan rl(Wre.I28 i28, String str, List list) {
            if (i28.rl() == null) {
                List listN = i28.O().n();
                Intrinsics.checkNotNullExpressionValue(listN, "getPricingPhaseList(...)");
                Wre.w6 w6Var = (Wre.w6) CollectionsKt.firstOrNull(listN);
                if (w6Var != null) {
                    n nVarT = PricingPhase.INSTANCE.t(w6Var);
                    if (!(nVarT instanceof n.C1266n)) {
                        if (nVarT instanceof n.w6) {
                            PricingPhase pricingPhase = (PricingPhase) ((n.w6) nVarT).n();
                            if (pricingPhase != null) {
                                String strN = i28.n();
                                Intrinsics.checkNotNullExpressionValue(strN, "getBasePlanId(...)");
                                List listT = i28.t();
                                Intrinsics.checkNotNullExpressionValue(listT, "getOfferTags(...)");
                                String strNr = i28.nr();
                                Intrinsics.checkNotNullExpressionValue(strNr, "getOfferToken(...)");
                                return new BasePlan(str, strN, listT, strNr, pricingPhase.getPriceAmountMicros(), pricingPhase.getPriceCurrencyCode(), pricingPhase.getFormattedPrice(), Intrinsics.areEqual(pricingPhase.getRecurrenceMode(), new RecurrenceMode.InfiniteRecurring()), pricingPhase.getPeriod(), list);
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        throw new IllegalArgumentException("Failed to convert base plan pricing phase to PricingPhase.", (Throwable) ((n.C1266n) nVarT).n());
                    }
                }
                throw new IllegalArgumentException("basePlan must have at least one pricing phase");
            }
            throw new IllegalArgumentException("basePlan has non-null offer ID, and therefore does not represent a base plan");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasePlan copy$default(BasePlan basePlan, String str, String str2, List list, String str3, long j2, String str4, String str5, boolean z2, Period period, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = basePlan.productId;
        }
        if ((i2 & 2) != 0) {
            str2 = basePlan.basePlanId;
        }
        if ((i2 & 4) != 0) {
            list = basePlan.tags;
        }
        if ((i2 & 8) != 0) {
            str3 = basePlan.offerToken;
        }
        if ((i2 & 16) != 0) {
            j2 = basePlan.priceAmountMicros;
        }
        if ((i2 & 32) != 0) {
            str4 = basePlan.priceCurrencyCode;
        }
        if ((i2 & 64) != 0) {
            str5 = basePlan.formattedPrice;
        }
        if ((i2 & 128) != 0) {
            z2 = basePlan.isAutoRenewing;
        }
        if ((i2 & 256) != 0) {
            period = basePlan.period;
        }
        if ((i2 & 512) != 0) {
            list2 = basePlan.offers;
        }
        List list3 = list2;
        boolean z3 = z2;
        String str6 = str4;
        long j3 = j2;
        List list4 = list;
        String str7 = str3;
        return basePlan.copy(str, str2, list4, str7, j3, str6, str5, z3, period, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final List<Offer> component10() {
        return this.offers;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final List<String> component3() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsAutoRenewing() {
        return this.isAutoRenewing;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Period getPeriod() {
        return this.period;
    }

    public final BasePlan copy(@Json(name = "product_id") String productId, @Json(name = "base_plan_id") String basePlanId, @Json(name = "tags") List<String> tags, @Json(name = "offer_token") String offerToken, @Json(name = "price_amount_micros") long priceAmountMicros, @Json(name = "price_currency_code") String priceCurrencyCode, @Json(name = "formatted_price") String formattedPrice, @Json(name = "is_auto_renewing") boolean isAutoRenewing, @Json(name = "period") Period period, @Json(name = "offers") List<Offer> offers) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(offers, "offers");
        return new BasePlan(productId, basePlanId, tags, offerToken, priceAmountMicros, priceCurrencyCode, formattedPrice, isAutoRenewing, period, offers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasePlan)) {
            return false;
        }
        BasePlan basePlan = (BasePlan) other;
        return Intrinsics.areEqual(this.productId, basePlan.productId) && Intrinsics.areEqual(this.basePlanId, basePlan.basePlanId) && Intrinsics.areEqual(this.tags, basePlan.tags) && Intrinsics.areEqual(this.offerToken, basePlan.offerToken) && this.priceAmountMicros == basePlan.priceAmountMicros && Intrinsics.areEqual(this.priceCurrencyCode, basePlan.priceCurrencyCode) && Intrinsics.areEqual(this.formattedPrice, basePlan.formattedPrice) && this.isAutoRenewing == basePlan.isAutoRenewing && Intrinsics.areEqual(this.period, basePlan.period) && Intrinsics.areEqual(this.offers, basePlan.offers);
    }

    public int hashCode() {
        return (((((((((((((((((this.productId.hashCode() * 31) + this.basePlanId.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.offerToken.hashCode()) * 31) + Long.hashCode(this.priceAmountMicros)) * 31) + this.priceCurrencyCode.hashCode()) * 31) + this.formattedPrice.hashCode()) * 31) + Boolean.hashCode(this.isAutoRenewing)) * 31) + this.period.hashCode()) * 31) + this.offers.hashCode();
    }

    public String toString() {
        return "BasePlan(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", tags=" + this.tags + ", offerToken=" + this.offerToken + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ", formattedPrice=" + this.formattedPrice + ", isAutoRenewing=" + this.isAutoRenewing + ", period=" + this.period + ", offers=" + this.offers + ")";
    }

    public BasePlan(@Json(name = "product_id") String productId, @Json(name = "base_plan_id") String basePlanId, @Json(name = "tags") List<String> tags, @Json(name = "offer_token") String offerToken, @Json(name = "price_amount_micros") long j2, @Json(name = "price_currency_code") String priceCurrencyCode, @Json(name = "formatted_price") String formattedPrice, @Json(name = "is_auto_renewing") boolean z2, @Json(name = "period") Period period, @Json(name = "offers") List<Offer> offers) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(basePlanId, "basePlanId");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(offerToken, "offerToken");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(offers, "offers");
        this.productId = productId;
        this.basePlanId = basePlanId;
        this.tags = tags;
        this.offerToken = offerToken;
        this.priceAmountMicros = j2;
        this.priceCurrencyCode = priceCurrencyCode;
        this.formattedPrice = formattedPrice;
        this.isAutoRenewing = z2;
        this.period = period;
        this.offers = offers;
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final List<Offer> getFreeTrialOffers() {
        List<Offer> list = this.offers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (KNH.w6.rl((Offer) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Offer> getIntroPriceOffers() {
        List<Offer> list = this.offers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (KNH.w6.t((Offer) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Offer getOffer(String offerId) {
        Object next;
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Iterator<T> it = this.offers.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Offer) next).getOfferId(), offerId)) {
                break;
            }
        }
        return (Offer) next;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final List<Offer> getOffers() {
        return this.offers;
    }

    public final Period getPeriod() {
        return this.period;
    }

    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final boolean isAutoRenewing() {
        return this.isAutoRenewing;
    }

    public final boolean getHasFreeTrial() {
        return !getFreeTrialOffers().isEmpty();
    }

    public final boolean getHasIntroPrice() {
        return !getIntroPriceOffers().isEmpty();
    }
}
