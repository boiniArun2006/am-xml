package androidx.graphics.path;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.graphics.path.PathIterator;
import androidx.graphics.path.PathSegment;
import com.caoccao.javet.exceptions.JavetError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000 \u00182\u00020\u0001:\u0001'B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&¨\u0006("}, d2 = {"Landroidx/graphics/path/PathIteratorImpl;", "", "Landroid/graphics/Path;", JavetError.PARAMETER_PATH, "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "pointsData", "Landroidx/graphics/path/PathSegment$Type;", "type", "", "Landroid/graphics/PointF;", c.f62177j, "([FLandroidx/graphics/path/PathSegment$Type;)[Landroid/graphics/PointF;", "", "nr", "()Z", "points", "", "offset", "O", "([FI)Landroidx/graphics/path/PathSegment$Type;", "Landroidx/graphics/path/PathSegment;", "J2", "()Landroidx/graphics/path/PathSegment;", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "rl", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "()Landroidx/graphics/path/PathIterator$ConicEvaluation;", "t", "F", "()F", "[F", "Companion", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPathIteratorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathIteratorImpl.kt\nandroidx/graphics/path/PathIteratorImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,304:1\n26#2:305\n*S KotlinDebug\n*F\n+ 1 PathIteratorImpl.kt\nandroidx/graphics/path/PathIteratorImpl\n*L\n104#1:305\n*E\n"})
public abstract class PathIteratorImpl {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Companion f38780O = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Path path;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final float[] pointsData;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final PathIterator.ConicEvaluation conicEvaluation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final float tolerance;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/graphics/path/PathIteratorImpl$Companion;", "", "()V", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public abstract PathSegment.Type O(float[] points, int offset);

    public abstract boolean nr();

    static {
        System.loadLibrary("androidx.graphics.path");
    }

    public PathIteratorImpl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f3) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f3;
        this.pointsData = new float[8];
    }

    private final PointF[] n(float[] pointsData, PathSegment.Type type) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        return i2 != 1 ? i2 != 2 ? (i2 == 3 || i2 == 4) ? new PointF[]{new PointF(pointsData[0], pointsData[1]), new PointF(pointsData[2], pointsData[3]), new PointF(pointsData[4], pointsData[5])} : i2 != 5 ? new PointF[0] : new PointF[]{new PointF(pointsData[0], pointsData[1]), new PointF(pointsData[2], pointsData[3]), new PointF(pointsData[4], pointsData[5]), new PointF(pointsData[6], pointsData[7])} : new PointF[]{new PointF(pointsData[0], pointsData[1]), new PointF(pointsData[2], pointsData[3])} : new PointF[]{new PointF(pointsData[0], pointsData[1])};
    }

    public final PathSegment J2() {
        PathSegment.Type typeO = O(this.pointsData, 0);
        if (typeO == PathSegment.Type.Done) {
            return PathSegmentUtilities.rl();
        }
        if (typeO == PathSegment.Type.Close) {
            return PathSegmentUtilities.n();
        }
        return new PathSegment(typeO, n(this.pointsData, typeO), typeO == PathSegment.Type.Conic ? this.pointsData[6] : 0.0f);
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final float getTolerance() {
        return this.tolerance;
    }
}
