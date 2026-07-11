package com.alightcreative.app.motion.scene.userparam;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/XYZType;", "", "<init>", "(Ljava/lang/String;I)V", "Rotate3D", "Translate3D", "Scale3D", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class XYZType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ XYZType[] $VALUES;
    public static final XYZType Rotate3D = new XYZType("Rotate3D", 0);
    public static final XYZType Translate3D = new XYZType("Translate3D", 1);
    public static final XYZType Scale3D = new XYZType("Scale3D", 2);

    private static final /* synthetic */ XYZType[] $values() {
        return new XYZType[]{Rotate3D, Translate3D, Scale3D};
    }

    public static EnumEntries<XYZType> getEntries() {
        return $ENTRIES;
    }

    static {
        XYZType[] xYZTypeArr$values = $values();
        $VALUES = xYZTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(xYZTypeArr$values);
    }

    public static XYZType valueOf(String str) {
        return (XYZType) Enum.valueOf(XYZType.class, str);
    }

    public static XYZType[] values() {
        return (XYZType[]) $VALUES.clone();
    }

    private XYZType(String str, int i2) {
    }
}
