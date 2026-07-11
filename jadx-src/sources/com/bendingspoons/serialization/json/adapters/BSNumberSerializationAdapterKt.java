package com.bendingspoons.serialization.json.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class BSNumberSerializationAdapterKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final JsonAdapter f51568n = new JsonAdapter<Double>() { // from class: com.bendingspoons.serialization.json.adapters.BSNumberSerializationAdapterKt$BS_NUMBER_JSON_SERIALIZATION_ADAPTER$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.JsonAdapter
        @FromJson
        public Double fromJson(JsonReader reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return Double.valueOf(reader.nextDouble());
        }

        @Override // com.squareup.moshi.JsonAdapter
        @ToJson
        public void toJson(JsonWriter writer, Double d2) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (Intrinsics.areEqual(d2 != null ? d2 : null, d2 != null ? Double.valueOf((int) d2.doubleValue()) : null)) {
                writer.value(d2 != null ? Integer.valueOf((int) d2.doubleValue()) : null);
                return;
            }
            if (d2 == null) {
                d2 = null;
            }
            writer.value(d2);
        }
    };

    public static final JsonAdapter n() {
        return f51568n;
    }
}
