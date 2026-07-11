package androidx.constraintlayout.helper.widget;

import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.widget.VirtualLayout;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class MotionPlaceholder extends VirtualLayout {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    Placeholder f35640N;

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void XQ(ConstraintWidgetContainer constraintWidgetContainer, Helper helper, SparseArray sparseArray) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onMeasure(int i2, int i3) {
        aYN(this.f35640N, i2, i3);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    protected void HI(AttributeSet attributeSet) {
        super.HI(attributeSet);
        this.J2 = new Placeholder();
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
}
