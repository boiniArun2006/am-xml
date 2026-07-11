package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmapConfig;", "", "", "value", "Uo", "(I)I", "", "gh", "(I)Ljava/lang/String;", "mUb", InneractiveMediationNameConsts.OTHER, "", "KN", "(ILjava/lang/Object;)Z", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "I", "getValue", "()I", "rl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class ImageBitmapConfig {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f31482t = Uo(0);
    private static final int nr = Uo(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f31481O = Uo(2);
    private static final int J2 = Uo(3);
    private static final int Uo = Uo(4);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "Argb8888", "I", "rl", "()I", "Alpha8", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Rgb565", "O", "F16", "t", "Gpu", "nr", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int O() {
            return ImageBitmapConfig.f31481O;
        }

        public final int n() {
            return ImageBitmapConfig.nr;
        }

        public final int nr() {
            return ImageBitmapConfig.Uo;
        }

        public final int rl() {
            return ImageBitmapConfig.f31482t;
        }

        public final int t() {
            return ImageBitmapConfig.J2;
        }
    }

    public static final /* synthetic */ ImageBitmapConfig J2(int i2) {
        return new ImageBitmapConfig(i2);
    }

    public static boolean KN(int i2, Object obj) {
        return (obj instanceof ImageBitmapConfig) && i2 == ((ImageBitmapConfig) obj).getValue();
    }

    public static int Uo(int i2) {
        return i2;
    }

    public static int mUb(int i2) {
        return Integer.hashCode(i2);
    }

    public static final boolean xMQ(int i2, int i3) {
        return i2 == i3;
    }

    public boolean equals(Object obj) {
        return KN(this.value, obj);
    }

    public int hashCode() {
        return mUb(this.value);
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public static String gh(int i2) {
        return xMQ(i2, f31482t) ? "Argb8888" : xMQ(i2, nr) ? "Alpha8" : xMQ(i2, f31481O) ? "Rgb565" : xMQ(i2, J2) ? "F16" : xMQ(i2, Uo) ? "Gpu" : "Unknown";
    }

    public String toString() {
        return gh(this.value);
    }

    private /* synthetic */ ImageBitmapConfig(int i2) {
        this.value = i2;
    }
}
