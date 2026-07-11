package androidx.work.impl.utils;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class EnqueueRunnable implements Runnable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f42977O = Logger.J2("EnqueueRunnable");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WorkContinuationImpl f42978n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final OperationImpl f42979t = new OperationImpl();

    private static void Uo(WorkSpec workSpec) {
        Constraints constraints = workSpec.mUb;
        String str = workSpec.f42952t;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (constraints.J2() || constraints.xMQ()) {
            Data.Builder builder = new Data.Builder();
            builder.t(workSpec.f42949O).O("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            workSpec.f42952t = ConstraintTrackingWorker.class.getName();
            workSpec.f42949O = builder.n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0135 A[PHI: r0 r8 r11 r12 r13
      0x0135: PHI (r0v1 java.lang.String[]) = 
      (r0v0 java.lang.String[])
      (r0v0 java.lang.String[])
      (r0v0 java.lang.String[])
      (r0v13 java.lang.String[])
      (r0v13 java.lang.String[])
     binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v5 boolean), (r8v6 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v4 boolean), (r11v4 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean t(WorkManagerImpl workManagerImpl, List list, String[] strArr, String str, ExistingWorkPolicy existingWorkPolicy) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabaseHI = workManagerImpl.HI();
        boolean z6 = strArr2 != null && strArr2.length > 0;
        if (z6) {
            z2 = false;
            z3 = false;
            z4 = true;
            for (String str2 : strArr2) {
                WorkSpec workSpecMUb = workDatabaseHI.GR().mUb(str2);
                if (workSpecMUb == null) {
                    Logger.t().rl(f42977O, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                    return false;
                }
                WorkInfo.State state = workSpecMUb.rl;
                z4 &= state == WorkInfo.State.SUCCEEDED;
                if (state == WorkInfo.State.FAILED) {
                    z3 = true;
                } else if (state == WorkInfo.State.CANCELLED) {
                    z2 = true;
                }
            }
        } else {
            z2 = false;
            z3 = false;
            z4 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z6) {
            z5 = false;
        } else {
            List<WorkSpec.IdAndState> listIk = workDatabaseHI.GR().Ik(str);
            if (!listIk.isEmpty()) {
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    DependencyDao dependencyDaoEF = workDatabaseHI.eF();
                    List arrayList = new ArrayList();
                    for (WorkSpec.IdAndState idAndState : listIk) {
                        if (!dependencyDaoEF.nr(idAndState.f42953n)) {
                            WorkInfo.State state2 = idAndState.rl;
                            boolean z7 = (state2 == WorkInfo.State.SUCCEEDED) & z4;
                            if (state2 == WorkInfo.State.FAILED) {
                                z3 = true;
                            } else if (state2 == WorkInfo.State.CANCELLED) {
                                z2 = true;
                            }
                            arrayList.add(idAndState.f42953n);
                            z4 = z7;
                        }
                    }
                    if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z2 || z3)) {
                        WorkSpecDao workSpecDaoGR = workDatabaseHI.GR();
                        Iterator it = workSpecDaoGR.Ik(str).iterator();
                        while (it.hasNext()) {
                            workSpecDaoGR.n(((WorkSpec.IdAndState) it.next()).f42953n);
                        }
                        arrayList = Collections.EMPTY_LIST;
                        z2 = false;
                        z3 = false;
                    }
                    strArr2 = (String[]) arrayList.toArray(strArr2);
                    z6 = strArr2.length > 0;
                    z5 = false;
                } else {
                    if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                        Iterator it2 = listIk.iterator();
                        while (it2.hasNext()) {
                            WorkInfo.State state3 = ((WorkSpec.IdAndState) it2.next()).rl;
                            if (state3 == WorkInfo.State.ENQUEUED || state3 == WorkInfo.State.RUNNING) {
                                return false;
                            }
                        }
                    }
                    CancelWorkRunnable.t(str, workManagerImpl, false).run();
                    WorkSpecDao workSpecDaoGR2 = workDatabaseHI.GR();
                    Iterator it3 = listIk.iterator();
                    while (it3.hasNext()) {
                        workSpecDaoGR2.n(((WorkSpec.IdAndState) it3.next()).f42953n);
                    }
                    z5 = true;
                }
            }
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            WorkRequest workRequest = (WorkRequest) it4.next();
            WorkSpec workSpecT = workRequest.t();
            if (!z6 || z4) {
                if (workSpecT.nr()) {
                    workSpecT.ty = 0L;
                } else {
                    workSpecT.ty = jCurrentTimeMillis;
                }
            } else if (z3) {
                workSpecT.rl = WorkInfo.State.FAILED;
            } else if (z2) {
                workSpecT.rl = WorkInfo.State.CANCELLED;
            } else {
                workSpecT.rl = WorkInfo.State.BLOCKED;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                Uo(workSpecT);
            }
            if (workSpecT.rl == WorkInfo.State.ENQUEUED) {
                z5 = true;
            }
            workDatabaseHI.GR().O(workSpecT);
            if (z6) {
                int length = strArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    workDatabaseHI.eF().n(new Dependency(workRequest.n(), strArr2[i2]));
                    i2++;
                    strArr2 = strArr2;
                    it4 = it4;
                }
            }
            String[] strArr3 = strArr2;
            Iterator it5 = it4;
            Iterator it6 = workRequest.rl().iterator();
            while (it6.hasNext()) {
                workDatabaseHI.Nxk().rl(new WorkTag((String) it6.next(), workRequest.n()));
            }
            if (!zIsEmpty) {
                workDatabaseHI.a().n(new WorkName(str, workRequest.n()));
            }
            strArr2 = strArr3;
            it4 = it5;
        }
        return z5;
    }

    public void J2() {
        WorkManagerImpl workManagerImplUo = this.f42978n.Uo();
        Schedulers.rl(workManagerImplUo.xMQ(), workManagerImplUo.HI(), workManagerImplUo.ty());
    }

    public boolean n() {
        WorkDatabase workDatabaseHI = this.f42978n.Uo().HI();
        workDatabaseHI.xMQ();
        try {
            boolean zO = O(this.f42978n);
            workDatabaseHI.P5();
            return zO;
        } finally {
            workDatabaseHI.r();
        }
    }

    public Operation nr() {
        return this.f42979t;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f42978n.KN()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f42978n));
            }
            if (n()) {
                PackageManagerHelper.n(this.f42978n.Uo().KN(), RescheduleReceiver.class, true);
                J2();
            }
            this.f42979t.n(Operation.f42739n);
        } catch (Throwable th) {
            this.f42979t.n(new Operation.State.FAILURE(th));
        }
    }

    public EnqueueRunnable(WorkContinuationImpl workContinuationImpl) {
        this.f42978n = workContinuationImpl;
    }

    private static boolean O(WorkContinuationImpl workContinuationImpl) {
        List<WorkContinuationImpl> listO = workContinuationImpl.O();
        boolean z2 = false;
        if (listO != null) {
            boolean zO = false;
            for (WorkContinuationImpl workContinuationImpl2 : listO) {
                if (!workContinuationImpl2.mUb()) {
                    zO |= O(workContinuationImpl2);
                } else {
                    Logger.t().KN(f42977O, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", workContinuationImpl2.t())), new Throwable[0]);
                }
            }
            z2 = zO;
        }
        return rl(workContinuationImpl) | z2;
    }

    private static boolean rl(WorkContinuationImpl workContinuationImpl) {
        boolean zT2 = t(workContinuationImpl.Uo(), workContinuationImpl.J2(), (String[]) WorkContinuationImpl.qie(workContinuationImpl).toArray(new String[0]), workContinuationImpl.nr(), workContinuationImpl.rl());
        workContinuationImpl.gh();
        return zT2;
    }
}
