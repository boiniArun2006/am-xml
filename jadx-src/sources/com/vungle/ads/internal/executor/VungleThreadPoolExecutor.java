package com.vungle.ads.internal.executor;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.util.Logger;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0014\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0018\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u0002H\u001aH\u0016¢\u0006\u0002\u0010\u001cJ!\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u001dJ\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0018\"\u0004\b\u0000\u0010\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001eH\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "corePoolSize", "", "maximumPoolSize", "keepAliveTime", "", "unit", "Ljava/util/concurrent/TimeUnit;", "workQueue", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "threadFactory", "Lcom/vungle/ads/internal/executor/NamedThreadFactory;", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Lcom/vungle/ads/internal/executor/NamedThreadFactory;)V", "getThreadFactory", "()Lcom/vungle/ads/internal/executor/NamedThreadFactory;", "execute", "", "command", "fail", "executorName", "", "submit", "Ljava/util/concurrent/Future;", "task", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "result", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "submit$vungle_ads_release", "Ljava/util/concurrent/Callable;", "Companion", "ComparableRunnable", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleThreadPoolExecutor extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "VungleThreadPool";
    private final NamedThreadFactory threadFactory;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor$Companion;", "", "()V", "TAG", "", "getWrappedCallableWithFallback", "Ljava/util/concurrent/Callable;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "command", "failFallback", "Lkotlin/Function0;", "", "getWrappedRunnableWithFail", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor$ComparableRunnable;", "Ljava/lang/Runnable;", "fail", "wrapRunnableWithFail", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> Callable<T> getWrappedCallableWithFallback(final Callable<T> command, final Function0<Unit> failFallback) {
            return new Callable() { // from class: com.vungle.ads.internal.executor.Ml
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return VungleThreadPoolExecutor.Companion.m238getWrappedCallableWithFallback$lambda0(command, failFallback);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: getWrappedCallableWithFallback$lambda-0, reason: not valid java name */
        public static final Object m238getWrappedCallableWithFallback$lambda0(Callable command, Function0 failFallback) {
            Intrinsics.checkNotNullParameter(command, "$command");
            Intrinsics.checkNotNullParameter(failFallback, "$failFallback");
            try {
                return command.call();
            } catch (OutOfMemoryError unused) {
                failFallback.invoke();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ComparableRunnable getWrappedRunnableWithFail(final Runnable command, final Runnable fail) {
            return command instanceof PriorityRunnable ? new PriorityRunnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$Companion$getWrappedRunnableWithFail$1
                @Override // com.vungle.ads.internal.task.PriorityRunnable, java.lang.Comparable
                public int compareTo(Object other) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    if (!(other instanceof PriorityRunnable)) {
                        return 0;
                    }
                    return Intrinsics.compare(((PriorityRunnable) other).getPriority(), getPriority());
                }

                @Override // com.vungle.ads.internal.task.PriorityRunnable
                public int getPriority() {
                    return ((PriorityRunnable) command).getPriority();
                }

                @Override // java.lang.Runnable
                public void run() {
                    VungleThreadPoolExecutor.INSTANCE.wrapRunnableWithFail(command, fail);
                }
            } : new ComparableRunnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$Companion$getWrappedRunnableWithFail$2
                @Override // java.lang.Comparable
                public int compareTo(Object other) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    Runnable runnable = command;
                    if (runnable instanceof PriorityRunnable) {
                        return ((PriorityRunnable) runnable).compareTo(other);
                    }
                    return 0;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VungleThreadPoolExecutor.INSTANCE.wrapRunnableWithFail(command, fail);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void wrapRunnableWithFail(Runnable command, Runnable fail) {
            try {
                command.run();
            } catch (OutOfMemoryError unused) {
                fail.run();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor$ComparableRunnable;", "", "", "Ljava/lang/Runnable;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ComparableRunnable extends Comparable<Object>, Runnable {
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        try {
            super.execute(INSTANCE.getWrappedRunnableWithFail(command, new Runnable() { // from class: com.vungle.ads.internal.executor.n
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m235execute$lambda0(this.f63269n);
                }
            }));
        } catch (Exception e2) {
            Logger.INSTANCE.e(TAG, "execute exception", e2);
        } catch (OutOfMemoryError e3) {
            String str = "execute error in " + executorName() + ": " + e3.getLocalizedMessage();
            Logger.INSTANCE.e(TAG, str, e3);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            Future<?> futureSubmit = super.submit(INSTANCE.getWrappedRunnableWithFail(task, new Runnable() { // from class: com.vungle.ads.internal.executor.w6
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m236submit$lambda1(this.f63270n);
                }
            }));
            Intrinsics.checkNotNullExpressionValue(futureSubmit, "{\n            super.subm…\n            })\n        }");
            return futureSubmit;
        } catch (Exception e2) {
            Logger.INSTANCE.e(TAG, "submit exception", e2);
            return new FutureResult(null);
        } catch (OutOfMemoryError e3) {
            String str = "submit error in " + executorName() + ": " + e3.getLocalizedMessage();
            Logger.INSTANCE.e(TAG, str, e3);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m235execute$lambda0(VungleThreadPoolExecutor this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new OutOfMemory("execute error in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String executorName() {
        String name;
        NamedThreadFactory namedThreadFactory = this.threadFactory;
        return (namedThreadFactory == null || (name = namedThreadFactory.getName()) == null) ? "VungleThreadPoolExecutor" : name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submit$lambda-1, reason: not valid java name */
    public static final void m236submit$lambda1(VungleThreadPoolExecutor this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new OutOfMemory("submit error in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submit$lambda-2, reason: not valid java name */
    public static final void m237submit$lambda2(VungleThreadPoolExecutor this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new OutOfMemory("submit error with result in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final NamedThreadFactory getThreadFactory() {
        return this.threadFactory;
    }

    public final Future<?> submit$vungle_ads_release(Runnable task, Runnable fail) {
        Intrinsics.checkNotNullParameter(task, "task");
        Intrinsics.checkNotNullParameter(fail, "fail");
        try {
            Future<?> futureSubmit = super.submit(INSTANCE.getWrappedRunnableWithFail(task, fail));
            Intrinsics.checkNotNullExpressionValue(futureSubmit, "{\n            super.subm…il(task, fail))\n        }");
            return futureSubmit;
        } catch (Exception e2) {
            Logger.INSTANCE.e(TAG, "submit exception with fail", e2);
            fail.run();
            return new FutureResult(null);
        } catch (OutOfMemoryError e3) {
            String str = "submit error with fail in " + executorName() + gUxOLwRQBPPLC.xyfQjxCbfsim + e3.getLocalizedMessage();
            Logger.INSTANCE.e(TAG, str, e3);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
            return new FutureResult(null);
        }
    }

    public VungleThreadPoolExecutor(int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, NamedThreadFactory namedThreadFactory) {
        super(i2, i3, j2, timeUnit, blockingQueue, namedThreadFactory);
        this.threadFactory = namedThreadFactory;
        allowCoreThreadTimeOut(true);
    }

    public final void execute(Runnable command, Runnable fail) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(fail, "fail");
        try {
            super.execute(INSTANCE.getWrappedRunnableWithFail(command, fail));
        } catch (Exception e2) {
            Logger.INSTANCE.e(TAG, "execute exception with fail", e2);
            fail.run();
        } catch (OutOfMemoryError e3) {
            String str = "execute error with fail in " + executorName() + ": " + e3.getLocalizedMessage();
            Logger.INSTANCE.e(TAG, str, e3);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable task, T result) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            Future<T> futureSubmit = super.submit(INSTANCE.getWrappedRunnableWithFail(task, new Runnable() { // from class: com.vungle.ads.internal.executor.j
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m237submit$lambda2(this.f63268n);
                }
            }), result);
            Intrinsics.checkNotNullExpressionValue(futureSubmit, "{\n            super.subm…     }, result)\n        }");
            return futureSubmit;
        } catch (Exception e2) {
            Logger.INSTANCE.e(TAG, "submit exception with result", e2);
            return new FutureResult(null);
        } catch (OutOfMemoryError e3) {
            String str = "submit error with result in " + executorName() + ": " + e3.getLocalizedMessage();
            Logger.INSTANCE.e(TAG, str, e3);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureResult(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            Future<T> futureSubmit = super.submit(INSTANCE.getWrappedCallableWithFallback(task, new Function0<Unit>() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor.submit.3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    new OutOfMemory("submit callable error in " + VungleThreadPoolExecutor.this.executorName()).logErrorNoReturnValue$vungle_ads_release();
                }
            }));
            Intrinsics.checkNotNullExpressionValue(futureSubmit, "override fun <T> submit(…Future<T>\n        }\n    }");
            return futureSubmit;
        } catch (Exception e2) {
            Logger.INSTANCE.e(TAG, "submit exception callable: " + e2);
            return new FutureResult(null);
        } catch (OutOfMemoryError e3) {
            String str = "submit error callable in " + executorName() + ": " + e3.getLocalizedMessage();
            Logger.INSTANCE.e(TAG, str, e3);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureResult(null);
        }
    }
}
