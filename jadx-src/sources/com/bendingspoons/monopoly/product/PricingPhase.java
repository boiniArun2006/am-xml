package com.bendingspoons.monopoly.product;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.Wre;
import com.bendingspoons.monopoly.Period;
import com.bendingspoons.monopoly.product.PricingPhase;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import fE.fuX;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;
import x0X.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001*B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0003\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b&\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015¨\u0006+"}, d2 = {"Lcom/bendingspoons/monopoly/product/PricingPhase;", "", "Lcom/bendingspoons/monopoly/Period;", "period", "", "formattedPrice", "", "priceAmountMicros", "priceCurrencyCode", "Lcom/bendingspoons/monopoly/product/RecurrenceMode;", "recurrenceMode", "<init>", "(Lcom/bendingspoons/monopoly/Period;Ljava/lang/String;JLjava/lang/String;Lcom/bendingspoons/monopoly/product/RecurrenceMode;)V", "component1", "()Lcom/bendingspoons/monopoly/Period;", "component2", "()Ljava/lang/String;", "component3", "()J", "component4", "component5", "()Lcom/bendingspoons/monopoly/product/RecurrenceMode;", "copy", "(Lcom/bendingspoons/monopoly/Period;Ljava/lang/String;JLjava/lang/String;Lcom/bendingspoons/monopoly/product/RecurrenceMode;)Lcom/bendingspoons/monopoly/product/PricingPhase;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/bendingspoons/monopoly/Period;", "getPeriod", "Ljava/lang/String;", "getFormattedPrice", "J", "getPriceAmountMicros", "getPriceCurrencyCode", "Lcom/bendingspoons/monopoly/product/RecurrenceMode;", "getRecurrenceMode", "Companion", "j", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PricingPhase {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String formattedPrice;
    private final Period period;
    private final long priceAmountMicros;
    private final String priceCurrencyCode;
    private final RecurrenceMode recurrenceMode;

    /* JADX INFO: renamed from: com.bendingspoons.monopoly.product.PricingPhase$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PricingPhase rl(Wre.w6 w6Var) {
            String strRl = w6Var.rl();
            Intrinsics.checkNotNullExpressionValue(strRl, "getBillingPeriod(...)");
            Period periodRl = fuX.rl(strRl);
            Intrinsics.checkNotNull(periodRl);
            String strT = w6Var.t();
            Intrinsics.checkNotNullExpressionValue(strT, "getFormattedPrice(...)");
            long jNr = w6Var.nr();
            String strO = w6Var.O();
            Intrinsics.checkNotNullExpressionValue(strO, "getPriceCurrencyCode(...)");
            return new PricingPhase(periodRl, strT, jNr, strO, RecurrenceMode.Companion.n(w6Var));
        }

        public final n t(final Wre.w6 pricingPhase) {
            Intrinsics.checkNotNullParameter(pricingPhase, "pricingPhase");
            return w6.n(new Function0() { // from class: KNH.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PricingPhase.Companion.rl(pricingPhase);
                }
            });
        }
    }

    public static /* synthetic */ PricingPhase copy$default(PricingPhase pricingPhase, Period period, String str, long j2, String str2, RecurrenceMode recurrenceMode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            period = pricingPhase.period;
        }
        if ((i2 & 2) != 0) {
            str = pricingPhase.formattedPrice;
        }
        if ((i2 & 4) != 0) {
            j2 = pricingPhase.priceAmountMicros;
        }
        if ((i2 & 8) != 0) {
            str2 = pricingPhase.priceCurrencyCode;
        }
        if ((i2 & 16) != 0) {
            recurrenceMode = pricingPhase.recurrenceMode;
        }
        long j3 = j2;
        return pricingPhase.copy(period, str, j3, str2, recurrenceMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Period getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final RecurrenceMode getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public final PricingPhase copy(@Json(name = "period") Period period, @Json(name = "formatted_price") String formattedPrice, @Json(name = "price_amount_micros") long priceAmountMicros, @Json(name = "price_currency_code") String priceCurrencyCode, @Json(name = "recurrence_mode") RecurrenceMode recurrenceMode) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(recurrenceMode, "recurrenceMode");
        return new PricingPhase(period, formattedPrice, priceAmountMicros, priceCurrencyCode, recurrenceMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PricingPhase)) {
            return false;
        }
        PricingPhase pricingPhase = (PricingPhase) other;
        return Intrinsics.areEqual(this.period, pricingPhase.period) && Intrinsics.areEqual(this.formattedPrice, pricingPhase.formattedPrice) && this.priceAmountMicros == pricingPhase.priceAmountMicros && Intrinsics.areEqual(this.priceCurrencyCode, pricingPhase.priceCurrencyCode) && Intrinsics.areEqual(this.recurrenceMode, pricingPhase.recurrenceMode);
    }

    public int hashCode() {
        return (((((((this.period.hashCode() * 31) + this.formattedPrice.hashCode()) * 31) + Long.hashCode(this.priceAmountMicros)) * 31) + this.priceCurrencyCode.hashCode()) * 31) + this.recurrenceMode.hashCode();
    }

    public String toString() {
        return "PricingPhase(period=" + this.period + ", formattedPrice=" + this.formattedPrice + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ", recurrenceMode=" + this.recurrenceMode + ")";
    }

    public PricingPhase(@Json(name = "period") Period period, @Json(name = "formatted_price") String formattedPrice, @Json(name = "price_amount_micros") long j2, @Json(name = "price_currency_code") String priceCurrencyCode, @Json(name = "recurrence_mode") RecurrenceMode recurrenceMode) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(recurrenceMode, "recurrenceMode");
        this.period = period;
        this.formattedPrice = formattedPrice;
        this.priceAmountMicros = j2;
        this.priceCurrencyCode = priceCurrencyCode;
        this.recurrenceMode = recurrenceMode;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
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

    public final RecurrenceMode getRecurrenceMode() {
        return this.recurrenceMode;
    }
}
