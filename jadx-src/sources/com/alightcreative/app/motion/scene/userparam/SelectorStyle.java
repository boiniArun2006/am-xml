package com.alightcreative.app.motion.scene.userparam;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/SelectorStyle;", "", "<init>", "(Ljava/lang/String;I)V", "DROPDOWN", "RADIO", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectorStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SelectorStyle[] $VALUES;
    public static final SelectorStyle DROPDOWN = new SelectorStyle("DROPDOWN", 0);
    public static final SelectorStyle RADIO = new SelectorStyle("RADIO", 1);

    private static final /* synthetic */ SelectorStyle[] $values() {
        return new SelectorStyle[]{DROPDOWN, RADIO};
    }

    public static EnumEntries<SelectorStyle> getEntries() {
        return $ENTRIES;
    }

    static {
        SelectorStyle[] selectorStyleArr$values = $values();
        $VALUES = selectorStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(selectorStyleArr$values);
    }

    public static SelectorStyle valueOf(String str) {
        return (SelectorStyle) Enum.valueOf(SelectorStyle.class, str);
    }

    public static SelectorStyle[] values() {
        return (SelectorStyle[]) $VALUES.clone();
    }

    private SelectorStyle(String str, int i2) {
    }
}
