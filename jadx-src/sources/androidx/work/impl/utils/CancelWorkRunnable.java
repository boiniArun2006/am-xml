package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Scheduler;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public abstract class CancelWorkRunnable implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final OperationImpl f42969n = new OperationImpl();

    /* JADX INFO: renamed from: androidx.work.impl.utils.CancelWorkRunnable$4, reason: invalid class name */
    class AnonymousClass4 extends CancelWorkRunnable {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ WorkManagerImpl f42976t;

        @Override // androidx.work.impl.utils.CancelWorkRunnable
        void KN() {
            WorkDatabase workDatabaseHI = this.f42976t.HI();
            workDatabaseHI.xMQ();
            try {
                Iterator it = workDatabaseHI.GR().XQ().iterator();
                while (it.hasNext()) {
                    n(this.f42976t, (String) it.next());
                }
                new PreferenceUtils(this.f42976t.HI()).nr(System.currentTimeMillis());
                workDatabaseHI.P5();
                workDatabaseHI.r();
            } catch (Throwable th) {
                workDatabaseHI.r();
                throw th;
            }
        }
    }

    abstract void KN();

    public static CancelWorkRunnable nr(final String str, final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.2
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            void KN() {
                WorkDatabase workDatabaseHI = workManagerImpl.HI();
                workDatabaseHI.xMQ();
                try {
                    Iterator it = workDatabaseHI.GR().gh(str).iterator();
                    while (it.hasNext()) {
                        n(workManagerImpl, (String) it.next());
                    }
                    workDatabaseHI.P5();
                    workDatabaseHI.r();
                    Uo(workManagerImpl);
                } catch (Throwable th) {
                    workDatabaseHI.r();
                    throw th;
                }
            }
        };
    }

    public static CancelWorkRunnable rl(final UUID uuid, final WorkManagerImpl workManagerImpl) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.1
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            void KN() {
                WorkDatabase workDatabaseHI = workManagerImpl.HI();
                workDatabaseHI.xMQ();
                try {
                    n(workManagerImpl, uuid.toString());
                    workDatabaseHI.P5();
                    workDatabaseHI.r();
                    Uo(workManagerImpl);
                } catch (Throwable th) {
                    workDatabaseHI.r();
                    throw th;
                }
            }
        };
    }

    public static CancelWorkRunnable t(final String str, final WorkManagerImpl workManagerImpl, final boolean z2) {
        return new CancelWorkRunnable() { // from class: androidx.work.impl.utils.CancelWorkRunnable.3
            @Override // androidx.work.impl.utils.CancelWorkRunnable
            void KN() {
                WorkDatabase workDatabaseHI = workManagerImpl.HI();
                workDatabaseHI.xMQ();
                try {
                    Iterator it = workDatabaseHI.GR().Uo(str).iterator();
                    while (it.hasNext()) {
                        n(workManagerImpl, (String) it.next());
                    }
                    workDatabaseHI.P5();
                    workDatabaseHI.r();
                    if (z2) {
                        Uo(workManagerImpl);
                    }
                } catch (Throwable th) {
                    workDatabaseHI.r();
                    throw th;
                }
            }
        };
    }

    public Operation O() {
        return this.f42969n;
    }

    private void J2(WorkDatabase workDatabase, String str) {
        WorkSpecDao workSpecDaoGR = workDatabase.GR();
        DependencyDao dependencyDaoEF = workDatabase.eF();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            WorkInfo.State stateXMQ = workSpecDaoGR.xMQ(str2);
            if (stateXMQ != WorkInfo.State.SUCCEEDED && stateXMQ != WorkInfo.State.FAILED) {
                workSpecDaoGR.rl(WorkInfo.State.CANCELLED, str2);
            }
            linkedList.addAll(dependencyDaoEF.rl(str2));
        }
    }

    void Uo(WorkManagerImpl workManagerImpl) {
        Schedulers.rl(workManagerImpl.xMQ(), workManagerImpl.HI(), workManagerImpl.ty());
    }

    void n(WorkManagerImpl workManagerImpl, String str) {
        J2(workManagerImpl.HI(), str);
        workManagerImpl.az().qie(str);
        Iterator it = workManagerImpl.ty().iterator();
        while (it.hasNext()) {
            ((Scheduler) it.next()).n(str);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            KN();
            this.f42969n.n(Operation.f42739n);
        } catch (Throwable th) {
            this.f42969n.n(new Operation.State.FAILURE(th));
        }
    }
}
