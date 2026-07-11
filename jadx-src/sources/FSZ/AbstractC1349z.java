package FSZ;

import FSZ.Q;
import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: renamed from: FSZ.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class AbstractC1349z {

    /* JADX INFO: renamed from: FSZ.z$j */
    class j implements Z {
        j() {
        }

        @Override // FSZ.Z
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public int n(PooledByteBuffer pooledByteBuffer) {
            return pooledByteBuffer.size();
        }
    }

    public static qz n(Hh.qz qzVar, A72.Ml ml, Q.j jVar) {
        UGc uGc = new UGc(new j(), jVar, qzVar, null, false, false);
        ml.n(uGc);
        return uGc;
    }
}
