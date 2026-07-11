package androidx.compose.ui.node;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/CenteredArray;", "", "", "data", c.f62177j, "([I)[I", "", "index", "t", "([II)I", "value", "", "J2", "([III)V", "", "Uo", "([I)Ljava/lang/String;", "O", "([I)I", InneractiveMediationNameConsts.OTHER, "", "rl", "([ILjava/lang/Object;)Z", "[I", "nr", "mid", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
final class CenteredArray {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int[] data;

    public static int O(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public static String Uo(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public static int[] n(int[] iArr) {
        return iArr;
    }

    private static final int nr(int[] iArr) {
        return iArr.length / 2;
    }

    public static boolean rl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && Intrinsics.areEqual(iArr, ((CenteredArray) obj).getData());
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public final /* synthetic */ int[] getData() {
        return this.data;
    }

    public boolean equals(Object obj) {
        return rl(this.data, obj);
    }

    public int hashCode() {
        return O(this.data);
    }

    public String toString() {
        return Uo(this.data);
    }

    public static final void J2(int[] iArr, int i2, int i3) {
        iArr[i2 + nr(iArr)] = i3;
    }

    public static final int t(int[] iArr, int i2) {
        return iArr[i2 + nr(iArr)];
    }
}
