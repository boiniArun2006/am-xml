package GJW;

import java.util.concurrent.Executor;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class mz implements Executor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lej f3496n;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        lej lejVar = this.f3496n;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        if (dzu.Dsr.nr(lejVar, emptyCoroutineContext)) {
            dzu.Dsr.t(this.f3496n, emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f3496n.toString();
    }

    public mz(lej lejVar) {
        this.f3496n = lejVar;
    }
}
