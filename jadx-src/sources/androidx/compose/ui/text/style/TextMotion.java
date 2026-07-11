package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0017\u0018B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion;", "", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "linearity", "", "subpixelTextPositioning", "<init>", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", c.f62177j, "I", "rl", "Z", "t", "()Z", "Companion", "Linearity", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TextMotion {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final TextMotion f33927O;
    private static final TextMotion nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int linearity;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final boolean subpixelTextPositioning;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/TextMotion;", "Static", "Landroidx/compose/ui/text/style/TextMotion;", c.f62177j, "()Landroidx/compose/ui/text/style/TextMotion;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TextMotion n() {
            return TextMotion.nr;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity;", "", "", "value", "O", "(I)I", "", "xMQ", "(I)Ljava/lang/String;", "KN", InneractiveMediationNameConsts.OTHER, "", "J2", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Linearity {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f33931t = O(1);
        private static final int nr = O(2);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final int f33930O = O(3);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "Linear", "I", "rl", "()I", "FontHinting", c.f62177j, "None", "t", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final int n() {
                return Linearity.nr;
            }

            public final int rl() {
                return Linearity.f33931t;
            }

            public final int t() {
                return Linearity.f33930O;
            }
        }

        public static boolean J2(int i2, Object obj) {
            return (obj instanceof Linearity) && i2 == ((Linearity) obj).getValue();
        }

        public static int KN(int i2) {
            return Integer.hashCode(i2);
        }

        private static int O(int i2) {
            return i2;
        }

        public static final boolean Uo(int i2, int i3) {
            return i2 == i3;
        }

        public static final /* synthetic */ Linearity nr(int i2) {
            return new Linearity(i2);
        }

        public boolean equals(Object obj) {
            return J2(this.value, obj);
        }

        public int hashCode() {
            return KN(this.value);
        }

        /* JADX INFO: renamed from: mUb, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public static String xMQ(int i2) {
            return Uo(i2, f33931t) ? "Linearity.Linear" : Uo(i2, nr) ? "Linearity.FontHinting" : Uo(i2, f33930O) ? "Linearity.None" : "Invalid";
        }

        public String toString() {
            return xMQ(this.value);
        }

        private /* synthetic */ Linearity(int i2) {
            this.value = i2;
        }
    }

    public /* synthetic */ TextMotion(int i2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) other;
        return Linearity.Uo(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        Linearity.Companion companion = Linearity.INSTANCE;
        nr = new TextMotion(companion.n(), false, defaultConstructorMarker);
        f33927O = new TextMotion(companion.rl(), true, defaultConstructorMarker);
    }

    private TextMotion(int i2, boolean z2) {
        this.linearity = i2;
        this.subpixelTextPositioning = z2;
    }

    public int hashCode() {
        return (Linearity.KN(this.linearity) * 31) + Boolean.hashCode(this.subpixelTextPositioning);
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getLinearity() {
        return this.linearity;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getSubpixelTextPositioning() {
        return this.subpixelTextPositioning;
    }

    public String toString() {
        return Intrinsics.areEqual(this, nr) ? "TextMotion.Static" : Intrinsics.areEqual(this, f33927O) ? "TextMotion.Animated" : "Invalid";
    }
}
