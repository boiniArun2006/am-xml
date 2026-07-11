package com.alightcreative.app.motion.scene.rendering;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/alightcreative/app/motion/scene/rendering/RenderMode;", "", "<init>", "(Ljava/lang/String;I)V", "PLAY", "PAUSE", "EXPORT", "THUMB", "SCENE_THUMB", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RenderMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RenderMode[] $VALUES;
    public static final RenderMode PLAY = new RenderMode("PLAY", 0);
    public static final RenderMode PAUSE = new RenderMode("PAUSE", 1);
    public static final RenderMode EXPORT = new RenderMode("EXPORT", 2);
    public static final RenderMode THUMB = new RenderMode("THUMB", 3);
    public static final RenderMode SCENE_THUMB = new RenderMode("SCENE_THUMB", 4);

    private static final /* synthetic */ RenderMode[] $values() {
        return new RenderMode[]{PLAY, PAUSE, EXPORT, THUMB, SCENE_THUMB};
    }

    public static EnumEntries<RenderMode> getEntries() {
        return $ENTRIES;
    }

    static {
        RenderMode[] renderModeArr$values = $values();
        $VALUES = renderModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(renderModeArr$values);
    }

    public static RenderMode valueOf(String str) {
        return (RenderMode) Enum.valueOf(RenderMode.class, str);
    }

    public static RenderMode[] values() {
        return (RenderMode[]) $VALUES.clone();
    }

    private RenderMode(String str, int i2) {
    }
}
