package com.bendingspoons.pico.domain.uploader.internal.network.entities;

import com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.events.CrashEvent;
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

/* JADX INFO: renamed from: com.bendingspoons.pico.domain.uploader.internal.network.entities.PicoNetworkPacketJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/bendingspoons/pico/domain/uploader/internal/network/entities/PicoNetworkPacketJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/pico/domain/uploader/internal/network/entities/PicoNetworkPacket;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)Lcom/bendingspoons/pico/domain/uploader/internal/network/entities/PicoNetworkPacket;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;Lcom/bendingspoons/pico/domain/uploader/internal/network/entities/PicoNetworkPacket;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "doubleAdapter", "", "Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkEvent;", "listOfPicoNetworkEventAdapter", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends JsonAdapter<PicoNetworkPacket> {
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<PicoNetworkEvent>> listOfPicoNetworkEventAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("delta", "last_event_timestamp", CrashEvent.f62787f);
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<Integer> jsonAdapterAdapter = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "delta");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.intAdapter = jsonAdapterAdapter;
        JsonAdapter<Double> jsonAdapterAdapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "lastEventTimestamp");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.doubleAdapter = jsonAdapterAdapter2;
        JsonAdapter<List<PicoNetworkEvent>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(List.class, PicoNetworkEvent.class), SetsKt.emptySet(), CrashEvent.f62787f);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.listOfPicoNetworkEventAdapter = jsonAdapterAdapter3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public PicoNetworkPacket fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer numFromJson = null;
        Double dFromJson = null;
        List<PicoNetworkEvent> listFromJson = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                numFromJson = this.intAdapter.fromJson(reader);
                if (numFromJson == null) {
                    throw Util.unexpectedNull("delta", "delta", reader);
                }
            } else if (iSelectName == 1) {
                dFromJson = this.doubleAdapter.fromJson(reader);
                if (dFromJson == null) {
                    throw Util.unexpectedNull("lastEventTimestamp", "last_event_timestamp", reader);
                }
            } else if (iSelectName == 2 && (listFromJson = this.listOfPicoNetworkEventAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull(CrashEvent.f62787f, CrashEvent.f62787f, reader);
            }
        }
        reader.endObject();
        if (numFromJson == null) {
            throw Util.missingProperty("delta", "delta", reader);
        }
        int iIntValue = numFromJson.intValue();
        if (dFromJson == null) {
            throw Util.missingProperty("lastEventTimestamp", "last_event_timestamp", reader);
        }
        double dDoubleValue = dFromJson.doubleValue();
        if (listFromJson != null) {
            return new PicoNetworkPacket(iIntValue, dDoubleValue, listFromJson);
        }
        throw Util.missingProperty(CrashEvent.f62787f, CrashEvent.f62787f, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, PicoNetworkPacket value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("delta");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getDelta()));
        writer.name("last_event_timestamp");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getLastEventTimestamp()));
        writer.name(CrashEvent.f62787f);
        this.listOfPicoNetworkEventAdapter.toJson(writer, value_.getEvents());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PicoNetworkPacket");
        sb.append(')');
        return sb.toString();
    }
}
