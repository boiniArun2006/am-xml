package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class WorkManagerTaskExecutor implements TaskExecutor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SerialExecutor f43068n;
    private final Handler rl = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f43069t = new Executor() { // from class: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.1
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            WorkManagerTaskExecutor.this.t(runnable);
        }
    };

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public SerialExecutor getBackgroundExecutor() {
        return this.f43068n;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public Executor n() {
        return this.f43069t;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public void rl(Runnable runnable) {
        this.f43068n.execute(runnable);
    }

    public void t(Runnable runnable) {
        this.rl.post(runnable);
    }

    public WorkManagerTaskExecutor(Executor executor) {
        this.f43068n = new SerialExecutor(executor);
    }
}
