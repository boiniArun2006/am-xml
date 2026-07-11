package gq;

import java.util.Comparator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final pUk.C f67689n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Comparator f67688t = new Comparator() { // from class: gq.w6
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return I28.rl((I28) obj, (I28) obj2);
        }
    };
    static final Comparator nr = new Comparator() { // from class: gq.Ml
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return I28.n((I28) obj, (I28) obj2);
        }
    };

    public static /* synthetic */ int n(I28 i28, I28 i282) {
        int iGh = wqP.Z.gh(i28.rl, i282.rl);
        return iGh != 0 ? iGh : i28.f67689n.compareTo(i282.f67689n);
    }

    public static /* synthetic */ int rl(I28 i28, I28 i282) {
        int iCompareTo = i28.f67689n.compareTo(i282.f67689n);
        return iCompareTo != 0 ? iCompareTo : wqP.Z.gh(i28.rl, i282.rl);
    }

    pUk.C nr() {
        return this.f67689n;
    }

    int t() {
        return this.rl;
    }

    public I28(pUk.C c2, int i2) {
        this.f67689n = c2;
        this.rl = i2;
    }
}
