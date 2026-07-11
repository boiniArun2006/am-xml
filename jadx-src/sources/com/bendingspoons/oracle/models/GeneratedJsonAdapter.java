package com.bendingspoons.oracle.models;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alightcreative.gl.egl.il.inFlMLxL;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.bendingspoons.oracle.models.OracleResponseJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/bendingspoons/oracle/models/OracleResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/oracle/models/OracleResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)Lcom/bendingspoons/oracle/models/OracleResponse;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;Lcom/bendingspoons/oracle/models/OracleResponse;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/bendingspoons/oracle/models/Settings;", "settingsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/oracle/models/User;", "userAdapter", "Lcom/bendingspoons/oracle/models/Products;", "productsAdapter", "nullableStringAdapter", "Lcom/bendingspoons/oracle/models/LegalNotifications;", "legalNotificationsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOracleResponseJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OracleResponseJsonAdapter.kt\ncom/bendingspoons/oracle/models/OracleResponseJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
public final class GeneratedJsonAdapter extends JsonAdapter<OracleResponse> {
    public static final int $stable = 8;
    private volatile Constructor<OracleResponse> constructorRef;
    private final JsonAdapter<LegalNotifications> legalNotificationsAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<Products> productsAdapter;
    private final JsonAdapter<Settings> settingsAdapter;
    private final JsonAdapter<User> userAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("settings", "me", "products", "settings_hash", "default_settings_url", "overrides_url", "legal_notifications", "rawBody");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<Settings> jsonAdapterAdapter = moshi.adapter(Settings.class, SetsKt.emptySet(), "settings");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.settingsAdapter = jsonAdapterAdapter;
        JsonAdapter<User> jsonAdapterAdapter2 = moshi.adapter(User.class, SetsKt.emptySet(), "me");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.userAdapter = jsonAdapterAdapter2;
        JsonAdapter<Products> jsonAdapterAdapter3 = moshi.adapter(Products.class, SetsKt.emptySet(), "products");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.productsAdapter = jsonAdapterAdapter3;
        JsonAdapter<String> jsonAdapterAdapter4 = moshi.adapter(String.class, SetsKt.emptySet(), "settingsHash");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter4;
        JsonAdapter<LegalNotifications> jsonAdapterAdapter5 = moshi.adapter(LegalNotifications.class, SetsKt.emptySet(), "legalNotifications");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.legalNotificationsAdapter = jsonAdapterAdapter5;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public OracleResponse fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i2 = -1;
        Settings settingsFromJson = null;
        User userFromJson = null;
        Products productsFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        LegalNotifications legalNotificationsFromJson = null;
        String strFromJson4 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    settingsFromJson = this.settingsAdapter.fromJson(reader);
                    if (settingsFromJson == null) {
                        throw Util.unexpectedNull("settings", "settings", reader);
                    }
                    i2 &= -2;
                    break;
                    break;
                case 1:
                    userFromJson = this.userAdapter.fromJson(reader);
                    if (userFromJson == null) {
                        throw Util.unexpectedNull("me", "me", reader);
                    }
                    i2 &= -3;
                    break;
                    break;
                case 2:
                    productsFromJson = this.productsAdapter.fromJson(reader);
                    if (productsFromJson == null) {
                        throw Util.unexpectedNull("products", "products", reader);
                    }
                    i2 &= -5;
                    break;
                    break;
                case 3:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i2 &= -9;
                    break;
                case 4:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i2 &= -17;
                    break;
                case 5:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i2 &= -33;
                    break;
                case 6:
                    legalNotificationsFromJson = this.legalNotificationsAdapter.fromJson(reader);
                    if (legalNotificationsFromJson == null) {
                        throw Util.unexpectedNull("legalNotifications", "legal_notifications", reader);
                    }
                    i2 &= -65;
                    break;
                    break;
                case 7:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i2 &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i2 != -256) {
            Constructor<OracleResponse> declaredConstructor = this.constructorRef;
            if (declaredConstructor == null) {
                declaredConstructor = OracleResponse.class.getDeclaredConstructor(Settings.class, User.class, Products.class, String.class, String.class, String.class, LegalNotifications.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                this.constructorRef = declaredConstructor;
                Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
            }
            OracleResponse oracleResponseNewInstance = declaredConstructor.newInstance(settingsFromJson, userFromJson, productsFromJson, strFromJson, strFromJson2, strFromJson3, legalNotificationsFromJson, strFromJson4, Integer.valueOf(i2), null);
            Intrinsics.checkNotNullExpressionValue(oracleResponseNewInstance, "newInstance(...)");
            return oracleResponseNewInstance;
        }
        Intrinsics.checkNotNull(settingsFromJson, "null cannot be cast to non-null type com.bendingspoons.oracle.models.Settings");
        Intrinsics.checkNotNull(userFromJson, "null cannot be cast to non-null type com.bendingspoons.oracle.models.User");
        Intrinsics.checkNotNull(productsFromJson, "null cannot be cast to non-null type com.bendingspoons.oracle.models.Products");
        Intrinsics.checkNotNull(legalNotificationsFromJson, "null cannot be cast to non-null type com.bendingspoons.oracle.models.LegalNotifications");
        String str = strFromJson4;
        LegalNotifications legalNotifications = legalNotificationsFromJson;
        String str2 = strFromJson3;
        String str3 = strFromJson2;
        String str4 = strFromJson;
        return new OracleResponse(settingsFromJson, userFromJson, productsFromJson, str4, str3, str2, legalNotifications, str);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, OracleResponse value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("settings");
        this.settingsAdapter.toJson(writer, value_.getSettings());
        writer.name("me");
        this.userAdapter.toJson(writer, value_.getMe());
        writer.name(inFlMLxL.ZsoJnMtiRf);
        this.productsAdapter.toJson(writer, value_.getProducts());
        writer.name("settings_hash");
        this.nullableStringAdapter.toJson(writer, value_.getSettingsHash());
        writer.name("default_settings_url");
        this.nullableStringAdapter.toJson(writer, value_.getDefaultSettingsUrl());
        writer.name("overrides_url");
        this.nullableStringAdapter.toJson(writer, value_.getOverridesUrl());
        writer.name("legal_notifications");
        this.legalNotificationsAdapter.toJson(writer, value_.getLegalNotifications());
        writer.name("rawBody");
        this.nullableStringAdapter.toJson(writer, value_.getRawBody());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("OracleResponse");
        sb.append(')');
        return sb.toString();
    }
}
