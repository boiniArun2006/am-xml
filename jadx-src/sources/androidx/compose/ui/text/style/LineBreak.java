package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 \u00192\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00108Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0017\u0010\u0015\u001a\u00020\u00138Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005R\u0017\u0010\u0018\u001a\u00020\u00168Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak;", "", "", "mask", "nr", "(I)I", "", "gh", "(I)Ljava/lang/String;", "mUb", InneractiveMediationNameConsts.OTHER, "", "O", "(ILjava/lang/Object;)Z", c.f62177j, "I", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "Uo", "strategy", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "KN", "strictness", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "xMQ", "wordBreak", "rl", "Companion", "Strategy", "Strictness", "WordBreak", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class LineBreak {
    private static final int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f33884O;
    private static final int nr;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f33885t;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int mask;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineBreak;", "Simple", "I", c.f62177j, "()I", "getSimple-rAG3T2k$annotations", "Unspecified", "rl", "getUnspecified-rAG3T2k$annotations", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int n() {
            return LineBreak.f33885t;
        }

        public final int rl() {
            return LineBreak.J2;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy;", "", "", "value", "nr", "(I)I", "", "KN", "(I)Ljava/lang/String;", "Uo", InneractiveMediationNameConsts.OTHER, "", "O", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Strategy {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f33888t = nr(1);
        private static final int nr = nr(2);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final int f33887O = nr(3);
        private static final int J2 = nr(0);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "Simple", "I", "t", "()I", "HighQuality", "rl", "Balanced", c.f62177j, "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final int n() {
                return Strategy.f33887O;
            }

            public final int rl() {
                return Strategy.nr;
            }

            public final int t() {
                return Strategy.f33888t;
            }
        }

        public static final boolean J2(int i2, int i3) {
            return i2 == i3;
        }

        public static boolean O(int i2, Object obj) {
            return (obj instanceof Strategy) && i2 == ((Strategy) obj).getValue();
        }

        public static int Uo(int i2) {
            return Integer.hashCode(i2);
        }

        public static int nr(int i2) {
            return i2;
        }

        public boolean equals(Object obj) {
            return O(this.value, obj);
        }

        public int hashCode() {
            return Uo(this.value);
        }

        /* JADX INFO: renamed from: xMQ, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public static String KN(int i2) {
            return J2(i2, f33888t) ? "Strategy.Simple" : J2(i2, nr) ? "Strategy.HighQuality" : J2(i2, f33887O) ? "Strategy.Balanced" : J2(i2, J2) ? "Strategy.Unspecified" : "Invalid";
        }

        public String toString() {
            return KN(this.value);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness;", "", "", "value", "O", "(I)I", "", "xMQ", "(I)Ljava/lang/String;", "KN", InneractiveMediationNameConsts.OTHER, "", "J2", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class Strictness {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f33891t = O(1);
        private static final int nr = O(2);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final int f33890O = O(3);
        private static final int J2 = O(4);
        private static final int Uo = O(0);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "Default", "I", c.f62177j, "()I", "Loose", "rl", "Normal", "t", "Strict", "nr", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final int n() {
                return Strictness.f33891t;
            }

            public final int nr() {
                return Strictness.J2;
            }

            public final int rl() {
                return Strictness.nr;
            }

            public final int t() {
                return Strictness.f33890O;
            }
        }

        public static boolean J2(int i2, Object obj) {
            return (obj instanceof Strictness) && i2 == ((Strictness) obj).getValue();
        }

        public static int KN(int i2) {
            return Integer.hashCode(i2);
        }

        public static int O(int i2) {
            return i2;
        }

        public static final boolean Uo(int i2, int i3) {
            return i2 == i3;
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
            return Uo(i2, f33891t) ? "Strictness.None" : Uo(i2, nr) ? "Strictness.Loose" : Uo(i2, f33890O) ? "Strictness.Normal" : Uo(i2, J2) ? "Strictness.Strict" : Uo(i2, Uo) ? "Strictness.Unspecified" : "Invalid";
        }

        public String toString() {
            return xMQ(this.value);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "", "", "value", "t", "(I)I", "", "Uo", "(I)Ljava/lang/String;", "J2", InneractiveMediationNameConsts.OTHER, "", "nr", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @JvmInline
    public static final class WordBreak {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final int f33894t = t(1);
        private static final int nr = t(2);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private static final int f33893O = t(0);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "Default", "I", c.f62177j, "()I", "Phrase", "rl", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final int n() {
                return WordBreak.f33894t;
            }

            public final int rl() {
                return WordBreak.nr;
            }
        }

        public static int J2(int i2) {
            return Integer.hashCode(i2);
        }

        public static final boolean O(int i2, int i3) {
            return i2 == i3;
        }

        public static boolean nr(int i2, Object obj) {
            return (obj instanceof WordBreak) && i2 == ((WordBreak) obj).getValue();
        }

        public static int t(int i2) {
            return i2;
        }

        /* JADX INFO: renamed from: KN, reason: from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        public boolean equals(Object obj) {
            return nr(this.value, obj);
        }

        public int hashCode() {
            return J2(this.value);
        }

        public static String Uo(int i2) {
            return O(i2, f33894t) ? "WordBreak.None" : O(i2, nr) ? "WordBreak.Phrase" : O(i2, f33893O) ? "WordBreak.Unspecified" : "Invalid";
        }

        public String toString() {
            return Uo(this.value);
        }
    }

    public static final boolean J2(int i2, int i3) {
        return i2 == i3;
    }

    public static boolean O(int i2, Object obj) {
        return (obj instanceof LineBreak) && i2 == ((LineBreak) obj).getMask();
    }

    public static int mUb(int i2) {
        return Integer.hashCode(i2);
    }

    public static int nr(int i2) {
        return i2;
    }

    public static final /* synthetic */ LineBreak t(int i2) {
        return new LineBreak(i2);
    }

    public boolean equals(Object obj) {
        return O(this.mask, obj);
    }

    public int hashCode() {
        return mUb(this.mask);
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final /* synthetic */ int getMask() {
        return this.mask;
    }

    static {
        Strategy.Companion companion = Strategy.INSTANCE;
        int iT = companion.t();
        Strictness.Companion companion2 = Strictness.INSTANCE;
        int iT2 = companion2.t();
        WordBreak.Companion companion3 = WordBreak.INSTANCE;
        f33885t = nr(LineBreak_androidKt.O(iT, iT2, companion3.n()));
        nr = nr(LineBreak_androidKt.O(companion.n(), companion2.rl(), companion3.rl()));
        f33884O = nr(LineBreak_androidKt.O(companion.rl(), companion2.nr(), companion3.n()));
        J2 = nr(0);
    }

    public static String gh(int i2) {
        return "LineBreak(strategy=" + ((Object) Strategy.KN(Uo(i2))) + ", strictness=" + ((Object) Strictness.xMQ(KN(i2))) + YjqZUJsVmhcjko.WodCMphyg + ((Object) WordBreak.Uo(xMQ(i2))) + ')';
    }

    public String toString() {
        return gh(this.mask);
    }

    private /* synthetic */ LineBreak(int i2) {
        this.mask = i2;
    }

    public static final int KN(int i2) {
        return Strictness.O(LineBreak_androidKt.Uo(i2));
    }

    public static final int Uo(int i2) {
        return Strategy.nr(LineBreak_androidKt.J2(i2));
    }

    public static final int xMQ(int i2) {
        return WordBreak.t(LineBreak_androidKt.KN(i2));
    }
}
