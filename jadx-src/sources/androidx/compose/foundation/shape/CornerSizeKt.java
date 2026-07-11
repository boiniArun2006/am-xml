package androidx.compose.foundation.shape;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\" \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "size", "Landroidx/compose/foundation/shape/CornerSize;", "rl", "(F)Landroidx/compose/foundation/shape/CornerSize;", "", "percent", c.f62177j, "(I)Landroidx/compose/foundation/shape/CornerSize;", "Landroidx/compose/foundation/shape/CornerSize;", "t", "()Landroidx/compose/foundation/shape/CornerSize;", "getZeroCornerSize$annotations", "()V", "ZeroCornerSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CornerSizeKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final CornerSize f19120n = new CornerSizeKt$ZeroCornerSize$1();

    public static final CornerSize n(int i2) {
        return new CornerSize(i2);
    }

    public static final CornerSize rl(float f3) {
        return new CornerSize(f3, null);
    }

    public static final CornerSize t() {
        return f19120n;
    }
}
