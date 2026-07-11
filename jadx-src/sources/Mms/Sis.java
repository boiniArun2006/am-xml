package Mms;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Sis extends yg {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sis(String source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
    }

    @Override // Mms.yg, Mms.j
    public int nHg() {
        int i2;
        int iIndexOf$default = this.f6723n;
        if (iIndexOf$default == -1) {
            return iIndexOf$default;
        }
        String strIF = iF();
        while (iIndexOf$default < strIF.length()) {
            char cCharAt = strIF.charAt(iIndexOf$default);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i2 = iIndexOf$default + 1) >= strIF.length()) {
                    break;
                }
                char cCharAt2 = strIF.charAt(i2);
                if (cCharAt2 == '*') {
                    int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) strIF, "*/", iIndexOf$default + 2, false, 4, (Object) null);
                    if (iIndexOf$default2 == -1) {
                        this.f6723n = strIF.length();
                        j.nY(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    iIndexOf$default = iIndexOf$default2 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iIndexOf$default = StringsKt.indexOf$default((CharSequence) strIF, '\n', iIndexOf$default + 2, false, 4, (Object) null);
                    iIndexOf$default = iIndexOf$default == -1 ? strIF.length() : iIndexOf$default + 1;
                }
            }
        }
        this.f6723n = iIndexOf$default;
        return iIndexOf$default;
    }

    @Override // Mms.yg, Mms.j
    public boolean J2() {
        int iNHg = nHg();
        if (iNHg < iF().length() && iNHg != -1) {
            return fD(iF().charAt(iNHg));
        }
        return false;
    }

    @Override // Mms.yg, Mms.j
    public void az(char c2) {
        String strIF = iF();
        int iNHg = nHg();
        if (iNHg >= strIF.length() || iNHg == -1) {
            this.f6723n = -1;
            Xw(c2);
        }
        char cCharAt = strIF.charAt(iNHg);
        this.f6723n = iNHg + 1;
        if (cCharAt == c2) {
            return;
        }
        Xw(c2);
    }

    @Override // Mms.j
    public byte e() {
        String strIF = iF();
        int iNHg = nHg();
        if (iNHg < strIF.length() && iNHg != -1) {
            this.f6723n = iNHg;
            return n.n(strIF.charAt(iNHg));
        }
        return (byte) 10;
    }

    @Override // Mms.yg, Mms.j
    public byte gh() {
        String strIF = iF();
        int iNHg = nHg();
        if (iNHg < strIF.length() && iNHg != -1) {
            this.f6723n = iNHg + 1;
            return n.n(strIF.charAt(iNHg));
        }
        return (byte) 10;
    }
}
