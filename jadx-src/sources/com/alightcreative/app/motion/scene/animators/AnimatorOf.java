package com.alightcreative.app.motion.scene.animators;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/alightcreative/app/motion/scene/animators/AnimatorOf;", "", "<init>", "(Ljava/lang/String;I)V", "Rotate", "Scale", "Skew", "Location", "Orientation", "Color", "Thickness", "Opacity", "Gain", "Float", "Pivot", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnimatorOf {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnimatorOf[] $VALUES;
    public static final AnimatorOf Rotate = new AnimatorOf("Rotate", 0);
    public static final AnimatorOf Scale = new AnimatorOf("Scale", 1);
    public static final AnimatorOf Skew = new AnimatorOf("Skew", 2);
    public static final AnimatorOf Location = new AnimatorOf("Location", 3);
    public static final AnimatorOf Orientation = new AnimatorOf("Orientation", 4);
    public static final AnimatorOf Color = new AnimatorOf("Color", 5);
    public static final AnimatorOf Thickness = new AnimatorOf("Thickness", 6);
    public static final AnimatorOf Opacity = new AnimatorOf("Opacity", 7);
    public static final AnimatorOf Gain = new AnimatorOf("Gain", 8);
    public static final AnimatorOf Float = new AnimatorOf("Float", 9);
    public static final AnimatorOf Pivot = new AnimatorOf("Pivot", 10);

    private static final /* synthetic */ AnimatorOf[] $values() {
        return new AnimatorOf[]{Rotate, Scale, Skew, Location, Orientation, Color, Thickness, Opacity, Gain, Float, Pivot};
    }

    public static EnumEntries<AnimatorOf> getEntries() {
        return $ENTRIES;
    }

    static {
        AnimatorOf[] animatorOfArr$values = $values();
        $VALUES = animatorOfArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(animatorOfArr$values);
    }

    public static AnimatorOf valueOf(String str) {
        return (AnimatorOf) Enum.valueOf(AnimatorOf.class, str);
    }

    public static AnimatorOf[] values() {
        return (AnimatorOf[]) $VALUES.clone();
    }

    private AnimatorOf(String str, int i2) {
    }
}
