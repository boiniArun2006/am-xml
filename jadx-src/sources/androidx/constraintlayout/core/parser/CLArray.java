package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class CLArray extends CLContainer {
    public static CLElement Xw(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String Ik() {
        StringBuilder sb = new StringBuilder(O() + "[");
        boolean z2 = true;
        for (int i2 = 0; i2 < this.f35319o.size(); i2++) {
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(((CLElement) this.f35319o.get(i2)).Ik());
        }
        return ((Object) sb) + "]";
    }

    public CLArray(char[] cArr) {
        super(cArr);
    }
}
