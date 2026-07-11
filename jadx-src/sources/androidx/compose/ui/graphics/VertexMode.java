package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/VertexMode;", "", "", "value", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(I)I", "", "O", "(I)Ljava/lang/String;", "nr", InneractiveMediationNameConsts.OTHER, "", "rl", "(ILjava/lang/Object;)Z", "I", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
public final class VertexMode {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f31587t = n(0);
    private static final int nr = n(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f31586O = n(2);

    public static int n(int i2) {
        return i2;
    }

    public static int nr(int i2) {
        return Integer.hashCode(i2);
    }

    public static boolean rl(int i2, Object obj) {
        return (obj instanceof VertexMode) && i2 == ((VertexMode) obj).getValue();
    }

    public static final boolean t(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    public boolean equals(Object obj) {
        return rl(this.value, obj);
    }

    public int hashCode() {
        return nr(this.value);
    }

    public static String O(int i2) {
        return t(i2, f31587t) ? "Triangles" : t(i2, nr) ? "TriangleStrip" : t(i2, f31586O) ? "TriangleFan" : "Unknown";
    }

    public String toString() {
        return O(this.value);
    }
}
