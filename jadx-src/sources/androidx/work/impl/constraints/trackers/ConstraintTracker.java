package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public abstract class ConstraintTracker<T> {
    private static final String J2 = Logger.J2("ConstraintTracker");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Object f42896O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final TaskExecutor f42897n;
    protected final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f42898t = new Object();
    private final Set nr = new LinkedHashSet();

    public abstract void J2();

    public abstract void O();

    public abstract Object rl();

    public void n(ConstraintListener constraintListener) {
        synchronized (this.f42898t) {
            try {
                if (this.nr.add(constraintListener)) {
                    if (this.nr.size() == 1) {
                        this.f42896O = rl();
                        Logger.t().n(J2, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f42896O), new Throwable[0]);
                        O();
                    }
                    constraintListener.n(this.f42896O);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void nr(Object obj) {
        synchronized (this.f42898t) {
            try {
                Object obj2 = this.f42896O;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f42896O = obj;
                    final ArrayList arrayList = new ArrayList(this.nr);
                    this.f42897n.n().execute(new Runnable() { // from class: androidx.work.impl.constraints.trackers.ConstraintTracker.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((ConstraintListener) it.next()).n(ConstraintTracker.this.f42896O);
                            }
                        }
                    });
                }
            } finally {
            }
        }
    }

    public void t(ConstraintListener constraintListener) {
        synchronized (this.f42898t) {
            try {
                if (this.nr.remove(constraintListener) && this.nr.isEmpty()) {
                    J2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    ConstraintTracker(Context context, TaskExecutor taskExecutor) {
        this.rl = context.getApplicationContext();
        this.f42897n = taskExecutor;
    }
}
