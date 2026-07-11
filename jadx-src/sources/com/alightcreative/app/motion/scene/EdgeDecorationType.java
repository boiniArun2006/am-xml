package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/alightcreative/app/motion/scene/EdgeDecorationType;", "", "<init>", "(Ljava/lang/String;I)V", "BORDER", "SHADOW", "GLOW", "STROKE", "NONE", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EdgeDecorationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EdgeDecorationType[] $VALUES;
    public static final EdgeDecorationType BORDER = new EdgeDecorationType("BORDER", 0);
    public static final EdgeDecorationType SHADOW = new EdgeDecorationType("SHADOW", 1);
    public static final EdgeDecorationType GLOW = new EdgeDecorationType("GLOW", 2);
    public static final EdgeDecorationType STROKE = new EdgeDecorationType("STROKE", 3);
    public static final EdgeDecorationType NONE = new EdgeDecorationType("NONE", 4);

    private static final /* synthetic */ EdgeDecorationType[] $values() {
        return new EdgeDecorationType[]{BORDER, SHADOW, GLOW, STROKE, NONE};
    }

    public static EnumEntries<EdgeDecorationType> getEntries() {
        return $ENTRIES;
    }

    static {
        EdgeDecorationType[] edgeDecorationTypeArr$values = $values();
        $VALUES = edgeDecorationTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(edgeDecorationTypeArr$values);
    }

    public static EdgeDecorationType valueOf(String str) {
        return (EdgeDecorationType) Enum.valueOf(EdgeDecorationType.class, str);
    }

    public static EdgeDecorationType[] values() {
        return (EdgeDecorationType[]) $VALUES.clone();
    }

    private EdgeDecorationType(String str, int i2) {
    }
}
