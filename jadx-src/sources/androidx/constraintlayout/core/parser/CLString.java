package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class CLString extends CLElement {
    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CLString) && t().equals(((CLString) obj).t())) {
            return true;
        }
        return super.equals(obj);
    }

    public static CLString o(String str) {
        CLString cLString = new CLString(str.toCharArray());
        cLString.ck(0L);
        cLString.ty(str.length() - 1);
        return cLString;
    }

    public static CLElement r(char[] cArr) {
        return new CLString(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String Ik() {
        return "'" + t() + "'";
    }

    public CLString(char[] cArr) {
        super(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return super.hashCode();
    }
}
