package P6;

import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import bq4.w6;
import com.google.android.exoplayer2.C;
import com.googleac.zxing.WriterException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f7580n = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    static byte[] HI(byte[] bArr, int i2) {
        int length = bArr.length;
        int[] iArr = new int[length + i2];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = bArr[i3] & UByte.MAX_VALUE;
        }
        new OQ.w6(OQ.j.qie).rl(iArr, i2);
        byte[] bArr2 = new byte[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            bArr2[i5] = (byte) iArr[length + i5];
        }
        return bArr2;
    }

    private static bq4.w6 Z(bq4.j jVar, bq4.n nVar, b1b.j jVar2, b1b.j jVar3) {
        return az(xMQ(nVar, jVar2, jVar3, az(xMQ(nVar, jVar2, jVar3, bq4.w6.O(1)), jVar)), jVar);
    }

    private static bq4.w6 az(int i2, bq4.j jVar) throws WriterException {
        for (int i3 = 1; i3 <= 40; i3++) {
            bq4.w6 w6VarO = bq4.w6.O(i3);
            if (S(i2, w6VarO, jVar)) {
                return w6VarO;
            }
        }
        throw new WriterException("Data too big");
    }

    private static boolean o(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = bytes[i2] & UByte.MAX_VALUE;
                if ((i3 < 129 || i3 > 159) && (i3 < 224 || i3 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static /* synthetic */ class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f7581n;

        static {
            int[] iArr = new int[bq4.n.values().length];
            f7581n = iArr;
            try {
                iArr[bq4.n.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7581n[bq4.n.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7581n[bq4.n.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7581n[bq4.n.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void Ik(int i2, int i3, int i5, int i7, int[] iArr, int[] iArr2) throws WriterException {
        if (i7 >= i5) {
            throw new WriterException("Block ID too large");
        }
        int i8 = i2 % i5;
        int i9 = i5 - i8;
        int i10 = i2 / i5;
        int i11 = i10 + 1;
        int i12 = i3 / i5;
        int i13 = i12 + 1;
        int i14 = i10 - i12;
        int i15 = i11 - i13;
        if (i14 != i15) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i5 != i9 + i8) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i2 != ((i12 + i14) * i9) + ((i13 + i15) * i8)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i7 < i9) {
            iArr[0] = i12;
            iArr2[0] = i14;
        } else {
            iArr[0] = i13;
            iArr2[0] = i15;
        }
    }

    static void O(String str, b1b.j jVar) throws WriterException {
        int i2;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            if (bytes.length % 2 != 0) {
                throw new WriterException("Kanji byte size not even");
            }
            int length = bytes.length - 1;
            for (int i3 = 0; i3 < length; i3 += 2) {
                int i5 = ((bytes[i3] & UByte.MAX_VALUE) << 8) | (bytes[i3 + 1] & UByte.MAX_VALUE);
                int i7 = 33088;
                if (i5 >= 33088 && i5 <= 40956) {
                    i2 = i5 - i7;
                } else if (i5 < 57408 || i5 > 60351) {
                    i2 = -1;
                } else {
                    i7 = 49472;
                    i2 = i5 - i7;
                }
                if (i2 == -1) {
                    throw new WriterException("Invalid byte sequence");
                }
                jVar.t(((i2 >> 8) * 192) + (i2 & 255), 13);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new WriterException(e2);
        }
    }

    static void XQ(int i2, b1b.j jVar) throws WriterException {
        int i3 = i2 * 8;
        if (jVar.KN() > i3) {
            throw new WriterException("data bits cannot fit in the QR Code" + jVar.KN() + " > " + i3);
        }
        for (int i5 = 0; i5 < 4 && jVar.KN() < i3; i5++) {
            jVar.n(false);
        }
        int iKN = jVar.KN() & 7;
        if (iKN > 0) {
            while (iKN < 8) {
                jVar.n(false);
                iKN++;
            }
        }
        int iXMQ = i2 - jVar.xMQ();
        for (int i7 = 0; i7 < iXMQ; i7++) {
            jVar.t((i7 & 1) == 0 ? 236 : 17, 8);
        }
        if (jVar.KN() != i3) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    static int ck(int i2) {
        int[] iArr = f7580n;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    private static void nr(b1b.w6 w6Var, b1b.j jVar) {
        jVar.t(bq4.n.ECI.rl(), 4);
        jVar.t(w6Var.t(), 8);
    }

    private static bq4.n qie(String str, String str2) {
        if ("Shift_JIS".equals(str2) && o(str)) {
            return bq4.n.KANJI;
        }
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z3 = true;
            } else {
                if (ck(cCharAt) == -1) {
                    return bq4.n.BYTE;
                }
                z2 = true;
            }
        }
        return z2 ? bq4.n.ALPHANUMERIC : z3 ? bq4.n.NUMERIC : bq4.n.BYTE;
    }

    static void t(String str, bq4.n nVar, b1b.j jVar, String str2) throws WriterException {
        int i2 = j.f7581n[nVar.ordinal()];
        if (i2 == 1) {
            KN(str, jVar);
            return;
        }
        if (i2 == 2) {
            rl(str, jVar);
            return;
        }
        if (i2 == 3) {
            n(str, jVar, str2);
        } else {
            if (i2 == 4) {
                O(str, jVar);
                return;
            }
            throw new WriterException("Invalid mode: " + nVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Wre ty(String str, bq4.j jVar, Map map) throws WriterException {
        bq4.w6 w6VarZ;
        b1b.w6 w6VarRl;
        boolean z2 = map != null && map.containsKey(WS.n.CHARACTER_SET);
        String string = z2 ? map.get(WS.n.CHARACTER_SET).toString() : C.ISO88591_NAME;
        bq4.n nVarQie = qie(str, string);
        b1b.j jVar2 = new b1b.j();
        bq4.n nVar = bq4.n.BYTE;
        if (nVarQie == nVar && z2 && (w6VarRl = b1b.w6.rl(string)) != null) {
            nr(w6VarRl, jVar2);
        }
        if (map != null) {
            WS.n nVar2 = WS.n.GS1_FORMAT;
            if (map.containsKey(nVar2) && Boolean.valueOf(map.get(nVar2).toString()).booleanValue()) {
                Uo(bq4.n.FNC1_FIRST_POSITION, jVar2);
            }
        }
        Uo(nVarQie, jVar2);
        b1b.j jVar3 = new b1b.j();
        t(str, nVarQie, jVar3, string);
        if (map != null) {
            WS.n nVar3 = WS.n.QR_VERSION;
            if (map.containsKey(nVar3)) {
                w6VarZ = bq4.w6.O(Integer.parseInt(map.get(nVar3).toString()));
                if (!S(xMQ(nVarQie, jVar2, jVar3, w6VarZ), w6VarZ, jVar)) {
                    throw new WriterException("Data too big for requested version");
                }
            } else {
                w6VarZ = Z(jVar, nVarQie, jVar2, jVar3);
            }
        }
        b1b.j jVar4 = new b1b.j();
        jVar4.rl(jVar2);
        J2(nVarQie == nVar ? jVar3.xMQ() : str.length(), w6VarZ, nVarQie, jVar4);
        jVar4.rl(jVar3);
        w6.n nVarT = w6VarZ.t(jVar);
        int iNr = w6VarZ.nr() - nVarT.nr();
        XQ(iNr, jVar4);
        b1b.j jVarR = r(jVar4, w6VarZ.nr(), iNr, nVarT.t());
        Wre wre = new Wre();
        wre.t(jVar);
        wre.J2(nVarQie);
        wre.Uo(w6VarZ);
        int iRl = w6VarZ.rl();
        n nVar4 = new n(iRl, iRl);
        int iGh = gh(jVarR, jVar, w6VarZ, nVar4);
        wre.nr(iGh);
        I28.n(jVarR, jVar, w6VarZ, iGh, nVar4);
        wre.O(nVar4);
        return wre;
    }

    static void J2(int i2, bq4.w6 w6Var, bq4.n nVar, b1b.j jVar) throws WriterException {
        int iT = nVar.t(w6Var);
        int i3 = 1 << iT;
        if (i2 < i3) {
            jVar.t(i2, iT);
            return;
        }
        throw new WriterException(i2 + " is bigger than " + (i3 - 1));
    }

    static void KN(CharSequence charSequence, b1b.j jVar) {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int iCharAt = charSequence.charAt(i2) - '0';
            int i3 = i2 + 2;
            if (i3 < length) {
                jVar.t((iCharAt * 100) + ((charSequence.charAt(i2 + 1) - '0') * 10) + (charSequence.charAt(i3) - '0'), 10);
                i2 += 3;
            } else {
                i2++;
                if (i2 < length) {
                    jVar.t((iCharAt * 10) + (charSequence.charAt(i2) - '0'), 7);
                    i2 = i3;
                } else {
                    jVar.t(iCharAt, 4);
                }
            }
        }
    }

    private static boolean S(int i2, bq4.w6 w6Var, bq4.j jVar) {
        if (w6Var.nr() - w6Var.t(jVar).nr() >= (i2 + 7) / 8) {
            return true;
        }
        return false;
    }

    static void Uo(bq4.n nVar, b1b.j jVar) {
        jVar.t(nVar.rl(), 4);
    }

    private static int gh(b1b.j jVar, bq4.j jVar2, bq4.w6 w6Var, n nVar) throws WriterException {
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i5 = 0; i5 < 8; i5++) {
            I28.n(jVar, jVar2, w6Var, i5, nVar);
            int iMUb = mUb(nVar);
            if (iMUb < i2) {
                i3 = i5;
                i2 = iMUb;
            }
        }
        return i3;
    }

    private static int mUb(n nVar) {
        return Ml.n(nVar) + Ml.t(nVar) + Ml.nr(nVar) + Ml.O(nVar);
    }

    static void n(String str, b1b.j jVar, String str2) throws WriterException {
        try {
            for (byte b2 : str.getBytes(str2)) {
                jVar.t(b2, 8);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new WriterException(e2);
        }
    }

    static b1b.j r(b1b.j jVar, int i2, int i3, int i5) throws WriterException {
        if (jVar.xMQ() == i3) {
            ArrayList arrayList = new ArrayList(i5);
            int i7 = 0;
            int i8 = 0;
            int iMax = 0;
            int iMax2 = 0;
            while (i7 < i5) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                int i9 = i2;
                int i10 = i3;
                int i11 = i5;
                Ik(i9, i10, i11, i7, iArr, iArr2);
                int i12 = iArr[0];
                byte[] bArr = new byte[i12];
                jVar.gh(i8 * 8, bArr, 0, i12);
                byte[] bArrHI = HI(bArr, iArr2[0]);
                arrayList.add(new P6.j(bArr, bArrHI));
                iMax = Math.max(iMax, i12);
                iMax2 = Math.max(iMax2, bArrHI.length);
                i8 += iArr[0];
                i7++;
                i2 = i9;
                i3 = i10;
                i5 = i11;
            }
            int i13 = i2;
            if (i3 == i8) {
                b1b.j jVar2 = new b1b.j();
                for (int i14 = 0; i14 < iMax; i14++) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        byte[] bArrN = ((P6.j) it.next()).n();
                        if (i14 < bArrN.length) {
                            jVar2.t(bArrN[i14], 8);
                        }
                    }
                }
                for (int i15 = 0; i15 < iMax2; i15++) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        byte[] bArrRl = ((P6.j) it2.next()).rl();
                        if (i15 < bArrRl.length) {
                            jVar2.t(bArrRl[i15], 8);
                        }
                    }
                }
                if (i13 == jVar2.xMQ()) {
                    return jVar2;
                }
                throw new WriterException("Interleaving error: " + i13 + " and " + jVar2.xMQ() + " differ.");
            }
            throw new WriterException(qUrazMnwDskFs.qtJv);
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    static void rl(CharSequence charSequence, b1b.j jVar) throws WriterException {
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int iCk = ck(charSequence.charAt(i2));
            if (iCk != -1) {
                int i3 = i2 + 1;
                if (i3 < length) {
                    int iCk2 = ck(charSequence.charAt(i3));
                    if (iCk2 != -1) {
                        jVar.t((iCk * 45) + iCk2, 11);
                        i2 += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    jVar.t(iCk, 6);
                    i2 = i3;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    private static int xMQ(bq4.n nVar, b1b.j jVar, b1b.j jVar2, bq4.w6 w6Var) {
        return jVar.KN() + nVar.t(w6Var) + jVar2.KN();
    }
}
