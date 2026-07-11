package eK;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f63590n = new Dsr();

    public static final void J2(j x2, int i2) {
        if (VmF.j.nr(Dsr.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x2, "x");
            if (i2 >= x2.t()) {
                return;
            }
            int iT = x2.t();
            int iRl = 1;
            for (int i3 = i2; i3 < iT; i3++) {
                iRl *= x2.rl(i3);
            }
            int[] iArr = new int[i2 + 1];
            for (int i5 = 0; i5 < i2; i5++) {
                iArr[i5] = x2.rl(i5);
            }
            iArr[i2] = iRl;
            x2.nr(iArr);
        } catch (Throwable th) {
            VmF.j.rl(th, Dsr.class);
        }
    }

    public static final j KN(j x2, j w2) {
        if (VmF.j.nr(Dsr.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x2, "x");
            Intrinsics.checkNotNullParameter(w2, "w");
            int iRl = x2.rl(0);
            int iRl2 = w2.rl(0);
            int iRl3 = w2.rl(1);
            j jVar = new j(new int[]{iRl, iRl3});
            float[] fArrN = x2.n();
            float[] fArrN2 = w2.n();
            float[] fArrN3 = jVar.n();
            for (int i2 = 0; i2 < iRl; i2++) {
                for (int i3 = 0; i3 < iRl3; i3++) {
                    int i5 = (i2 * iRl3) + i3;
                    fArrN3[i5] = 0.0f;
                    for (int i7 = 0; i7 < iRl2; i7++) {
                        fArrN3[i5] = fArrN3[i5] + (fArrN[(i2 * iRl2) + i7] * fArrN2[(i7 * iRl3) + i3]);
                    }
                }
            }
            return jVar;
        } catch (Throwable th) {
            VmF.j.rl(th, Dsr.class);
            return null;
        }
    }

    public static final j O(String[] texts, int i2, j w2) {
        if (VmF.j.nr(Dsr.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(w2, "w");
            int length = texts.length;
            int iRl = w2.rl(1);
            j jVar = new j(new int[]{length, i2, iRl});
            float[] fArrN = jVar.n();
            float[] fArrN2 = w2.n();
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArrNr = aC.f63599n.nr(texts[i3], i2);
                for (int i5 = 0; i5 < i2; i5++) {
                    System.arraycopy(fArrN2, iArrNr[i5] * iRl, fArrN, (iRl * i2 * i3) + (iRl * i5), iRl);
                }
            }
            return jVar;
        } catch (Throwable th) {
            VmF.j.rl(th, Dsr.class);
            return null;
        }
    }

    public static final j Uo(j x2, int i2) {
        j jVar;
        j jVar2 = null;
        if (VmF.j.nr(Dsr.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x2, "x");
            int i3 = 0;
            int iRl = x2.rl(0);
            int iRl2 = x2.rl(1);
            int iRl3 = x2.rl(2);
            int i5 = (iRl2 - i2) + 1;
            j jVar3 = new j(new int[]{iRl, i5, iRl3});
            float[] fArrN = x2.n();
            float[] fArrN2 = jVar3.n();
            int i7 = 0;
            while (i7 < iRl) {
                int i8 = i3;
                while (i8 < iRl3) {
                    int i9 = i3;
                    while (i9 < i5) {
                        int i10 = i9 * iRl3;
                        int i11 = (i7 * i5 * iRl3) + i10 + i8;
                        int i12 = (i7 * iRl2 * iRl3) + i10 + i8;
                        fArrN2[i11] = Float.MIN_VALUE;
                        int i13 = i3;
                        while (i13 < i2) {
                            jVar = jVar2;
                            try {
                                fArrN2[i11] = Math.max(fArrN2[i11], fArrN[i12 + (i13 * iRl3)]);
                                i13++;
                                jVar2 = jVar;
                            } catch (Throwable th) {
                                th = th;
                                VmF.j.rl(th, Dsr.class);
                                return jVar;
                            }
                        }
                        i9++;
                        i3 = 0;
                    }
                    i8++;
                    i3 = 0;
                }
                i7++;
                i3 = 0;
            }
            return jVar3;
        } catch (Throwable th2) {
            th = th2;
            jVar = jVar2;
        }
    }

    public static final j gh(j x2) {
        if (VmF.j.nr(Dsr.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x2, "x");
            int iRl = x2.rl(0);
            int iRl2 = x2.rl(1);
            j jVar = new j(new int[]{iRl2, iRl});
            float[] fArrN = x2.n();
            float[] fArrN2 = jVar.n();
            for (int i2 = 0; i2 < iRl; i2++) {
                for (int i3 = 0; i3 < iRl2; i3++) {
                    fArrN2[(i3 * iRl) + i2] = fArrN[(i2 * iRl2) + i3];
                }
            }
            return jVar;
        } catch (Throwable th) {
            VmF.j.rl(th, Dsr.class);
            return null;
        }
    }

    public static final void mUb(j x2) {
        if (VmF.j.nr(Dsr.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x2, "x");
            int iRl = x2.rl(0);
            int iRl2 = x2.rl(1);
            float[] fArrN = x2.n();
            for (int i2 = 0; i2 < iRl; i2++) {
                int i3 = i2 * iRl2;
                int i5 = i3 + iRl2;
                float f3 = Float.MIN_VALUE;
                for (int i7 = i3; i7 < i5; i7++) {
                    float f4 = fArrN[i7];
                    if (f4 > f3) {
                        f3 = f4;
                    }
                }
                float f5 = 0.0f;
                for (int i8 = i3; i8 < i5; i8++) {
                    float fExp = (float) Math.exp(fArrN[i8] - f3);
                    fArrN[i8] = fExp;
                    f5 += fExp;
                }
                while (i3 < i5) {
                    fArrN[i3] = fArrN[i3] / f5;
                    i3++;
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, Dsr.class);
        }
    }

    public static final void n(j x2, j b2) {
        if (VmF.j.nr(Dsr.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x2, "x");
            Intrinsics.checkNotNullParameter(b2, "b");
            int iRl = x2.rl(0);
            int iRl2 = x2.rl(1);
            int iRl3 = x2.rl(2);
            float[] fArrN = x2.n();
            float[] fArrN2 = b2.n();
            for (int i2 = 0; i2 < iRl; i2++) {
                for (int i3 = 0; i3 < iRl2; i3++) {
                    for (int i5 = 0; i5 < iRl3; i5++) {
                        int i7 = (i2 * iRl2 * iRl3) + (i3 * iRl3) + i5;
                        fArrN[i7] = fArrN[i7] + fArrN2[i5];
                    }
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, Dsr.class);
        }
    }

    public static final j nr(j x2, j w2, j b2) {
        if (VmF.j.nr(Dsr.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x2, "x");
            Intrinsics.checkNotNullParameter(w2, "w");
            Intrinsics.checkNotNullParameter(b2, "b");
            int iRl = x2.rl(0);
            int iRl2 = b2.rl(0);
            j jVarKN = KN(x2, w2);
            float[] fArrN = b2.n();
            float[] fArrN2 = jVarKN.n();
            for (int i2 = 0; i2 < iRl; i2++) {
                for (int i3 = 0; i3 < iRl2; i3++) {
                    int i5 = (i2 * iRl2) + i3;
                    fArrN2[i5] = fArrN2[i5] + fArrN[i3];
                }
            }
            return jVarKN;
        } catch (Throwable th) {
            VmF.j.rl(th, Dsr.class);
            return null;
        }
    }

    public static final j qie(j x2) {
        if (VmF.j.nr(Dsr.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x2, "x");
            int iRl = x2.rl(0);
            int iRl2 = x2.rl(1);
            int iRl3 = x2.rl(2);
            j jVar = new j(new int[]{iRl3, iRl2, iRl});
            float[] fArrN = x2.n();
            float[] fArrN2 = jVar.n();
            for (int i2 = 0; i2 < iRl; i2++) {
                for (int i3 = 0; i3 < iRl2; i3++) {
                    for (int i5 = 0; i5 < iRl3; i5++) {
                        fArrN2[(i5 * iRl * iRl2) + (i3 * iRl) + i2] = fArrN[(i2 * iRl2 * iRl3) + (i3 * iRl3) + i5];
                    }
                }
            }
            return jVar;
        } catch (Throwable th) {
            VmF.j.rl(th, Dsr.class);
            return null;
        }
    }

    public static final j rl(j[] tensors) {
        if (VmF.j.nr(Dsr.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(tensors, "tensors");
            int iRl = tensors[0].rl(0);
            int iRl2 = 0;
            for (j jVar : tensors) {
                iRl2 += jVar.rl(1);
            }
            j jVar2 = new j(new int[]{iRl, iRl2});
            float[] fArrN = jVar2.n();
            for (int i2 = 0; i2 < iRl; i2++) {
                int i3 = i2 * iRl2;
                int length = tensors.length;
                for (int i5 = 0; i5 < length; i5++) {
                    float[] fArrN2 = tensors[i5].n();
                    int iRl3 = tensors[i5].rl(1);
                    System.arraycopy(fArrN2, i2 * iRl3, fArrN, i3, iRl3);
                    i3 += iRl3;
                }
            }
            return jVar2;
        } catch (Throwable th) {
            VmF.j.rl(th, Dsr.class);
            return null;
        }
    }

    public static final j t(j x2, j w2) {
        j jVar;
        j jVar2 = null;
        if (VmF.j.nr(Dsr.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(x2, "x");
            Intrinsics.checkNotNullParameter(w2, "w");
            int i2 = 0;
            int iRl = x2.rl(0);
            int iRl2 = x2.rl(1);
            int iRl3 = x2.rl(2);
            int iRl4 = w2.rl(0);
            int i3 = (iRl2 - iRl4) + 1;
            int iRl5 = w2.rl(2);
            j jVar3 = new j(new int[]{iRl, i3, iRl5});
            float[] fArrN = x2.n();
            float[] fArrN2 = jVar3.n();
            float[] fArrN3 = w2.n();
            int i5 = 0;
            while (i5 < iRl) {
                int i7 = i2;
                while (i7 < iRl5) {
                    int i8 = i2;
                    while (i8 < i3) {
                        float f3 = 0.0f;
                        while (i2 < iRl4) {
                            jVar = jVar2;
                            for (int i9 = 0; i9 < iRl3; i9++) {
                                try {
                                    f3 += fArrN[(iRl2 * iRl3 * i5) + ((i2 + i8) * iRl3) + i9] * fArrN3[(((i2 * iRl3) + i9) * iRl5) + i7];
                                } catch (Throwable th) {
                                    th = th;
                                    VmF.j.rl(th, Dsr.class);
                                    return jVar;
                                }
                            }
                            i2++;
                            jVar2 = jVar;
                        }
                        j jVar4 = jVar2;
                        fArrN2[(i3 * iRl5 * i5) + (i8 * iRl5) + i7] = f3;
                        i8++;
                        jVar2 = jVar4;
                        i2 = 0;
                    }
                    i7++;
                    i2 = 0;
                }
                i5++;
                i2 = 0;
            }
            return jVar3;
        } catch (Throwable th2) {
            th = th2;
            jVar = null;
        }
    }

    public static final void xMQ(j x2) {
        if (VmF.j.nr(Dsr.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(x2, "x");
            float[] fArrN = x2.n();
            int length = fArrN.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (fArrN[i2] < 0.0f) {
                    fArrN[i2] = 0.0f;
                }
            }
        } catch (Throwable th) {
            VmF.j.rl(th, Dsr.class);
        }
    }

    private Dsr() {
    }
}
