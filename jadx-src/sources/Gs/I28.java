package Gs;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class I28 extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f3747n;

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture submit(Runnable runnable) {
        return submit(runnable, null);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        Wre wreNewTaskFor = newTaskFor(runnable, null);
        this.f3747n.postDelayed(wreNewTaskFor, timeUnit.toMillis(j2));
        return wreNewTaskFor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public Wre newTaskFor(Callable callable) {
        return new Wre(this.f3747n, callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3747n.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.util.concurrent.AbstractExecutorService
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public Wre newTaskFor(Runnable runnable, Object obj) {
        return new Wre(this.f3747n, runnable, obj);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public I28(Handler handler) {
        this.f3747n = handler;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture submit(Callable callable) {
        callable.getClass();
        Wre wreNewTaskFor = newTaskFor(callable);
        execute(wreNewTaskFor);
        return wreNewTaskFor;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: jB, reason: merged with bridge method [inline-methods] */
    public ScheduledFuture submit(Runnable runnable, Object obj) {
        runnable.getClass();
        Wre wreNewTaskFor = newTaskFor(runnable, obj);
        execute(wreNewTaskFor);
        return wreNewTaskFor;
    }

    public boolean n() {
        if (Thread.currentThread() == this.f3747n.getLooper().getThread()) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        Wre wreNewTaskFor = newTaskFor(callable);
        this.f3747n.postDelayed(wreNewTaskFor, timeUnit.toMillis(j2));
        return wreNewTaskFor;
    }
}
