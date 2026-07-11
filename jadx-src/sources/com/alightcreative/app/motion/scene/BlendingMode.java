package com.alightcreative.app.motion.scene;

import Hr.CQ.USEaHtCMH;
import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006+"}, d2 = {"Lcom/alightcreative/app/motion/scene/BlendingMode;", "", "id", "", "usesBackingStore", "", "blendEffect", "<init>", "(Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getUsesBackingStore", "()Z", "getBlendEffect", "NORMAL", "MULTIPLY", "SCREEN", "MASK", "CLIPPING_MASK", "EXCLUDE", "DIFF", "EXCLUSION", "LIGHTEN", "DARKEN", "LIGHTER_COLOR", "DARKER_COLOR", "COLOR_BURN", "LINEAR_BURN", "COLOR_DODGE", "LINEAR_DODGE", "OVERLAY", "SOFT_LIGHT", "HARD_LIGHT", "SOFT_OVERLAY", "VIVID_LIGHT", "LINEAR_LIGHT", "PIN_LIGHT", "HUE", "SATURATION", "COLOR", "LUMINANCE", "SUBTRACT", "DIVIDE", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BlendingMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BlendingMode[] $VALUES;
    private final String blendEffect;
    private final String id;
    private final boolean usesBackingStore;
    public static final BlendingMode NORMAL = new BlendingMode("NORMAL", 0, "normal", false, null, 6, null);
    public static final BlendingMode MULTIPLY = new BlendingMode(USEaHtCMH.NqLoQkvBP, 1, "multiply", true, "com.alightcreative.blend.colormultiply");
    public static final BlendingMode SCREEN = new BlendingMode("SCREEN", 2, "screen", false, 0 == true ? 1 : 0, 6, null);
    public static final BlendingMode MASK = new BlendingMode("MASK", 3, "mask", false, null, 6, null);
    public static final BlendingMode CLIPPING_MASK = new BlendingMode("CLIPPING_MASK", 4, "clipping-mask", false, null, 6, null);
    public static final BlendingMode EXCLUDE = new BlendingMode("EXCLUDE", 5, QiDPjiOCZHDS.RaSQWgNiQxsH, false, null, 6, null);
    public static final BlendingMode DIFF = new BlendingMode("DIFF", 6, "diff", true, "com.alightcreative.blend.diff");
    public static final BlendingMode EXCLUSION = new BlendingMode("EXCLUSION", 7, "exclusion", true, "com.alightcreative.blend.exclusion");
    public static final BlendingMode LIGHTEN = new BlendingMode("LIGHTEN", 8, "lighten", true, "com.alightcreative.blend.lighten");
    public static final BlendingMode DARKEN = new BlendingMode("DARKEN", 9, "darken", true, "com.alightcreative.blend.darken");
    public static final BlendingMode LIGHTER_COLOR = new BlendingMode("LIGHTER_COLOR", 10, "lighter-color", true, "com.alightcreative.blend.lightercolor");
    public static final BlendingMode DARKER_COLOR = new BlendingMode("DARKER_COLOR", 11, "darker-color", true, "com.alightcreative.blend.darkercolor");
    public static final BlendingMode COLOR_BURN = new BlendingMode("COLOR_BURN", 12, "color-burn", true, "com.alightcreative.blend.colorburn");
    public static final BlendingMode LINEAR_BURN = new BlendingMode("LINEAR_BURN", 13, "linear-burn", true, "com.alightcreative.blend.linearburn");
    public static final BlendingMode COLOR_DODGE = new BlendingMode("COLOR_DODGE", 14, "color-dodge", true, "com.alightcreative.blend.colordodge");
    public static final BlendingMode LINEAR_DODGE = new BlendingMode("LINEAR_DODGE", 15, "linear-dodge", true, "com.alightcreative.blend.lineardodge");
    public static final BlendingMode OVERLAY = new BlendingMode("OVERLAY", 16, "overlay", true, "com.alightcreative.blend.overlay");
    public static final BlendingMode SOFT_LIGHT = new BlendingMode("SOFT_LIGHT", 17, "soft-light", true, "com.alightcreative.blend.softlight");
    public static final BlendingMode HARD_LIGHT = new BlendingMode("HARD_LIGHT", 18, "hard-light", true, "com.alightcreative.blend.hardlight");
    public static final BlendingMode SOFT_OVERLAY = new BlendingMode("SOFT_OVERLAY", 19, "soft-overlay", true, "com.alightcreative.blend.softoverlay");
    public static final BlendingMode VIVID_LIGHT = new BlendingMode("VIVID_LIGHT", 20, "vivid-light", true, "com.alightcreative.blend.vividlight");
    public static final BlendingMode LINEAR_LIGHT = new BlendingMode("LINEAR_LIGHT", 21, "linear-light", true, "com.alightcreative.blend.linearlight");
    public static final BlendingMode PIN_LIGHT = new BlendingMode("PIN_LIGHT", 22, "pin-light", true, "com.alightcreative.blend.pinlight");
    public static final BlendingMode HUE = new BlendingMode("HUE", 23, "hue", true, "com.alightcreative.blend.hue");
    public static final BlendingMode SATURATION = new BlendingMode("SATURATION", 24, "saturation", true, "com.alightcreative.blend.saturation");
    public static final BlendingMode COLOR = new BlendingMode("COLOR", 25, TtmlNode.ATTR_TTS_COLOR, true, "com.alightcreative.blend.color");
    public static final BlendingMode LUMINANCE = new BlendingMode("LUMINANCE", 26, "luminance", true, "com.alightcreative.blend.luminance");
    public static final BlendingMode SUBTRACT = new BlendingMode("SUBTRACT", 27, "subtract", true, "com.alightcreative.blend.subtract");
    public static final BlendingMode DIVIDE = new BlendingMode("DIVIDE", 28, "divide", true, "com.alightcreative.blend.divide");

    private static final /* synthetic */ BlendingMode[] $values() {
        return new BlendingMode[]{NORMAL, MULTIPLY, SCREEN, MASK, CLIPPING_MASK, EXCLUDE, DIFF, EXCLUSION, LIGHTEN, DARKEN, LIGHTER_COLOR, DARKER_COLOR, COLOR_BURN, LINEAR_BURN, COLOR_DODGE, LINEAR_DODGE, OVERLAY, SOFT_LIGHT, HARD_LIGHT, SOFT_OVERLAY, VIVID_LIGHT, LINEAR_LIGHT, PIN_LIGHT, HUE, SATURATION, COLOR, LUMINANCE, SUBTRACT, DIVIDE};
    }

    private BlendingMode(String str, int i2, String str2, boolean z2, String str3) {
        this.id = str2;
        this.usesBackingStore = z2;
        this.blendEffect = str3;
    }

    public static EnumEntries<BlendingMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        BlendingMode[] blendingModeArr$values = $values();
        $VALUES = blendingModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(blendingModeArr$values);
    }

    public static BlendingMode valueOf(String str) {
        return (BlendingMode) Enum.valueOf(BlendingMode.class, str);
    }

    public static BlendingMode[] values() {
        return (BlendingMode[]) $VALUES.clone();
    }

    public final String getBlendEffect() {
        return this.blendEffect;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getUsesBackingStore() {
        return this.usesBackingStore;
    }

    /* synthetic */ BlendingMode(String str, int i2, String str2, boolean z2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i2, str2, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? null : str3);
    }
}
