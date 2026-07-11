package androidx.graphics.path;

import android.graphics.Path;
import androidx.annotation.RequiresApi;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import com.caoccao.javet.exceptions.JavetError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RequiresApi
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/graphics/path/PathIteratorApi34Impl;", "Landroidx/graphics/path/PathIteratorImpl;", "Landroid/graphics/Path;", JavetError.PARAMETER_PATH, "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "points", "", "offset", "Landroidx/graphics/path/PathSegment$Type;", "O", "([FI)Landroidx/graphics/path/PathSegment$Type;", "", "nr", "()Z", "Landroid/graphics/PathIterator;", "J2", "Landroid/graphics/PathIterator;", "platformIterator", "Landroidx/graphics/path/ConicConverter;", "Uo", "Landroidx/graphics/path/ConicConverter;", "conicConverter", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PathIteratorApi34Impl extends PathIteratorImpl {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final android.graphics.PathIterator platformIterator;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final ConicConverter conicConverter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f3) {
        super(path, conicEvaluation, f3);
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        android.graphics.PathIterator pathIterator = path.getPathIterator();
        Intrinsics.checkNotNullExpressionValue(pathIterator, "path.pathIterator");
        this.platformIterator = pathIterator;
        this.conicConverter = new ConicConverter();
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public PathSegment.Type O(float[] points, int offset) {
        Intrinsics.checkNotNullParameter(points, "points");
        if (this.conicConverter.getCurrentQuadratic() < this.conicConverter.getQuadraticCount()) {
            this.conicConverter.nr(points, offset);
            return PathSegment.Type.Quadratic;
        }
        PathSegment.Type typeT = PathIteratorImplKt.t(this.platformIterator.next(points, offset));
        if (typeT != PathSegment.Type.Conic || getConicEvaluation() != PathIterator.ConicEvaluation.AsQuadratics) {
            return typeT;
        }
        ConicConverter conicConverter = this.conicConverter;
        conicConverter.n(points, points[offset + 6], getTolerance(), offset);
        if (conicConverter.getQuadraticCount() > 0) {
            conicConverter.nr(points, offset);
        }
        return PathSegment.Type.Quadratic;
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public boolean nr() {
        return this.platformIterator.hasNext();
    }
}
