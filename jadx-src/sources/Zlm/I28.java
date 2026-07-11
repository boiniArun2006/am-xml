package Zlm;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class I28 implements Executor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ExecutorService f12586n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f12587t = new Object();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Task f12585O = Tasks.forResult(null);

    public Task O(final Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.f12587t) {
            taskContinueWithTask = this.f12585O.continueWithTask(this.f12586n, new Continuation() { // from class: Zlm.w6
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return I28.rl(callable, task);
                }
            });
            this.f12585O = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f12586n.execute(runnable);
    }

    public Task nr(final Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f12587t) {
            taskContinueWithTask = this.f12585O.continueWithTask(this.f12586n, new Continuation() { // from class: Zlm.Ml
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return I28.n(runnable, task);
                }
            });
            this.f12585O = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public ExecutorService t() {
        return this.f12586n;
    }

    I28(ExecutorService executorService) {
        this.f12586n = executorService;
    }

    public static /* synthetic */ Task n(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.forResult(null);
    }

    public static /* synthetic */ Task rl(Callable callable, Task task) {
        return (Task) callable.call();
    }
}
