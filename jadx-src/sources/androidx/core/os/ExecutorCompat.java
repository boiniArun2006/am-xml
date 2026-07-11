package androidx.core.os;

import android.os.Handler;
import androidx.core.util.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class ExecutorCompat {

    private static class HandlerExecutor implements Executor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Handler f36528n;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f36528n.post((Runnable) Preconditions.Uo(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f36528n + " is shutting down");
        }

        HandlerExecutor(Handler handler) {
            this.f36528n = (Handler) Preconditions.Uo(handler);
        }
    }

    public static Executor n(Handler handler) {
        return new HandlerExecutor(handler);
    }
}
