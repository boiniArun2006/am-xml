package androidx.compose.ui.text.font;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis;", "", "", "value", "J2", "(I)I", "", "qie", "(I)Ljava/lang/String;", "xMQ", InneractiveMediationNameConsts.OTHER, "", "Uo", "(ILjava/lang/Object;)Z", c.f62177j, "I", "gh", "(I)Z", "isWeightOn", "mUb", "isStyleOn", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class FontSynthesis {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f33697t = J2(0);
    private static final int nr = J2(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f33696O = J2(2);
    private static final int J2 = J2(65535);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/FontSynthesis;", "None", "I", "rl", "()I", "Weight", "nr", "Style", "t", "All", c.f62177j, "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int n() {
            return FontSynthesis.J2;
        }

        public final int nr() {
            return FontSynthesis.nr;
        }

        public final int rl() {
            return FontSynthesis.f33697t;
        }

        public final int t() {
            return FontSynthesis.f33696O;
        }
    }

    public static int J2(int i2) {
        return i2;
    }

    public static final boolean KN(int i2, int i3) {
        return i2 == i3;
    }

    public static final /* synthetic */ FontSynthesis O(int i2) {
        return new FontSynthesis(i2);
    }

    public static boolean Uo(int i2, Object obj) {
        return (obj instanceof FontSynthesis) && i2 == ((FontSynthesis) obj).getValue();
    }

    public static final boolean gh(int i2) {
        return (i2 & 1) != 0;
    }

    public static final boolean mUb(int i2) {
        return (i2 & 2) != 0;
    }

    public static int xMQ(int i2) {
        return Integer.hashCode(i2);
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return Uo(this.value, obj);
    }

    public int hashCode() {
        return xMQ(this.value);
    }

    public static String qie(int i2) {
        return KN(i2, f33697t) ? "None" : KN(i2, nr) ? "Weight" : KN(i2, f33696O) ? "Style" : KN(i2, J2) ? "All" : "Invalid";
    }

    public String toString() {
        return qie(this.value);
    }

    private /* synthetic */ FontSynthesis(int i2) {
        this.value = i2;
    }
}
