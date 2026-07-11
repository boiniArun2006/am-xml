package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Barrier extends ConstraintHelper {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.Barrier f35880N;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f35881T;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35882e;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void aYN(ConstraintWidget constraintWidget, int i2, boolean z2) {
        this.f35881T = i2;
        if (z2) {
            int i3 = this.f35882e;
            if (i3 == 5) {
                this.f35881T = 1;
            } else if (i3 == 6) {
                this.f35881T = 0;
            }
        } else {
            int i5 = this.f35882e;
            if (i5 == 5) {
                this.f35881T = 0;
            } else if (i5 == 6) {
                this.f35881T = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.Barrier) {
            ((androidx.constraintlayout.core.widgets.Barrier) constraintWidget).I9f(this.f35881T);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void Ik(ConstraintWidget constraintWidget, boolean z2) {
        aYN(constraintWidget, this.f35882e, z2);
    }

    public boolean getAllowsGoneWidget() {
        return this.f35880N.Toy();
    }

    public int getMargin() {
        return this.f35880N.Th();
    }

    public int getType() {
        return this.f35882e;
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f35880N.lNy(z2);
    }

    public void setMargin(int i2) {
        this.f35880N.D76(i2);
    }

    public void setType(int i2) {
        this.f35882e = i2;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void HI(AttributeSet attributeSet) {
        super.HI(attributeSet);
        this.f35880N = new androidx.constraintlayout.core.widgets.Barrier();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.tFV);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.EF) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.xVH) {
                    this.f35880N.lNy(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == R.styleable.uG) {
                    this.f35880N.D76(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.J2 = this.f35880N;
        WPU();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void ck(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        super.ck(constraint, helperWidget, layoutParams, sparseArray);
        if (helperWidget instanceof androidx.constraintlayout.core.widgets.Barrier) {
            androidx.constraintlayout.core.widgets.Barrier barrier = (androidx.constraintlayout.core.widgets.Barrier) helperWidget;
            aYN(barrier, constraint.f35965O.f35991k, ((ConstraintWidgetContainer) helperWidget.rV9()).l());
            barrier.lNy(constraint.f35965O.pJg);
            barrier.D76(constraint.f35965O.dR0);
        }
    }

    public void setDpMargin(int i2) {
        this.f35880N.D76((int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f));
    }
}
