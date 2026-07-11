package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.SharedValues;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class ReactiveGuide extends View implements SharedValues.SharedValuesListener {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f36095O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36096n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f36097t;

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public int getApplyToConstraintSetId() {
        return this.f36095O;
    }

    public int getAttributeId() {
        return this.f36096n;
    }

    public void setAnimateChange(boolean z2) {
        this.f36097t = z2;
    }

    public void setApplyToConstraintSetId(int i2) {
        this.f36095O = i2;
    }

    public void setAttributeId(int i2) {
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i3 = this.f36096n;
        if (i3 != -1) {
            sharedValues.rl(i3, this);
        }
        this.f36096n = i2;
        if (i2 != -1) {
            sharedValues.n(i2, this);
        }
    }

    public void setGuidelineBegin(int i2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f35943n = i2;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.rl = i2;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f3) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f35946t = f3;
        setLayoutParams(layoutParams);
    }
}
