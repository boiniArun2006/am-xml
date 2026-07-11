package com.alightcreative.app.motion.scene.rendering;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/alightcreative/app/motion/scene/rendering/TextureCropMode;", "", "<init>", "(Ljava/lang/String;I)V", "STRETCH", "FIT", "FILL", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextureCropMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextureCropMode[] $VALUES;
    public static final TextureCropMode STRETCH = new TextureCropMode("STRETCH", 0);
    public static final TextureCropMode FIT = new TextureCropMode("FIT", 1);
    public static final TextureCropMode FILL = new TextureCropMode("FILL", 2);

    private static final /* synthetic */ TextureCropMode[] $values() {
        return new TextureCropMode[]{STRETCH, FIT, FILL};
    }

    public static EnumEntries<TextureCropMode> getEntries() {
        return $ENTRIES;
    }

    static {
        TextureCropMode[] textureCropModeArr$values = $values();
        $VALUES = textureCropModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(textureCropModeArr$values);
    }

    public static TextureCropMode valueOf(String str) {
        return (TextureCropMode) Enum.valueOf(TextureCropMode.class, str);
    }

    public static TextureCropMode[] values() {
        return (TextureCropMode[]) $VALUES.clone();
    }

    private TextureCropMode(String str, int i2) {
    }
}
