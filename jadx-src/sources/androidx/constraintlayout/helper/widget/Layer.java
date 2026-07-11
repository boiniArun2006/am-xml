package androidx.constraintlayout.helper.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class Layer extends ConstraintHelper {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f35626B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f35627D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected float f35628E;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    View[] f35629FX;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private float f35630J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    boolean f35631M;
    protected float M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f35632N;
    protected float P5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f35633T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected float f35634U;
    private float Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f35635a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f35636e;
    protected float eF;
    private float jB;
    protected float p5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ConstraintLayout f35637v;

    private void ViF() {
        int i2;
        if (this.f35637v == null || (i2 = this.f35900t) == 0) {
            return;
        }
        View[] viewArr = this.f35629FX;
        if (viewArr == null || viewArr.length != i2) {
            this.f35629FX = new View[i2];
        }
        for (int i3 = 0; i3 < this.f35900t; i3++) {
            this.f35629FX[i3] = this.f35637v.Ik(this.f35897n[i3]);
        }
    }

    private void nY() {
        if (this.f35637v == null) {
            return;
        }
        if (this.f35629FX == null) {
            ViF();
        }
        aYN();
        double radians = Float.isNaN(this.f35632N) ? 0.0d : Math.toRadians(this.f35632N);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f3 = this.Xw;
        float f4 = f3 * fCos;
        float f5 = this.jB;
        float f6 = (-f5) * fSin;
        float f7 = f3 * fSin;
        float f8 = f5 * fCos;
        for (int i2 = 0; i2 < this.f35900t; i2++) {
            View view = this.f35629FX[i2];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f9 = left - this.f35634U;
            float f10 = top - this.P5;
            float f11 = (((f4 * f9) + (f6 * f10)) - f9) + this.f35626B;
            float f12 = (((f9 * f7) + (f8 * f10)) - f10) + this.f35630J;
            view.setTranslationX(f11);
            view.setTranslationY(f12);
            view.setScaleY(this.jB);
            view.setScaleX(this.Xw);
            if (!Float.isNaN(this.f35632N)) {
                view.setRotation(this.f35632N);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void Z(ConstraintLayout constraintLayout) {
        this.f35637v = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f35632N = rotation;
        } else {
            if (Float.isNaN(this.f35632N)) {
                return;
            }
            this.f35632N = rotation;
        }
    }

    protected void aYN() {
        if (this.f35637v == null) {
            return;
        }
        if (this.f35631M || Float.isNaN(this.f35634U) || Float.isNaN(this.P5)) {
            if (!Float.isNaN(this.f35636e) && !Float.isNaN(this.f35633T)) {
                this.P5 = this.f35633T;
                this.f35634U = this.f35636e;
                return;
            }
            View[] viewArrTy = ty(this.f35637v);
            int left = viewArrTy[0].getLeft();
            int top = viewArrTy[0].getTop();
            int right = viewArrTy[0].getRight();
            int bottom = viewArrTy[0].getBottom();
            for (int i2 = 0; i2 < this.f35900t; i2++) {
                View view = viewArrTy[i2];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.M7 = right;
            this.p5 = bottom;
            this.eF = left;
            this.f35628E = top;
            if (Float.isNaN(this.f35636e)) {
                this.f35634U = (left + right) / 2;
            } else {
                this.f35634U = this.f35636e;
            }
            if (Float.isNaN(this.f35633T)) {
                this.P5 = (top + bottom) / 2;
            } else {
                this.P5 = this.f35633T;
            }
        }
    }

    @Override // android.view.View
    public void setPivotX(float f3) {
        this.f35636e = f3;
        nY();
    }

    @Override // android.view.View
    public void setPivotY(float f3) {
        this.f35633T = f3;
        nY();
    }

    @Override // android.view.View
    public void setRotation(float f3) {
        this.f35632N = f3;
        nY();
    }

    @Override // android.view.View
    public void setScaleX(float f3) {
        this.Xw = f3;
        nY();
    }

    @Override // android.view.View
    public void setScaleY(float f3) {
        this.jB = f3;
        nY();
    }

    @Override // android.view.View
    public void setTranslationX(float f3) {
        this.f35626B = f3;
        nY();
    }

    @Override // android.view.View
    public void setTranslationY(float f3) {
        this.f35630J = f3;
        nY();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void HI(AttributeSet attributeSet) {
        super.HI(attributeSet);
        this.f35899r = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.tFV);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.f36068f) {
                    this.f35627D = true;
                } else if (index == R.styleable.JVN) {
                    this.f35635a = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void mUb(ConstraintLayout constraintLayout) {
        xMQ(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35637v = (ConstraintLayout) getParent();
        if (this.f35627D || this.f35635a) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f35900t; i2++) {
                View viewIk = this.f35637v.Ik(this.f35897n[i2]);
                if (viewIk != null) {
                    if (this.f35627D) {
                        viewIk.setVisibility(visibility);
                    }
                    if (this.f35635a && elevation > 0.0f) {
                        viewIk.setTranslationZ(viewIk.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void r(ConstraintLayout constraintLayout) {
        ViF();
        this.f35634U = Float.NaN;
        this.P5 = Float.NaN;
        ConstraintWidget constraintWidgetRl = ((ConstraintLayout.LayoutParams) getLayoutParams()).rl();
        constraintWidgetRl.vl(0);
        constraintWidgetRl.a63(0);
        aYN();
        layout(((int) this.eF) - getPaddingLeft(), ((int) this.f35628E) - getPaddingTop(), ((int) this.M7) + getPaddingRight(), ((int) this.p5) + getPaddingBottom());
        nY();
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        KN();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        KN();
    }
}
