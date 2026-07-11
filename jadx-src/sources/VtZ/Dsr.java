package VtZ;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;
import oSp.j;
import oW.InterfaceC2312j;
import oW.InterfaceC2314n;
import pa.C2333n;
import wqP.InterfaceC2419z;
import wqP.QJ;
import wqP.qz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Dsr extends j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f11354O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2312j f11355n = new InterfaceC2312j() { // from class: VtZ.Wre
        @Override // oW.InterfaceC2312j
        public final void n(C2333n c2333n) {
            this.f11359n.KN();
        }
    };
    private int nr;
    private InterfaceC2314n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private InterfaceC2419z f11356t;

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void KN() {
        this.nr++;
        InterfaceC2419z interfaceC2419z = this.f11356t;
        if (interfaceC2419z != null) {
            interfaceC2419z.n(Uo());
        }
    }

    public static /* synthetic */ void O(Dsr dsr, oSp.n nVar) {
        synchronized (dsr) {
            dsr.rl = (InterfaceC2314n) nVar.get();
            dsr.KN();
            dsr.rl.n(dsr.f11355n);
        }
    }

    private synchronized aC Uo() {
        String uid;
        try {
            InterfaceC2314n interfaceC2314n = this.rl;
            uid = interfaceC2314n == null ? null : interfaceC2314n.getUid();
        } catch (Throwable th) {
            throw th;
        }
        return uid != null ? new aC(uid) : aC.rl;
    }

    public static /* synthetic */ Task nr(Dsr dsr, int i2, Task task) {
        synchronized (dsr) {
            try {
                if (i2 != dsr.nr) {
                    QJ.n("FirebaseAuthCredentialsProvider", "getToken aborted due to token change", new Object[0]);
                    return dsr.n();
                }
                if (task.isSuccessful()) {
                    return Tasks.forResult(((com.google.firebase.auth.Dsr) task.getResult()).t());
                }
                return Tasks.forException(task.getException());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // VtZ.j
    public synchronized Task n() {
        InterfaceC2314n interfaceC2314n = this.rl;
        if (interfaceC2314n == null) {
            return Tasks.forException(new FirebaseApiNotAvailableException("auth is not available"));
        }
        Task taskRl = interfaceC2314n.rl(this.f11354O);
        this.f11354O = false;
        final int i2 = this.nr;
        return taskRl.continueWithTask(qz.rl, new Continuation() { // from class: VtZ.fuX
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return Dsr.nr(this.f11361n, i2, task);
            }
        });
    }

    @Override // VtZ.j
    public synchronized void rl() {
        this.f11354O = true;
    }

    @Override // VtZ.j
    public synchronized void t(InterfaceC2419z interfaceC2419z) {
        this.f11356t = interfaceC2419z;
        interfaceC2419z.n(Uo());
    }

    public Dsr(oSp.j jVar) {
        jVar.n(new j.InterfaceC1084j() { // from class: VtZ.CN3
            @Override // oSp.j.InterfaceC1084j
            public final void n(oSp.n nVar) {
                Dsr.O(this.f11353n, nVar);
            }
        });
    }
}
