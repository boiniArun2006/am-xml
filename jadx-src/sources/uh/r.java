package uh;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import gq.C2144o;
import gq.tmw;
import gq.yg;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import uh.Xo;
import uh.aC;
import wqP.InterfaceC2419z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class r {
    private yg J2;
    private com.google.firebase.firestore.remote.ci KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TTh.j f74537O;
    private gq.g9s Uo;
    private tmw gh;
    private Xo mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final o f74538n;
    private final wqP.I28 nr;
    private tmw qie;
    private final VtZ.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final VtZ.j f74539t;
    private rv6 xMQ;

    public static /* synthetic */ void rl(String str) {
    }

    public static /* synthetic */ void J2(r rVar, VtZ.aC aCVar) {
        wqP.n.t(rVar.xMQ != null, "SyncEngine not yet initialized", new Object[0]);
        wqP.QJ.n("FirestoreClient", "Credential changed. Current user: %s", aCVar.n());
        rVar.xMQ.gh(aCVar);
    }

    public boolean KN() {
        return this.nr.gh();
    }

    public void mUb(final lej lejVar) {
        this.nr.xMQ(new Runnable() { // from class: uh.s4
            @Override // java.lang.Runnable
            public final void run() {
                this.f74545n.mUb.J2(lejVar);
            }
        });
    }

    public r(final Context context, o oVar, VtZ.j jVar, VtZ.j jVar2, final wqP.I28 i28, final Pe.C c2, final aC aCVar) {
        this.f74538n = oVar;
        this.rl = jVar;
        this.f74539t = jVar2;
        this.nr = i28;
        this.f74537O = new TTh.j(new com.google.firebase.firestore.remote.r(oVar.n()));
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        i28.xMQ(new Runnable() { // from class: uh.QJ
            @Override // java.lang.Runnable
            public final void run() {
                r.O(this.f74468n, taskCompletionSource, context, aCVar, c2);
            }
        });
        jVar.t(new InterfaceC2419z() { // from class: uh.l3D
            @Override // wqP.InterfaceC2419z
            public final void n(Object obj) {
                r.n(this.f74517n, atomicBoolean, taskCompletionSource, i28, (VtZ.aC) obj);
            }
        });
        jVar2.t(new InterfaceC2419z() { // from class: uh.c
            @Override // wqP.InterfaceC2419z
            public final void n(Object obj) {
                r.rl((String) obj);
            }
        });
    }

    public static /* synthetic */ void O(r rVar, TaskCompletionSource taskCompletionSource, Context context, aC aCVar, Pe.C c2) {
        rVar.getClass();
        try {
            rVar.Uo(context, (VtZ.aC) Tasks.await(taskCompletionSource.getTask()), aCVar, c2);
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    private void Uo(Context context, VtZ.aC aCVar, aC aCVar2, Pe.C c2) {
        wqP.QJ.n("FirestoreClient", "Initializing. user=%s", aCVar.n());
        aCVar2.o(new aC.j(context, this.nr, this.f74538n, aCVar, 100, this.rl, this.f74539t, c2));
        this.J2 = aCVar2.HI();
        this.qie = aCVar2.qie();
        this.Uo = aCVar2.ty();
        this.KN = aCVar2.Ik();
        this.xMQ = aCVar2.r();
        this.mUb = aCVar2.gh();
        C2144o c2144oAz = aCVar2.az();
        tmw tmwVar = this.qie;
        if (tmwVar != null) {
            tmwVar.start();
        }
        if (c2144oAz != null) {
            C2144o.j jVarJ2 = c2144oAz.J2();
            this.gh = jVarJ2;
            jVarJ2.start();
        }
    }

    private void gh() {
        if (!KN()) {
        } else {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    public static /* synthetic */ void n(final r rVar, AtomicBoolean atomicBoolean, TaskCompletionSource taskCompletionSource, wqP.I28 i28, final VtZ.aC aCVar) {
        rVar.getClass();
        if (atomicBoolean.compareAndSet(false, true)) {
            wqP.n.t(!taskCompletionSource.getTask().isComplete(), "Already fulfilled first user task", new Object[0]);
            taskCompletionSource.setResult(aCVar);
        } else {
            i28.xMQ(new Runnable() { // from class: uh.UGc
                @Override // java.lang.Runnable
                public final void run() {
                    r.J2(this.f74471n, aCVar);
                }
            });
        }
    }

    public lej xMQ(Ln ln2, Xo.n nVar, com.google.firebase.firestore.Dsr dsr) {
        gh();
        final lej lejVar = new lej(ln2, nVar, dsr);
        this.nr.xMQ(new Runnable() { // from class: uh.Q
            @Override // java.lang.Runnable
            public final void run() {
                this.f74465n.mUb.nr(lejVar);
            }
        });
        return lejVar;
    }
}
