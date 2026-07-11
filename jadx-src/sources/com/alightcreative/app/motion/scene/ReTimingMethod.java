package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/alightcreative/app/motion/scene/ReTimingMethod;", "", "<init>", "(Ljava/lang/String;I)V", "STRETCH", "FREEZE", "LOOP", "LOOP_STRETCH", "BLANK", "OFF", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReTimingMethod {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReTimingMethod[] $VALUES;
    public static final ReTimingMethod STRETCH = new ReTimingMethod("STRETCH", 0);
    public static final ReTimingMethod FREEZE = new ReTimingMethod("FREEZE", 1);
    public static final ReTimingMethod LOOP = new ReTimingMethod("LOOP", 2);
    public static final ReTimingMethod LOOP_STRETCH = new ReTimingMethod("LOOP_STRETCH", 3);
    public static final ReTimingMethod BLANK = new ReTimingMethod("BLANK", 4);
    public static final ReTimingMethod OFF = new ReTimingMethod("OFF", 5);

    private static final /* synthetic */ ReTimingMethod[] $values() {
        return new ReTimingMethod[]{STRETCH, FREEZE, LOOP, LOOP_STRETCH, BLANK, OFF};
    }

    public static EnumEntries<ReTimingMethod> getEntries() {
        return $ENTRIES;
    }

    static {
        ReTimingMethod[] reTimingMethodArr$values = $values();
        $VALUES = reTimingMethodArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(reTimingMethodArr$values);
    }

    public static ReTimingMethod valueOf(String str) {
        return (ReTimingMethod) Enum.valueOf(ReTimingMethod.class, str);
    }

    public static ReTimingMethod[] values() {
        return (ReTimingMethod[]) $VALUES.clone();
    }

    private ReTimingMethod(String str, int i2) {
    }
}
