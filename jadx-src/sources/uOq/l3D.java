package uOq;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class l3D implements WU.Ml, WU.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f74387n = new HashMap();
    private Queue rl = new ArrayDeque();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f74388t;

    private synchronized Set nr(WU.j jVar) {
        throw null;
    }

    @Override // WU.Ml
    public synchronized void n(Class cls, Executor executor, WU.n nVar) {
        try {
            ci.rl(cls);
            ci.rl(nVar);
            ci.rl(executor);
            if (!this.f74387n.containsKey(cls)) {
                this.f74387n.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f74387n.get(cls)).put(nVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    void t() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.rl;
                if (queue != null) {
                    this.rl = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                android.support.v4.media.j.n(it.next());
                O(null);
            }
        }
    }

    l3D(Executor executor) {
        this.f74388t = executor;
    }

    public void O(final WU.j jVar) {
        ci.rl(jVar);
        synchronized (this) {
            try {
                Queue queue = this.rl;
                if (queue != null) {
                    queue.add(jVar);
                    return;
                }
                for (final Map.Entry entry : nr(jVar)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, jVar) { // from class: uOq.QJ

                        /* JADX INFO: renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ Map.Entry f74370n;

                        @Override // java.lang.Runnable
                        public final void run() {
                            ((WU.n) this.f74370n.getKey()).n(null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
