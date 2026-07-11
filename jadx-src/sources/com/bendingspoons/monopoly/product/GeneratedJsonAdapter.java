package com.bendingspoons.monopoly.product;

import Hr.CQ.USEaHtCMH;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bendingspoons.monopoly.Period;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.bendingspoons.monopoly.product.BasePlanJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lcom/bendingspoons/monopoly/product/BasePlanJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/monopoly/product/BasePlan;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)Lcom/bendingspoons/monopoly/product/BasePlan;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;Lcom/bendingspoons/monopoly/product/BasePlan;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "", "longAdapter", "", "booleanAdapter", "Lcom/bendingspoons/monopoly/Period;", "periodAdapter", "Lcom/bendingspoons/monopoly/product/Offer;", "listOfOfferAdapter", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends JsonAdapter<BasePlan> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<Offer>> listOfOfferAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<Period> periodAdapter;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("product_id", "base_plan_id", "tags", "offer_token", "price_amount_micros", "price_currency_code", "formatted_price", "is_auto_renewing", "period", "offers");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "productId");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<List<String>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, String.class), SetsKt.emptySet(), "tags");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.listOfStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<Long> jsonAdapterAdapter3 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "priceAmountMicros");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.longAdapter = jsonAdapterAdapter3;
        JsonAdapter<Boolean> jsonAdapterAdapter4 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isAutoRenewing");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.booleanAdapter = jsonAdapterAdapter4;
        JsonAdapter<Period> jsonAdapterAdapter5 = moshi.adapter(Period.class, SetsKt.emptySet(), "period");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.periodAdapter = jsonAdapterAdapter5;
        JsonAdapter<List<Offer>> jsonAdapterAdapter6 = moshi.adapter(Types.newParameterizedType(List.class, Offer.class), SetsKt.emptySet(), "offers");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.listOfOfferAdapter = jsonAdapterAdapter6;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public BasePlan fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long lFromJson = null;
        Boolean boolFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        List<String> listFromJson = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String str = null;
        Period periodFromJson = null;
        List<Offer> listFromJson2 = null;
        while (true) {
            boolean zHasNext = reader.hasNext();
            Long l2 = lFromJson;
            Boolean bool = boolFromJson;
            String str2 = strFromJson;
            String str3 = strFromJson2;
            List<String> list = listFromJson;
            String str4 = strFromJson3;
            String str5 = strFromJson4;
            String str6 = USEaHtCMH.JAdAHVt;
            String str7 = str;
            Period period = periodFromJson;
            List<Offer> list2 = listFromJson2;
            if (!zHasNext) {
                reader.endObject();
                if (str2 == null) {
                    throw Util.missingProperty("productId", "product_id", reader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("basePlanId", "base_plan_id", reader);
                }
                if (list == null) {
                    throw Util.missingProperty("tags", "tags", reader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("offerToken", "offer_token", reader);
                }
                if (l2 == null) {
                    throw Util.missingProperty("priceAmountMicros", "price_amount_micros", reader);
                }
                long jLongValue = l2.longValue();
                if (str5 == null) {
                    throw Util.missingProperty("priceCurrencyCode", "price_currency_code", reader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("formattedPrice", str6, reader);
                }
                if (bool == null) {
                    throw Util.missingProperty("isAutoRenewing", "is_auto_renewing", reader);
                }
                boolean zBooleanValue = bool.booleanValue();
                if (period == null) {
                    throw Util.missingProperty("period", "period", reader);
                }
                if (list2 != null) {
                    return new BasePlan(str2, str3, list, str4, jLongValue, str5, str7, zBooleanValue, period, list2);
                }
                throw Util.missingProperty("offers", "offers", reader);
            }
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    lFromJson = l2;
                    boolFromJson = bool;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    listFromJson = list;
                    strFromJson3 = str4;
                    strFromJson4 = str5;
                    str = str7;
                    periodFromJson = period;
                    listFromJson2 = list2;
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw Util.unexpectedNull("productId", "product_id", reader);
                    }
                    lFromJson = l2;
                    boolFromJson = bool;
                    strFromJson2 = str3;
                    listFromJson = list;
                    strFromJson3 = str4;
                    strFromJson4 = str5;
                    str = str7;
                    periodFromJson = period;
                    listFromJson2 = list2;
                    break;
                    break;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw Util.unexpectedNull("basePlanId", "base_plan_id", reader);
                    }
                    lFromJson = l2;
                    boolFromJson = bool;
                    strFromJson = str2;
                    listFromJson = list;
                    strFromJson3 = str4;
                    strFromJson4 = str5;
                    str = str7;
                    periodFromJson = period;
                    listFromJson2 = list2;
                    break;
                    break;
                case 2:
                    listFromJson = this.listOfStringAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw Util.unexpectedNull("tags", "tags", reader);
                    }
                    lFromJson = l2;
                    boolFromJson = bool;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    strFromJson3 = str4;
                    strFromJson4 = str5;
                    str = str7;
                    periodFromJson = period;
                    listFromJson2 = list2;
                    break;
                    break;
                case 3:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw Util.unexpectedNull("offerToken", "offer_token", reader);
                    }
                    lFromJson = l2;
                    boolFromJson = bool;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    listFromJson = list;
                    strFromJson4 = str5;
                    str = str7;
                    periodFromJson = period;
                    listFromJson2 = list2;
                    break;
                    break;
                case 4:
                    lFromJson = this.longAdapter.fromJson(reader);
                    if (lFromJson == null) {
                        throw Util.unexpectedNull("priceAmountMicros", "price_amount_micros", reader);
                    }
                    boolFromJson = bool;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    listFromJson = list;
                    strFromJson3 = str4;
                    strFromJson4 = str5;
                    str = str7;
                    periodFromJson = period;
                    listFromJson2 = list2;
                    break;
                case 5:
                    strFromJson4 = this.stringAdapter.fromJson(reader);
                    if (strFromJson4 == null) {
                        throw Util.unexpectedNull("priceCurrencyCode", "price_currency_code", reader);
                    }
                    lFromJson = l2;
                    boolFromJson = bool;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    listFromJson = list;
                    strFromJson3 = str4;
                    str = str7;
                    periodFromJson = period;
                    listFromJson2 = list2;
                    break;
                    break;
                case 6:
                    String strFromJson5 = this.stringAdapter.fromJson(reader);
                    if (strFromJson5 == null) {
                        throw Util.unexpectedNull("formattedPrice", str6, reader);
                    }
                    str = strFromJson5;
                    lFromJson = l2;
                    boolFromJson = bool;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    listFromJson = list;
                    strFromJson3 = str4;
                    strFromJson4 = str5;
                    periodFromJson = period;
                    listFromJson2 = list2;
                    break;
                    break;
                case 7:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw Util.unexpectedNull("isAutoRenewing", "is_auto_renewing", reader);
                    }
                    lFromJson = l2;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    listFromJson = list;
                    strFromJson3 = str4;
                    strFromJson4 = str5;
                    str = str7;
                    periodFromJson = period;
                    listFromJson2 = list2;
                    break;
                    break;
                case 8:
                    periodFromJson = this.periodAdapter.fromJson(reader);
                    if (periodFromJson == null) {
                        throw Util.unexpectedNull("period", "period", reader);
                    }
                    lFromJson = l2;
                    boolFromJson = bool;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    listFromJson = list;
                    strFromJson3 = str4;
                    strFromJson4 = str5;
                    str = str7;
                    listFromJson2 = list2;
                    break;
                    break;
                case 9:
                    listFromJson2 = this.listOfOfferAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        throw Util.unexpectedNull("offers", "offers", reader);
                    }
                    lFromJson = l2;
                    boolFromJson = bool;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    listFromJson = list;
                    strFromJson3 = str4;
                    strFromJson4 = str5;
                    str = str7;
                    periodFromJson = period;
                    break;
                    break;
                default:
                    lFromJson = l2;
                    boolFromJson = bool;
                    strFromJson = str2;
                    strFromJson2 = str3;
                    listFromJson = list;
                    strFromJson3 = str4;
                    strFromJson4 = str5;
                    str = str7;
                    periodFromJson = period;
                    listFromJson2 = list2;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, BasePlan value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("product_id");
        this.stringAdapter.toJson(writer, value_.getProductId());
        writer.name("base_plan_id");
        this.stringAdapter.toJson(writer, value_.getBasePlanId());
        writer.name("tags");
        this.listOfStringAdapter.toJson(writer, value_.getTags());
        writer.name("offer_token");
        this.stringAdapter.toJson(writer, value_.getOfferToken());
        writer.name("price_amount_micros");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getPriceAmountMicros()));
        writer.name("price_currency_code");
        this.stringAdapter.toJson(writer, value_.getPriceCurrencyCode());
        writer.name("formatted_price");
        this.stringAdapter.toJson(writer, value_.getFormattedPrice());
        writer.name("is_auto_renewing");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isAutoRenewing()));
        writer.name("period");
        this.periodAdapter.toJson(writer, value_.getPeriod());
        writer.name("offers");
        this.listOfOfferAdapter.toJson(writer, value_.getOffers());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BasePlan");
        sb.append(')');
        return sb.toString();
    }
}
