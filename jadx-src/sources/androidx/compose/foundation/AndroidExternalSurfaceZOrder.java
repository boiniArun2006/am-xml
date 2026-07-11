package androidx.compose.foundation;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "", "", "zOrder", "nr", "(I)I", "", "KN", "(I)Ljava/lang/String;", "Uo", InneractiveMediationNameConsts.OTHER, "", "O", "(ILjava/lang/Object;)Z", c.f62177j, "I", "getZOrder", "()I", "rl", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class AndroidExternalSurfaceZOrder {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int zOrder;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f15842t = nr(0);
    private static final int nr = nr(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f15841O = nr(2);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceZOrder$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "Behind", "I", c.f62177j, "()I", "MediaOverlay", "rl", "OnTop", "t", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int n() {
            return AndroidExternalSurfaceZOrder.f15842t;
        }

        public final int rl() {
            return AndroidExternalSurfaceZOrder.nr;
        }

        public final int t() {
            return AndroidExternalSurfaceZOrder.f15841O;
        }
    }

    public static final boolean J2(int i2, int i3) {
        return i2 == i3;
    }

    public static String KN(int i2) {
        return "AndroidExternalSurfaceZOrder(zOrder=" + i2 + ')';
    }

    public static boolean O(int i2, Object obj) {
        return (obj instanceof AndroidExternalSurfaceZOrder) && i2 == ((AndroidExternalSurfaceZOrder) obj).getZOrder();
    }

    public static int Uo(int i2) {
        return Integer.hashCode(i2);
    }

    private static int nr(int i2) {
        return i2;
    }

    public boolean equals(Object obj) {
        return O(this.zOrder, obj);
    }

    public int hashCode() {
        return Uo(this.zOrder);
    }

    public String toString() {
        return KN(this.zOrder);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final /* synthetic */ int getZOrder() {
        return this.zOrder;
    }
}
