package com.alightcreative.app.motion.scene.userparam;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/HintType;", "", "<init>", "(Ljava/lang/String;I)V", "EDITFIRST", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HintType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HintType[] $VALUES;
    public static final HintType EDITFIRST = new HintType("EDITFIRST", 0);

    private static final /* synthetic */ HintType[] $values() {
        return new HintType[]{EDITFIRST};
    }

    public static EnumEntries<HintType> getEntries() {
        return $ENTRIES;
    }

    static {
        HintType[] hintTypeArr$values = $values();
        $VALUES = hintTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(hintTypeArr$values);
    }

    public static HintType valueOf(String str) {
        return (HintType) Enum.valueOf(HintType.class, str);
    }

    public static HintType[] values() {
        return (HintType[]) $VALUES.clone();
    }

    private HintType(String str, int i2) {
    }
}
