package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/alightcreative/app/motion/scene/GradientType;", "", "<init>", "(Ljava/lang/String;I)V", "LINEAR", "RADIAL", "SWEEP", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GradientType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GradientType[] $VALUES;
    public static final GradientType LINEAR = new GradientType("LINEAR", 0);
    public static final GradientType RADIAL = new GradientType("RADIAL", 1);
    public static final GradientType SWEEP = new GradientType("SWEEP", 2);

    private static final /* synthetic */ GradientType[] $values() {
        return new GradientType[]{LINEAR, RADIAL, SWEEP};
    }

    public static EnumEntries<GradientType> getEntries() {
        return $ENTRIES;
    }

    static {
        GradientType[] gradientTypeArr$values = $values();
        $VALUES = gradientTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(gradientTypeArr$values);
    }

    public static GradientType valueOf(String str) {
        return (GradientType) Enum.valueOf(GradientType.class, str);
    }

    public static GradientType[] values() {
        return (GradientType[]) $VALUES.clone();
    }

    private GradientType(String str, int i2) {
    }
}
