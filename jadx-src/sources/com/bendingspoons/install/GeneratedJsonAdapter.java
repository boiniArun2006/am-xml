package com.bendingspoons.install;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.bendingspoons.concierge.domain.entities.CreationType;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.bendingspoons.install.InstallEventDataJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/bendingspoons/install/InstallEventDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/install/InstallEventData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/JsonReader;", "reader", c.f62177j, "(Lcom/squareup/moshi/JsonReader;)Lcom/bendingspoons/install/InstallEventData;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value_", "", "rl", "(Lcom/squareup/moshi/JsonWriter;Lcom/bendingspoons/install/InstallEventData;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/bendingspoons/concierge/domain/entities/CreationType;", "creationTypeAdapter", "stringAdapter", "nullableStringAdapter", "concierge_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends JsonAdapter<InstallEventData> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<CreationType> creationTypeAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("installed_before_pico", "backup_persistent_id_status", "non_backup_persistent_id_status", "new_app_version", "old_app_version", "old_bundle_version");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<Boolean> jsonAdapterAdapter = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "installedBeforePico");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.booleanAdapter = jsonAdapterAdapter;
        JsonAdapter<CreationType> jsonAdapterAdapter2 = moshi.adapter(CreationType.class, SetsKt.emptySet(), pTYaLzzmJSGAPQ.FhQXxjaKKnbh);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.creationTypeAdapter = jsonAdapterAdapter2;
        JsonAdapter<String> jsonAdapterAdapter3 = moshi.adapter(String.class, SetsKt.emptySet(), "newAppVersion");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter3;
        JsonAdapter<String> jsonAdapterAdapter4 = moshi.adapter(String.class, SetsKt.emptySet(), "oldAppVersion");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public InstallEventData fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean boolFromJson = null;
        CreationType creationTypeFromJson = null;
        CreationType creationTypeFromJson2 = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        while (true) {
            boolean zHasNext = reader.hasNext();
            String str = qfEYuUHwj.wgXJMLDtH;
            Boolean bool = boolFromJson;
            if (!zHasNext) {
                reader.endObject();
                if (bool == null) {
                    throw Util.missingProperty("installedBeforePico", "installed_before_pico", reader);
                }
                boolean zBooleanValue = bool.booleanValue();
                if (creationTypeFromJson == null) {
                    throw Util.missingProperty("backupPersistentIdStatus", "backup_persistent_id_status", reader);
                }
                if (creationTypeFromJson2 == null) {
                    throw Util.missingProperty("nonBackupPersistentIdStatus", "non_backup_persistent_id_status", reader);
                }
                if (strFromJson != null) {
                    return new InstallEventData(zBooleanValue, creationTypeFromJson, creationTypeFromJson2, strFromJson, strFromJson2, strFromJson3);
                }
                throw Util.missingProperty("newAppVersion", str, reader);
            }
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw Util.unexpectedNull("installedBeforePico", "installed_before_pico", reader);
                    }
                    continue;
                    break;
                case 1:
                    creationTypeFromJson = this.creationTypeAdapter.fromJson(reader);
                    if (creationTypeFromJson == null) {
                        throw Util.unexpectedNull("backupPersistentIdStatus", "backup_persistent_id_status", reader);
                    }
                    break;
                case 2:
                    creationTypeFromJson2 = this.creationTypeAdapter.fromJson(reader);
                    if (creationTypeFromJson2 == null) {
                        throw Util.unexpectedNull("nonBackupPersistentIdStatus", "non_backup_persistent_id_status", reader);
                    }
                    break;
                case 3:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw Util.unexpectedNull("newAppVersion", str, reader);
                    }
                    break;
                case 4:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
            boolFromJson = bool;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public void toJson(JsonWriter writer, InstallEventData value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("installed_before_pico");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getInstalledBeforePico()));
        writer.name("backup_persistent_id_status");
        this.creationTypeAdapter.toJson(writer, value_.getBackupPersistentIdStatus());
        writer.name("non_backup_persistent_id_status");
        this.creationTypeAdapter.toJson(writer, value_.getNonBackupPersistentIdStatus());
        writer.name("new_app_version");
        this.stringAdapter.toJson(writer, value_.getNewAppVersion());
        writer.name("old_app_version");
        this.nullableStringAdapter.toJson(writer, value_.getOldAppVersion());
        writer.name("old_bundle_version");
        this.nullableStringAdapter.toJson(writer, value_.getOldBundleVersion());
        writer.endObject();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(");
        sb.append("InstallEventData");
        sb.append(')');
        return sb.toString();
    }
}
