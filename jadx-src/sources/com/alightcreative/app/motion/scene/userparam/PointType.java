package com.alightcreative.app.motion.scene.userparam;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/PointType;", "", "<init>", "(Ljava/lang/String;I)V", "SCREEN", "LAYER", "OFFSET", "SIZE", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PointType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PointType[] $VALUES;
    public static final PointType SCREEN = new PointType("SCREEN", 0);
    public static final PointType LAYER = new PointType("LAYER", 1);
    public static final PointType OFFSET = new PointType("OFFSET", 2);
    public static final PointType SIZE = new PointType("SIZE", 3);

    private static final /* synthetic */ PointType[] $values() {
        return new PointType[]{SCREEN, LAYER, OFFSET, SIZE};
    }

    public static EnumEntries<PointType> getEntries() {
        return $ENTRIES;
    }

    static {
        PointType[] pointTypeArr$values = $values();
        $VALUES = pointTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(pointTypeArr$values);
    }

    public static PointType valueOf(String str) {
        return (PointType) Enum.valueOf(PointType.class, str);
    }

    public static PointType[] values() {
        return (PointType[]) $VALUES.clone();
    }

    private PointType(String str, int i2) {
    }
}
