package Vwv;

import Vwv.n;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class w6 implements n.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final BlockingQueue f11368n;
    private final ThreadPoolExecutor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayDeque f11369t = new ArrayDeque();
    private n nr = null;

    @Override // Vwv.n.j
    public void n(n nVar) {
        this.nr = null;
        rl();
    }

    private void rl() {
        n nVar = (n) this.f11369t.poll();
        this.nr = nVar;
        if (nVar != null) {
            nVar.t(this.rl);
        }
    }

    public w6() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f11368n = linkedBlockingQueue;
        this.rl = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public void t(n nVar) {
        nVar.n(this);
        this.f11369t.add(nVar);
        if (this.nr == null) {
            rl();
        }
    }
}
