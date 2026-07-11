package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class ConstraintWidget {
    public static float QZ6 = 0.5f;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected ArrayList f35501B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    float f35502C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public DimensionBehaviour[] f35503D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    ConstraintAnchor f35504E;
    public float E2;
    public float[] ER;
    boolean EWS;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f35505F;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    public ConstraintAnchor[] f35506FX;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private int f35507G7;
    boolean GD;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    int f35508GR;
    public String HI;
    boolean HV;
    boolean How;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f35509I;
    private boolean Ik;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean[] f35510J;
    public VerticalWidgetRun J2;
    int Jk;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    int f35511K;
    boolean KN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ConstraintAnchor f35512M;
    public ConstraintAnchor M7;
    private Object Mx;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    float f35513N;
    public float Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public HorizontalWidgetRun f35514O;
    boolean Org;
    public ConstraintAnchor P5;
    boolean Po6;
    ConstraintWidget RQ;
    int Rl;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f35515S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    int f35516T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ConstraintAnchor f35517U;
    boolean UhV;
    public boolean[] Uo;
    public int[] ViF;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    ConstraintWidget f35518W;
    public int WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f35519X;
    public int XQ;
    private int Xw;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    protected int f35520Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f35521Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConstraintWidget f35522a;
    public int a63;
    public int aYN;
    private int az;
    private int bzg;
    private boolean ck;
    protected int dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35523e;
    ConstraintAnchor eF;
    int eTf;
    private boolean eWT;
    public int fD;
    private int fcU;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35524g;
    private boolean gh;
    boolean hRu;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f35525i;
    public int iF;
    protected int ijL;
    public ConstraintAnchor jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f35526k;
    protected ConstraintWidget[] kSg;
    protected ConstraintWidget[] lLA;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int f35527m;
    private boolean mUb;
    int mYa;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35528n;
    private String n1;
    private int[] nHg;
    public int nY;
    public ChainRun nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f35529o;
    float ofS;
    public ConstraintAnchor p5;
    protected int pJg;
    int piY;
    private int qie;
    int qm;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f35530r;
    private boolean rV9;
    public WidgetRun[] rl;
    public float s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ChainRun f35531t;
    boolean tUK;
    public float te;
    public WidgetFrame ty;
    private String ul;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f35532v;
    private boolean wTp;
    private boolean xMQ;
    protected int xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f35533z;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        this.f35528n = false;
        this.rl = new WidgetRun[2];
        this.f35514O = null;
        this.J2 = null;
        this.Uo = new boolean[]{true, true};
        this.KN = false;
        this.xMQ = true;
        this.mUb = false;
        this.gh = true;
        this.qie = -1;
        this.az = -1;
        this.ty = new WidgetFrame(this);
        this.ck = false;
        this.Ik = false;
        this.f35530r = false;
        this.f35529o = false;
        this.f35521Z = -1;
        this.XQ = -1;
        this.f35515S = 0;
        this.WPU = 0;
        this.aYN = 0;
        this.ViF = new int[2];
        this.nY = 0;
        this.f35524g = 0;
        this.te = 1.0f;
        this.iF = 0;
        this.fD = 0;
        this.E2 = 1.0f;
        this.f35516T = -1;
        this.f35513N = 1.0f;
        this.nHg = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.s7N = Float.NaN;
        this.wTp = false;
        this.rV9 = false;
        this.bzg = 0;
        this.Xw = 0;
        this.jB = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f35517U = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.P5 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.M7 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.p5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.eF = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f35504E = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f35512M = constraintAnchor;
        this.f35506FX = new ConstraintAnchor[]{this.jB, this.P5, this.f35517U, this.M7, this.p5, constraintAnchor};
        this.f35501B = new ArrayList();
        this.f35510J = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f35503D = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f35522a = null;
        this.f35509I = 0;
        this.f35508GR = 0;
        this.Nxk = 0.0f;
        this.f35520Y = -1;
        this.f35526k = 0;
        this.dR0 = 0;
        this.f35533z = 0;
        this.piY = 0;
        this.ijL = 0;
        this.f35527m = 0;
        this.eTf = 0;
        float f3 = QZ6;
        this.ofS = f3;
        this.f35502C = f3;
        this.f35507G7 = 0;
        this.fcU = 0;
        this.eWT = false;
        this.ul = null;
        this.n1 = null;
        this.UhV = false;
        this.f35525i = 0;
        this.f35511K = 0;
        this.ER = new float[]{-1.0f, -1.0f};
        this.lLA = new ConstraintWidget[]{null, null};
        this.kSg = new ConstraintWidget[]{null, null};
        this.f35518W = null;
        this.RQ = null;
        this.a63 = -1;
        this.f35505F = -1;
        nr();
    }

    private void Po6(StringBuilder sb, String str, float f3, int i2) {
        if (f3 == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f3);
        sb.append(",");
        sb.append(i2);
        sb.append("");
        sb.append("],\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:306:0x0499 A[PHI: r7
      0x0499: PHI (r7v13 int) = (r7v12 int), (r7v17 int), (r7v17 int), (r7v17 int) binds: [B:299:0x0489, B:301:0x048f, B:302:0x0491, B:304:0x0495] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0543  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void xMQ(LinearSystem linearSystem, boolean z2, boolean z3, boolean z4, boolean z5, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z6, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2, int i3, int i5, int i7, float f3, boolean z7, boolean z9, boolean z10, boolean z11, boolean z12, int i8, int i9, int i10, int i11, float f4, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16;
        int iMin;
        boolean z17;
        int i12;
        int i13;
        SolverVariable solverVariable3;
        int i14;
        SolverVariable solverVariable4;
        boolean z18;
        boolean z19;
        int i15;
        int i16;
        SolverVariable solverVariableIk;
        SolverVariable solverVariableIk2;
        boolean z20;
        ConstraintAnchor constraintAnchor3;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        int i17;
        int i18;
        int i19;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        SolverVariable solverVariable9;
        SolverVariable solverVariable10;
        SolverVariable solverVariable11;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        boolean z25;
        int iMin2;
        int i20;
        boolean z26;
        int i21;
        ConstraintWidget constraintWidget4;
        int i22;
        boolean z27;
        int i23;
        int i24;
        boolean z28;
        int i25;
        boolean z29;
        ConstraintWidget constraintWidget5;
        int i26;
        ConstraintWidget constraintWidget6;
        LinearSystem linearSystem2 = linearSystem;
        SolverVariable solverVariableIk3 = linearSystem2.Ik(constraintAnchor);
        SolverVariable solverVariableIk4 = linearSystem2.Ik(constraintAnchor2);
        SolverVariable solverVariableIk5 = linearSystem2.Ik(constraintAnchor.mUb());
        SolverVariable solverVariableIk6 = linearSystem2.Ik(constraintAnchor2.mUb());
        if (LinearSystem.aYN() != null) {
            LinearSystem.aYN().iF++;
        }
        boolean zHI = constraintAnchor.HI();
        boolean zHI2 = constraintAnchor2.HI();
        boolean zHI3 = this.f35512M.HI();
        int i27 = zHI2 ? (zHI ? 1 : 0) + 1 : zHI ? 1 : 0;
        if (zHI3) {
            i27++;
        }
        int i28 = z7 ? 3 : i8;
        int iOrdinal = dimensionBehaviour.ordinal();
        boolean z30 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i28 == 4) ? false : true;
        int i29 = this.qie;
        if (i29 == -1 || !z2) {
            i29 = i3;
            z14 = z30;
        } else {
            this.qie = -1;
            z14 = false;
        }
        int i30 = this.az;
        if (i30 == -1 || z2) {
            z15 = z14;
        } else {
            this.az = -1;
            i29 = i30;
            z15 = false;
        }
        int i31 = i29;
        if (this.fcU == 8) {
            z16 = false;
            iMin = 0;
        } else {
            z16 = z15;
            iMin = i31;
        }
        if (z13) {
            if (!zHI && !zHI2 && !zHI3) {
                linearSystem2.J2(solverVariableIk3, i2);
            } else if (zHI && !zHI2) {
                z17 = z16;
                i12 = 8;
                linearSystem2.O(solverVariableIk3, solverVariableIk5, constraintAnchor.J2(), 8);
            }
            z17 = z16;
            i12 = 8;
        } else {
            z17 = z16;
            i12 = 8;
        }
        if (!z17) {
            if (z6) {
                linearSystem2.O(solverVariableIk4, solverVariableIk3, 0, 3);
                if (i5 > 0) {
                    linearSystem2.KN(solverVariableIk4, solverVariableIk3, i5, 8);
                }
                if (i7 < Integer.MAX_VALUE) {
                    linearSystem2.mUb(solverVariableIk4, solverVariableIk3, i7, 8);
                }
            } else {
                linearSystem2.O(solverVariableIk4, solverVariableIk3, iMin, i12);
            }
            i16 = i11;
            solverVariable3 = solverVariableIk4;
            i14 = i27;
            solverVariable4 = solverVariableIk6;
            z18 = z17;
            z19 = z5;
            i15 = i10;
        } else if (i27 == 2 || z7 || !(i28 == 1 || i28 == 0)) {
            int i32 = i10 == -2 ? iMin : i10;
            int i33 = i11 == -2 ? iMin : i11;
            if (iMin > 0 && i28 != 1) {
                iMin = 0;
            }
            if (i32 > 0) {
                linearSystem2.KN(solverVariableIk4, solverVariableIk3, i32, 8);
                iMin = Math.max(iMin, i32);
            }
            if (i33 > 0) {
                if (!z3 || i28 != 1) {
                    linearSystem2.mUb(solverVariableIk4, solverVariableIk3, i33, 8);
                }
                iMin = Math.min(iMin, i33);
            }
            if (i28 == 1) {
                if (z3) {
                    linearSystem2.O(solverVariableIk4, solverVariableIk3, iMin, 8);
                } else if (z10) {
                    linearSystem2.O(solverVariableIk4, solverVariableIk3, iMin, 5);
                    linearSystem2.mUb(solverVariableIk4, solverVariableIk3, iMin, 8);
                } else {
                    linearSystem2.O(solverVariableIk4, solverVariableIk3, iMin, 5);
                    linearSystem2.mUb(solverVariableIk4, solverVariableIk3, iMin, 8);
                }
                solverVariable3 = solverVariableIk4;
                solverVariable4 = solverVariableIk6;
                z18 = z17;
                z19 = z5;
                i15 = i32;
                i16 = i33;
                i14 = i27;
            } else {
                if (i28 == 2) {
                    ConstraintAnchor.Type typeGh = constraintAnchor.gh();
                    ConstraintAnchor.Type type = ConstraintAnchor.Type.TOP;
                    if (typeGh == type || constraintAnchor.gh() == ConstraintAnchor.Type.BOTTOM) {
                        solverVariableIk = linearSystem2.Ik(this.f35522a.Ik(type));
                        solverVariableIk2 = linearSystem2.Ik(this.f35522a.Ik(ConstraintAnchor.Type.BOTTOM));
                    } else {
                        solverVariableIk = linearSystem2.Ik(this.f35522a.Ik(ConstraintAnchor.Type.LEFT));
                        solverVariableIk2 = linearSystem2.Ik(this.f35522a.Ik(ConstraintAnchor.Type.RIGHT));
                    }
                    SolverVariable solverVariable12 = solverVariableIk2;
                    solverVariable3 = solverVariableIk4;
                    i13 = i33;
                    i14 = i27;
                    solverVariable4 = solverVariableIk6;
                    linearSystem2.nr(linearSystem2.r().gh(solverVariable3, solverVariableIk3, solverVariable12, solverVariableIk, f4));
                    if (z3) {
                        z17 = false;
                    }
                    z19 = z5;
                    z18 = z17;
                } else {
                    i13 = i33;
                    solverVariable3 = solverVariableIk4;
                    i14 = i27;
                    solverVariable4 = solverVariableIk6;
                    z18 = z17;
                    z19 = true;
                }
                i15 = i32;
                i16 = i13;
            }
        } else {
            int iMax = Math.max(i10, iMin);
            if (i11 > 0) {
                iMax = Math.min(i11, iMax);
            }
            linearSystem2.O(solverVariableIk4, solverVariableIk3, iMax, 8);
            i15 = i10;
            i16 = i11;
            solverVariable3 = solverVariableIk4;
            i14 = i27;
            solverVariable4 = solverVariableIk6;
            z18 = false;
            z19 = z5;
        }
        if (!z13 || z10) {
            if (i14 < 2 && z3 && z19) {
                linearSystem2.KN(solverVariableIk3, solverVariable, 0, 8);
                boolean z31 = z2 || this.p5.J2 == null;
                if (z2 || (constraintAnchor3 = this.p5.J2) == null) {
                    z20 = z31;
                } else {
                    ConstraintWidget constraintWidget7 = constraintAnchor3.nr;
                    if (constraintWidget7.Nxk != 0.0f) {
                        DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.f35503D;
                        DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                        DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                        z20 = dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[1] == dimensionBehaviour3;
                    }
                }
                if (z20) {
                    linearSystem2.KN(solverVariable2, solverVariable3, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (!zHI && !zHI2 && !zHI3) {
            solverVariable10 = solverVariable4;
            i21 = 5;
            z25 = z3;
            i26 = i21;
        } else if (!zHI || zHI2) {
            if (!zHI && zHI2) {
                linearSystem2.O(solverVariable3, solverVariable4, -constraintAnchor2.J2(), 8);
                if (z3) {
                    if (this.mUb && solverVariableIk3.f35007Z && (constraintWidget5 = this.f35522a) != null) {
                        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget5;
                        if (z2) {
                            constraintWidgetContainer.I9f(constraintAnchor);
                        } else {
                            constraintWidgetContainer.H(constraintAnchor);
                        }
                    } else {
                        linearSystem2.KN(solverVariableIk3, solverVariable, 0, 5);
                        i21 = 5;
                        solverVariable10 = solverVariable4;
                        z25 = z3;
                        i26 = i21;
                    }
                }
            } else if (zHI && zHI2) {
                ConstraintWidget constraintWidget8 = constraintAnchor.J2.nr;
                ConstraintWidget constraintWidget9 = constraintAnchor2.J2.nr;
                ConstraintWidget constraintWidgetRV9 = rV9();
                int i34 = 6;
                if (z18) {
                    if (i28 == 0) {
                        if (i16 != 0 || i15 != 0) {
                            z28 = false;
                            i25 = 5;
                            i18 = 5;
                            z29 = true;
                            z22 = true;
                        } else if (solverVariableIk5.f35007Z && solverVariable4.f35007Z) {
                            linearSystem2.O(solverVariableIk3, solverVariableIk5, constraintAnchor.J2(), 8);
                            linearSystem2.O(solverVariable3, solverVariable4, -constraintAnchor2.J2(), 8);
                            return;
                        } else {
                            z29 = false;
                            z22 = false;
                            i25 = 8;
                            i18 = 8;
                            z28 = true;
                        }
                        if ((constraintWidget8 instanceof Barrier) || (constraintWidget9 instanceof Barrier)) {
                            solverVariable5 = solverVariableIk3;
                            solverVariable6 = solverVariable4;
                            z23 = z28;
                            i18 = 4;
                        } else {
                            solverVariable5 = solverVariableIk3;
                            solverVariable6 = solverVariable4;
                            z23 = z28;
                        }
                        solverVariable8 = solverVariable2;
                        z21 = z29;
                        i19 = i25;
                        solverVariable7 = solverVariableIk5;
                        i17 = 6;
                    } else {
                        if (i28 == 2) {
                            if ((constraintWidget8 instanceof Barrier) || (constraintWidget9 instanceof Barrier)) {
                                solverVariable5 = solverVariableIk3;
                                solverVariable6 = solverVariable4;
                                solverVariable7 = solverVariableIk5;
                                i17 = 6;
                                i18 = 4;
                            } else {
                                solverVariable5 = solverVariableIk3;
                                solverVariable6 = solverVariable4;
                                solverVariable7 = solverVariableIk5;
                                i17 = 6;
                                i18 = 5;
                            }
                            i19 = 5;
                        } else if (i28 == 1) {
                            solverVariable5 = solverVariableIk3;
                            solverVariable6 = solverVariable4;
                            solverVariable7 = solverVariableIk5;
                            i17 = 6;
                            i18 = 4;
                            i19 = 8;
                        } else if (i28 == 3) {
                            if (this.f35516T == -1) {
                                if (z11) {
                                    linearSystem2 = linearSystem;
                                    solverVariable5 = solverVariableIk3;
                                    solverVariable6 = solverVariable4;
                                    solverVariable7 = solverVariableIk5;
                                    i17 = z3 ? 5 : 4;
                                } else {
                                    linearSystem2 = linearSystem;
                                    solverVariable5 = solverVariableIk3;
                                    solverVariable6 = solverVariable4;
                                    solverVariable7 = solverVariableIk5;
                                    i17 = 8;
                                }
                                i18 = 5;
                                i19 = 8;
                            } else {
                                if (z7) {
                                    if (i9 == 2 || i9 == 1) {
                                        i23 = 5;
                                        i24 = 4;
                                    } else {
                                        i23 = 8;
                                        i24 = 5;
                                    }
                                    i19 = i23;
                                    i18 = i24;
                                    solverVariable5 = solverVariableIk3;
                                    solverVariable6 = solverVariable4;
                                    solverVariable7 = solverVariableIk5;
                                    i17 = 6;
                                } else {
                                    if (i16 > 0) {
                                        linearSystem2 = linearSystem;
                                        solverVariable5 = solverVariableIk3;
                                        solverVariable6 = solverVariable4;
                                        solverVariable7 = solverVariableIk5;
                                        i17 = 6;
                                        i18 = 5;
                                    } else if (i16 != 0 || i15 != 0) {
                                        linearSystem2 = linearSystem;
                                        solverVariable5 = solverVariableIk3;
                                        solverVariable6 = solverVariable4;
                                        solverVariable7 = solverVariableIk5;
                                        i17 = 6;
                                        i18 = 4;
                                    } else if (z11) {
                                        i19 = (constraintWidget8 == constraintWidgetRV9 || constraintWidget9 == constraintWidgetRV9) ? 5 : 4;
                                        solverVariable5 = solverVariableIk3;
                                        solverVariable6 = solverVariable4;
                                        solverVariable7 = solverVariableIk5;
                                        i17 = 6;
                                        i18 = 4;
                                    } else {
                                        linearSystem2 = linearSystem;
                                        solverVariable5 = solverVariableIk3;
                                        solverVariable6 = solverVariable4;
                                        solverVariable7 = solverVariableIk5;
                                        i17 = 6;
                                        i18 = 8;
                                    }
                                    i19 = 5;
                                }
                                z21 = true;
                                z22 = true;
                                z23 = true;
                                linearSystem2 = linearSystem;
                                solverVariable8 = solverVariable2;
                            }
                            z21 = true;
                            z22 = true;
                            z23 = true;
                            solverVariable8 = solverVariable2;
                        } else {
                            linearSystem2 = linearSystem;
                            solverVariable5 = solverVariableIk3;
                            solverVariable6 = solverVariable4;
                            solverVariable7 = solverVariableIk5;
                            i17 = 6;
                            i18 = 4;
                            i19 = 5;
                            z21 = false;
                            z22 = false;
                            z23 = false;
                            solverVariable8 = solverVariable2;
                        }
                        z21 = true;
                        z22 = true;
                        z23 = false;
                        solverVariable8 = solverVariable2;
                    }
                } else {
                    if (solverVariableIk5.f35007Z && solverVariable4.f35007Z) {
                        SolverVariable solverVariable13 = solverVariable4;
                        linearSystem.t(solverVariableIk3, solverVariableIk5, constraintAnchor.J2(), f3, solverVariable13, solverVariable3, constraintAnchor2.J2(), 8);
                        if (z3 && z19) {
                            int iJ2 = constraintAnchor2.J2 != null ? constraintAnchor2.J2() : 0;
                            if (solverVariable13 != solverVariable2) {
                                linearSystem.KN(solverVariable2, solverVariable3, iJ2, 5);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    linearSystem2 = linearSystem;
                    solverVariable5 = solverVariableIk3;
                    solverVariable6 = solverVariable4;
                    solverVariable7 = solverVariableIk5;
                    solverVariable8 = solverVariable2;
                    i17 = 6;
                    i18 = 4;
                    i19 = 5;
                    z21 = true;
                    z22 = true;
                    z23 = false;
                }
                if (z22 && solverVariable7 == solverVariable6 && constraintWidget8 != constraintWidgetRV9) {
                    z22 = false;
                    z24 = false;
                } else {
                    z24 = true;
                }
                if (z21) {
                    if (z18 || z9 || z11 || solverVariable7 != solverVariable || solverVariable6 != solverVariable8) {
                        constraintWidget4 = constraintWidgetRV9;
                        i22 = i17;
                        z27 = z3;
                    } else {
                        constraintWidget4 = constraintWidgetRV9;
                        i22 = 8;
                        z27 = false;
                        i19 = 8;
                        z24 = false;
                    }
                    solverVariable11 = solverVariable;
                    constraintWidget = constraintWidget8;
                    z3 = z27;
                    constraintWidget3 = constraintWidget4;
                    constraintWidget2 = constraintWidget9;
                    SolverVariable solverVariable14 = solverVariable3;
                    linearSystem2.t(solverVariable5, solverVariable7, constraintAnchor.J2(), f3, solverVariable6, solverVariable14, constraintAnchor2.J2(), i22);
                    SolverVariable solverVariable15 = solverVariable6;
                    solverVariable9 = solverVariable5;
                    solverVariable10 = solverVariable15;
                    solverVariable3 = solverVariable14;
                } else {
                    SolverVariable solverVariable16 = solverVariable6;
                    solverVariable9 = solverVariable5;
                    solverVariable10 = solverVariable16;
                    solverVariable11 = solverVariable;
                    constraintWidget = constraintWidget8;
                    constraintWidget2 = constraintWidget9;
                    constraintWidget3 = constraintWidgetRV9;
                }
                z25 = z3;
                if (this.fcU == 8 && !constraintAnchor2.az()) {
                    return;
                }
                if (z22) {
                    int i35 = (!z25 || solverVariable7 == solverVariable10 || z18 || !((constraintWidget instanceof Barrier) || (constraintWidget2 instanceof Barrier))) ? i19 : 6;
                    linearSystem2.KN(solverVariable9, solverVariable7, constraintAnchor.J2(), i35);
                    linearSystem2.mUb(solverVariable3, solverVariable10, -constraintAnchor2.J2(), i35);
                    i19 = i35;
                }
                if (!z25 || !z12 || (constraintWidget instanceof Barrier) || (constraintWidget2 instanceof Barrier) || constraintWidget2 == constraintWidget3) {
                    iMin2 = i18;
                    i20 = i19;
                    z26 = z24;
                } else {
                    iMin2 = 6;
                    i20 = 6;
                    z26 = true;
                }
                if (z26) {
                    if (z23 && (!z11 || z4)) {
                        if (constraintWidget != constraintWidget3 && constraintWidget2 != constraintWidget3) {
                            i34 = iMin2;
                        }
                        if ((constraintWidget instanceof Guideline) || (constraintWidget2 instanceof Guideline)) {
                            i34 = 5;
                        }
                        if ((constraintWidget instanceof Barrier) || (constraintWidget2 instanceof Barrier)) {
                            i34 = 5;
                        }
                        iMin2 = Math.max(z11 ? 5 : i34, iMin2);
                    }
                    if (z25) {
                        iMin2 = Math.min(i20, iMin2);
                        int i36 = (z7 && !z11 && (constraintWidget == constraintWidget3 || constraintWidget2 == constraintWidget3)) ? 4 : iMin2;
                        linearSystem2.O(solverVariable9, solverVariable7, constraintAnchor.J2(), i36);
                        linearSystem2.O(solverVariable3, solverVariable10, -constraintAnchor2.J2(), i36);
                    }
                }
                if (z25) {
                    int iJ22 = solverVariable11 == solverVariable7 ? constraintAnchor.J2() : 0;
                    if (solverVariable7 != solverVariable11) {
                        linearSystem2.KN(solverVariable9, solverVariable11, iJ22, 5);
                    }
                }
                if (!z25 || !z18 || i5 != 0 || i15 != 0) {
                    i21 = 5;
                    i26 = i21;
                } else if (z18 && i28 == 3) {
                    linearSystem2.KN(solverVariable3, solverVariable9, 0, 8);
                    i21 = 5;
                    i26 = i21;
                } else {
                    i21 = 5;
                    linearSystem2.KN(solverVariable3, solverVariable9, 0, 5);
                    i26 = i21;
                }
            }
            solverVariable10 = solverVariable4;
            i21 = 5;
            z25 = z3;
            i26 = i21;
        } else {
            SolverVariable solverVariable17 = solverVariable4;
            i26 = (z3 && (constraintAnchor.J2.nr instanceof Barrier)) ? 8 : 5;
            solverVariable10 = solverVariable17;
            z25 = z3;
        }
        if (z25 && z19) {
            int iJ23 = constraintAnchor2.J2 != null ? constraintAnchor2.J2() : 0;
            if (solverVariable10 != solverVariable2) {
                if (!this.mUb || !solverVariable3.f35007Z || (constraintWidget6 = this.f35522a) == null) {
                    linearSystem2.KN(solverVariable2, solverVariable3, iJ23, i26);
                    return;
                }
                ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget6;
                if (z2) {
                    constraintWidgetContainer2.lNy(constraintAnchor2);
                } else {
                    constraintWidgetContainer2.j(constraintAnchor2);
                }
            }
        }
    }

    public boolean GR(int i2) {
        if (i2 == 0) {
            return (this.jB.J2 != null ? 1 : 0) + (this.P5.J2 != null ? 1 : 0) < 2;
        }
        return ((this.f35517U.J2 != null ? 1 : 0) + (this.M7.J2 != null ? 1 : 0)) + (this.p5.J2 != null ? 1 : 0) < 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void K(String str) {
        float fAbs;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            this.Nxk = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i3 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            i3 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            i = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
            String strSubstring2 = str.substring(i);
            fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : i2;
        } else {
            String strSubstring3 = str.substring(i, iIndexOf2);
            String strSubstring4 = str.substring(iIndexOf2 + 1);
            if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                float f3 = Float.parseFloat(strSubstring3);
                float f4 = Float.parseFloat(strSubstring4);
                if (f3 > 0.0f && f4 > 0.0f) {
                    fAbs = i3 == 1 ? Math.abs(f4 / f3) : Math.abs(f3 / f4);
                }
            }
        }
        i2 = (fAbs > i2 ? 1 : (fAbs == i2 ? 0 : -1));
        if (i2 > 0) {
            this.Nxk = fAbs;
            this.f35520Y = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Uo(LinearSystem linearSystem, boolean z2) {
        boolean z3;
        boolean z4;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        boolean zM;
        boolean zXg;
        int i2;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        int i3;
        int i5;
        int i7;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        DimensionBehaviour dimensionBehaviour;
        DimensionBehaviour dimensionBehaviour2;
        boolean z7;
        boolean z9;
        SolverVariable solverVariable3;
        boolean z10;
        SolverVariable solverVariable4;
        DimensionBehaviour dimensionBehaviour3;
        boolean z11;
        DimensionBehaviour dimensionBehaviour4;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        SolverVariable solverVariable7;
        SolverVariable solverVariable8;
        SolverVariable solverVariable9;
        int i11;
        char c2;
        int i12;
        int i13;
        ConstraintWidget constraintWidget3;
        SolverVariable solverVariable10;
        SolverVariable solverVariable11;
        LinearSystem linearSystem2;
        Metrics metrics;
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int i14;
        int i15;
        int i16;
        HorizontalWidgetRun horizontalWidgetRun2;
        VerticalWidgetRun verticalWidgetRun2;
        LinearSystem linearSystem3 = linearSystem;
        SolverVariable solverVariableIk = linearSystem3.Ik(this.jB);
        SolverVariable solverVariableIk2 = linearSystem3.Ik(this.P5);
        SolverVariable solverVariableIk3 = linearSystem3.Ik(this.f35517U);
        SolverVariable solverVariableIk4 = linearSystem3.Ik(this.M7);
        SolverVariable solverVariableIk5 = linearSystem3.Ik(this.p5);
        ConstraintWidget constraintWidget4 = this.f35522a;
        if (constraintWidget4 == null) {
            z3 = false;
            z4 = false;
        } else {
            z4 = constraintWidget4 != null && constraintWidget4.f35503D[0] == DimensionBehaviour.WRAP_CONTENT;
            z3 = constraintWidget4 != null && constraintWidget4.f35503D[1] == DimensionBehaviour.WRAP_CONTENT;
            int i17 = this.f35515S;
            if (i17 == 1) {
                z3 = false;
            } else if (i17 == 2) {
                z4 = false;
            } else if (i17 == 3) {
            }
        }
        if (this.fcU == 8 && !this.eWT && !Nxk()) {
            boolean[] zArr = this.f35510J;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z15 = this.ck;
        if (z15 || this.Ik) {
            if (z15) {
                linearSystem3.J2(solverVariableIk, this.f35526k);
                linearSystem3.J2(solverVariableIk2, this.f35526k + this.f35509I);
                if (z4 && (constraintWidget2 = this.f35522a) != null) {
                    if (this.gh) {
                        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget2;
                        constraintWidgetContainer.I9f(this.jB);
                        constraintWidgetContainer.lNy(this.P5);
                    } else {
                        linearSystem3.KN(linearSystem3.Ik(constraintWidget2.P5), solverVariableIk2, 0, 5);
                    }
                }
            }
            if (this.Ik) {
                linearSystem3.J2(solverVariableIk3, this.dR0);
                linearSystem3.J2(solverVariableIk4, this.dR0 + this.f35508GR);
                if (this.p5.az()) {
                    linearSystem3.J2(solverVariableIk5, this.dR0 + this.eTf);
                }
                if (z3 && (constraintWidget = this.f35522a) != null) {
                    if (this.gh) {
                        ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget;
                        constraintWidgetContainer2.H(this.f35517U);
                        constraintWidgetContainer2.j(this.M7);
                    } else {
                        linearSystem3.KN(linearSystem3.Ik(constraintWidget.M7), solverVariableIk4, 0, 5);
                    }
                }
            }
            if (this.ck && this.Ik) {
                this.ck = false;
                this.Ik = false;
                return;
            }
        }
        Metrics metrics2 = LinearSystem.aYN;
        if (metrics2 != null) {
            metrics2.f34990e++;
        }
        if (z2 && (horizontalWidgetRun2 = this.f35514O) != null && (verticalWidgetRun2 = this.J2) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun2.KN;
            if (dependencyNode.mUb && horizontalWidgetRun2.xMQ.mUb && verticalWidgetRun2.KN.mUb && verticalWidgetRun2.xMQ.mUb) {
                if (metrics2 != null) {
                    metrics2.WPU++;
                }
                linearSystem3.J2(solverVariableIk, dependencyNode.Uo);
                linearSystem3.J2(solverVariableIk2, this.f35514O.xMQ.Uo);
                linearSystem3.J2(solverVariableIk3, this.J2.KN.Uo);
                linearSystem3.J2(solverVariableIk4, this.J2.xMQ.Uo);
                linearSystem3.J2(solverVariableIk5, this.J2.gh.Uo);
                if (this.f35522a != null) {
                    if (z4 && this.Uo[0] && !m()) {
                        linearSystem3.KN(linearSystem3.Ik(this.f35522a.P5), solverVariableIk2, 0, 8);
                    }
                    if (z3 && this.Uo[1] && !xg()) {
                        linearSystem3.KN(linearSystem3.Ik(this.f35522a.M7), solverVariableIk4, 0, 8);
                    }
                }
                this.ck = false;
                this.Ik = false;
                return;
            }
        }
        if (metrics2 != null) {
            metrics2.aYN++;
        }
        if (this.f35522a != null) {
            if (z(0)) {
                ((ConstraintWidgetContainer) this.f35522a).Th(this, 0);
                zM = true;
                i16 = 1;
            } else {
                zM = m();
                i16 = 1;
            }
            if (z(i16)) {
                ((ConstraintWidgetContainer) this.f35522a).Th(this, i16);
                zXg = true;
            } else {
                zXg = xg();
            }
            if (!zM && z4 && this.fcU != 8 && this.jB.J2 == null && this.P5.J2 == null) {
                linearSystem3.KN(linearSystem3.Ik(this.f35522a.P5), solverVariableIk2, 0, 1);
            }
            if (!zXg && z3 && this.fcU != 8 && this.f35517U.J2 == null && this.M7.J2 == null && this.p5 == null) {
                linearSystem3.KN(linearSystem3.Ik(this.f35522a.M7), solverVariableIk4, 0, 1);
            }
        } else {
            zM = false;
            zXg = false;
        }
        int i18 = this.f35509I;
        int i19 = this.xg;
        if (i18 >= i19) {
            i19 = i18;
        }
        int i20 = this.f35508GR;
        int i21 = this.pJg;
        if (i20 >= i21) {
            i21 = i20;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f35503D;
        DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour6 = DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z16 = dimensionBehaviour5 != dimensionBehaviour6;
        DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr[1];
        boolean z17 = zM;
        boolean z18 = dimensionBehaviour7 != dimensionBehaviour6;
        boolean z19 = zXg;
        int i22 = this.f35520Y;
        this.f35516T = i22;
        int i23 = i21;
        float f3 = this.Nxk;
        this.f35513N = f3;
        int i24 = this.WPU;
        int i25 = this.aYN;
        if (f3 > 0.0f) {
            i2 = i19;
            if (this.fcU != 8) {
                i5 = (dimensionBehaviour5 == dimensionBehaviour6 && i24 == 0) ? 3 : i24;
                int i26 = (dimensionBehaviour7 == dimensionBehaviour6 && i25 == 0) ? 3 : i25;
                if (dimensionBehaviour5 == dimensionBehaviour6 && dimensionBehaviour7 == dimensionBehaviour6) {
                    solverVariable = solverVariableIk2;
                    i15 = 3;
                    if (i5 == 3 && i26 == 3) {
                        Aum(z4, z3, z16, z18);
                    }
                    solverVariable2 = solverVariableIk4;
                    i3 = i23;
                    z5 = true;
                    i7 = i26;
                    i8 = i2;
                    int[] iArr = this.ViF;
                    iArr[0] = i5;
                    iArr[1] = i7;
                    this.KN = z5;
                    if (!z5) {
                        int i27 = this.f35516T;
                        i9 = -1;
                        z6 = i27 == 0 || i27 == -1;
                        boolean z20 = z5 && ((i14 = this.f35516T) == 1 || i14 == i9);
                        dimensionBehaviour = this.f35503D[0];
                        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                        if (dimensionBehaviour == dimensionBehaviour2 && (this instanceof ConstraintWidgetContainer)) {
                            z7 = z6;
                            z9 = true;
                        } else {
                            z7 = z6;
                            z9 = false;
                        }
                        if (z9) {
                            i8 = 0;
                        }
                        boolean z21 = !this.f35512M.HI();
                        boolean[] zArr2 = this.f35510J;
                        boolean z22 = zArr2[0];
                        boolean z23 = zArr2[1];
                        if (this.f35521Z == 2 || this.ck) {
                            solverVariable3 = solverVariableIk;
                            z10 = z5;
                            solverVariable4 = solverVariable2;
                            dimensionBehaviour3 = dimensionBehaviour6;
                            z11 = z3;
                            dimensionBehaviour4 = dimensionBehaviour2;
                            z14 = z4;
                            solverVariable6 = solverVariableIk3;
                            solverVariable5 = solverVariableIk5;
                            z13 = z17;
                            z12 = z19;
                            i10 = i5;
                        } else {
                            if (z2 && (horizontalWidgetRun = this.f35514O) != null) {
                                DependencyNode dependencyNode2 = horizontalWidgetRun.KN;
                                if (dependencyNode2.mUb && horizontalWidgetRun.xMQ.mUb) {
                                    if (z2) {
                                        linearSystem3.J2(solverVariableIk, dependencyNode2.Uo);
                                        SolverVariable solverVariable12 = solverVariable;
                                        linearSystem3.J2(solverVariable12, this.f35514O.xMQ.Uo);
                                        if (this.f35522a != null && z4 && this.Uo[0] && !m()) {
                                            linearSystem3.KN(linearSystem3.Ik(this.f35522a.P5), solverVariable12, 0, 8);
                                        }
                                        solverVariable3 = solverVariableIk;
                                        z10 = z5;
                                        solverVariable4 = solverVariable2;
                                        dimensionBehaviour3 = dimensionBehaviour6;
                                        z11 = z3;
                                        dimensionBehaviour4 = dimensionBehaviour2;
                                        solverVariable = solverVariable12;
                                    }
                                    z14 = z4;
                                    solverVariable6 = solverVariableIk3;
                                    solverVariable5 = solverVariableIk5;
                                    z13 = z17;
                                    z12 = z19;
                                    i10 = i5;
                                }
                            }
                            SolverVariable solverVariable13 = solverVariable;
                            ConstraintWidget constraintWidget5 = this.f35522a;
                            SolverVariable solverVariableIk6 = constraintWidget5 != null ? linearSystem3.Ik(constraintWidget5.P5) : null;
                            ConstraintWidget constraintWidget6 = this.f35522a;
                            SolverVariable solverVariableIk7 = constraintWidget6 != null ? linearSystem3.Ik(constraintWidget6.jB) : null;
                            boolean z24 = this.Uo[0];
                            DimensionBehaviour[] dimensionBehaviourArr2 = this.f35503D;
                            DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr2[0];
                            ConstraintAnchor constraintAnchor = this.jB;
                            i10 = i5;
                            ConstraintAnchor constraintAnchor2 = this.P5;
                            z10 = z5;
                            z14 = z4;
                            int i28 = this.f35526k;
                            boolean z25 = z7;
                            SolverVariable solverVariable14 = solverVariableIk7;
                            int i29 = this.xg;
                            int i30 = this.nHg[0];
                            float f4 = this.ofS;
                            boolean z26 = dimensionBehaviourArr2[1] == dimensionBehaviour6;
                            solverVariable3 = solverVariableIk;
                            solverVariable4 = solverVariable2;
                            dimensionBehaviour3 = dimensionBehaviour6;
                            z11 = z3;
                            solverVariable5 = solverVariableIk5;
                            z13 = z17;
                            z12 = z19;
                            dimensionBehaviour4 = dimensionBehaviour2;
                            solverVariable = solverVariable13;
                            solverVariable6 = solverVariableIk3;
                            linearSystem3 = linearSystem;
                            xMQ(linearSystem3, true, z14, z11, z24, solverVariable14, solverVariableIk6, dimensionBehaviour8, z9, constraintAnchor, constraintAnchor2, i28, i8, i29, i30, f4, z25, z26, z13, z12, z22, i10, i7, this.nY, this.f35524g, this.te, z21);
                        }
                        if (!z2 || (verticalWidgetRun = this.J2) == null) {
                            solverVariable7 = solverVariable6;
                            solverVariable8 = solverVariable4;
                            solverVariable9 = solverVariable5;
                            i11 = 0;
                            c2 = 1;
                            i12 = 8;
                            i13 = 1;
                        } else {
                            DependencyNode dependencyNode3 = verticalWidgetRun.KN;
                            if (dependencyNode3.mUb && verticalWidgetRun.xMQ.mUb) {
                                int i31 = dependencyNode3.Uo;
                                solverVariable7 = solverVariable6;
                                linearSystem3.J2(solverVariable7, i31);
                                solverVariable8 = solverVariable4;
                                linearSystem3.J2(solverVariable8, this.J2.xMQ.Uo);
                                solverVariable9 = solverVariable5;
                                linearSystem3.J2(solverVariable9, this.J2.gh.Uo);
                                ConstraintWidget constraintWidget7 = this.f35522a;
                                if (constraintWidget7 == null || z12 || !z11) {
                                    i11 = 0;
                                    c2 = 1;
                                } else {
                                    c2 = 1;
                                    if (this.Uo[1]) {
                                        i11 = 0;
                                        i12 = 8;
                                        linearSystem3.KN(linearSystem3.Ik(constraintWidget7.M7), solverVariable8, 0, 8);
                                        i13 = i11;
                                    } else {
                                        i11 = 0;
                                    }
                                }
                                i12 = 8;
                                i13 = i11;
                            }
                        }
                        if ((this.XQ == 2 ? i11 : i13) == 0 || this.Ik) {
                            constraintWidget3 = this;
                            solverVariable10 = solverVariable7;
                            solverVariable11 = solverVariable8;
                        } else {
                            boolean z27 = (this.f35503D[c2] == dimensionBehaviour4 && (this instanceof ConstraintWidgetContainer)) ? c2 : i11;
                            int i32 = z27 != 0 ? i11 : i3;
                            ConstraintWidget constraintWidget8 = this.f35522a;
                            SolverVariable solverVariableIk8 = constraintWidget8 != null ? linearSystem3.Ik(constraintWidget8.M7) : null;
                            ConstraintWidget constraintWidget9 = this.f35522a;
                            SolverVariable solverVariableIk9 = constraintWidget9 != null ? linearSystem3.Ik(constraintWidget9.f35517U) : null;
                            if (this.eTf <= 0) {
                                boolean z28 = z21;
                                if (this.fcU == i12) {
                                    ConstraintAnchor constraintAnchor3 = this.p5;
                                    if (constraintAnchor3.J2 != null) {
                                        linearSystem3.O(solverVariable9, solverVariable7, r(), i12);
                                        linearSystem3.O(solverVariable9, linearSystem3.Ik(this.p5.J2), this.p5.J2(), i12);
                                        if (z11) {
                                            linearSystem3.KN(solverVariableIk8, linearSystem3.Ik(this.M7), i11, 5);
                                        }
                                        z28 = i11;
                                    } else if (this.fcU == i12) {
                                        linearSystem3.O(solverVariable9, solverVariable7, constraintAnchor3.J2(), i12);
                                        z28 = z21;
                                    } else {
                                        linearSystem3.O(solverVariable9, solverVariable7, r(), i12);
                                        z28 = z21;
                                    }
                                }
                                boolean z29 = this.Uo[c2];
                                DimensionBehaviour[] dimensionBehaviourArr3 = this.f35503D;
                                int i33 = i11;
                                char c4 = c2;
                                solverVariable10 = solverVariable7;
                                solverVariable11 = solverVariable8;
                                xMQ(linearSystem, false, z11, z14, z29, solverVariableIk9, solverVariableIk8, dimensionBehaviourArr3[c2], z27, this.f35517U, this.M7, this.dR0, i32, this.pJg, this.nHg[c4], this.f35502C, z20, dimensionBehaviourArr3[i33] == dimensionBehaviour3 ? c4 : i33, z12, z13, z23, i7, i10, this.iF, this.fD, this.E2, z28);
                                constraintWidget3 = this;
                            }
                        }
                        if (!z10) {
                            linearSystem2 = linearSystem;
                        } else if (constraintWidget3.f35516T == 1) {
                            linearSystem.gh(solverVariable11, solverVariable10, solverVariable, solverVariable3, constraintWidget3.f35513N, 8);
                            linearSystem2 = linearSystem;
                        } else {
                            linearSystem.gh(solverVariable, solverVariable3, solverVariable11, solverVariable10, constraintWidget3.f35513N, 8);
                            linearSystem2 = linearSystem;
                        }
                        if (constraintWidget3.f35512M.HI()) {
                            linearSystem2.rl(constraintWidget3, constraintWidget3.f35512M.mUb().KN(), (float) Math.toRadians(constraintWidget3.s7N + 90.0f), constraintWidget3.f35512M.J2());
                        }
                        constraintWidget3.ck = false;
                        constraintWidget3.Ik = false;
                        metrics = LinearSystem.aYN;
                        if (metrics != null) {
                            metrics.P5 = linearSystem2.ViF();
                            LinearSystem.aYN.M7 = linearSystem2.nY();
                            return;
                        }
                        return;
                    }
                    i9 = -1;
                    if (z5) {
                    }
                    dimensionBehaviour = this.f35503D[0];
                    dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour2) {
                        z7 = z6;
                        z9 = false;
                    }
                    if (z9) {
                    }
                    boolean z212 = !this.f35512M.HI();
                    boolean[] zArr22 = this.f35510J;
                    boolean z222 = zArr22[0];
                    boolean z232 = zArr22[1];
                    if (this.f35521Z == 2) {
                        solverVariable3 = solverVariableIk;
                        z10 = z5;
                        solverVariable4 = solverVariable2;
                        dimensionBehaviour3 = dimensionBehaviour6;
                        z11 = z3;
                        dimensionBehaviour4 = dimensionBehaviour2;
                        z14 = z4;
                        solverVariable6 = solverVariableIk3;
                        solverVariable5 = solverVariableIk5;
                        z13 = z17;
                        z12 = z19;
                        i10 = i5;
                    }
                    if (z2) {
                        solverVariable7 = solverVariable6;
                        solverVariable8 = solverVariable4;
                        solverVariable9 = solverVariable5;
                        i11 = 0;
                        c2 = 1;
                        i12 = 8;
                        i13 = 1;
                    }
                    if ((this.XQ == 2 ? i11 : i13) == 0) {
                        constraintWidget3 = this;
                        solverVariable10 = solverVariable7;
                        solverVariable11 = solverVariable8;
                    }
                    if (!z10) {
                    }
                    if (constraintWidget3.f35512M.HI()) {
                    }
                    constraintWidget3.ck = false;
                    constraintWidget3.Ik = false;
                    metrics = LinearSystem.aYN;
                    if (metrics != null) {
                    }
                } else {
                    solverVariable = solverVariableIk2;
                    i15 = 3;
                }
                if (dimensionBehaviour5 == dimensionBehaviour6 && i5 == i15) {
                    this.f35516T = 0;
                    int i34 = (int) (i20 * f3);
                    if (dimensionBehaviour7 != dimensionBehaviour6) {
                        i5 = 4;
                        solverVariable2 = solverVariableIk4;
                        i3 = i23;
                        i7 = i26;
                        i8 = i34;
                    } else {
                        solverVariable2 = solverVariableIk4;
                        i3 = i23;
                        i7 = i26;
                        i8 = i34;
                        z5 = true;
                    }
                } else {
                    if (dimensionBehaviour7 == dimensionBehaviour6 && i26 == i15) {
                        this.f35516T = 1;
                        if (i22 == -1) {
                            this.f35513N = 1.0f / f3;
                        }
                        i3 = (int) (this.f35513N * i18);
                        if (dimensionBehaviour5 != dimensionBehaviour6) {
                            solverVariable2 = solverVariableIk4;
                            i8 = i2;
                            z5 = false;
                            i7 = 4;
                        } else {
                            solverVariable2 = solverVariableIk4;
                        }
                    } else {
                        solverVariable2 = solverVariableIk4;
                        i3 = i23;
                    }
                    z5 = true;
                    i7 = i26;
                    i8 = i2;
                }
                int[] iArr2 = this.ViF;
                iArr2[0] = i5;
                iArr2[1] = i7;
                this.KN = z5;
                if (!z5) {
                }
                if (z5) {
                }
                dimensionBehaviour = this.f35503D[0];
                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                }
                if (z9) {
                }
                boolean z2122 = !this.f35512M.HI();
                boolean[] zArr222 = this.f35510J;
                boolean z2222 = zArr222[0];
                boolean z2322 = zArr222[1];
                if (this.f35521Z == 2) {
                }
                if (z2) {
                }
                if ((this.XQ == 2 ? i11 : i13) == 0) {
                }
                if (!z10) {
                }
                if (constraintWidget3.f35512M.HI()) {
                }
                constraintWidget3.ck = false;
                constraintWidget3.Ik = false;
                metrics = LinearSystem.aYN;
                if (metrics != null) {
                }
            }
            z5 = false;
            int[] iArr22 = this.ViF;
            iArr22[0] = i5;
            iArr22[1] = i7;
            this.KN = z5;
            if (!z5) {
            }
            if (z5) {
            }
            dimensionBehaviour = this.f35503D[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
            }
            if (z9) {
            }
            boolean z21222 = !this.f35512M.HI();
            boolean[] zArr2222 = this.f35510J;
            boolean z22222 = zArr2222[0];
            boolean z23222 = zArr2222[1];
            if (this.f35521Z == 2) {
            }
            if (z2) {
            }
            if ((this.XQ == 2 ? i11 : i13) == 0) {
            }
            if (!z10) {
            }
            if (constraintWidget3.f35512M.HI()) {
            }
            constraintWidget3.ck = false;
            constraintWidget3.Ik = false;
            metrics = LinearSystem.aYN;
            if (metrics != null) {
            }
        } else {
            i2 = i19;
        }
        solverVariable = solverVariableIk2;
        solverVariable2 = solverVariableIk4;
        i3 = i23;
        i5 = i24;
        i7 = i25;
        i8 = i2;
        z5 = false;
        int[] iArr222 = this.ViF;
        iArr222[0] = i5;
        iArr222[1] = i7;
        this.KN = z5;
        if (!z5) {
        }
        if (z5) {
        }
        dimensionBehaviour = this.f35503D[0];
        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour2) {
        }
        if (z9) {
        }
        boolean z212222 = !this.f35512M.HI();
        boolean[] zArr22222 = this.f35510J;
        boolean z222222 = zArr22222[0];
        boolean z232222 = zArr22222[1];
        if (this.f35521Z == 2) {
        }
        if (z2) {
        }
        if ((this.XQ == 2 ? i11 : i13) == 0) {
        }
        if (!z10) {
        }
        if (constraintWidget3.f35512M.HI()) {
        }
        constraintWidget3.ck = false;
        constraintWidget3.Ik = false;
        metrics = LinearSystem.aYN;
        if (metrics != null) {
        }
    }

    public void W(int i2, int i3, int i5, int i7) {
        int i8;
        int i9;
        int i10 = i5 - i2;
        int i11 = i7 - i3;
        this.f35526k = i2;
        this.dR0 = i3;
        if (this.fcU == 8) {
            this.f35509I = 0;
            this.f35508GR = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f35503D;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i10 < (i9 = this.f35509I)) {
            i10 = i9;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i11 < (i8 = this.f35508GR)) {
            i11 = i8;
        }
        this.f35509I = i10;
        this.f35508GR = i11;
        int i12 = this.pJg;
        if (i11 < i12) {
            this.f35508GR = i12;
        }
        int i13 = this.xg;
        if (i10 < i13) {
            this.f35509I = i13;
        }
        int i14 = this.f35524g;
        if (i14 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f35509I = Math.min(this.f35509I, i14);
        }
        int i15 = this.fD;
        if (i15 > 0 && this.f35503D[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f35508GR = Math.min(this.f35508GR, i15);
        }
        int i16 = this.f35509I;
        if (i10 != i16) {
            this.qie = i16;
        }
        int i17 = this.f35508GR;
        if (i11 != i17) {
            this.az = i17;
        }
    }

    public void eWT() {
        this.f35529o = true;
    }

    public void fcU() {
        this.f35530r = true;
    }

    public boolean k(int i2, int i3) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 == 0) {
            ConstraintAnchor constraintAnchor3 = this.jB.J2;
            return constraintAnchor3 != null && constraintAnchor3.ty() && (constraintAnchor2 = this.P5.J2) != null && constraintAnchor2.ty() && (this.P5.J2.O() - this.P5.J2()) - (this.jB.J2.O() + this.jB.J2()) >= i3;
        }
        ConstraintAnchor constraintAnchor4 = this.f35517U.J2;
        if (constraintAnchor4 != null && constraintAnchor4.ty() && (constraintAnchor = this.M7.J2) != null && constraintAnchor.ty() && (this.M7.J2.O() - this.M7.J2()) - (this.f35517U.J2.O() + this.f35517U.J2()) >= i3) {
            return true;
        }
        return false;
    }

    public void mUb(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        gh(type, constraintWidget, type2, 0);
    }

    public void qm() {
        this.ck = false;
        this.Ik = false;
        this.f35530r = false;
        this.f35529o = false;
        int size = this.f35501B.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintAnchor) this.f35501B.get(i2)).r();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f35534n;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f35534n = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35534n[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35534n[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35534n[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35534n[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35534n[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35534n[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35534n[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35534n[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private void HV(StringBuilder sb, String str, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i2);
        sb.append(",\n");
    }

    private void M7(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.J2 == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.J2);
        sb.append("'");
        if (constraintAnchor.KN != Integer.MIN_VALUE || constraintAnchor.Uo != 0) {
            String str2 = HrvQKfmFZJudBc.OLREaWYCKxnykc;
            sb.append(str2);
            sb.append(constraintAnchor.Uo);
            if (constraintAnchor.KN != Integer.MIN_VALUE) {
                sb.append(str2);
                sb.append(constraintAnchor.KN);
                sb.append(str2);
            }
        }
        sb.append(" ] ,\n");
    }

    private void Org(StringBuilder sb, String str, float f3, float f4) {
        if (f3 == f4) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f3);
        sb.append(",\n");
    }

    private void nr() {
        this.f35501B.add(this.jB);
        this.f35501B.add(this.f35517U);
        this.f35501B.add(this.P5);
        this.f35501B.add(this.M7);
        this.f35501B.add(this.eF);
        this.f35501B.add(this.f35504E);
        this.f35501B.add(this.f35512M);
        this.f35501B.add(this.p5);
    }

    private boolean z(int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i3 = i2 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.f35506FX;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i3];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.J2;
        return (constraintAnchor4 == null || constraintAnchor4.J2 == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i3 + 1]).J2) == null || constraintAnchor2.J2 != constraintAnchor) ? false : true;
    }

    public void Aum(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.f35516T == -1) {
            if (z4 && !z5) {
                this.f35516T = 0;
            } else if (!z4 && z5) {
                this.f35516T = 1;
                if (this.f35520Y == -1) {
                    this.f35513N = 1.0f / this.f35513N;
                }
            }
        }
        if (this.f35516T == 0 && (!this.f35517U.HI() || !this.M7.HI())) {
            this.f35516T = 1;
        } else if (this.f35516T == 1 && (!this.jB.HI() || !this.P5.HI())) {
            this.f35516T = 0;
        }
        if (this.f35516T == -1 && (!this.f35517U.HI() || !this.M7.HI() || !this.jB.HI() || !this.P5.HI())) {
            if (this.f35517U.HI() && this.M7.HI()) {
                this.f35516T = 0;
            } else if (this.jB.HI() && this.P5.HI()) {
                this.f35513N = 1.0f / this.f35513N;
                this.f35516T = 1;
            }
        }
        if (this.f35516T == -1) {
            int i2 = this.nY;
            if (i2 > 0 && this.iF == 0) {
                this.f35516T = 0;
            } else {
                if (i2 != 0 || this.iF <= 0) {
                    return;
                }
                this.f35513N = 1.0f / this.f35513N;
                this.f35516T = 1;
            }
        }
    }

    public int B() {
        return this.fcU;
    }

    protected void Bu(int i2, boolean z2) {
        this.f35510J[i2] = z2;
    }

    public boolean C() {
        if (this.ck) {
            return true;
        }
        return this.jB.ty() && this.P5.ty();
    }

    public int D() {
        ConstraintWidget constraintWidget = this.f35522a;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f35526k : ((ConstraintWidgetContainer) constraintWidget).ub + this.f35526k;
    }

    public int E() {
        return this.f35511K;
    }

    public int E2() {
        return this.bzg;
    }

    public void EF(int i2) {
        this.f35511K = i2;
    }

    public void ER(int i2) {
        this.jB.Z(i2);
        this.f35526k = i2;
    }

    public void EWS(boolean z2) {
        this.eWT = z2;
    }

    public void F(float f3) {
        this.ofS = f3;
    }

    public int FX() {
        int i2 = this.jB != null ? this.f35517U.Uo : 0;
        return this.P5 != null ? i2 + this.M7.Uo : i2;
    }

    public boolean G7() {
        return this.f35529o;
    }

    public void HBN(boolean z2) {
        this.xMQ = z2;
    }

    public void HI(LinearSystem linearSystem) {
        linearSystem.Ik(this.jB);
        linearSystem.Ik(this.f35517U);
        linearSystem.Ik(this.P5);
        linearSystem.Ik(this.M7);
        if (this.eTf > 0) {
            linearSystem.Ik(this.p5);
        }
    }

    public void How(int i2) {
        if (this.wTp) {
            int i3 = i2 - this.eTf;
            int i5 = this.f35508GR + i3;
            this.dR0 = i3;
            this.f35517U.Z(i3);
            this.M7.Z(i5);
            this.p5.Z(i2);
            this.Ik = true;
        }
    }

    public boolean I() {
        return this.wTp;
    }

    public ConstraintAnchor Ik(ConstraintAnchor.Type type) {
        switch (AnonymousClass1.f35534n[type.ordinal()]) {
            case 1:
                return this.jB;
            case 2:
                return this.f35517U;
            case 3:
                return this.P5;
            case 4:
                return this.M7;
            case 5:
                return this.p5;
            case 6:
                return this.f35512M;
            case 7:
                return this.eF;
            case 8:
                return this.f35504E;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public int J() {
        if (this.fcU == 8) {
            return 0;
        }
        return this.f35509I;
    }

    boolean J2() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline);
    }

    public void JVN(ConstraintWidget constraintWidget) {
        this.f35522a = constraintWidget;
    }

    public boolean KN() {
        return this.fcU != 8;
    }

    public void Lp6(LinearSystem linearSystem, boolean z2) {
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int iG = linearSystem.g(this.jB);
        int iG2 = linearSystem.g(this.f35517U);
        int iG3 = linearSystem.g(this.P5);
        int iG4 = linearSystem.g(this.M7);
        if (z2 && (horizontalWidgetRun = this.f35514O) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.KN;
            if (dependencyNode.mUb) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.xMQ;
                if (dependencyNode2.mUb) {
                    iG = dependencyNode.Uo;
                    iG3 = dependencyNode2.Uo;
                }
            }
        }
        if (z2 && (verticalWidgetRun = this.J2) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.KN;
            if (dependencyNode3.mUb) {
                DependencyNode dependencyNode4 = verticalWidgetRun.xMQ;
                if (dependencyNode4.mUb) {
                    iG2 = dependencyNode3.Uo;
                    iG4 = dependencyNode4.Uo;
                }
            }
        }
        int i2 = iG4 - iG2;
        if (iG3 - iG < 0 || i2 < 0 || iG == Integer.MIN_VALUE || iG == Integer.MAX_VALUE || iG2 == Integer.MIN_VALUE || iG2 == Integer.MAX_VALUE || iG3 == Integer.MIN_VALUE || iG3 == Integer.MAX_VALUE || iG4 == Integer.MIN_VALUE || iG4 == Integer.MAX_VALUE) {
            iG = 0;
            iG4 = 0;
            iG2 = 0;
            iG3 = 0;
        }
        W(iG, iG2, iG3, iG4);
    }

    public DimensionBehaviour M() {
        return this.f35503D[1];
    }

    public boolean Mx() {
        if (this.Ik) {
            return true;
        }
        return this.f35517U.ty() && this.M7.ty();
    }

    public int N() {
        return this.nHg[1];
    }

    public boolean Nxk() {
        int size = this.f35501B.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ConstraintAnchor) this.f35501B.get(i2)).az()) {
                return true;
            }
        }
        return false;
    }

    public void O(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet hashSet, int i2, boolean z2) {
        if (z2) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.n(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            Uo(linearSystem, constraintWidgetContainer.mx(64));
        }
        if (i2 == 0) {
            HashSet hashSetNr = this.jB.nr();
            if (hashSetNr != null) {
                Iterator it = hashSetNr.iterator();
                while (it.hasNext()) {
                    ((ConstraintAnchor) it.next()).nr.O(constraintWidgetContainer, linearSystem, hashSet, i2, true);
                }
            }
            HashSet hashSetNr2 = this.P5.nr();
            if (hashSetNr2 != null) {
                Iterator it2 = hashSetNr2.iterator();
                while (it2.hasNext()) {
                    ((ConstraintAnchor) it2.next()).nr.O(constraintWidgetContainer, linearSystem, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet hashSetNr3 = this.f35517U.nr();
        if (hashSetNr3 != null) {
            Iterator it3 = hashSetNr3.iterator();
            while (it3.hasNext()) {
                ((ConstraintAnchor) it3.next()).nr.O(constraintWidgetContainer, linearSystem, hashSet, i2, true);
            }
        }
        HashSet hashSetNr4 = this.M7.nr();
        if (hashSetNr4 != null) {
            Iterator it4 = hashSetNr4.iterator();
            while (it4.hasNext()) {
                ((ConstraintAnchor) it4.next()).nr.O(constraintWidgetContainer, linearSystem, hashSet, i2, true);
            }
        }
        HashSet hashSetNr5 = this.p5.nr();
        if (hashSetNr5 != null) {
            Iterator it5 = hashSetNr5.iterator();
            while (it5.hasNext()) {
                ((ConstraintAnchor) it5.next()).nr.O(constraintWidgetContainer, linearSystem, hashSet, i2, true);
            }
        }
    }

    public void QZ6(int i2) {
        this.f35525i = i2;
    }

    public void Qu(int i2) {
        this.nHg[0] = i2;
    }

    public void RQ(boolean z2) {
        this.wTp = z2;
    }

    public String S() {
        return this.ul;
    }

    public int T(int i2) {
        if (i2 == 0) {
            return J();
        }
        if (i2 == 1) {
            return nY();
        }
        return 0;
    }

    public void T3L(float f3) {
        this.ER[0] = f3;
    }

    public void U(StringBuilder sb) {
        sb.append("  " + this.HI + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.f35509I);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f35508GR);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f35526k);
        sb.append("\n");
        sb.append("    actualTop:" + this.dR0);
        sb.append("\n");
        M7(sb, TtmlNode.LEFT, this.jB);
        M7(sb, "top", this.f35517U);
        M7(sb, TtmlNode.RIGHT, this.P5);
        M7(sb, "bottom", this.M7);
        M7(sb, "baseline", this.p5);
        M7(sb, "centerX", this.eF);
        M7(sb, "centerY", this.f35504E);
        P5(sb, "    width", this.f35509I, this.xg, this.nHg[0], this.qie, this.nY, this.WPU, this.te, this.f35503D[0], this.ER[0]);
        P5(sb, "    height", this.f35508GR, this.pJg, this.nHg[1], this.az, this.iF, this.aYN, this.E2, this.f35503D[1], this.ER[1]);
        Po6(sb, "    dimensionRatio", this.Nxk, this.f35520Y);
        Org(sb, "    horizontalBias", this.ofS, QZ6);
        Org(sb, "    verticalBias", this.f35502C, QZ6);
        HV(sb, "    horizontalChainStyle", this.f35525i, 0);
        HV(sb, "    verticalChainStyle", this.f35511K, 0);
        sb.append("  }");
    }

    public void UF(int i2) {
        if (i2 < 0) {
            this.pJg = 0;
        } else {
            this.pJg = i2;
        }
    }

    public void Uf(boolean z2) {
        this.rV9 = z2;
    }

    public void UhV(Object obj) {
        this.Mx = obj;
    }

    public int ViF() {
        return this.f35520Y;
    }

    public void Vvq(DimensionBehaviour dimensionBehaviour) {
        this.f35503D[1] = dimensionBehaviour;
    }

    public void VwL(DimensionBehaviour dimensionBehaviour) {
        this.f35503D[0] = dimensionBehaviour;
    }

    public DimensionBehaviour WPU(int i2) {
        if (i2 == 0) {
            return iF();
        }
        if (i2 == 1) {
            return M();
        }
        return null;
    }

    public void X4T(int i2) {
        if (i2 < 0) {
            this.xg = 0;
        } else {
            this.xg = i2;
        }
    }

    public Object XQ() {
        return this.Mx;
    }

    public boolean Y() {
        return (this.qie == -1 && this.az == -1) ? false : true;
    }

    public void Zmq(int i2, int i3) {
        this.f35526k = i2;
        this.dR0 = i3;
    }

    public void Zn(float f3) {
        this.ER[1] = f3;
    }

    public int a() {
        ConstraintWidget constraintWidget = this.f35522a;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.dR0 : ((ConstraintWidgetContainer) constraintWidget).Qu + this.dR0;
    }

    public void a63(int i2) {
        this.f35508GR = i2;
        int i3 = this.pJg;
        if (i2 < i3) {
            this.f35508GR = i3;
        }
    }

    public float aYN() {
        return this.Nxk;
    }

    public void az(ConstraintWidget constraintWidget, float f3, int i2) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        dR0(type, constraintWidget, type, i2, 0);
        this.s7N = f3;
    }

    public ConstraintWidget bzg(int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 != 0) {
            if (i2 == 1 && (constraintAnchor2 = (constraintAnchor = this.f35517U).J2) != null && constraintAnchor2.J2 == constraintAnchor) {
                return constraintAnchor2.nr;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.jB;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.J2;
        if (constraintAnchor4 == null || constraintAnchor4.J2 != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.nr;
    }

    public void ck() {
        if (this.f35514O == null) {
            this.f35514O = new HorizontalWidgetRun(this);
        }
        if (this.J2 == null) {
            this.J2 = new VerticalWidgetRun(this);
        }
    }

    public int e() {
        return this.Xw;
    }

    public float eF() {
        return this.f35502C;
    }

    public boolean eTf() {
        return this.f35532v;
    }

    public void f(int i2, int i3) {
        this.bzg = i2;
        this.Xw = i3;
        HBN(false);
    }

    public int fD() {
        ConstraintAnchor constraintAnchor = this.jB;
        int i2 = constraintAnchor != null ? constraintAnchor.Uo : 0;
        ConstraintAnchor constraintAnchor2 = this.P5;
        return constraintAnchor2 != null ? i2 + constraintAnchor2.Uo : i2;
    }

    public float g() {
        return this.ofS;
    }

    public void gh(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z2;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 != type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                if (type2 == type6 || type2 == ConstraintAnchor.Type.RIGHT) {
                    gh(type6, constraintWidget, type2, 0);
                    gh(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                    Ik(type5).n(constraintWidget.Ik(type2), 0);
                    return;
                }
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.TOP;
                if (type2 == type7 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    gh(type7, constraintWidget, type2, 0);
                    gh(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    Ik(type5).n(constraintWidget.Ik(type2), 0);
                    return;
                }
                return;
            }
            ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor constraintAnchorIk = Ik(type8);
            ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor constraintAnchorIk2 = Ik(type9);
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor constraintAnchorIk3 = Ik(type10);
            ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor constraintAnchorIk4 = Ik(type11);
            boolean z3 = true;
            if ((constraintAnchorIk == null || !constraintAnchorIk.HI()) && (constraintAnchorIk2 == null || !constraintAnchorIk2.HI())) {
                gh(type8, constraintWidget, type8, 0);
                gh(type9, constraintWidget, type9, 0);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((constraintAnchorIk3 == null || !constraintAnchorIk3.HI()) && (constraintAnchorIk4 == null || !constraintAnchorIk4.HI())) {
                gh(type10, constraintWidget, type10, 0);
                gh(type11, constraintWidget, type11, 0);
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                Ik(type5).n(constraintWidget.Ik(type5), 0);
                return;
            }
            if (z2) {
                ConstraintAnchor.Type type12 = ConstraintAnchor.Type.CENTER_X;
                Ik(type12).n(constraintWidget.Ik(type12), 0);
                return;
            } else {
                if (z3) {
                    ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_Y;
                    Ik(type13).n(constraintWidget.Ik(type13), 0);
                    return;
                }
                return;
            }
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor constraintAnchorIk5 = Ik(type4);
            ConstraintAnchor constraintAnchorIk6 = constraintWidget.Ik(type2);
            ConstraintAnchor constraintAnchorIk7 = Ik(ConstraintAnchor.Type.RIGHT);
            constraintAnchorIk5.n(constraintAnchorIk6, 0);
            constraintAnchorIk7.n(constraintAnchorIk6, 0);
            Ik(type14).n(constraintAnchorIk6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor constraintAnchorIk8 = constraintWidget.Ik(type2);
            Ik(type3).n(constraintAnchorIk8, 0);
            Ik(ConstraintAnchor.Type.BOTTOM).n(constraintAnchorIk8, 0);
            Ik(type15).n(constraintAnchorIk8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            Ik(type16).n(constraintWidget.Ik(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            Ik(type17).n(constraintWidget.Ik(type17), 0);
            Ik(type14).n(constraintWidget.Ik(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            Ik(type18).n(constraintWidget.Ik(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            Ik(type19).n(constraintWidget.Ik(type19), 0);
            Ik(type15).n(constraintWidget.Ik(type2), 0);
            return;
        }
        ConstraintAnchor constraintAnchorIk9 = Ik(type);
        ConstraintAnchor constraintAnchorIk10 = constraintWidget.Ik(type2);
        if (constraintAnchorIk9.ck(constraintAnchorIk10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor constraintAnchorIk11 = Ik(ConstraintAnchor.Type.TOP);
                ConstraintAnchor constraintAnchorIk12 = Ik(ConstraintAnchor.Type.BOTTOM);
                if (constraintAnchorIk11 != null) {
                    constraintAnchorIk11.Ik();
                }
                if (constraintAnchorIk12 != null) {
                    constraintAnchorIk12.Ik();
                }
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor constraintAnchorIk13 = Ik(type20);
                if (constraintAnchorIk13 != null) {
                    constraintAnchorIk13.Ik();
                }
                ConstraintAnchor constraintAnchorIk14 = Ik(type5);
                if (constraintAnchorIk14.mUb() != constraintAnchorIk10) {
                    constraintAnchorIk14.Ik();
                }
                ConstraintAnchor constraintAnchorUo = Ik(type).Uo();
                ConstraintAnchor constraintAnchorIk15 = Ik(type15);
                if (constraintAnchorIk15.HI()) {
                    constraintAnchorUo.Ik();
                    constraintAnchorIk15.Ik();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor constraintAnchorIk16 = Ik(type5);
                if (constraintAnchorIk16.mUb() != constraintAnchorIk10) {
                    constraintAnchorIk16.Ik();
                }
                ConstraintAnchor constraintAnchorUo2 = Ik(type).Uo();
                ConstraintAnchor constraintAnchorIk17 = Ik(type14);
                if (constraintAnchorIk17.HI()) {
                    constraintAnchorUo2.Ik();
                    constraintAnchorIk17.Ik();
                }
            }
            constraintAnchorIk9.n(constraintAnchorIk10, i2);
        }
    }

    public void hRu(int i2) {
        this.eTf = i2;
        this.wTp = i2 > 0;
    }

    public void i(String str) {
        this.ul = str;
    }

    public DimensionBehaviour iF() {
        return this.f35503D[0];
    }

    public boolean ijL(int i2) {
        return this.f35510J[i2];
    }

    public WidgetRun jB(int i2) {
        if (i2 == 0) {
            return this.f35514O;
        }
        if (i2 == 1) {
            return this.J2;
        }
        return null;
    }

    public void kSg(int i2, int i3) {
        if (this.Ik) {
            return;
        }
        this.f35517U.Z(i2);
        this.M7.Z(i3);
        this.dR0 = i2;
        this.f35508GR = i3 - i2;
        if (this.wTp) {
            this.p5.Z(i2 + this.eTf);
        }
        this.Ik = true;
    }

    public void lLA(int i2) {
        this.f35517U.Z(i2);
        this.dR0 = i2;
    }

    public boolean m() {
        ConstraintAnchor constraintAnchor = this.jB;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.J2;
        if (constraintAnchor2 != null && constraintAnchor2.J2 == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.P5;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.J2;
        return constraintAnchor4 != null && constraintAnchor4.J2 == constraintAnchor3;
    }

    public void mI(int i2, int i3, int i5, float f3) {
        this.WPU = i2;
        this.nY = i3;
        if (i5 == Integer.MAX_VALUE) {
            i5 = 0;
        }
        this.f35524g = i5;
        this.te = f3;
        if (f3 <= 0.0f || f3 >= 1.0f || i2 != 0) {
            return;
        }
        this.WPU = 2;
    }

    public void mYa(Cache cache) {
        this.jB.o(cache);
        this.f35517U.o(cache);
        this.P5.o(cache);
        this.M7.o(cache);
        this.p5.o(cache);
        this.f35512M.o(cache);
        this.eF.o(cache);
        this.f35504E.o(cache);
    }

    public void n1() {
        this.jB.Ik();
        this.f35517U.Ik();
        this.P5.Ik();
        this.M7.Ik();
        this.p5.Ik();
        this.eF.Ik();
        this.f35504E.Ik();
        this.f35512M.Ik();
        this.f35522a = null;
        this.s7N = Float.NaN;
        this.f35509I = 0;
        this.f35508GR = 0;
        this.Nxk = 0.0f;
        this.f35520Y = -1;
        this.f35526k = 0;
        this.dR0 = 0;
        this.ijL = 0;
        this.f35527m = 0;
        this.eTf = 0;
        this.xg = 0;
        this.pJg = 0;
        float f3 = QZ6;
        this.ofS = f3;
        this.f35502C = f3;
        DimensionBehaviour[] dimensionBehaviourArr = this.f35503D;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.Mx = null;
        this.f35507G7 = 0;
        this.fcU = 0;
        this.n1 = null;
        this.EWS = false;
        this.hRu = false;
        this.f35525i = 0;
        this.f35511K = 0;
        this.How = false;
        this.tUK = false;
        float[] fArr = this.ER;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f35521Z = -1;
        this.XQ = -1;
        int[] iArr = this.nHg;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.WPU = 0;
        this.aYN = 0;
        this.te = 1.0f;
        this.E2 = 1.0f;
        this.f35524g = Integer.MAX_VALUE;
        this.fD = Integer.MAX_VALUE;
        this.nY = 0;
        this.iF = 0;
        this.KN = false;
        this.f35516T = -1;
        this.f35513N = 1.0f;
        this.UhV = false;
        boolean[] zArr = this.Uo;
        zArr[0] = true;
        zArr[1] = true;
        this.rV9 = false;
        boolean[] zArr2 = this.f35510J;
        zArr2[0] = false;
        zArr2[1] = false;
        this.xMQ = true;
        int[] iArr2 = this.ViF;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.qie = -1;
        this.az = -1;
    }

    public void n7b(int i2) {
        this.dR0 = i2;
    }

    public int nHg() {
        return this.nHg[0];
    }

    public void nO(int i2) {
        this.fcU = i2;
    }

    public int nY() {
        if (this.fcU == 8) {
            return 0;
        }
        return this.f35508GR;
    }

    public float o(int i2) {
        if (i2 == 0) {
            return this.ofS;
        }
        if (i2 == 1) {
            return this.f35502C;
        }
        return -1.0f;
    }

    public void o9(int i2) {
        this.f35526k = i2;
    }

    public boolean ofS() {
        return this.xMQ && this.fcU != 8;
    }

    public void p0N(boolean z2) {
        this.f35532v = z2;
    }

    public boolean pJg() {
        return this.rV9;
    }

    public boolean piY() {
        return this.f35530r;
    }

    public int r() {
        return this.eTf;
    }

    public ConstraintWidget rV9() {
        return this.f35522a;
    }

    public void s(boolean z2, boolean z3) {
        int i2;
        int i3;
        boolean zGh = z2 & this.f35514O.gh();
        boolean zGh2 = z3 & this.J2.gh();
        HorizontalWidgetRun horizontalWidgetRun = this.f35514O;
        int i5 = horizontalWidgetRun.KN.Uo;
        VerticalWidgetRun verticalWidgetRun = this.J2;
        int i7 = verticalWidgetRun.KN.Uo;
        int i8 = horizontalWidgetRun.xMQ.Uo;
        int i9 = verticalWidgetRun.xMQ.Uo;
        int i10 = i9 - i7;
        if (i8 - i5 < 0 || i10 < 0 || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE || i8 == Integer.MIN_VALUE || i8 == Integer.MAX_VALUE || i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE) {
            i8 = 0;
            i5 = 0;
            i9 = 0;
            i7 = 0;
        }
        int i11 = i8 - i5;
        int i12 = i9 - i7;
        if (zGh) {
            this.f35526k = i5;
        }
        if (zGh2) {
            this.dR0 = i7;
        }
        if (this.fcU == 8) {
            this.f35509I = 0;
            this.f35508GR = 0;
            return;
        }
        if (zGh) {
            if (this.f35503D[0] == DimensionBehaviour.FIXED && i11 < (i3 = this.f35509I)) {
                i11 = i3;
            }
            this.f35509I = i11;
            int i13 = this.xg;
            if (i11 < i13) {
                this.f35509I = i13;
            }
        }
        if (zGh2) {
            if (this.f35503D[1] == DimensionBehaviour.FIXED && i12 < (i2 = this.f35508GR)) {
                i12 = i2;
            }
            this.f35508GR = i12;
            int i14 = this.pJg;
            if (i12 < i14) {
                this.f35508GR = i14;
            }
        }
    }

    public int s7N() {
        return this.pJg;
    }

    public void tFV(int i2, int i3) {
        this.f35526k = i2;
        int i5 = i3 - i2;
        this.f35509I = i5;
        int i7 = this.xg;
        if (i5 < i7) {
            this.f35509I = i7;
        }
    }

    public void tUK(int i2, int i3) {
        if (this.ck) {
            return;
        }
        this.jB.Z(i2);
        this.P5.Z(i3);
        this.f35526k = i2;
        this.f35509I = i3 - i2;
        this.ck = true;
    }

    public int te() {
        return this.f35525i;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.n1 != null) {
            str = "type: " + this.n1 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.ul != null) {
            str2 = "id: " + this.ul + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f35526k);
        sb.append(", ");
        sb.append(this.dR0);
        sb.append(") - (");
        sb.append(this.f35509I);
        sb.append(" x ");
        sb.append(this.f35508GR);
        sb.append(")");
        return sb.toString();
    }

    public void ty(ConstraintWidget constraintWidget, HashMap map) {
        this.f35521Z = constraintWidget.f35521Z;
        this.XQ = constraintWidget.XQ;
        this.WPU = constraintWidget.WPU;
        this.aYN = constraintWidget.aYN;
        int[] iArr = this.ViF;
        int[] iArr2 = constraintWidget.ViF;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.nY = constraintWidget.nY;
        this.f35524g = constraintWidget.f35524g;
        this.iF = constraintWidget.iF;
        this.fD = constraintWidget.fD;
        this.E2 = constraintWidget.E2;
        this.f35523e = constraintWidget.f35523e;
        this.f35519X = constraintWidget.f35519X;
        this.f35516T = constraintWidget.f35516T;
        this.f35513N = constraintWidget.f35513N;
        int[] iArr3 = constraintWidget.nHg;
        this.nHg = Arrays.copyOf(iArr3, iArr3.length);
        this.s7N = constraintWidget.s7N;
        this.wTp = constraintWidget.wTp;
        this.f35532v = constraintWidget.f35532v;
        this.jB.Ik();
        this.f35517U.Ik();
        this.P5.Ik();
        this.M7.Ik();
        this.p5.Ik();
        this.eF.Ik();
        this.f35504E.Ik();
        this.f35512M.Ik();
        this.f35503D = (DimensionBehaviour[]) Arrays.copyOf(this.f35503D, 2);
        this.f35522a = this.f35522a == null ? null : (ConstraintWidget) map.get(constraintWidget.f35522a);
        this.f35509I = constraintWidget.f35509I;
        this.f35508GR = constraintWidget.f35508GR;
        this.Nxk = constraintWidget.Nxk;
        this.f35520Y = constraintWidget.f35520Y;
        this.f35526k = constraintWidget.f35526k;
        this.dR0 = constraintWidget.dR0;
        this.f35533z = constraintWidget.f35533z;
        this.piY = constraintWidget.piY;
        this.ijL = constraintWidget.ijL;
        this.f35527m = constraintWidget.f35527m;
        this.eTf = constraintWidget.eTf;
        this.xg = constraintWidget.xg;
        this.pJg = constraintWidget.pJg;
        this.ofS = constraintWidget.ofS;
        this.f35502C = constraintWidget.f35502C;
        this.Mx = constraintWidget.Mx;
        this.f35507G7 = constraintWidget.f35507G7;
        this.fcU = constraintWidget.fcU;
        this.eWT = constraintWidget.eWT;
        this.ul = constraintWidget.ul;
        this.n1 = constraintWidget.n1;
        this.Jk = constraintWidget.Jk;
        this.Rl = constraintWidget.Rl;
        this.qm = constraintWidget.qm;
        this.mYa = constraintWidget.mYa;
        this.Org = constraintWidget.Org;
        this.HV = constraintWidget.HV;
        this.GD = constraintWidget.GD;
        this.Po6 = constraintWidget.Po6;
        this.EWS = constraintWidget.EWS;
        this.hRu = constraintWidget.hRu;
        this.f35525i = constraintWidget.f35525i;
        this.f35511K = constraintWidget.f35511K;
        this.How = constraintWidget.How;
        this.tUK = constraintWidget.tUK;
        float[] fArr = this.ER;
        float[] fArr2 = constraintWidget.ER;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.lLA;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.lLA;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.kSg;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.kSg;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget2 = constraintWidget.f35518W;
        this.f35518W = constraintWidget2 == null ? null : (ConstraintWidget) map.get(constraintWidget2);
        ConstraintWidget constraintWidget3 = constraintWidget.RQ;
        this.RQ = constraintWidget3 != null ? (ConstraintWidget) map.get(constraintWidget3) : null;
    }

    public void uG(int i2, int i3) {
        this.dR0 = i2;
        int i5 = i3 - i2;
        this.f35508GR = i5;
        int i7 = this.pJg;
        if (i5 < i7) {
            this.f35508GR = i7;
        }
    }

    public void ub(int i2) {
        this.nHg[1] = i2;
    }

    public boolean ul() {
        DimensionBehaviour[] dimensionBehaviourArr = this.f35503D;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public ConstraintWidget v(int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 != 0) {
            if (i2 == 1 && (constraintAnchor2 = (constraintAnchor = this.M7).J2) != null && constraintAnchor2.J2 == constraintAnchor) {
                return constraintAnchor2.nr;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.P5;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.J2;
        if (constraintAnchor4 == null || constraintAnchor4.J2 != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.nr;
    }

    public void v0j(int i2) {
        if (i2 < 0 || i2 > 3) {
            return;
        }
        this.f35515S = i2;
    }

    public void vl(int i2) {
        this.f35509I = i2;
        int i3 = this.xg;
        if (i2 < i3) {
            this.f35509I = i3;
        }
    }

    public int wTp() {
        return this.xg;
    }

    public void xVH(float f3) {
        this.f35502C = f3;
    }

    public boolean xg() {
        ConstraintAnchor constraintAnchor = this.f35517U;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.J2;
        if (constraintAnchor2 != null && constraintAnchor2.J2 == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.M7;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.J2;
        return constraintAnchor4 != null && constraintAnchor4.J2 == constraintAnchor3;
    }

    public void y(int i2, int i3, int i5, float f3) {
        this.aYN = i2;
        this.iF = i3;
        if (i5 == Integer.MAX_VALUE) {
            i5 = 0;
        }
        this.fD = i5;
        this.E2 = f3;
        if (f3 <= 0.0f || f3 >= 1.0f || i2 != 0) {
            return;
        }
        this.aYN = 2;
    }

    private void GD(StringBuilder sb, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(str2);
        sb.append(",\n");
    }

    private void P5(StringBuilder sb, String str, int i2, int i3, int i5, int i7, int i8, int i9, float f3, DimensionBehaviour dimensionBehaviour, float f4) {
        sb.append(str);
        sb.append(" :  {\n");
        GD(sb, "      behavior", dimensionBehaviour.toString(), DimensionBehaviour.FIXED.toString());
        HV(sb, "      size", i2, 0);
        HV(sb, "      min", i3, 0);
        HV(sb, "      max", i5, Integer.MAX_VALUE);
        HV(sb, "      matchMin", i8, 0);
        HV(sb, "      matchDef", i9, 0);
        Org(sb, "      matchPercent", f3, 1.0f);
        sb.append("    },\n");
    }

    public void Jk() {
        Rl();
        xVH(QZ6);
        F(QZ6);
    }

    public void Rl() {
        ConstraintWidget constraintWidgetRV9 = rV9();
        if (constraintWidgetRV9 == null || !(constraintWidgetRV9 instanceof ConstraintWidgetContainer) || !((ConstraintWidgetContainer) rV9()).pS()) {
            int size = this.f35501B.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ConstraintAnchor) this.f35501B.get(i2)).Ik();
            }
        }
    }

    public int X() {
        return D();
    }

    public int Xw() {
        return D() + this.f35509I;
    }

    public int Z() {
        return a() + this.f35508GR;
    }

    public void dR0(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2, int i3) {
        Ik(type).rl(constraintWidget.Ik(type2), i2, i3, true);
    }

    public int p5() {
        return a();
    }

    public void qie(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2) {
        if (constraintAnchor.KN() == this) {
            gh(constraintAnchor.gh(), constraintAnchor2.KN(), constraintAnchor2.gh(), i2);
        }
    }

    public ConstraintWidget(int i2, int i3, int i5, int i7) {
        this.f35528n = false;
        this.rl = new WidgetRun[2];
        this.f35514O = null;
        this.J2 = null;
        this.Uo = new boolean[]{true, true};
        this.KN = false;
        this.xMQ = true;
        this.mUb = false;
        this.gh = true;
        this.qie = -1;
        this.az = -1;
        this.ty = new WidgetFrame(this);
        this.ck = false;
        this.Ik = false;
        this.f35530r = false;
        this.f35529o = false;
        this.f35521Z = -1;
        this.XQ = -1;
        this.f35515S = 0;
        this.WPU = 0;
        this.aYN = 0;
        this.ViF = new int[2];
        this.nY = 0;
        this.f35524g = 0;
        this.te = 1.0f;
        this.iF = 0;
        this.fD = 0;
        this.E2 = 1.0f;
        this.f35516T = -1;
        this.f35513N = 1.0f;
        this.nHg = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.s7N = Float.NaN;
        this.wTp = false;
        this.rV9 = false;
        this.bzg = 0;
        this.Xw = 0;
        this.jB = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.f35517U = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.P5 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.M7 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.p5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.eF = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.f35504E = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f35512M = constraintAnchor;
        this.f35506FX = new ConstraintAnchor[]{this.jB, this.P5, this.f35517U, this.M7, this.p5, constraintAnchor};
        this.f35501B = new ArrayList();
        this.f35510J = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f35503D = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f35522a = null;
        this.Nxk = 0.0f;
        this.f35520Y = -1;
        this.f35533z = 0;
        this.piY = 0;
        this.ijL = 0;
        this.f35527m = 0;
        this.eTf = 0;
        float f3 = QZ6;
        this.ofS = f3;
        this.f35502C = f3;
        this.f35507G7 = 0;
        this.fcU = 0;
        this.eWT = false;
        this.ul = null;
        this.n1 = null;
        this.UhV = false;
        this.f35525i = 0;
        this.f35511K = 0;
        this.ER = new float[]{-1.0f, -1.0f};
        this.lLA = new ConstraintWidget[]{null, null};
        this.kSg = new ConstraintWidget[]{null, null};
        this.f35518W = null;
        this.RQ = null;
        this.a63 = -1;
        this.f35505F = -1;
        this.f35526k = i2;
        this.dR0 = i3;
        this.f35509I = i5;
        this.f35508GR = i7;
        nr();
    }

    public ConstraintWidget(int i2, int i3) {
        this(0, 0, i2, i3);
    }
}
