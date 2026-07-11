package com.alightcreative.app.motion.scene.scripting;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/alightcreative/app/motion/scene/scripting/ACScriptType;", "", "<init>", "(Ljava/lang/String;I)V", "JS", "External", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ACScriptType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ACScriptType[] $VALUES;
    public static final ACScriptType JS = new ACScriptType("JS", 0);
    public static final ACScriptType External = new ACScriptType("External", 1);

    private static final /* synthetic */ ACScriptType[] $values() {
        return new ACScriptType[]{JS, External};
    }

    public static EnumEntries<ACScriptType> getEntries() {
        return $ENTRIES;
    }

    static {
        ACScriptType[] aCScriptTypeArr$values = $values();
        $VALUES = aCScriptTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(aCScriptTypeArr$values);
    }

    public static ACScriptType valueOf(String str) {
        return (ACScriptType) Enum.valueOf(ACScriptType.class, str);
    }

    public static ACScriptType[] values() {
        return (ACScriptType[]) $VALUES.clone();
    }

    private ACScriptType(String str, int i2) {
    }
}
