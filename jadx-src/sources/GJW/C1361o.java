package GJW;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: GJW.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class C1361o implements qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Future f3497n;

    @Override // GJW.qz
    public void n(Throwable th) {
        this.f3497n.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f3497n + ']';
    }

    public C1361o(Future future) {
        this.f3497n = future;
    }
}
