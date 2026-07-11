package bAP;

import Hh.C;
import bA.Xo;
import bA.eO;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Wre implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f43209n;

    private static class j implements n {
        @Override // bAP.Wre.n
        public int rl() {
            return 0;
        }

        private j() {
        }

        @Override // bAP.Wre.n
        public List n() {
            return Collections.EMPTY_LIST;
        }
    }

    public interface n {
        List n();

        int rl();
    }

    public Wre() {
        this(new j());
    }

    @Override // bAP.Ml
    public boolean t() {
        return true;
    }

    public Wre(n nVar) {
        this.f43209n = (n) C.Uo(nVar);
    }

    @Override // bAP.Ml
    public int n(int i2) {
        List listN = this.f43209n.n();
        if (listN == null || listN.isEmpty()) {
            return i2 + 1;
        }
        for (int i3 = 0; i3 < listN.size(); i3++) {
            if (((Integer) listN.get(i3)).intValue() > i2) {
                return ((Integer) listN.get(i3)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override // bAP.Ml
    public eO rl(int i2) {
        return Xo.nr(i2, i2 >= this.f43209n.rl(), false);
    }
}
