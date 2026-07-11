package com.bendingspoons.pico.domain.entities.network;

import ScC.FuwU.pTYaLzzmJSGAPQ;
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

/* JADX INFO: renamed from: com.bendingspoons.pico.domain.entities.network.PicoNetworkBaseUserInfoJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R&\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!0 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkBaseUserInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkBaseUserInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkBaseUserInfo;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkBaseUserInfo;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "nullableBooleanAdapter", "Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkTimezoneInfo;", "picoNetworkTimezoneInfoAdapter", "Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkDeviceInfo;", "picoNetworkDeviceInfoAdapter", "", "", "mapOfStringIntAdapter", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends JsonAdapter<PicoNetworkBaseUserInfo> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Map<String, Integer>> mapOfStringIntAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<PicoNetworkDeviceInfo> picoNetworkDeviceInfoAdapter;
    private final JsonAdapter<PicoNetworkTimezoneInfo> picoNetworkTimezoneInfoAdapter;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("country", "language", "app_language", "locale", "app_version", "bundle_version", "installed_before_pico", "is_baseline", "is_free", "timezone", "device", "experiment");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "country");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Boolean> jsonAdapterAdapter2 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "installedBeforePico");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.booleanAdapter = jsonAdapterAdapter2;
        JsonAdapter<Boolean> jsonAdapterAdapter3 = moshi.adapter(Boolean.class, SetsKt.emptySet(), "isBaseline");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableBooleanAdapter = jsonAdapterAdapter3;
        JsonAdapter<PicoNetworkTimezoneInfo> jsonAdapterAdapter4 = moshi.adapter(PicoNetworkTimezoneInfo.class, SetsKt.emptySet(), "timezone");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.picoNetworkTimezoneInfoAdapter = jsonAdapterAdapter4;
        JsonAdapter<PicoNetworkDeviceInfo> jsonAdapterAdapter5 = moshi.adapter(PicoNetworkDeviceInfo.class, SetsKt.emptySet(), "device");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.picoNetworkDeviceInfoAdapter = jsonAdapterAdapter5;
        JsonAdapter<Map<String, Integer>> jsonAdapterAdapter6 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Integer.class), SetsKt.emptySet(), "experiment");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.mapOfStringIntAdapter = jsonAdapterAdapter6;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public PicoNetworkBaseUserInfo fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean boolFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        String strFromJson5 = null;
        String strFromJson6 = null;
        Boolean boolFromJson2 = null;
        Boolean boolFromJson3 = null;
        PicoNetworkTimezoneInfo picoNetworkTimezoneInfo = null;
        PicoNetworkDeviceInfo picoNetworkDeviceInfo = null;
        Map<String, Integer> map = null;
        while (true) {
            boolean zHasNext = reader.hasNext();
            Boolean bool = boolFromJson;
            String str = strFromJson;
            String str2 = strFromJson2;
            String str3 = strFromJson3;
            String str4 = strFromJson4;
            String str5 = strFromJson5;
            String str6 = strFromJson6;
            String str7 = pTYaLzzmJSGAPQ.cJxlMYEKmaBZrD;
            Boolean bool2 = boolFromJson2;
            Boolean bool3 = boolFromJson3;
            PicoNetworkTimezoneInfo picoNetworkTimezoneInfo2 = picoNetworkTimezoneInfo;
            PicoNetworkDeviceInfo picoNetworkDeviceInfo2 = picoNetworkDeviceInfo;
            Map<String, Integer> map2 = map;
            if (!zHasNext) {
                reader.endObject();
                if (str == null) {
                    throw Util.missingProperty(str7, str7, reader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("language", "language", reader);
                }
                if (str3 == null) {
                    throw Util.missingProperty("appLanguage", "app_language", reader);
                }
                if (str4 == null) {
                    throw Util.missingProperty("locale", "locale", reader);
                }
                if (str5 == null) {
                    throw Util.missingProperty("appVersion", "app_version", reader);
                }
                if (str6 == null) {
                    throw Util.missingProperty("bundleVersion", "bundle_version", reader);
                }
                if (bool == null) {
                    throw Util.missingProperty("installedBeforePico", "installed_before_pico", reader);
                }
                boolean zBooleanValue = bool.booleanValue();
                if (picoNetworkTimezoneInfo2 == null) {
                    throw Util.missingProperty("timezone", "timezone", reader);
                }
                if (picoNetworkDeviceInfo2 == null) {
                    throw Util.missingProperty("device", "device", reader);
                }
                if (map2 != null) {
                    return new PicoNetworkBaseUserInfo(str, str2, str3, str4, str5, str6, zBooleanValue, bool2, bool3, picoNetworkTimezoneInfo2, picoNetworkDeviceInfo2, map2);
                }
                throw Util.missingProperty("experiment", "experiment", reader);
            }
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson2 = bool2;
                    boolFromJson3 = bool3;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    map = map2;
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw Util.unexpectedNull(str7, str7, reader);
                    }
                    boolFromJson = bool;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson2 = bool2;
                    boolFromJson3 = bool3;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    map = map2;
                    break;
                    break;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw Util.unexpectedNull("language", "language", reader);
                    }
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson2 = bool2;
                    boolFromJson3 = bool3;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    map = map2;
                    break;
                    break;
                case 2:
                    strFromJson3 = this.stringAdapter.fromJson(reader);
                    if (strFromJson3 == null) {
                        throw Util.unexpectedNull("appLanguage", "app_language", reader);
                    }
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson2 = bool2;
                    boolFromJson3 = bool3;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    map = map2;
                    break;
                    break;
                case 3:
                    strFromJson4 = this.stringAdapter.fromJson(reader);
                    if (strFromJson4 == null) {
                        throw Util.unexpectedNull("locale", "locale", reader);
                    }
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson2 = bool2;
                    boolFromJson3 = bool3;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    map = map2;
                    break;
                    break;
                case 4:
                    strFromJson5 = this.stringAdapter.fromJson(reader);
                    if (strFromJson5 == null) {
                        throw Util.unexpectedNull("appVersion", "app_version", reader);
                    }
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson6 = str6;
                    boolFromJson2 = bool2;
                    boolFromJson3 = bool3;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    map = map2;
                    break;
                    break;
                case 5:
                    strFromJson6 = this.stringAdapter.fromJson(reader);
                    if (strFromJson6 == null) {
                        throw Util.unexpectedNull("bundleVersion", "bundle_version", reader);
                    }
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    boolFromJson2 = bool2;
                    boolFromJson3 = bool3;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    map = map2;
                    break;
                    break;
                case 6:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw Util.unexpectedNull("installedBeforePico", "installed_before_pico", reader);
                    }
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson2 = bool2;
                    boolFromJson3 = bool3;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    map = map2;
                    break;
                case 7:
                    boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson3 = bool3;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    map = map2;
                    break;
                case 8:
                    boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson2 = bool2;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    map = map2;
                    break;
                case 9:
                    PicoNetworkTimezoneInfo picoNetworkTimezoneInfoFromJson = this.picoNetworkTimezoneInfoAdapter.fromJson(reader);
                    if (picoNetworkTimezoneInfoFromJson == null) {
                        throw Util.unexpectedNull("timezone", "timezone", reader);
                    }
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfoFromJson;
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson2 = bool2;
                    boolFromJson3 = bool3;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    map = map2;
                    break;
                    break;
                case 10:
                    PicoNetworkDeviceInfo picoNetworkDeviceInfoFromJson = this.picoNetworkDeviceInfoAdapter.fromJson(reader);
                    if (picoNetworkDeviceInfoFromJson == null) {
                        throw Util.unexpectedNull("device", "device", reader);
                    }
                    picoNetworkDeviceInfo = picoNetworkDeviceInfoFromJson;
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson2 = bool2;
                    boolFromJson3 = bool3;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    map = map2;
                    break;
                    break;
                case 11:
                    Map<String, Integer> mapFromJson = this.mapOfStringIntAdapter.fromJson(reader);
                    if (mapFromJson == null) {
                        throw Util.unexpectedNull("experiment", "experiment", reader);
                    }
                    map = mapFromJson;
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson2 = bool2;
                    boolFromJson3 = bool3;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    break;
                    break;
                default:
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    strFromJson5 = str5;
                    strFromJson6 = str6;
                    boolFromJson2 = bool2;
                    boolFromJson3 = bool3;
                    picoNetworkTimezoneInfo = picoNetworkTimezoneInfo2;
                    picoNetworkDeviceInfo = picoNetworkDeviceInfo2;
                    map = map2;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, PicoNetworkBaseUserInfo value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("country");
        this.stringAdapter.toJson(writer, value_.getCountry());
        writer.name("language");
        this.stringAdapter.toJson(writer, value_.getLanguage());
        writer.name("app_language");
        this.stringAdapter.toJson(writer, value_.getAppLanguage());
        writer.name("locale");
        this.stringAdapter.toJson(writer, value_.getLocale());
        writer.name("app_version");
        this.stringAdapter.toJson(writer, value_.getAppVersion());
        writer.name("bundle_version");
        this.stringAdapter.toJson(writer, value_.getBundleVersion());
        writer.name("installed_before_pico");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getInstalledBeforePico()));
        writer.name("is_baseline");
        this.nullableBooleanAdapter.toJson(writer, value_.isBaseline());
        writer.name("is_free");
        this.nullableBooleanAdapter.toJson(writer, value_.isFree());
        writer.name("timezone");
        this.picoNetworkTimezoneInfoAdapter.toJson(writer, value_.getTimezone());
        writer.name("device");
        this.picoNetworkDeviceInfoAdapter.toJson(writer, value_.getDevice());
        writer.name("experiment");
        this.mapOfStringIntAdapter.toJson(writer, value_.getExperiment());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PicoNetworkBaseUserInfo");
        sb.append(')');
        return sb.toString();
    }
}
