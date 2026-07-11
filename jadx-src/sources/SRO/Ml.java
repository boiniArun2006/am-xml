package SRO;

import DSG.Wre;
import E14.j;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Ml {
    /* JADX INFO: Access modifiers changed from: private */
    public static final E14.w6 rl(Wre wre) {
        E14.j jVar;
        E14.j c0078j;
        String strT = wre.t();
        String strNr = wre.nr();
        String strRl = wre.rl();
        String strN = wre.n();
        if (!(wre instanceof Wre.Ml) && !(wre instanceof Wre.w6)) {
            if (wre instanceof Wre.j) {
                jVar = j.n.f2244n;
            } else {
                if (wre instanceof Wre.n) {
                    c0078j = new j.C0078j(((Wre.n) wre).O());
                    return new E14.w6(strT, strNr, strRl, c0078j, strN);
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            jVar = j.w6.f2245n;
        }
        c0078j = jVar;
        return new E14.w6(strT, strNr, strRl, c0078j, strN);
    }
}
