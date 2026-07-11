package com.alightcreative.app.motion.scene.scripting;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/scripting/ScriptGroup;", "", "<init>", "(Ljava/lang/String;I)V", "All", "BeforeRepeat", "ShaderCoop", "AfterRepeat", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScriptGroup {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScriptGroup[] $VALUES;
    public static final ScriptGroup All = new ScriptGroup("All", 0);
    public static final ScriptGroup BeforeRepeat = new ScriptGroup("BeforeRepeat", 1);
    public static final ScriptGroup ShaderCoop = new ScriptGroup("ShaderCoop", 2);
    public static final ScriptGroup AfterRepeat = new ScriptGroup("AfterRepeat", 3);

    private static final /* synthetic */ ScriptGroup[] $values() {
        return new ScriptGroup[]{All, BeforeRepeat, ShaderCoop, AfterRepeat};
    }

    public static EnumEntries<ScriptGroup> getEntries() {
        return $ENTRIES;
    }

    static {
        ScriptGroup[] scriptGroupArr$values = $values();
        $VALUES = scriptGroupArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(scriptGroupArr$values);
    }

    public static ScriptGroup valueOf(String str) {
        return (ScriptGroup) Enum.valueOf(ScriptGroup.class, str);
    }

    public static ScriptGroup[] values() {
        return (ScriptGroup[]) $VALUES.clone();
    }

    private ScriptGroup(String str, int i2) {
    }
}
