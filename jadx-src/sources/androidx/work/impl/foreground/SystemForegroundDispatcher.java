package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class SystemForegroundDispatcher implements WorkConstraintsCallback, ExecutionListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f42907e = Logger.J2("SystemFgDispatcher");
    private Callback E2;
    final Object J2 = new Object();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TaskExecutor f42908O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final Set f42909S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final Map f42910Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final WorkConstraintsTracker f42911g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f42912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final Map f42913o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    String f42914r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private WorkManagerImpl f42915t;

    interface Callback {
        void n(int i2, Notification notification);

        void nr(int i2);

        void stop();

        void t(int i2, int i3, Notification notification);
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void J2(List list) {
    }

    void gh() {
        this.E2 = null;
        synchronized (this.J2) {
            this.f42911g.O();
        }
        this.f42915t.az().xMQ(this);
    }

    private void KN(Intent intent) {
        int iN = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        Logger.t().n(f42907e, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.E2 == null) {
            return;
        }
        this.f42913o.put(stringExtra, new ForegroundInfo(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f42914r)) {
            this.f42914r = stringExtra;
            this.E2.t(intExtra, intExtra2, notification);
            return;
        }
        this.E2.n(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f42913o.entrySet().iterator();
        while (it.hasNext()) {
            iN |= ((ForegroundInfo) ((Map.Entry) it.next()).getValue()).n();
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) this.f42913o.get(this.f42914r);
        if (foregroundInfo != null) {
            this.E2.t(foregroundInfo.t(), iN, foregroundInfo.rl());
        }
    }

    public static Intent n(Context context, String str, ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.t());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.n());
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.rl());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent nr(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    public static Intent t(Context context, String str, ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.t());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.n());
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.rl());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void O(String str, boolean z2) {
        Map.Entry entry;
        synchronized (this.J2) {
            try {
                WorkSpec workSpec = (WorkSpec) this.f42910Z.remove(str);
                if (workSpec != null ? this.f42909S.remove(workSpec) : false) {
                    this.f42911g.nr(this.f42909S);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) this.f42913o.remove(str);
        if (str.equals(this.f42914r) && this.f42913o.size() > 0) {
            Iterator it = this.f42913o.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f42914r = (String) entry.getKey();
            if (this.E2 != null) {
                ForegroundInfo foregroundInfo2 = (ForegroundInfo) entry.getValue();
                this.E2.t(foregroundInfo2.t(), foregroundInfo2.n(), foregroundInfo2.rl());
                this.E2.nr(foregroundInfo2.t());
            }
        }
        Callback callback = this.E2;
        if (foregroundInfo == null || callback == null) {
            return;
        }
        Logger.t().n(f42907e, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(foregroundInfo.t()), str, Integer.valueOf(foregroundInfo.n())), new Throwable[0]);
        callback.nr(foregroundInfo.t());
    }

    void az(Callback callback) {
        if (this.E2 != null) {
            Logger.t().rl(f42907e, "A callback already exists.", new Throwable[0]);
        } else {
            this.E2 = callback;
        }
    }

    SystemForegroundDispatcher(Context context) {
        this.f42912n = context;
        WorkManagerImpl workManagerImplGh = WorkManagerImpl.gh(context);
        this.f42915t = workManagerImplGh;
        TaskExecutor taskExecutorCk = workManagerImplGh.ck();
        this.f42908O = taskExecutorCk;
        this.f42914r = null;
        this.f42913o = new LinkedHashMap();
        this.f42909S = new HashSet();
        this.f42910Z = new HashMap();
        this.f42911g = new WorkConstraintsTracker(this.f42912n, taskExecutorCk, this);
        this.f42915t.az().t(this);
    }

    private void Uo(Intent intent) {
        Logger.t().nr(f42907e, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f42915t.J2(UUID.fromString(stringExtra));
        }
    }

    private void xMQ(Intent intent) {
        Logger.t().nr(f42907e, String.format("Started foreground service %s", intent), new Throwable[0]);
        final String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        final WorkDatabase workDatabaseHI = this.f42915t.HI();
        this.f42908O.rl(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundDispatcher.1
            @Override // java.lang.Runnable
            public void run() {
                WorkSpec workSpecMUb = workDatabaseHI.GR().mUb(stringExtra);
                if (workSpecMUb == null || !workSpecMUb.rl()) {
                    return;
                }
                synchronized (SystemForegroundDispatcher.this.J2) {
                    SystemForegroundDispatcher.this.f42910Z.put(stringExtra, workSpecMUb);
                    SystemForegroundDispatcher.this.f42909S.add(workSpecMUb);
                    SystemForegroundDispatcher systemForegroundDispatcher = SystemForegroundDispatcher.this;
                    systemForegroundDispatcher.f42911g.nr(systemForegroundDispatcher.f42909S);
                }
            }
        });
    }

    void mUb(Intent intent) {
        Logger.t().nr(f42907e, "Stopping foreground service", new Throwable[0]);
        Callback callback = this.E2;
        if (callback != null) {
            callback.stop();
        }
    }

    void qie(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            xMQ(intent);
            KN(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            KN(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            Uo(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            mUb(intent);
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void rl(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Logger.t().n(f42907e, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                this.f42915t.WPU(str);
            }
        }
    }
}
