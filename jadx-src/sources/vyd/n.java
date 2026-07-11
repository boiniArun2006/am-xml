package vyd;

import com.facebook.datasource.w6;
import com.facebook.imagepipeline.producers.KH;
import com.facebook.imagepipeline.producers.l4Z;
import com.facebook.imagepipeline.producers.mz;
import jl.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class n extends j {
    private n(l4Z l4z, KH kh, Ml ml) {
        super(l4z, kh, ml);
    }

    public static w6 X(l4Z l4z, KH kh, Ml ml) {
        if (T5.n.nr()) {
            T5.n.n("CloseableProducerToDataSourceAdapter#create");
        }
        n nVar = new n(l4z, kh, ml);
        if (T5.n.nr()) {
            T5.n.rl();
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vyd.j
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void E2(Pj0.j jVar, int i2, mz mzVar) {
        super.E2(Pj0.j.T(jVar), i2, mzVar);
    }

    @Override // com.facebook.datasource.j, com.facebook.datasource.w6
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Pj0.j getResult() {
        return Pj0.j.T((Pj0.j) super.getResult());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.datasource.j
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void Uo(Pj0.j jVar) {
        Pj0.j.M7(jVar);
    }
}
