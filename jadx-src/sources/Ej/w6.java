package Ej;

import Ej.n;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class w6 implements n.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final BlockingQueue f2362n;
    private final ThreadPoolExecutor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayDeque f2363t = new ArrayDeque();
    private n nr = null;

    @Override // Ej.n.j
    public void n(n nVar) {
        this.nr = null;
        rl();
    }

    private void rl() {
        n nVar = (n) this.f2363t.poll();
        this.nr = nVar;
        if (nVar != null) {
            nVar.t(this.rl);
        }
    }

    public w6() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f2362n = linkedBlockingQueue;
        this.rl = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public void t(n nVar) {
        nVar.n(this);
        this.f2363t.add(nVar);
        if (this.nr == null) {
            rl();
        }
    }
}
