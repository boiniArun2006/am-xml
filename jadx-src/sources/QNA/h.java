package QNA;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicInteger f8117n = new AtomicInteger();
    private final AtomicInteger rl = new AtomicInteger();

    public void n() {
        this.rl.getAndIncrement();
    }

    public void rl() {
        this.f8117n.getAndIncrement();
    }

    public void t() {
        this.rl.set(0);
    }
}
