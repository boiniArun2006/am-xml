package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.BezierKt;
import androidx.compose.ui.graphics.IntervalTree;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/animation/core/PathEasing;", "Landroidx/compose/animation/core/Easing;", "", "rl", "()V", "", "fraction", c.f62177j, "(F)F", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/Path;", JavetError.PARAMETER_PATH, "Landroidx/compose/ui/graphics/IntervalTree;", "Landroidx/compose/ui/graphics/PathSegment;", "Landroidx/compose/ui/graphics/IntervalTree;", "intervals", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPathEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathEasing.kt\nandroidx/compose/animation/core/PathEasing\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 4 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,116:1\n62#2,6:117\n52#2,5:123\n33#2,5:128\n33#2,5:136\n51#3:133\n55#3:135\n22#4:134\n*S KotlinDebug\n*F\n+ 1 PathEasing.kt\nandroidx/compose/animation/core/PathEasing\n*L\n69#1:117,6\n74#1:123,5\n96#1:128,5\n109#1:136,5\n104#1:133\n104#1:135\n104#1:134\n*E\n"})
public final class PathEasing implements Easing {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Path path;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private IntervalTree intervals;

    private final void rl() {
        float[] fArr = new float[5];
        IntervalTree intervalTree = new IntervalTree();
        PathIterator pathIteratorJ2 = this.path.J2(PathIterator.ConicEvaluation.f31514t, 2.0E-4f);
        while (true) {
            if (!pathIteratorJ2.hasNext()) {
                break;
            }
            PathSegment next = pathIteratorJ2.next();
            if (!(next.getType() != PathSegment.Type.f31525o)) {
                PreconditionsKt.n("The path cannot contain a close() command.");
            }
            if (next.getType() != PathSegment.Type.f31524n && next.getType() != PathSegment.Type.f31522Z) {
                long jNr = BezierKt.nr(next, fArr, 0, 4, null);
                intervalTree.n(Float.intBitsToFloat((int) (jNr >> 32)), Float.intBitsToFloat((int) (jNr & 4294967295L)), next);
            }
        }
        if (!(intervalTree.rl(0.0f) && intervalTree.rl(1.0f))) {
            PreconditionsKt.n("The easing path must start at 0.0f and end at 1.0f.");
        }
        this.intervals = intervalTree;
    }

    @Override // androidx.compose.animation.core.Easing
    public float n(float fraction) {
        if (fraction <= 0.0f) {
            return 0.0f;
        }
        if (fraction >= 1.0f) {
            return 1.0f;
        }
        if (this.intervals == null) {
            rl();
        }
        IntervalTree intervalTree = this.intervals;
        if (intervalTree == null) {
            Intrinsics.throwUninitializedPropertyAccessException("intervals");
            intervalTree = null;
        }
        Object data = IntervalTree.nr(intervalTree, fraction, 0.0f, 2, null).getData();
        if (data == null) {
            PreconditionsKt.t("The easing path is invalid. Make sure it is continuous on the x axis.");
            throw new KotlinNothingValueException();
        }
        PathSegment pathSegment = (PathSegment) data;
        float fTy = BezierKt.ty(pathSegment, fraction);
        if (Float.isNaN(fTy)) {
            PreconditionsKt.rl("The easing path is invalid. Make sure it does not contain NaN/Infinity values.");
        }
        return BezierKt.mUb(pathSegment, fTy);
    }
}
