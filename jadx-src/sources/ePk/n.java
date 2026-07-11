package ePk;

import com.safedk.android.analytics.AppLovinBridge;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class n {
    private static final n nr = new n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ExecutorService f63620n;
    private final ScheduledExecutorService rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f63621t;

    /* JADX INFO: renamed from: ePk.n$n, reason: collision with other inner class name */
    private static class ExecutorC0846n implements Executor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ThreadLocal f63622n;

        private ExecutorC0846n() {
            this.f63622n = new ThreadLocal();
        }

        private int n() {
            Integer num = (Integer) this.f63622n.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.f63622n.remove();
                return iIntValue;
            }
            this.f63622n.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        private int rl() {
            Integer num = (Integer) this.f63622n.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.f63622n.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (rl() <= 15) {
                    runnable.run();
                } else {
                    n.n().execute(runnable);
                }
                n();
            } catch (Throwable th) {
                n();
                throw th;
            }
        }
    }

    public static ExecutorService n() {
        return nr.f63620n;
    }

    static Executor rl() {
        return nr.f63621t;
    }

    private static boolean t() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains(AppLovinBridge.f61290h);
    }

    private n() {
        ExecutorService executorServiceRl;
        if (!t()) {
            executorServiceRl = Executors.newCachedThreadPool();
        } else {
            executorServiceRl = ePk.j.rl();
        }
        this.f63620n = executorServiceRl;
        this.rl = Executors.newSingleThreadScheduledExecutor();
        this.f63621t = new ExecutorC0846n();
    }
}
