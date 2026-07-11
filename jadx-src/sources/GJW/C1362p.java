package GJW;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: GJW.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class C1362p implements O {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Future f3499n;

    @Override // GJW.O
    public void n() {
        this.f3499n.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f3499n + ']';
    }

    public C1362p(Future future) {
        this.f3499n = future;
    }
}
