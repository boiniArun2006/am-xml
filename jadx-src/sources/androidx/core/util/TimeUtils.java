package androidx.core.util;

import androidx.annotation.RestrictTo;
import com.caoccao.javet.interop.engine.JavetEngineConfig;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public final class TimeUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f36710n = new Object();
    private static char[] rl = new char[24];

    private static int n(int i2, int i3, boolean z2, int i5) {
        if (i2 > 99 || (z2 && i5 >= 3)) {
            return i3 + 3;
        }
        if (i2 > 9 || (z2 && i5 >= 2)) {
            return i3 + 2;
        }
        if (z2 || i2 > 0) {
            return i3 + 1;
        }
        return 0;
    }

    private static int nr(char[] cArr, int i2, char c2, int i3, boolean z2, int i5) {
        int i7;
        if (!z2 && i2 <= 0) {
            return i3;
        }
        if ((!z2 || i5 < 3) && i2 <= 99) {
            i7 = i3;
        } else {
            int i8 = i2 / 100;
            cArr[i3] = (char) (i8 + 48);
            i7 = i3 + 1;
            i2 -= i8 * 100;
        }
        if ((z2 && i5 >= 2) || i2 > 9 || i3 != i7) {
            int i9 = i2 / 10;
            cArr[i7] = (char) (i9 + 48);
            i7++;
            i2 -= i9 * 10;
        }
        cArr[i7] = (char) (i2 + 48);
        cArr[i7 + 1] = c2;
        return i7 + 2;
    }

    public static void rl(long j2, StringBuilder sb) {
        synchronized (f36710n) {
            sb.append(rl, 0, t(j2, 0));
        }
    }

    private static int t(long j2, int i2) {
        char c2;
        int i3;
        int i5;
        int i7;
        int i8;
        long j3 = j2;
        if (rl.length < i2) {
            rl = new char[i2];
        }
        char[] cArr = rl;
        if (j3 == 0) {
            int i9 = i2 - 1;
            while (i9 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j3 > 0) {
            c2 = '+';
        } else {
            j3 = -j3;
            c2 = '-';
        }
        int i10 = (int) (j3 % 1000);
        int iFloor = (int) Math.floor(j3 / 1000);
        if (iFloor > 86400) {
            i3 = iFloor / 86400;
            iFloor -= 86400 * i3;
        } else {
            i3 = 0;
        }
        if (iFloor > 3600) {
            i5 = iFloor / JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS;
            iFloor -= i5 * JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS;
        } else {
            i5 = 0;
        }
        if (iFloor > 60) {
            int i11 = iFloor / 60;
            iFloor -= i11 * 60;
            i7 = i11;
        } else {
            i7 = 0;
        }
        if (i2 != 0) {
            int iN = n(i3, 1, false, 0);
            int iN2 = iN + n(i5, 1, iN > 0, 2);
            int iN3 = iN2 + n(i7, 1, iN2 > 0, 2);
            int iN4 = iN3 + n(iFloor, 1, iN3 > 0, 2);
            i8 = 0;
            for (int iN5 = iN4 + n(i10, 2, true, iN4 > 0 ? 3 : 0) + 1; iN5 < i2; iN5++) {
                cArr[i8] = ' ';
                i8++;
            }
        } else {
            i8 = 0;
        }
        cArr[i8] = c2;
        int i12 = i8 + 1;
        boolean z2 = i2 != 0;
        int iNr = nr(cArr, i3, 'd', i12, false, 0);
        int iNr2 = nr(cArr, i5, 'h', iNr, iNr != i12, z2 ? 2 : 0);
        int iNr3 = nr(cArr, i7, 'm', iNr2, iNr2 != i12, z2 ? 2 : 0);
        int iNr4 = nr(cArr, iFloor, 's', iNr3, iNr3 != i12, z2 ? 2 : 0);
        int iNr5 = nr(cArr, i10, 'm', iNr4, true, (!z2 || iNr4 == i12) ? 0 : 3);
        cArr[iNr5] = 's';
        return iNr5 + 1;
    }
}
