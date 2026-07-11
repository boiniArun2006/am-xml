package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class WidgetContainer extends ConstraintWidget {
    public ArrayList tFV;

    public WidgetContainer() {
        this.tFV = new ArrayList();
    }

    public void g6(ConstraintWidget... constraintWidgetArr) {
        for (ConstraintWidget constraintWidget : constraintWidgetArr) {
            n(constraintWidget);
        }
    }

    public ArrayList Mh() {
        return this.tFV;
    }

    public void Toy(ConstraintWidget constraintWidget) {
        this.tFV.remove(constraintWidget);
        constraintWidget.n1();
    }

    public void jO() {
        ArrayList arrayList = this.tFV;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.tFV.get(i2);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).jO();
            }
        }
    }

    public void n(ConstraintWidget constraintWidget) {
        this.tFV.add(constraintWidget);
        if (constraintWidget.rV9() != null) {
            ((WidgetContainer) constraintWidget.rV9()).Toy(constraintWidget);
        }
        constraintWidget.JVN(this);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n1() {
        this.tFV.clear();
        super.n1();
    }

    public void wKp() {
        this.tFV.clear();
    }

    public WidgetContainer(int i2, int i3) {
        super(i2, i3);
        this.tFV = new ArrayList();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void mYa(Cache cache) {
        super.mYa(cache);
        int size = this.tFV.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) this.tFV.get(i2)).mYa(cache);
        }
    }
}
