package androidx.compose.ui.hapticfeedback;

import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001c\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedbackType;", "", "<init>", "()V", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "rl", "I", c.f62177j, "()I", "Confirm", "t", "ContextClick", "nr", "GestureEnd", "O", "GestureThresholdActivate", "J2", "LongPress", "Uo", "Reject", "KN", "SegmentFrequentTick", "xMQ", "SegmentTick", "mUb", "TextHandleMove", "gh", "ToggleOff", "qie", "ToggleOn", "az", "VirtualKey", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PlatformHapticFeedbackType {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final PlatformHapticFeedbackType f31951n = new PlatformHapticFeedbackType();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final int Confirm = HapticFeedbackType.n(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final int ContextClick = HapticFeedbackType.n(6);

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private static final int GestureEnd = HapticFeedbackType.n(13);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private static final int GestureThresholdActivate = HapticFeedbackType.n(23);

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private static final int LongPress = HapticFeedbackType.n(0);

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private static final int Reject = HapticFeedbackType.n(17);

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private static final int SegmentFrequentTick = HapticFeedbackType.n(27);

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private static final int SegmentTick = HapticFeedbackType.n(26);

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private static final int TextHandleMove = HapticFeedbackType.n(9);

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private static final int ToggleOff = HapticFeedbackType.n(22);

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private static final int ToggleOn = HapticFeedbackType.n(21);

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private static final int VirtualKey = HapticFeedbackType.n(1);

    public final int J2() {
        return Reject;
    }

    public final int KN() {
        return SegmentTick;
    }

    public final int O() {
        return LongPress;
    }

    public final int Uo() {
        return SegmentFrequentTick;
    }

    public final int gh() {
        return ToggleOn;
    }

    public final int mUb() {
        return ToggleOff;
    }

    public final int n() {
        return Confirm;
    }

    public final int nr() {
        return GestureThresholdActivate;
    }

    public final int qie() {
        return VirtualKey;
    }

    public final int rl() {
        return ContextClick;
    }

    public final int t() {
        return GestureEnd;
    }

    public final int xMQ() {
        return TextHandleMove;
    }

    private PlatformHapticFeedbackType() {
    }
}
