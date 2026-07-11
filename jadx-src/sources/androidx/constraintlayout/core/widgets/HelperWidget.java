package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class HelperWidget extends ConstraintWidget implements Helper {
    public ConstraintWidget[] tFV = new ConstraintWidget[4];
    public int VwL = 0;

    public int Mh(int i2) {
        int i3;
        int i5;
        for (int i7 = 0; i7 < this.VwL; i7++) {
            ConstraintWidget constraintWidget = this.tFV[i7];
            if (i2 == 0 && (i5 = constraintWidget.a63) != -1) {
                return i5;
            }
            if (i2 == 1 && (i3 = constraintWidget.f35505F) != -1) {
                return i3;
            }
        }
        return -1;
    }

    public void g6(ArrayList arrayList, int i2, WidgetGroup widgetGroup) {
        for (int i3 = 0; i3 < this.VwL; i3++) {
            widgetGroup.n(this.tFV[i3]);
        }
        for (int i5 = 0; i5 < this.VwL; i5++) {
            Grouping.n(this.tFV[i5], i2, arrayList, widgetGroup);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void rl() {
        this.VwL = 0;
        Arrays.fill(this.tFV, (Object) null);
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void t(ConstraintWidgetContainer constraintWidgetContainer) {
    }

    @Override // androidx.constraintlayout.core.widgets.Helper
    public void n(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i2 = this.VwL + 1;
        ConstraintWidget[] constraintWidgetArr = this.tFV;
        if (i2 > constraintWidgetArr.length) {
            this.tFV = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.tFV;
        int i3 = this.VwL;
        constraintWidgetArr2[i3] = constraintWidget;
        this.VwL = i3 + 1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void ty(ConstraintWidget constraintWidget, HashMap map) {
        super.ty(constraintWidget, map);
        HelperWidget helperWidget = (HelperWidget) constraintWidget;
        this.VwL = 0;
        int i2 = helperWidget.VwL;
        for (int i3 = 0; i3 < i2; i3++) {
            n((ConstraintWidget) map.get(helperWidget.tFV[i3]));
        }
    }
}
