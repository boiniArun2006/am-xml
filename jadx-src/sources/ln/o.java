package ln;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import xfE.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class o implements InterfaceC2270z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private qz f70536n;

    private static xfE.CN3 t(xfE.Ml ml, xfE.Wre wre, Executor executor) {
        return new xfE.CN3(wre, ml.KN(), new CN3.w6(ml.gh(), ml.mUb(), ml.J2()), ml.O(), ml.nr(), ml.Uo(), executor, ml.xMQ());
    }

    @Override // ln.InterfaceC2270z
    public xfE.C n(xfE.Ml ml) {
        return rl(ml, this.f70536n.n(ml));
    }

    public o(qz qzVar) {
        this.f70536n = qzVar;
    }

    private static xfE.CN3 rl(xfE.Ml ml, xfE.Wre wre) {
        return t(ml, wre, Executors.newSingleThreadExecutor());
    }
}
