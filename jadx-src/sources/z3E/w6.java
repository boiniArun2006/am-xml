package z3E;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f76359n = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static UM.j Uo(int i2) {
        if (i2 == 4) {
            return UM.j.gh;
        }
        if (i2 == 6) {
            return UM.j.mUb;
        }
        if (i2 == 8) {
            return UM.j.ty;
        }
        if (i2 == 10) {
            return UM.j.xMQ;
        }
        if (i2 == 12) {
            return UM.j.KN;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i2)));
    }

    private static void rl(x4x.n nVar, int i2, int i3) {
        for (int i5 = 0; i5 < i3; i5 += 2) {
            int i7 = i2 - i5;
            int i8 = i7;
            while (true) {
                int i9 = i2 + i5;
                if (i8 <= i9) {
                    nVar.KN(i8, i7);
                    nVar.KN(i8, i9);
                    nVar.KN(i7, i8);
                    nVar.KN(i9, i8);
                    i8++;
                }
            }
        }
        int i10 = i2 - i3;
        nVar.KN(i10, i10);
        int i11 = i10 + 1;
        nVar.KN(i11, i10);
        nVar.KN(i10, i11);
        int i12 = i2 + i3;
        nVar.KN(i12, i10);
        nVar.KN(i12, i11);
        nVar.KN(i12, i12 - 1);
    }

    static x4x.j J2(boolean z2, int i2, int i3) {
        x4x.j jVar = new x4x.j();
        if (z2) {
            jVar.t(i2 - 1, 2);
            jVar.t(i3 - 1, 6);
            return O(jVar, 28, 4);
        }
        jVar.t(i2 - 1, 5);
        jVar.t(i3 - 1, 11);
        return O(jVar, 40, 4);
    }

    static x4x.j KN(x4x.j jVar, int i2) {
        x4x.j jVar2 = new x4x.j();
        int iKN = jVar.KN();
        int i3 = (1 << i2) - 2;
        int i5 = 0;
        while (i5 < iKN) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                int i9 = i5 + i8;
                if (i9 >= iKN || jVar.J2(i9)) {
                    i7 |= 1 << ((i2 - 1) - i8);
                }
            }
            int i10 = i7 & i3;
            if (i10 == i3) {
                jVar2.t(i10, i2);
            } else if (i10 == 0) {
                jVar2.t(i7 | 1, i2);
            } else {
                jVar2.t(i7, i2);
                i5 += i2;
            }
            i5--;
            i5 += i2;
        }
        return jVar2;
    }

    private static int[] n(x4x.j jVar, int i2, int i3) {
        int[] iArr = new int[i3];
        int iKN = jVar.KN() / i2;
        for (int i5 = 0; i5 < iKN; i5++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= jVar.J2((i5 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i5] = i7;
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j nr(byte[] bArr, int i2, int i3) {
        x4x.j jVarKN;
        int i5;
        boolean z2;
        int iAbs;
        int iXMQ;
        int i7;
        int i8;
        x4x.j jVarN = new Ml(bArr).n();
        int iKN = ((jVarN.KN() * i2) / 100) + 11;
        int iKN2 = jVarN.KN() + iKN;
        int i9 = 1;
        if (i3 == 0) {
            x4x.j jVarKN2 = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 <= 32) {
                boolean z3 = i10 <= 3 ? i9 : 0;
                int i12 = z3 != 0 ? i10 + 1 : i10;
                int iXMQ2 = xMQ(i12, z3);
                if (iKN2 <= iXMQ2) {
                    if (jVarKN2 == null || i11 != f76359n[i12]) {
                        int i13 = f76359n[i12];
                        i11 = i13;
                        jVarKN2 = KN(jVarN, i13);
                    }
                    int i14 = iXMQ2 - (iXMQ2 % i11);
                    if ((z3 == 0 || jVarKN2.KN() <= (i11 << 6)) && jVarKN2.KN() + iKN <= i14) {
                        jVarKN = jVarKN2;
                        i5 = i11;
                        z2 = z3;
                        iAbs = i12;
                        iXMQ = iXMQ2;
                    }
                }
                i10++;
                i9 = i9;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        boolean z4 = i3 < 0;
        iAbs = Math.abs(i3);
        if (iAbs > (z4 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i3)));
        }
        iXMQ = xMQ(iAbs, z4);
        i5 = f76359n[iAbs];
        int i15 = iXMQ - (iXMQ % i5);
        jVarKN = KN(jVarN, i5);
        z2 = z4;
        if (jVarKN.KN() + iKN > i15) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z4) {
            z2 = z4;
            if (jVarKN.KN() > (i5 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        }
        x4x.j jVarO = O(jVarKN, iXMQ, i5);
        int iKN3 = jVarKN.KN() / i5;
        x4x.j jVarJ2 = J2(z2, iAbs, iKN3);
        int i16 = (z2 ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i16];
        int i17 = 2;
        if (z2) {
            for (int i18 = 0; i18 < i16; i18++) {
                iArr[i18] = i18;
            }
            i7 = i16;
        } else {
            int i19 = i16 / 2;
            i7 = i16 + 1 + (((i19 - 1) / 15) * 2);
            int i20 = i7 / 2;
            for (int i21 = 0; i21 < i19; i21++) {
                iArr[(i19 - i21) - i9] = (i20 - r14) - 1;
                iArr[i19 + i21] = (i21 / 15) + i21 + i20 + i9;
            }
        }
        x4x.n nVar = new x4x.n(i7);
        int i22 = 0;
        for (int i23 = 0; i23 < iAbs; i23++) {
            int i24 = ((iAbs - i23) << i17) + (z2 ? 9 : 12);
            for (int i25 = 0; i25 < i24; i25++) {
                int i26 = i25 << 1;
                int i27 = 0;
                while (i27 < i17) {
                    int i28 = i9;
                    if (jVarO.J2(i22 + i26 + i27)) {
                        int i29 = i23 << 1;
                        i8 = i17;
                        nVar.KN(iArr[i29 + i27], iArr[i29 + i25]);
                    } else {
                        i8 = i17;
                    }
                    if (jVarO.J2((i24 << 1) + i22 + i26 + i27)) {
                        int i30 = i23 << 1;
                        nVar.KN(iArr[i30 + i25], iArr[((i16 - 1) - i30) - i27]);
                    }
                    if (jVarO.J2((i24 << 2) + i22 + i26 + i27)) {
                        int i31 = (i16 - 1) - (i23 << 1);
                        nVar.KN(iArr[i31 - i27], iArr[i31 - i25]);
                    }
                    if (jVarO.J2((i24 * 6) + i22 + i26 + i27)) {
                        int i32 = i23 << 1;
                        nVar.KN(iArr[((i16 - 1) - i32) - i25], iArr[i32 + i27]);
                    }
                    i27++;
                    i9 = i28;
                    i17 = i8;
                }
            }
            i22 += i24 << 3;
        }
        t(nVar, z2, i7, jVarJ2);
        if (z2) {
            rl(nVar, i7 / 2, 5);
        } else {
            int i33 = i7 / 2;
            rl(nVar, i33, 7);
            int i34 = 0;
            int i35 = 0;
            while (i35 < (i16 / 2) - 1) {
                for (int i36 = i33 & 1; i36 < i7; i36 += 2) {
                    int i37 = i33 - i34;
                    nVar.KN(i37, i36);
                    int i38 = i33 + i34;
                    nVar.KN(i38, i36);
                    nVar.KN(i36, i37);
                    nVar.KN(i36, i38);
                }
                i35 += 15;
                i34 += 16;
            }
        }
        j jVar = new j();
        jVar.t(z2);
        jVar.J2(i7);
        jVar.nr(iAbs);
        jVar.rl(iKN3);
        jVar.O(nVar);
        return jVar;
    }

    private static void t(x4x.n nVar, boolean z2, int i2, x4x.j jVar) {
        int i3 = i2 / 2;
        int i5 = 0;
        if (z2) {
            while (i5 < 7) {
                int i7 = (i3 - 3) + i5;
                if (jVar.J2(i5)) {
                    nVar.KN(i7, i3 - 5);
                }
                if (jVar.J2(i5 + 7)) {
                    nVar.KN(i3 + 5, i7);
                }
                if (jVar.J2(20 - i5)) {
                    nVar.KN(i7, i3 + 5);
                }
                if (jVar.J2(27 - i5)) {
                    nVar.KN(i3 - 5, i7);
                }
                i5++;
            }
            return;
        }
        while (i5 < 10) {
            int i8 = (i3 - 5) + i5 + (i5 / 5);
            if (jVar.J2(i5)) {
                nVar.KN(i8, i3 - 7);
            }
            if (jVar.J2(i5 + 10)) {
                nVar.KN(i3 + 7, i8);
            }
            if (jVar.J2(29 - i5)) {
                nVar.KN(i8, i3 + 7);
            }
            if (jVar.J2(39 - i5)) {
                nVar.KN(i3 - 7, i8);
            }
            i5++;
        }
    }

    private static int xMQ(int i2, boolean z2) {
        return ((z2 ? 88 : 112) + (i2 << 4)) * i2;
    }

    private static x4x.j O(x4x.j jVar, int i2, int i3) {
        int iKN = jVar.KN() / i3;
        UM.w6 w6Var = new UM.w6(Uo(i3));
        int i5 = i2 / i3;
        int[] iArrN = n(jVar, i3, i5);
        w6Var.rl(iArrN, i5 - iKN);
        x4x.j jVar2 = new x4x.j();
        jVar2.t(0, i2 % i3);
        for (int i7 : iArrN) {
            jVar2.t(i7, i3);
        }
        return jVar2;
    }
}
