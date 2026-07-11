package androidx.compose.ui.hapticfeedback;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", "", "value", c.f62177j, "(I)I", "", "O", "(I)Ljava/lang/String;", "nr", InneractiveMediationNameConsts.OTHER, "", "rl", "(ILjava/lang/Object;)Z", "I", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class HapticFeedbackType {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0015\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006R\u0017\u0010\u001b\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", c.f62177j, "()I", "Confirm", "rl", "ContextClick", "t", "GestureEnd", "nr", "GestureThresholdActivate", "O", "LongPress", "J2", "Reject", "Uo", "SegmentFrequentTick", "KN", "SegmentTick", "xMQ", "TextHandleMove", "mUb", "ToggleOff", "gh", "ToggleOn", "qie", "VirtualKey", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int J2() {
            return PlatformHapticFeedbackType.f31951n.J2();
        }

        public final int KN() {
            return PlatformHapticFeedbackType.f31951n.KN();
        }

        public final int O() {
            return PlatformHapticFeedbackType.f31951n.O();
        }

        public final int Uo() {
            return PlatformHapticFeedbackType.f31951n.Uo();
        }

        public final int gh() {
            return PlatformHapticFeedbackType.f31951n.gh();
        }

        public final int mUb() {
            return PlatformHapticFeedbackType.f31951n.mUb();
        }

        public final int n() {
            return PlatformHapticFeedbackType.f31951n.n();
        }

        public final int nr() {
            return PlatformHapticFeedbackType.f31951n.nr();
        }

        public final int qie() {
            return PlatformHapticFeedbackType.f31951n.qie();
        }

        public final int rl() {
            return PlatformHapticFeedbackType.f31951n.rl();
        }

        public final int t() {
            return PlatformHapticFeedbackType.f31951n.t();
        }

        public final int xMQ() {
            return PlatformHapticFeedbackType.f31951n.xMQ();
        }
    }

    public static int n(int i2) {
        return i2;
    }

    public static int nr(int i2) {
        return Integer.hashCode(i2);
    }

    public static boolean rl(int i2, Object obj) {
        return (obj instanceof HapticFeedbackType) && i2 == ((HapticFeedbackType) obj).getValue();
    }

    public static final boolean t(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return rl(this.value, obj);
    }

    public int hashCode() {
        return nr(this.value);
    }

    public static String O(int i2) {
        Companion companion = INSTANCE;
        return t(i2, companion.n()) ? "Confirm" : t(i2, companion.rl()) ? "ContextClick" : t(i2, companion.t()) ? "GestureEnd" : t(i2, companion.nr()) ? "GestureThresholdActivate" : t(i2, companion.O()) ? "LongPress" : t(i2, companion.J2()) ? "Reject" : t(i2, companion.Uo()) ? "SegmentFrequentTick" : t(i2, companion.KN()) ? "SegmentTick" : t(i2, companion.xMQ()) ? "TextHandleMove" : t(i2, companion.mUb()) ? "ToggleOff" : t(i2, companion.gh()) ? "ToggleOn" : t(i2, companion.qie()) ? "VirtualKey" : "Invalid";
    }

    public String toString() {
        return O(this.value);
    }
}
