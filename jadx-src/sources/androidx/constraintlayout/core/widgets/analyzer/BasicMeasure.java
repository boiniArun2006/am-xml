package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class BasicMeasure {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList f35552n = new ArrayList();
    private Measure rl = new Measure();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ConstraintWidgetContainer f35553t;

    public static class Measure {
        public static int az = 2;
        public static int gh = 0;
        public static int qie = 1;
        public int J2;
        public boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f35554O;
        public int Uo;
        public int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f35555n;
        public int nr;
        public ConstraintWidget.DimensionBehaviour rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f35556t;
        public boolean xMQ;
    }

    public interface Measurer {
        void n();

        void rl(ConstraintWidget constraintWidget, Measure measure);
    }

    private boolean n(Measurer measurer, ConstraintWidget constraintWidget, int i2) {
        this.rl.f35555n = constraintWidget.iF();
        this.rl.rl = constraintWidget.M();
        this.rl.f35556t = constraintWidget.J();
        this.rl.nr = constraintWidget.nY();
        Measure measure = this.rl;
        measure.xMQ = false;
        measure.mUb = i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.f35555n;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = dimensionBehaviour == dimensionBehaviour2;
        boolean z3 = measure.rl == dimensionBehaviour2;
        boolean z4 = z2 && constraintWidget.Nxk > 0.0f;
        boolean z5 = z3 && constraintWidget.Nxk > 0.0f;
        if (z4 && constraintWidget.ViF[0] == 4) {
            measure.f35555n = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z5 && constraintWidget.ViF[1] == 4) {
            measure.rl = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        measurer.rl(constraintWidget, measure);
        constraintWidget.vl(this.rl.f35554O);
        constraintWidget.a63(this.rl.J2);
        constraintWidget.RQ(this.rl.KN);
        constraintWidget.hRu(this.rl.Uo);
        Measure measure2 = this.rl;
        measure2.mUb = Measure.gh;
        return measure2.xMQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0098 A[PHI: r10
      0x0098: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0062, B:34:0x0068, B:36:0x006c, B:54:0x0095, B:52:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void rl(ConstraintWidgetContainer constraintWidgetContainer) {
        HorizontalWidgetRun horizontalWidgetRun;
        VerticalWidgetRun verticalWidgetRun;
        int size = constraintWidgetContainer.tFV.size();
        boolean zMx = constraintWidgetContainer.mx(64);
        Measurer measurerRo = constraintWidgetContainer.Ro();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) constraintWidgetContainer.tFV.get(i2);
            if (!(constraintWidget instanceof Guideline) && !(constraintWidget instanceof Barrier) && !constraintWidget.pJg() && (!zMx || (horizontalWidgetRun = constraintWidget.f35514O) == null || (verticalWidgetRun = constraintWidget.J2) == null || !horizontalWidgetRun.f35584O.mUb || !verticalWidgetRun.f35584O.mUb)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviourWPU = constraintWidget.WPU(0);
                boolean z2 = true;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourWPU2 = constraintWidget.WPU(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z3 = dimensionBehaviourWPU == dimensionBehaviour && constraintWidget.WPU != 1 && dimensionBehaviourWPU2 == dimensionBehaviour && constraintWidget.aYN != 1;
                if (z3 || !constraintWidgetContainer.mx(1) || (constraintWidget instanceof VirtualLayout)) {
                    z2 = z3;
                    if (z2) {
                        n(measurerRo, constraintWidget, Measure.gh);
                        Metrics metrics = constraintWidgetContainer.Uf;
                        if (metrics != null) {
                            metrics.f34995t++;
                        }
                    }
                } else {
                    if (dimensionBehaviourWPU == dimensionBehaviour && constraintWidget.WPU == 0 && dimensionBehaviourWPU2 != dimensionBehaviour && !constraintWidget.m()) {
                        z3 = true;
                    }
                    if (dimensionBehaviourWPU2 == dimensionBehaviour && constraintWidget.aYN == 0 && dimensionBehaviourWPU != dimensionBehaviour && !constraintWidget.m()) {
                        z3 = true;
                    }
                    if ((dimensionBehaviourWPU != dimensionBehaviour && dimensionBehaviourWPU2 != dimensionBehaviour) || constraintWidget.Nxk <= 0.0f) {
                    }
                    if (z2) {
                    }
                }
            }
        }
        measurerRo.n();
    }

    private void t(ConstraintWidgetContainer constraintWidgetContainer, String str, int i2, int i3, int i5) {
        long jNanoTime = constraintWidgetContainer.Uf != null ? System.nanoTime() : 0L;
        int iWTp = constraintWidgetContainer.wTp();
        int iS7N = constraintWidgetContainer.s7N();
        constraintWidgetContainer.X4T(0);
        constraintWidgetContainer.UF(0);
        constraintWidgetContainer.vl(i3);
        constraintWidgetContainer.a63(i5);
        constraintWidgetContainer.X4T(iWTp);
        constraintWidgetContainer.UF(iS7N);
        this.f35553t.bZm(i2);
        this.f35553t.jO();
        if (constraintWidgetContainer.Uf != null) {
            long jNanoTime2 = System.nanoTime();
            Metrics metrics = constraintWidgetContainer.Uf;
            metrics.f34987U++;
            metrics.rl += jNanoTime2 - jNanoTime;
        }
    }

    public void O(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f35552n.clear();
        int size = constraintWidgetContainer.tFV.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) constraintWidgetContainer.tFV.get(i2);
            ConstraintWidget.DimensionBehaviour dimensionBehaviourIF = constraintWidget.iF();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviourIF == dimensionBehaviour || constraintWidget.M() == dimensionBehaviour) {
                this.f35552n.add(constraintWidget);
            }
        }
        constraintWidgetContainer.tEO();
    }

    public long nr(ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12) {
        long j2;
        boolean zRxp;
        int i13;
        int i14;
        int i15;
        long j3;
        boolean z2;
        long j4;
        int i16;
        int i17;
        boolean z3;
        Metrics metrics;
        BasicMeasure basicMeasure = this;
        ConstraintWidgetContainer constraintWidgetContainer2 = constraintWidgetContainer;
        Measurer measurerRo = constraintWidgetContainer2.Ro();
        int size = constraintWidgetContainer2.tFV.size();
        int iJ = constraintWidgetContainer2.J();
        int iNY = constraintWidgetContainer2.nY();
        boolean zRl = Optimizer.rl(i2, 128);
        boolean z4 = zRl || Optimizer.rl(i2, 64);
        if (z4) {
            for (int i18 = 0; i18 < size; i18++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) constraintWidgetContainer2.tFV.get(i18);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourIF = constraintWidget.iF();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z5 = (dimensionBehaviourIF == dimensionBehaviour) && (constraintWidget.M() == dimensionBehaviour) && constraintWidget.aYN() > 0.0f;
                if ((constraintWidget.m() && z5) || ((constraintWidget.xg() && z5) || (constraintWidget instanceof VirtualLayout) || constraintWidget.m() || constraintWidget.xg())) {
                    z4 = false;
                    break;
                }
            }
        }
        if (z4 && (metrics = LinearSystem.aYN) != null) {
            metrics.f34984O++;
        }
        boolean z6 = z4 & ((i7 == 1073741824 && i9 == 1073741824) || zRl);
        int i19 = 2;
        if (z6) {
            j2 = 1;
            int iMin = Math.min(constraintWidgetContainer2.nHg(), i8);
            int iMin2 = Math.min(constraintWidgetContainer2.N(), i10);
            if (i7 == 1073741824 && constraintWidgetContainer2.J() != iMin) {
                constraintWidgetContainer2.vl(iMin);
                constraintWidgetContainer2.tEO();
            }
            if (i9 == 1073741824 && constraintWidgetContainer2.nY() != iMin2) {
                constraintWidgetContainer2.a63(iMin2);
                constraintWidgetContainer2.tEO();
            }
            if (i7 == 1073741824 && i9 == 1073741824) {
                zRxp = constraintWidgetContainer2.waP(zRl);
                i13 = 2;
            } else {
                boolean zLPV = constraintWidgetContainer2.LPV(zRl);
                if (i7 == 1073741824) {
                    zLPV &= constraintWidgetContainer2.rxp(zRl, 0);
                    i13 = 1;
                } else {
                    i13 = 0;
                }
                if (i9 == 1073741824) {
                    zRxp = constraintWidgetContainer2.rxp(zRl, 1) & zLPV;
                    i13++;
                } else {
                    zRxp = zLPV;
                }
            }
            if (zRxp) {
                constraintWidgetContainer2.s(i7 == 1073741824, i9 == 1073741824);
            }
        } else {
            j2 = 1;
            zRxp = false;
            i13 = 0;
        }
        if (!zRxp || i13 != 2) {
            int iSR = constraintWidgetContainer2.SR();
            if (size > 0) {
                rl(constraintWidgetContainer);
            }
            jNanoTime = constraintWidgetContainer2.Uf != null ? System.nanoTime() : 0L;
            O(constraintWidgetContainer);
            int size2 = basicMeasure.f35552n.size();
            if (size > 0) {
                basicMeasure.t(constraintWidgetContainer2, "First pass", 0, iJ, iNY);
                i14 = iJ;
                i15 = iNY;
            } else {
                i14 = iJ;
                i15 = iNY;
            }
            if (size2 > 0) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviourIF2 = constraintWidgetContainer2.iF();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z7 = dimensionBehaviourIF2 == dimensionBehaviour2;
                boolean z9 = constraintWidgetContainer2.M() == dimensionBehaviour2;
                int iMax = Math.max(constraintWidgetContainer2.J(), basicMeasure.f35553t.wTp());
                int iMax2 = Math.max(constraintWidgetContainer2.nY(), basicMeasure.f35553t.s7N());
                int i20 = 0;
                boolean zH = false;
                while (i20 < size2) {
                    ConstraintWidget constraintWidget2 = (ConstraintWidget) basicMeasure.f35552n.get(i20);
                    boolean z10 = z6;
                    if (constraintWidget2 instanceof VirtualLayout) {
                        int iJ2 = constraintWidget2.J();
                        j4 = jNanoTime;
                        int iNY2 = constraintWidget2.nY();
                        boolean zN = zH | basicMeasure.n(measurerRo, constraintWidget2, Measure.qie);
                        Metrics metrics2 = constraintWidgetContainer2.Uf;
                        i16 = i14;
                        i17 = i15;
                        if (metrics2 != null) {
                            metrics2.nr += j2;
                        }
                        int iJ3 = constraintWidget2.J();
                        int iNY3 = constraintWidget2.nY();
                        if (iJ3 != iJ2) {
                            constraintWidget2.vl(iJ3);
                            if (z7 && constraintWidget2.Xw() > iMax) {
                                iMax = Math.max(iMax, constraintWidget2.Xw() + constraintWidget2.Ik(ConstraintAnchor.Type.RIGHT).J2());
                            }
                            z3 = true;
                        } else {
                            z3 = zN;
                        }
                        if (iNY3 != iNY2) {
                            constraintWidget2.a63(iNY3);
                            if (z9 && constraintWidget2.Z() > iMax2) {
                                iMax2 = Math.max(iMax2, constraintWidget2.Z() + constraintWidget2.Ik(ConstraintAnchor.Type.BOTTOM).J2());
                            }
                            z3 = true;
                        }
                        zH = z3 | ((VirtualLayout) constraintWidget2).H();
                    } else {
                        j4 = jNanoTime;
                        i16 = i14;
                        i17 = i15;
                    }
                    i20++;
                    i14 = i16;
                    i15 = i17;
                    z6 = z10;
                    jNanoTime = j4;
                    i19 = 2;
                }
                boolean z11 = z6;
                j3 = jNanoTime;
                int i21 = i14;
                int i22 = i15;
                int i23 = i19;
                int i24 = 0;
                while (true) {
                    if (i24 >= i23) {
                        break;
                    }
                    int i25 = 0;
                    while (i25 < size2) {
                        ConstraintWidget constraintWidget3 = (ConstraintWidget) basicMeasure.f35552n.get(i25);
                        if ((!(constraintWidget3 instanceof Helper) || (constraintWidget3 instanceof VirtualLayout)) && !(constraintWidget3 instanceof Guideline) && constraintWidget3.B() != 8 && ((!z11 || !constraintWidget3.f35514O.f35584O.mUb || !constraintWidget3.J2.f35584O.mUb) && !(constraintWidget3 instanceof VirtualLayout))) {
                            int iJ4 = constraintWidget3.J();
                            int iNY4 = constraintWidget3.nY();
                            int iR = constraintWidget3.r();
                            int i26 = Measure.qie;
                            if (i24 == 1) {
                                i26 = Measure.az;
                            }
                            boolean zN2 = zH | basicMeasure.n(measurerRo, constraintWidget3, i26);
                            Metrics metrics3 = constraintWidgetContainer2.Uf;
                            if (metrics3 != null) {
                                metrics3.nr += j2;
                            }
                            int iJ5 = constraintWidget3.J();
                            int iNY5 = constraintWidget3.nY();
                            if (iJ5 != iJ4) {
                                constraintWidget3.vl(iJ5);
                                if (z7 && constraintWidget3.Xw() > iMax) {
                                    iMax = Math.max(iMax, constraintWidget3.Xw() + constraintWidget3.Ik(ConstraintAnchor.Type.RIGHT).J2());
                                }
                                z2 = true;
                            } else {
                                z2 = zN2;
                            }
                            if (iNY5 != iNY4) {
                                constraintWidget3.a63(iNY5);
                                if (z9 && constraintWidget3.Z() > iMax2) {
                                    iMax2 = Math.max(iMax2, constraintWidget3.Z() + constraintWidget3.Ik(ConstraintAnchor.Type.BOTTOM).J2());
                                }
                                z2 = true;
                            }
                            zH = (!constraintWidget3.I() || iR == constraintWidget3.r()) ? z2 : true;
                        }
                        i25++;
                        basicMeasure = this;
                        constraintWidgetContainer2 = constraintWidgetContainer;
                    }
                    if (!zH) {
                        constraintWidgetContainer2 = constraintWidgetContainer;
                        break;
                    }
                    i24++;
                    t(constraintWidgetContainer, "intermediate pass", i24, i21, i22);
                    basicMeasure = this;
                    constraintWidgetContainer2 = constraintWidgetContainer;
                    i23 = 2;
                    zH = false;
                }
            } else {
                j3 = jNanoTime;
            }
            constraintWidgetContainer2.I4p(iSR);
            jNanoTime = j3;
        }
        return constraintWidgetContainer2.Uf != null ? System.nanoTime() - jNanoTime : jNanoTime;
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f35553t = constraintWidgetContainer;
    }
}
