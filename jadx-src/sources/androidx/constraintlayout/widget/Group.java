package androidx.constraintlayout.widget;

import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class Group extends ConstraintHelper {
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void HI(AttributeSet attributeSet) {
        super.HI(attributeSet);
        this.f35899r = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void mUb(ConstraintLayout constraintLayout) {
        xMQ(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        KN();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void r(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.eWT.vl(0);
        layoutParams.eWT.a63(0);
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
