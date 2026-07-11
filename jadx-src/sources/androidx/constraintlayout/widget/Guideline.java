package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36010n;

    public Guideline(Context context) {
        super(context);
        this.f36010n = true;
        super.setVisibility(8);
    }

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

    public void setFilterRedundantCalls(boolean z2) {
        this.f36010n = z2;
    }

    public void setGuidelineBegin(int i2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f36010n && layoutParams.f35943n == i2) {
            return;
        }
        layoutParams.f35943n = i2;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i2) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f36010n && layoutParams.rl == i2) {
            return;
        }
        layoutParams.rl = i2;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f3) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.f36010n && layoutParams.f35946t == f3) {
            return;
        }
        layoutParams.f35946t = f3;
        setLayoutParams(layoutParams);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36010n = true;
        super.setVisibility(8);
    }
}
