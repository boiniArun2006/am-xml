package j$.time.format;

import j$.time.DateTimeException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class m implements InterfaceC2193f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2193f f69072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f69073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f69074c;

    m(InterfaceC2193f interfaceC2193f, int i2, char c2) {
        this.f69072a = interfaceC2193f;
        this.f69073b = i2;
        this.f69074c = c2;
    }

    @Override // j$.time.format.InterfaceC2193f
    public final boolean q(y yVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.f69072a.q(yVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i2 = this.f69073b;
        if (length2 <= i2) {
            for (int i3 = 0; i3 < i2 - length2; i3++) {
                sb.insert(length, this.f69074c);
            }
            return true;
        }
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i2);
    }

    @Override // j$.time.format.InterfaceC2193f
    public final int s(w wVar, CharSequence charSequence, int i2) {
        boolean zL2 = wVar.l();
        if (i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == charSequence.length()) {
            return ~i2;
        }
        int length = this.f69073b + i2;
        if (length > charSequence.length()) {
            if (zL2) {
                return ~i2;
            }
            length = charSequence.length();
        }
        int i3 = i2;
        while (i3 < length && wVar.b(charSequence.charAt(i3), this.f69074c)) {
            i3++;
        }
        int iS = this.f69072a.s(wVar, charSequence.subSequence(0, length), i3);
        return (iS == length || !zL2) ? iS : ~(i2 + i3);
    }

    public final String toString() {
        String str;
        char c2 = this.f69074c;
        if (c2 == ' ') {
            str = ")";
        } else {
            str = ",'" + c2 + "')";
        }
        return "Pad(" + this.f69072a + "," + this.f69073b + str;
    }
}
