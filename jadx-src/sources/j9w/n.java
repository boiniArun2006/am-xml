package j9w;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class n implements CN3 {
    public int rl() {
        return 5;
    }

    private static char t(char c2, int i2) {
        int i3 = c2 + ((i2 * 149) % 255) + 1;
        return i3 <= 255 ? (char) i3 : (char) (i3 - 256);
    }

    @Override // j9w.CN3
    public void n(fuX fux) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!fux.xMQ()) {
                break;
            }
            sb.append(fux.t());
            fux.nr++;
            if (aC.ty(fux.nr(), fux.nr, rl()) != rl()) {
                fux.HI(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int iN = fux.n() + length + 1;
        fux.Ik(iN);
        boolean z2 = fux.Uo().n() - iN > 0;
        if (fux.xMQ() || z2) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i2 = 0; i2 < length2; i2++) {
            fux.r(t(sb.charAt(i2), fux.n() + 1));
        }
    }

    n() {
    }
}
