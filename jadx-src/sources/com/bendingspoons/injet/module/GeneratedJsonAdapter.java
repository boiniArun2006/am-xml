package com.bendingspoons.injet.module;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import com.bendingspoons.injet.module.WolfModule;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.bendingspoons.injet.module.WolfModule_WolfPredictionInfoJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/bendingspoons/injet/module/WolfModule_WolfPredictionInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/injet/module/WolfModule$WolfPredictionInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)Lcom/bendingspoons/injet/module/WolfModule$WolfPredictionInfo;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;Lcom/bendingspoons/injet/module/WolfModule$WolfPredictionInfo;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableDoubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWolfModule_WolfPredictionInfoJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WolfModule_WolfPredictionInfoJsonAdapter.kt\ncom/bendingspoons/injet/module/WolfModule_WolfPredictionInfoJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n1#2:116\n*E\n"})
public final class GeneratedJsonAdapter extends JsonAdapter<WolfModule.WolfPredictionInfo> {
    public static final int $stable = 8;
    private volatile Constructor<WolfModule.WolfPredictionInfo> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Double> nullableDoubleAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("prediction", "isExperienceModifiedByPrediction", "predictionModel");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<Double> jsonAdapterAdapter = moshi.adapter(Double.class, SetsKt.emptySet(), "prediction");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.nullableDoubleAdapter = jsonAdapterAdapter;
        JsonAdapter<Boolean> jsonAdapterAdapter2 = moshi.adapter(Boolean.class, SetsKt.emptySet(), "isExperienceModifiedByPrediction");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableBooleanAdapter = jsonAdapterAdapter2;
        JsonAdapter<String> jsonAdapterAdapter3 = moshi.adapter(String.class, SetsKt.emptySet(), "predictionModel");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public WolfModule.WolfPredictionInfo fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, QiDPjiOCZHDS.kNbKowl);
        reader.beginObject();
        Double dFromJson = null;
        Boolean boolFromJson = null;
        String strFromJson = null;
        int i2 = -1;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                dFromJson = this.nullableDoubleAdapter.fromJson(reader);
                i2 &= -2;
            } else if (iSelectName == 1) {
                boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                i2 &= -3;
            } else if (iSelectName == 2) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
                i2 &= -5;
            }
        }
        reader.endObject();
        if (i2 == -8) {
            return new WolfModule.WolfPredictionInfo(dFromJson, boolFromJson, strFromJson);
        }
        Constructor<WolfModule.WolfPredictionInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = WolfModule.WolfPredictionInfo.class.getDeclaredConstructor(Double.class, Boolean.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        WolfModule.WolfPredictionInfo wolfPredictionInfoNewInstance = declaredConstructor.newInstance(dFromJson, boolFromJson, strFromJson, Integer.valueOf(i2), null);
        Intrinsics.checkNotNullExpressionValue(wolfPredictionInfoNewInstance, "newInstance(...)");
        return wolfPredictionInfoNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, WolfModule.WolfPredictionInfo value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("prediction");
        this.nullableDoubleAdapter.toJson(writer, value_.getPrediction());
        writer.name("isExperienceModifiedByPrediction");
        this.nullableBooleanAdapter.toJson(writer, value_.isExperienceModifiedByPrediction());
        writer.name("predictionModel");
        this.nullableStringAdapter.toJson(writer, value_.getPredictionModel());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WolfModule.WolfPredictionInfo");
        sb.append(')');
        return sb.toString();
    }
}
