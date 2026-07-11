package Mms;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class yg extends j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f6740O;

    public yg(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f6740O = source;
    }

    @Override // Mms.j
    public String E2(String keyToMatch, boolean z2) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i2 = this.f6723n;
        try {
            if (gh() == 6 && Intrinsics.areEqual(X(z2), keyToMatch)) {
                S();
                if (gh() == 5) {
                    return X(z2);
                }
            }
            return null;
        } finally {
            this.f6723n = i2;
            S();
        }
    }

    @Override // Mms.j
    public boolean J2() {
        int i2 = this.f6723n;
        if (i2 == -1) {
            return false;
        }
        String strIF = iF();
        while (i2 < strIF.length()) {
            char cCharAt = strIF.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f6723n = i2;
                return fD(cCharAt);
            }
            i2++;
        }
        this.f6723n = i2;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mms.j
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public String iF() {
        return this.f6740O;
    }

    @Override // Mms.j
    public void az(char c2) {
        if (this.f6723n == -1) {
            Xw(c2);
        }
        String strIF = iF();
        int i2 = this.f6723n;
        while (i2 < strIF.length()) {
            int i3 = i2 + 1;
            char cCharAt = strIF.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f6723n = i3;
                if (cCharAt == c2) {
                    return;
                } else {
                    Xw(c2);
                }
            }
            i2 = i3;
        }
        this.f6723n = -1;
        Xw(c2);
    }

    @Override // Mms.j
    public String mUb() {
        az(Typography.quote);
        int i2 = this.f6723n;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) iF(), Typography.quote, i2, false, 4, (Object) null);
        if (iIndexOf$default != -1) {
            for (int i3 = i2; i3 < iIndexOf$default; i3++) {
                if (iF().charAt(i3) == '\\') {
                    return r(iF(), this.f6723n, i3);
                }
            }
            this.f6723n = iIndexOf$default + 1;
            String strSubstring = iF().substring(i2, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        o();
        String strT = n.t((byte) 1);
        int i5 = this.f6723n;
        j.nY(this, "Expected " + strT + ", but had '" + ((i5 == iF().length() || i5 < 0) ? "EOF" : String.valueOf(iF().charAt(i5))) + "' instead", i5, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @Override // Mms.j
    public int nHg() {
        char cCharAt;
        int i2 = this.f6723n;
        if (i2 == -1) {
            return i2;
        }
        String strIF = iF();
        while (i2 < strIF.length() && ((cCharAt = strIF.charAt(i2)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i2++;
        }
        this.f6723n = i2;
        return i2;
    }

    @Override // Mms.j
    public int T(int i2) {
        if (i2 < iF().length()) {
            return i2;
        }
        return -1;
    }

    @Override // Mms.j
    public byte gh() {
        String strIF = iF();
        int i2 = this.f6723n;
        while (i2 != -1 && i2 < strIF.length()) {
            int i3 = i2 + 1;
            char cCharAt = strIF.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f6723n = i3;
                return n.n(cCharAt);
            }
            i2 = i3;
        }
        this.f6723n = strIF.length();
        return (byte) 10;
    }
}
