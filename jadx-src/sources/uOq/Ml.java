package uOq;

import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public interface Ml {
    oSp.n Uo(g9s g9sVar);

    oSp.n rl(g9s g9sVar);

    oSp.j t(g9s g9sVar);

    default Set J2(g9s g9sVar) {
        return (Set) Uo(g9sVar).get();
    }

    default Object KN(g9s g9sVar) {
        oSp.n nVarRl = rl(g9sVar);
        if (nVarRl == null) {
            return null;
        }
        return nVarRl.get();
    }

    default oSp.n O(Class cls) {
        return rl(g9s.rl(cls));
    }

    default Object n(Class cls) {
        return KN(g9s.rl(cls));
    }

    default Set nr(Class cls) {
        return J2(g9s.rl(cls));
    }

    default oSp.j xMQ(Class cls) {
        return t(g9s.rl(cls));
    }
}
