package androidx.compose.animation;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/EnterExitState;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EnterExitState {
    private static final /* synthetic */ EnterExitState[] J2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f15176r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final EnterExitState f15175n = new EnterExitState("PreEnter", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final EnterExitState f15177t = new EnterExitState("Visible", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final EnterExitState f15174O = new EnterExitState("PostExit", 2);

    private static final /* synthetic */ EnterExitState[] n() {
        return new EnterExitState[]{f15175n, f15177t, f15174O};
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) J2.clone();
    }

    static {
        EnterExitState[] enterExitStateArrN = n();
        J2 = enterExitStateArrN;
        f15176r = EnumEntriesKt.enumEntries(enterExitStateArrN);
    }

    private EnterExitState(String str, int i2) {
    }
}
