package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012\"\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0018\u0010\u0012\"\u0017\u0010\u001d\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\n\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/Color;", InneractiveMediationNameConsts.OTHER, "", "O", "(JJ)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "J2", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "", "Landroidx/compose/ui/graphics/vector/PathNode;", c.f62177j, "Ljava/util/List;", "nr", "()Ljava/util/List;", "EmptyPath", "Landroidx/compose/ui/graphics/StrokeCap;", "rl", "I", "()I", "DefaultStrokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "t", "DefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultTintBlendMode", "DefaultTintBlendMode", "J", "getDefaultTintColor", "()J", "DefaultTintColor", "Landroidx/compose/ui/graphics/PathFillType;", "DefaultFillType", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class VectorKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List f31885n = CollectionsKt.emptyList();
    private static final int rl = StrokeCap.INSTANCE.n();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f31886t = StrokeJoin.INSTANCE.rl();
    private static final int nr = BlendMode.INSTANCE.nY();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final long f31884O = Color.INSTANCE.J2();
    private static final int J2 = PathFillType.INSTANCE.rl();

    public static final boolean J2(ColorFilter colorFilter) {
        if (!(colorFilter instanceof BlendModeColorFilter)) {
            return colorFilter == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
        int blendMode = blendModeColorFilter.getBlendMode();
        BlendMode.Companion companion = BlendMode.INSTANCE;
        return BlendMode.e(blendMode, companion.nY()) || BlendMode.e(blendModeColorFilter.getBlendMode(), companion.te());
    }

    public static final int n() {
        return J2;
    }

    public static final List nr() {
        return f31885n;
    }

    public static final int rl() {
        return rl;
    }

    public static final int t() {
        return f31886t;
    }

    public static final boolean O(long j2, long j3) {
        if (Color.Z(j2) == Color.Z(j3) && Color.o(j2) == Color.o(j3) && Color.Ik(j2) == Color.Ik(j3)) {
            return true;
        }
        return false;
    }
}
