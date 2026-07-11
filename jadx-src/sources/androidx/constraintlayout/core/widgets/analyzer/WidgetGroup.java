package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class WidgetGroup {
    static int Uo;
    int nr;
    int rl;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f35579n = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f35580t = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    ArrayList f35578O = null;
    private int J2 = -1;

    private int mUb(LinearSystem linearSystem, ArrayList arrayList, int i2) {
        int iG;
        int iG2;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) ((ConstraintWidget) arrayList.get(0)).rV9();
        linearSystem.X();
        constraintWidgetContainer.Uo(linearSystem, false);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((ConstraintWidget) arrayList.get(i3)).Uo(linearSystem, false);
        }
        if (i2 == 0 && constraintWidgetContainer.X4T > 0) {
            Chain.rl(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i2 == 1 && constraintWidgetContainer.Zmq > 0) {
            Chain.rl(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.iF();
        } catch (Exception e2) {
            System.err.println(e2.toString() + "\n" + Arrays.toString(e2.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f35578O = new ArrayList();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.f35578O.add(new MeasureResult((ConstraintWidget) arrayList.get(i5), linearSystem, i2));
        }
        if (i2 == 0) {
            iG = linearSystem.g(constraintWidgetContainer.jB);
            iG2 = linearSystem.g(constraintWidgetContainer.P5);
            linearSystem.X();
        } else {
            iG = linearSystem.g(constraintWidgetContainer.f35517U);
            iG2 = linearSystem.g(constraintWidgetContainer.M7);
            linearSystem.X();
        }
        return iG2 - iG;
    }

    static class MeasureResult {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f35581O;
        int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        WeakReference f35582n;
        int nr;
        int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f35583t;

        MeasureResult(ConstraintWidget constraintWidget, LinearSystem linearSystem, int i2) {
            this.f35582n = new WeakReference(constraintWidget);
            this.rl = linearSystem.g(constraintWidget.jB);
            this.f35583t = linearSystem.g(constraintWidget.f35517U);
            this.nr = linearSystem.g(constraintWidget.P5);
            this.f35581O = linearSystem.g(constraintWidget.M7);
            this.J2 = linearSystem.g(constraintWidget.p5);
            this.Uo = i2;
        }
    }

    private String O() {
        int i2 = this.nr;
        return i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown";
    }

    public int J2(LinearSystem linearSystem, int i2) {
        if (this.f35579n.size() == 0) {
            return 0;
        }
        return mUb(linearSystem, this.f35579n, i2);
    }

    public void KN(boolean z2) {
        this.f35580t = z2;
    }

    public void Uo(int i2, WidgetGroup widgetGroup) {
        for (ConstraintWidget constraintWidget : this.f35579n) {
            widgetGroup.n(constraintWidget);
            if (i2 == 0) {
                constraintWidget.a63 = widgetGroup.t();
            } else {
                constraintWidget.f35505F = widgetGroup.t();
            }
        }
        this.J2 = widgetGroup.rl;
    }

    public boolean n(ConstraintWidget constraintWidget) {
        if (this.f35579n.contains(constraintWidget)) {
            return false;
        }
        this.f35579n.add(constraintWidget);
        return true;
    }

    public int nr() {
        return this.nr;
    }

    public void rl(ArrayList arrayList) {
        int size = this.f35579n.size();
        if (this.J2 != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                WidgetGroup widgetGroup = (WidgetGroup) arrayList.get(i2);
                if (this.J2 == widgetGroup.rl) {
                    Uo(this.nr, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int t() {
        return this.rl;
    }

    public String toString() {
        String str = O() + " [" + this.rl + "] <";
        Iterator it = this.f35579n.iterator();
        while (it.hasNext()) {
            str = str + " " + ((ConstraintWidget) it.next()).S();
        }
        return str + " >";
    }

    public void xMQ(int i2) {
        this.nr = i2;
    }

    public WidgetGroup(int i2) {
        int i3 = Uo;
        Uo = i3 + 1;
        this.rl = i3;
        this.nr = i2;
    }
}
