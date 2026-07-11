package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.Xo;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public class WorkForegroundUpdater implements ForegroundUpdater {
    private static final String nr = Logger.J2("WMFgUpdater");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TaskExecutor f43030n;
    final ForegroundProcessor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final WorkSpecDao f43031t;

    public WorkForegroundUpdater(WorkDatabase workDatabase, ForegroundProcessor foregroundProcessor, TaskExecutor taskExecutor) {
        this.rl = foregroundProcessor;
        this.f43030n = taskExecutor;
        this.f43031t = workDatabase.GR();
    }

    @Override // androidx.work.ForegroundUpdater
    public Xo n(final Context context, final UUID uuid, final ForegroundInfo foregroundInfo) {
        final SettableFuture settableFutureO = SettableFuture.o();
        this.f43030n.rl(new Runnable() { // from class: androidx.work.impl.utils.WorkForegroundUpdater.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!settableFutureO.isCancelled()) {
                        String string = uuid.toString();
                        WorkInfo.State stateXMQ = WorkForegroundUpdater.this.f43031t.xMQ(string);
                        if (stateXMQ == null || stateXMQ.n()) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        WorkForegroundUpdater.this.rl.rl(string, foregroundInfo);
                        context.startService(SystemForegroundDispatcher.n(context, string, foregroundInfo));
                    }
                    settableFutureO.HI(null);
                } catch (Throwable th) {
                    settableFutureO.ck(th);
                }
            }
        });
        return settableFutureO;
    }
}
