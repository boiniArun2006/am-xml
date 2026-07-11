package wIE;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class Ml {
    private int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f74826O;
    private char[] Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f74827n;
    private int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f74828t;

    public String rl(String str) {
        this.f74828t = 0;
        this.nr = 0;
        this.f74826O = 0;
        this.J2 = 0;
        this.Uo = this.f74827n.toCharArray();
        String strUo = Uo();
        if (strUo == null) {
            return null;
        }
        do {
            int i2 = this.f74828t;
            if (i2 == this.rl) {
                return null;
            }
            char c2 = this.Uo[i2];
            String strN = c2 != '\"' ? c2 != '#' ? (c2 == '+' || c2 == ',' || c2 == ';') ? "" : n() : J2() : KN();
            if (str.equalsIgnoreCase(strUo)) {
                return strN;
            }
            int i3 = this.f74828t;
            if (i3 >= this.rl) {
                return null;
            }
            char c4 = this.Uo[i3];
            if (c4 != ',' && c4 != ';' && c4 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f74827n);
            }
            this.f74828t = i3 + 1;
            strUo = Uo();
        } while (strUo != null);
        throw new IllegalStateException("Malformed DN: " + this.f74827n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        r6.f74826O = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String J2() {
        char[] cArr;
        char c2;
        int i2 = this.f74828t;
        if (i2 + 4 >= this.rl) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f74827n);
        }
        this.nr = i2;
        this.f74828t = i2 + 1;
        while (true) {
            int i3 = this.f74828t;
            if (i3 == this.rl || (c2 = (cArr = this.Uo)[i3]) == '+' || c2 == ',' || c2 == ';') {
                break;
            }
            if (c2 == ' ') {
                this.f74826O = i3;
                this.f74828t = i3 + 1;
                while (true) {
                    int i5 = this.f74828t;
                    if (i5 >= this.rl || this.Uo[i5] != ' ') {
                        break;
                    }
                    this.f74828t = i5 + 1;
                }
            } else {
                if (c2 >= 'A' && c2 <= 'F') {
                    cArr[i3] = (char) (c2 + ' ');
                }
                this.f74828t = i3 + 1;
            }
        }
        int i7 = this.f74826O;
        int i8 = this.nr;
        int i9 = i7 - i8;
        if (i9 < 5 || (i9 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f74827n);
        }
        int i10 = i9 / 2;
        byte[] bArr = new byte[i10];
        int i11 = i8 + 1;
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) t(i11);
            i11 += 2;
        }
        return new String(this.Uo, this.nr, i9);
    }

    private String KN() {
        int i2 = this.f74828t + 1;
        this.f74828t = i2;
        this.nr = i2;
        this.f74826O = i2;
        while (true) {
            int i3 = this.f74828t;
            if (i3 == this.rl) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f74827n);
            }
            char[] cArr = this.Uo;
            char c2 = cArr[i3];
            if (c2 == '\"') {
                this.f74828t = i3 + 1;
                while (true) {
                    int i5 = this.f74828t;
                    if (i5 >= this.rl || this.Uo[i5] != ' ') {
                        break;
                    }
                    this.f74828t = i5 + 1;
                }
                char[] cArr2 = this.Uo;
                int i7 = this.nr;
                return new String(cArr2, i7, this.f74826O - i7);
            }
            if (c2 == '\\') {
                cArr[this.f74826O] = nr();
            } else {
                cArr[this.f74826O] = c2;
            }
            this.f74828t++;
            this.f74826O++;
        }
    }

    private char O() {
        int i2;
        int i3;
        int iT = t(this.f74828t);
        this.f74828t++;
        if (iT < 128) {
            return (char) iT;
        }
        if (iT < 192 || iT > 247) {
            return '?';
        }
        if (iT <= 223) {
            i2 = iT & 31;
            i3 = 1;
        } else if (iT <= 239) {
            i2 = iT & 15;
            i3 = 2;
        } else {
            i2 = iT & 7;
            i3 = 3;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            int i7 = this.f74828t;
            int i8 = i7 + 1;
            this.f74828t = i8;
            if (i8 == this.rl || this.Uo[i8] != '\\') {
                return '?';
            }
            int i9 = i7 + 2;
            this.f74828t = i9;
            int iT2 = t(i9);
            this.f74828t++;
            if ((iT2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (iT2 & 63);
        }
        return (char) i2;
    }

    private String Uo() {
        int i2;
        int i3;
        int i5;
        int i7;
        char c2;
        int i8;
        int i9;
        char c4;
        char c5;
        while (true) {
            i2 = this.f74828t;
            i3 = this.rl;
            if (i2 >= i3 || this.Uo[i2] != ' ') {
                break;
            }
            this.f74828t = i2 + 1;
        }
        if (i2 == i3) {
            return null;
        }
        this.nr = i2;
        this.f74828t = i2 + 1;
        while (true) {
            i5 = this.f74828t;
            i7 = this.rl;
            if (i5 >= i7 || (c5 = this.Uo[i5]) == '=' || c5 == ' ') {
                break;
            }
            this.f74828t = i5 + 1;
        }
        if (i5 >= i7) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f74827n);
        }
        this.f74826O = i5;
        if (this.Uo[i5] == ' ') {
            while (true) {
                i8 = this.f74828t;
                i9 = this.rl;
                if (i8 >= i9 || (c4 = this.Uo[i8]) == '=' || c4 != ' ') {
                    break;
                }
                this.f74828t = i8 + 1;
            }
            if (this.Uo[i8] != '=' || i8 == i9) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f74827n);
            }
        }
        this.f74828t++;
        while (true) {
            int i10 = this.f74828t;
            if (i10 >= this.rl || this.Uo[i10] != ' ') {
                break;
            }
            this.f74828t = i10 + 1;
        }
        int i11 = this.f74826O;
        int i12 = this.nr;
        if (i11 - i12 > 4) {
            char[] cArr = this.Uo;
            if (cArr[i12 + 3] == '.' && (((c2 = cArr[i12]) == 'O' || c2 == 'o') && ((cArr[i12 + 1] == 'I' || cArr[i12 + 1] == 'i') && (cArr[i12 + 2] == 'D' || cArr[i12 + 2] == 'd')))) {
                this.nr = i12 + 4;
            }
        }
        char[] cArr2 = this.Uo;
        int i13 = this.nr;
        return new String(cArr2, i13, i11 - i13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r2 = r8.nr;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        return new java.lang.String(r1, r2, r8.f74826O - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String n() {
        int i2;
        int i3;
        char c2;
        int i5 = this.f74828t;
        this.nr = i5;
        this.f74826O = i5;
        while (true) {
            int i7 = this.f74828t;
            if (i7 >= this.rl) {
                char[] cArr = this.Uo;
                int i8 = this.nr;
                return new String(cArr, i8, this.f74826O - i8);
            }
            char[] cArr2 = this.Uo;
            char c4 = cArr2[i7];
            if (c4 == ' ') {
                int i9 = this.f74826O;
                this.J2 = i9;
                this.f74828t = i7 + 1;
                this.f74826O = i9 + 1;
                cArr2[i9] = ' ';
                while (true) {
                    i2 = this.f74828t;
                    i3 = this.rl;
                    if (i2 >= i3) {
                        break;
                    }
                    char[] cArr3 = this.Uo;
                    if (cArr3[i2] != ' ') {
                        break;
                    }
                    int i10 = this.f74826O;
                    this.f74826O = i10 + 1;
                    cArr3[i10] = ' ';
                    this.f74828t = i2 + 1;
                }
                if (i2 == i3 || (c2 = this.Uo[i2]) == ',' || c2 == '+' || c2 == ';') {
                    break;
                }
            } else {
                if (c4 == ';') {
                    break;
                }
                if (c4 == '\\') {
                    int i11 = this.f74826O;
                    this.f74826O = i11 + 1;
                    cArr2[i11] = nr();
                    this.f74828t++;
                } else {
                    if (c4 == '+' || c4 == ',') {
                        break;
                    }
                    int i12 = this.f74826O;
                    this.f74826O = i12 + 1;
                    cArr2[i12] = c4;
                    this.f74828t = i7 + 1;
                }
            }
        }
        char[] cArr4 = this.Uo;
        int i13 = this.nr;
        return new String(cArr4, i13, this.J2 - i13);
    }

    private char nr() {
        int i2 = this.f74828t + 1;
        this.f74828t = i2;
        if (i2 == this.rl) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f74827n);
        }
        char c2 = this.Uo[i2];
        if (c2 == ' ' || c2 == '%' || c2 == '\\' || c2 == '_' || c2 == '\"' || c2 == '#') {
            return c2;
        }
        switch (c2) {
            case '*':
            case '+':
            case ',':
                return c2;
            default:
                switch (c2) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c2;
                    default:
                        return O();
                }
        }
    }

    private int t(int i2) {
        int i3;
        int i5;
        int i7 = i2 + 1;
        if (i7 >= this.rl) {
            throw new IllegalStateException("Malformed DN: " + this.f74827n);
        }
        char[] cArr = this.Uo;
        char c2 = cArr[i2];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f74827n);
            }
            i3 = c2 - '7';
        }
        char c4 = cArr[i7];
        if (c4 >= '0' && c4 <= '9') {
            i5 = c4 - '0';
        } else if (c4 >= 'a' && c4 <= 'f') {
            i5 = c4 - 'W';
        } else {
            if (c4 < 'A' || c4 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f74827n);
            }
            i5 = c4 - '7';
        }
        return (i3 << 4) + i5;
    }

    public Ml(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f74827n = name;
        this.rl = name.length();
    }
}
