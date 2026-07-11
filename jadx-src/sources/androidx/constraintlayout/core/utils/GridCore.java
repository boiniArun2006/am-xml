package androidx.constraintlayout.core.utils;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.utils.GridCore;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class GridCore extends VirtualLayout {
    private String Aum;
    private ConstraintWidget[] EF;
    private int Lp6;
    private boolean[][] Mh;
    private int[][] Th;
    private int[][] Toy;
    private int Vvq;
    private int Zn;
    private String n7b;
    private int nO;
    private String o9;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f35481s;
    private float v0j;
    private float vl;
    private int wKp;
    ConstraintWidgetContainer xVH;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f35482y;
    private boolean uG = false;
    private int g6 = 0;
    Set jO = new HashSet();
    private int xzo = 0;

    private void Co(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!oz(bZm(iArr2[0]), iV(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private int I4p() {
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            i2 = this.g6;
            if (i2 >= this.Vvq * this.Zn) {
                return -1;
            }
            int iBZm = bZm(i2);
            int iIV = iV(this.g6);
            boolean[] zArr = this.Mh[iBZm];
            if (zArr[iIV]) {
                zArr[iIV] = false;
                z2 = true;
            }
            this.g6++;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void l() {
        int[][] iArr;
        int i2;
        for (int i3 = 0; i3 < this.VwL; i3++) {
            if (!this.jO.contains(this.tFV[i3].HI)) {
                int iI4p = I4p();
                int iBZm = bZm(iI4p);
                int iIV = iV(iI4p);
                if (iI4p == -1) {
                    return;
                }
                if (!qva() || (iArr = this.Th) == null || (i2 = this.xzo) >= iArr.length) {
                    wKY(this.tFV[i3], iBZm, iIV, 1, 1);
                } else {
                    int[] iArr2 = iArr[i2];
                    if (iArr2[0] == iI4p) {
                        this.Mh[iBZm][iIV] = true;
                        if (oz(iBZm, iIV, iArr2[1], iArr2[2])) {
                            ConstraintWidget constraintWidget = this.tFV[i3];
                            int[] iArr3 = this.Th[this.xzo];
                            wKY(constraintWidget, iBZm, iIV, iArr3[1], iArr3[2]);
                            this.xzo++;
                        }
                    }
                }
            }
        }
    }

    private void lS(boolean z2) {
        int[][] iArrL;
        int[][] iArrL2;
        if (z2) {
            for (int i2 = 0; i2 < this.Mh.length; i2++) {
                int i3 = 0;
                while (true) {
                    boolean[][] zArr = this.Mh;
                    if (i3 < zArr[0].length) {
                        zArr[i2][i3] = true;
                        i3++;
                    }
                }
            }
            for (int i5 = 0; i5 < this.Toy.length; i5++) {
                int i7 = 0;
                while (true) {
                    int[][] iArr = this.Toy;
                    if (i7 < iArr[0].length) {
                        iArr[i5][i7] = -1;
                        i7++;
                    }
                }
            }
        }
        this.g6 = 0;
        String str = this.f35481s;
        if (str != null && !str.trim().isEmpty() && (iArrL2 = L(this.f35481s, false)) != null) {
            Co(iArrL2);
        }
        String str2 = this.Aum;
        if (str2 == null || str2.trim().isEmpty() || (iArrL = L(this.Aum, true)) == null) {
            return;
        }
        q9(iArrL);
    }

    private boolean oz(int i2, int i3, int i5, int i7) {
        for (int i8 = i2; i8 < i2 + i5; i8++) {
            for (int i9 = i3; i9 < i3 + i7; i9++) {
                boolean[][] zArr = this.Mh;
                if (i8 < zArr.length && i9 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i8];
                    if (zArr2[i9]) {
                        zArr2[i9] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public void fq(float f3) {
        if (f3 >= 0.0f && this.v0j != f3) {
            this.v0j = f3;
        }
    }

    public void t1J(float f3) {
        if (f3 >= 0.0f && this.vl != f3) {
            this.vl = f3;
        }
    }

    private void A() {
        boolean[][] zArr;
        int[][] iArr = this.Toy;
        boolean z2 = false;
        if (iArr != null && iArr.length == this.VwL && (zArr = this.Mh) != null && zArr.length == this.Vvq && zArr[0].length == this.Zn) {
            z2 = true;
        }
        if (!z2) {
            WH();
        }
        lS(z2);
    }

    private void C7B(boolean z2) {
        int[][] iArrL;
        if (this.Vvq < 1 || this.Zn < 1) {
            return;
        }
        if (z2) {
            for (int i2 = 0; i2 < this.Mh.length; i2++) {
                int i3 = 0;
                while (true) {
                    boolean[][] zArr = this.Mh;
                    if (i3 < zArr[0].length) {
                        zArr[i2][i3] = true;
                        i3++;
                    }
                }
            }
            this.jO.clear();
        }
        this.g6 = 0;
        String str = this.f35481s;
        if (str != null && !str.trim().isEmpty() && (iArrL = L(this.f35481s, false)) != null) {
            Co(iArrL);
        }
        String str2 = this.Aum;
        if (str2 != null && !str2.trim().isEmpty()) {
            this.Th = L(this.Aum, true);
        }
        mx();
        int[][] iArr = this.Th;
        if (iArr != null) {
            q9(iArr);
        }
    }

    private void HE() {
        int i2;
        int iMax = Math.max(this.Vvq, this.Zn);
        ConstraintWidget constraintWidget = this.EF[0];
        float[] fArrLu = Lu(this.Zn, this.n7b);
        if (this.Zn == 1) {
            eo(constraintWidget);
            constraintWidget.jB.n(this.jB, 0);
            constraintWidget.P5.n(this.P5, 0);
            return;
        }
        int i3 = 0;
        while (true) {
            i2 = this.Zn;
            if (i3 >= i2) {
                break;
            }
            ConstraintWidget constraintWidget2 = this.EF[i3];
            eo(constraintWidget2);
            if (fArrLu != null) {
                constraintWidget2.T3L(fArrLu[i3]);
            }
            if (i3 > 0) {
                constraintWidget2.jB.n(this.EF[i3 - 1].P5, 0);
            } else {
                constraintWidget2.jB.n(this.jB, 0);
            }
            if (i3 < this.Zn - 1) {
                constraintWidget2.P5.n(this.EF[i3 + 1].jB, 0);
            } else {
                constraintWidget2.P5.n(this.P5, 0);
            }
            if (i3 > 0) {
                constraintWidget2.jB.Uo = (int) this.vl;
            }
            i3++;
        }
        while (i2 < iMax) {
            ConstraintWidget constraintWidget3 = this.EF[i2];
            eo(constraintWidget3);
            constraintWidget3.jB.n(this.jB, 0);
            constraintWidget3.P5.n(this.P5, 0);
            i2++;
        }
    }

    private int[][] L(String str, boolean z2) {
        try {
            String[] strArrSplit = str.split(",");
            Arrays.sort(strArrSplit, new Comparator() { // from class: V.j
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return GridCore.yAc((String) obj, (String) obj2);
                }
            });
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            if (this.Vvq != 1 && this.Zn != 1) {
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    String[] strArrSplit2 = strArrSplit[i2].trim().split(":");
                    String[] strArrSplit3 = strArrSplit2[1].split("x");
                    iArr[i2][0] = Integer.parseInt(strArrSplit2[0]);
                    if (d()) {
                        iArr[i2][1] = Integer.parseInt(strArrSplit3[1]);
                        iArr[i2][2] = Integer.parseInt(strArrSplit3[0]);
                    } else {
                        iArr[i2][1] = Integer.parseInt(strArrSplit3[0]);
                        iArr[i2][2] = Integer.parseInt(strArrSplit3[1]);
                    }
                }
                return iArr;
            }
            int i3 = 0;
            int i5 = 0;
            for (int i7 = 0; i7 < strArrSplit.length; i7++) {
                String[] strArrSplit4 = strArrSplit[i7].trim().split(":");
                iArr[i7][0] = Integer.parseInt(strArrSplit4[0]);
                int[] iArr2 = iArr[i7];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.Zn == 1) {
                    iArr2[1] = Integer.parseInt(strArrSplit4[1]);
                    i3 += iArr[i7][1];
                    if (z2) {
                        i3--;
                    }
                }
                if (this.Vvq == 1) {
                    iArr[i7][2] = Integer.parseInt(strArrSplit4[1]);
                    i5 += iArr[i7][2];
                    if (z2) {
                        i5--;
                    }
                }
            }
            if (i3 != 0 && !this.uG) {
                HFS(this.Vvq + i3);
            }
            if (i5 != 0 && !this.uG) {
                l2(this.Zn + i5);
            }
            this.uG = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private float[] Lu(int i2, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 < strArrSplit.length) {
                try {
                    fArr[i3] = Float.parseFloat(strArrSplit[i3]);
                } catch (Exception e2) {
                    System.err.println("Error parsing `" + strArrSplit[i3] + "`: " + e2.getMessage());
                    fArr[i3] = 1.0f;
                }
            } else {
                fArr[i3] = 1.0f;
            }
        }
        return fArr;
    }

    private void WH() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.Vvq, this.Zn);
        this.Mh = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i2 = this.VwL;
        if (i2 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2, 4);
            this.Toy = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private int bZm(int i2) {
        return this.Lp6 == 1 ? i2 % this.Vvq : i2 / this.Zn;
    }

    private boolean d() {
        return (this.wKp & 1) > 0;
    }

    private void eo(ConstraintWidget constraintWidget) {
        constraintWidget.T3L(-1.0f);
        constraintWidget.jB.Ik();
        constraintWidget.P5.Ik();
    }

    private void fW() {
        int i2;
        int iMax = Math.max(this.Vvq, this.Zn);
        ConstraintWidget constraintWidget = this.EF[0];
        float[] fArrLu = Lu(this.Vvq, this.o9);
        if (this.Vvq == 1) {
            uQ(constraintWidget);
            constraintWidget.f35517U.n(this.f35517U, 0);
            constraintWidget.M7.n(this.M7, 0);
            return;
        }
        int i3 = 0;
        while (true) {
            i2 = this.Vvq;
            if (i3 >= i2) {
                break;
            }
            ConstraintWidget constraintWidget2 = this.EF[i3];
            uQ(constraintWidget2);
            if (fArrLu != null) {
                constraintWidget2.Zn(fArrLu[i3]);
            }
            if (i3 > 0) {
                constraintWidget2.f35517U.n(this.EF[i3 - 1].M7, 0);
            } else {
                constraintWidget2.f35517U.n(this.f35517U, 0);
            }
            if (i3 < this.Vvq - 1) {
                constraintWidget2.M7.n(this.EF[i3 + 1].f35517U, 0);
            } else {
                constraintWidget2.M7.n(this.M7, 0);
            }
            if (i3 > 0) {
                constraintWidget2.f35517U.Uo = (int) this.v0j;
            }
            i3++;
        }
        while (i2 < iMax) {
            ConstraintWidget constraintWidget3 = this.EF[i2];
            uQ(constraintWidget3);
            constraintWidget3.f35517U.n(this.f35517U, 0);
            constraintWidget3.M7.n(this.M7, 0);
            i2++;
        }
    }

    private int iV(int i2) {
        return this.Lp6 == 1 ? i2 / this.Vvq : i2 % this.Zn;
    }

    private void mx() {
        int iMax = Math.max(this.Vvq, this.Zn);
        ConstraintWidget[] constraintWidgetArr = this.EF;
        int i2 = 0;
        if (constraintWidgetArr == null) {
            this.EF = new ConstraintWidget[iMax];
            while (true) {
                ConstraintWidget[] constraintWidgetArr2 = this.EF;
                if (i2 >= constraintWidgetArr2.length) {
                    return;
                }
                constraintWidgetArr2[i2] = rT();
                i2++;
            }
        } else {
            if (iMax == constraintWidgetArr.length) {
                return;
            }
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[iMax];
            while (i2 < iMax) {
                ConstraintWidget[] constraintWidgetArr4 = this.EF;
                if (i2 < constraintWidgetArr4.length) {
                    constraintWidgetArr3[i2] = constraintWidgetArr4[i2];
                } else {
                    constraintWidgetArr3[i2] = rT();
                }
                i2++;
            }
            while (true) {
                ConstraintWidget[] constraintWidgetArr5 = this.EF;
                if (iMax >= constraintWidgetArr5.length) {
                    this.EF = constraintWidgetArr3;
                    return;
                } else {
                    this.xVH.Toy(constraintWidgetArr5[iMax]);
                    iMax++;
                }
            }
        }
    }

    private boolean qva() {
        return (this.wKp & 2) > 0;
    }

    private ConstraintWidget rT() {
        ConstraintWidget constraintWidget = new ConstraintWidget();
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f35503D;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        constraintWidget.HI = String.valueOf(constraintWidget.hashCode());
        return constraintWidget;
    }

    private void uQ(ConstraintWidget constraintWidget) {
        constraintWidget.Zn(-1.0f);
        constraintWidget.f35517U.Ik();
        constraintWidget.M7.Ik();
        constraintWidget.p5.Ik();
    }

    private void wKY(ConstraintWidget constraintWidget, int i2, int i3, int i5, int i7) {
        constraintWidget.jB.n(this.EF[i3].jB, 0);
        constraintWidget.f35517U.n(this.EF[i2].f35517U, 0);
        constraintWidget.P5.n(this.EF[(i3 + i7) - 1].P5, 0);
        constraintWidget.M7.n(this.EF[(i2 + i5) - 1].M7, 0);
    }

    private void wYi() {
        int i2;
        int i3 = this.f35482y;
        if (i3 != 0 && (i2 = this.nO) != 0) {
            this.Vvq = i3;
            this.Zn = i2;
            return;
        }
        int i5 = this.nO;
        if (i5 > 0) {
            this.Zn = i5;
            this.Vvq = ((this.VwL + i5) - 1) / i5;
        } else if (i3 > 0) {
            this.Vvq = i3;
            this.Zn = ((this.VwL + i3) - 1) / i3;
        } else {
            int iSqrt = (int) (Math.sqrt(this.VwL) + 1.5d);
            this.Vvq = iSqrt;
            this.Zn = ((this.VwL + iSqrt) - 1) / iSqrt;
        }
    }

    public static /* synthetic */ int yAc(String str, String str2) {
        return Integer.parseInt(str.split(":")[0]) - Integer.parseInt(str2.split(":")[0]);
    }

    public void GH3(int i2) {
        if ((i2 == 0 || i2 == 1) && this.Lp6 != i2) {
            this.Lp6 = i2;
        }
    }

    public void HFS(int i2) {
        if (i2 <= 50 && this.f35482y != i2) {
            this.f35482y = i2;
            wYi();
            WH();
        }
    }

    public void Om(int i2) {
        this.wKp = i2;
    }

    public void Xli(CharSequence charSequence) {
        String str = this.Aum;
        if (str == null || !str.equals(charSequence.toString())) {
            this.uG = false;
            this.Aum = charSequence.toString();
        }
    }

    public void c32(String str) {
        String str2 = this.n7b;
        if (str2 == null || !str2.equals(str)) {
            this.n7b = str;
        }
    }

    public void eb(String str) {
        String str2 = this.f35481s;
        if (str2 == null || !str2.equals(str)) {
            this.uG = false;
            this.f35481s = str;
        }
    }

    public void l2(int i2) {
        if (i2 <= 50 && this.nO != i2) {
            this.nO = i2;
            wYi();
            WH();
        }
    }

    public void w(String str) {
        String str2 = this.o9;
        if (str2 == null || !str2.equals(str)) {
            this.o9 = str;
        }
    }

    public GridCore() {
        wYi();
        A();
    }

    private void h() {
        fW();
        HE();
        l();
    }

    private void q9(int[][] iArr) {
        if (!qva()) {
            for (int i2 = 0; i2 < iArr.length; i2++) {
                int iBZm = bZm(iArr[i2][0]);
                int iIV = iV(iArr[i2][0]);
                int[] iArr2 = iArr[i2];
                if (!oz(iBZm, iIV, iArr2[1], iArr2[2])) {
                    break;
                }
                ConstraintWidget constraintWidget = this.tFV[i2];
                int[] iArr3 = iArr[i2];
                wKY(constraintWidget, iBZm, iIV, iArr3[1], iArr3[2]);
                this.jO.add(this.tFV[i2].HI);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void NP(int i2, int i3, int i5, int i7) {
        super.NP(i2, i3, i5, i7);
        this.xVH = (ConstraintWidgetContainer) rV9();
        C7B(false);
        this.xVH.g6(this.EF);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void Uo(LinearSystem linearSystem, boolean z2) {
        super.Uo(linearSystem, z2);
        h();
    }
}
