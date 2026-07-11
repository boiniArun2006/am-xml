package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/StrokeJoin;", "", "", "value", "O", "(I)I", "", "xMQ", "(I)Ljava/lang/String;", "KN", InneractiveMediationNameConsts.OTHER, "", "J2", "(ILjava/lang/Object;)Z", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "I", "rl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class StrokeJoin {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f31577t = O(0);
    private static final int nr = O(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f31576O = O(2);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/StrokeJoin$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/StrokeJoin;", "Miter", "I", "rl", "()I", "Round", "t", "Bevel", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int n() {
            return StrokeJoin.f31576O;
        }

        public final int rl() {
            return StrokeJoin.f31577t;
        }

        public final int t() {
            return StrokeJoin.nr;
        }
    }

    public static boolean J2(int i2, Object obj) {
        return (obj instanceof StrokeJoin) && i2 == ((StrokeJoin) obj).getValue();
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

    public static final /* synthetic */ StrokeJoin nr(int i2) {
        return new StrokeJoin(i2);
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
        return Uo(i2, f31577t) ? "Miter" : Uo(i2, nr) ? "Round" : Uo(i2, f31576O) ? "Bevel" : "Unknown";
    }

    public String toString() {
        return xMQ(this.value);
    }

    private /* synthetic */ StrokeJoin(int i2) {
        this.value = i2;
    }
}
