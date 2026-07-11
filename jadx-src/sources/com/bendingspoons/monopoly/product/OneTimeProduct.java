package com.bendingspoons.monopoly.product;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001*BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b'\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b(\u0010\u000e¨\u0006+"}, d2 = {"Lcom/bendingspoons/monopoly/product/OneTimeProduct;", "", "", "productId", AppMeasurementSdk.ConditionalUserProperty.NAME, "title", "description", "", "priceAmountMicros", "priceCurrencyCode", "formattedPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()J", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lcom/bendingspoons/monopoly/product/OneTimeProduct;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getName", "getTitle", "getDescription", "J", "getPriceAmountMicros", "getPriceCurrencyCode", "getFormattedPrice", "Companion", "j", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OneTimeProduct {
    public static final int $stable = 0;
    private final String description;
    private final String formattedPrice;
    private final String name;
    private final long priceAmountMicros;
    private final String priceCurrencyCode;
    private final String productId;
    private final String title;

    public static /* synthetic */ OneTimeProduct copy$default(OneTimeProduct oneTimeProduct, String str, String str2, String str3, String str4, long j2, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = oneTimeProduct.productId;
        }
        if ((i2 & 2) != 0) {
            str2 = oneTimeProduct.name;
        }
        if ((i2 & 4) != 0) {
            str3 = oneTimeProduct.title;
        }
        if ((i2 & 8) != 0) {
            str4 = oneTimeProduct.description;
        }
        if ((i2 & 16) != 0) {
            j2 = oneTimeProduct.priceAmountMicros;
        }
        if ((i2 & 32) != 0) {
            str5 = oneTimeProduct.priceCurrencyCode;
        }
        if ((i2 & 64) != 0) {
            str6 = oneTimeProduct.formattedPrice;
        }
        long j3 = j2;
        String str7 = str3;
        String str8 = str4;
        return oneTimeProduct.copy(str, str2, str7, str8, j3, str5, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
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

    public final OneTimeProduct copy(@Json(name = "product_id") String productId, @Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "price_amount_micros") long priceAmountMicros, @Json(name = "price_currency_code") String priceCurrencyCode, @Json(name = "formatted_price") String formattedPrice) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        return new OneTimeProduct(productId, name, title, description, priceAmountMicros, priceCurrencyCode, formattedPrice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneTimeProduct)) {
            return false;
        }
        OneTimeProduct oneTimeProduct = (OneTimeProduct) other;
        return Intrinsics.areEqual(this.productId, oneTimeProduct.productId) && Intrinsics.areEqual(this.name, oneTimeProduct.name) && Intrinsics.areEqual(this.title, oneTimeProduct.title) && Intrinsics.areEqual(this.description, oneTimeProduct.description) && this.priceAmountMicros == oneTimeProduct.priceAmountMicros && Intrinsics.areEqual(this.priceCurrencyCode, oneTimeProduct.priceCurrencyCode) && Intrinsics.areEqual(this.formattedPrice, oneTimeProduct.formattedPrice);
    }

    public int hashCode() {
        return (((((((((((this.productId.hashCode() * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Long.hashCode(this.priceAmountMicros)) * 31) + this.priceCurrencyCode.hashCode()) * 31) + this.formattedPrice.hashCode();
    }

    public String toString() {
        return "OneTimeProduct(productId=" + this.productId + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", priceAmountMicros=" + this.priceAmountMicros + ", priceCurrencyCode=" + this.priceCurrencyCode + ", formattedPrice=" + this.formattedPrice + ")";
    }

    public OneTimeProduct(@Json(name = "product_id") String productId, @Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME) String name, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "price_amount_micros") long j2, @Json(name = "price_currency_code") String priceCurrencyCode, @Json(name = "formatted_price") String formattedPrice) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
        this.productId = productId;
        this.name = name;
        this.title = title;
        this.description = description;
        this.priceAmountMicros = j2;
        this.priceCurrencyCode = priceCurrencyCode;
        this.formattedPrice = formattedPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public String getName() {
        return this.name;
    }

    public final long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getTitle() {
        return this.title;
    }
}
