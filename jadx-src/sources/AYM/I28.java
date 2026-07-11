package AYM;

import com.google.zxing.WriterException;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[][] f84n = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] rl = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int[][] f85t = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, -1, -1}, new int[]{6, 26, 50, 74, 98, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] nr = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static boolean HI(int i2) {
        return i2 == -1;
    }

    private static void KN(int i2, int i3, n nVar) {
        for (int i5 = 0; i5 < 5; i5++) {
            int[] iArr = rl[i5];
            for (int i7 = 0; i7 < 5; i7++) {
                nVar.J2(i2 + i7, i3 + i5, iArr[i7]);
            }
        }
    }

    private static void Uo(int i2, int i3, n nVar) throws WriterException {
        for (int i5 = 0; i5 < 8; i5++) {
            int i7 = i2 + i5;
            if (!HI(nVar.rl(i7, i3))) {
                throw new WriterException();
            }
            nVar.J2(i7, i3, 0);
        }
    }

    private static void az(int i2, int i3, n nVar) throws WriterException {
        for (int i5 = 0; i5 < 7; i5++) {
            int i7 = i3 + i5;
            if (!HI(nVar.rl(i2, i7))) {
                throw new WriterException();
            }
            nVar.J2(i2, i7, 0);
        }
    }

    static void t(n nVar) {
        nVar.n((byte) -1);
    }

    private static void xMQ(int i2, int i3, n nVar) {
        for (int i5 = 0; i5 < 7; i5++) {
            int[] iArr = f84n[i5];
            for (int i7 = 0; i7 < 7; i7++) {
                nVar.J2(i2 + i7, i3 + i5, iArr[i7]);
            }
        }
    }

    private static void gh(n nVar) {
        int i2 = 8;
        while (i2 < nVar.O() - 8) {
            int i3 = i2 + 1;
            int i5 = i3 % 2;
            if (HI(nVar.rl(i2, 6))) {
                nVar.J2(i2, 6, i5);
            }
            if (HI(nVar.rl(6, i2))) {
                nVar.J2(6, i2, i5);
            }
            i2 = i3;
        }
    }

    private static void mUb(n nVar) throws WriterException {
        int length = f84n[0].length;
        xMQ(0, 0, nVar);
        xMQ(nVar.O() - length, 0, nVar);
        xMQ(0, nVar.O() - length, nVar);
        Uo(0, 7, nVar);
        Uo(nVar.O() - 8, 7, nVar);
        Uo(0, nVar.O() - 8, nVar);
        az(7, 0, nVar);
        az(nVar.nr() - 8, 0, nVar);
        az(7, nVar.nr() - 7, nVar);
    }

    static void qie(Cwp.j jVar, int i2, n nVar) throws WriterException {
        x4x.j jVar2 = new x4x.j();
        ck(jVar, i2, jVar2);
        for (int i3 = 0; i3 < jVar2.KN(); i3++) {
            boolean zJ2 = jVar2.J2((jVar2.KN() - 1) - i3);
            int[] iArr = nr[i3];
            nVar.Uo(iArr[0], iArr[1], zJ2);
            if (i3 < 8) {
                nVar.Uo((nVar.O() - i3) - 1, 8, zJ2);
            } else {
                nVar.Uo(8, (nVar.nr() - 7) + (i3 - 8), zJ2);
            }
        }
    }

    static int rl(int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iTy = ty(i3);
        int iTy2 = i2 << (iTy - 1);
        while (ty(iTy2) >= iTy) {
            iTy2 ^= i3 << (ty(iTy2) - iTy);
        }
        return iTy2;
    }

    static void Ik(Cwp.w6 w6Var, x4x.j jVar) throws WriterException {
        jVar.t(w6Var.J2(), 6);
        jVar.t(rl(w6Var.J2(), 7973), 12);
        if (jVar.KN() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + jVar.KN());
    }

    static void J2(x4x.j jVar, int i2, n nVar) throws WriterException {
        boolean zJ2;
        int iO = nVar.O() - 1;
        int iNr = nVar.nr() - 1;
        int i3 = 0;
        int i5 = -1;
        while (iO > 0) {
            if (iO == 6) {
                iO--;
            }
            while (iNr >= 0 && iNr < nVar.nr()) {
                for (int i7 = 0; i7 < 2; i7++) {
                    int i8 = iO - i7;
                    if (HI(nVar.rl(i8, iNr))) {
                        if (i3 < jVar.KN()) {
                            zJ2 = jVar.J2(i3);
                            i3++;
                        } else {
                            zJ2 = false;
                        }
                        if (i2 != -1 && Ml.J2(i2, i8, iNr)) {
                            zJ2 = !zJ2;
                        }
                        nVar.Uo(i8, iNr, zJ2);
                    }
                }
                iNr += i5;
            }
            i5 = -i5;
            iNr += i5;
            iO -= 2;
        }
        if (i3 == jVar.KN()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i3 + '/' + jVar.KN());
    }

    private static void O(n nVar) throws WriterException {
        if (nVar.rl(8, nVar.nr() - 8) != 0) {
            nVar.J2(8, nVar.nr() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    static void ck(Cwp.j jVar, int i2, x4x.j jVar2) throws WriterException {
        if (Wre.rl(i2)) {
            int iN = (jVar.n() << 3) | i2;
            jVar2.t(iN, 5);
            jVar2.t(rl(iN, 1335), 10);
            x4x.j jVar3 = new x4x.j();
            jVar3.t(21522, 15);
            jVar2.qie(jVar3);
            if (jVar2.KN() == 15) {
                return;
            }
            throw new WriterException("should not happen but we got: " + jVar2.KN());
        }
        throw new WriterException("Invalid mask pattern");
    }

    static void n(x4x.j jVar, Cwp.j jVar2, Cwp.w6 w6Var, int i2, n nVar) throws WriterException {
        t(nVar);
        nr(w6Var, nVar);
        qie(jVar2, i2, nVar);
        o(w6Var, nVar);
        J2(jVar, i2, nVar);
    }

    static void nr(Cwp.w6 w6Var, n nVar) throws WriterException {
        mUb(nVar);
        O(nVar);
        r(w6Var, nVar);
        gh(nVar);
    }

    static void o(Cwp.w6 w6Var, n nVar) throws WriterException {
        if (w6Var.J2() >= 7) {
            x4x.j jVar = new x4x.j();
            Ik(w6Var, jVar);
            int i2 = 17;
            for (int i3 = 0; i3 < 6; i3++) {
                for (int i5 = 0; i5 < 3; i5++) {
                    boolean zJ2 = jVar.J2(i2);
                    i2--;
                    nVar.Uo(i3, (nVar.nr() - 11) + i5, zJ2);
                    nVar.Uo((nVar.nr() - 11) + i5, i3, zJ2);
                }
            }
        }
    }

    private static void r(Cwp.w6 w6Var, n nVar) {
        if (w6Var.J2() >= 2) {
            int[] iArr = f85t[w6Var.J2() - 1];
            for (int i2 : iArr) {
                if (i2 >= 0) {
                    for (int i3 : iArr) {
                        if (i3 >= 0 && HI(nVar.rl(i3, i2))) {
                            KN(i3 - 2, i2 - 2, nVar);
                        }
                    }
                }
            }
        }
    }

    static int ty(int i2) {
        return 32 - Integer.numberOfLeadingZeros(i2);
    }
}
