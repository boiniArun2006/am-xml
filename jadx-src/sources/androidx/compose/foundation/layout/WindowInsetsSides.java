package androidx.compose.foundation.layout;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005J\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "", "value", "az", "(I)I", "sides", "r", "(II)I", "", "ck", "(II)Z", "", "o", "(I)Ljava/lang/String;", "XQ", "Ik", InneractiveMediationNameConsts.OTHER, "ty", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class WindowInsetsSides {
    private static final int J2;
    private static final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f17916O;
    private static final int Uo;
    private static final int az;
    private static final int gh;
    private static final int mUb;
    private static final int nr;
    private static final int qie;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f17917t;
    private static final int ty;
    private static final int xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR \u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR \u0010\r\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "AllowLeftInLtr", "I", c.f62177j, "()I", "AllowRightInLtr", "t", "AllowLeftInRtl", "rl", "AllowRightInRtl", "nr", "Start", "mUb", "End", "J2", "Top", "gh", "Bottom", "O", "Left", "KN", "Right", "xMQ", "Horizontal", "Uo", "Vertical", "qie", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int J2() {
            return WindowInsetsSides.KN;
        }

        public final int KN() {
            return WindowInsetsSides.gh;
        }

        public final int O() {
            return WindowInsetsSides.mUb;
        }

        public final int Uo() {
            return WindowInsetsSides.az;
        }

        public final int gh() {
            return WindowInsetsSides.xMQ;
        }

        public final int mUb() {
            return WindowInsetsSides.Uo;
        }

        public final int n() {
            return WindowInsetsSides.f17917t;
        }

        public final int nr() {
            return WindowInsetsSides.J2;
        }

        public final int qie() {
            return WindowInsetsSides.ty;
        }

        public final int rl() {
            return WindowInsetsSides.f17916O;
        }

        public final int t() {
            return WindowInsetsSides.nr;
        }

        public final int xMQ() {
            return WindowInsetsSides.qie;
        }
    }

    public static final boolean HI(int i2, int i3) {
        return i2 == i3;
    }

    public static int Ik(int i2) {
        return Integer.hashCode(i2);
    }

    private static int az(int i2) {
        return i2;
    }

    public static final boolean ck(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public static final int r(int i2, int i3) {
        return az(i2 | i3);
    }

    public static boolean ty(int i2, Object obj) {
        return (obj instanceof WindowInsetsSides) && i2 == ((WindowInsetsSides) obj).getValue();
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return ty(this.value, obj);
    }

    public int hashCode() {
        return Ik(this.value);
    }

    static {
        int iAz = az(8);
        f17917t = iAz;
        int iAz2 = az(4);
        nr = iAz2;
        int iAz3 = az(2);
        f17916O = iAz3;
        int iAz4 = az(1);
        J2 = iAz4;
        Uo = r(iAz, iAz4);
        KN = r(iAz2, iAz3);
        int iAz5 = az(16);
        xMQ = iAz5;
        int iAz6 = az(32);
        mUb = iAz6;
        int iR = r(iAz, iAz3);
        gh = iR;
        int iR2 = r(iAz2, iAz4);
        qie = iR2;
        az = r(iR, iR2);
        ty = r(iAz5, iAz6);
    }

    private static final String XQ(int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = Uo;
        if ((i2 & i3) == i3) {
            S(sb, "Start");
        }
        int i5 = gh;
        if ((i2 & i5) == i5) {
            S(sb, "Left");
        }
        int i7 = xMQ;
        if ((i2 & i7) == i7) {
            S(sb, "Top");
        }
        int i8 = KN;
        if ((i2 & i8) == i8) {
            S(sb, "End");
        }
        int i9 = qie;
        if ((i2 & i9) == i9) {
            S(sb, "Right");
        }
        int i10 = mUb;
        if ((i2 & i10) == i10) {
            S(sb, "Bottom");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static String o(int i2) {
        return "WindowInsetsSides(" + XQ(i2) + ')';
    }

    public String toString() {
        return o(this.value);
    }

    private static final void S(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
