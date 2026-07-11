package com.bendingspoons.injet.webbridge;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.bendingspoons.injet.webbridge.InjetNativeFunctionOutputJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/bendingspoons/injet/webbridge/InjetNativeFunctionOutputJsonAdapter;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/injet/webbridge/InjetNativeFunctionOutput;", "Lcom/squareup/moshi/Moshi;", "moshi", "", "Ljava/lang/reflect/Type;", "types", "<init>", "(Lcom/squareup/moshi/Moshi;[Ljava/lang/reflect/Type;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)Lcom/bendingspoons/injet/webbridge/InjetNativeFunctionOutput;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;Lcom/bendingspoons/injet/webbridge/InjetNativeFunctionOutput;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTAnyAdapter", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInjetNativeFunctionOutputJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InjetNativeFunctionOutputJsonAdapter.kt\ncom/bendingspoons/injet/webbridge/InjetNativeFunctionOutputJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
public final class GeneratedJsonAdapter<T> extends JsonAdapter<InjetNativeFunctionOutput<T>> {
    public static final int $stable = 8;
    private final JsonAdapter<T> nullableTAnyAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi, Type[] types) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(types, "types");
        if (types.length != 1) {
            throw new IllegalArgumentException(("TypeVariable mismatch: Expecting 1 type for generic type variables [" + RequestConfiguration.MAX_AD_CONTENT_RATING_T + "], but received " + types.length).toString());
        }
        JsonReader.Options optionsOf = JsonReader.Options.of("type", "data");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "type");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<T> jsonAdapterAdapter2 = moshi.adapter(types[0], SetsKt.emptySet(), "data");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableTAnyAdapter = jsonAdapterAdapter2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public InjetNativeFunctionOutput fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        T tFromJson = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw Util.unexpectedNull("type", "type", reader);
                }
            } else if (iSelectName == 1) {
                tFromJson = this.nullableTAnyAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (strFromJson != null) {
            return new InjetNativeFunctionOutput(strFromJson, tFromJson);
        }
        throw Util.missingProperty("type", "type", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, InjetNativeFunctionOutput value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.name("data");
        this.nullableTAnyAdapter.toJson(writer, (T) value_.getData());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InjetNativeFunctionOutput");
        sb.append(')');
        return sb.toString();
    }
}
