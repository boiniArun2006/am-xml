package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/PausedCompositionState;", "", "<init>", "(Ljava/lang/String;I)V", c.f62177j, "t", "O", "J2", "r", "o", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PausedCompositionState {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f30249S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final /* synthetic */ PausedCompositionState[] f30250Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final PausedCompositionState f30251n = new PausedCompositionState("Invalid", 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final PausedCompositionState f30254t = new PausedCompositionState("Cancelled", 1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final PausedCompositionState f30248O = new PausedCompositionState("InitialPending", 2);
    public static final PausedCompositionState J2 = new PausedCompositionState("RecomposePending", 3);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final PausedCompositionState f30253r = new PausedCompositionState("ApplyPending", 4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final PausedCompositionState f30252o = new PausedCompositionState("Applied", 5);

    private static final /* synthetic */ PausedCompositionState[] n() {
        return new PausedCompositionState[]{f30251n, f30254t, f30248O, J2, f30253r, f30252o};
    }

    public static PausedCompositionState valueOf(String str) {
        return (PausedCompositionState) Enum.valueOf(PausedCompositionState.class, str);
    }

    public static PausedCompositionState[] values() {
        return (PausedCompositionState[]) f30250Z.clone();
    }

    static {
        PausedCompositionState[] pausedCompositionStateArrN = n();
        f30250Z = pausedCompositionStateArrN;
        f30249S = EnumEntriesKt.enumEntries(pausedCompositionStateArrN);
    }

    private PausedCompositionState(String str, int i2) {
    }
}
