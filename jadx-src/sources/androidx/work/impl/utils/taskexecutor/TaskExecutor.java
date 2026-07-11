package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public interface TaskExecutor {
    SerialExecutor getBackgroundExecutor();

    Executor n();

    void rl(Runnable runnable);
}
