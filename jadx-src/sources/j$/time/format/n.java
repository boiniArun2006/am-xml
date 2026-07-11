package j$.time.format;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes10.dex */
final class n extends o {
    @Override // j$.time.format.o
    protected final o e(String str, String str2, o oVar) {
        return new n(str, str2, oVar, 0);
    }

    @Override // j$.time.format.o
    protected final boolean c(char c2, char c4) {
        return w.c(c2, c4);
    }

    @Override // j$.time.format.o
    protected final boolean h(CharSequence charSequence, int i2, int i3) {
        int length = this.f69075a.length();
        if (length > i3 - i2) {
            return false;
        }
        int i5 = 0;
        while (true) {
            int i7 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i8 = i5 + 1;
            int i9 = i2 + 1;
            if (!w.c(this.f69075a.charAt(i5), charSequence.charAt(i2))) {
                return false;
            }
            i2 = i9;
            length = i7;
            i5 = i8;
        }
    }
}
