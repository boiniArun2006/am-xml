package defpackage;

import aT.dE.JLZo;
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
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: VersioningFileJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"LVersioningFileJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "LVersioningFile;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)LVersioningFile;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;LVersioningFile;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "LFreeze;", "listOfFreezeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "LLatestVersion;", "latestVersionAdapter", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends JsonAdapter<VersioningFile> {
    public static final int $stable = 8;
    private final JsonAdapter<LatestVersion> latestVersionAdapter;
    private final JsonAdapter<List<Freeze>> listOfFreezeAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("freezes", "latest");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<List<Freeze>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(List.class, Freeze.class), SetsKt.emptySet(), "freezeVersions");
        String str = JLZo.OIQrbAQFxufKV;
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, str);
        this.listOfFreezeAdapter = jsonAdapterAdapter;
        JsonAdapter<LatestVersion> jsonAdapterAdapter2 = moshi.adapter(LatestVersion.class, SetsKt.emptySet(), "latestVersion");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, str);
        this.latestVersionAdapter = jsonAdapterAdapter2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public VersioningFile fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<Freeze> listFromJson = null;
        LatestVersion latestVersionFromJson = null;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                listFromJson = this.listOfFreezeAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw Util.unexpectedNull("freezeVersions", "freezes", reader);
                }
            } else if (iSelectName == 1 && (latestVersionFromJson = this.latestVersionAdapter.fromJson(reader)) == null) {
                throw Util.unexpectedNull("latestVersion", "latest", reader);
            }
        }
        reader.endObject();
        if (listFromJson == null) {
            throw Util.missingProperty("freezeVersions", "freezes", reader);
        }
        if (latestVersionFromJson != null) {
            return new VersioningFile(listFromJson, latestVersionFromJson);
        }
        throw Util.missingProperty("latestVersion", "latest", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, VersioningFile value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("freezes");
        this.listOfFreezeAdapter.toJson(writer, value_.getFreezeVersions());
        writer.name("latest");
        this.latestVersionAdapter.toJson(writer, value_.getLatestVersion());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VersioningFile");
        sb.append(')');
        return sb.toString();
    }
}
