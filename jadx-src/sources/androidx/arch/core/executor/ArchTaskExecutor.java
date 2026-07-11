package androidx.arch.core.executor;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class ArchTaskExecutor extends TaskExecutor {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static volatile ArchTaskExecutor f14459t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TaskExecutor f14460n;
    private final TaskExecutor rl;
    private static final Executor nr = new Executor() { // from class: androidx.arch.core.executor.j
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ArchTaskExecutor.KN().nr(runnable);
        }
    };

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Executor f14458O = new Executor() { // from class: androidx.arch.core.executor.n
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            ArchTaskExecutor.KN().n(runnable);
        }
    };

    public static ArchTaskExecutor KN() {
        if (f14459t != null) {
            return f14459t;
        }
        synchronized (ArchTaskExecutor.class) {
            try {
                if (f14459t == null) {
                    f14459t = new ArchTaskExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f14459t;
    }

    public static Executor Uo() {
        return f14458O;
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void n(Runnable runnable) {
        this.f14460n.n(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void nr(Runnable runnable) {
        this.f14460n.nr(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean t() {
        return this.f14460n.t();
    }

    private ArchTaskExecutor() {
        DefaultTaskExecutor defaultTaskExecutor = new DefaultTaskExecutor();
        this.rl = defaultTaskExecutor;
        this.f14460n = defaultTaskExecutor;
    }
}
