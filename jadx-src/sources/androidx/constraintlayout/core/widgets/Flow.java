package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Flow extends VirtualLayout {
    private ConstraintWidget[] I9f;
    private int xVH = -1;
    private int EF = -1;
    private int uG = -1;
    private int Vvq = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f35543y = -1;
    private int Zn = -1;
    private float nO = 0.5f;
    private float vl = 0.5f;
    private float v0j = 0.5f;
    private float o9 = 0.5f;
    private float n7b = 0.5f;
    private float Aum = 0.5f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f35542s = 0;
    private int Lp6 = 0;
    private int g6 = 2;
    private int Mh = 2;
    private int jO = 0;
    private int Toy = -1;
    private int wKp = 0;
    private ArrayList Th = new ArrayList();
    private ConstraintWidget[] xzo = null;
    private ConstraintWidget[] XNZ = null;
    private int[] lNy = null;
    private int D76 = 0;

    private class WidgetsList {
        private int Ik;
        private ConstraintAnchor J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private ConstraintAnchor f35544O;
        private ConstraintAnchor Uo;
        private int gh;
        private int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f35545n;
        private ConstraintAnchor nr;
        private int xMQ;
        private ConstraintWidget rl = null;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f35547t = 0;
        private int qie = 0;
        private int az = 0;
        private int ty = 0;
        private int HI = 0;
        private int ck = 0;

        private void KN() {
            this.qie = 0;
            this.az = 0;
            this.rl = null;
            this.f35547t = 0;
            int i2 = this.HI;
            for (int i3 = 0; i3 < i2 && this.ty + i3 < Flow.this.D76; i3++) {
                ConstraintWidget constraintWidget = Flow.this.I9f[this.ty + i3];
                if (this.f35545n == 0) {
                    int iJ = constraintWidget.J();
                    int i5 = Flow.this.f35542s;
                    if (constraintWidget.B() == 8) {
                        i5 = 0;
                    }
                    this.qie += iJ + i5;
                    int iHE = Flow.this.HE(constraintWidget, this.Ik);
                    if (this.rl == null || this.f35547t < iHE) {
                        this.rl = constraintWidget;
                        this.f35547t = iHE;
                        this.az = iHE;
                    }
                } else {
                    int iFW = Flow.this.fW(constraintWidget, this.Ik);
                    int iHE2 = Flow.this.HE(constraintWidget, this.Ik);
                    int i7 = Flow.this.Lp6;
                    if (constraintWidget.B() == 8) {
                        i7 = 0;
                    }
                    this.az += iHE2 + i7;
                    if (this.rl == null || this.f35547t < iFW) {
                        this.rl = constraintWidget;
                        this.f35547t = iFW;
                        this.qie = iFW;
                    }
                }
            }
        }

        public void t() {
            this.f35547t = 0;
            this.rl = null;
            this.qie = 0;
            this.az = 0;
            this.ty = 0;
            this.HI = 0;
            this.ck = 0;
        }

        WidgetsList(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3) {
            this.KN = 0;
            this.xMQ = 0;
            this.mUb = 0;
            this.gh = 0;
            this.Ik = 0;
            this.f35545n = i2;
            this.nr = constraintAnchor;
            this.f35544O = constraintAnchor2;
            this.J2 = constraintAnchor3;
            this.Uo = constraintAnchor4;
            this.KN = Flow.this.lNy();
            this.xMQ = Flow.this.D76();
            this.mUb = Flow.this.I9f();
            this.gh = Flow.this.XNZ();
            this.Ik = i3;
        }

        public int J2() {
            return this.f35545n == 0 ? this.qie - Flow.this.f35542s : this.qie;
        }

        public int O() {
            return this.f35545n == 1 ? this.az - Flow.this.Lp6 : this.az;
        }

        public void Uo(int i2) {
            int i3 = this.ck;
            if (i3 == 0) {
                return;
            }
            int i5 = this.HI;
            int i7 = i2 / i3;
            for (int i8 = 0; i8 < i5 && this.ty + i8 < Flow.this.D76; i8++) {
                ConstraintWidget constraintWidget = Flow.this.I9f[this.ty + i8];
                if (this.f35545n == 0) {
                    if (constraintWidget != null && constraintWidget.iF() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.WPU == 0) {
                        Flow.this.QgZ(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i7, constraintWidget.M(), constraintWidget.nY());
                    }
                } else if (constraintWidget != null && constraintWidget.M() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.aYN == 0) {
                    int i9 = i7;
                    Flow.this.QgZ(constraintWidget, constraintWidget.iF(), constraintWidget.J(), ConstraintWidget.DimensionBehaviour.FIXED, i9);
                    i7 = i9;
                }
            }
            KN();
        }

        public void mUb(int i2, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i3, int i5, int i7, int i8, int i9) {
            this.f35545n = i2;
            this.nr = constraintAnchor;
            this.f35544O = constraintAnchor2;
            this.J2 = constraintAnchor3;
            this.Uo = constraintAnchor4;
            this.KN = i3;
            this.xMQ = i5;
            this.mUb = i7;
            this.gh = i8;
            this.Ik = i9;
        }

        public void nr(boolean z2, int i2, boolean z3) {
            ConstraintWidget constraintWidget;
            int i3;
            char c2;
            float f3;
            float f4;
            int i5 = this.HI;
            for (int i7 = 0; i7 < i5 && this.ty + i7 < Flow.this.D76; i7++) {
                ConstraintWidget constraintWidget2 = Flow.this.I9f[this.ty + i7];
                if (constraintWidget2 != null) {
                    constraintWidget2.Rl();
                }
            }
            if (i5 == 0 || this.rl == null) {
                return;
            }
            boolean z4 = z3 && i2 == 0;
            int i8 = -1;
            int i9 = -1;
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = z2 ? (i5 - 1) - i10 : i10;
                if (this.ty + i11 >= Flow.this.D76) {
                    break;
                }
                ConstraintWidget constraintWidget3 = Flow.this.I9f[this.ty + i11];
                if (constraintWidget3 != null && constraintWidget3.B() == 0) {
                    if (i8 == -1) {
                        i8 = i10;
                    }
                    i9 = i10;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.f35545n != 0) {
                ConstraintWidget constraintWidget5 = this.rl;
                constraintWidget5.QZ6(Flow.this.xVH);
                int i12 = this.KN;
                if (i2 > 0) {
                    i12 += Flow.this.f35542s;
                }
                if (z2) {
                    constraintWidget5.P5.n(this.J2, i12);
                    if (z3) {
                        constraintWidget5.jB.n(this.nr, this.mUb);
                    }
                    if (i2 > 0) {
                        this.J2.nr.jB.n(constraintWidget5.P5, 0);
                    }
                } else {
                    constraintWidget5.jB.n(this.nr, i12);
                    if (z3) {
                        constraintWidget5.P5.n(this.J2, this.mUb);
                    }
                    if (i2 > 0) {
                        this.nr.nr.P5.n(constraintWidget5.jB, 0);
                    }
                }
                for (int i13 = 0; i13 < i5 && this.ty + i13 < Flow.this.D76; i13++) {
                    ConstraintWidget constraintWidget6 = Flow.this.I9f[this.ty + i13];
                    if (constraintWidget6 != null) {
                        if (i13 == 0) {
                            constraintWidget6.qie(constraintWidget6.f35517U, this.f35544O, this.xMQ);
                            int i14 = Flow.this.EF;
                            float f5 = Flow.this.vl;
                            if (this.ty == 0 && Flow.this.Vvq != -1) {
                                i14 = Flow.this.Vvq;
                                f5 = Flow.this.o9;
                            } else if (z3 && Flow.this.Zn != -1) {
                                i14 = Flow.this.Zn;
                                f5 = Flow.this.Aum;
                            }
                            constraintWidget6.EF(i14);
                            constraintWidget6.xVH(f5);
                        }
                        if (i13 == i5 - 1) {
                            constraintWidget6.qie(constraintWidget6.M7, this.Uo, this.gh);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.f35517U.n(constraintWidget4.M7, Flow.this.Lp6);
                            if (i13 == i8) {
                                constraintWidget6.f35517U.XQ(this.xMQ);
                            }
                            constraintWidget4.M7.n(constraintWidget6.f35517U, 0);
                            if (i13 == i9 + 1) {
                                constraintWidget4.M7.XQ(this.gh);
                            }
                        }
                        if (constraintWidget6 == constraintWidget5) {
                            constraintWidget4 = constraintWidget6;
                        } else if (z2) {
                            int i15 = Flow.this.g6;
                            if (i15 == 0) {
                                constraintWidget6.P5.n(constraintWidget5.P5, 0);
                            } else if (i15 == 1) {
                                constraintWidget6.jB.n(constraintWidget5.jB, 0);
                            } else if (i15 == 2) {
                                constraintWidget6.jB.n(constraintWidget5.jB, 0);
                                constraintWidget6.P5.n(constraintWidget5.P5, 0);
                            }
                            constraintWidget4 = constraintWidget6;
                        } else {
                            int i16 = Flow.this.g6;
                            if (i16 == 0) {
                                constraintWidget6.jB.n(constraintWidget5.jB, 0);
                            } else if (i16 == 1) {
                                constraintWidget6.P5.n(constraintWidget5.P5, 0);
                            } else if (i16 == 2) {
                                if (z4) {
                                    constraintWidget6.jB.n(this.nr, this.KN);
                                    constraintWidget6.P5.n(this.J2, this.mUb);
                                } else {
                                    constraintWidget6.jB.n(constraintWidget5.jB, 0);
                                    constraintWidget6.P5.n(constraintWidget5.P5, 0);
                                }
                            }
                            constraintWidget4 = constraintWidget6;
                        }
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.rl;
            constraintWidget7.EF(Flow.this.EF);
            int i17 = this.xMQ;
            if (i2 > 0) {
                i17 += Flow.this.Lp6;
            }
            constraintWidget7.f35517U.n(this.f35544O, i17);
            if (z3) {
                constraintWidget7.M7.n(this.Uo, this.gh);
            }
            if (i2 > 0) {
                this.f35544O.nr.M7.n(constraintWidget7.f35517U, 0);
            }
            char c4 = 3;
            if (Flow.this.Mh != 3 || constraintWidget7.I()) {
                constraintWidget = constraintWidget7;
            } else {
                for (int i18 = 0; i18 < i5; i18++) {
                    int i19 = z2 ? (i5 - 1) - i18 : i18;
                    if (this.ty + i19 >= Flow.this.D76) {
                        break;
                    }
                    constraintWidget = Flow.this.I9f[this.ty + i19];
                    if (constraintWidget.I()) {
                        break;
                    }
                }
                constraintWidget = constraintWidget7;
            }
            int i20 = 0;
            while (i20 < i5) {
                int i21 = z2 ? (i5 - 1) - i20 : i20;
                if (this.ty + i21 >= Flow.this.D76) {
                    return;
                }
                ConstraintWidget constraintWidget8 = Flow.this.I9f[this.ty + i21];
                if (constraintWidget8 == null) {
                    constraintWidget8 = constraintWidget4;
                    c2 = c4;
                } else {
                    if (i20 == 0) {
                        i3 = 1;
                        constraintWidget8.qie(constraintWidget8.jB, this.nr, this.KN);
                    } else {
                        i3 = 1;
                    }
                    if (i21 == 0) {
                        int i22 = Flow.this.xVH;
                        float f6 = Flow.this.nO;
                        if (z2) {
                            f6 = 1.0f - f6;
                        }
                        if (this.ty != 0 || Flow.this.uG == -1) {
                            if (z3 && Flow.this.f35543y != -1) {
                                i22 = Flow.this.f35543y;
                                if (z2) {
                                    f4 = Flow.this.n7b;
                                    f3 = 1.0f - f4;
                                    f6 = f3;
                                } else {
                                    f3 = Flow.this.n7b;
                                    f6 = f3;
                                }
                            }
                            constraintWidget8.QZ6(i22);
                            constraintWidget8.F(f6);
                        } else {
                            i22 = Flow.this.uG;
                            if (z2) {
                                f4 = Flow.this.v0j;
                                f3 = 1.0f - f4;
                                f6 = f3;
                                constraintWidget8.QZ6(i22);
                                constraintWidget8.F(f6);
                            } else {
                                f3 = Flow.this.v0j;
                                f6 = f3;
                                constraintWidget8.QZ6(i22);
                                constraintWidget8.F(f6);
                            }
                        }
                    }
                    if (i20 == i5 - 1) {
                        constraintWidget8.qie(constraintWidget8.P5, this.J2, this.mUb);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.jB.n(constraintWidget4.P5, Flow.this.f35542s);
                        if (i20 == i8) {
                            constraintWidget8.jB.XQ(this.KN);
                        }
                        constraintWidget4.P5.n(constraintWidget8.jB, 0);
                        if (i20 == i9 + 1) {
                            constraintWidget4.P5.XQ(this.mUb);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        c2 = 3;
                        if (Flow.this.Mh == 3 && constraintWidget.I() && constraintWidget8 != constraintWidget && constraintWidget8.I()) {
                            constraintWidget8.p5.n(constraintWidget.p5, 0);
                        } else {
                            int i23 = Flow.this.Mh;
                            if (i23 == 0) {
                                constraintWidget8.f35517U.n(constraintWidget7.f35517U, 0);
                            } else if (i23 == i3) {
                                constraintWidget8.M7.n(constraintWidget7.M7, 0);
                            } else if (z4) {
                                constraintWidget8.f35517U.n(this.f35544O, this.xMQ);
                                constraintWidget8.M7.n(this.Uo, this.gh);
                            } else {
                                constraintWidget8.f35517U.n(constraintWidget7.f35517U, 0);
                                constraintWidget8.M7.n(constraintWidget7.M7, 0);
                            }
                        }
                    } else {
                        c2 = 3;
                    }
                }
                i20++;
                c4 = c2;
                constraintWidget4 = constraintWidget8;
            }
        }

        public void rl(ConstraintWidget constraintWidget) {
            if (this.f35545n == 0) {
                int iFW = Flow.this.fW(constraintWidget, this.Ik);
                if (constraintWidget.iF() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.ck++;
                    iFW = 0;
                }
                this.qie += iFW + (constraintWidget.B() != 8 ? Flow.this.f35542s : 0);
                int iHE = Flow.this.HE(constraintWidget, this.Ik);
                if (this.rl == null || this.f35547t < iHE) {
                    this.rl = constraintWidget;
                    this.f35547t = iHE;
                    this.az = iHE;
                }
            } else {
                int iFW2 = Flow.this.fW(constraintWidget, this.Ik);
                int iHE2 = Flow.this.HE(constraintWidget, this.Ik);
                if (constraintWidget.M() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.ck++;
                    iHE2 = 0;
                }
                this.az += iHE2 + (constraintWidget.B() != 8 ? Flow.this.Lp6 : 0);
                if (this.rl == null || this.f35547t < iFW2) {
                    this.rl = constraintWidget;
                    this.f35547t = iFW2;
                    this.qie = iFW2;
                }
            }
            this.HI++;
        }

        public void xMQ(int i2) {
            this.ty = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int HE(ConstraintWidget constraintWidget, int i2) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.M() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = constraintWidget.aYN;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i5 = (int) (constraintWidget.E2 * i2);
                if (i5 != constraintWidget.nY()) {
                    constraintWidget.HBN(true);
                    QgZ(constraintWidget, constraintWidget.iF(), constraintWidget.J(), ConstraintWidget.DimensionBehaviour.FIXED, i5);
                }
                return i5;
            }
            constraintWidget2 = constraintWidget;
            if (i3 == 1) {
                return constraintWidget2.nY();
            }
            if (i3 == 3) {
                return (int) ((constraintWidget2.J() * constraintWidget2.Nxk) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.nY();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c32(ConstraintWidget[] constraintWidgetArr, int i2, int i3, int i5, int[] iArr) {
        int iCeil;
        int iCeil2;
        ConstraintWidget constraintWidget;
        if (i3 == 0) {
            int i7 = this.Toy;
            if (i7 <= 0) {
                i7 = 0;
                int iFW = 0;
                for (int i8 = 0; i8 < i2; i8++) {
                    if (i8 > 0) {
                        iFW += this.f35542s;
                    }
                    ConstraintWidget constraintWidget2 = constraintWidgetArr[i8];
                    if (constraintWidget2 != null) {
                        iFW += fW(constraintWidget2, i5);
                        if (iFW > i5) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                }
            }
            iCeil2 = i7;
            iCeil = 0;
        } else {
            iCeil = this.Toy;
            if (iCeil <= 0) {
                iCeil = 0;
                int iHE = 0;
                for (int i9 = 0; i9 < i2; i9++) {
                    if (i9 > 0) {
                        iHE += this.Lp6;
                    }
                    ConstraintWidget constraintWidget3 = constraintWidgetArr[i9];
                    if (constraintWidget3 != null) {
                        iHE += HE(constraintWidget3, i5);
                        if (iHE > i5) {
                            break;
                        } else {
                            iCeil++;
                        }
                    }
                }
            }
            iCeil2 = 0;
        }
        if (this.lNy == null) {
            this.lNy = new int[2];
        }
        boolean z2 = (iCeil == 0 && i3 == 1) || (iCeil2 == 0 && i3 == 0);
        while (!z2) {
            if (i3 == 0) {
                iCeil = (int) Math.ceil(i2 / iCeil2);
            } else {
                iCeil2 = (int) Math.ceil(i2 / iCeil);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.XNZ;
            if (constraintWidgetArr2 == null || constraintWidgetArr2.length < iCeil2) {
                this.XNZ = new ConstraintWidget[iCeil2];
            } else {
                Arrays.fill(constraintWidgetArr2, (Object) null);
            }
            ConstraintWidget[] constraintWidgetArr3 = this.xzo;
            if (constraintWidgetArr3 == null || constraintWidgetArr3.length < iCeil) {
                this.xzo = new ConstraintWidget[iCeil];
            } else {
                Arrays.fill(constraintWidgetArr3, (Object) null);
            }
            for (int i10 = 0; i10 < iCeil2; i10++) {
                for (int i11 = 0; i11 < iCeil; i11++) {
                    int i12 = (i11 * iCeil2) + i10;
                    if (i3 == 1) {
                        i12 = (i10 * iCeil) + i11;
                    }
                    if (i12 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i12]) != null) {
                        int iFW2 = fW(constraintWidget, i5);
                        ConstraintWidget constraintWidget4 = this.XNZ[i10];
                        if (constraintWidget4 == null || constraintWidget4.J() < iFW2) {
                            this.XNZ[i10] = constraintWidget;
                        }
                        int iHE2 = HE(constraintWidget, i5);
                        ConstraintWidget constraintWidget5 = this.xzo[i11];
                        if (constraintWidget5 == null || constraintWidget5.nY() < iHE2) {
                            this.xzo[i11] = constraintWidget;
                        }
                    }
                }
            }
            int iFW3 = 0;
            for (int i13 = 0; i13 < iCeil2; i13++) {
                ConstraintWidget constraintWidget6 = this.XNZ[i13];
                if (constraintWidget6 != null) {
                    if (i13 > 0) {
                        iFW3 += this.f35542s;
                    }
                    iFW3 += fW(constraintWidget6, i5);
                }
            }
            int iHE3 = 0;
            for (int i14 = 0; i14 < iCeil; i14++) {
                ConstraintWidget constraintWidget7 = this.xzo[i14];
                if (constraintWidget7 != null) {
                    if (i14 > 0) {
                        iHE3 += this.Lp6;
                    }
                    iHE3 += HE(constraintWidget7, i5);
                }
            }
            iArr[0] = iFW3;
            iArr[1] = iHE3;
            if (i3 != 0) {
                if (iHE3 > i5 && iCeil > 1) {
                    iCeil--;
                }
            } else if (iFW3 > i5 && iCeil2 > 1) {
                iCeil2--;
            }
            while (!z2) {
            }
        }
        int[] iArr2 = this.lNy;
        iArr2[0] = iCeil2;
        iArr2[1] = iCeil;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int fW(ConstraintWidget constraintWidget, int i2) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.iF() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i3 = constraintWidget.WPU;
            if (i3 == 0) {
                return 0;
            }
            if (i3 == 2) {
                int i5 = (int) (constraintWidget.te * i2);
                if (i5 != constraintWidget.J()) {
                    constraintWidget.HBN(true);
                    QgZ(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i5, constraintWidget.M(), constraintWidget.nY());
                }
                return i5;
            }
            constraintWidget2 = constraintWidget;
            if (i3 == 1) {
                return constraintWidget2.J();
            }
            if (i3 == 3) {
                return (int) ((constraintWidget2.nY() * constraintWidget2.Nxk) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.J();
    }

    private void Lu(boolean z2) {
        ConstraintWidget constraintWidget;
        float f3;
        int i2;
        if (this.lNy == null || this.XNZ == null || this.xzo == null) {
            return;
        }
        for (int i3 = 0; i3 < this.D76; i3++) {
            this.I9f[i3].Rl();
        }
        int[] iArr = this.lNy;
        int i5 = iArr[0];
        int i7 = iArr[1];
        float f4 = this.nO;
        ConstraintWidget constraintWidget2 = null;
        int i8 = 0;
        while (i8 < i5) {
            if (z2) {
                i2 = (i5 - i8) - 1;
                f3 = 1.0f - this.nO;
            } else {
                f3 = f4;
                i2 = i8;
            }
            ConstraintWidget constraintWidget3 = this.XNZ[i2];
            if (constraintWidget3 != null && constraintWidget3.B() != 8) {
                if (i8 == 0) {
                    constraintWidget3.qie(constraintWidget3.jB, this.jB, lNy());
                    constraintWidget3.QZ6(this.xVH);
                    constraintWidget3.F(f3);
                }
                if (i8 == i5 - 1) {
                    constraintWidget3.qie(constraintWidget3.P5, this.P5, I9f());
                }
                if (i8 > 0 && constraintWidget2 != null) {
                    constraintWidget3.qie(constraintWidget3.jB, constraintWidget2.P5, this.f35542s);
                    constraintWidget2.qie(constraintWidget2.P5, constraintWidget3.jB, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i8++;
            f4 = f3;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            ConstraintWidget constraintWidget4 = this.xzo[i9];
            if (constraintWidget4 != null && constraintWidget4.B() != 8) {
                if (i9 == 0) {
                    constraintWidget4.qie(constraintWidget4.f35517U, this.f35517U, D76());
                    constraintWidget4.EF(this.EF);
                    constraintWidget4.xVH(this.vl);
                }
                if (i9 == i7 - 1) {
                    constraintWidget4.qie(constraintWidget4.M7, this.M7, XNZ());
                }
                if (i9 > 0 && constraintWidget2 != null) {
                    constraintWidget4.qie(constraintWidget4.f35517U, constraintWidget2.M7, this.Lp6);
                    constraintWidget2.qie(constraintWidget2.M7, constraintWidget4.f35517U, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i10 = 0; i10 < i5; i10++) {
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = (i11 * i5) + i10;
                if (this.wKp == 1) {
                    i12 = (i10 * i7) + i11;
                }
                ConstraintWidget[] constraintWidgetArr = this.I9f;
                if (i12 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i12]) != null && constraintWidget.B() != 8) {
                    ConstraintWidget constraintWidget5 = this.XNZ[i10];
                    ConstraintWidget constraintWidget6 = this.xzo[i11];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.qie(constraintWidget.jB, constraintWidget5.jB, 0);
                        constraintWidget.qie(constraintWidget.P5, constraintWidget5.P5, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.qie(constraintWidget.f35517U, constraintWidget6.f35517U, 0);
                        constraintWidget.qie(constraintWidget.M7, constraintWidget6.M7, 0);
                    }
                }
            }
        }
    }

    private void Om(ConstraintWidget[] constraintWidgetArr, int i2, int i3, int i5, int[] iArr) {
        int i7;
        Flow flow;
        int i8;
        boolean z2;
        ConstraintAnchor constraintAnchor;
        int i9;
        Flow flow2 = this;
        if (i2 == 0) {
            return;
        }
        flow2.Th.clear();
        int i10 = i5;
        WidgetsList widgetsList = flow2.new WidgetsList(i3, flow2.jB, flow2.f35517U, flow2.P5, flow2.M7, i10);
        flow2.Th.add(widgetsList);
        boolean z3 = true;
        if (i3 == 0) {
            int i11 = 0;
            i7 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i13 < i2) {
                i11++;
                ConstraintWidget constraintWidget = constraintWidgetArr[i13];
                int iFW = flow2.fW(constraintWidget, i10);
                if (constraintWidget.iF() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i14 = i7;
                boolean z4 = (i12 == i10 || (flow2.f35542s + i12) + iFW > i10) && widgetsList.rl != null;
                if (!z4 && i13 > 0 && (i9 = flow2.Toy) > 0 && i11 > i9) {
                    z4 = true;
                }
                if (z4) {
                    widgetsList = flow2.new WidgetsList(i3, flow2.jB, flow2.f35517U, flow2.P5, flow2.M7, i10);
                    widgetsList.xMQ(i13);
                    flow2.Th.add(widgetsList);
                    i11 = 1;
                } else {
                    if (i13 > 0) {
                        i12 += flow2.f35542s + iFW;
                    }
                    widgetsList.rl(constraintWidget);
                    i13++;
                    i7 = i14;
                }
                i12 = iFW;
                widgetsList.rl(constraintWidget);
                i13++;
                i7 = i14;
            }
        } else {
            int i15 = 0;
            i7 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i17 < i2) {
                i15++;
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i17];
                int iHE = flow2.HE(constraintWidget2, i10);
                if (constraintWidget2.M() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i18 = i7;
                boolean z5 = (i16 == i10 || (flow2.Lp6 + i16) + iHE > i10) && widgetsList.rl != null;
                if (!z5 && i17 > 0 && (i8 = flow2.Toy) > 0 && i15 > i8) {
                    z5 = true;
                }
                if (z5) {
                    widgetsList = flow2.new WidgetsList(i3, flow2.jB, flow2.f35517U, flow2.P5, flow2.M7, i10);
                    flow = flow2;
                    widgetsList.xMQ(i17);
                    flow.Th.add(widgetsList);
                    i15 = 1;
                } else {
                    flow = flow2;
                    if (i17 > 0) {
                        i16 += flow.Lp6 + iHE;
                    }
                    widgetsList.rl(constraintWidget2);
                    i17++;
                    i10 = i5;
                    i7 = i18;
                    flow2 = flow;
                }
                i16 = iHE;
                widgetsList.rl(constraintWidget2);
                i17++;
                i10 = i5;
                i7 = i18;
                flow2 = flow;
            }
        }
        Flow flow3 = flow2;
        int size = flow3.Th.size();
        ConstraintAnchor constraintAnchor2 = flow3.jB;
        ConstraintAnchor constraintAnchor3 = flow3.f35517U;
        ConstraintAnchor constraintAnchor4 = flow3.P5;
        ConstraintAnchor constraintAnchor5 = flow3.M7;
        int iLNy = flow3.lNy();
        int iD76 = flow3.D76();
        int iI9f = flow3.I9f();
        int iXNZ = flow3.XNZ();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourIF = flow3.iF();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z6 = dimensionBehaviourIF == dimensionBehaviour || flow3.M() == dimensionBehaviour;
        if (i7 > 0 && z6) {
            for (int i19 = 0; i19 < size; i19++) {
                WidgetsList widgetsList2 = (WidgetsList) flow3.Th.get(i19);
                if (i3 == 0) {
                    widgetsList2.Uo(i5 - widgetsList2.J2());
                } else {
                    widgetsList2.Uo(i5 - widgetsList2.O());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor3;
        int iXNZ2 = iXNZ;
        int i20 = 0;
        int i21 = 0;
        int iI9f2 = iI9f;
        int i22 = iD76;
        int i23 = iLNy;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor2;
        int i24 = 0;
        while (i21 < size) {
            WidgetsList widgetsList3 = (WidgetsList) flow3.Th.get(i21);
            if (i3 == 0) {
                if (i21 < size - 1) {
                    constraintAnchor7 = ((WidgetsList) flow3.Th.get(i21 + 1)).rl.f35517U;
                    iXNZ2 = 0;
                } else {
                    constraintAnchor7 = flow3.M7;
                    iXNZ2 = flow3.XNZ();
                }
                ConstraintAnchor constraintAnchor10 = widgetsList3.rl.M7;
                z2 = z3;
                int i25 = i20;
                widgetsList3.mUb(i3, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i23, i22, iI9f2, iXNZ2, i5);
                int iMax = Math.max(i24, widgetsList3.J2());
                int iO = widgetsList3.O() + i25;
                if (i21 > 0) {
                    iO += flow3.Lp6;
                }
                i20 = iO;
                i24 = iMax;
                constraintAnchor6 = constraintAnchor10;
                i22 = 0;
            } else {
                int i26 = i20;
                z2 = z3;
                int i27 = i24;
                if (i21 < size - 1) {
                    constraintAnchor = ((WidgetsList) flow3.Th.get(i21 + 1)).rl.jB;
                    iI9f2 = 0;
                } else {
                    constraintAnchor = flow3.P5;
                    iI9f2 = flow3.I9f();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = widgetsList3.rl.P5;
                widgetsList3.mUb(i3, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i23, i22, iI9f2, iXNZ2, i5);
                int iJ2 = widgetsList3.J2() + i27;
                int iMax2 = Math.max(i26, widgetsList3.O());
                if (i21 > 0) {
                    iJ2 += flow3.f35542s;
                }
                int i28 = iJ2;
                i20 = iMax2;
                i24 = i28;
                i23 = 0;
                constraintAnchor9 = constraintAnchor11;
            }
            i21++;
            z3 = z2;
        }
        iArr[0] = i24;
        iArr[z3 ? 1 : 0] = i20;
    }

    private void l2(ConstraintWidget[] constraintWidgetArr, int i2, int i3, int i5, int[] iArr) {
        int i7;
        Flow flow;
        int i8;
        ConstraintAnchor constraintAnchor;
        int i9;
        Flow flow2 = this;
        if (i2 == 0) {
            return;
        }
        flow2.Th.clear();
        int i10 = i5;
        WidgetsList widgetsList = flow2.new WidgetsList(i3, flow2.jB, flow2.f35517U, flow2.P5, flow2.M7, i10);
        flow2.Th.add(widgetsList);
        if (i3 == 0) {
            i7 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i2) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i12];
                int iFW = flow2.fW(constraintWidget, i10);
                if (constraintWidget.iF() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i13 = i7;
                boolean z2 = (i11 == i10 || (flow2.f35542s + i11) + iFW > i10) && widgetsList.rl != null;
                if (!z2 && i12 > 0 && (i9 = flow2.Toy) > 0 && i12 % i9 == 0) {
                    z2 = true;
                }
                if (z2) {
                    widgetsList = flow2.new WidgetsList(i3, flow2.jB, flow2.f35517U, flow2.P5, flow2.M7, i10);
                    widgetsList.xMQ(i12);
                    flow2.Th.add(widgetsList);
                } else {
                    if (i12 > 0) {
                        i11 += flow2.f35542s + iFW;
                    }
                    widgetsList.rl(constraintWidget);
                    i12++;
                    i7 = i13;
                }
                i11 = iFW;
                widgetsList.rl(constraintWidget);
                i12++;
                i7 = i13;
            }
        } else {
            i7 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i15 < i2) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i15];
                int iHE = flow2.HE(constraintWidget2, i10);
                if (constraintWidget2.M() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i7++;
                }
                int i16 = i7;
                boolean z3 = (i14 == i10 || (flow2.Lp6 + i14) + iHE > i10) && widgetsList.rl != null;
                if (!z3 && i15 > 0 && (i8 = flow2.Toy) > 0 && i15 % i8 == 0) {
                    z3 = true;
                }
                if (z3) {
                    widgetsList = flow2.new WidgetsList(i3, flow2.jB, flow2.f35517U, flow2.P5, flow2.M7, i10);
                    flow = flow2;
                    widgetsList.xMQ(i15);
                    flow.Th.add(widgetsList);
                } else {
                    flow = flow2;
                    if (i15 > 0) {
                        i14 += flow.Lp6 + iHE;
                    }
                    widgetsList.rl(constraintWidget2);
                    i15++;
                    i10 = i5;
                    i7 = i16;
                    flow2 = flow;
                }
                i14 = iHE;
                widgetsList.rl(constraintWidget2);
                i15++;
                i10 = i5;
                i7 = i16;
                flow2 = flow;
            }
        }
        Flow flow3 = flow2;
        int size = flow3.Th.size();
        ConstraintAnchor constraintAnchor2 = flow3.jB;
        ConstraintAnchor constraintAnchor3 = flow3.f35517U;
        ConstraintAnchor constraintAnchor4 = flow3.P5;
        ConstraintAnchor constraintAnchor5 = flow3.M7;
        int iLNy = flow3.lNy();
        int iD76 = flow3.D76();
        int iI9f = flow3.I9f();
        int iXNZ = flow3.XNZ();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourIF = flow3.iF();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z4 = dimensionBehaviourIF == dimensionBehaviour || flow3.M() == dimensionBehaviour;
        if (i7 > 0 && z4) {
            for (int i17 = 0; i17 < size; i17++) {
                WidgetsList widgetsList2 = (WidgetsList) flow3.Th.get(i17);
                if (i3 == 0) {
                    widgetsList2.Uo(i5 - widgetsList2.J2());
                } else {
                    widgetsList2.Uo(i5 - widgetsList2.O());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor2;
        int iXNZ2 = iXNZ;
        int i18 = 0;
        int iI9f2 = iI9f;
        int i19 = iD76;
        int i20 = iLNy;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor3;
        int i21 = 0;
        for (int i22 = 0; i22 < size; i22++) {
            WidgetsList widgetsList3 = (WidgetsList) flow3.Th.get(i22);
            if (i3 == 0) {
                if (i22 < size - 1) {
                    constraintAnchor7 = ((WidgetsList) flow3.Th.get(i22 + 1)).rl.f35517U;
                    iXNZ2 = 0;
                } else {
                    constraintAnchor7 = flow3.M7;
                    iXNZ2 = flow3.XNZ();
                }
                ConstraintAnchor constraintAnchor10 = widgetsList3.rl.M7;
                int i23 = i21;
                widgetsList3.mUb(i3, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i20, i19, iI9f2, iXNZ2, i5);
                int iMax = Math.max(i18, widgetsList3.J2());
                int iO = widgetsList3.O() + i23;
                if (i22 > 0) {
                    iO += flow3.Lp6;
                }
                i21 = iO;
                i18 = iMax;
                constraintAnchor9 = constraintAnchor10;
                i19 = 0;
            } else {
                int i24 = i18;
                int i25 = i21;
                if (i22 < size - 1) {
                    constraintAnchor = ((WidgetsList) flow3.Th.get(i22 + 1)).rl.jB;
                    iI9f2 = 0;
                } else {
                    constraintAnchor = flow3.P5;
                    iI9f2 = flow3.I9f();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = widgetsList3.rl.P5;
                widgetsList3.mUb(i3, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i20, i19, iI9f2, iXNZ2, i5);
                int iJ2 = widgetsList3.J2() + i24;
                int iMax2 = Math.max(i25, widgetsList3.O());
                if (i22 > 0) {
                    iJ2 += flow3.f35542s;
                }
                int i26 = iJ2;
                i21 = iMax2;
                i18 = i26;
                i20 = 0;
                constraintAnchor6 = constraintAnchor11;
            }
        }
        iArr[0] = i18;
        iArr[1] = i21;
    }

    private void t1J(ConstraintWidget[] constraintWidgetArr, int i2, int i3, int i5, int[] iArr) {
        WidgetsList widgetsList;
        if (i2 == 0) {
            return;
        }
        if (this.Th.size() == 0) {
            widgetsList = new WidgetsList(i3, this.jB, this.f35517U, this.P5, this.M7, i5);
            this.Th.add(widgetsList);
        } else {
            WidgetsList widgetsList2 = (WidgetsList) this.Th.get(0);
            widgetsList2.t();
            widgetsList2.mUb(i3, this.jB, this.f35517U, this.P5, this.M7, lNy(), D76(), I9f(), XNZ(), i5);
            widgetsList = widgetsList2;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            widgetsList.rl(constraintWidgetArr[i7]);
        }
        iArr[0] = widgetsList.J2();
        iArr[1] = widgetsList.O();
    }

    public void C7B(int i2) {
        this.f35542s = i2;
    }

    public void GH3(float f3) {
        this.v0j = f3;
    }

    public void HFS(float f3) {
        this.o9 = f3;
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void NP(int i2, int i3, int i5, int i7) {
        int i8;
        ConstraintWidget[] constraintWidgetArr;
        if (this.VwL > 0 && !j()) {
            LPV(0, 0);
            waP(false);
            return;
        }
        int iLNy = lNy();
        int iI9f = I9f();
        int iD76 = D76();
        int iXNZ = XNZ();
        int[] iArr = new int[2];
        int i9 = (i3 - iLNy) - iI9f;
        int i10 = this.wKp;
        if (i10 == 1) {
            i9 = (i7 - iD76) - iXNZ;
        }
        int i11 = i9;
        if (i10 == 0) {
            if (this.xVH == -1) {
                this.xVH = 0;
            }
            if (this.EF == -1) {
                this.EF = 0;
            }
        } else {
            if (this.xVH == -1) {
                this.xVH = 0;
            }
            if (this.EF == -1) {
                this.EF = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr2 = this.tFV;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i8 = this.VwL;
            if (i12 >= i8) {
                break;
            }
            if (this.tFV[i12].B() == 8) {
                i13++;
            }
            i12++;
        }
        if (i13 > 0) {
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[i8 - i13];
            int i14 = 0;
            i8 = 0;
            while (i14 < this.VwL) {
                ConstraintWidget constraintWidget = this.tFV[i14];
                ConstraintWidget[] constraintWidgetArr4 = constraintWidgetArr3;
                if (constraintWidget.B() != 8) {
                    constraintWidgetArr4[i8] = constraintWidget;
                    i8++;
                }
                i14++;
                constraintWidgetArr3 = constraintWidgetArr4;
            }
            constraintWidgetArr = constraintWidgetArr3;
        } else {
            constraintWidgetArr = constraintWidgetArr2;
        }
        int i15 = i8;
        this.I9f = constraintWidgetArr;
        this.D76 = i15;
        int i16 = this.jO;
        if (i16 == 0) {
            t1J(constraintWidgetArr, i15, this.wKp, i11, iArr);
        } else if (i16 == 1) {
            l2(constraintWidgetArr, i15, this.wKp, i11, iArr);
        } else if (i16 == 2) {
            c32(constraintWidgetArr, i15, this.wKp, i11, iArr);
        } else if (i16 == 3) {
            Om(constraintWidgetArr, i15, this.wKp, i11, iArr);
        }
        int iMin = iArr[0] + iLNy + iI9f;
        int iMin2 = iArr[1] + iD76 + iXNZ;
        if (i2 == 1073741824) {
            iMin = i3;
        } else if (i2 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i3);
        } else if (i2 != 0) {
            iMin = 0;
        }
        if (i5 == 1073741824) {
            iMin2 = i7;
        } else if (i5 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i7);
        } else if (i5 != 0) {
            iMin2 = 0;
        }
        LPV(iMin, iMin2);
        vl(iMin);
        a63(iMin2);
        waP(this.VwL > 0);
    }

    public void Sax(float f3) {
        this.vl = f3;
    }

    public void TVk(float f3) {
        this.n7b = f3;
    }

    public void XUb(int i2) {
        this.jO = i2;
    }

    public void Xli(int i2) {
        this.g6 = i2;
    }

    public void YiW(int i2) {
        this.wKp = i2;
    }

    public void c(int i2) {
        this.Mh = i2;
    }

    public void eb(int i2) {
        this.Vvq = i2;
    }

    public void fq(float f3) {
        this.nO = f3;
    }

    public void gxH(int i2) {
        this.Toy = i2;
    }

    public void kQ(int i2) {
        this.Lp6 = i2;
    }

    public void lRt(int i2) {
        this.f35543y = i2;
    }

    public void n7u(float f3) {
        this.Aum = f3;
    }

    public void w(int i2) {
        this.uG = i2;
    }

    public void wYi(int i2) {
        this.xVH = i2;
    }

    public void x(int i2) {
        this.EF = i2;
    }

    public void yA(int i2) {
        this.Zn = i2;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void Uo(LinearSystem linearSystem, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        super.Uo(linearSystem, z2);
        if (rV9() != null && ((ConstraintWidgetContainer) rV9()).l()) {
            z3 = true;
        } else {
            z3 = false;
        }
        int i2 = this.jO;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int size = this.Th.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            WidgetsList widgetsList = (WidgetsList) this.Th.get(i3);
                            if (i3 == size - 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            widgetsList.nr(z3, i3, z5);
                        }
                    }
                } else {
                    Lu(z3);
                }
            } else {
                int size2 = this.Th.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    WidgetsList widgetsList2 = (WidgetsList) this.Th.get(i5);
                    if (i5 == size2 - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    widgetsList2.nr(z3, i5, z4);
                }
            }
        } else if (this.Th.size() > 0) {
            ((WidgetsList) this.Th.get(0)).nr(z3, 0, true);
        }
        waP(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void ty(ConstraintWidget constraintWidget, HashMap map) {
        super.ty(constraintWidget, map);
        Flow flow = (Flow) constraintWidget;
        this.xVH = flow.xVH;
        this.EF = flow.EF;
        this.uG = flow.uG;
        this.Vvq = flow.Vvq;
        this.f35543y = flow.f35543y;
        this.Zn = flow.Zn;
        this.nO = flow.nO;
        this.vl = flow.vl;
        this.v0j = flow.v0j;
        this.o9 = flow.o9;
        this.n7b = flow.n7b;
        this.Aum = flow.Aum;
        this.f35542s = flow.f35542s;
        this.Lp6 = flow.Lp6;
        this.g6 = flow.g6;
        this.Mh = flow.Mh;
        this.jO = flow.jO;
        this.Toy = flow.Toy;
        this.wKp = flow.wKp;
    }
}
