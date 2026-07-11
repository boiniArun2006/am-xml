package androidx.compose.ui.text.style;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/Hyphens;", "", "", "value", "O", "(I)I", "", "xMQ", "(I)Ljava/lang/String;", "KN", InneractiveMediationNameConsts.OTHER, "", "J2", "(ILjava/lang/Object;)Z", c.f62177j, "I", "rl", "Companion", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class Hyphens {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f33882t = O(1);
    private static final int nr = O(2);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f33881O = O(Integer.MIN_VALUE);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/Hyphens$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/Hyphens;", "None", "I", "rl", "()I", "Auto", c.f62177j, "Unspecified", "t", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int n() {
            return Hyphens.nr;
        }

        public final int rl() {
            return Hyphens.f33882t;
        }

        public final int t() {
            return Hyphens.f33881O;
        }
    }

    public static boolean J2(int i2, Object obj) {
        return (obj instanceof Hyphens) && i2 == ((Hyphens) obj).getValue();
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

    public static final /* synthetic */ Hyphens nr(int i2) {
        return new Hyphens(i2);
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
        return Uo(i2, f33882t) ? "Hyphens.None" : Uo(i2, nr) ? "Hyphens.Auto" : Uo(i2, f33881O) ? "Hyphens.Unspecified" : "Invalid";
    }

    public String toString() {
        return xMQ(this.value);
    }

    private /* synthetic */ Hyphens(int i2) {
        this.value = i2;
    }
}
