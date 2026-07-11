package androidx.compose.ui.focus;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "", "", "value", "mUb", "(I)I", "", "ty", "(I)Ljava/lang/String;", "az", InneractiveMediationNameConsts.OTHER, "", "gh", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class FocusDirection {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f31293t = mUb(1);
    private static final int nr = mUb(2);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f31292O = mUb(3);
    private static final int J2 = mUb(4);
    private static final int Uo = mUb(5);
    private static final int KN = mUb(6);
    private static final int xMQ = mUb(7);
    private static final int mUb = mUb(8);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/focus/FocusDirection;", "Next", "I", "O", "()I", "Previous", "J2", "Left", "nr", "Right", "Uo", "Up", "KN", "Down", c.f62177j, "Enter", "rl", "Exit", "t", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int J2() {
            return FocusDirection.nr;
        }

        public final int KN() {
            return FocusDirection.Uo;
        }

        public final int O() {
            return FocusDirection.f31293t;
        }

        public final int Uo() {
            return FocusDirection.J2;
        }

        public final int n() {
            return FocusDirection.KN;
        }

        public final int nr() {
            return FocusDirection.f31292O;
        }

        public final int rl() {
            return FocusDirection.xMQ;
        }

        public final int t() {
            return FocusDirection.mUb;
        }
    }

    public static int az(int i2) {
        return Integer.hashCode(i2);
    }

    public static boolean gh(int i2, Object obj) {
        return (obj instanceof FocusDirection) && i2 == ((FocusDirection) obj).getValue();
    }

    public static int mUb(int i2) {
        return i2;
    }

    public static final boolean qie(int i2, int i3) {
        return i2 == i3;
    }

    public static final /* synthetic */ FocusDirection xMQ(int i2) {
        return new FocusDirection(i2);
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return gh(this.value, obj);
    }

    public int hashCode() {
        return az(this.value);
    }

    public static String ty(int i2) {
        return qie(i2, f31293t) ? "Next" : qie(i2, nr) ? "Previous" : qie(i2, f31292O) ? "Left" : qie(i2, J2) ? "Right" : qie(i2, Uo) ? "Up" : qie(i2, KN) ? "Down" : qie(i2, xMQ) ? "Enter" : qie(i2, mUb) ? "Exit" : "Invalid FocusDirection";
    }

    public String toString() {
        return ty(this.value);
    }

    private /* synthetic */ FocusDirection(int i2) {
        this.value = i2;
    }
}
