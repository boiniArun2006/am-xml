package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/alightcreative/app/motion/scene/ExportProblem;", "", "<init>", "(Ljava/lang/String;I)V", "SceneResTooHigh", "SceneResTooHighWithVideo", "ContentResTooHigh", "ContentTooHeavy", "MissingOrErrorContent", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExportProblem {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExportProblem[] $VALUES;
    public static final ExportProblem SceneResTooHigh = new ExportProblem("SceneResTooHigh", 0);
    public static final ExportProblem SceneResTooHighWithVideo = new ExportProblem("SceneResTooHighWithVideo", 1);
    public static final ExportProblem ContentResTooHigh = new ExportProblem("ContentResTooHigh", 2);
    public static final ExportProblem ContentTooHeavy = new ExportProblem("ContentTooHeavy", 3);
    public static final ExportProblem MissingOrErrorContent = new ExportProblem("MissingOrErrorContent", 4);

    private static final /* synthetic */ ExportProblem[] $values() {
        return new ExportProblem[]{SceneResTooHigh, SceneResTooHighWithVideo, ContentResTooHigh, ContentTooHeavy, MissingOrErrorContent};
    }

    public static EnumEntries<ExportProblem> getEntries() {
        return $ENTRIES;
    }

    static {
        ExportProblem[] exportProblemArr$values = $values();
        $VALUES = exportProblemArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(exportProblemArr$values);
    }

    public static ExportProblem valueOf(String str) {
        return (ExportProblem) Enum.valueOf(ExportProblem.class, str);
    }

    public static ExportProblem[] values() {
        return (ExportProblem[]) $VALUES.clone();
    }

    private ExportProblem(String str, int i2) {
    }
}
