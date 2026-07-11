package x0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class fuX implements ThreadFactory {
    private static final AtomicInteger J2 = new AtomicInteger(1);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f75178O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ThreadGroup f75179n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AtomicInteger f75180t = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f75179n, runnable, this.f75178O + this.f75180t.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }

    public fuX() {
        ThreadGroup threadGroup;
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            threadGroup = Thread.currentThread().getThreadGroup();
        } else {
            threadGroup = securityManager.getThreadGroup();
        }
        this.f75179n = threadGroup;
        this.f75178O = "lottie-" + J2.getAndIncrement() + "-thread-";
    }
}
