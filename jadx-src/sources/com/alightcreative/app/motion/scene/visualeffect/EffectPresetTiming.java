package com.alightcreative.app.motion.scene.visualeffect;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/EffectPresetTiming;", "", "<init>", "(Ljava/lang/String;I)V", "Stretch", "Extend", "ExtendMatch", "Split", "Start", "End", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EffectPresetTiming {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EffectPresetTiming[] $VALUES;
    public static final EffectPresetTiming Stretch = new EffectPresetTiming("Stretch", 0);
    public static final EffectPresetTiming Extend = new EffectPresetTiming("Extend", 1);
    public static final EffectPresetTiming ExtendMatch = new EffectPresetTiming("ExtendMatch", 2);
    public static final EffectPresetTiming Split = new EffectPresetTiming("Split", 3);
    public static final EffectPresetTiming Start = new EffectPresetTiming("Start", 4);
    public static final EffectPresetTiming End = new EffectPresetTiming("End", 5);

    private static final /* synthetic */ EffectPresetTiming[] $values() {
        return new EffectPresetTiming[]{Stretch, Extend, ExtendMatch, Split, Start, End};
    }

    public static EnumEntries<EffectPresetTiming> getEntries() {
        return $ENTRIES;
    }

    static {
        EffectPresetTiming[] effectPresetTimingArr$values = $values();
        $VALUES = effectPresetTimingArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(effectPresetTimingArr$values);
    }

    public static EffectPresetTiming valueOf(String str) {
        return (EffectPresetTiming) Enum.valueOf(EffectPresetTiming.class, str);
    }

    public static EffectPresetTiming[] values() {
        return (EffectPresetTiming[]) $VALUES.clone();
    }

    private EffectPresetTiming(String str, int i2) {
    }
}
