package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class MotionHelper extends ConstraintHelper implements MotionHelperInterface {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f35714N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f35715T;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35716e;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected View[] f35717v;

    public void E2(View view, float f3) {
    }

    public boolean aYN() {
        return false;
    }

    public void fD(MotionLayout motionLayout, HashMap map) {
    }

    public void g(MotionLayout motionLayout) {
    }

    public void iF(Canvas canvas) {
    }

    public void n(MotionLayout motionLayout, int i2, int i3, float f3) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void nr(MotionLayout motionLayout, int i2, boolean z2, float f3) {
    }

    public void rl(MotionLayout motionLayout, int i2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void t(MotionLayout motionLayout, int i2, int i3) {
    }

    public void te(Canvas canvas) {
    }

    public boolean ViF() {
        return this.f35715T;
    }

    public float getProgress() {
        return this.f35714N;
    }

    public boolean nY() {
        return this.f35716e;
    }

    public void setProgress(float f3) {
        this.f35714N = f3;
        int i2 = 0;
        if (this.f35900t > 0) {
            this.f35717v = ty((ConstraintLayout) getParent());
            while (i2 < this.f35900t) {
                E2(this.f35717v[i2], f3);
                i2++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i2 < childCount) {
            View childAt = viewGroup.getChildAt(i2);
            if (!(childAt instanceof MotionHelper)) {
                E2(childAt, f3);
            }
            i2++;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void HI(AttributeSet attributeSet) {
        super.HI(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.IZz);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.dt) {
                    this.f35716e = typedArrayObtainStyledAttributes.getBoolean(index, this.f35716e);
                } else if (index == R.styleable.AUF) {
                    this.f35715T = typedArrayObtainStyledAttributes.getBoolean(index, this.f35715T);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
