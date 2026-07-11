package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class C2191d implements InterfaceC2193f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char f69052a;

    C2191d(char c2) {
        this.f69052a = c2;
    }

    @Override // j$.time.format.InterfaceC2193f
    public final boolean q(y yVar, StringBuilder sb) {
        sb.append(this.f69052a);
        return true;
    }

    @Override // j$.time.format.InterfaceC2193f
    public final int s(w wVar, CharSequence charSequence, int i2) {
        if (i2 == charSequence.length()) {
            return ~i2;
        }
        char cCharAt = charSequence.charAt(i2);
        char c2 = this.f69052a;
        return (cCharAt == c2 || (!wVar.k() && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c2)))) ? i2 + 1 : ~i2;
    }

    public final String toString() {
        char c2 = this.f69052a;
        if (c2 == '\'') {
            return "''";
        }
        return "'" + c2 + "'";
    }
}
