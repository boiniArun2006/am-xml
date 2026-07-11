package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public class CommandHandler implements ExecutionListener {
    public static final String J2 = Logger.J2("CommandHandler");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f42841n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Map f42842t = new HashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Object f42840O = new Object();

    public static boolean az(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public static Intent J2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent n(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent nr(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent rl(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent t(Context context, String str, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z2);
        return intent;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void O(String str, boolean z2) {
        synchronized (this.f42840O) {
            try {
                ExecutionListener executionListener = (ExecutionListener) this.f42842t.remove(str);
                if (executionListener != null) {
                    executionListener.O(str, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean ty() {
        boolean z2;
        synchronized (this.f42840O) {
            z2 = !this.f42842t.isEmpty();
        }
        return z2;
    }

    public CommandHandler(Context context) {
        this.f42841n = context;
    }

    private void KN(Intent intent, int i2, SystemAlarmDispatcher systemAlarmDispatcher) {
        Bundle extras = intent.getExtras();
        synchronized (this.f42840O) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                Logger loggerT = Logger.t();
                String str = J2;
                loggerT.n(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (!this.f42842t.containsKey(string)) {
                    DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.f42841n, i2, string, systemAlarmDispatcher);
                    this.f42842t.put(string, delayMetCommandHandler);
                    delayMetCommandHandler.nr();
                } else {
                    Logger.t().n(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void Uo(Intent intent, int i2, SystemAlarmDispatcher systemAlarmDispatcher) {
        Logger.t().n(J2, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new ConstraintsCommandHandler(this.f42841n, i2, systemAlarmDispatcher).n();
    }

    private void gh(Intent intent, int i2, SystemAlarmDispatcher systemAlarmDispatcher) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        Logger loggerT = Logger.t();
        String str = J2;
        loggerT.n(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseHI = systemAlarmDispatcher.Uo().HI();
        workDatabaseHI.xMQ();
        try {
            WorkSpec workSpecMUb = workDatabaseHI.GR().mUb(string);
            if (workSpecMUb == null) {
                Logger.t().KN(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (workSpecMUb.rl.n()) {
                Logger.t().KN(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jN = workSpecMUb.n();
            if (!workSpecMUb.rl()) {
                Logger.t().n(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jN)), new Throwable[0]);
                Alarms.t(this.f42841n, systemAlarmDispatcher.Uo(), string, jN);
            } else {
                Logger.t().n(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jN)), new Throwable[0]);
                Alarms.t(this.f42841n, systemAlarmDispatcher.Uo(), string, jN);
                systemAlarmDispatcher.gh(new SystemAlarmDispatcher.AddRunnable(systemAlarmDispatcher, n(this.f42841n), i2));
            }
            workDatabaseHI.P5();
        } finally {
            workDatabaseHI.r();
        }
    }

    private void mUb(Intent intent, int i2, SystemAlarmDispatcher systemAlarmDispatcher) {
        Logger.t().n(J2, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i2)), new Throwable[0]);
        systemAlarmDispatcher.Uo().o();
    }

    private void qie(Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        Logger.t().n(J2, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        systemAlarmDispatcher.Uo().aYN(string);
        Alarms.n(this.f42841n, systemAlarmDispatcher.Uo(), string);
        systemAlarmDispatcher.O(string, false);
    }

    private void xMQ(Intent intent, int i2) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z2 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        Logger.t().n(J2, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i2)), new Throwable[0]);
        O(string, z2);
    }

    void HI(Intent intent, int i2, SystemAlarmDispatcher systemAlarmDispatcher) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            Uo(intent, i2, systemAlarmDispatcher);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            mUb(intent, i2, systemAlarmDispatcher);
            return;
        }
        if (!az(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            Logger.t().rl(J2, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            gh(intent, i2, systemAlarmDispatcher);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            KN(intent, i2, systemAlarmDispatcher);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            qie(intent, systemAlarmDispatcher);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            xMQ(intent, i2);
        } else {
            Logger.t().KN(J2, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
