package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f36105T;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36106e;

    public void aYN(androidx.constraintlayout.core.widgets.VirtualLayout virtualLayout, int i2, int i3) {
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void HI(AttributeSet attributeSet) {
        super.HI(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.tFV);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.f36068f) {
                    this.f36106e = true;
                } else if (index == R.styleable.JVN) {
                    this.f36105T = true;
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
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f36106e || this.f36105T) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i2 = 0; i2 < this.f35900t; i2++) {
                    View viewIk = constraintLayout.Ik(this.f35897n[i2]);
                    if (viewIk != null) {
                        if (this.f36106e) {
                            viewIk.setVisibility(visibility);
                        }
                        if (this.f36105T && elevation > 0.0f) {
                            viewIk.setTranslationZ(viewIk.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
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
