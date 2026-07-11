package oM;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class j implements Executor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f71430n = new j();

    private j() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
