package com.alightcreative.app.motion.scene.userparam;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/alightcreative/app/motion/scene/userparam/TextureSrcType;", "", "<init>", "(Ljava/lang/String;I)V", "CONTENT", "COMPOSITION", "USER", "IMAGE", "BUFFER", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextureSrcType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextureSrcType[] $VALUES;
    public static final TextureSrcType CONTENT = new TextureSrcType("CONTENT", 0);
    public static final TextureSrcType COMPOSITION = new TextureSrcType("COMPOSITION", 1);
    public static final TextureSrcType USER = new TextureSrcType("USER", 2);
    public static final TextureSrcType IMAGE = new TextureSrcType("IMAGE", 3);
    public static final TextureSrcType BUFFER = new TextureSrcType("BUFFER", 4);

    private static final /* synthetic */ TextureSrcType[] $values() {
        return new TextureSrcType[]{CONTENT, COMPOSITION, USER, IMAGE, BUFFER};
    }

    public static EnumEntries<TextureSrcType> getEntries() {
        return $ENTRIES;
    }

    static {
        TextureSrcType[] textureSrcTypeArr$values = $values();
        $VALUES = textureSrcTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(textureSrcTypeArr$values);
    }

    public static TextureSrcType valueOf(String str) {
        return (TextureSrcType) Enum.valueOf(TextureSrcType.class, str);
    }

    public static TextureSrcType[] values() {
        return (TextureSrcType[]) $VALUES.clone();
    }

    private TextureSrcType(String str, int i2) {
    }
}
