package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Chain {
    public static void rl(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList arrayList, int i2) {
        int i3;
        ChainHead[] chainHeadArr;
        int i5;
        if (i2 == 0) {
            i3 = constraintWidgetContainer.X4T;
            chainHeadArr = constraintWidgetContainer.xVH;
            i5 = 0;
        } else {
            i3 = constraintWidgetContainer.Zmq;
            chainHeadArr = constraintWidgetContainer.JVN;
            i5 = 2;
        }
        for (int i7 = 0; i7 < i3; i7++) {
            ChainHead chainHead = chainHeadArr[i7];
            chainHead.n();
            if (arrayList == null || arrayList.contains(chainHead.f35486n)) {
                n(constraintWidgetContainer, linearSystem, i2, i5, chainHead);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[PHI: r15 r16
      0x0033: PHI (r15v28 boolean) = (r15v1 boolean), (r15v30 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[PHI: r15 r16
      0x0035: PHI (r15v3 boolean) = (r15v1 boolean), (r15v30 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0035: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:26:0x0047, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x038b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016a  */
    /* JADX WARN: Type inference failed for: r0v27, types: [androidx.constraintlayout.core.LinearSystem] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.constraintlayout.core.LinearSystem] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r5v17, types: [androidx.constraintlayout.core.SolverVariable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void n(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i2, int i3, ChainHead chainHead) {
        boolean z2;
        boolean z3;
        boolean z4;
        float f3;
        ?? r02;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintWidget constraintWidget;
        int i5;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        ConstraintWidget constraintWidget2;
        int i7;
        SolverVariable solverVariable4;
        int size;
        float f4;
        ArrayList arrayList;
        boolean z5;
        boolean z6;
        int i8;
        int i9 = i2;
        ConstraintWidget constraintWidget3 = chainHead.f35486n;
        ConstraintWidget constraintWidget4 = chainHead.f35489t;
        ConstraintWidget constraintWidget5 = chainHead.rl;
        ConstraintWidget constraintWidget6 = chainHead.nr;
        ConstraintWidget constraintWidget7 = chainHead.f35483O;
        float f5 = chainHead.gh;
        boolean z7 = constraintWidgetContainer.f35503D[i9] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (i9 == 0) {
            int i10 = constraintWidget7.f35525i;
            z2 = i10 == 0;
            z3 = i10 == 1;
            z4 = i10 == 2;
        } else {
            int i11 = constraintWidget7.f35511K;
            z2 = i11 == 0;
            z3 = i11 == 1;
            if (i11 == 2) {
            }
        }
        ?? r14 = constraintWidget3;
        boolean z9 = false;
        while (true) {
            f3 = f5;
            if (z9) {
                break;
            }
            ConstraintAnchor constraintAnchor3 = r14.f35506FX[i3];
            int i12 = z4 ? 1 : 4;
            int iJ2 = constraintAnchor3.J2();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = r14.f35503D[i9];
            boolean z10 = z7;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z11 = dimensionBehaviour == dimensionBehaviour2 && r14.ViF[i9] == 0;
            boolean z12 = z4;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.J2;
            if (constraintAnchor4 != null && r14 != constraintWidget3) {
                iJ2 += constraintAnchor4.J2();
            }
            int i13 = iJ2;
            if (z12 && r14 != constraintWidget3 && r14 != constraintWidget5) {
                i12 = 8;
            }
            boolean z13 = z11;
            ConstraintAnchor constraintAnchor5 = constraintAnchor3.J2;
            if (constraintAnchor5 != null) {
                if (r14 == constraintWidget5) {
                    z5 = z9;
                    z6 = z2;
                    linearSystem.KN(constraintAnchor3.xMQ, constraintAnchor5.xMQ, i13, 6);
                } else {
                    z5 = z9;
                    z6 = z2;
                    linearSystem.KN(constraintAnchor3.xMQ, constraintAnchor5.xMQ, i13, 8);
                }
                if (z13 && !z12) {
                    i12 = 5;
                }
                linearSystem.O(constraintAnchor3.xMQ, constraintAnchor3.J2.xMQ, i13, (r14 == constraintWidget5 && z12 && r14.ijL(i9)) ? 5 : i12);
            } else {
                z5 = z9;
                z6 = z2;
            }
            if (z10) {
                if (r14.B() == 8 || r14.f35503D[i9] != dimensionBehaviour2) {
                    i8 = 0;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = r14.f35506FX;
                    i8 = 0;
                    linearSystem.KN(constraintAnchorArr[i3 + 1].xMQ, constraintAnchorArr[i3].xMQ, 0, 5);
                }
                linearSystem.KN(r14.f35506FX[i3].xMQ, constraintWidgetContainer.f35506FX[i3].xMQ, i8, 8);
            }
            ConstraintAnchor constraintAnchor6 = r14.f35506FX[i3 + 1].J2;
            if (constraintAnchor6 != null) {
                ConstraintWidget constraintWidget8 = constraintAnchor6.nr;
                ConstraintAnchor constraintAnchor7 = constraintWidget8.f35506FX[i3].J2;
                if (constraintAnchor7 != null && constraintAnchor7.nr == r14) {
                    obj = constraintWidget8;
                }
            }
            if (obj != null) {
                r14 = obj;
                z9 = z5;
            } else {
                z9 = true;
            }
            f5 = f3;
            z7 = z10;
            z4 = z12;
            z2 = z6;
            r14 = r14;
        }
        boolean z14 = z7;
        boolean z15 = z4;
        boolean z16 = z2;
        if (constraintWidget6 != null) {
            int i14 = i3 + 1;
            if (constraintWidget4.f35506FX[i14].J2 != null) {
                ConstraintAnchor constraintAnchor8 = constraintWidget6.f35506FX[i14];
                if (constraintWidget6.f35503D[i9] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget6.ViF[i9] == 0 && !z15) {
                    ConstraintAnchor constraintAnchor9 = constraintAnchor8.J2;
                    if (constraintAnchor9.nr == constraintWidgetContainer) {
                        linearSystem.O(constraintAnchor8.xMQ, constraintAnchor9.xMQ, -constraintAnchor8.J2(), 5);
                    }
                    linearSystem.mUb(constraintAnchor8.xMQ, constraintWidget4.f35506FX[i14].J2.xMQ, -constraintAnchor8.J2(), 6);
                } else {
                    if (z15) {
                        ConstraintAnchor constraintAnchor10 = constraintAnchor8.J2;
                        if (constraintAnchor10.nr == constraintWidgetContainer) {
                            linearSystem.O(constraintAnchor8.xMQ, constraintAnchor10.xMQ, -constraintAnchor8.J2(), 4);
                        }
                    }
                    linearSystem.mUb(constraintAnchor8.xMQ, constraintWidget4.f35506FX[i14].J2.xMQ, -constraintAnchor8.J2(), 6);
                }
            }
        }
        if (z14) {
            int i15 = i3 + 1;
            SolverVariable solverVariable5 = constraintWidgetContainer.f35506FX[i15].xMQ;
            ConstraintAnchor constraintAnchor11 = constraintWidget4.f35506FX[i15];
            linearSystem.KN(solverVariable5, constraintAnchor11.xMQ, constraintAnchor11.J2(), 8);
        }
        ArrayList arrayList2 = chainHead.KN;
        if (arrayList2 != null && (size = arrayList2.size()) > 1) {
            float f6 = (!chainHead.f35488r || chainHead.f35485Z) ? f3 : chainHead.mUb;
            float f7 = 0.0f;
            float f8 = 0.0f;
            ConstraintWidget constraintWidget9 = null;
            int i16 = 0;
            while (i16 < size) {
                ConstraintWidget constraintWidget10 = (ConstraintWidget) arrayList2.get(i16);
                float f9 = constraintWidget10.ER[i9];
                if (f9 >= f7) {
                    f4 = f7;
                } else if (chainHead.f35485Z) {
                    ConstraintAnchor[] constraintAnchorArr2 = constraintWidget10.f35506FX;
                    f4 = f7;
                    linearSystem.O(constraintAnchorArr2[i3 + 1].xMQ, constraintAnchorArr2[i3].xMQ, 0, 4);
                    arrayList = arrayList2;
                    i16++;
                    f7 = f4;
                    arrayList2 = arrayList;
                } else {
                    f4 = f7;
                    f9 = 1.0f;
                }
                float f10 = f9;
                if (f10 == f4) {
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget10.f35506FX;
                    linearSystem.O(constraintAnchorArr3[i3 + 1].xMQ, constraintAnchorArr3[i3].xMQ, 0, 8);
                    arrayList = arrayList2;
                    i16++;
                    f7 = f4;
                    arrayList2 = arrayList;
                } else {
                    if (constraintWidget9 != null) {
                        ConstraintAnchor[] constraintAnchorArr4 = constraintWidget9.f35506FX;
                        SolverVariable solverVariable6 = constraintAnchorArr4[i3].xMQ;
                        int i17 = i3 + 1;
                        SolverVariable solverVariable7 = constraintAnchorArr4[i17].xMQ;
                        ConstraintAnchor[] constraintAnchorArr5 = constraintWidget10.f35506FX;
                        arrayList = arrayList2;
                        SolverVariable solverVariable8 = constraintAnchorArr5[i3].xMQ;
                        SolverVariable solverVariable9 = constraintAnchorArr5[i17].xMQ;
                        ArrayRow arrayRowR = linearSystem.r();
                        arrayRowR.qie(f8, f6, f10, solverVariable6, solverVariable7, solverVariable8, solverVariable9);
                        linearSystem.nr(arrayRowR);
                    } else {
                        arrayList = arrayList2;
                    }
                    constraintWidget9 = constraintWidget10;
                    f8 = f10;
                    i16++;
                    f7 = f4;
                    arrayList2 = arrayList;
                }
            }
        }
        if (constraintWidget5 != null && (constraintWidget5 == constraintWidget6 || z15)) {
            ConstraintAnchor constraintAnchor12 = constraintWidget3.f35506FX[i3];
            int i18 = i3 + 1;
            ConstraintAnchor constraintAnchor13 = constraintWidget4.f35506FX[i18];
            ConstraintAnchor constraintAnchor14 = constraintAnchor12.J2;
            SolverVariable solverVariable10 = constraintAnchor14 != null ? constraintAnchor14.xMQ : null;
            ConstraintAnchor constraintAnchor15 = constraintAnchor13.J2;
            SolverVariable solverVariable11 = constraintAnchor15 != null ? constraintAnchor15.xMQ : null;
            ConstraintAnchor constraintAnchor16 = constraintWidget5.f35506FX[i3];
            if (constraintWidget6 != null) {
                constraintAnchor13 = constraintWidget6.f35506FX[i18];
            }
            if (solverVariable10 != null && solverVariable11 != null) {
                linearSystem.t(constraintAnchor16.xMQ, solverVariable10, constraintAnchor16.J2(), i9 == 0 ? constraintWidget7.ofS : constraintWidget7.f35502C, solverVariable11, constraintAnchor13.xMQ, constraintAnchor13.J2(), 7);
            }
        } else {
            if (!z16 || constraintWidget5 == null) {
                if (z3 && constraintWidget5 != null) {
                    int i19 = chainHead.mUb;
                    boolean z17 = i19 > 0 && chainHead.xMQ == i19;
                    ConstraintWidget constraintWidget11 = constraintWidget5;
                    ConstraintWidget constraintWidget12 = constraintWidget11;
                    while (constraintWidget11 != null) {
                        ConstraintWidget constraintWidget13 = constraintWidget11.kSg[i2];
                        while (constraintWidget13 != null && constraintWidget13.B() == 8) {
                            constraintWidget13 = constraintWidget13.kSg[i2];
                        }
                        if (constraintWidget11 != constraintWidget5 && constraintWidget11 != constraintWidget6 && constraintWidget13 != null) {
                            if (constraintWidget13 == constraintWidget6) {
                                constraintWidget13 = null;
                            }
                            ConstraintAnchor constraintAnchor17 = constraintWidget11.f35506FX[i3];
                            SolverVariable solverVariable12 = constraintAnchor17.xMQ;
                            ConstraintAnchor constraintAnchor18 = constraintAnchor17.J2;
                            if (constraintAnchor18 != null) {
                                SolverVariable solverVariable13 = constraintAnchor18.xMQ;
                            }
                            int i20 = i3 + 1;
                            SolverVariable solverVariable14 = constraintWidget12.f35506FX[i20].xMQ;
                            int iJ22 = constraintAnchor17.J2();
                            int iJ23 = constraintWidget11.f35506FX[i20].J2();
                            if (constraintWidget13 != null) {
                                constraintAnchor = constraintWidget13.f35506FX[i3];
                                solverVariable = constraintAnchor.xMQ;
                                ConstraintAnchor constraintAnchor19 = constraintAnchor.J2;
                                solverVariable2 = constraintAnchor19 != null ? constraintAnchor19.xMQ : null;
                            } else {
                                constraintAnchor = constraintWidget6.f35506FX[i3];
                                solverVariable = constraintAnchor != null ? constraintAnchor.xMQ : null;
                                solverVariable2 = constraintWidget11.f35506FX[i20].xMQ;
                            }
                            if (constraintAnchor != null) {
                                iJ23 += constraintAnchor.J2();
                            }
                            int iJ24 = iJ22 + constraintWidget12.f35506FX[i20].J2();
                            int i21 = z17 ? 8 : 4;
                            if (solverVariable12 == null || solverVariable14 == null || solverVariable == null || solverVariable2 == null) {
                                constraintWidget = constraintWidget13;
                            } else {
                                constraintWidget = constraintWidget13;
                                linearSystem.t(solverVariable12, solverVariable14, iJ24, 0.5f, solverVariable, solverVariable2, iJ23, i21);
                            }
                            constraintWidget13 = constraintWidget;
                        }
                        if (constraintWidget11.B() != 8) {
                            constraintWidget12 = constraintWidget11;
                        }
                        constraintWidget11 = constraintWidget13;
                    }
                    ConstraintAnchor constraintAnchor20 = constraintWidget5.f35506FX[i3];
                    ConstraintAnchor constraintAnchor21 = constraintWidget3.f35506FX[i3].J2;
                    int i22 = i3 + 1;
                    ConstraintAnchor constraintAnchor22 = constraintWidget6.f35506FX[i22];
                    ConstraintAnchor constraintAnchor23 = constraintWidget4.f35506FX[i22].J2;
                    if (constraintAnchor21 == null) {
                        r02 = linearSystem;
                        if (constraintAnchor23 != null && constraintWidget5 != constraintWidget6) {
                            r02.O(constraintAnchor22.xMQ, constraintAnchor23.xMQ, -constraintAnchor22.J2(), 5);
                        }
                    } else {
                        if (constraintWidget5 != constraintWidget6) {
                            linearSystem.O(constraintAnchor20.xMQ, constraintAnchor21.xMQ, constraintAnchor20.J2(), 5);
                        } else {
                            if (constraintAnchor23 != null) {
                                LinearSystem linearSystem2 = linearSystem;
                                linearSystem2.t(constraintAnchor20.xMQ, constraintAnchor21.xMQ, constraintAnchor20.J2(), 0.5f, constraintAnchor22.xMQ, constraintAnchor23.xMQ, constraintAnchor22.J2(), 5);
                                r02 = linearSystem2;
                            }
                            if (constraintAnchor23 != null) {
                                r02.O(constraintAnchor22.xMQ, constraintAnchor23.xMQ, -constraintAnchor22.J2(), 5);
                            }
                        }
                        r02 = linearSystem;
                        if (constraintAnchor23 != null) {
                        }
                    }
                }
                if ((z16 && !z3) || constraintWidget5 == null || constraintWidget5 == constraintWidget6) {
                    return;
                }
                ConstraintAnchor[] constraintAnchorArr6 = constraintWidget5.f35506FX;
                ConstraintAnchor constraintAnchor24 = constraintAnchorArr6[i3];
                if (constraintWidget6 == null) {
                    constraintWidget6 = constraintWidget5;
                }
                int i23 = i3 + 1;
                ConstraintAnchor constraintAnchor25 = constraintWidget6.f35506FX[i23];
                ConstraintAnchor constraintAnchor26 = constraintAnchor24.J2;
                solverVariable4 = constraintAnchor26 == null ? constraintAnchor26.xMQ : null;
                ConstraintAnchor constraintAnchor27 = constraintAnchor25.J2;
                Object obj = constraintAnchor27 == null ? constraintAnchor27.xMQ : null;
                if (constraintWidget4 != constraintWidget6) {
                    ConstraintAnchor constraintAnchor28 = constraintWidget4.f35506FX[i23].J2;
                    obj = constraintAnchor28 != null ? constraintAnchor28.xMQ : null;
                }
                if (constraintWidget5 == constraintWidget6) {
                    constraintAnchor25 = constraintAnchorArr6[i23];
                }
                if (solverVariable4 != null || obj == null) {
                }
                r02.t(constraintAnchor24.xMQ, solverVariable4, constraintAnchor24.J2(), 0.5f, obj, constraintAnchor25.xMQ, constraintWidget6.f35506FX[i23].J2(), 5);
                return;
            }
            int i24 = chainHead.mUb;
            boolean z18 = i24 > 0 && chainHead.xMQ == i24;
            ConstraintWidget constraintWidget14 = constraintWidget5;
            ConstraintWidget constraintWidget15 = constraintWidget14;
            while (constraintWidget14 != null) {
                ConstraintWidget constraintWidget16 = constraintWidget14.kSg[i9];
                while (true) {
                    if (constraintWidget16 == null) {
                        i5 = 8;
                        break;
                    }
                    i5 = 8;
                    if (constraintWidget16.B() != 8) {
                        break;
                    } else {
                        constraintWidget16 = constraintWidget16.kSg[i9];
                    }
                }
                if (constraintWidget16 != null || constraintWidget14 == constraintWidget6) {
                    ConstraintAnchor constraintAnchor29 = constraintWidget14.f35506FX[i3];
                    SolverVariable solverVariable15 = constraintAnchor29.xMQ;
                    ConstraintAnchor constraintAnchor30 = constraintAnchor29.J2;
                    SolverVariable solverVariable16 = constraintAnchor30 != null ? constraintAnchor30.xMQ : null;
                    if (constraintWidget15 != constraintWidget14) {
                        solverVariable16 = constraintWidget15.f35506FX[i3 + 1].xMQ;
                    } else if (constraintWidget14 == constraintWidget5) {
                        ConstraintAnchor constraintAnchor31 = constraintWidget3.f35506FX[i3].J2;
                        solverVariable16 = constraintAnchor31 != null ? constraintAnchor31.xMQ : null;
                    }
                    int iJ25 = constraintAnchor29.J2();
                    int i25 = i3 + 1;
                    int iJ26 = constraintWidget14.f35506FX[i25].J2();
                    if (constraintWidget16 != null) {
                        constraintAnchor2 = constraintWidget16.f35506FX[i3];
                        solverVariable3 = constraintAnchor2.xMQ;
                    } else {
                        constraintAnchor2 = constraintWidget4.f35506FX[i25].J2;
                        solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.xMQ : null;
                    }
                    SolverVariable solverVariable17 = constraintWidget14.f35506FX[i25].xMQ;
                    if (constraintAnchor2 != null) {
                        iJ26 += constraintAnchor2.J2();
                    }
                    int iJ27 = iJ25 + constraintWidget15.f35506FX[i25].J2();
                    if (solverVariable15 == null || solverVariable16 == null || solverVariable3 == null || solverVariable17 == null) {
                        constraintWidget2 = constraintWidget16;
                        i7 = 8;
                    } else {
                        if (constraintWidget14 == constraintWidget5) {
                            iJ27 = constraintWidget5.f35506FX[i3].J2();
                        }
                        if (constraintWidget14 == constraintWidget6) {
                            iJ26 = constraintWidget6.f35506FX[i25].J2();
                        }
                        constraintWidget2 = constraintWidget16;
                        i7 = 8;
                        linearSystem.t(solverVariable15, solverVariable16, iJ27, 0.5f, solverVariable3, solverVariable17, iJ26, z18 ? 8 : 5);
                        if (constraintWidget14.B() == i7) {
                            constraintWidget15 = constraintWidget14;
                        }
                        i9 = i2;
                        constraintWidget14 = constraintWidget2;
                    }
                } else {
                    constraintWidget2 = constraintWidget16;
                    i7 = i5;
                }
                if (constraintWidget14.B() == i7) {
                }
                i9 = i2;
                constraintWidget14 = constraintWidget2;
            }
        }
        r02 = linearSystem;
        if (z16) {
        }
        ConstraintAnchor[] constraintAnchorArr62 = constraintWidget5.f35506FX;
        ConstraintAnchor constraintAnchor242 = constraintAnchorArr62[i3];
        if (constraintWidget6 == null) {
        }
        int i232 = i3 + 1;
        ConstraintAnchor constraintAnchor252 = constraintWidget6.f35506FX[i232];
        ConstraintAnchor constraintAnchor262 = constraintAnchor242.J2;
        if (constraintAnchor262 == null) {
        }
        ConstraintAnchor constraintAnchor272 = constraintAnchor252.J2;
        if (constraintAnchor272 == null) {
        }
        if (constraintWidget4 != constraintWidget6) {
        }
        if (constraintWidget5 == constraintWidget6) {
        }
        if (solverVariable4 != null) {
        }
    }
}
