package com.bendingspoons.experiments.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bendingspoons.experiments.network.OracleExperiment;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.bendingspoons.experiments.network.OracleExperimentJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/bendingspoons/experiments/network/OracleExperimentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/experiments/network/OracleExperiment;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)Lcom/bendingspoons/experiments/network/OracleExperiment;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;Lcom/bendingspoons/experiments/network/OracleExperiment;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Lcom/bendingspoons/experiments/network/OracleExperiment$State;", "nullableStateAdapter", "", "Lcom/bendingspoons/experiments/network/OracleExperiment$Segment;", "listOfSegmentAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "oracle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends JsonAdapter<OracleExperiment> {
    public static final int $stable = 8;
    private volatile Constructor<OracleExperiment> constructorRef;
    private final JsonAdapter<List<OracleExperiment.Segment>> listOfSegmentAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<OracleExperiment.State> nullableStateAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of(AppMeasurementSdk.ConditionalUserProperty.NAME, "description", "is_compatible", "state", "segments");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Boolean> jsonAdapterAdapter2 = moshi.adapter(Boolean.class, SetsKt.emptySet(), "isCompatible");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableBooleanAdapter = jsonAdapterAdapter2;
        JsonAdapter<OracleExperiment.State> jsonAdapterAdapter3 = moshi.adapter(OracleExperiment.State.class, SetsKt.emptySet(), "state");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableStateAdapter = jsonAdapterAdapter3;
        JsonAdapter<List<OracleExperiment.Segment>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(List.class, OracleExperiment.Segment.class), SetsKt.emptySet(), "segments");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.listOfSegmentAdapter = jsonAdapterAdapter4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public OracleExperiment fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        Boolean boolFromJson = null;
        OracleExperiment.State stateFromJson = null;
        List<OracleExperiment.Segment> listFromJson = null;
        int i2 = -1;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                }
            } else if (iSelectName == 1) {
                strFromJson2 = this.stringAdapter.fromJson(reader);
                if (strFromJson2 == null) {
                    throw Util.unexpectedNull("description", "description", reader);
                }
            } else if (iSelectName == 2) {
                boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                i2 &= -5;
            } else if (iSelectName == 3) {
                stateFromJson = this.nullableStateAdapter.fromJson(reader);
                i2 &= -9;
            } else if (iSelectName == 4 && (listFromJson = this.listOfSegmentAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("segments", "segments", reader);
            }
        }
        reader.endObject();
        if (i2 == -13) {
            List<OracleExperiment.Segment> list = listFromJson;
            OracleExperiment.State state = stateFromJson;
            Boolean bool = boolFromJson;
            String str = strFromJson2;
            String str2 = strFromJson;
            if (str2 == null) {
                throw Util.missingProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
            }
            if (str == null) {
                throw Util.missingProperty("description", "description", reader);
            }
            if (list != null) {
                return new OracleExperiment(str2, str, bool, state, list);
            }
            throw Util.missingProperty("segments", "segments", reader);
        }
        List<OracleExperiment.Segment> list2 = listFromJson;
        OracleExperiment.State state2 = stateFromJson;
        Boolean bool2 = boolFromJson;
        String str3 = strFromJson2;
        String str4 = strFromJson;
        Constructor<OracleExperiment> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = OracleExperiment.class.getDeclaredConstructor(String.class, String.class, Boolean.class, OracleExperiment.State.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (str4 == null) {
            throw Util.missingProperty(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
        }
        if (str3 == null) {
            throw Util.missingProperty("description", "description", reader);
        }
        if (list2 == null) {
            throw Util.missingProperty("segments", "segments", reader);
        }
        OracleExperiment oracleExperimentNewInstance = declaredConstructor.newInstance(str4, str3, bool2, state2, list2, Integer.valueOf(i2), null);
        Intrinsics.checkNotNullExpressionValue(oracleExperimentNewInstance, "newInstance(...)");
        return oracleExperimentNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, OracleExperiment value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("description");
        this.stringAdapter.toJson(writer, value_.getDescription());
        writer.name("is_compatible");
        this.nullableBooleanAdapter.toJson(writer, value_.isCompatible());
        writer.name("state");
        this.nullableStateAdapter.toJson(writer, value_.getState());
        writer.name("segments");
        this.listOfSegmentAdapter.toJson(writer, value_.getSegments());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("OracleExperiment");
        sb.append(')');
        return sb.toString();
    }
}
