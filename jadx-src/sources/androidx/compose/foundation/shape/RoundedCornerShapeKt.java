package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/shape/CornerSize;", "corner", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "rl", "(Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/ui/unit/Dp;", "size", "t", "(F)Landroidx/compose/foundation/shape/RoundedCornerShape;", "", "percent", c.f62177j, "(I)Landroidx/compose/foundation/shape/RoundedCornerShape;", "topStart", "topEnd", "bottomEnd", "bottomStart", "nr", "(FFFF)Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "J2", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "CircleShape", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,201:1\n113#2:202\n113#2:203\n113#2:204\n113#2:205\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n*L\n151#1:202\n152#1:203\n153#1:204\n154#1:205\n*E\n"})
public final class RoundedCornerShapeKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final RoundedCornerShape f19125n = n(50);

    public static final RoundedCornerShape J2() {
        return f19125n;
    }

    public static /* synthetic */ RoundedCornerShape O(float f3, float f4, float f5, float f6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f3 = Dp.KN(0);
        }
        if ((i2 & 2) != 0) {
            f4 = Dp.KN(0);
        }
        if ((i2 & 4) != 0) {
            f5 = Dp.KN(0);
        }
        if ((i2 & 8) != 0) {
            f6 = Dp.KN(0);
        }
        return nr(f3, f4, f5, f6);
    }

    public static final RoundedCornerShape nr(float f3, float f4, float f5, float f6) {
        return new RoundedCornerShape(CornerSizeKt.rl(f3), CornerSizeKt.rl(f4), CornerSizeKt.rl(f5), CornerSizeKt.rl(f6));
    }

    public static final RoundedCornerShape rl(CornerSize cornerSize) {
        return new RoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static final RoundedCornerShape n(int i2) {
        return rl(CornerSizeKt.n(i2));
    }

    public static final RoundedCornerShape t(float f3) {
        return rl(CornerSizeKt.rl(f3));
    }
}
