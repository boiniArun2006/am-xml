package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Placeholder extends VirtualLayout {
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void NP(int i2, int i3, int i5, int i7) {
        int iLNy = lNy() + I9f();
        int iD76 = D76() + XNZ();
        boolean z2 = false;
        if (this.VwL > 0) {
            iLNy += this.tFV[0].J();
            iD76 += this.tFV[0].nY();
        }
        int iMax = Math.max(wTp(), iLNy);
        int iMax2 = Math.max(s7N(), iD76);
        if (i2 != 1073741824) {
            if (i2 == Integer.MIN_VALUE) {
                i3 = Math.min(iMax, i3);
            } else if (i2 == 0) {
                i3 = iMax;
            } else {
                i3 = 0;
            }
        }
        if (i5 != 1073741824) {
            if (i5 == Integer.MIN_VALUE) {
                i7 = Math.min(iMax2, i7);
            } else if (i5 == 0) {
                i7 = iMax2;
            } else {
                i7 = 0;
            }
        }
        LPV(i3, i7);
        vl(i3);
        a63(i7);
        if (this.VwL > 0) {
            z2 = true;
        }
        waP(z2);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void Uo(LinearSystem linearSystem, boolean z2) {
        super.Uo(linearSystem, z2);
        if (this.VwL > 0) {
            ConstraintWidget constraintWidget = this.tFV[0];
            constraintWidget.Jk();
            ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
            constraintWidget.mUb(type, this, type);
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
            constraintWidget.mUb(type2, this, type2);
            ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
            constraintWidget.mUb(type3, this, type3);
            ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
            constraintWidget.mUb(type4, this, type4);
        }
    }
}
