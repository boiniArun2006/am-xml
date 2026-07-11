package com.alightcreative.app.motion.scene.liveshape;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleIcon;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Dot", "HollowDot", "Grip", "HollowArrow", "Arrow", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShapeHandleIcon {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShapeHandleIcon[] $VALUES;
    public static final ShapeHandleIcon None = new ShapeHandleIcon("None", 0);
    public static final ShapeHandleIcon Dot = new ShapeHandleIcon("Dot", 1);
    public static final ShapeHandleIcon HollowDot = new ShapeHandleIcon("HollowDot", 2);
    public static final ShapeHandleIcon Grip = new ShapeHandleIcon("Grip", 3);
    public static final ShapeHandleIcon HollowArrow = new ShapeHandleIcon("HollowArrow", 4);
    public static final ShapeHandleIcon Arrow = new ShapeHandleIcon("Arrow", 5);

    private static final /* synthetic */ ShapeHandleIcon[] $values() {
        return new ShapeHandleIcon[]{None, Dot, HollowDot, Grip, HollowArrow, Arrow};
    }

    public static EnumEntries<ShapeHandleIcon> getEntries() {
        return $ENTRIES;
    }

    static {
        ShapeHandleIcon[] shapeHandleIconArr$values = $values();
        $VALUES = shapeHandleIconArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(shapeHandleIconArr$values);
    }

    public static ShapeHandleIcon valueOf(String str) {
        return (ShapeHandleIcon) Enum.valueOf(ShapeHandleIcon.class, str);
    }

    public static ShapeHandleIcon[] values() {
        return (ShapeHandleIcon[]) $VALUES.clone();
    }

    private ShapeHandleIcon(String str, int i2) {
    }
}
