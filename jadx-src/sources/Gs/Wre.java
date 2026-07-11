package Gs;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class Wre implements RunnableFuture, ScheduledFuture {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f3748n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FutureTask f3749t;

    public Wre(Handler handler, Callable callable) {
        this.f3748n = handler;
        this.f3749t = new FutureTask(callable);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f3749t.get();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        return this.f3749t.cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) {
        return this.f3749t.get(j2, timeUnit);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f3749t.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f3749t.isDone();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        this.f3749t.run();
    }

    public Wre(Handler handler, Runnable runnable, Object obj) {
        this.f3748n = handler;
        this.f3749t = new FutureTask(runnable, obj);
    }
}
