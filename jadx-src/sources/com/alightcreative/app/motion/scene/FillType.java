package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/alightcreative/app/motion/scene/FillType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "COLOR", "MEDIA", "GRADIENT", "INTRINSIC", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FillType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FillType[] $VALUES;
    public static final FillType NONE = new FillType("NONE", 0);
    public static final FillType COLOR = new FillType("COLOR", 1);
    public static final FillType MEDIA = new FillType("MEDIA", 2);
    public static final FillType GRADIENT = new FillType("GRADIENT", 3);
    public static final FillType INTRINSIC = new FillType("INTRINSIC", 4);

    private static final /* synthetic */ FillType[] $values() {
        return new FillType[]{NONE, COLOR, MEDIA, GRADIENT, INTRINSIC};
    }

    public static EnumEntries<FillType> getEntries() {
        return $ENTRIES;
    }

    static {
        FillType[] fillTypeArr$values = $values();
        $VALUES = fillTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(fillTypeArr$values);
    }

    public static FillType valueOf(String str) {
        return (FillType) Enum.valueOf(FillType.class, str);
    }

    public static FillType[] values() {
        return (FillType[]) $VALUES.clone();
    }

    private FillType(String str, int i2) {
    }
}
