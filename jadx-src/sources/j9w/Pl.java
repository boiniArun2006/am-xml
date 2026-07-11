package j9w;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Pl extends w6 {
    @Override // j9w.w6
    public int O() {
        return 3;
    }

    @Override // j9w.w6, j9w.CN3
    public void n(fuX fux) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!fux.xMQ()) {
                break;
            }
            char cT = fux.t();
            fux.nr++;
            t(cT, sb);
            if (sb.length() % 3 == 0) {
                w6.Uo(fux, sb);
                if (aC.ty(fux.nr(), fux.nr, O()) != O()) {
                    fux.HI(0);
                    break;
                }
            }
        }
        J2(fux, sb);
    }

    @Override // j9w.w6
    int t(char c2, StringBuilder sb) {
        if (c2 == '\r') {
            sb.append((char) 0);
        } else if (c2 == ' ') {
            sb.append((char) 3);
        } else if (c2 == '*') {
            sb.append((char) 1);
        } else if (c2 == '>') {
            sb.append((char) 2);
        } else if (c2 >= '0' && c2 <= '9') {
            sb.append((char) (c2 - ','));
        } else if (c2 < 'A' || c2 > 'Z') {
            aC.O(c2);
        } else {
            sb.append((char) (c2 - '3'));
        }
        return 1;
    }

    Pl() {
    }

    @Override // j9w.w6
    void J2(fuX fux, StringBuilder sb) {
        fux.ck();
        int iN = fux.Uo().n() - fux.n();
        fux.nr -= sb.length();
        if (fux.J2() > 1 || iN > 1 || fux.J2() != iN) {
            fux.r((char) 254);
        }
        if (fux.O() < 0) {
            fux.HI(0);
        }
    }
}
