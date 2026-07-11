package androidx.constraintlayout.core.parser;

import androidx.resourceinspection.annotation.og.qfEYuUHwj;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class CLParser {
    static boolean nr;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f35328n;
    private boolean rl = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f35329t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    private CLElement n(CLElement cLElement, int i2, TYPE type, boolean z2, char[] cArr) {
        CLElement cLElementXw;
        if (nr) {
            System.out.println("CREATE " + type + " at " + cArr[i2]);
        }
        switch (type.ordinal()) {
            case 1:
                cLElementXw = CLObject.Xw(cArr);
                i2++;
                break;
            case 2:
                cLElementXw = CLArray.Xw(cArr);
                i2++;
                break;
            case 3:
                cLElementXw = CLNumber.r(cArr);
                break;
            case 4:
                cLElementXw = CLString.r(cArr);
                break;
            case 5:
                cLElementXw = CLKey.U(cArr);
                break;
            case 6:
                cLElementXw = CLToken.r(cArr);
                break;
            default:
                cLElementXw = null;
                break;
        }
        if (cLElementXw == null) {
            return null;
        }
        cLElementXw.HI(this.f35329t);
        if (z2) {
            cLElementXw.ck(i2);
        }
        if (cLElement instanceof CLContainer) {
            cLElementXw.az((CLContainer) cLElement);
        }
        return cLElementXw;
    }

    public static CLObject nr(String str) {
        return new CLParser(str).t();
    }

    private CLElement rl(int i2, char c2, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c2 != '\t' && c2 != '\n' && c2 != '\r' && c2 != ' ') {
            if (c2 == '\"' || c2 == '\'') {
                return cLElement instanceof CLObject ? n(cLElement, i2, TYPE.KEY, true, cArr) : n(cLElement, i2, TYPE.STRING, true, cArr);
            }
            if (c2 == '[') {
                return n(cLElement, i2, TYPE.ARRAY, true, cArr);
            }
            if (c2 != ']') {
                if (c2 == '{') {
                    return n(cLElement, i2, TYPE.OBJECT, true, cArr);
                }
                if (c2 != '}') {
                    switch (c2) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return n(cLElement, i2, TYPE.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            break;
                        case '/':
                            int i3 = i2 + 1;
                            if (i3 >= cArr.length || cArr[i3] != '/') {
                                return cLElement;
                            }
                            this.rl = true;
                            return cLElement;
                        default:
                            if (!(cLElement instanceof CLContainer) || (cLElement instanceof CLObject)) {
                                return n(cLElement, i2, TYPE.KEY, true, cArr);
                            }
                            CLElement cLElementN = n(cLElement, i2, TYPE.TOKEN, true, cArr);
                            CLToken cLToken = (CLToken) cLElementN;
                            if (cLToken.o(c2, i2)) {
                                return cLElementN;
                            }
                            throw new CLParsingException(qfEYuUHwj.Vgi + c2 + "> at line " + this.f35329t, cLToken);
                    }
                }
            }
            cLElement.ty(i2 - 1);
            CLElement cLElementNr = cLElement.nr();
            cLElementNr.ty(i2);
            return cLElementNr;
        }
        return cLElement;
    }

    public CLObject t() throws CLParsingException {
        int i2;
        char[] charArray = this.f35328n.toCharArray();
        int length = charArray.length;
        int i3 = 1;
        this.f35329t = 1;
        boolean z2 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            char c2 = charArray[i5];
            if (c2 == '{') {
                break;
            }
            if (c2 == '\n') {
                this.f35329t++;
            }
            i5++;
        }
        if (i5 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject cLObjectXw = CLObject.Xw(charArray);
        cLObjectXw.HI(this.f35329t);
        cLObjectXw.ck(i5);
        int i7 = i5 + 1;
        CLElement cLElementNr = cLObjectXw;
        while (i7 < length) {
            char c4 = charArray[i7];
            if (c4 == '\n') {
                this.f35329t += i3;
            }
            if (this.rl) {
                if (c4 == '\n') {
                    this.rl = z2;
                } else {
                    i2 = i3;
                    i7++;
                    i3 = i2;
                    z2 = false;
                }
            }
            if (cLElementNr == null) {
                break;
            }
            if (cLElementNr.qie()) {
                cLElementNr = rl(i7, c4, cLElementNr, charArray);
            } else if (cLElementNr instanceof CLObject) {
                if (c4 == '}') {
                    cLElementNr.ty(i7 - 1);
                } else {
                    cLElementNr = rl(i7, c4, cLElementNr, charArray);
                }
            } else if (!(cLElementNr instanceof CLArray)) {
                boolean z3 = cLElementNr instanceof CLString;
                if (z3) {
                    long j2 = cLElementNr.f35323t;
                    if (charArray[(int) j2] == c4) {
                        cLElementNr.ck(j2 + 1);
                        cLElementNr.ty(i7 - 1);
                    }
                } else {
                    if (cLElementNr instanceof CLToken) {
                        CLToken cLToken = (CLToken) cLElementNr;
                        i2 = i3;
                        if (!cLToken.o(c4, i7)) {
                            throw new CLParsingException("parsing incorrect token " + cLToken.t() + " at line " + this.f35329t, cLToken);
                        }
                    } else {
                        i2 = i3;
                    }
                    if ((cLElementNr instanceof CLKey) || z3) {
                        long j3 = cLElementNr.f35323t;
                        char c5 = charArray[(int) j3];
                        if ((c5 == '\'' || c5 == '\"') && c5 == c4) {
                            cLElementNr.ck(j3 + 1);
                            cLElementNr.ty(i7 - 1);
                        }
                    }
                    if (!cLElementNr.qie() && (c4 == '}' || c4 == ']' || c4 == ',' || c4 == ' ' || c4 == '\t' || c4 == '\r' || c4 == '\n' || c4 == ':')) {
                        long j4 = i7 - 1;
                        cLElementNr.ty(j4);
                        if (c4 == '}' || c4 == ']') {
                            cLElementNr = cLElementNr.nr();
                            cLElementNr.ty(j4);
                            if (cLElementNr instanceof CLKey) {
                                cLElementNr = cLElementNr.nr();
                                cLElementNr.ty(j4);
                            }
                        }
                    }
                    if (!cLElementNr.qie() && (!(cLElementNr instanceof CLKey) || ((CLKey) cLElementNr).f35319o.size() > 0)) {
                        cLElementNr = cLElementNr.nr();
                    }
                    i7++;
                    i3 = i2;
                    z2 = false;
                }
            } else if (c4 == ']') {
                cLElementNr.ty(i7 - 1);
            } else {
                cLElementNr = rl(i7, c4, cLElementNr, charArray);
            }
            i2 = i3;
            if (!cLElementNr.qie()) {
            }
            i7++;
            i3 = i2;
            z2 = false;
        }
        while (cLElementNr != null && !cLElementNr.qie()) {
            if (cLElementNr instanceof CLString) {
                cLElementNr.ck(((int) cLElementNr.f35323t) + 1);
            }
            cLElementNr.ty(length - 1);
            cLElementNr = cLElementNr.nr();
        }
        if (nr) {
            System.out.println("Root: " + cLObjectXw.Ik());
        }
        return cLObjectXw;
    }

    public CLParser(String str) {
        this.f35328n = str;
    }
}
