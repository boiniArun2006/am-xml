package cIr;

import Mj.j;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import yJ.InterfaceC2435j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class aC extends Dh.I28 {
    private Task HI;
    private final l3D J2;
    private final Executor KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final QJ f43589O;
    private final Executor Uo;
    private Dh.j az;
    private final Mj.j gh;
    private final Task mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.google.firebase.Wre f43590n;
    private final List nr;
    private Dh.n qie;
    private final oSp.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f43591t;
    private Dh.w6 ty;
    private final Executor xMQ;

    private void Z(final Dh.w6 w6Var) {
        this.xMQ.execute(new Runnable() { // from class: cIr.Dsr
            @Override // java.lang.Runnable
            public final void run() {
                this.f43575n.f43589O.nr(w6Var);
            }
        });
        o(w6Var);
        this.J2.nr(w6Var);
    }

    private boolean ck() {
        Dh.w6 w6Var = this.ty;
        return w6Var != null && w6Var.n() - this.gh.currentTimeMillis() > 300000;
    }

    public static /* synthetic */ Task mUb(aC aCVar, boolean z2, Task task) {
        if (!z2 && aCVar.ck()) {
            return Tasks.forResult(w6.t(aCVar.ty));
        }
        if (aCVar.az == null) {
            return Tasks.forResult(w6.nr(new FirebaseException("No AppCheckProvider installed.")));
        }
        Task task2 = aCVar.HI;
        if (task2 == null || task2.isComplete() || aCVar.HI.isCanceled()) {
            aCVar.HI = aCVar.az();
        }
        return aCVar.HI.continueWithTask(aCVar.KN, new Continuation() { // from class: cIr.CN3
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return aC.KN(task3);
            }
        });
    }

    public static /* synthetic */ void qie(aC aCVar, TaskCompletionSource taskCompletionSource) {
        Dh.w6 w6VarT = aCVar.f43589O.t();
        if (w6VarT != null) {
            aCVar.o(w6VarT);
        }
        taskCompletionSource.setResult(null);
    }

    private Task r(Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: cIr.Ml
            @Override // java.lang.Runnable
            public final void run() {
                aC.qie(this.f43577n, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public Task HI() {
        Dh.j jVar = this.az;
        return jVar == null ? Tasks.forException(new FirebaseException("No AppCheckProvider installed.")) : jVar.n();
    }

    @Override // Dh.I28
    public void J2(Dh.n nVar) {
        Ik(nVar, this.f43590n.S());
    }

    Task az() {
        return this.az.n().onSuccessTask(this.Uo, new SuccessContinuation() { // from class: cIr.fuX
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return aC.xMQ(this.f43594n, (Dh.w6) obj);
            }
        });
    }

    @Override // yJ.InterfaceC2436n
    public Task n(final boolean z2) {
        return this.mUb.continueWithTask(this.KN, new Continuation() { // from class: cIr.Wre
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return aC.mUb(this.f43585n, z2, task);
            }
        });
    }

    void o(Dh.w6 w6Var) {
        this.ty = w6Var;
    }

    oSp.n ty() {
        return this.rl;
    }

    public aC(com.google.firebase.Wre wre, oSp.n nVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        Preconditions.checkNotNull(wre);
        Preconditions.checkNotNull(nVar);
        this.f43590n = wre;
        this.rl = nVar;
        this.f43591t = new ArrayList();
        this.nr = new ArrayList();
        this.f43589O = new QJ(wre.qie(), wre.Ik());
        this.J2 = new l3D(wre.qie(), this, executor2, scheduledExecutorService);
        this.Uo = executor;
        this.KN = executor2;
        this.xMQ = executor3;
        this.mUb = r(executor3);
        this.gh = new j.C0231j();
    }

    public static /* synthetic */ Task KN(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(w6.t((Dh.w6) task.getResult()));
        }
        return Tasks.forResult(w6.nr(new FirebaseException(task.getException().getMessage(), task.getException())));
    }

    public static /* synthetic */ Task gh(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(w6.t((Dh.w6) task.getResult()));
        }
        return Tasks.forResult(w6.nr(new FirebaseException(task.getException().getMessage(), task.getException())));
    }

    public static /* synthetic */ Task xMQ(aC aCVar, Dh.w6 w6Var) {
        aCVar.Z(w6Var);
        Iterator it = aCVar.nr.iterator();
        if (!it.hasNext()) {
            w6 w6VarT = w6.t(w6Var);
            Iterator it2 = aCVar.f43591t.iterator();
            while (it2.hasNext()) {
                ((InterfaceC2435j) it2.next()).n(w6VarT);
            }
            return Tasks.forResult(w6Var);
        }
        android.support.v4.media.j.n(it.next());
        throw null;
    }

    public void Ik(Dh.n nVar, boolean z2) {
        Preconditions.checkNotNull(nVar);
        this.qie = nVar;
        this.az = nVar.n(this.f43590n);
        this.J2.J2(z2);
    }

    @Override // yJ.InterfaceC2436n
    public void rl(InterfaceC2435j interfaceC2435j) {
        Preconditions.checkNotNull(interfaceC2435j);
        this.f43591t.add(interfaceC2435j);
        this.J2.O(this.f43591t.size() + this.nr.size());
        if (ck()) {
            interfaceC2435j.n(w6.t(this.ty));
        }
    }

    @Override // yJ.InterfaceC2436n
    public Task t() {
        return HI().continueWithTask(this.KN, new Continuation() { // from class: cIr.I28
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return aC.gh(task);
            }
        });
    }
}
