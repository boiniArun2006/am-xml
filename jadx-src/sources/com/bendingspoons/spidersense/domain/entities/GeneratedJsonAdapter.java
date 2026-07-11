package com.bendingspoons.spidersense.domain.entities;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import mfo.CLVG.aNrWBQYwFf;

/* JADX INFO: renamed from: com.bendingspoons.spidersense.domain.entities.CompleteDebugEventJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lcom/bendingspoons/spidersense/domain/entities/CompleteDebugEventJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/spidersense/domain/entities/CompleteDebugEvent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)Lcom/bendingspoons/spidersense/domain/entities/CompleteDebugEvent;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;Lcom/bendingspoons/spidersense/domain/entities/CompleteDebugEvent;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "listOfStringAdapter", "nullableStringAdapter", "", "", "mapOfStringAnyAdapter", "", "doubleAdapter", "", "booleanAdapter", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends JsonAdapter<CompleteDebugEvent> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<Map<String, Object>> mapOfStringAnyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "severity", "categories", "description", "error_code", "info", aNrWBQYwFf.QjJMAgrxVnOeNAH, "is_spooner_event", "is_premium_user_event", "user_experiments");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<List<String>> jsonAdapterAdapter2 = moshi.adapter(Types.newParameterizedType(List.class, String.class), SetsKt.emptySet(), "categories");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.listOfStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<String> jsonAdapterAdapter3 = moshi.adapter(String.class, SetsKt.emptySet(), "description");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter3;
        JsonAdapter<Map<String, Object>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Object.class), SetsKt.emptySet(), "info");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.mapOfStringAnyAdapter = jsonAdapterAdapter4;
        JsonAdapter<Double> jsonAdapterAdapter5 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "createdAt");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.doubleAdapter = jsonAdapterAdapter5;
        JsonAdapter<Boolean> jsonAdapterAdapter6 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isSpoonerEvent");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.booleanAdapter = jsonAdapterAdapter6;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public CompleteDebugEvent fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Double dFromJson = null;
        Boolean boolFromJson = null;
        String strFromJson = null;
        String strFromJson2 = null;
        List<String> listFromJson = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        Map<String, Object> mapFromJson = null;
        Boolean boolFromJson2 = null;
        List<String> listFromJson2 = null;
        while (true) {
            Double d2 = dFromJson;
            Boolean bool = boolFromJson;
            String str = strFromJson;
            String str2 = strFromJson2;
            List<String> list = listFromJson;
            String str3 = strFromJson3;
            String str4 = strFromJson4;
            Map<String, Object> map = mapFromJson;
            Boolean bool2 = boolFromJson2;
            if (!reader.hasNext()) {
                reader.endObject();
                if (str == null) {
                    throw Util.missingProperty("id", "id", reader);
                }
                if (str2 == null) {
                    throw Util.missingProperty("severity", "severity", reader);
                }
                if (list == null) {
                    throw Util.missingProperty("categories", "categories", reader);
                }
                if (map == null) {
                    throw Util.missingProperty("info", "info", reader);
                }
                if (d2 == null) {
                    throw Util.missingProperty("createdAt", "created_at", reader);
                }
                double dDoubleValue = d2.doubleValue();
                if (bool == null) {
                    throw Util.missingProperty("isSpoonerEvent", "is_spooner_event", reader);
                }
                boolean zBooleanValue = bool.booleanValue();
                if (bool2 == null) {
                    throw Util.missingProperty("isPremiumUserEvent", "is_premium_user_event", reader);
                }
                boolean zBooleanValue2 = bool2.booleanValue();
                if (listFromJson2 != null) {
                    return new CompleteDebugEvent(str, str2, list, str3, str4, map, dDoubleValue, zBooleanValue, zBooleanValue2, listFromJson2);
                }
                throw Util.missingProperty("userExperiments", "user_experiments", reader);
            }
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    dFromJson = d2;
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    listFromJson = list;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    mapFromJson = map;
                    boolFromJson2 = bool2;
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw Util.unexpectedNull("id", "id", reader);
                    }
                    dFromJson = d2;
                    boolFromJson = bool;
                    strFromJson2 = str2;
                    listFromJson = list;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    mapFromJson = map;
                    boolFromJson2 = bool2;
                    break;
                    break;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw Util.unexpectedNull("severity", "severity", reader);
                    }
                    dFromJson = d2;
                    boolFromJson = bool;
                    strFromJson = str;
                    listFromJson = list;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    mapFromJson = map;
                    boolFromJson2 = bool2;
                    break;
                    break;
                case 2:
                    listFromJson = this.listOfStringAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw Util.unexpectedNull("categories", "categories", reader);
                    }
                    dFromJson = d2;
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    mapFromJson = map;
                    boolFromJson2 = bool2;
                    break;
                    break;
                case 3:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    dFromJson = d2;
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    listFromJson = list;
                    strFromJson4 = str4;
                    mapFromJson = map;
                    boolFromJson2 = bool2;
                    break;
                case 4:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    dFromJson = d2;
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    listFromJson = list;
                    strFromJson3 = str3;
                    mapFromJson = map;
                    boolFromJson2 = bool2;
                    break;
                case 5:
                    mapFromJson = this.mapOfStringAnyAdapter.fromJson(reader);
                    if (mapFromJson == null) {
                        throw Util.unexpectedNull("info", "info", reader);
                    }
                    dFromJson = d2;
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    listFromJson = list;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    boolFromJson2 = bool2;
                    break;
                    break;
                case 6:
                    dFromJson = this.doubleAdapter.fromJson(reader);
                    if (dFromJson == null) {
                        throw Util.unexpectedNull("createdAt", "created_at", reader);
                    }
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    listFromJson = list;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    mapFromJson = map;
                    boolFromJson2 = bool2;
                    break;
                case 7:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw Util.unexpectedNull("isSpoonerEvent", "is_spooner_event", reader);
                    }
                    dFromJson = d2;
                    strFromJson = str;
                    strFromJson2 = str2;
                    listFromJson = list;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    mapFromJson = map;
                    boolFromJson2 = bool2;
                    break;
                    break;
                case 8:
                    boolFromJson2 = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson2 == null) {
                        throw Util.unexpectedNull("isPremiumUserEvent", "is_premium_user_event", reader);
                    }
                    dFromJson = d2;
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    listFromJson = list;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    mapFromJson = map;
                    break;
                    break;
                case 9:
                    listFromJson2 = this.listOfStringAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        throw Util.unexpectedNull("userExperiments", "user_experiments", reader);
                    }
                    dFromJson = d2;
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    listFromJson = list;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    mapFromJson = map;
                    boolFromJson2 = bool2;
                    break;
                default:
                    dFromJson = d2;
                    boolFromJson = bool;
                    strFromJson = str;
                    strFromJson2 = str2;
                    listFromJson = list;
                    strFromJson3 = str3;
                    strFromJson4 = str4;
                    mapFromJson = map;
                    boolFromJson2 = bool2;
                    break;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, CompleteDebugEvent value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("severity");
        this.stringAdapter.toJson(writer, value_.getSeverity());
        writer.name("categories");
        this.listOfStringAdapter.toJson(writer, value_.getCategories());
        writer.name("description");
        this.nullableStringAdapter.toJson(writer, value_.getDescription());
        writer.name("error_code");
        this.nullableStringAdapter.toJson(writer, value_.getErrorCode());
        writer.name("info");
        this.mapOfStringAnyAdapter.toJson(writer, value_.getInfo());
        writer.name("created_at");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getCreatedAt()));
        writer.name("is_spooner_event");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isSpoonerEvent()));
        writer.name("is_premium_user_event");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isPremiumUserEvent()));
        writer.name("user_experiments");
        this.listOfStringAdapter.toJson(writer, value_.getUserExperiments());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CompleteDebugEvent");
        sb.append(')');
        return sb.toString();
    }
}
