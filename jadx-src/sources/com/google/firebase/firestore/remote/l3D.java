package com.google.firebase.firestore.remote;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.remote.l3D;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import uB.qz;
import wqP.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class l3D {
    private static wqP.s4 KN;
    private final uh.o J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Context f60444O;
    private final JP.j Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Task f60445n;
    private I28.n nr;
    private final wqP.I28 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private io.grpc.n f60446t;

    /* JADX INFO: Access modifiers changed from: private */
    public void qie(final JP.nKK nkk) {
        JP.qz qzVarGh = nkk.gh(true);
        wqP.QJ.n("GrpcCallProvider", "Current gRPC connectivity state: " + qzVarGh, new Object[0]);
        KN();
        if (qzVarGh == JP.qz.CONNECTING) {
            wqP.QJ.n("GrpcCallProvider", "Setting the connectivityAttemptTimer", new Object[0]);
            this.nr = this.rl.KN(I28.Ml.CONNECTIVITY_ATTEMPT_TIMER, 15000L, new Runnable() { // from class: Pe.Wre
                @Override // java.lang.Runnable
                public final void run() {
                    l3D.O(this.f7721n, nkk);
                }
            });
        }
        nkk.qie(qzVarGh, new Runnable() { // from class: Pe.CN3
            @Override // java.lang.Runnable
            public final void run() {
                l3D l3d = this.f7712n;
                l3d.rl.xMQ(new Runnable() { // from class: Pe.Dsr
                    @Override // java.lang.Runnable
                    public final void run() {
                        l3d.qie(nkk);
                    }
                });
            }
        });
    }

    private void KN() {
        if (this.nr != null) {
            wqP.QJ.n("GrpcCallProvider", "Clearing the connectivityAttemptTimer", new Object[0]);
            this.nr.t();
            this.nr = null;
        }
    }

    public static /* synthetic */ JP.nKK Uo(final l3D l3d) {
        final JP.nKK nkkMUb = l3d.mUb(l3d.f60444O, l3d.J2);
        l3d.rl.xMQ(new Runnable() { // from class: Pe.I28
            @Override // java.lang.Runnable
            public final void run() {
                this.f7716n.qie(nkkMUb);
            }
        });
        l3d.f60446t = ((qz.n) ((qz.n) uB.qz.t(nkkMUb).t(l3d.Uo)).nr(l3d.rl.mUb())).rl();
        wqP.QJ.n("GrpcCallProvider", "Channel successfully reset.", new Object[0]);
        return nkkMUb;
    }

    private void az(final JP.nKK nkk) {
        this.rl.xMQ(new Runnable() { // from class: Pe.aC
            @Override // java.lang.Runnable
            public final void run() {
                l3D.n(this.f7729n, nkk);
            }
        });
    }

    private void gh() {
        this.f60445n = Tasks.call(wqP.qz.f75138t, new Callable() { // from class: Pe.Ml
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return l3D.Uo(this.f7718n);
            }
        });
    }

    public Task xMQ(final JP.DAz dAz) {
        return this.f60445n.continueWithTask(this.rl.mUb(), new Continuation() { // from class: Pe.fuX
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return l3D.J2(this.f7731n, dAz, task);
            }
        });
    }

    l3D(wqP.I28 i28, Context context, uh.o oVar, JP.j jVar) {
        this.rl = i28;
        this.f60444O = context;
        this.J2 = oVar;
        this.Uo = jVar;
        gh();
    }

    public static /* synthetic */ Task J2(l3D l3d, JP.DAz dAz, Task task) {
        l3d.getClass();
        return Tasks.forResult(((JP.nKK) task.getResult()).KN(dAz, l3d.f60446t));
    }

    public static /* synthetic */ void O(l3D l3d, JP.nKK nkk) {
        l3d.getClass();
        wqP.QJ.n("GrpcCallProvider", "connectivityAttemptTimer elapsed. Resetting the channel.", new Object[0]);
        l3d.KN();
        l3d.az(nkk);
    }

    private JP.nKK mUb(Context context, uh.o oVar) {
        io.grpc.z zVar;
        try {
            ProviderInstaller.installIfNeeded(context);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IllegalStateException e2) {
            wqP.QJ.nr("GrpcCallProvider", "Failed to update ssl context: %s", e2);
        }
        wqP.s4 s4Var = KN;
        if (s4Var != null) {
            zVar = (io.grpc.z) s4Var.get();
        } else {
            io.grpc.z zVarRl = io.grpc.z.rl(oVar.rl());
            if (!oVar.nr()) {
                zVarRl.nr();
            }
            zVar = zVarRl;
        }
        zVar.t(30L, TimeUnit.SECONDS);
        return VO.j.gh(zVar).xMQ(context).n();
    }

    public static /* synthetic */ void n(l3D l3d, JP.nKK nkk) {
        l3d.getClass();
        nkk.az();
        l3d.gh();
    }
}
