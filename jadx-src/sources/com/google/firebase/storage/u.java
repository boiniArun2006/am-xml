package com.google.firebase.storage;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.storage.g9s;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class u {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private j f60900O;
    private int nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private g9s f60902t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Queue f60901n = new ConcurrentLinkedQueue();
    private final HashMap rl = new HashMap();

    interface j {
        void n(Object obj, Object obj2);
    }

    public void O() {
        if ((this.f60902t.g() & this.nr) != 0) {
            final g9s.j jVarP5 = this.f60902t.P5();
            for (final Object obj : this.f60901n) {
                O6.CN3 cn3 = (O6.CN3) this.rl.get(obj);
                if (cn3 != null) {
                    cn3.n(new Runnable() { // from class: com.google.firebase.storage.Ew
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f60842n.f60900O.n(obj, jVarP5);
                        }
                    });
                }
            }
        }
    }

    public u(g9s g9sVar, int i2, j jVar) {
        this.f60902t = g9sVar;
        this.nr = i2;
        this.f60900O = jVar;
    }

    public void J2(Object obj) {
        Preconditions.checkNotNull(obj);
        synchronized (this.f60902t.T()) {
            this.rl.remove(obj);
            this.f60901n.remove(obj);
            O6.j.n().rl(obj);
        }
    }

    public void nr(Activity activity, Executor executor, final Object obj) {
        boolean z2;
        O6.CN3 cn3;
        Preconditions.checkNotNull(obj);
        synchronized (this.f60902t.T()) {
            try {
                z2 = false;
                if ((this.f60902t.g() & this.nr) != 0) {
                    z2 = true;
                }
                this.f60901n.add(obj);
                cn3 = new O6.CN3(executor);
                this.rl.put(obj, cn3);
                if (activity != null) {
                    Preconditions.checkArgument(!activity.isDestroyed(), "Activity is already destroyed!");
                    O6.j.n().t(activity, obj, new Runnable() { // from class: com.google.firebase.storage.nKK
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f60880n.J2(obj);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            final g9s.j jVarP5 = this.f60902t.P5();
            cn3.n(new Runnable() { // from class: com.google.firebase.storage.DAz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f60835n.f60900O.n(obj, jVarP5);
                }
            });
        }
    }
}
