package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle;", "", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "alignment", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "trim", "Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "mode", "<init>", "(FIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(FILkotlin/jvm/internal/DefaultConstructorMarker;)V", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", c.f62177j, "F", "rl", "()F", "I", "nr", "t", "Alignment", "Companion", "Mode", "Trim", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LineHeightStyle {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final LineHeightStyle f33896O;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alignment;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final int trim;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int mode;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "", "", "topRatio", "nr", "(F)F", "", "KN", "(F)Ljava/lang/String;", "", "Uo", "(F)I", InneractiveMediationNameConsts.OTHER, "", "O", "(FLjava/lang/Object;)Z", c.f62177j, "F", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    @SourceDebugExtension({"SMAP\nLineHeightStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineHeightStyle.kt\nandroidx/compose/ui/text/style/LineHeightStyle$Alignment\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,329:1\n77#2,8:330\n*S KotlinDebug\n*F\n+ 1 LineHeightStyle.kt\nandroidx/compose/ui/text/style/LineHeightStyle$Alignment\n*L\n211#1:330,8\n*E\n"})
    public static final class Alignment {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final float topRatio;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final float f33900t = nr(0.0f);
        private static final float nr = nr(0.5f);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final float f33899O = nr(-1.0f);
        private static final float J2 = nr(1.0f);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Alignment$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineHeightStyle$Alignment;", "Center", "F", c.f62177j, "()F", "Proportional", "rl", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final float n() {
                return Alignment.nr;
            }

            public final float rl() {
                return Alignment.f33899O;
            }
        }

        public static final boolean J2(float f3, float f4) {
            return Float.compare(f3, f4) == 0;
        }

        public static boolean O(float f3, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f3, ((Alignment) obj).getTopRatio()) == 0;
        }

        public static int Uo(float f3) {
            return Float.hashCode(f3);
        }

        public static float nr(float f3) {
            if (!((0.0f <= f3 && f3 <= 1.0f) || f3 == -1.0f)) {
                InlineClassHelperKt.t("topRatio should be in [0..1] range or -1");
            }
            return f3;
        }

        public static final /* synthetic */ Alignment t(float f3) {
            return new Alignment(f3);
        }

        public boolean equals(Object obj) {
            return O(this.topRatio, obj);
        }

        public int hashCode() {
            return Uo(this.topRatio);
        }

        /* JADX INFO: renamed from: xMQ, reason: from getter */
        public final /* synthetic */ float getTopRatio() {
            return this.topRatio;
        }

        public static String KN(float f3) {
            if (f3 == f33900t) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f3 == nr) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f3 == f33899O) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f3 == J2) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f3 + ')';
        }

        public String toString() {
            return KN(this.topRatio);
        }

        private /* synthetic */ Alignment(float f3) {
            this.topRatio = f3;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineHeightStyle;", "Default", "Landroidx/compose/ui/text/style/LineHeightStyle;", c.f62177j, "()Landroidx/compose/ui/text/style/LineHeightStyle;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LineHeightStyle n() {
            return LineHeightStyle.f33896O;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "", "", "value", "nr", "(I)I", "", "KN", "(I)Ljava/lang/String;", "Uo", InneractiveMediationNameConsts.OTHER, "", "O", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Mode {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f33902t = nr(0);
        private static final int nr = nr(1);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Mode$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineHeightStyle$Mode;", "Fixed", "I", c.f62177j, "()I", "Minimum", "rl", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final int n() {
                return Mode.f33902t;
            }

            public final int rl() {
                return Mode.nr;
            }
        }

        public static final boolean J2(int i2, int i3) {
            return i2 == i3;
        }

        public static String KN(int i2) {
            return "Mode(value=" + i2 + ')';
        }

        public static boolean O(int i2, Object obj) {
            return (obj instanceof Mode) && i2 == ((Mode) obj).getValue();
        }

        public static int Uo(int i2) {
            return Integer.hashCode(i2);
        }

        private static int nr(int i2) {
            return i2;
        }

        public static final /* synthetic */ Mode t(int i2) {
            return new Mode(i2);
        }

        public boolean equals(Object obj) {
            return O(this.value, obj);
        }

        public int hashCode() {
            return Uo(this.value);
        }

        public String toString() {
            return KN(this.value);
        }

        /* JADX INFO: renamed from: xMQ, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        private /* synthetic */ Mode(int i2) {
            this.value = i2;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0005J\u001a\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "", "", "value", "nr", "(I)I", "", "mUb", "(I)Ljava/lang/String;", "", "KN", "(I)Z", "xMQ", "Uo", InneractiveMediationNameConsts.OTHER, "O", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Trim {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f33905t = nr(1);
        private static final int nr = nr(16);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final int f33904O = nr(17);
        private static final int J2 = nr(0);

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/style/LineHeightStyle$Trim$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineHeightStyle$Trim;", "Both", "I", c.f62177j, "()I", "None", "rl", "", "FlagTrimBottom", "FlagTrimTop", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final int n() {
                return Trim.f33904O;
            }

            public final int rl() {
                return Trim.J2;
            }
        }

        public static final boolean J2(int i2, int i3) {
            return i2 == i3;
        }

        public static final boolean KN(int i2) {
            return (i2 & 1) > 0;
        }

        public static boolean O(int i2, Object obj) {
            return (obj instanceof Trim) && i2 == ((Trim) obj).getValue();
        }

        public static int Uo(int i2) {
            return Integer.hashCode(i2);
        }

        private static int nr(int i2) {
            return i2;
        }

        public static final /* synthetic */ Trim t(int i2) {
            return new Trim(i2);
        }

        public static final boolean xMQ(int i2) {
            return (i2 & 16) > 0;
        }

        public boolean equals(Object obj) {
            return O(this.value, obj);
        }

        /* JADX INFO: renamed from: gh, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Uo(this.value);
        }

        public static String mUb(int i2) {
            return i2 == f33905t ? "LineHeightStyle.Trim.FirstLineTop" : i2 == nr ? "LineHeightStyle.Trim.LastLineBottom" : i2 == f33904O ? "LineHeightStyle.Trim.Both" : i2 == J2 ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public String toString() {
            return mUb(this.value);
        }

        private /* synthetic */ Trim(int i2) {
            this.value = i2;
        }
    }

    public /* synthetic */ LineHeightStyle(float f3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, i2, i3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) other;
        return Alignment.J2(this.alignment, lineHeightStyle.alignment) && Trim.J2(this.trim, lineHeightStyle.trim) && Mode.J2(this.mode, lineHeightStyle.mode);
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        f33896O = new LineHeightStyle(Alignment.INSTANCE.rl(), Trim.INSTANCE.n(), Mode.INSTANCE.n(), defaultConstructorMarker);
    }

    public /* synthetic */ LineHeightStyle(float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, i2);
    }

    public int hashCode() {
        return (((Alignment.Uo(this.alignment) * 31) + Trim.Uo(this.trim)) * 31) + Mode.Uo(this.mode);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final int getTrim() {
        return this.trim;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final float getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.KN(this.alignment)) + ", trim=" + ((Object) Trim.mUb(this.trim)) + ",mode=" + ((Object) Mode.KN(this.mode)) + ')';
    }

    private LineHeightStyle(float f3, int i2, int i3) {
        this.alignment = f3;
        this.trim = i2;
        this.mode = i3;
    }

    private LineHeightStyle(float f3, int i2) {
        this(f3, i2, Mode.INSTANCE.n(), null);
    }
}
