package androidx.graphics.path;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/graphics/path/ConicConverter;", "", "<init>", "()V", "", "conicPoints", "", "offset", "quadraticPoints", "", "weight", "tolerance", "internalConicToQuadratics", "([FI[FFF)I", "points", "", "nr", "([FI)Z", "", c.f62177j, "([FFFI)V", "<set-?>", "I", "t", "()I", "quadraticCount", "rl", "setCurrentQuadratic", "(I)V", "currentQuadratic", "[F", "quadraticData", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConicConverter {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int quadraticCount;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private int currentQuadratic;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float[] quadraticData = new float[130];

    private final native int internalConicToQuadratics(float[] conicPoints, int offset, float[] quadraticPoints, float weight, float tolerance);

    public final void n(float[] points, float weight, float tolerance, int offset) {
        Intrinsics.checkNotNullParameter(points, "points");
        int iInternalConicToQuadratics = internalConicToQuadratics(points, offset, this.quadraticData, weight, tolerance);
        this.quadraticCount = iInternalConicToQuadratics;
        int i2 = (iInternalConicToQuadratics * 4) + 2;
        if (i2 > this.quadraticData.length) {
            float[] fArr = new float[i2];
            this.quadraticData = fArr;
            this.quadraticCount = internalConicToQuadratics(points, offset, fArr, weight, tolerance);
        }
        this.currentQuadratic = 0;
    }

    public final boolean nr(float[] points, int offset) {
        Intrinsics.checkNotNullParameter(points, "points");
        int i2 = this.currentQuadratic;
        if (i2 >= this.quadraticCount) {
            return false;
        }
        int i3 = i2 * 4;
        float[] fArr = this.quadraticData;
        points[offset] = fArr[i3];
        points[offset + 1] = fArr[i3 + 1];
        points[offset + 2] = fArr[i3 + 2];
        points[offset + 3] = fArr[i3 + 3];
        points[offset + 4] = fArr[i3 + 4];
        points[offset + 5] = fArr[i3 + 5];
        this.currentQuadratic = i2 + 1;
        return true;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getCurrentQuadratic() {
        return this.currentQuadratic;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getQuadraticCount() {
        return this.quadraticCount;
    }
}
