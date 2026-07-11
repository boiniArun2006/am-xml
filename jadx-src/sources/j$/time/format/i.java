package j$.time.format;

import com.caoccao.javet.interop.engine.JavetEngineConfig;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class i implements InterfaceC2193f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f69057b;

    public /* synthetic */ i(Object obj, int i2) {
        this.f69056a = i2;
        this.f69057b = obj;
    }

    @Override // j$.time.format.InterfaceC2193f
    public final boolean q(y yVar, StringBuilder sb) {
        switch (this.f69056a) {
            case 0:
                Long lE = yVar.e(j$.time.temporal.a.OFFSET_SECONDS);
                if (lE != null) {
                    sb.append("GMT");
                    int intExact = Math.toIntExact(lE.longValue());
                    if (intExact != 0) {
                        int iAbs = Math.abs((intExact / JavetEngineConfig.DEFAULT_RESET_ENGINE_TIMEOUT_SECONDS) % 100);
                        int iAbs2 = Math.abs((intExact / 60) % 60);
                        int iAbs3 = Math.abs(intExact % 60);
                        sb.append(intExact < 0 ? "-" : "+");
                        if (((TextStyle) this.f69057b) == TextStyle.FULL) {
                            a(sb, iAbs);
                            sb.append(':');
                            a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs3);
                            }
                        } else {
                            if (iAbs >= 10) {
                                sb.append((char) ((iAbs / 10) + 48));
                            }
                            sb.append((char) ((iAbs % 10) + 48));
                            if (iAbs2 != 0 || iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs2);
                                if (iAbs3 != 0) {
                                    sb.append(':');
                                    a(sb, iAbs3);
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                sb.append((String) this.f69057b);
                break;
        }
        return true;
    }

    @Override // j$.time.format.InterfaceC2193f
    public final int s(w wVar, CharSequence charSequence, int i2) {
        int i3;
        int iB;
        int i5;
        int i7;
        int i8;
        int i9;
        switch (this.f69056a) {
            case 0:
                int length = charSequence.length();
                if (wVar.s(charSequence, i2, "GMT", 0, 3)) {
                    int i10 = i2 + 3;
                    if (i10 == length) {
                        return wVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i2, i10);
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (cCharAt == '+') {
                        i3 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return wVar.o(j$.time.temporal.a.OFFSET_SECONDS, 0L, i2, i10);
                        }
                        i3 = -1;
                    }
                    int i11 = i2 + 4;
                    int i12 = 0;
                    if (((TextStyle) this.f69057b) == TextStyle.FULL) {
                        int i13 = i2 + 5;
                        int iB2 = b(charSequence, i11);
                        int i14 = i2 + 6;
                        int iB3 = b(charSequence, i13);
                        if (iB2 >= 0 && iB3 >= 0) {
                            int i15 = i2 + 7;
                            if (charSequence.charAt(i14) == ':') {
                                iB = (iB2 * 10) + iB3;
                                int iB4 = b(charSequence, i15);
                                i9 = i2 + 9;
                                int iB5 = b(charSequence, i2 + 8);
                                if (iB4 >= 0 && iB5 >= 0) {
                                    i8 = (iB4 * 10) + iB5;
                                    int i16 = i2 + 11;
                                    if (i16 < length && charSequence.charAt(i9) == ':') {
                                        int iB6 = b(charSequence, i2 + 10);
                                        int iB7 = b(charSequence, i16);
                                        if (iB6 >= 0 && iB7 >= 0) {
                                            i12 = (iB6 * 10) + iB7;
                                            i9 = i2 + 12;
                                        }
                                    }
                                    i5 = i12;
                                    i7 = i9;
                                }
                            }
                        }
                    } else {
                        int i17 = i2 + 5;
                        iB = b(charSequence, i11);
                        if (iB >= 0) {
                            if (i17 < length) {
                                int iB8 = b(charSequence, i17);
                                if (iB8 >= 0) {
                                    iB = (iB * 10) + iB8;
                                    i17 = i2 + 6;
                                }
                                int i18 = i17 + 2;
                                if (i18 < length && charSequence.charAt(i17) == ':' && i18 < length && charSequence.charAt(i17) == ':') {
                                    int iB9 = b(charSequence, i17 + 1);
                                    int iB10 = b(charSequence, i18);
                                    if (iB9 >= 0 && iB10 >= 0) {
                                        i8 = (iB9 * 10) + iB10;
                                        int i19 = i17 + 3;
                                        int i20 = i17 + 5;
                                        if (i20 < length && charSequence.charAt(i19) == ':') {
                                            int iB11 = b(charSequence, i17 + 4);
                                            int iB12 = b(charSequence, i20);
                                            if (iB11 >= 0 && iB12 >= 0) {
                                                i12 = (iB11 * 10) + iB12;
                                                i9 = i17 + 6;
                                                i5 = i12;
                                                i7 = i9;
                                            }
                                        }
                                        i7 = i19;
                                        i5 = 0;
                                    }
                                }
                            }
                            i5 = 0;
                            i7 = i17;
                            return wVar.o(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i12) * 60) + (((long) iB) * 3600) + ((long) i5)) * ((long) i3), i2, i7);
                        }
                    }
                    i12 = i8;
                    return wVar.o(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i12) * 60) + (((long) iB) * 3600) + ((long) i5)) * ((long) i3), i2, i7);
                }
                return ~i2;
            default:
                if (i2 > charSequence.length() || i2 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) this.f69057b;
                return !wVar.s(charSequence, i2, str, 0, str.length()) ? ~i2 : str.length() + i2;
        }
    }

    public final String toString() {
        switch (this.f69056a) {
            case 0:
                return "LocalizedOffset(" + ((TextStyle) this.f69057b) + ")";
            default:
                return "'" + ((String) this.f69057b).replace("'", "''") + "'";
        }
    }

    private static void a(StringBuilder sb, int i2) {
        sb.append((char) ((i2 / 10) + 48));
        sb.append((char) ((i2 % 10) + 48));
    }

    static int b(CharSequence charSequence, int i2) {
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }
}
