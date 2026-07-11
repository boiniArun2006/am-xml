package j9w;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class w6 implements CN3 {
    static void Uo(fuX fux, StringBuilder sb) {
        fux.o(nr(sb, 0));
        sb.delete(0, 3);
    }

    public int O() {
        return 1;
    }

    int t(char c2, StringBuilder sb) {
        if (c2 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c2 >= '0' && c2 <= '9') {
            sb.append((char) (c2 - ','));
            return 1;
        }
        if (c2 >= 'A' && c2 <= 'Z') {
            sb.append((char) (c2 - '3'));
            return 1;
        }
        if (c2 < ' ') {
            sb.append((char) 0);
            sb.append(c2);
            return 2;
        }
        if (c2 >= '!' && c2 <= '/') {
            sb.append((char) 1);
            sb.append((char) (c2 - '!'));
            return 2;
        }
        if (c2 >= ':' && c2 <= '@') {
            sb.append((char) 1);
            sb.append((char) (c2 - '+'));
            return 2;
        }
        if (c2 >= '[' && c2 <= '_') {
            sb.append((char) 1);
            sb.append((char) (c2 - 'E'));
            return 2;
        }
        if (c2 < '`' || c2 > 127) {
            sb.append("\u0001\u001e");
            return t((char) (c2 - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c2 - '`'));
        return 2;
    }

    @Override // j9w.CN3
    public void n(fuX fux) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!fux.xMQ()) {
                break;
            }
            char cT = fux.t();
            fux.nr++;
            int iT = t(cT, sb);
            int iN = fux.n() + ((sb.length() / 3) << 1);
            fux.Ik(iN);
            int iN2 = fux.Uo().n() - iN;
            if (!fux.xMQ()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (iN2 < 2 || iN2 > 2)) {
                    iT = rl(fux, sb, sb2, iT);
                }
                while (sb.length() % 3 == 1 && ((iT <= 3 && iN2 != 1) || iT > 3)) {
                    iT = rl(fux, sb, sb2, iT);
                }
            } else if (sb.length() % 3 == 0 && aC.ty(fux.nr(), fux.nr, O()) != O()) {
                fux.HI(0);
                break;
            }
        }
        J2(fux, sb);
    }

    w6() {
    }

    private static String nr(CharSequence charSequence, int i2) {
        int iCharAt = (charSequence.charAt(i2) * 1600) + (charSequence.charAt(i2 + 1) * '(') + charSequence.charAt(i2 + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    private int rl(fuX fux, StringBuilder sb, StringBuilder sb2, int i2) {
        int length = sb.length();
        sb.delete(length - i2, length);
        fux.nr--;
        int iT = t(fux.t(), sb2);
        fux.gh();
        return iT;
    }

    void J2(fuX fux, StringBuilder sb) {
        int length = (sb.length() / 3) << 1;
        int length2 = sb.length() % 3;
        int iN = fux.n() + length;
        fux.Ik(iN);
        int iN2 = fux.Uo().n() - iN;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                Uo(fux, sb);
            }
            if (fux.xMQ()) {
                fux.r((char) 254);
            }
        } else if (iN2 == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                Uo(fux, sb);
            }
            if (fux.xMQ()) {
                fux.r((char) 254);
            }
            fux.nr--;
        } else if (length2 == 0) {
            while (sb.length() >= 3) {
                Uo(fux, sb);
            }
            if (iN2 > 0 || fux.xMQ()) {
                fux.r((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        fux.HI(0);
    }
}
