package j9w;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class j implements CN3 {
    public int t() {
        return 0;
    }

    j() {
    }

    private static char rl(char c2, char c4) {
        if (aC.J2(c2) && aC.J2(c4)) {
            return (char) (((c2 - '0') * 10) + (c4 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c2 + c4);
    }

    @Override // j9w.CN3
    public void n(fuX fux) {
        if (aC.n(fux.nr(), fux.nr) >= 2) {
            fux.r(rl(fux.nr().charAt(fux.nr), fux.nr().charAt(fux.nr + 1)));
            fux.nr += 2;
            return;
        }
        char cT = fux.t();
        int iTy = aC.ty(fux.nr(), fux.nr, t());
        if (iTy != t()) {
            if (iTy != 1) {
                if (iTy != 2) {
                    if (iTy != 3) {
                        if (iTy != 4) {
                            if (iTy == 5) {
                                fux.r((char) 231);
                                fux.HI(5);
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iTy)));
                        }
                        fux.r((char) 240);
                        fux.HI(4);
                        return;
                    }
                    fux.r((char) 238);
                    fux.HI(3);
                    return;
                }
                fux.r((char) 239);
                fux.HI(2);
                return;
            }
            fux.r((char) 230);
            fux.HI(1);
            return;
        }
        if (aC.Uo(cT)) {
            fux.r((char) 235);
            fux.r((char) (cT - 127));
            fux.nr++;
        } else {
            fux.r((char) (cT + 1));
            fux.nr++;
        }
    }
}
