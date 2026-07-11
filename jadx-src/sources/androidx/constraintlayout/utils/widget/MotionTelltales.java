package androidx.constraintlayout.utils.widget;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class MotionTelltales extends MockView {
    private Paint E2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    Matrix f35876N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    float[] f35877T;
    float Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    MotionLayout f35878e;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f35879v;

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f35876N);
        if (this.f35878e == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f35878e = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i2 = 0; i2 < 5; i2++) {
            float f3 = fArr[i2];
            for (int i3 = 0; i3 < 5; i3++) {
                float f4 = fArr[i3];
                this.f35878e.ofS(this, f4, f3, this.f35877T, this.f35879v);
                this.f35876N.mapVectors(this.f35877T);
                float f5 = width * f4;
                float f6 = height * f3;
                float[] fArr2 = this.f35877T;
                float f7 = fArr2[0];
                float f8 = this.Xw;
                float f9 = f6 - (fArr2[1] * f8);
                this.f35876N.mapVectors(fArr2);
                canvas.drawLine(f5, f6, f5 - (f7 * f8), f9, this.E2);
            }
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        super.onLayout(z2, i2, i3, i5, i7);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f35840o = charSequence.toString();
        requestLayout();
    }
}
