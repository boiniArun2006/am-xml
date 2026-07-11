package Mms;

import com.caoccao.javet.values.primitive.V8ValueNull;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6723n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f6724t;
    public final u rl = new u();
    private StringBuilder nr = new StringBuilder();

    public abstract String E2(String str, boolean z2);

    public abstract boolean J2();

    public final void S() {
        this.f6724t = null;
    }

    public abstract int T(int i2);

    public void WPU() {
    }

    public abstract void az(char c2);

    public abstract byte gh();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract CharSequence iF();

    public abstract String mUb();

    public abstract int nHg();

    private static final double HI(long j2, boolean z2) {
        if (!z2) {
            return Math.pow(10.0d, -j2);
        }
        if (z2) {
            return Math.pow(10.0d, j2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean bzg(j jVar, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return jVar.rV9(z2);
    }

    public static /* synthetic */ Void nY(j jVar, String str, int i2, String str2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i3 & 2) != 0) {
            i2 = jVar.f6723n;
        }
        if ((i3 & 4) != 0) {
            str2 = "";
        }
        return jVar.ViF(str, i2, str2);
    }

    private final int nr(CharSequence charSequence, int i2) {
        int i3 = i2 + 4;
        if (i3 < charSequence.length()) {
            this.nr.append((char) ((te(charSequence, i2) << 12) + (te(charSequence, i2 + 1) << 8) + (te(charSequence, i2 + 2) << 4) + te(charSequence, i2 + 3)));
            return i3;
        }
        this.f6723n = i2;
        WPU();
        if (this.f6723n + 4 < charSequence.length()) {
            return nr(charSequence, this.f6723n);
        }
        nY(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final String wTp() {
        String str = this.f6724t;
        Intrinsics.checkNotNull(str);
        this.f6724t = null;
        return str;
    }

    public final String Ik() {
        return this.f6724t != null ? wTp() : mUb();
    }

    public final void N(boolean z2) {
        ArrayList arrayList = new ArrayList();
        byte bE = e();
        if (bE != 8 && bE != 6) {
            o();
            return;
        }
        while (true) {
            byte bE2 = e();
            if (bE2 != 1) {
                if (bE2 == 8 || bE2 == 6) {
                    arrayList.add(Byte.valueOf(bE2));
                } else if (bE2 == 9) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw Ew.J2(this.f6723n, "found ] instead of } at path: " + this.rl, iF());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bE2 == 7) {
                    if (((Number) CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw Ew.J2(this.f6723n, "found } instead of ] at path: " + this.rl, iF());
                    }
                    CollectionsKt.removeLast(arrayList);
                } else if (bE2 == 10) {
                    nY(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                gh();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z2) {
                o();
            } else {
                mUb();
            }
        }
    }

    protected void O(int i2, int i3) {
        this.nr.append(iF(), i2, i3);
    }

    public final Void ViF(String message, int i2, String hint) {
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw Ew.J2(i2, message + " at path: " + this.rl.n() + str, iF());
    }

    protected final void Xw(char c2) {
        int i2 = this.f6723n;
        if (i2 > 0 && c2 == '\"') {
            try {
                this.f6723n = i2 - 1;
                String strO = o();
                this.f6723n = i2;
                if (Intrinsics.areEqual(strO, V8ValueNull.NULL)) {
                    ViF("Expected string literal but 'null' literal was found", this.f6723n - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th) {
                this.f6723n = i2;
                throw th;
            }
        }
        String strT = n.t(n.n(c2));
        int i3 = this.f6723n;
        int i5 = i3 - 1;
        nY(this, "Expected " + strT + ", but had '" + ((i3 == iF().length() || i5 < 0) ? "EOF" : String.valueOf(iF().charAt(i5))) + "' instead", i5, null, 4, null);
        throw new KotlinNothingValueException();
    }

    protected final boolean fD(char c2) {
        return (c2 == ',' || c2 == ':' || c2 == ']' || c2 == '}') ? false : true;
    }

    public final void g(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) s7N(0, this.f6723n), key, 0, false, 6, (Object) null);
        throw new JsonDecodingException("Encountered an unknown key '" + key + "' at offset " + iLastIndexOf$default + " at path: " + this.rl.n() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) Ew.xMQ(iF(), iLastIndexOf$default)));
    }

    public final String o() {
        if (this.f6724t != null) {
            return wTp();
        }
        int iNHg = nHg();
        if (iNHg >= iF().length() || iNHg == -1) {
            nY(this, "EOF", iNHg, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bN = n.n(iF().charAt(iNHg));
        if (bN == 1) {
            return Ik();
        }
        if (bN != 0) {
            nY(this, "Expected beginning of the string, but got " + iF().charAt(iNHg), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z2 = false;
        while (n.n(iF().charAt(iNHg)) == 0) {
            iNHg++;
            if (iNHg >= iF().length()) {
                O(this.f6723n, iNHg);
                int iT = T(iNHg);
                if (iT == -1) {
                    this.f6723n = iNHg;
                    return XQ(0, 0);
                }
                iNHg = iT;
                z2 = true;
            }
        }
        String strS7N = !z2 ? s7N(this.f6723n, iNHg) : XQ(this.f6723n, iNHg);
        this.f6723n = iNHg;
        return strS7N;
    }

    protected final String r(CharSequence source, int i2, int i3) {
        Intrinsics.checkNotNullParameter(source, "source");
        char cCharAt = source.charAt(i3);
        boolean z2 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int iT = T(t(i2, i3));
                if (iT == -1) {
                    nY(this, "Unexpected EOF", iT, null, 4, null);
                    throw new KotlinNothingValueException();
                }
                z2 = true;
                i2 = iT;
                i3 = i2;
            } else {
                i3++;
                if (i3 >= source.length()) {
                    O(i2, i3);
                    int iT2 = T(i3);
                    if (iT2 == -1) {
                        nY(this, "Unexpected EOF", iT2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    i2 = iT2;
                    i3 = i2;
                    z2 = true;
                } else {
                    continue;
                }
            }
            cCharAt = source.charAt(i3);
        }
        String strS7N = !z2 ? s7N(i2, i3) : XQ(i2, i3);
        this.f6723n = i3 + 1;
        return strS7N;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) iF()) + "', currentPosition=" + this.f6723n + ')';
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f1, code lost:
    
        nY(r18, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0201, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011a, code lost:
    
        nY(r18, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013e, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        if (r2 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
    
        if (r1 == r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
    
        if (r9 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014a, code lost:
    
        if (r1 == (r2 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
    
        if (r0 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        if (r4 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0158, code lost:
    
        if (iF().charAt(r2) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015f, code lost:
    
        nY(r18, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016f, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0170, code lost:
    
        nY(r18, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0180, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0181, code lost:
    
        r18.f6723n = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0183, code lost:
    
        if (r8 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0185, code lost:
    
        r1 = r10 * HI(r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019f, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        nY(r18, "Can't convert " + r1 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c3, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c4, code lost:
    
        nY(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d4, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d5, code lost:
    
        if (r9 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dc, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e0, code lost:
    
        nY(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f0, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long ty() {
        boolean z2;
        int iT = T(nHg());
        if (iT < iF().length() && iT != -1) {
            if (iF().charAt(iT) == '\"') {
                iT++;
                if (iT == iF().length()) {
                    nY(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                z2 = true;
            } else {
                z2 = false;
            }
            int i2 = iT;
            boolean z3 = false;
            boolean z4 = false;
            long j2 = 0;
            long j3 = 0;
            loop0: while (true) {
                boolean z5 = false;
                while (i2 != iF().length()) {
                    char cCharAt = iF().charAt(i2);
                    if ((cCharAt == 'e' || cCharAt == 'E') && !z3) {
                        if (i2 == iT) {
                            nY(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i2++;
                        z3 = true;
                    } else if (cCharAt == '-' && z3) {
                        if (i2 == iT) {
                            nY(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i2++;
                    } else if (cCharAt != '+' || !z3) {
                        if (cCharAt != '-') {
                            if (n.n(cCharAt) != 0) {
                                break loop0;
                            }
                            i2++;
                            int i3 = cCharAt - '0';
                            if (i3 < 0 || i3 >= 10) {
                                break loop0;
                            }
                            if (z3) {
                                j3 = (j3 * ((long) 10)) + ((long) i3);
                            } else {
                                j2 = (j2 * ((long) 10)) - ((long) i3);
                                if (j2 > 0) {
                                    nY(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new KotlinNothingValueException();
                                }
                            }
                        } else {
                            if (i2 != iT) {
                                nY(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            i2++;
                            z4 = true;
                        }
                    } else {
                        if (i2 == iT) {
                            nY(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i2++;
                    }
                    z5 = true;
                }
                break loop0;
            }
        } else {
            nY(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    private final boolean Uo(int i2) {
        int iT = T(i2);
        if (iT < iF().length() && iT != -1) {
            int i3 = iT + 1;
            int iCharAt = iF().charAt(iT) | ' ';
            if (iCharAt != 102) {
                if (iCharAt == 116) {
                    xMQ("rue", i3);
                    return true;
                }
                nY(this, "Expected valid boolean literal prefix, but had '" + o() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            xMQ("alse", i3);
            return false;
        }
        nY(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final String XQ(int i2, int i3) {
        O(i2, i3);
        String string = this.nr.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.nr.setLength(0);
        return string;
    }

    private final boolean jB() {
        if (iF().charAt(this.f6723n - 1) != '\"') {
            return true;
        }
        return false;
    }

    private final int rl(int i2) {
        int iT = T(i2);
        if (iT != -1) {
            int i3 = iT + 1;
            char cCharAt = iF().charAt(iT);
            if (cCharAt == 'u') {
                return nr(iF(), i3);
            }
            char cRl = n.rl(cCharAt);
            if (cRl != 0) {
                this.nr.append(cRl);
                return i3;
            }
            nY(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        nY(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int t(int i2, int i3) {
        O(i2, i3);
        return rl(i3 + 1);
    }

    private final int te(CharSequence charSequence, int i2) {
        char cCharAt = charSequence.charAt(i2);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        nY(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void xMQ(String str, int i2) {
        if (iF().length() - i2 >= str.length()) {
            int length = str.length();
            for (int i3 = 0; i3 < length; i3++) {
                if (str.charAt(i3) != (iF().charAt(i2 + i3) | ' ')) {
                    nY(this, "Expected valid boolean literal prefix, but had '" + o() + '\'', 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            this.f6723n = i2 + str.length();
            return;
        }
        nY(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final boolean KN() {
        boolean z2;
        int iNHg = nHg();
        if (iNHg != iF().length()) {
            if (iF().charAt(iNHg) == '\"') {
                iNHg++;
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zUo = Uo(iNHg);
            if (z2) {
                if (this.f6723n != iF().length()) {
                    if (iF().charAt(this.f6723n) == '\"') {
                        this.f6723n++;
                        return zUo;
                    }
                    nY(this, "Expected closing quotation mark", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                nY(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return zUo;
        }
        nY(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String X(boolean z2) {
        String strIk;
        byte bE = e();
        if (z2) {
            if (bE != 1 && bE != 0) {
                return null;
            }
            strIk = o();
        } else {
            if (bE != 1) {
                return null;
            }
            strIk = Ik();
        }
        this.f6724t = strIk;
        return strIk;
    }

    public final String Z() {
        String strO = o();
        if (Intrinsics.areEqual(strO, V8ValueNull.NULL) && jB()) {
            nY(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return strO;
    }

    public final void aYN() {
        if (gh() == 10) {
            return;
        }
        nY(this, "Expected EOF after parsing, but had " + iF().charAt(this.f6723n - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final long ck() {
        String strValueOf;
        long jTy = ty();
        if (gh() != 10) {
            n.t((byte) 10);
            int i2 = this.f6723n;
            int i3 = i2 - 1;
            if (i2 != iF().length() && i3 >= 0) {
                strValueOf = String.valueOf(iF().charAt(i3));
            } else {
                strValueOf = "EOF";
            }
            nY(this, "Expected input to contain a single valid number, but got '" + strValueOf + "' after it", i3, null, 4, null);
            throw new KotlinNothingValueException();
        }
        return jTy;
    }

    public byte e() {
        CharSequence charSequenceIF = iF();
        int i2 = this.f6723n;
        while (true) {
            int iT = T(i2);
            if (iT != -1) {
                char cCharAt = charSequenceIF.charAt(iT);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                    this.f6723n = iT;
                    return n.n(cCharAt);
                }
                i2 = iT + 1;
            } else {
                this.f6723n = iT;
                return (byte) 10;
            }
        }
    }

    public final byte qie(byte b2) {
        String strValueOf;
        byte bGh = gh();
        if (bGh != b2) {
            String strT = n.t(b2);
            int i2 = this.f6723n;
            int i3 = i2 - 1;
            if (i2 != iF().length() && i3 >= 0) {
                strValueOf = String.valueOf(iF().charAt(i3));
            } else {
                strValueOf = "EOF";
            }
            nY(this, "Expected " + strT + ", but had '" + strValueOf + "' instead", i3, null, 4, null);
            throw new KotlinNothingValueException();
        }
        return bGh;
    }

    public final boolean rV9(boolean z2) {
        int iT = T(nHg());
        int length = iF().length() - iT;
        if (length < 4 || iT == -1) {
            return false;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (V8ValueNull.NULL.charAt(i2) != iF().charAt(iT + i2)) {
                return false;
            }
        }
        if (length > 4 && n.n(iF().charAt(iT + 4)) == 0) {
            return false;
        }
        if (z2) {
            this.f6723n = iT + 4;
            return true;
        }
        return true;
    }

    public String s7N(int i2, int i3) {
        return iF().subSequence(i2, i3).toString();
    }

    public final boolean v() {
        int iNHg = nHg();
        CharSequence charSequenceIF = iF();
        if (iNHg >= charSequenceIF.length() || iNHg == -1 || charSequenceIF.charAt(iNHg) != ',') {
            return false;
        }
        this.f6723n++;
        return true;
    }
}
