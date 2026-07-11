package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Flow extends VirtualLayout {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private androidx.constraintlayout.core.widgets.Flow f35613N;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void Ik(ConstraintWidget constraintWidget, boolean z2) {
        this.f35613N.jO(z2);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onMeasure(int i2, int i3) {
        aYN(this.f35613N, i2, i3);
    }

    public void setFirstHorizontalBias(float f3) {
        this.f35613N.GH3(f3);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.f35613N.w(i2);
        requestLayout();
    }

    public void setFirstVerticalBias(float f3) {
        this.f35613N.HFS(f3);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.f35613N.eb(i2);
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.f35613N.Xli(i2);
        requestLayout();
    }

    public void setHorizontalBias(float f3) {
        this.f35613N.fq(f3);
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.f35613N.C7B(i2);
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.f35613N.wYi(i2);
        requestLayout();
    }

    public void setLastHorizontalBias(float f3) {
        this.f35613N.TVk(f3);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i2) {
        this.f35613N.lRt(i2);
        requestLayout();
    }

    public void setLastVerticalBias(float f3) {
        this.f35613N.n7u(f3);
        requestLayout();
    }

    public void setLastVerticalStyle(int i2) {
        this.f35613N.yA(i2);
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.f35613N.gxH(i2);
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.f35613N.YiW(i2);
        requestLayout();
    }

    public void setPadding(int i2) {
        this.f35613N.rxp(i2);
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.f35613N.Fp(i2);
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.f35613N.SR(i2);
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.f35613N.EN(i2);
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.f35613N.tEO(i2);
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.f35613N.c(i2);
        requestLayout();
    }

    public void setVerticalBias(float f3) {
        this.f35613N.Sax(f3);
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.f35613N.kQ(i2);
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.f35613N.x(i2);
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.f35613N.XUb(i2);
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void HI(AttributeSet attributeSet) {
        super.HI(attributeSet);
        this.f35613N = new androidx.constraintlayout.core.widgets.Flow();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.tFV);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.VwL) {
                    this.f35613N.YiW(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.mI) {
                    this.f35613N.rxp(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.X4T) {
                    this.f35613N.pS(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.Zmq) {
                    this.f35613N.Ro(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.T3L) {
                    this.f35613N.SR(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.Bu) {
                    this.f35613N.tEO(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.p0N) {
                    this.f35613N.EN(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.Uf) {
                    this.f35613N.Fp(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.f36026H) {
                    this.f35613N.XUb(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.wKp) {
                    this.f35613N.wYi(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.f36072j) {
                    this.f35613N.x(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.f36084s) {
                    this.f35613N.w(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.xzo) {
                    this.f35613N.lRt(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.g6) {
                    this.f35613N.eb(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.lNy) {
                    this.f35613N.yA(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.jO) {
                    this.f35613N.fq(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.Aum) {
                    this.f35613N.GH3(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.Th) {
                    this.f35613N.TVk(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.Lp6) {
                    this.f35613N.HFS(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.XNZ) {
                    this.f35613N.n7u(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.f36036NP) {
                    this.f35613N.Sax(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == R.styleable.Mh) {
                    this.f35613N.Xli(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == R.styleable.D76) {
                    this.f35613N.c(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == R.styleable.Toy) {
                    this.f35613N.C7B(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.QgZ) {
                    this.f35613N.kQ(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == R.styleable.I9f) {
                    this.f35613N.gxH(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.J2 = this.f35613N;
        WPU();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void aYN(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (virtualLayout != null) {
            virtualLayout.NP(mode, size, mode2, size2);
            setMeasuredDimension(virtualLayout.xzo(), virtualLayout.Th());
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void ck(ConstraintSet.Constraint constraint, HelperWidget helperWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray sparseArray) {
        super.ck(constraint, helperWidget, layoutParams, sparseArray);
        if (helperWidget instanceof androidx.constraintlayout.core.widgets.Flow) {
            androidx.constraintlayout.core.widgets.Flow flow = (androidx.constraintlayout.core.widgets.Flow) helperWidget;
            int i2 = layoutParams.f35920B;
            if (i2 != -1) {
                flow.YiW(i2);
            }
        }
    }
}
