package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import androidx.constraintlayout.core.widgets.analyzer.Direct;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class ConstraintWidgetContainer extends WidgetContainer {
    private WeakReference Aum;
    protected BasicMeasure.Measurer Bu;
    public boolean EF;
    int HBN;
    ChainHead[] JVN;
    private WeakReference Lp6;
    HashSet Mh;
    int Qu;
    private int T3L;
    int UF;
    public Metrics Uf;
    public boolean Vvq;
    BasicMeasure VwL;
    public int X4T;
    public int Zmq;
    public int Zn;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected LinearSystem f35539f;
    private WeakReference g6;
    public BasicMeasure.Measure jO;
    public DependencyGraph mI;
    int n7b;
    private int nO;
    private boolean o9;
    private boolean p0N;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f35540s;
    public boolean uG;
    int ub;
    private boolean v0j;
    public boolean vl;
    ChainHead[] xVH;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f35541y;

    public ConstraintWidgetContainer() {
        this.VwL = new BasicMeasure(this);
        this.mI = new DependencyGraph(this);
        this.Bu = null;
        this.p0N = false;
        this.f35539f = new LinearSystem();
        this.X4T = 0;
        this.Zmq = 0;
        this.JVN = new ChainHead[4];
        this.xVH = new ChainHead[4];
        this.EF = false;
        this.uG = false;
        this.Vvq = false;
        this.f35541y = 0;
        this.Zn = 0;
        this.nO = 257;
        this.vl = false;
        this.v0j = false;
        this.o9 = false;
        this.n7b = 0;
        this.Aum = null;
        this.f35540s = null;
        this.Lp6 = null;
        this.g6 = null;
        this.Mh = new HashSet();
        this.jO = new BasicMeasure.Measure();
    }

    private void lS() {
        this.X4T = 0;
        this.Zmq = 0;
    }

    public static boolean wKY(int i2, ConstraintWidget constraintWidget, BasicMeasure.Measurer measurer, BasicMeasure.Measure measure, int i3) {
        int i5;
        int i7;
        if (measurer == null) {
            return false;
        }
        if (constraintWidget.B() == 8 || (constraintWidget instanceof Guideline) || (constraintWidget instanceof Barrier)) {
            measure.f35554O = 0;
            measure.J2 = 0;
            return false;
        }
        measure.f35555n = constraintWidget.iF();
        measure.rl = constraintWidget.M();
        measure.f35556t = constraintWidget.J();
        measure.nr = constraintWidget.nY();
        measure.xMQ = false;
        measure.mUb = i3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.f35555n;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z2 = dimensionBehaviour == dimensionBehaviour2;
        boolean z3 = measure.rl == dimensionBehaviour2;
        boolean z4 = z2 && constraintWidget.Nxk > 0.0f;
        boolean z5 = z3 && constraintWidget.Nxk > 0.0f;
        if (z2 && constraintWidget.GR(0) && constraintWidget.WPU == 0 && !z4) {
            measure.f35555n = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z3 && constraintWidget.aYN == 0) {
                measure.f35555n = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (z3 && constraintWidget.GR(1) && constraintWidget.aYN == 0 && !z5) {
            measure.rl = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.WPU == 0) {
                measure.rl = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z3 = false;
        }
        if (constraintWidget.C()) {
            measure.f35555n = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (constraintWidget.Mx()) {
            measure.rl = ConstraintWidget.DimensionBehaviour.FIXED;
            z3 = false;
        }
        if (z4) {
            if (constraintWidget.ViF[0] == 4) {
                measure.f35555n = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z3) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.rl;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i7 = measure.nr;
                } else {
                    measure.f35555n = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    measurer.rl(constraintWidget, measure);
                    i7 = measure.J2;
                }
                measure.f35555n = dimensionBehaviour4;
                measure.f35556t = (int) (constraintWidget.aYN() * i7);
            }
        }
        if (z5) {
            if (constraintWidget.ViF[1] == 4) {
                measure.rl = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = measure.f35555n;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i5 = measure.f35556t;
                } else {
                    measure.rl = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    measurer.rl(constraintWidget, measure);
                    i5 = measure.f35554O;
                }
                measure.rl = dimensionBehaviour6;
                if (constraintWidget.ViF() == -1) {
                    measure.nr = (int) (i5 / constraintWidget.aYN());
                } else {
                    measure.nr = (int) (constraintWidget.aYN() * i5);
                }
            }
        }
        measurer.rl(constraintWidget, measure);
        constraintWidget.vl(measure.f35554O);
        constraintWidget.a63(measure.J2);
        constraintWidget.RQ(measure.KN);
        constraintWidget.hRu(measure.Uo);
        measure.mUb = BasicMeasure.Measure.gh;
        return measure.xMQ;
    }

    public boolean pS() {
        return false;
    }

    public boolean q9(LinearSystem linearSystem, boolean[] zArr) {
        zArr[2] = false;
        boolean zMx = mx(64);
        Lp6(linearSystem, zMx);
        int size = this.tFV.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.tFV.get(i2);
            constraintWidget.Lp6(linearSystem, zMx);
            if (constraintWidget.Y()) {
                z2 = true;
            }
        }
        return z2;
    }

    private void D76(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f35539f.KN(solverVariable, this.f35539f.Ik(constraintAnchor), 0, 5);
    }

    private void NP(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f35539f.KN(this.f35539f.Ik(constraintAnchor), solverVariable, 0, 5);
    }

    private void QgZ(ConstraintWidget constraintWidget) {
        int i2 = this.Zmq + 1;
        ChainHead[] chainHeadArr = this.JVN;
        if (i2 >= chainHeadArr.length) {
            this.JVN = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
        }
        this.JVN[this.Zmq] = new ChainHead(constraintWidget, 1, l());
        this.Zmq++;
    }

    private void XNZ(ConstraintWidget constraintWidget) {
        int i2 = this.X4T + 1;
        ChainHead[] chainHeadArr = this.xVH;
        if (i2 >= chainHeadArr.length) {
            this.xVH = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
        }
        this.xVH[this.X4T] = new ChainHead(constraintWidget, 0, l());
        this.X4T++;
    }

    public void A() {
        this.VwL.O(this);
    }

    public void Co(boolean z2) {
        this.p0N = z2;
    }

    public LinearSystem EN() {
        return this.f35539f;
    }

    public void Fp(Metrics metrics) {
        this.Uf = metrics;
        this.f35539f.S(metrics);
    }

    void H(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.Aum;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.O() > ((ConstraintAnchor) this.Aum.get()).O()) {
            this.Aum = new WeakReference(constraintAnchor);
        }
    }

    public void I4p(int i2) {
        this.nO = i2;
        LinearSystem.f34978o = mx(512);
    }

    public void I9f(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.f35540s;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.O() > ((ConstraintAnchor) this.f35540s.get()).O()) {
            this.f35540s = new WeakReference(constraintAnchor);
        }
    }

    public boolean LPV(boolean z2) {
        return this.mI.Uo(z2);
    }

    public BasicMeasure.Measurer Ro() {
        return this.Bu;
    }

    public int SR() {
        return this.nO;
    }

    void Th(ConstraintWidget constraintWidget, int i2) {
        if (i2 == 0) {
            XNZ(constraintWidget);
        } else if (i2 == 1) {
            QgZ(constraintWidget);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void U(StringBuilder sb) {
        sb.append(this.HI + ":{\n");
        sb.append("  actualWidth:" + this.f35509I);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f35508GR);
        sb.append("\n");
        Iterator it = Mh().iterator();
        while (it.hasNext()) {
            ((ConstraintWidget) it.next()).U(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public void bZm(int i2) {
        this.T3L = i2;
    }

    public boolean eo() {
        return this.v0j;
    }

    public boolean h() {
        return this.o9;
    }

    public void iV(BasicMeasure.Measurer measurer) {
        this.Bu = measurer;
        this.mI.ty(measurer);
    }

    void j(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.Lp6;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.O() > ((ConstraintAnchor) this.Lp6.get()).O()) {
            this.Lp6 = new WeakReference(constraintAnchor);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0334 A[PHI: r13 r19
      0x0334: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:153:0x02f0, B:162:0x0319, B:163:0x031b, B:165:0x0321] A[DONT_GENERATE, DONT_INLINE]
      0x0334: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:153:0x02f0, B:162:0x0319, B:163:0x031b, B:165:0x0321] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033b  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // androidx.constraintlayout.core.widgets.WidgetContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void jO() {
        int i2;
        int i3;
        boolean z2;
        int i5;
        ?? r18;
        char c2;
        ?? Xzo;
        ?? Q9;
        ?? r19;
        int iMax;
        int iMax2;
        ?? r13;
        int i7;
        ?? r192;
        ?? r132;
        ?? r6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i8 = 0;
        this.f35526k = 0;
        this.dR0 = 0;
        this.v0j = false;
        this.o9 = false;
        int size = this.tFV.size();
        int iMax3 = Math.max(0, J());
        int iMax4 = Math.max(0, nY());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.f35503D;
        boolean z3 = true;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        Metrics metrics = this.Uf;
        if (metrics != null) {
            metrics.s7N++;
        }
        if (this.T3L == 0 && Optimizer.rl(this.nO, 1)) {
            Direct.KN(this, Ro());
            for (int i9 = 0; i9 < size; i9++) {
                ConstraintWidget constraintWidget = (ConstraintWidget) this.tFV.get(i9);
                if (constraintWidget.ofS() && !(constraintWidget instanceof Guideline) && !(constraintWidget instanceof Barrier) && !(constraintWidget instanceof VirtualLayout) && !constraintWidget.pJg()) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourWPU = constraintWidget.WPU(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourWPU2 = constraintWidget.WPU(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviourWPU != dimensionBehaviour4 || constraintWidget.WPU == 1 || dimensionBehaviourWPU2 != dimensionBehaviour4 || constraintWidget.aYN == 1) {
                        wKY(0, constraintWidget, this.Bu, new BasicMeasure.Measure(), BasicMeasure.Measure.gh);
                    }
                }
            }
        }
        char c4 = 2;
        if (size <= 2 || !((dimensionBehaviour3 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour2 == dimensionBehaviour) && Optimizer.rl(this.nO, 1024) && Grouping.t(this, Ro()))) {
            i2 = iMax4;
            i3 = iMax3;
            z2 = false;
        } else {
            if (dimensionBehaviour3 == dimensionBehaviour) {
                if (iMax3 >= J() || iMax3 <= 0) {
                    iMax3 = J();
                } else {
                    vl(iMax3);
                    this.v0j = true;
                }
            }
            if (dimensionBehaviour2 == dimensionBehaviour) {
                if (iMax4 >= nY() || iMax4 <= 0) {
                    iMax4 = nY();
                } else {
                    a63(iMax4);
                    this.o9 = true;
                }
            }
            i2 = iMax4;
            i3 = iMax3;
            z2 = true;
        }
        boolean z4 = mx(64) || mx(128);
        LinearSystem linearSystem = this.f35539f;
        linearSystem.xMQ = false;
        linearSystem.mUb = false;
        if (this.nO != 0 && z4) {
            linearSystem.mUb = true;
        }
        ArrayList arrayList = this.tFV;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourIF = iF();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z5 = dimensionBehaviourIF == dimensionBehaviour5 || M() == dimensionBehaviour5;
        lS();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget2 = (ConstraintWidget) this.tFV.get(i10);
            if (constraintWidget2 instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget2).jO();
            }
        }
        boolean zMx = mx(64);
        ?? r133 = z2;
        int i11 = 0;
        ?? r14 = 1;
        while (r14 != 0) {
            int i12 = i11 + 1;
            try {
                this.f35539f.X();
                lS();
                HI(this.f35539f);
                int i13 = i8;
                while (i13 < size) {
                    i5 = i8;
                    try {
                        c2 = c4;
                        try {
                            ((ConstraintWidget) this.tFV.get(i13)).HI(this.f35539f);
                            i13++;
                            i8 = i5;
                            c4 = c2;
                        } catch (Exception e2) {
                            e = e2;
                            r18 = z3;
                            Xzo = r14;
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                            if (Xzo == 0) {
                            }
                            if (z5) {
                                r19 = Q9 == true ? 1 : 0;
                            }
                            iMax = Math.max(this.xg, J());
                            ?? r134 = r133;
                            ?? r193 = r19;
                            if (iMax > J()) {
                            }
                            iMax2 = Math.max(this.pJg, nY());
                            r13 = r134;
                            ?? r194 = r193;
                            if (iMax2 > nY()) {
                            }
                            if (r13 != 0) {
                            }
                            if (i12 <= i7) {
                            }
                            i11 = i12;
                            i8 = i5;
                            c4 = c2;
                            z3 = true;
                            r133 = r132;
                            r14 = ;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        c2 = c4;
                    }
                }
                i5 = i8;
                c2 = c4;
                Xzo = xzo(this.f35539f);
                WeakReference weakReference = this.Aum;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z3;
                } else {
                    r18 = z3;
                    try {
                        NP((ConstraintAnchor) this.Aum.get(), this.f35539f.Ik(this.f35517U));
                        this.Aum = null;
                        r18 = r18;
                    } catch (Exception e4) {
                        e = e4;
                        Xzo = Xzo;
                        r18 = r18;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                    }
                }
                WeakReference weakReference2 = this.Lp6;
                if (weakReference2 != null && weakReference2.get() != null) {
                    D76((ConstraintAnchor) this.Lp6.get(), this.f35539f.Ik(this.M7));
                    this.Lp6 = null;
                }
                WeakReference weakReference3 = this.f35540s;
                if (weakReference3 != null && weakReference3.get() != null) {
                    NP((ConstraintAnchor) this.f35540s.get(), this.f35539f.Ik(this.jB));
                    this.f35540s = null;
                }
                WeakReference weakReference4 = this.g6;
                if (weakReference4 != null && weakReference4.get() != null) {
                    D76((ConstraintAnchor) this.g6.get(), this.f35539f.Ik(this.P5));
                    this.g6 = null;
                }
                if (Xzo != 0) {
                    this.f35539f.iF();
                }
            } catch (Exception e5) {
                e = e5;
                i5 = i8;
                r18 = z3;
                c2 = c4;
                Xzo = r14;
            }
            if (Xzo == 0) {
                Q9 = q9(this.f35539f, Optimizer.f35550n);
            } else {
                Lp6(this.f35539f, zMx);
                for (int i14 = i5; i14 < size; i14++) {
                    ((ConstraintWidget) this.tFV.get(i14)).Lp6(this.f35539f, zMx);
                }
                Q9 = i5;
            }
            if (z5 || i12 >= 8 || !Optimizer.f35550n[c2]) {
                r19 = Q9 == true ? 1 : 0;
            } else {
                int i15 = i5;
                int iMax5 = i15;
                int iMax6 = iMax5;
                ?? r02 = Q9;
                while (i15 < size) {
                    ConstraintWidget constraintWidget3 = (ConstraintWidget) this.tFV.get(i15);
                    iMax5 = Math.max(iMax5, constraintWidget3.f35526k + constraintWidget3.J());
                    iMax6 = Math.max(iMax6, constraintWidget3.dR0 + constraintWidget3.nY());
                    i15++;
                    r02 = r02 == true ? 1 : 0;
                }
                ?? r195 = r02;
                int iMax7 = Math.max(this.xg, iMax5);
                int iMax8 = Math.max(this.pJg, iMax6);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                r133 = r133;
                r19 = r195;
                if (dimensionBehaviour3 == dimensionBehaviour6) {
                    r133 = r133;
                    r19 = r195;
                    if (J() < iMax7) {
                        vl(iMax7);
                        this.f35503D[i5] = dimensionBehaviour6;
                        ?? r135 = r18;
                        r19 = r135 == true ? 1 : 0;
                        r133 = r135;
                    }
                }
                if (dimensionBehaviour2 == dimensionBehaviour6 && nY() < iMax8) {
                    a63(iMax8);
                    this.f35503D[r18] = dimensionBehaviour6;
                    r133 = r18;
                    r19 = r133 == true ? 1 : 0;
                }
            }
            iMax = Math.max(this.xg, J());
            ?? r1342 = r133;
            ?? r1932 = r19;
            if (iMax > J()) {
                vl(iMax);
                this.f35503D[i5] = ConstraintWidget.DimensionBehaviour.FIXED;
                ?? r136 = r18;
                r1932 = r136 == true ? 1 : 0;
                r1342 = r136;
            }
            iMax2 = Math.max(this.pJg, nY());
            r13 = r1342;
            ?? r1942 = r1932;
            if (iMax2 > nY()) {
                a63(iMax2);
                this.f35503D[r18] = ConstraintWidget.DimensionBehaviour.FIXED;
                ?? r137 = r18;
                r1942 = r137 == true ? 1 : 0;
                r13 = r137;
            }
            if (r13 != 0) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = this.f35503D[i5];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour7 != dimensionBehaviour8 || i3 <= 0 || J() <= i3) {
                    r6 = r18;
                    r13 = r13;
                    r1942 = r1942;
                } else {
                    ?? r62 = r18;
                    this.v0j = r62;
                    this.f35503D[i5] = ConstraintWidget.DimensionBehaviour.FIXED;
                    vl(i3);
                    boolean z6 = r62 == true ? 1 : 0;
                    r1942 = z6 ? 1 : 0;
                    r6 = r62;
                    r13 = z6;
                }
                if (this.f35503D[r6] != dimensionBehaviour8 || i2 <= 0 || nY() <= i2) {
                    i7 = 8;
                    r132 = r13;
                    r192 = r1942;
                } else {
                    this.o9 = r6;
                    this.f35503D[r6] = ConstraintWidget.DimensionBehaviour.FIXED;
                    a63(i2);
                    i7 = 8;
                    r132 = 1;
                    r192 = 1;
                }
            }
            ?? r142 = i12 <= i7 ? i5 : r192;
            i11 = i12;
            i8 = i5;
            c4 = c2;
            z3 = true;
            r133 = r132;
            r14 = r142;
        }
        int i16 = i8;
        this.tFV = arrayList;
        if (r133 != 0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.f35503D;
            dimensionBehaviourArr2[i16] = dimensionBehaviour3;
            dimensionBehaviourArr2[1] = dimensionBehaviour2;
        }
        mYa(this.f35539f.WPU());
    }

    public boolean l() {
        return this.p0N;
    }

    public void lNy(ConstraintAnchor constraintAnchor) {
        WeakReference weakReference = this.g6;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.O() > ((ConstraintAnchor) this.g6.get()).O()) {
            this.g6 = new WeakReference(constraintAnchor);
        }
    }

    public boolean mx(int i2) {
        return (this.nO & i2) == i2;
    }

    @Override // androidx.constraintlayout.core.widgets.WidgetContainer, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n1() {
        this.f35539f.X();
        this.ub = 0;
        this.HBN = 0;
        this.Qu = 0;
        this.UF = 0;
        this.vl = false;
        super.n1();
    }

    public boolean rxp(boolean z2, int i2) {
        return this.mI.KN(z2, i2);
    }

    public void tEO() {
        this.mI.mUb();
    }

    public long uQ(int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.ub = i11;
        this.Qu = i12;
        return this.VwL.nr(this, i2, i11, i12, i3, i5, i7, i8, i9, i10);
    }

    public boolean waP(boolean z2) {
        return this.mI.J2(z2);
    }

    public boolean xzo(LinearSystem linearSystem) {
        ConstraintWidgetContainer constraintWidgetContainer;
        LinearSystem linearSystem2;
        boolean zMx = mx(64);
        Uo(linearSystem, zMx);
        int size = this.tFV.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.tFV.get(i2);
            constraintWidget.Bu(0, false);
            constraintWidget.Bu(1, false);
            if (constraintWidget instanceof Barrier) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.tFV.get(i3);
                if (constraintWidget2 instanceof Barrier) {
                    ((Barrier) constraintWidget2).XNZ();
                }
            }
        }
        this.Mh.clear();
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget3 = (ConstraintWidget) this.tFV.get(i5);
            if (constraintWidget3.J2()) {
                if (constraintWidget3 instanceof VirtualLayout) {
                    this.Mh.add(constraintWidget3);
                } else {
                    constraintWidget3.Uo(linearSystem, zMx);
                }
            }
        }
        while (this.Mh.size() > 0) {
            int size2 = this.Mh.size();
            Iterator it = this.Mh.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                VirtualLayout virtualLayout = (VirtualLayout) ((ConstraintWidget) it.next());
                if (virtualLayout.wKp(this.Mh)) {
                    virtualLayout.Uo(linearSystem, zMx);
                    this.Mh.remove(virtualLayout);
                    break;
                }
            }
            if (size2 == this.Mh.size()) {
                Iterator it2 = this.Mh.iterator();
                while (it2.hasNext()) {
                    ((ConstraintWidget) it2.next()).Uo(linearSystem, zMx);
                }
                this.Mh.clear();
            }
        }
        if (LinearSystem.f34978o) {
            HashSet<ConstraintWidget> hashSet = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget4 = (ConstraintWidget) this.tFV.get(i7);
                if (!constraintWidget4.J2()) {
                    hashSet.add(constraintWidget4);
                }
            }
            constraintWidgetContainer = this;
            linearSystem2 = linearSystem;
            constraintWidgetContainer.O(this, linearSystem2, hashSet, iF() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (ConstraintWidget constraintWidget5 : hashSet) {
                Optimizer.n(this, linearSystem2, constraintWidget5);
                constraintWidget5.Uo(linearSystem2, zMx);
            }
        } else {
            constraintWidgetContainer = this;
            linearSystem2 = linearSystem;
            for (int i8 = 0; i8 < size; i8++) {
                ConstraintWidget constraintWidget6 = (ConstraintWidget) constraintWidgetContainer.tFV.get(i8);
                if (constraintWidget6 instanceof ConstraintWidgetContainer) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.f35503D;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.VwL(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.Vvq(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.Uo(linearSystem2, zMx);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.VwL(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.Vvq(dimensionBehaviour2);
                    }
                } else {
                    Optimizer.n(this, linearSystem2, constraintWidget6);
                    if (!constraintWidget6.J2()) {
                        constraintWidget6.Uo(linearSystem2, zMx);
                    }
                }
            }
        }
        if (constraintWidgetContainer.X4T > 0) {
            Chain.rl(this, linearSystem2, null, 0);
        }
        if (constraintWidgetContainer.Zmq > 0) {
            Chain.rl(this, linearSystem2, null, 1);
        }
        return true;
    }

    public void yAc() {
        this.mI.gh();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void s(boolean z2, boolean z3) {
        super.s(z2, z3);
        int size = this.tFV.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) this.tFV.get(i2)).s(z2, z3);
        }
    }

    public ConstraintWidgetContainer(int i2, int i3) {
        super(i2, i3);
        this.VwL = new BasicMeasure(this);
        this.mI = new DependencyGraph(this);
        this.Bu = null;
        this.p0N = false;
        this.f35539f = new LinearSystem();
        this.X4T = 0;
        this.Zmq = 0;
        this.JVN = new ChainHead[4];
        this.xVH = new ChainHead[4];
        this.EF = false;
        this.uG = false;
        this.Vvq = false;
        this.f35541y = 0;
        this.Zn = 0;
        this.nO = 257;
        this.vl = false;
        this.v0j = false;
        this.o9 = false;
        this.n7b = 0;
        this.Aum = null;
        this.f35540s = null;
        this.Lp6 = null;
        this.g6 = null;
        this.Mh = new HashSet();
        this.jO = new BasicMeasure.Measure();
    }
}
