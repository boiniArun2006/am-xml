package GJW;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class R6 {
    public static final Executor n(lej lejVar) {
        Executor executorT3L;
        FKk fKk = lejVar instanceof FKk ? (FKk) lejVar : null;
        return (fKk == null || (executorT3L = fKk.T3L()) == null) ? new mz(lejVar) : executorT3L;
    }

    public static final lej rl(Executor executor) {
        lej lejVar;
        mz mzVar = executor instanceof mz ? (mz) executor : null;
        return (mzVar == null || (lejVar = mzVar.f3496n) == null) ? new Fl(executor) : lejVar;
    }

    public static final FKk t(ExecutorService executorService) {
        return new Fl(executorService);
    }
}
