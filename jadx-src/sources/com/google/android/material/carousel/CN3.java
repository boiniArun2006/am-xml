package com.google.android.material.carousel;

import androidx.core.math.MathUtils;
import com.google.android.material.carousel.Wre;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class CN3 {
    private final float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final float[] f58770O;
    private final float Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Wre f58771n;
    private final float[] nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f58772t;

    private static float[] HI(List list, float f3, float[] fArr) {
        int size = list.size();
        float f4 = fArr[0];
        int i2 = 1;
        while (i2 < size) {
            float f5 = fArr[i2];
            if (f3 <= f5) {
                return new float[]{G7.j.rl(0.0f, 1.0f, f4, f5, f3), i2 - 1, i2};
            }
            i2++;
            f4 = f5;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static int t(Wre wre) {
        for (int i2 = 0; i2 < wre.Uo().size(); i2++) {
            if (!((Wre.w6) wre.Uo().get(i2)).f58789O) {
                return i2;
            }
        }
        return -1;
    }

    public Wre mUb(float f3, float f4, float f5) {
        return gh(f3, f4, f5, false);
    }

    static CN3 J2(n nVar, Wre wre, float f3, float f4, float f5) {
        return new CN3(wre, ck(nVar, wre, f3, f4), ty(nVar, wre, f3, f5));
    }

    private static Wre XQ(Wre wre, float f3, float f4, boolean z2, float f5) {
        ArrayList arrayList = new ArrayList(wre.Uo());
        Wre.n nVar = new Wre.n(wre.J2(), f4);
        float fQie = f3 / wre.qie();
        float f6 = z2 ? f3 : 0.0f;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            Wre.w6 w6Var = (Wre.w6) arrayList.get(i2);
            if (w6Var.f58789O) {
                nVar.O(w6Var.rl, w6Var.f58791t, w6Var.nr, false, true, w6Var.J2);
            } else {
                boolean z3 = i2 >= wre.rl() && i2 <= wre.xMQ();
                float f7 = w6Var.nr - fQie;
                float fRl = Ml.rl(f7, wre.J2(), f5);
                float f8 = (f7 / 2.0f) + f6;
                float f9 = f8 - w6Var.rl;
                nVar.J2(f8, fRl, f7, z3, false, w6Var.J2, z2 ? f9 : 0.0f, z2 ? 0.0f : f9);
                f6 += f7;
            }
            i2++;
        }
        return nVar.xMQ();
    }

    private static Wre Z(Wre wre, int i2, int i3, float f3, int i5, int i7, float f4) {
        ArrayList arrayList = new ArrayList(wre.Uo());
        arrayList.add(i3, (Wre.w6) arrayList.remove(i2));
        Wre.n nVar = new Wre.n(wre.J2(), f4);
        int i8 = 0;
        while (i8 < arrayList.size()) {
            Wre.w6 w6Var = (Wre.w6) arrayList.get(i8);
            float f5 = w6Var.nr;
            nVar.O(f3 + (f5 / 2.0f), w6Var.f58791t, f5, i8 >= i5 && i8 <= i7, w6Var.f58789O, w6Var.J2);
            f3 += w6Var.nr;
            i8++;
        }
        return nVar.xMQ();
    }

    private static List ck(n nVar, Wre wre, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(wre);
        int iT = t(wre);
        float fJ2 = nVar.t() ? nVar.J2() : nVar.Uo();
        if (!Ik(wre) && iT != -1) {
            int iRl = wre.rl() - iT;
            float f5 = wre.t().rl - (wre.t().nr / 2.0f);
            if (iRl <= 0 && wre.n().J2 > 0.0f) {
                arrayList.add(S(wre, f5 + wre.n().J2, fJ2));
                return arrayList;
            }
            int i2 = 0;
            float f6 = 0.0f;
            while (i2 < iRl) {
                Wre wre2 = (Wre) arrayList.get(arrayList.size() - 1);
                int i3 = iT + i2;
                int size = wre.Uo().size() - 1;
                float f7 = f6 + ((Wre.w6) wre.Uo().get(i3)).J2;
                int i5 = i3 - 1;
                if (i5 >= 0) {
                    size = rl(wre2, ((Wre.w6) wre.Uo().get(i5)).f58791t) - 1;
                }
                Wre wreZ = Z(wre2, iT, size, f5 + f7, (wre.rl() - i2) - 1, (wre.xMQ() - i2) - 1, fJ2);
                if (i2 == iRl - 1 && f4 > 0.0f) {
                    wreZ = XQ(wreZ, f4, fJ2, true, f3);
                }
                arrayList.add(wreZ);
                i2++;
                f6 = f7;
            }
        } else if (f4 > 0.0f) {
            arrayList.add(XQ(wre, f4, fJ2, true, f3));
        }
        return arrayList;
    }

    private static List ty(n nVar, Wre wre, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(wre);
        int iO = O(wre);
        float fJ2 = nVar.t() ? nVar.J2() : nVar.Uo();
        if (!r(nVar, wre) && iO != -1) {
            int iXMQ = iO - wre.xMQ();
            float f5 = wre.t().rl - (wre.t().nr / 2.0f);
            if (iXMQ <= 0 && wre.KN().J2 > 0.0f) {
                arrayList.add(S(wre, f5 - wre.KN().J2, fJ2));
                return arrayList;
            }
            int i2 = 0;
            float f6 = 0.0f;
            while (i2 < iXMQ) {
                Wre wre2 = (Wre) arrayList.get(arrayList.size() - 1);
                int i3 = iO - i2;
                float f7 = f6 + ((Wre.w6) wre.Uo().get(i3)).J2;
                int i5 = i3 + 1;
                Wre wreZ = Z(wre2, iO, i5 < wre.Uo().size() ? nr(wre2, ((Wre.w6) wre.Uo().get(i5)).f58791t) + 1 : 0, f5 - f7, wre.rl() + i2 + 1, wre.xMQ() + i2 + 1, fJ2);
                if (i2 == iXMQ - 1 && f4 > 0.0f) {
                    wreZ = XQ(wreZ, f4, fJ2, false, f3);
                }
                arrayList.add(wreZ);
                i2++;
                f6 = f7;
            }
        } else if (f4 > 0.0f) {
            arrayList.add(XQ(wre, f4, fJ2, false, f3));
        }
        return arrayList;
    }

    Wre KN() {
        return (Wre) this.f58772t.get(r0.size() - 1);
    }

    Wre Uo() {
        return this.f58771n;
    }

    Wre gh(float f3, float f4, float f5, boolean z2) {
        float fRl;
        List list;
        float[] fArr;
        float f6 = this.J2 + f4;
        float f7 = f5 - this.Uo;
        float f8 = qie().n().Uo;
        float f9 = KN().KN().KN;
        if (this.J2 == f8) {
            f6 += f8;
        }
        if (this.Uo == f9) {
            f7 -= f9;
        }
        if (f3 < f6) {
            fRl = G7.j.rl(1.0f, 0.0f, f4, f6, f3);
            list = this.rl;
            fArr = this.nr;
        } else {
            if (f3 <= f7) {
                return this.f58771n;
            }
            fRl = G7.j.rl(0.0f, 1.0f, f7, f5, f3);
            list = this.f58772t;
            fArr = this.f58770O;
        }
        return z2 ? n(list, fRl, fArr) : o(list, fRl, fArr);
    }

    Wre qie() {
        return (Wre) this.rl.get(r0.size() - 1);
    }

    Map xMQ(int i2, int i3, int i5, boolean z2) {
        float fJ2 = this.f58771n.J2();
        HashMap map = new HashMap();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i7 >= i2) {
                break;
            }
            int i9 = z2 ? (i2 - i7) - 1 : i7;
            if (i9 * fJ2 * (z2 ? -1 : 1) > i5 - this.Uo || i7 >= i2 - this.f58772t.size()) {
                Integer numValueOf = Integer.valueOf(i9);
                List list = this.f58772t;
                map.put(numValueOf, (Wre) list.get(MathUtils.rl(i8, 0, list.size() - 1)));
                i8++;
            }
            i7++;
        }
        int i10 = 0;
        for (int i11 = i2 - 1; i11 >= 0; i11--) {
            int i12 = z2 ? (i2 - i11) - 1 : i11;
            if (i12 * fJ2 * (z2 ? -1 : 1) < i3 + this.J2 || i11 < this.rl.size()) {
                Integer numValueOf2 = Integer.valueOf(i12);
                List list2 = this.rl;
                map.put(numValueOf2, (Wre) list2.get(MathUtils.rl(i10, 0, list2.size() - 1)));
                i10++;
            }
        }
        return map;
    }

    private CN3(Wre wre, List list, List list2) {
        this.f58771n = wre;
        this.rl = Collections.unmodifiableList(list);
        this.f58772t = Collections.unmodifiableList(list2);
        float f3 = ((Wre) list.get(list.size() - 1)).t().f58790n - wre.t().f58790n;
        this.J2 = f3;
        float f4 = wre.mUb().f58790n - ((Wre) list2.get(list2.size() - 1)).mUb().f58790n;
        this.Uo = f4;
        this.nr = az(f3, list, true);
        this.f58770O = az(f4, list2, false);
    }

    private static boolean Ik(Wre wre) {
        if (wre.n().rl - (wre.n().nr / 2.0f) >= 0.0f && wre.n() == wre.nr()) {
            return true;
        }
        return false;
    }

    private static int O(Wre wre) {
        for (int size = wre.Uo().size() - 1; size >= 0; size--) {
            if (!((Wre.w6) wre.Uo().get(size)).f58789O) {
                return size;
            }
        }
        return -1;
    }

    private static Wre S(Wre wre, float f3, float f4) {
        return Z(wre, 0, 0, f3, wre.rl(), wre.xMQ(), f4);
    }

    private static float[] az(float f3, List list, boolean z2) {
        float f4;
        float f5;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i2 = 1; i2 < size; i2++) {
            int i3 = i2 - 1;
            Wre wre = (Wre) list.get(i3);
            Wre wre2 = (Wre) list.get(i2);
            if (z2) {
                f4 = wre2.t().f58790n - wre.t().f58790n;
            } else {
                f4 = wre.mUb().f58790n - wre2.mUb().f58790n;
            }
            float f6 = f4 / f3;
            if (i2 == size - 1) {
                f5 = 1.0f;
            } else {
                f5 = fArr[i3] + f6;
            }
            fArr[i2] = f5;
        }
        return fArr;
    }

    private Wre n(List list, float f3, float[] fArr) {
        float[] fArrHI = HI(list, f3, fArr);
        if (fArrHI[0] >= 0.5f) {
            return (Wre) list.get((int) fArrHI[2]);
        }
        return (Wre) list.get((int) fArrHI[1]);
    }

    private static int nr(Wre wre, float f3) {
        for (int iRl = wre.rl() - 1; iRl >= 0; iRl--) {
            if (f3 == ((Wre.w6) wre.Uo().get(iRl)).f58791t) {
                return iRl;
            }
        }
        return 0;
    }

    private static Wre o(List list, float f3, float[] fArr) {
        float[] fArrHI = HI(list, f3, fArr);
        return Wre.az((Wre) list.get((int) fArrHI[1]), (Wre) list.get((int) fArrHI[2]), fArrHI[0]);
    }

    private static boolean r(n nVar, Wre wre) {
        int iUo = nVar.Uo();
        if (nVar.t()) {
            iUo = nVar.J2();
        }
        if (wre.KN().rl + (wre.KN().nr / 2.0f) <= iUo && wre.KN() == wre.gh()) {
            return true;
        }
        return false;
    }

    private static int rl(Wre wre, float f3) {
        for (int iXMQ = wre.xMQ(); iXMQ < wre.Uo().size(); iXMQ++) {
            if (f3 == ((Wre.w6) wre.Uo().get(iXMQ)).f58791t) {
                return iXMQ;
            }
        }
        return wre.Uo().size() - 1;
    }
}
