package PA;

import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Wre extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Appendable f7606n;

    public Wre() {
        this(new StringBuilder());
    }

    public Wre(Appendable appendable) {
        this.f7606n = appendable;
    }

    public static String qie(I28 i28) {
        return new Wre().t(i28).toString();
    }

    @Override // PA.j
    protected void O(String str) {
        try {
            this.f7606n.append(str);
        } catch (IOException e2) {
            throw new RuntimeException("Could not write description", e2);
        }
    }

    @Override // PA.j
    protected void nr(char c2) {
        try {
            this.f7606n.append(c2);
        } catch (IOException e2) {
            throw new RuntimeException("Could not write description", e2);
        }
    }

    public String toString() {
        return this.f7606n.toString();
    }

    public static String gh(I28 i28) {
        return qie(i28);
    }
}
