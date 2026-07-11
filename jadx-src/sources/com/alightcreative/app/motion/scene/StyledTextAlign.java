package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/StyledTextAlign;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "CENTER", "RIGHT", "JUSTIFY", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StyledTextAlign {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StyledTextAlign[] $VALUES;
    public static final StyledTextAlign LEFT = new StyledTextAlign("LEFT", 0);
    public static final StyledTextAlign CENTER = new StyledTextAlign("CENTER", 1);
    public static final StyledTextAlign RIGHT = new StyledTextAlign("RIGHT", 2);
    public static final StyledTextAlign JUSTIFY = new StyledTextAlign("JUSTIFY", 3);

    private static final /* synthetic */ StyledTextAlign[] $values() {
        return new StyledTextAlign[]{LEFT, CENTER, RIGHT, JUSTIFY};
    }

    public static EnumEntries<StyledTextAlign> getEntries() {
        return $ENTRIES;
    }

    static {
        StyledTextAlign[] styledTextAlignArr$values = $values();
        $VALUES = styledTextAlignArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(styledTextAlignArr$values);
    }

    public static StyledTextAlign valueOf(String str) {
        return (StyledTextAlign) Enum.valueOf(StyledTextAlign.class, str);
    }

    public static StyledTextAlign[] values() {
        return (StyledTextAlign[]) $VALUES.clone();
    }

    private StyledTextAlign(String str, int i2) {
    }
}
