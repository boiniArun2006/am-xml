package NDY;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n extends Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final char[] f6993n;
    private static final char nr;
    private static final char[] rl = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final char[] f6994t = {'/', ':', '+', '.'};

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f6993n = cArr;
        nr = cArr[0];
    }

    @Override // NDY.Pl
    public boolean[] t(String str) {
        int i2;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c2 = nr;
            sb.append(c2);
            sb.append(str);
            sb.append(c2);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f6993n;
            boolean zN = j.n(cArr, upperCase);
            boolean zN2 = j.n(cArr, upperCase2);
            char[] cArr2 = rl;
            boolean zN3 = j.n(cArr2, upperCase);
            boolean zN4 = j.n(cArr2, upperCase2);
            if (zN) {
                if (!zN2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (zN3) {
                if (!zN4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zN2 && !zN4) {
                StringBuilder sb2 = new StringBuilder();
                char c4 = nr;
                sb2.append(c4);
                sb2.append(str);
                sb2.append(c4);
                str = sb2.toString();
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i3 = 20;
        for (int i5 = 1; i5 < str.length() - 1; i5++) {
            if (!Character.isDigit(str.charAt(i5)) && str.charAt(i5) != '-' && str.charAt(i5) != '$') {
                if (j.n(f6994t, str.charAt(i5))) {
                    i3 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i5) + '\'');
                }
            } else {
                i3 += 9;
            }
        }
        boolean[] zArr = new boolean[i3 + (str.length() - 1)];
        int i7 = 0;
        for (int i8 = 0; i8 < str.length(); i8++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i8));
            if (i8 == 0 || i8 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i9 = 0;
            while (true) {
                char[] cArr3 = j.f6991n;
                if (i9 < cArr3.length) {
                    if (upperCase3 == cArr3[i9]) {
                        i2 = j.rl[i9];
                        break;
                    }
                    i9++;
                } else {
                    i2 = 0;
                    break;
                }
            }
            int i10 = 0;
            int i11 = 0;
            boolean z2 = true;
            while (i10 < 7) {
                zArr[i7] = z2;
                i7++;
                if (((i2 >> (6 - i10)) & 1) != 0 && i11 != 1) {
                    i11++;
                } else {
                    z2 = !z2;
                    i10++;
                    i11 = 0;
                }
            }
            if (i8 < str.length() - 1) {
                zArr[i7] = false;
                i7++;
            }
        }
        return zArr;
    }
}
