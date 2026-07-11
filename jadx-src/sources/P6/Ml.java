package P6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
abstract class Ml {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean J2(int i2, int i3, int i5) {
        int i7;
        int i8;
        switch (i2) {
            case 0:
                i5 += i3;
                i7 = i5 & 1;
                return i7 != 0;
            case 1:
                i7 = i5 & 1;
                if (i7 != 0) {
                }
                break;
            case 2:
                i7 = i3 % 3;
                if (i7 != 0) {
                }
                break;
            case 3:
                i7 = (i5 + i3) % 3;
                if (i7 != 0) {
                }
                break;
            case 4:
                i5 /= 2;
                i3 /= 3;
                i5 += i3;
                i7 = i5 & 1;
                if (i7 != 0) {
                }
                break;
            case 5:
                int i9 = i5 * i3;
                i7 = (i9 & 1) + (i9 % 3);
                if (i7 != 0) {
                }
                break;
            case 6:
                int i10 = i5 * i3;
                i8 = (i10 & 1) + (i10 % 3);
                i7 = i8 & 1;
                if (i7 != 0) {
                }
                break;
            case 7:
                i8 = ((i5 * i3) % 3) + ((i5 + i3) & 1);
                i7 = i8 & 1;
                if (i7 != 0) {
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: " + i2);
        }
    }

    private static boolean KN(byte[][] bArr, int i2, int i3, int i5) {
        int iMin = Math.min(i5, bArr.length);
        for (int iMax = Math.max(i3, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i2] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean Uo(byte[] bArr, int i2, int i3) {
        int iMin = Math.min(i3, bArr.length);
        for (int iMax = Math.max(i2, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    static int n(n nVar) {
        return rl(nVar, true) + rl(nVar, false);
    }

    private static int rl(n nVar, boolean z2) {
        int iNr = z2 ? nVar.nr() : nVar.O();
        int iO = z2 ? nVar.O() : nVar.nr();
        byte[][] bArrT = nVar.t();
        int i2 = 0;
        for (int i3 = 0; i3 < iNr; i3++) {
            byte b2 = -1;
            int i5 = 0;
            for (int i7 = 0; i7 < iO; i7++) {
                byte b4 = z2 ? bArrT[i3][i7] : bArrT[i7][i3];
                if (b4 == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i2 += i5 - 2;
                    }
                    i5 = 1;
                    b2 = b4;
                }
            }
            if (i5 >= 5) {
                i2 += i5 - 2;
            }
        }
        return i2;
    }

    static int O(n nVar) {
        byte[][] bArrT = nVar.t();
        int iO = nVar.O();
        int iNr = nVar.nr();
        int i2 = 0;
        for (int i3 = 0; i3 < iNr; i3++) {
            byte[] bArr = bArrT[i3];
            for (int i5 = 0; i5 < iO; i5++) {
                if (bArr[i5] == 1) {
                    i2++;
                }
            }
        }
        int iNr2 = nVar.nr() * nVar.O();
        return ((Math.abs((i2 * 2) - iNr2) * 10) / iNr2) * 10;
    }

    static int nr(n nVar) {
        byte[][] bArrT = nVar.t();
        int iO = nVar.O();
        int iNr = nVar.nr();
        int i2 = 0;
        for (int i3 = 0; i3 < iNr; i3++) {
            for (int i5 = 0; i5 < iO; i5++) {
                byte[] bArr = bArrT[i3];
                int i7 = i5 + 6;
                if (i7 < iO && bArr[i5] == 1 && bArr[i5 + 1] == 0 && bArr[i5 + 2] == 1 && bArr[i5 + 3] == 1 && bArr[i5 + 4] == 1 && bArr[i5 + 5] == 0 && bArr[i7] == 1 && (Uo(bArr, i5 - 4, i5) || Uo(bArr, i5 + 7, i5 + 11))) {
                    i2++;
                }
                int i8 = i3 + 6;
                if (i8 < iNr && bArrT[i3][i5] == 1 && bArrT[i3 + 1][i5] == 0 && bArrT[i3 + 2][i5] == 1 && bArrT[i3 + 3][i5] == 1 && bArrT[i3 + 4][i5] == 1 && bArrT[i3 + 5][i5] == 0 && bArrT[i8][i5] == 1 && (KN(bArrT, i5, i3 - 4, i3) || KN(bArrT, i5, i3 + 7, i3 + 11))) {
                    i2++;
                }
            }
        }
        return i2 * 40;
    }

    static int t(n nVar) {
        byte[][] bArrT = nVar.t();
        int iO = nVar.O();
        int iNr = nVar.nr();
        int i2 = 0;
        for (int i3 = 0; i3 < iNr - 1; i3++) {
            byte[] bArr = bArrT[i3];
            int i5 = 0;
            while (i5 < iO - 1) {
                byte b2 = bArr[i5];
                int i7 = i5 + 1;
                if (b2 == bArr[i7]) {
                    byte[] bArr2 = bArrT[i3 + 1];
                    if (b2 == bArr2[i5] && b2 == bArr2[i7]) {
                        i2++;
                    }
                }
                i5 = i7;
            }
        }
        return i2 * 3;
    }
}
