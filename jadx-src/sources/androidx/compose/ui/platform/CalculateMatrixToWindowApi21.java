package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\t*\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi21;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "Landroidx/compose/ui/graphics/Matrix;", "tmpMatrix", "<init>", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/view/View;", "view", "matrix", "", "nr", "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", InneractiveMediationNameConsts.OTHER, "rl", "([FLandroid/graphics/Matrix;)V", "", "x", "y", "t", "([FFF)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "[F", "", "[I", "tmpLocation", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float[] tmpMatrix;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int[] tmpLocation;

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }

    private final void rl(float[] fArr, Matrix matrix) {
        AndroidMatrixConversions_androidKt.rl(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.xMQ(fArr, this.tmpMatrix);
    }

    private final void t(float[] fArr, float f3, float f4) {
        AndroidComposeView_androidKt.mUb(fArr, f3, f4, this.tmpMatrix);
    }

    private final void nr(View view, float[] matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            nr((View) parent, matrix);
            t(matrix, -view.getScrollX(), -view.getScrollY());
            t(matrix, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpLocation);
            t(matrix, -view.getScrollX(), -view.getScrollY());
            t(matrix, r0[0], r0[1]);
        }
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            rl(matrix, matrix2);
        }
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    public void n(View view, float[] matrix) {
        androidx.compose.ui.graphics.Matrix.KN(matrix);
        nr(view, matrix);
    }
}
