package io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList f68721n = new ArrayList();
    private volatile JP.qz rl = JP.qz.IDLE;

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Runnable f68722n;
        final Executor rl;

        void n() {
            this.rl.execute(this.f68722n);
        }

        j(Runnable runnable, Executor executor) {
            this.f68722n = runnable;
            this.rl = executor;
        }
    }

    JP.qz n() {
        JP.qz qzVar = this.rl;
        if (qzVar != null) {
            return qzVar;
        }
        throw new UnsupportedOperationException("Channel state API is not implemented");
    }

    void rl(JP.qz qzVar) {
        t1.Xo.ck(qzVar, "newState");
        if (this.rl == qzVar || this.rl == JP.qz.SHUTDOWN) {
            return;
        }
        this.rl = qzVar;
        if (this.f68721n.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f68721n;
        this.f68721n = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((j) it.next()).n();
        }
    }

    void t(Runnable runnable, Executor executor, JP.qz qzVar) {
        t1.Xo.ck(runnable, "callback");
        t1.Xo.ck(executor, "executor");
        t1.Xo.ck(qzVar, "source");
        j jVar = new j(runnable, executor);
        if (this.rl != qzVar) {
            jVar.n();
        } else {
            this.f68721n.add(jVar);
        }
    }

    r() {
    }
}
