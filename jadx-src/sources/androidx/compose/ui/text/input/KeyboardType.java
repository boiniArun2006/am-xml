package androidx.compose.ui.text.input;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType;", "", "", "value", "qie", "(I)I", "", "ck", "(I)Ljava/lang/String;", "HI", InneractiveMediationNameConsts.OTHER, "", "az", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class KeyboardType {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f33778t = qie(0);
    private static final int nr = qie(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f33777O = qie(2);
    private static final int J2 = qie(3);
    private static final int Uo = qie(4);
    private static final int KN = qie(5);
    private static final int xMQ = qie(6);
    private static final int mUb = qie(7);
    private static final int gh = qie(8);
    private static final int qie = qie(9);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR&\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR&\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR&\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR&\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR&\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/KeyboardType;", "Unspecified", "I", "xMQ", "()I", "getUnspecified-PjHm6EE$annotations", "Text", "KN", "getText-PjHm6EE$annotations", "Ascii", c.f62177j, "getAscii-PjHm6EE$annotations", "Number", "nr", "getNumber-PjHm6EE$annotations", "Phone", "Uo", "getPhone-PjHm6EE$annotations", "Uri", "mUb", "getUri-PjHm6EE$annotations", "Email", "t", "getEmail-PjHm6EE$annotations", "Password", "J2", "getPassword-PjHm6EE$annotations", "NumberPassword", "O", "getNumberPassword-PjHm6EE$annotations", "Decimal", "rl", "getDecimal-PjHm6EE$annotations", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int J2() {
            return KeyboardType.mUb;
        }

        public final int KN() {
            return KeyboardType.nr;
        }

        public final int O() {
            return KeyboardType.gh;
        }

        public final int Uo() {
            return KeyboardType.Uo;
        }

        public final int mUb() {
            return KeyboardType.KN;
        }

        public final int n() {
            return KeyboardType.f33777O;
        }

        public final int nr() {
            return KeyboardType.J2;
        }

        public final int rl() {
            return KeyboardType.qie;
        }

        public final int t() {
            return KeyboardType.xMQ;
        }

        public final int xMQ() {
            return KeyboardType.f33778t;
        }
    }

    public static int HI(int i2) {
        return Integer.hashCode(i2);
    }

    public static boolean az(int i2, Object obj) {
        return (obj instanceof KeyboardType) && i2 == ((KeyboardType) obj).getValue();
    }

    public static final /* synthetic */ KeyboardType gh(int i2) {
        return new KeyboardType(i2);
    }

    private static int qie(int i2) {
        return i2;
    }

    public static final boolean ty(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return az(this.value, obj);
    }

    public int hashCode() {
        return HI(this.value);
    }

    public static String ck(int i2) {
        return ty(i2, f33778t) ? "Unspecified" : ty(i2, nr) ? "Text" : ty(i2, f33777O) ? "Ascii" : ty(i2, J2) ? "Number" : ty(i2, Uo) ? "Phone" : ty(i2, KN) ? "Uri" : ty(i2, xMQ) ? "Email" : ty(i2, mUb) ? "Password" : ty(i2, gh) ? "NumberPassword" : ty(i2, qie) ? "Decimal" : "Invalid";
    }

    public String toString() {
        return ck(this.value);
    }

    private /* synthetic */ KeyboardType(int i2) {
        this.value = i2;
    }
}
