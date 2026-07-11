package Gs;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Ml extends n implements CN3 {
    @Override // Gs.n, java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }

    public Ml(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }
}
