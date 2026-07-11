package j9w;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Wre implements CN3 {
    private static void O(fuX fux, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z2 = true;
            if (length == 1) {
                fux.ck();
                int iN = fux.Uo().n() - fux.n();
                int iJ2 = fux.J2();
                if (iJ2 > iN) {
                    fux.Ik(fux.n() + 1);
                    iN = fux.Uo().n() - fux.n();
                }
                if (iJ2 <= iN && iN <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i2 = length - 1;
            String strT = t(charSequence, 0);
            if (fux.xMQ() || i2 > 2) {
                z2 = false;
            }
            if (i2 <= 2) {
                fux.Ik(fux.n() + i2);
                if (fux.Uo().n() - fux.n() >= 3) {
                    fux.Ik(fux.n() + strT.length());
                    z2 = false;
                }
            }
            if (z2) {
                fux.gh();
                fux.nr -= i2;
            } else {
                fux.o(strT);
            }
        } finally {
            fux.HI(0);
        }
    }

    public int nr() {
        return 4;
    }

    private static void rl(char c2, StringBuilder sb) {
        if (c2 >= ' ' && c2 <= '?') {
            sb.append(c2);
        } else if (c2 < '@' || c2 > '^') {
            aC.O(c2);
        } else {
            sb.append((char) (c2 - '@'));
        }
    }

    @Override // j9w.CN3
    public void n(fuX fux) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!fux.xMQ()) {
                break;
            }
            rl(fux.t(), sb);
            fux.nr++;
            if (sb.length() >= 4) {
                fux.o(t(sb, 0));
                sb.delete(0, 4);
                if (aC.ty(fux.nr(), fux.nr, nr()) != nr()) {
                    fux.HI(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        O(fux, sb);
    }

    Wre() {
    }

    private static String t(CharSequence charSequence, int i2) {
        char cCharAt;
        char cCharAt2;
        int length = charSequence.length() - i2;
        if (length != 0) {
            char cCharAt3 = charSequence.charAt(i2);
            char cCharAt4 = 0;
            if (length >= 2) {
                cCharAt = charSequence.charAt(i2 + 1);
            } else {
                cCharAt = 0;
            }
            if (length >= 3) {
                cCharAt2 = charSequence.charAt(i2 + 2);
            } else {
                cCharAt2 = 0;
            }
            if (length >= 4) {
                cCharAt4 = charSequence.charAt(i2 + 3);
            }
            int i3 = (cCharAt3 << 18) + (cCharAt << '\f') + (cCharAt2 << 6) + cCharAt4;
            char c2 = (char) ((i3 >> 16) & 255);
            char c4 = (char) ((i3 >> 8) & 255);
            char c5 = (char) (i3 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append(c2);
            if (length >= 2) {
                sb.append(c4);
            }
            if (length >= 3) {
                sb.append(c5);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }
}
