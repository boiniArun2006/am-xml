package com.bendingspoons.serialization.json.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0017¨\u0006\r"}, d2 = {"Lcom/bendingspoons/serialization/json/adapters/LocaleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/Locale;", "<init>", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "serialization_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocaleJsonAdapter extends JsonAdapter<Locale> {
    @Override // com.squareup.moshi.JsonAdapter
    @FromJson
    public Locale fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.peek() == JsonReader.Token.NULL ? (Locale) reader.nextNull() : Locale.forLanguageTag(reader.nextString());
    }

    @Override // com.squareup.moshi.JsonAdapter
    @ToJson
    public void toJson(JsonWriter writer, Locale value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null || writer.value(value.toLanguageTag()) == null) {
            writer.nullValue();
        }
    }
}
