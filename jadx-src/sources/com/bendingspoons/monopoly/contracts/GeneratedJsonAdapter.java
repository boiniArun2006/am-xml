package com.bendingspoons.monopoly.contracts;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bendingspoons.monopoly.contracts.OraclePurchaseVerifier;
import com.bendingspoons.oracle.models.LegalNotifications;
import com.bendingspoons.oracle.models.Products;
import com.bendingspoons.oracle.models.Settings;
import com.bendingspoons.oracle.models.User;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.bendingspoons.monopoly.contracts.OraclePurchaseVerifier_ResponseJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001a¨\u0006$"}, d2 = {"Lcom/bendingspoons/monopoly/contracts/OraclePurchaseVerifier_ResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/monopoly/contracts/OraclePurchaseVerifier$Response;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)Lcom/bendingspoons/monopoly/contracts/OraclePurchaseVerifier$Response;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;Lcom/bendingspoons/monopoly/contracts/OraclePurchaseVerifier$Response;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/bendingspoons/monopoly/contracts/OraclePurchaseVerifier$Response$TransactionResponse;", "mapOfStringTransactionResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/bendingspoons/oracle/models/LegalNotifications;", "legalNotificationsAdapter", "Lcom/bendingspoons/oracle/models/User;", "userAdapter", "Lcom/bendingspoons/oracle/models/Products;", "productsAdapter", "Lcom/bendingspoons/oracle/models/Settings;", "settingsAdapter", "monopoly_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends JsonAdapter<OraclePurchaseVerifier.Response> {
    public static final int $stable = 8;
    private final JsonAdapter<LegalNotifications> legalNotificationsAdapter;
    private final JsonAdapter<Map<String, OraclePurchaseVerifier.Response.TransactionResponse>> mapOfStringTransactionResponseAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<Products> productsAdapter;
    private final JsonAdapter<Settings> settingsAdapter;
    private final JsonAdapter<User> userAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("transactions", "default_settings_url", "legal_notifications", "me", "overrides_url", "products", "rawBody", "settings", "settings_hash");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<Map<String, OraclePurchaseVerifier.Response.TransactionResponse>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, OraclePurchaseVerifier.Response.TransactionResponse.class), SetsKt.emptySet(), "transactions");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.mapOfStringTransactionResponseAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, SetsKt.emptySet(), "defaultSettingsUrl");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<LegalNotifications> jsonAdapterAdapter3 = moshi.adapter(LegalNotifications.class, SetsKt.emptySet(), "legalNotifications");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.legalNotificationsAdapter = jsonAdapterAdapter3;
        JsonAdapter<User> jsonAdapterAdapter4 = moshi.adapter(User.class, SetsKt.emptySet(), "me");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.userAdapter = jsonAdapterAdapter4;
        JsonAdapter<Products> jsonAdapterAdapter5 = moshi.adapter(Products.class, SetsKt.emptySet(), "products");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.productsAdapter = jsonAdapterAdapter5;
        JsonAdapter<Settings> jsonAdapterAdapter6 = moshi.adapter(Settings.class, SetsKt.emptySet(), "settings");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.settingsAdapter = jsonAdapterAdapter6;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public OraclePurchaseVerifier.Response fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Map<String, OraclePurchaseVerifier.Response.TransactionResponse> mapFromJson = null;
        LegalNotifications legalNotificationsFromJson = null;
        User me = null;
        String strFromJson = null;
        Products products = null;
        String strFromJson2 = null;
        Settings settings = null;
        String strFromJson3 = null;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String strFromJson4 = null;
        while (true) {
            LegalNotifications legalNotifications = legalNotificationsFromJson;
            if (!reader.hasNext()) {
                reader.endObject();
                if (mapFromJson == null) {
                    throw Util.missingProperty("transactions", "transactions", reader);
                }
                OraclePurchaseVerifier.Response response = new OraclePurchaseVerifier.Response(mapFromJson);
                if (z2) {
                    response.setDefaultSettingsUrl(strFromJson4);
                }
                response.setLegalNotifications(legalNotifications == null ? response.getLegalNotifications() : legalNotifications);
                if (me == null) {
                    me = response.getMe();
                }
                response.setMe(me);
                if (z3) {
                    response.setOverridesUrl(strFromJson);
                }
                if (products == null) {
                    products = response.getProducts();
                }
                response.setProducts(products);
                if (z4) {
                    response.setRawBody(strFromJson2);
                }
                if (settings == null) {
                    settings = response.getSettings();
                }
                response.setSettings(settings);
                if (z5) {
                    response.setSettingsHash(strFromJson3);
                }
                return response;
            }
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    mapFromJson = this.mapOfStringTransactionResponseAdapter.fromJson(reader);
                    if (mapFromJson == null) {
                        throw Util.unexpectedNull("transactions", "transactions", reader);
                    }
                    break;
                case 1:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    legalNotificationsFromJson = legalNotifications;
                    z2 = true;
                    continue;
                case 2:
                    legalNotificationsFromJson = this.legalNotificationsAdapter.fromJson(reader);
                    if (legalNotificationsFromJson == null) {
                        throw Util.unexpectedNull("legalNotifications", "legal_notifications", reader);
                    }
                    continue;
                    break;
                case 3:
                    me = this.userAdapter.fromJson(reader);
                    if (me == null) {
                        throw Util.unexpectedNull("me", "me", reader);
                    }
                    break;
                case 4:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    legalNotificationsFromJson = legalNotifications;
                    z3 = true;
                    continue;
                case 5:
                    products = this.productsAdapter.fromJson(reader);
                    if (products == null) {
                        throw Util.unexpectedNull("products", "products", reader);
                    }
                    break;
                case 6:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    legalNotificationsFromJson = legalNotifications;
                    z4 = true;
                    continue;
                case 7:
                    settings = this.settingsAdapter.fromJson(reader);
                    if (settings == null) {
                        throw Util.unexpectedNull("settings", "settings", reader);
                    }
                    break;
                case 8:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    legalNotificationsFromJson = legalNotifications;
                    z5 = true;
                    continue;
            }
            legalNotificationsFromJson = legalNotifications;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, OraclePurchaseVerifier.Response value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("transactions");
        this.mapOfStringTransactionResponseAdapter.toJson(writer, value_.getTransactions());
        writer.name("default_settings_url");
        this.nullableStringAdapter.toJson(writer, value_.getDefaultSettingsUrl());
        writer.name("legal_notifications");
        this.legalNotificationsAdapter.toJson(writer, value_.getLegalNotifications());
        writer.name("me");
        this.userAdapter.toJson(writer, value_.getMe());
        writer.name("overrides_url");
        this.nullableStringAdapter.toJson(writer, value_.getOverridesUrl());
        writer.name("products");
        this.productsAdapter.toJson(writer, value_.getProducts());
        writer.name("rawBody");
        this.nullableStringAdapter.toJson(writer, value_.getRawBody());
        writer.name("settings");
        this.settingsAdapter.toJson(writer, value_.getSettings());
        writer.name("settings_hash");
        this.nullableStringAdapter.toJson(writer, value_.getSettingsHash());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(53);
        sb.append("GeneratedJsonAdapter(");
        sb.append("OraclePurchaseVerifier.Response");
        sb.append(')');
        return sb.toString();
    }
}
