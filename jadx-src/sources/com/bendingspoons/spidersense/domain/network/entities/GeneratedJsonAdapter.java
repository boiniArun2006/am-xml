package com.bendingspoons.spidersense.domain.network.entities;

import androidx.compose.runtime.internal.StabilityInferred;
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

/* JADX INFO: renamed from: com.bendingspoons.spidersense.domain.network.entities.NetworkPacketJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/bendingspoons/spidersense/domain/network/entities/NetworkPacketJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/spidersense/domain/network/entities/NetworkPacket;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)Lcom/bendingspoons/spidersense/domain/network/entities/NetworkPacket;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;Lcom/bendingspoons/spidersense/domain/network/entities/NetworkPacket;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "doubleAdapter", "", "Lcom/bendingspoons/spidersense/domain/network/entities/DebugEventForBackend;", "listOfDebugEventForBackendAdapter", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends JsonAdapter<NetworkPacket> {
    public static final int $stable = 8;
    private final JsonAdapter<Double> doubleAdapter;
    private final JsonAdapter<List<DebugEventForBackend>> listOfDebugEventForBackendAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("user_id", "sent_at", "payloads");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "userId");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Double> jsonAdapterAdapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "sentAt");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.doubleAdapter = jsonAdapterAdapter2;
        JsonAdapter<List<DebugEventForBackend>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(List.class, DebugEventForBackend.class), SetsKt.emptySet(), CrashEvent.f62787f);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.listOfDebugEventForBackendAdapter = jsonAdapterAdapter3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public NetworkPacket fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        Double dFromJson = null;
        List<DebugEventForBackend> listFromJson = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull("userId", "user_id", reader);
                }
            } else if (iSelectName == 1) {
                dFromJson = this.doubleAdapter.fromJson(reader);
                if (dFromJson == null) {
                    throw Util.unexpectedNull("sentAt", "sent_at", reader);
                }
            } else if (iSelectName == 2 && (listFromJson = this.listOfDebugEventForBackendAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull(CrashEvent.f62787f, "payloads", reader);
            }
        }
        reader.endObject();
        if (strFromJson == null) {
            throw Util.missingProperty("userId", "user_id", reader);
        }
        if (dFromJson == null) {
            throw Util.missingProperty("sentAt", "sent_at", reader);
        }
        double dDoubleValue = dFromJson.doubleValue();
        if (listFromJson != null) {
            return new NetworkPacket(strFromJson, dDoubleValue, listFromJson);
        }
        throw Util.missingProperty(CrashEvent.f62787f, "payloads", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, NetworkPacket value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("user_id");
        this.stringAdapter.toJson(writer, value_.getUserId());
        writer.name("sent_at");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getSentAt()));
        writer.name("payloads");
        this.listOfDebugEventForBackendAdapter.toJson(writer, value_.getEvents());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NetworkPacket");
        sb.append(')');
        return sb.toString();
    }
}
