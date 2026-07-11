package com.alightcreative.app.motion.scene.liveshape;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/alightcreative/app/motion/scene/liveshape/ShapeHandleType;", "", "<init>", "(Ljava/lang/String;I)V", "X", "Y", "XY", "Angle", "Radius", "Axis", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShapeHandleType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShapeHandleType[] $VALUES;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final ShapeHandleType f46106X = new ShapeHandleType("X", 0);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final ShapeHandleType f46107Y = new ShapeHandleType("Y", 1);
    public static final ShapeHandleType XY = new ShapeHandleType("XY", 2);
    public static final ShapeHandleType Angle = new ShapeHandleType("Angle", 3);
    public static final ShapeHandleType Radius = new ShapeHandleType("Radius", 4);
    public static final ShapeHandleType Axis = new ShapeHandleType("Axis", 5);

    private static final /* synthetic */ ShapeHandleType[] $values() {
        return new ShapeHandleType[]{f46106X, f46107Y, XY, Angle, Radius, Axis};
    }

    public static EnumEntries<ShapeHandleType> getEntries() {
        return $ENTRIES;
    }

    static {
        ShapeHandleType[] shapeHandleTypeArr$values = $values();
        $VALUES = shapeHandleTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(shapeHandleTypeArr$values);
    }

    public static ShapeHandleType valueOf(String str) {
        return (ShapeHandleType) Enum.valueOf(ShapeHandleType.class, str);
    }

    public static ShapeHandleType[] values() {
        return (ShapeHandleType[]) $VALUES.clone();
    }

    private ShapeHandleType(String str, int i2) {
    }
}
