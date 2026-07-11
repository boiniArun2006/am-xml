package com.alightcreative.monorepo.settings;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/monorepo/settings/ExportFeature;", "", "<init>", "(Ljava/lang/String;I)V", "TEMPLATE", "UNDEFINED", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExportFeature {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExportFeature[] $VALUES;
    public static final ExportFeature TEMPLATE = new ExportFeature("TEMPLATE", 0);
    public static final ExportFeature UNDEFINED = new ExportFeature("UNDEFINED", 1);

    private static final /* synthetic */ ExportFeature[] $values() {
        return new ExportFeature[]{TEMPLATE, UNDEFINED};
    }

    public static EnumEntries<ExportFeature> getEntries() {
        return $ENTRIES;
    }

    static {
        ExportFeature[] exportFeatureArr$values = $values();
        $VALUES = exportFeatureArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(exportFeatureArr$values);
    }

    public static ExportFeature valueOf(String str) {
        return (ExportFeature) Enum.valueOf(ExportFeature.class, str);
    }

    public static ExportFeature[] values() {
        return (ExportFeature[]) $VALUES.clone();
    }

    private ExportFeature(String str, int i2) {
    }
}
