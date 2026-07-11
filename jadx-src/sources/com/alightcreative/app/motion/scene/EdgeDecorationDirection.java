package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/alightcreative/app/motion/scene/EdgeDecorationDirection;", "", "<init>", "(Ljava/lang/String;I)V", "INSIDE", "OUTSIDE", "CENTERED", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EdgeDecorationDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EdgeDecorationDirection[] $VALUES;
    public static final EdgeDecorationDirection INSIDE = new EdgeDecorationDirection("INSIDE", 0);
    public static final EdgeDecorationDirection OUTSIDE = new EdgeDecorationDirection("OUTSIDE", 1);
    public static final EdgeDecorationDirection CENTERED = new EdgeDecorationDirection("CENTERED", 2);

    private static final /* synthetic */ EdgeDecorationDirection[] $values() {
        return new EdgeDecorationDirection[]{INSIDE, OUTSIDE, CENTERED};
    }

    public static EnumEntries<EdgeDecorationDirection> getEntries() {
        return $ENTRIES;
    }

    static {
        EdgeDecorationDirection[] edgeDecorationDirectionArr$values = $values();
        $VALUES = edgeDecorationDirectionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(edgeDecorationDirectionArr$values);
    }

    public static EdgeDecorationDirection valueOf(String str) {
        return (EdgeDecorationDirection) Enum.valueOf(EdgeDecorationDirection.class, str);
    }

    public static EdgeDecorationDirection[] values() {
        return (EdgeDecorationDirection[]) $VALUES.clone();
    }

    private EdgeDecorationDirection(String str, int i2) {
    }
}
