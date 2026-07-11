package androidx.compose.foundation.text.input.internal;

import com.caoccao.javet.values.reference.IV8ValueMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0083@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018\u0088\u0001\u0007\u0092\u0001\u00020\u0006\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/input/internal/OpArray;", "", "", "size", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "(I)[I", "", IV8ValueMap.FUNCTION_VALUES, "rl", "([I)[I", "index", "offset", "srcLen", "destLen", "", "Uo", "([IIIII)V", "newSize", "t", "([II)[I", "", "KN", "([I)Ljava/lang/String;", "J2", "([I)I", InneractiveMediationNameConsts.OTHER, "", "nr", "([ILjava/lang/Object;)Z", "[I", "O", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
final class OpArray {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int[] values;

    public static int J2(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static String KN(int[] iArr) {
        return "OpArray(values=" + Arrays.toString(iArr) + ')';
    }

    public static final int O(int[] iArr) {
        return iArr.length / 3;
    }

    public static boolean nr(int[] iArr, Object obj) {
        return (obj instanceof OpArray) && Intrinsics.areEqual(iArr, ((OpArray) obj).getValues());
    }

    private static int[] rl(int[] iArr) {
        return iArr;
    }

    public boolean equals(Object obj) {
        return nr(this.values, obj);
    }

    public int hashCode() {
        return J2(this.values);
    }

    public String toString() {
        return KN(this.values);
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public final /* synthetic */ int[] getValues() {
        return this.values;
    }

    public static final void Uo(int[] iArr, int i2, int i3, int i5, int i7) {
        int i8 = i2 * 3;
        iArr[i8] = i3;
        iArr[i8 + 1] = i5;
        iArr[i8 + 2] = i7;
    }

    public static int[] n(int i2) {
        return rl(new int[i2 * 3]);
    }

    public static final int[] t(int[] iArr, int i2) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, i2 * 3);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return rl(iArrCopyOf);
    }
}
