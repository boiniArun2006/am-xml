package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class RunGroup {
    public static int KN;
    int J2;
    int Uo;
    WidgetRun nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    WidgetRun f35576t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f35575n = 0;
    public boolean rl = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    ArrayList f35574O = new ArrayList();

    private long nr(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.nr;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        int size = dependencyNode.gh.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = (Dependency) dependencyNode.gh.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.nr != widgetRun) {
                    jMax = Math.max(jMax, nr(dependencyNode2, ((long) dependencyNode2.J2) + j2));
                }
            }
        }
        if (dependencyNode != widgetRun.KN) {
            return jMax;
        }
        long jMUb = j2 + widgetRun.mUb();
        return Math.max(Math.max(jMax, nr(widgetRun.xMQ, jMUb)), jMUb - ((long) widgetRun.xMQ.J2));
    }

    private long t(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.nr;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        int size = dependencyNode.gh.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            Dependency dependency = (Dependency) dependencyNode.gh.get(i2);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.nr != widgetRun) {
                    jMin = Math.min(jMin, t(dependencyNode2, ((long) dependencyNode2.J2) + j2));
                }
            }
        }
        if (dependencyNode != widgetRun.xMQ) {
            return jMin;
        }
        long jMUb = j2 - widgetRun.mUb();
        return Math.min(Math.min(jMin, t(widgetRun.KN, jMUb)), jMUb - ((long) widgetRun.KN.J2));
    }

    public void n(WidgetRun widgetRun) {
        this.f35574O.add(widgetRun);
        this.nr = widgetRun;
    }

    public long rl(ConstraintWidgetContainer constraintWidgetContainer, int i2) {
        long jMUb;
        int i3;
        WidgetRun widgetRun = this.f35576t;
        if (widgetRun instanceof ChainRun) {
            if (((ChainRun) widgetRun).J2 != i2) {
                return 0L;
            }
        } else if (i2 == 0) {
            if (!(widgetRun instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof VerticalWidgetRun)) {
            return 0L;
        }
        DependencyNode dependencyNode = (i2 == 0 ? constraintWidgetContainer.f35514O : constraintWidgetContainer.J2).KN;
        DependencyNode dependencyNode2 = (i2 == 0 ? constraintWidgetContainer.f35514O : constraintWidgetContainer.J2).xMQ;
        boolean zContains = widgetRun.KN.qie.contains(dependencyNode);
        boolean zContains2 = this.f35576t.xMQ.qie.contains(dependencyNode2);
        long jMUb2 = this.f35576t.mUb();
        if (zContains && zContains2) {
            long jNr = nr(this.f35576t.KN, 0L);
            long jT2 = t(this.f35576t.xMQ, 0L);
            long j2 = jNr - jMUb2;
            WidgetRun widgetRun2 = this.f35576t;
            int i5 = widgetRun2.xMQ.J2;
            if (j2 >= (-i5)) {
                j2 += (long) i5;
            }
            int i7 = widgetRun2.KN.J2;
            long j3 = ((-jT2) - jMUb2) - ((long) i7);
            if (j3 >= i7) {
                j3 -= (long) i7;
            }
            float fO = widgetRun2.rl.o(i2);
            float f3 = fO > 0.0f ? (long) ((j3 / fO) + (j2 / (1.0f - fO))) : 0L;
            long j4 = ((long) ((f3 * fO) + 0.5f)) + jMUb2 + ((long) ((f3 * (1.0f - fO)) + 0.5f));
            WidgetRun widgetRun3 = this.f35576t;
            jMUb = ((long) widgetRun3.KN.J2) + j4;
            i3 = widgetRun3.xMQ.J2;
        } else {
            if (zContains) {
                return Math.max(nr(this.f35576t.KN, r12.J2), ((long) this.f35576t.KN.J2) + jMUb2);
            }
            if (zContains2) {
                return Math.max(-t(this.f35576t.xMQ, r12.J2), ((long) (-this.f35576t.xMQ.J2)) + jMUb2);
            }
            WidgetRun widgetRun4 = this.f35576t;
            jMUb = ((long) widgetRun4.KN.J2) + widgetRun4.mUb();
            i3 = this.f35576t.xMQ.J2;
        }
        return jMUb - ((long) i3);
    }

    RunGroup(WidgetRun widgetRun, int i2) {
        this.f35576t = null;
        this.nr = null;
        int i3 = KN;
        this.J2 = i3;
        KN = i3 + 1;
        this.f35576t = widgetRun;
        this.nr = widgetRun;
        this.Uo = i2;
    }
}
