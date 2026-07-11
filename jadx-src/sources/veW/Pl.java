package veW;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class Pl implements Executor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f74713n;

    static class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Runnable f74714n;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f74714n.run();
            } catch (Exception e2) {
                l0.j.nr("Executor", "Background execution failure.", e2);
            }
        }

        j(Runnable runnable) {
            this.f74714n = runnable;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f74713n.execute(new j(runnable));
    }

    Pl(Executor executor) {
        this.f74713n = executor;
    }
}
