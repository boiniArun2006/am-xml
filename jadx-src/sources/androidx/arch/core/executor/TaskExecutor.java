package androidx.arch.core.executor;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public abstract class TaskExecutor {
    public abstract void n(Runnable runnable);

    public abstract void nr(Runnable runnable);

    public abstract boolean t();

    public void rl(Runnable runnable) {
        if (t()) {
            runnable.run();
        } else {
            nr(runnable);
        }
    }
}
