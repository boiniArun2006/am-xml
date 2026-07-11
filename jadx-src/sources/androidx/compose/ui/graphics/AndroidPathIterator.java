package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import androidx.graphics.path.PathIterator;
import com.caoccao.javet.exceptions.JavetError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathIterator;", "Landroidx/compose/ui/graphics/PathIterator;", "Landroidx/compose/ui/graphics/Path;", JavetError.PARAMETER_PATH, "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "<init>", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)V", "", "hasNext", "()Z", "Landroidx/compose/ui/graphics/PathSegment;", "next", "()Landroidx/compose/ui/graphics/PathSegment;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Landroidx/compose/ui/graphics/Path;", "O", "()Landroidx/compose/ui/graphics/Path;", "t", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "()Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "F", "J2", "()F", "", "[F", "segmentPoints", "Landroidx/graphics/path/PathIterator;", "r", "Landroidx/graphics/path/PathIterator;", "implementation", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidPathIterator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathIterator.android.kt\nandroidx/compose/ui/graphics/AndroidPathIterator\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,88:1\n36#2,5:89\n*S KotlinDebug\n*F\n+ 1 AndroidPathIterator.android.kt\nandroidx/compose/ui/graphics/AndroidPathIterator\n*L\n38#1:89,5\n*E\n"})
final class AndroidPathIterator implements PathIterator {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final float[] segmentPoints = new float[8];

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final float tolerance;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Path path;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final androidx.graphics.path.PathIterator implementation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final PathIterator.ConicEvaluation conicEvaluation;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PathIterator.ConicEvaluation.values().length];
            try {
                iArr[PathIterator.ConicEvaluation.f31513n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathIterator.ConicEvaluation.f31514t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PathSegment.Type.values().length];
            try {
                iArr2[PathSegment.Type.f31524n.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PathSegment.Type.f31527t.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PathSegment.Type.f31520O.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PathSegment.Type.J2.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PathSegment.Type.f31526r.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public float getTolerance() {
        return this.tolerance;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public Path getPath() {
        return this.path;
    }

    @Override // androidx.compose.ui.graphics.PathIterator, java.util.Iterator
    public boolean hasNext() {
        return this.implementation.hasNext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public PathSegment next() {
        PathSegment.Type typeT;
        float[] fArr = this.segmentPoints;
        if (fArr.length >= 8 && (typeT = AndroidPathIterator_androidKt.t(this.implementation.t(fArr, 0))) != PathSegment.Type.f31522Z) {
            if (typeT == PathSegment.Type.f31525o) {
                return PathSegmentKt.n();
            }
            int i2 = WhenMappings.$EnumSwitchMapping$1[typeT.ordinal()];
            float[] fArr2 = i2 != 1 ? i2 != 2 ? (i2 == 3 || i2 == 4) ? new float[]{fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]} : i2 != 5 ? new float[0] : new float[]{fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7]} : new float[]{fArr[0], fArr[1], fArr[2], fArr[3]} : new float[]{fArr[0], fArr[1]};
            return new PathSegment(typeT, fArr2, typeT == PathSegment.Type.J2 ? fArr[6] : 0.0f);
        }
        return PathSegmentKt.rl();
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public PathIterator.ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    public AndroidPathIterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f3) {
        PathIterator.ConicEvaluation conicEvaluation2;
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f3;
        Path path2 = getPath();
        if (path2 instanceof AndroidPath) {
            android.graphics.Path internalPath = ((AndroidPath) path2).getInternalPath();
            int i2 = WhenMappings.$EnumSwitchMapping$0[getConicEvaluation().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    conicEvaluation2 = PathIterator.ConicEvaluation.AsQuadratics;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                conicEvaluation2 = PathIterator.ConicEvaluation.AsConic;
            }
            this.implementation = new androidx.graphics.path.PathIterator(internalPath, conicEvaluation2, getTolerance());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
