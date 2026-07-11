package com.airbnb.lottie;

import FQq.Q;
import FQq.ci;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class z {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static Executor f43967O = Executors.newCachedThreadPool(new x0.fuX());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f43968n;
    private volatile ci nr;
    private final Set rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f43969t;

    public z(Callable callable) {
        this(callable, false);
    }

    private synchronized void J2(Throwable th) {
        ArrayList arrayList = new ArrayList(this.rl);
        if (arrayList.isEmpty()) {
            x0.CN3.nr("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Q) it.next()).onResult(th);
        }
    }

    private synchronized void xMQ(Object obj) {
        Iterator it = new ArrayList(this.f43968n).iterator();
        while (it.hasNext()) {
            ((Q) it.next()).onResult(obj);
        }
    }

    public synchronized z gh(Q q2) {
        this.f43968n.remove(q2);
        return this;
    }

    public synchronized z mUb(Q q2) {
        this.rl.remove(q2);
        return this;
    }

    public synchronized z nr(Q q2) {
        try {
            ci ciVar = this.nr;
            if (ciVar != null && ciVar.rl() != null) {
                q2.onResult(ciVar.rl());
            }
            this.f43968n.add(q2);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized z t(Q q2) {
        try {
            ci ciVar = this.nr;
            if (ciVar != null && ciVar.n() != null) {
                q2.onResult(ciVar.n());
            }
            this.rl.add(q2);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private static class j extends FutureTask {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private z f43970n;

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.f43970n.qie((ci) get());
                } catch (InterruptedException | ExecutionException e2) {
                    this.f43970n.qie(new ci(e2));
                }
            } finally {
                this.f43970n = null;
            }
        }

        j(z zVar, Callable callable) {
            super(callable);
            this.f43970n = zVar;
        }
    }

    public z(Object obj) {
        this.f43968n = new LinkedHashSet(1);
        this.rl = new LinkedHashSet(1);
        this.f43969t = new Handler(Looper.getMainLooper());
        this.nr = null;
        qie(new ci(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void KN() {
        ci ciVar = this.nr;
        if (ciVar == null) {
            return;
        }
        if (ciVar.rl() != null) {
            xMQ(ciVar.rl());
        } else {
            J2(ciVar.n());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qie(ci ciVar) {
        if (this.nr != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.nr = ciVar;
        Uo();
    }

    public ci O() {
        return this.nr;
    }

    private void Uo() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            KN();
        } else {
            this.f43969t.post(new Runnable() { // from class: FQq.g9s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2572n.KN();
                }
            });
        }
    }

    z(Callable callable, boolean z2) {
        this.f43968n = new LinkedHashSet(1);
        this.rl = new LinkedHashSet(1);
        this.f43969t = new Handler(Looper.getMainLooper());
        this.nr = null;
        if (z2) {
            try {
                qie((ci) callable.call());
                return;
            } catch (Throwable th) {
                qie(new ci(th));
                return;
            }
        }
        f43967O.execute(new j(this, callable));
    }
}
