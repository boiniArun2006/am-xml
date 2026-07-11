package VtZ;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApiNotAvailableException;
import oSp.j;
import wqP.InterfaceC2419z;
import wqP.QJ;
import wqP.qz;
import yJ.InterfaceC2435j;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private InterfaceC2419z f11357n;
    private final InterfaceC2435j nr = new InterfaceC2435j() { // from class: VtZ.n
        @Override // yJ.InterfaceC2435j
        public final void n(Dh.Ml ml) {
            this.f11362n.Uo(ml);
        }
    };
    private InterfaceC2436n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f11358t;

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void Uo(Dh.Ml ml) {
        try {
            if (ml.n() != null) {
                QJ.nr("FirebaseAppCheckTokenProvider", "Error getting App Check token; using placeholder token instead. Error: " + ml.n(), new Object[0]);
            }
            InterfaceC2419z interfaceC2419z = this.f11357n;
            if (interfaceC2419z != null) {
                interfaceC2419z.n(ml.rl());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static /* synthetic */ void nr(I28 i28, oSp.n nVar) {
        synchronized (i28) {
            try {
                InterfaceC2436n interfaceC2436n = (InterfaceC2436n) nVar.get();
                i28.rl = interfaceC2436n;
                if (interfaceC2436n != null) {
                    interfaceC2436n.rl(i28.nr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // VtZ.j
    public synchronized Task n() {
        InterfaceC2436n interfaceC2436n = this.rl;
        if (interfaceC2436n == null) {
            return Tasks.forException(new FirebaseApiNotAvailableException("AppCheck is not available"));
        }
        Task taskN = interfaceC2436n.n(this.f11358t);
        this.f11358t = false;
        return taskN.continueWithTask(qz.rl, new Continuation() { // from class: VtZ.Ml
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return I28.J2(task);
            }
        });
    }

    @Override // VtZ.j
    public synchronized void rl() {
        this.f11358t = true;
    }

    @Override // VtZ.j
    public synchronized void t(InterfaceC2419z interfaceC2419z) {
        this.f11357n = interfaceC2419z;
    }

    public I28(oSp.j jVar) {
        jVar.n(new j.InterfaceC1084j() { // from class: VtZ.w6
            @Override // oSp.j.InterfaceC1084j
            public final void n(oSp.n nVar) {
                I28.nr(this.f11363n, nVar);
            }
        });
    }

    public static /* synthetic */ Task J2(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(((Dh.Ml) task.getResult()).rl());
        }
        return Tasks.forException(task.getException());
    }
}
