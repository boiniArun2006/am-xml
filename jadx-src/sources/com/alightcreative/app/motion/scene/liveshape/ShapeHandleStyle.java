package com.alightcreative.app.motion.scene.liveshape;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Round", "Square", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShapeHandleStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShapeHandleStyle[] $VALUES;
    public static final ShapeHandleStyle Round = new ShapeHandleStyle("Round", 0);
    public static final ShapeHandleStyle Square = new ShapeHandleStyle("Square", 1);

    private static final /* synthetic */ ShapeHandleStyle[] $values() {
        return new ShapeHandleStyle[]{Round, Square};
    }

    public static EnumEntries<ShapeHandleStyle> getEntries() {
        return $ENTRIES;
    }

    static {
        ShapeHandleStyle[] shapeHandleStyleArr$values = $values();
        $VALUES = shapeHandleStyleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(shapeHandleStyleArr$values);
    }

    public static ShapeHandleStyle valueOf(String str) {
        return (ShapeHandleStyle) Enum.valueOf(ShapeHandleStyle.class, str);
    }

    public static ShapeHandleStyle[] values() {
        return (ShapeHandleStyle[]) $VALUES.clone();
    }

    private ShapeHandleStyle(String str, int i2) {
    }
}
