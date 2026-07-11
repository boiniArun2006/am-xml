package com.alightcreative.app.motion.scene;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/alightcreative/app/motion/scene/GroupBoundsMode;", "", "<init>", "(Ljava/lang/String;I)V", "WRAP_ELEMENTS", "MATCH_SCENE", "UNION_ELEMENTS_SCENE", "AUTO", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupBoundsMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GroupBoundsMode[] $VALUES;
    public static final GroupBoundsMode WRAP_ELEMENTS = new GroupBoundsMode("WRAP_ELEMENTS", 0);
    public static final GroupBoundsMode MATCH_SCENE = new GroupBoundsMode("MATCH_SCENE", 1);
    public static final GroupBoundsMode UNION_ELEMENTS_SCENE = new GroupBoundsMode("UNION_ELEMENTS_SCENE", 2);
    public static final GroupBoundsMode AUTO = new GroupBoundsMode("AUTO", 3);

    private static final /* synthetic */ GroupBoundsMode[] $values() {
        return new GroupBoundsMode[]{WRAP_ELEMENTS, MATCH_SCENE, UNION_ELEMENTS_SCENE, AUTO};
    }

    public static EnumEntries<GroupBoundsMode> getEntries() {
        return $ENTRIES;
    }

    static {
        GroupBoundsMode[] groupBoundsModeArr$values = $values();
        $VALUES = groupBoundsModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(groupBoundsModeArr$values);
    }

    public static GroupBoundsMode valueOf(String str) {
        return (GroupBoundsMode) Enum.valueOf(GroupBoundsMode.class, str);
    }

    public static GroupBoundsMode[] values() {
        return (GroupBoundsMode[]) $VALUES.clone();
    }

    private GroupBoundsMode(String str, int i2) {
    }
}
