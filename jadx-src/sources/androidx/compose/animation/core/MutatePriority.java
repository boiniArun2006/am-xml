package androidx.compose.animation.core;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/core/MutatePriority;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutatePriority {
    private static final /* synthetic */ MutatePriority[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f15545r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final MutatePriority f15544n = new MutatePriority("Default", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final MutatePriority f15546t = new MutatePriority("UserInput", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final MutatePriority f15543O = new MutatePriority("PreventUserInput", 2);

    private static final /* synthetic */ MutatePriority[] n() {
        return new MutatePriority[]{f15544n, f15546t, f15543O};
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) J2.clone();
    }

    static {
        MutatePriority[] mutatePriorityArrN = n();
        J2 = mutatePriorityArrN;
        f15545r = EnumEntriesKt.enumEntries(mutatePriorityArrN);
    }

    private MutatePriority(String str, int i2) {
    }
}
