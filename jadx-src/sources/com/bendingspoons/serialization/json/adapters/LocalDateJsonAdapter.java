package com.bendingspoons.serialization.json.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import j$.time.LocalDate;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/serialization/json/adapters/LocalDateJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "j$/time/LocalDate", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lj$/time/LocalDate;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lj$/time/LocalDate;)V", "serialization_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalDateJsonAdapter extends JsonAdapter<LocalDate> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @FromJson
    public LocalDate fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return reader.peek() == JsonReader.Token.NULL ? (LocalDate) reader.nextNull() : LocalDate.ofEpochDay(reader.nextLong());
    }

    @Override // com.squareup.moshi.JsonAdapter
    @ToJson
    public void toJson(JsonWriter writer, LocalDate value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null || writer.value(value.toEpochDay()) == null) {
            writer.nullValue();
        }
    }
}
