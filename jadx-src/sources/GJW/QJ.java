package GJW;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class QJ {
    public static final void n(Pl pl, O o2) {
        t(pl, new LEl(o2));
    }

    public static final eO rl(Continuation continuation) {
        if (!(continuation instanceof dzu.fuX)) {
            return new eO(continuation, 1);
        }
        eO eOVarMUb = ((dzu.fuX) continuation).mUb();
        if (eOVarMUb != null) {
            if (!eOVarMUb.bzg()) {
                eOVarMUb = null;
            }
            if (eOVarMUb != null) {
                return eOVarMUb;
            }
        }
        return new eO(continuation, 2);
    }

    public static final void t(Pl pl, qz qzVar) {
        if (!(pl instanceof eO)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((eO) pl).N(qzVar);
    }
}
