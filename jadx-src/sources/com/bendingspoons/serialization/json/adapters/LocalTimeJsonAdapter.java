package com.bendingspoons.serialization.json.adapters;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.ToJson;
import j$.time.LocalTime;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/bendingspoons/serialization/json/adapters/LocalTimeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "j$/time/LocalTime", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lj$/time/LocalTime;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "", "toJson", "(Lcom/squareup/moshi/JsonWriter;Lj$/time/LocalTime;)V", "serialization_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalTimeJsonAdapter extends JsonAdapter<LocalTime> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    @FromJson
    public LocalTime fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        if (reader.peek() == JsonReader.Token.NULL) {
            return (LocalTime) reader.nextNull();
        }
        long jNextLong = reader.nextLong();
        int i2 = (int) jNextLong;
        int i3 = (int) (jNextLong >> 32);
        return LocalTime.of((byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3, i2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    @ToJson
    public void toJson(JsonWriter writer, LocalTime value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value != null) {
            if (writer.value((((long) (((value.getHour() << 16) + (value.getMinute() << 8)) + value.getSecond())) << 32) + ((long) value.getNano())) != null) {
                return;
            }
        }
        writer.nullValue();
    }
}
