package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Operation;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class PruneWorkRunnable implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WorkManagerImpl f42995n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final OperationImpl f42996t;

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f42995n.HI().GR().t();
            this.f42996t.n(Operation.f42739n);
        } catch (Throwable th) {
            this.f42996t.n(new Operation.State.FAILURE(th));
        }
    }
}
