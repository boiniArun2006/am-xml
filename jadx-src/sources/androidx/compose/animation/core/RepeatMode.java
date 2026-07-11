package androidx.compose.animation.core;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/animation/core/RepeatMode;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RepeatMode {
    private static final /* synthetic */ EnumEntries J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ RepeatMode[] f15565O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final RepeatMode f15566n = new RepeatMode("Restart", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final RepeatMode f15567t = new RepeatMode("Reverse", 1);

    private static final /* synthetic */ RepeatMode[] n() {
        return new RepeatMode[]{f15566n, f15567t};
    }

    public static RepeatMode valueOf(String str) {
        return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
    }

    public static RepeatMode[] values() {
        return (RepeatMode[]) f15565O.clone();
    }

    static {
        RepeatMode[] repeatModeArrN = n();
        f15565O = repeatModeArrN;
        J2 = EnumEntriesKt.enumEntries(repeatModeArrN);
    }

    private RepeatMode(String str, int i2) {
    }
}
