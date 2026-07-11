package com.alightcreative.app.motion.scene.userparam;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/SliderType;", "", "<init>", "(Ljava/lang/String;I)V", "FLOAT", "INTEGER", "PERCENT", "RELATIVE_PERCENT", "RELATIVE_FLOAT", "ANGLE", "ANGLE_RANGE", "SECONDS", "FRAMES", "HZ", "RPM", "KELVIN", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SliderType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SliderType[] $VALUES;
    public static final SliderType FLOAT = new SliderType("FLOAT", 0);
    public static final SliderType INTEGER = new SliderType("INTEGER", 1);
    public static final SliderType PERCENT = new SliderType("PERCENT", 2);
    public static final SliderType RELATIVE_PERCENT = new SliderType("RELATIVE_PERCENT", 3);
    public static final SliderType RELATIVE_FLOAT = new SliderType("RELATIVE_FLOAT", 4);
    public static final SliderType ANGLE = new SliderType("ANGLE", 5);
    public static final SliderType ANGLE_RANGE = new SliderType("ANGLE_RANGE", 6);
    public static final SliderType SECONDS = new SliderType("SECONDS", 7);
    public static final SliderType FRAMES = new SliderType("FRAMES", 8);

    /* JADX INFO: renamed from: HZ, reason: collision with root package name */
    public static final SliderType f46339HZ = new SliderType("HZ", 9);
    public static final SliderType RPM = new SliderType("RPM", 10);
    public static final SliderType KELVIN = new SliderType("KELVIN", 11);

    private static final /* synthetic */ SliderType[] $values() {
        return new SliderType[]{FLOAT, INTEGER, PERCENT, RELATIVE_PERCENT, RELATIVE_FLOAT, ANGLE, ANGLE_RANGE, SECONDS, FRAMES, f46339HZ, RPM, KELVIN};
    }

    public static EnumEntries<SliderType> getEntries() {
        return $ENTRIES;
    }

    static {
        SliderType[] sliderTypeArr$values = $values();
        $VALUES = sliderTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(sliderTypeArr$values);
    }

    public static SliderType valueOf(String str) {
        return (SliderType) Enum.valueOf(SliderType.class, str);
    }

    public static SliderType[] values() {
        return (SliderType[]) $VALUES.clone();
    }

    private SliderType(String str, int i2) {
    }
}
