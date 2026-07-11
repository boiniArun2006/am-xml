package org.junit.internal;

import PA.Ml;
import PA.Wre;
import PA.w6;
import java.io.Serializable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class j extends PA.n implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f71577n;

    static Ml rl(Ml ml) {
        return (ml == null || (ml instanceof Serializable)) ? ml : new j(ml);
    }

    @Override // PA.I28
    public void n(w6 w6Var) {
        w6Var.n(this.f71577n);
    }

    private j(Ml ml) {
        this.f71577n = Wre.gh(ml);
    }
}
