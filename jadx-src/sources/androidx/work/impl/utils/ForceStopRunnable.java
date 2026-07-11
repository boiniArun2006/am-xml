package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import androidx.work.Configuration;
import androidx.work.InitializationExceptionHandler;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabasePathHelper;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class ForceStopRunnable implements Runnable {
    private static final String J2 = Logger.J2("ForceStopRunnable");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f42980r = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f42981O = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f42982n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final WorkManagerImpl f42983t;

    @RestrictTo
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f42984n = Logger.J2("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            Logger.t().Uo(f42984n, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.Uo(context);
        }
    }

    public boolean O() {
        try {
            PendingIntent pendingIntentNr = nr(this.f42982n, BuildCompat.t() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (pendingIntentNr != null) {
                    pendingIntentNr.cancel();
                }
                List historicalProcessExitReasons = ((ActivityManager) this.f42982n.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i2 = 0; i2 < historicalProcessExitReasons.size(); i2++) {
                        if (n.n(historicalProcessExitReasons.get(i2)).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentNr == null) {
                Uo(this.f42982n);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e2) {
            e = e2;
            Logger.t().KN(J2, "Ignoring exception", e);
            return true;
        } catch (SecurityException e3) {
            e = e3;
            Logger.t().KN(J2, "Ignoring exception", e);
            return true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i2;
        try {
            if (J2()) {
                while (true) {
                    WorkDatabasePathHelper.O(this.f42982n);
                    Logger.t().n(J2, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        rl();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e2) {
                        i2 = this.f42981O + 1;
                        this.f42981O = i2;
                        if (i2 >= 3) {
                            Logger loggerT = Logger.t();
                            String str = J2;
                            loggerT.rl(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                            InitializationExceptionHandler initializationExceptionHandlerNr = this.f42983t.xMQ().nr();
                            if (initializationExceptionHandlerNr == null) {
                                throw illegalStateException;
                            }
                            Logger.t().n(str, "Routing exception to the specified exception handler", illegalStateException);
                            initializationExceptionHandlerNr.handleException(illegalStateException);
                        } else {
                            Logger.t().n(J2, String.format("Retrying after %s", Long.valueOf(((long) i2) * 300)), e2);
                            xMQ(((long) this.f42981O) * 300);
                        }
                    }
                    Logger.t().n(J2, String.format("Retrying after %s", Long.valueOf(((long) i2) * 300)), e2);
                    xMQ(((long) this.f42981O) * 300);
                }
            }
        } finally {
            this.f42983t.r();
        }
    }

    static void Uo(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentNr = nr(context, BuildCompat.t() ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f42980r;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentNr);
        }
    }

    static Intent t(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public boolean J2() {
        Configuration configurationXMQ = this.f42983t.xMQ();
        if (TextUtils.isEmpty(configurationXMQ.t())) {
            Logger.t().n(J2, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zRl = ProcessUtils.rl(this.f42982n, configurationXMQ);
        Logger.t().n(J2, String.format("Is default app process = %s", Boolean.valueOf(zRl)), new Throwable[0]);
        return zRl;
    }

    boolean KN() {
        return this.f42983t.qie().rl();
    }

    public boolean n() {
        boolean zXMQ = SystemJobScheduler.xMQ(this.f42982n, this.f42983t);
        WorkDatabase workDatabaseHI = this.f42983t.HI();
        WorkSpecDao workSpecDaoGR = workDatabaseHI.GR();
        WorkProgressDao workProgressDaoI = workDatabaseHI.I();
        workDatabaseHI.xMQ();
        try {
            List<WorkSpec> listZ = workSpecDaoGR.Z();
            boolean z2 = (listZ == null || listZ.isEmpty()) ? false : true;
            if (z2) {
                for (WorkSpec workSpec : listZ) {
                    workSpecDaoGR.rl(WorkInfo.State.ENQUEUED, workSpec.f42950n);
                    workSpecDaoGR.ck(workSpec.f42950n, -1L);
                }
            }
            workProgressDaoI.rl();
            workDatabaseHI.P5();
            workDatabaseHI.r();
            return z2 || zXMQ;
        } catch (Throwable th) {
            workDatabaseHI.r();
            throw th;
        }
    }

    public ForceStopRunnable(Context context, WorkManagerImpl workManagerImpl) {
        this.f42982n = context.getApplicationContext();
        this.f42983t = workManagerImpl;
    }

    private static PendingIntent nr(Context context, int i2) {
        return PendingIntent.getBroadcast(context, -1, t(context), i2);
    }

    public void rl() {
        boolean zN = n();
        if (KN()) {
            Logger.t().n(J2, "Rescheduling Workers.", new Throwable[0]);
            this.f42983t.o();
            this.f42983t.qie().O(false);
        } else if (O()) {
            Logger.t().n(J2, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f42983t.o();
        } else if (zN) {
            Logger.t().n(J2, "Found unfinished work, scheduling it.", new Throwable[0]);
            Schedulers.rl(this.f42983t.xMQ(), this.f42983t.HI(), this.f42983t.ty());
        }
    }

    public void xMQ(long j2) {
        try {
            Thread.sleep(j2);
        } catch (InterruptedException unused) {
        }
    }
}
