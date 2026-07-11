package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/alightcreative/app/motion/scene/PrecomposeType;", "", "tag", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTag", "()Ljava/lang/String;", "OFF", "DYNAMIC", "FIXED", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PrecomposeType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PrecomposeType[] $VALUES;
    private final String tag;
    public static final PrecomposeType OFF = new PrecomposeType("OFF", 0, "off");
    public static final PrecomposeType DYNAMIC = new PrecomposeType("DYNAMIC", 1, "dynamicResolution");
    public static final PrecomposeType FIXED = new PrecomposeType("FIXED", 2, "fixedResolution");

    private static final /* synthetic */ PrecomposeType[] $values() {
        return new PrecomposeType[]{OFF, DYNAMIC, FIXED};
    }

    public static EnumEntries<PrecomposeType> getEntries() {
        return $ENTRIES;
    }

    static {
        PrecomposeType[] precomposeTypeArr$values = $values();
        $VALUES = precomposeTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(precomposeTypeArr$values);
    }

    public static PrecomposeType valueOf(String str) {
        return (PrecomposeType) Enum.valueOf(PrecomposeType.class, str);
    }

    public static PrecomposeType[] values() {
        return (PrecomposeType[]) $VALUES.clone();
    }

    public final String getTag() {
        return this.tag;
    }

    private PrecomposeType(String str, int i2, String str2) {
        this.tag = str2;
    }
}
