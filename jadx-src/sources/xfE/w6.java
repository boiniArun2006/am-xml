package xfE;

import xfE.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class w6 implements aC {

    class j implements Dsr {
        j() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(Wre.j jVar, Wre.j jVar2) {
            long jN = jVar.n();
            long jN2 = jVar2.n();
            if (jN < jN2) {
                return -1;
            }
            if (jN2 == jN) {
                return 0;
            }
            return 1;
        }
    }

    @Override // xfE.aC
    public Dsr get() {
        return new j();
    }
}
