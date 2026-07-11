package com.alightcreative.app.motion.scene.visualeffect;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/alightcreative/app/motion/scene/visualeffect/EffectType;", "", "<init>", "(Ljava/lang/String;I)V", "SHADER", "DRAWING", "TEXT", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EffectType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EffectType[] $VALUES;
    public static final EffectType SHADER = new EffectType("SHADER", 0);
    public static final EffectType DRAWING = new EffectType("DRAWING", 1);
    public static final EffectType TEXT = new EffectType("TEXT", 2);

    private static final /* synthetic */ EffectType[] $values() {
        return new EffectType[]{SHADER, DRAWING, TEXT};
    }

    public static EnumEntries<EffectType> getEntries() {
        return $ENTRIES;
    }

    static {
        EffectType[] effectTypeArr$values = $values();
        $VALUES = effectTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(effectTypeArr$values);
    }

    public static EffectType valueOf(String str) {
        return (EffectType) Enum.valueOf(EffectType.class, str);
    }

    public static EffectType[] values() {
        return (EffectType[]) $VALUES.clone();
    }

    private EffectType(String str, int i2) {
    }
}
