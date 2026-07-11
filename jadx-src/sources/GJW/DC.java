package GJW;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class DC extends lej {
    public abstract DC T3L();

    protected final String Bu() {
        DC dcT3L;
        DC dcT = OU.t();
        if (this == dcT) {
            return "Dispatchers.Main";
        }
        try {
            dcT3L = dcT.T3L();
        } catch (UnsupportedOperationException unused) {
            dcT3L = null;
        }
        if (this != dcT3L) {
            return null;
        }
        return "Dispatchers.Main.immediate";
    }

    @Override // GJW.lej
    public lej K(int i2, String str) {
        dzu.o.n(i2);
        return dzu.o.rl(this, str);
    }

    @Override // GJW.lej
    public String toString() {
        String strBu = Bu();
        if (strBu == null) {
            return psW.n(this) + '@' + psW.rl(this);
        }
        return strBu;
    }
}
