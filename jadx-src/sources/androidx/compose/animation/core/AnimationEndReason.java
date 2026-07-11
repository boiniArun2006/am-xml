package androidx.compose.animation.core;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/animation/core/AnimationEndReason;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnimationEndReason {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ AnimationEndReason[] f15434O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AnimationEndReason f15435n = new AnimationEndReason("BoundReached", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AnimationEndReason f15436t = new AnimationEndReason("Finished", 1);

    private static final /* synthetic */ AnimationEndReason[] n() {
        return new AnimationEndReason[]{f15435n, f15436t};
    }

    public static AnimationEndReason valueOf(String str) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, str);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) f15434O.clone();
    }

    static {
        AnimationEndReason[] animationEndReasonArrN = n();
        f15434O = animationEndReasonArrN;
        J2 = EnumEntriesKt.enumEntries(animationEndReasonArrN);
    }

    private AnimationEndReason(String str, int i2) {
    }
}
