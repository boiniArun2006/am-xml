package BC;

import java.util.List;
import pUk.UGc;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class fuX {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final eZ.w6 f400O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f401n;
    private final com.google.protobuf.C nr;
    private final UGc rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f402t;

    public com.google.protobuf.C J2() {
        return this.nr;
    }

    public List O() {
        return this.f402t;
    }

    public eZ.w6 nr() {
        return this.f400O;
    }

    public CN3 rl() {
        return this.f401n;
    }

    public UGc t() {
        return this.rl;
    }

    private fuX(CN3 cn3, UGc uGc, List list, com.google.protobuf.C c2, eZ.w6 w6Var) {
        this.f401n = cn3;
        this.rl = uGc;
        this.f402t = list;
        this.nr = c2;
        this.f400O = w6Var;
    }

    public static fuX n(CN3 cn3, UGc uGc, List list, com.google.protobuf.C c2) {
        boolean z2;
        if (cn3.Uo().size() == list.size()) {
            z2 = true;
        } else {
            z2 = false;
        }
        wqP.n.t(z2, "Mutations sent %d must equal results received %d", Integer.valueOf(cn3.Uo().size()), Integer.valueOf(list.size()));
        eZ.w6 w6VarRl = pUk.Dsr.rl();
        List listUo = cn3.Uo();
        eZ.w6 w6VarUo = w6VarRl;
        for (int i2 = 0; i2 < listUo.size(); i2++) {
            w6VarUo = w6VarUo.Uo(((Wre) listUo.get(i2)).J2(), ((Dsr) list.get(i2)).rl());
        }
        return new fuX(cn3, uGc, list, c2, w6VarUo);
    }
}
