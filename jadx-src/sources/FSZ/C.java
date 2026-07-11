package FSZ;

import FSZ.Q;
import FSZ.qz;
import bA.InterfaceC1656I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class C implements FSZ.j {

    class j implements Z {
        j() {
        }

        @Override // FSZ.Z
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public int n(InterfaceC1656I28 interfaceC1656I28) {
            return interfaceC1656I28.getSizeInBytes();
        }
    }

    @Override // FSZ.j
    public qz n(Hh.qz qzVar, A72.Ml ml, Q.j jVar, boolean z2, boolean z3, qz.n nVar) {
        UGc uGc = new UGc(new j(), jVar, qzVar, nVar, z2, z3);
        ml.n(uGc);
        return uGc;
    }
}
