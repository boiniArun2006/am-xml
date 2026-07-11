package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class LinearSystem {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static boolean f34976S = true;
    public static long ViF = 0;
    public static boolean WPU = false;
    public static boolean XQ = true;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static boolean f34977Z = true;
    public static Metrics aYN;
    public static long nY;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f34978o;
    final Cache HI;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Row f34979O;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Row f34981r;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f34980n = 1000;
    public boolean rl = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f34982t = 0;
    private HashMap nr = null;
    private int J2 = 32;
    private int Uo = 32;
    public boolean xMQ = false;
    public boolean mUb = false;
    private boolean[] gh = new boolean[32];
    int qie = 1;
    int az = 0;
    private int ty = 32;
    private SolverVariable[] ck = new SolverVariable[1000];
    private int Ik = 0;
    ArrayRow[] KN = new ArrayRow[32];

    interface Row {
        void clear();

        SolverVariable getKey();

        boolean isEmpty();

        void n(Row row);

        SolverVariable rl(LinearSystem linearSystem, boolean[] zArr);

        void t(SolverVariable solverVariable);
    }

    private void ty() {
        for (int i2 = 0; i2 < this.az; i2++) {
            ArrayRow arrayRow = this.KN[i2];
            arrayRow.f34972n.f35011o = arrayRow.rl;
        }
    }

    public SolverVariable Ik(Object obj) {
        SolverVariable solverVariableXMQ = null;
        if (obj == null) {
            return null;
        }
        if (this.qie + 1 >= this.Uo) {
            te();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariableXMQ = constraintAnchor.xMQ();
            if (solverVariableXMQ == null) {
                constraintAnchor.o(this.HI);
                solverVariableXMQ = constraintAnchor.xMQ();
            }
            int i2 = solverVariableXMQ.f35003O;
            if (i2 != -1 && i2 <= this.f34982t && this.HI.nr[i2] != null) {
                return solverVariableXMQ;
            }
            if (i2 != -1) {
                solverVariableXMQ.J2();
            }
            int i3 = this.f34982t + 1;
            this.f34982t = i3;
            this.qie++;
            solverVariableXMQ.f35003O = i3;
            solverVariableXMQ.E2 = SolverVariable.Type.UNRESTRICTED;
            this.HI.nr[i3] = solverVariableXMQ;
        }
        return solverVariableXMQ;
    }

    public void X() {
        Cache cache;
        int i2 = 0;
        while (true) {
            cache = this.HI;
            SolverVariable[] solverVariableArr = cache.nr;
            if (i2 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i2];
            if (solverVariable != null) {
                solverVariable.J2();
            }
            i2++;
        }
        cache.f34975t.rl(this.ck, this.Ik);
        this.Ik = 0;
        Arrays.fill(this.HI.nr, (Object) null);
        HashMap map = this.nr;
        if (map != null) {
            map.clear();
        }
        this.f34982t = 0;
        this.f34979O.clear();
        this.qie = 1;
        for (int i3 = 0; i3 < this.az; i3++) {
            ArrayRow arrayRow = this.KN[i3];
            if (arrayRow != null) {
                arrayRow.f34973t = false;
            }
        }
        e();
        this.az = 0;
        if (WPU) {
            this.f34981r = new ValuesRow(this.HI);
        } else {
            this.f34981r = new ArrayRow(this.HI);
        }
    }

    void az(ArrayRow arrayRow, int i2, int i3) {
        arrayRow.O(HI(i3, null), i2);
    }

    static class ValuesRow extends ArrayRow {
        ValuesRow(Cache cache) {
            this.f34971O = new SolverVariableValues(this, cache);
        }
    }

    private int E2(Row row, boolean z2) {
        Metrics metrics = aYN;
        if (metrics != null) {
            metrics.qie++;
        }
        for (int i2 = 0; i2 < this.qie; i2++) {
            this.gh[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            Metrics metrics2 = aYN;
            if (metrics2 != null) {
                metrics2.az++;
            }
            i3++;
            if (i3 < this.qie * 2) {
                if (row.getKey() != null) {
                    this.gh[row.getKey().f35003O] = true;
                }
                SolverVariable solverVariableRl = row.rl(this, this.gh);
                if (solverVariableRl != null) {
                    boolean[] zArr = this.gh;
                    int i5 = solverVariableRl.f35003O;
                    if (!zArr[i5]) {
                        zArr[i5] = true;
                    }
                }
                if (solverVariableRl != null) {
                    float f3 = Float.MAX_VALUE;
                    int i7 = -1;
                    for (int i8 = 0; i8 < this.az; i8++) {
                        ArrayRow arrayRow = this.KN[i8];
                        if (arrayRow.f34972n.E2 != SolverVariable.Type.UNRESTRICTED && !arrayRow.J2 && arrayRow.Z(solverVariableRl)) {
                            float fMUb = arrayRow.f34971O.mUb(solverVariableRl);
                            if (fMUb < 0.0f) {
                                float f4 = (-arrayRow.rl) / fMUb;
                                if (f4 < f3) {
                                    i7 = i8;
                                    f3 = f4;
                                }
                            }
                        }
                    }
                    if (i7 > -1) {
                        ArrayRow arrayRow2 = this.KN[i7];
                        arrayRow2.f34972n.J2 = -1;
                        Metrics metrics3 = aYN;
                        if (metrics3 != null) {
                            metrics3.ty++;
                        }
                        arrayRow2.aYN(solverVariableRl);
                        SolverVariable solverVariable = arrayRow2.f34972n;
                        solverVariable.J2 = i7;
                        solverVariable.xMQ(this, arrayRow2);
                    }
                } else {
                    z3 = true;
                }
            }
            return i3;
        }
        return i3;
    }

    private int XQ(Row row) {
        float f3;
        long j2;
        for (int i2 = 0; i2 < this.az; i2++) {
            ArrayRow arrayRow = this.KN[i2];
            if (arrayRow.f34972n.E2 != SolverVariable.Type.UNRESTRICTED) {
                float f4 = 0.0f;
                if (arrayRow.rl < 0.0f) {
                    boolean z2 = false;
                    int i3 = 0;
                    while (!z2) {
                        Metrics metrics = aYN;
                        long j3 = 1;
                        if (metrics != null) {
                            metrics.HI++;
                        }
                        i3++;
                        float f5 = Float.MAX_VALUE;
                        int i5 = 0;
                        int i7 = -1;
                        int i8 = -1;
                        int i9 = 0;
                        while (true) {
                            if (i5 >= this.az) {
                                break;
                            }
                            ArrayRow arrayRow2 = this.KN[i5];
                            if (arrayRow2.f34972n.E2 == SolverVariable.Type.UNRESTRICTED || arrayRow2.J2 || arrayRow2.rl >= f4) {
                                f3 = f4;
                                j2 = j3;
                            } else if (f34976S) {
                                int iJ2 = arrayRow2.f34971O.J2();
                                int i10 = 0;
                                while (i10 < iJ2) {
                                    float f6 = f4;
                                    SolverVariable solverVariableRl = arrayRow2.f34971O.rl(i10);
                                    long j4 = j3;
                                    float fMUb = arrayRow2.f34971O.mUb(solverVariableRl);
                                    if (fMUb > f6) {
                                        for (int i11 = 0; i11 < 9; i11++) {
                                            float f7 = solverVariableRl.f35004S[i11] / fMUb;
                                            if ((f7 < f5 && i11 == i9) || i11 > i9) {
                                                i9 = i11;
                                                i8 = solverVariableRl.f35003O;
                                                i7 = i5;
                                                f5 = f7;
                                            }
                                        }
                                    }
                                    i10++;
                                    f4 = f6;
                                    j3 = j4;
                                }
                                f3 = f4;
                                j2 = j3;
                            } else {
                                f3 = f4;
                                j2 = j3;
                                for (int i12 = 1; i12 < this.qie; i12++) {
                                    SolverVariable solverVariable = this.HI.nr[i12];
                                    float fMUb2 = arrayRow2.f34971O.mUb(solverVariable);
                                    if (fMUb2 > f3) {
                                        for (int i13 = 0; i13 < 9; i13++) {
                                            float f8 = solverVariable.f35004S[i13] / fMUb2;
                                            if ((f8 < f5 && i13 == i9) || i13 > i9) {
                                                i9 = i13;
                                                f5 = f8;
                                                i7 = i5;
                                                i8 = i12;
                                            }
                                        }
                                    }
                                }
                            }
                            i5++;
                            f4 = f3;
                            j3 = j2;
                        }
                        float f9 = f4;
                        long j5 = j3;
                        if (i7 != -1) {
                            ArrayRow arrayRow3 = this.KN[i7];
                            arrayRow3.f34972n.J2 = -1;
                            Metrics metrics2 = aYN;
                            if (metrics2 != null) {
                                metrics2.ty += j5;
                            }
                            arrayRow3.aYN(this.HI.nr[i8]);
                            SolverVariable solverVariable2 = arrayRow3.f34972n;
                            solverVariable2.J2 = i7;
                            solverVariable2.xMQ(this, arrayRow3);
                        } else {
                            z2 = true;
                        }
                        if (i3 > this.qie / 2) {
                            z2 = true;
                        }
                        f4 = f9;
                    }
                    return i3;
                }
            }
        }
        return 0;
    }

    public static Metrics aYN() {
        return aYN;
    }

    private void e() {
        int i2 = 0;
        if (WPU) {
            while (i2 < this.az) {
                ArrayRow arrayRow = this.KN[i2];
                if (arrayRow != null) {
                    this.HI.f34974n.n(arrayRow);
                }
                this.KN[i2] = null;
                i2++;
            }
            return;
        }
        while (i2 < this.az) {
            ArrayRow arrayRow2 = this.KN[i2];
            if (arrayRow2 != null) {
                this.HI.rl.n(arrayRow2);
            }
            this.KN[i2] = null;
            i2++;
        }
    }

    private SolverVariable n(SolverVariable.Type type, String str) {
        SolverVariable solverVariable = (SolverVariable) this.HI.f34975t.acquire();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type, str);
            solverVariable.KN(type, str);
        } else {
            solverVariable.J2();
            solverVariable.KN(type, str);
        }
        int i2 = this.Ik;
        int i3 = this.f34980n;
        if (i2 >= i3) {
            int i5 = i3 * 2;
            this.f34980n = i5;
            this.ck = (SolverVariable[]) Arrays.copyOf(this.ck, i5);
        }
        SolverVariable[] solverVariableArr = this.ck;
        int i7 = this.Ik;
        this.Ik = i7 + 1;
        solverVariableArr[i7] = solverVariable;
        return solverVariable;
    }

    private void qie(ArrayRow arrayRow) {
        int i2;
        if (XQ && arrayRow.J2) {
            arrayRow.f34972n.Uo(this, arrayRow.rl);
        } else {
            ArrayRow[] arrayRowArr = this.KN;
            int i3 = this.az;
            arrayRowArr[i3] = arrayRow;
            SolverVariable solverVariable = arrayRow.f34972n;
            solverVariable.J2 = i3;
            this.az = i3 + 1;
            solverVariable.xMQ(this, arrayRow);
        }
        if (XQ && this.rl) {
            int i5 = 0;
            while (i5 < this.az) {
                if (this.KN[i5] == null) {
                    System.out.println("WTF");
                }
                ArrayRow arrayRow2 = this.KN[i5];
                if (arrayRow2 != null && arrayRow2.J2) {
                    arrayRow2.f34972n.Uo(this, arrayRow2.rl);
                    if (WPU) {
                        this.HI.f34974n.n(arrayRow2);
                    } else {
                        this.HI.rl.n(arrayRow2);
                    }
                    this.KN[i5] = null;
                    int i7 = i5 + 1;
                    int i8 = i7;
                    while (true) {
                        i2 = this.az;
                        if (i7 >= i2) {
                            break;
                        }
                        ArrayRow[] arrayRowArr2 = this.KN;
                        int i9 = i7 - 1;
                        ArrayRow arrayRow3 = arrayRowArr2[i7];
                        arrayRowArr2[i9] = arrayRow3;
                        SolverVariable solverVariable2 = arrayRow3.f34972n;
                        if (solverVariable2.J2 == i7) {
                            solverVariable2.J2 = i9;
                        }
                        i8 = i7;
                        i7++;
                    }
                    if (i8 < i2) {
                        this.KN[i8] = null;
                    }
                    this.az = i2 - 1;
                    i5--;
                }
                i5++;
            }
            this.rl = false;
        }
    }

    private void te() {
        int i2 = this.J2 * 2;
        this.J2 = i2;
        this.KN = (ArrayRow[]) Arrays.copyOf(this.KN, i2);
        Cache cache = this.HI;
        cache.nr = (SolverVariable[]) Arrays.copyOf(cache.nr, this.J2);
        int i3 = this.J2;
        this.gh = new boolean[i3];
        this.Uo = i3;
        this.ty = i3;
        Metrics metrics = aYN;
        if (metrics != null) {
            metrics.KN++;
            metrics.f34989Z = Math.max(metrics.f34989Z, i3);
            Metrics metrics2 = aYN;
            metrics2.E2 = metrics2.f34989Z;
        }
    }

    public SolverVariable HI(int i2, String str) {
        Metrics metrics = aYN;
        if (metrics != null) {
            metrics.Ik++;
        }
        if (this.qie + 1 >= this.Uo) {
            te();
        }
        SolverVariable solverVariableN = n(SolverVariable.Type.ERROR, str);
        int i3 = this.f34982t + 1;
        this.f34982t = i3;
        this.qie++;
        solverVariableN.f35003O = i3;
        solverVariableN.f35012r = i2;
        this.HI.nr[i3] = solverVariableN;
        this.f34979O.t(solverVariableN);
        return solverVariableN;
    }

    public void J2(SolverVariable solverVariable, int i2) {
        Metrics metrics = aYN;
        if (metrics != null) {
            metrics.p5++;
        }
        if (f34977Z && solverVariable.J2 == -1) {
            float f3 = i2;
            solverVariable.Uo(this, f3);
            for (int i3 = 0; i3 < this.f34982t + 1; i3++) {
                SolverVariable solverVariable2 = this.HI.nr[i3];
                if (solverVariable2 != null && solverVariable2.f35002N && solverVariable2.f35014v == solverVariable.f35003O) {
                    solverVariable2.Uo(this, solverVariable2.Xw + f3);
                }
            }
            return;
        }
        int i5 = solverVariable.J2;
        if (i5 == -1) {
            ArrayRow arrayRowR = r();
            arrayRowR.xMQ(solverVariable, i2);
            nr(arrayRowR);
            return;
        }
        ArrayRow arrayRow = this.KN[i5];
        if (arrayRow.J2) {
            arrayRow.rl = i2;
            return;
        }
        if (arrayRow.f34971O.J2() == 0) {
            arrayRow.J2 = true;
            arrayRow.rl = i2;
        } else {
            ArrayRow arrayRowR2 = r();
            arrayRowR2.az(solverVariable, i2);
            nr(arrayRowR2);
        }
    }

    public ArrayRow O(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        Metrics metrics = aYN;
        if (metrics != null) {
            metrics.p5++;
        }
        if (f34977Z && i3 == 8 && solverVariable2.f35007Z && solverVariable.J2 == -1) {
            solverVariable.Uo(this, solverVariable2.f35011o + i2);
            return null;
        }
        ArrayRow arrayRowR = r();
        arrayRowR.ty(solverVariable, solverVariable2, i2);
        if (i3 != 8) {
            arrayRowR.nr(this, i3);
        }
        nr(arrayRowR);
        return arrayRowR;
    }

    public void S(Metrics metrics) {
        aYN = metrics;
    }

    public int ViF() {
        return this.az;
    }

    public Cache WPU() {
        return this.HI;
    }

    public SolverVariable Z() {
        Metrics metrics = aYN;
        if (metrics != null) {
            metrics.f34994r++;
        }
        if (this.qie + 1 >= this.Uo) {
            te();
        }
        SolverVariable solverVariableN = n(SolverVariable.Type.SLACK, null);
        int i2 = this.f34982t + 1;
        this.f34982t = i2;
        this.qie++;
        solverVariableN.f35003O = i2;
        this.HI.nr[i2] = solverVariableN;
        return solverVariableN;
    }

    public SolverVariable ck() {
        Metrics metrics = aYN;
        if (metrics != null) {
            metrics.f34993o++;
        }
        if (this.qie + 1 >= this.Uo) {
            te();
        }
        SolverVariable solverVariableN = n(SolverVariable.Type.SLACK, null);
        int i2 = this.f34982t + 1;
        this.f34982t = i2;
        this.qie++;
        solverVariableN.f35003O = i2;
        this.HI.nr[i2] = solverVariableN;
        return solverVariableN;
    }

    void fD(Row row) {
        Metrics metrics = aYN;
        if (metrics != null) {
            metrics.nY++;
            metrics.f34991g = Math.max(metrics.f34991g, this.qie);
            Metrics metrics2 = aYN;
            metrics2.te = Math.max(metrics2.te, this.az);
        }
        XQ(row);
        E2(row, false);
        ty();
    }

    public int g(Object obj) {
        SolverVariable solverVariableXMQ = ((ConstraintAnchor) obj).xMQ();
        if (solverVariableXMQ != null) {
            return (int) (solverVariableXMQ.f35011o + 0.5f);
        }
        return 0;
    }

    public void iF() {
        Metrics metrics = aYN;
        if (metrics != null) {
            metrics.xMQ++;
        }
        if (this.f34979O.isEmpty()) {
            ty();
            return;
        }
        if (!this.xMQ && !this.mUb) {
            fD(this.f34979O);
            return;
        }
        Metrics metrics2 = aYN;
        if (metrics2 != null) {
            metrics2.f34985S++;
        }
        for (int i2 = 0; i2 < this.az; i2++) {
            if (!this.KN[i2].J2) {
                fD(this.f34979O);
                return;
            }
        }
        Metrics metrics3 = aYN;
        if (metrics3 != null) {
            metrics3.XQ++;
        }
        ty();
    }

    public int nY() {
        return this.f34982t;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void nr(ArrayRow arrayRow) {
        SolverVariable solverVariableS;
        if (arrayRow == null) {
            return;
        }
        Metrics metrics = aYN;
        if (metrics != null) {
            metrics.mUb++;
            if (arrayRow.J2) {
                metrics.gh++;
            }
        }
        boolean z2 = true;
        if (this.az + 1 >= this.ty || this.qie + 1 >= this.Uo) {
            te();
        }
        boolean z3 = false;
        if (!arrayRow.J2) {
            arrayRow.fD(this);
            if (arrayRow.isEmpty()) {
                return;
            }
            arrayRow.r();
            if (arrayRow.J2(this)) {
                SolverVariable solverVariableCk = ck();
                arrayRow.f34972n = solverVariableCk;
                int i2 = this.az;
                qie(arrayRow);
                if (this.az == i2 + 1) {
                    this.f34981r.n(arrayRow);
                    E2(this.f34981r, true);
                    if (solverVariableCk.J2 == -1) {
                        if (arrayRow.f34972n == solverVariableCk && (solverVariableS = arrayRow.S(solverVariableCk)) != null) {
                            Metrics metrics2 = aYN;
                            if (metrics2 != null) {
                                metrics2.ty++;
                            }
                            arrayRow.aYN(solverVariableS);
                        }
                        if (!arrayRow.J2) {
                            arrayRow.f34972n.xMQ(this, arrayRow);
                        }
                        if (WPU) {
                            this.HI.f34974n.n(arrayRow);
                        } else {
                            this.HI.rl.n(arrayRow);
                        }
                        this.az--;
                    }
                } else {
                    z2 = false;
                }
                if (!arrayRow.o()) {
                    return;
                } else {
                    z3 = z2;
                }
            }
        }
        if (z3) {
            return;
        }
        qie(arrayRow);
    }

    public ArrayRow r() {
        ArrayRow arrayRow;
        if (WPU) {
            arrayRow = (ArrayRow) this.HI.f34974n.acquire();
            if (arrayRow == null) {
                arrayRow = new ValuesRow(this.HI);
                nY++;
            } else {
                arrayRow.ViF();
            }
        } else {
            arrayRow = (ArrayRow) this.HI.rl.acquire();
            if (arrayRow == null) {
                arrayRow = new ArrayRow(this.HI);
                ViF++;
            } else {
                arrayRow.ViF();
            }
        }
        SolverVariable.t();
        return arrayRow;
    }

    public void rl(ConstraintWidget constraintWidget, ConstraintWidget constraintWidget2, float f3, int i2) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
        SolverVariable solverVariableIk = Ik(constraintWidget.Ik(type));
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
        SolverVariable solverVariableIk2 = Ik(constraintWidget.Ik(type2));
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
        SolverVariable solverVariableIk3 = Ik(constraintWidget.Ik(type3));
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
        SolverVariable solverVariableIk4 = Ik(constraintWidget.Ik(type4));
        SolverVariable solverVariableIk5 = Ik(constraintWidget2.Ik(type));
        SolverVariable solverVariableIk6 = Ik(constraintWidget2.Ik(type2));
        SolverVariable solverVariableIk7 = Ik(constraintWidget2.Ik(type3));
        SolverVariable solverVariableIk8 = Ik(constraintWidget2.Ik(type4));
        ArrayRow arrayRowR = r();
        double d2 = f3;
        double d4 = i2;
        arrayRowR.Ik(solverVariableIk2, solverVariableIk4, solverVariableIk6, solverVariableIk8, (float) (Math.sin(d2) * d4));
        nr(arrayRowR);
        ArrayRow arrayRowR2 = r();
        arrayRowR2.Ik(solverVariableIk, solverVariableIk3, solverVariableIk5, solverVariableIk7, (float) (Math.cos(d2) * d4));
        nr(arrayRowR2);
    }

    public void t(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, float f3, SolverVariable solverVariable3, SolverVariable solverVariable4, int i3, int i5) {
        ArrayRow arrayRowR = r();
        arrayRowR.KN(solverVariable, solverVariable2, i2, f3, solverVariable3, solverVariable4, i3);
        if (i5 != 8) {
            arrayRowR.nr(this, i5);
        }
        nr(arrayRowR);
    }

    public LinearSystem() {
        e();
        Cache cache = new Cache();
        this.HI = cache;
        this.f34979O = new PriorityGoalRow(cache);
        if (WPU) {
            this.f34981r = new ValuesRow(cache);
        } else {
            this.f34981r = new ArrayRow(cache);
        }
    }

    public static ArrayRow o(LinearSystem linearSystem, SolverVariable solverVariable, SolverVariable solverVariable2, float f3) {
        return linearSystem.r().mUb(solverVariable, solverVariable2, f3);
    }

    public void KN(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        ArrayRow arrayRowR = r();
        SolverVariable solverVariableZ = Z();
        solverVariableZ.f35012r = 0;
        arrayRowR.HI(solverVariable, solverVariable2, solverVariableZ, i2);
        if (i3 != 8) {
            az(arrayRowR, (int) (arrayRowR.f34971O.mUb(solverVariableZ) * (-1.0f)), i3);
        }
        nr(arrayRowR);
    }

    public void Uo(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, boolean z2) {
        ArrayRow arrayRowR = r();
        SolverVariable solverVariableZ = Z();
        solverVariableZ.f35012r = 0;
        arrayRowR.HI(solverVariable, solverVariable2, solverVariableZ, i2);
        nr(arrayRowR);
    }

    public void gh(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f3, int i2) {
        ArrayRow arrayRowR = r();
        arrayRowR.gh(solverVariable, solverVariable2, solverVariable3, solverVariable4, f3);
        if (i2 != 8) {
            arrayRowR.nr(this, i2);
        }
        nr(arrayRowR);
    }

    public void mUb(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, int i3) {
        ArrayRow arrayRowR = r();
        SolverVariable solverVariableZ = Z();
        solverVariableZ.f35012r = 0;
        arrayRowR.ck(solverVariable, solverVariable2, solverVariableZ, i2);
        if (i3 != 8) {
            az(arrayRowR, (int) (arrayRowR.f34971O.mUb(solverVariableZ) * (-1.0f)), i3);
        }
        nr(arrayRowR);
    }

    public void xMQ(SolverVariable solverVariable, SolverVariable solverVariable2, int i2, boolean z2) {
        ArrayRow arrayRowR = r();
        SolverVariable solverVariableZ = Z();
        solverVariableZ.f35012r = 0;
        arrayRowR.ck(solverVariable, solverVariable2, solverVariableZ, i2);
        nr(arrayRowR);
    }
}
