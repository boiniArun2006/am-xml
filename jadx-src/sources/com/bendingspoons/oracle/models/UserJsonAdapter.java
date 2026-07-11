package com.bendingspoons.oracle.models;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.bendingspoons.oracle.models.User;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/bendingspoons/oracle/models/UserJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/oracle/models/User;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)Lcom/bendingspoons/oracle/models/User;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;Lcom/bendingspoons/oracle/models/User;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "Lcom/bendingspoons/oracle/models/User$PrivacyNotice;", "privacyNoticeAdapter", "Lcom/bendingspoons/oracle/models/User$TermsOfService;", "termsOfServiceAdapter", "", "", "mapOfStringIntAdapter", "Lcom/bendingspoons/oracle/models/User$BundleSubscription;", "listOfBundleSubscriptionAdapter", "Lcom/bendingspoons/oracle/models/User$ActiveSubscription;", "listOfActiveSubscriptionAdapter", "Lcom/bendingspoons/oracle/models/User$AuthenticationResponse;", "nullableAuthenticationResponseAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserJsonAdapter.kt\ncom/bendingspoons/oracle/models/UserJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public final class UserJsonAdapter extends JsonAdapter<User> {
    public static final int $stable = 8;
    private volatile Constructor<User> constructorRef;
    private final JsonAdapter<List<User.ActiveSubscription>> listOfActiveSubscriptionAdapter;
    private final JsonAdapter<List<User.BundleSubscription>> listOfBundleSubscriptionAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Map<String, Integer>> mapOfStringIntAdapter;
    private final JsonAdapter<User.AuthenticationResponse> nullableAuthenticationResponseAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<User.PrivacyNotice> privacyNoticeAdapter;
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<User.TermsOfService> termsOfServiceAdapter;

    public UserJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("unique_id", "active_subscriptions_ids", "privacy_notice", "terms_of_service", "available_consumable_credits", "non_consumables_ids", "active_bundle_subscriptions", "active_subscriptions", "authentication");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<List<String>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, String.class), SetsKt.emptySet(), "activeSubscriptionsIds");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.listOfStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<User.PrivacyNotice> jsonAdapterAdapter3 = moshi.adapter(User.PrivacyNotice.class, SetsKt.emptySet(), "privacyNotice");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.privacyNoticeAdapter = jsonAdapterAdapter3;
        JsonAdapter<User.TermsOfService> jsonAdapterAdapter4 = moshi.adapter(User.TermsOfService.class, SetsKt.emptySet(), "termsOfService");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.termsOfServiceAdapter = jsonAdapterAdapter4;
        JsonAdapter<Map<String, Integer>> jsonAdapterAdapter5 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Integer.class), SetsKt.emptySet(), "availableConsumableCredits");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.mapOfStringIntAdapter = jsonAdapterAdapter5;
        JsonAdapter<List<User.BundleSubscription>> jsonAdapterAdapter6 = moshi.adapter(Types.newParameterizedType(List.class, User.BundleSubscription.class), SetsKt.emptySet(), "activeBundleSubscriptions");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.listOfBundleSubscriptionAdapter = jsonAdapterAdapter6;
        JsonAdapter<List<User.ActiveSubscription>> jsonAdapterAdapter7 = moshi.adapter(Types.newParameterizedType(List.class, User.ActiveSubscription.class), SetsKt.emptySet(), "activeSubscriptions");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter7, "adapter(...)");
        this.listOfActiveSubscriptionAdapter = jsonAdapterAdapter7;
        JsonAdapter<User.AuthenticationResponse> jsonAdapterAdapter8 = moshi.adapter(User.AuthenticationResponse.class, SetsKt.emptySet(), "authentication");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter8, "adapter(...)");
        this.nullableAuthenticationResponseAdapter = jsonAdapterAdapter8;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public User fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i2 = -1;
        String strFromJson = null;
        List<String> listFromJson = null;
        User.PrivacyNotice privacyNoticeFromJson = null;
        User.TermsOfService termsOfServiceFromJson = null;
        Map<String, Integer> mapFromJson = null;
        List<String> listFromJson2 = null;
        List<User.BundleSubscription> listFromJson3 = null;
        List<User.ActiveSubscription> listFromJson4 = null;
        User.AuthenticationResponse authenticationResponseFromJson = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw Util.unexpectedNull("id", "unique_id", reader);
                    }
                    i2 &= -2;
                    break;
                    break;
                case 1:
                    listFromJson = this.listOfStringAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw Util.unexpectedNull("activeSubscriptionsIds", "active_subscriptions_ids", reader);
                    }
                    i2 &= -3;
                    break;
                    break;
                case 2:
                    privacyNoticeFromJson = this.privacyNoticeAdapter.fromJson(reader);
                    if (privacyNoticeFromJson == null) {
                        throw Util.unexpectedNull("privacyNotice", "privacy_notice", reader);
                    }
                    i2 &= -5;
                    break;
                    break;
                case 3:
                    termsOfServiceFromJson = this.termsOfServiceAdapter.fromJson(reader);
                    if (termsOfServiceFromJson == null) {
                        throw Util.unexpectedNull("termsOfService", "terms_of_service", reader);
                    }
                    i2 &= -9;
                    break;
                    break;
                case 4:
                    mapFromJson = this.mapOfStringIntAdapter.fromJson(reader);
                    if (mapFromJson == null) {
                        throw Util.unexpectedNull("availableConsumableCredits", "available_consumable_credits", reader);
                    }
                    i2 &= -17;
                    break;
                    break;
                case 5:
                    listFromJson2 = this.listOfStringAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        throw Util.unexpectedNull("nonConsumablesIds", "non_consumables_ids", reader);
                    }
                    i2 &= -33;
                    break;
                    break;
                case 6:
                    listFromJson3 = this.listOfBundleSubscriptionAdapter.fromJson(reader);
                    if (listFromJson3 == null) {
                        throw Util.unexpectedNull("activeBundleSubscriptions", "active_bundle_subscriptions", reader);
                    }
                    i2 &= -65;
                    break;
                    break;
                case 7:
                    listFromJson4 = this.listOfActiveSubscriptionAdapter.fromJson(reader);
                    if (listFromJson4 == null) {
                        throw Util.unexpectedNull("activeSubscriptions", "active_subscriptions", reader);
                    }
                    i2 &= -129;
                    break;
                    break;
                case 8:
                    authenticationResponseFromJson = this.nullableAuthenticationResponseAdapter.fromJson(reader);
                    i2 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i2 != -512) {
            Constructor<User> declaredConstructor = this.constructorRef;
            if (declaredConstructor == null) {
                declaredConstructor = User.class.getDeclaredConstructor(String.class, List.class, User.PrivacyNotice.class, User.TermsOfService.class, Map.class, List.class, List.class, List.class, User.AuthenticationResponse.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                this.constructorRef = declaredConstructor;
                Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
            }
            User userNewInstance = declaredConstructor.newInstance(strFromJson, listFromJson, privacyNoticeFromJson, termsOfServiceFromJson, mapFromJson, listFromJson2, listFromJson3, listFromJson4, authenticationResponseFromJson, Integer.valueOf(i2), null);
            Intrinsics.checkNotNullExpressionValue(userNewInstance, "newInstance(...)");
            return userNewInstance;
        }
        Intrinsics.checkNotNull(strFromJson, "null cannot be cast to non-null type kotlin.String");
        Intrinsics.checkNotNull(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        Intrinsics.checkNotNull(privacyNoticeFromJson, "null cannot be cast to non-null type com.bendingspoons.oracle.models.User.PrivacyNotice");
        Intrinsics.checkNotNull(termsOfServiceFromJson, "null cannot be cast to non-null type com.bendingspoons.oracle.models.User.TermsOfService");
        Intrinsics.checkNotNull(mapFromJson, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Int>");
        Intrinsics.checkNotNull(listFromJson2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        Intrinsics.checkNotNull(listFromJson3, "null cannot be cast to non-null type kotlin.collections.List<com.bendingspoons.oracle.models.User.BundleSubscription>");
        Intrinsics.checkNotNull(listFromJson4, "null cannot be cast to non-null type kotlin.collections.List<com.bendingspoons.oracle.models.User.ActiveSubscription>");
        User.AuthenticationResponse authenticationResponse = authenticationResponseFromJson;
        List<User.ActiveSubscription> list = listFromJson4;
        List<User.BundleSubscription> list2 = listFromJson3;
        List<String> list3 = listFromJson2;
        Map<String, Integer> map = mapFromJson;
        User.TermsOfService termsOfService = termsOfServiceFromJson;
        return new User(strFromJson, listFromJson, privacyNoticeFromJson, termsOfService, map, list3, list2, list, authenticationResponse);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, User value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("unique_id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("active_subscriptions_ids");
        this.listOfStringAdapter.toJson(writer, value_.getActiveSubscriptionsIds());
        writer.name("privacy_notice");
        this.privacyNoticeAdapter.toJson(writer, value_.getPrivacyNotice());
        writer.name("terms_of_service");
        this.termsOfServiceAdapter.toJson(writer, value_.getTermsOfService());
        writer.name("available_consumable_credits");
        this.mapOfStringIntAdapter.toJson(writer, value_.getAvailableConsumableCredits());
        writer.name("non_consumables_ids");
        this.listOfStringAdapter.toJson(writer, value_.getNonConsumablesIds());
        writer.name("active_bundle_subscriptions");
        this.listOfBundleSubscriptionAdapter.toJson(writer, value_.getActiveBundleSubscriptions());
        writer.name("active_subscriptions");
        this.listOfActiveSubscriptionAdapter.toJson(writer, value_.getActiveSubscriptions());
        writer.name("authentication");
        this.nullableAuthenticationResponseAdapter.toJson(writer, value_.getAuthentication());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(26);
        sb.append(QiDPjiOCZHDS.PKPnCvsZFqJX);
        sb.append("User");
        sb.append(')');
        return sb.toString();
    }
}
