package androidx.core.view.insets;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class GradientProtection extends Protection {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float[] f36880o;
    private final int[] HI;
    private int Ik;
    private boolean ck;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f36881r;
    private final GradientDrawable ty;

    private static void Ik(int i2, int[] iArr) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = Color.argb((int) (f36880o[length] * Color.alpha(i2)), Color.red(i2), Color.green(i2), Color.blue(i2));
        }
    }

    static {
        float[] fArr = new float[100];
        f36880o = fArr;
        PathInterpolator pathInterpolator = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
        int length = fArr.length - 1;
        for (int i2 = length; i2 >= 0; i2--) {
            f36880o[i2] = pathInterpolator.getInterpolation((length - i2) / length);
        }
    }

    private void ck(int i2) {
        if (this.Ik != i2) {
            this.Ik = i2;
            Ik(i2, this.HI);
            this.ty.setColors(this.HI);
            xMQ(this.ty);
        }
    }

    @Override // androidx.core.view.insets.Protection
    int J2(int i2) {
        return (int) (this.f36881r * i2);
    }

    @Override // androidx.core.view.insets.Protection
    void n(int i2) {
        if (this.ck) {
            return;
        }
        ck(i2);
    }
}
