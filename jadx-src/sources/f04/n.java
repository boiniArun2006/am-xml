package f04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f64049n = new n();
    private static final ThreadFactory rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final ExecutorService f64050t;

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: f04.j
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return n.t(runnable);
            }
        };
        rl = threadFactory;
        f64050t = Executors.newCachedThreadPool(threadFactory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread t(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        return thread;
    }

    public final void rl(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        f64050t.execute(task);
    }

    private n() {
    }
}
