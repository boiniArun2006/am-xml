package androidx.work.impl.constraints;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class WorkConstraintsTracker implements ConstraintController.OnConstraintUpdatedCallback {
    private static final String nr = Logger.J2("WorkConstraintsTracker");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WorkConstraintsCallback f42889n;
    private final ConstraintController[] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f42890t;

    public void O() {
        synchronized (this.f42890t) {
            try {
                for (ConstraintController constraintController : this.rl) {
                    constraintController.J2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void n(List list) {
        synchronized (this.f42890t) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (t(str)) {
                        Logger.t().n(nr, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                WorkConstraintsCallback workConstraintsCallback = this.f42889n;
                if (workConstraintsCallback != null) {
                    workConstraintsCallback.J2(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void nr(Iterable iterable) {
        synchronized (this.f42890t) {
            try {
                for (ConstraintController constraintController : this.rl) {
                    constraintController.Uo(null);
                }
                for (ConstraintController constraintController2 : this.rl) {
                    constraintController2.O(iterable);
                }
                for (ConstraintController constraintController3 : this.rl) {
                    constraintController3.Uo(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController.OnConstraintUpdatedCallback
    public void rl(List list) {
        synchronized (this.f42890t) {
            try {
                WorkConstraintsCallback workConstraintsCallback = this.f42889n;
                if (workConstraintsCallback != null) {
                    workConstraintsCallback.rl(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean t(String str) {
        synchronized (this.f42890t) {
            try {
                for (ConstraintController constraintController : this.rl) {
                    if (constraintController.nr(str)) {
                        Logger.t().n(nr, String.format("Work %s constrained by %s", str, constraintController.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public WorkConstraintsTracker(Context context, TaskExecutor taskExecutor, WorkConstraintsCallback workConstraintsCallback) {
        Context applicationContext = context.getApplicationContext();
        this.f42889n = workConstraintsCallback;
        this.rl = new ConstraintController[]{new BatteryChargingController(applicationContext, taskExecutor), new BatteryNotLowController(applicationContext, taskExecutor), new StorageNotLowController(applicationContext, taskExecutor), new NetworkConnectedController(applicationContext, taskExecutor), new NetworkUnmeteredController(applicationContext, taskExecutor), new NetworkNotRoamingController(applicationContext, taskExecutor), new NetworkMeteredController(applicationContext, taskExecutor)};
        this.f42890t = new Object();
    }
}
