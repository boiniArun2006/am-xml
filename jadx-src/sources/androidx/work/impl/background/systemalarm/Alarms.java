package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.utils.IdGenerator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public class Alarms {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42839n = Logger.J2("Alarms");

    public static void nr(Context context, String str, int i2, long j2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i2, CommandHandler.rl(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j2, service);
        }
    }

    public static void rl(Context context, String str, int i2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i2, CommandHandler.rl(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        Logger.t().n(f42839n, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i2)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void n(Context context, WorkManagerImpl workManagerImpl, String str) {
        SystemIdInfoDao systemIdInfoDaoD = workManagerImpl.HI().D();
        SystemIdInfo systemIdInfoN = systemIdInfoDaoD.n(str);
        if (systemIdInfoN != null) {
            rl(context, str, systemIdInfoN.rl);
            Logger.t().n(f42839n, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            systemIdInfoDaoD.nr(str);
        }
    }

    public static void t(Context context, WorkManagerImpl workManagerImpl, String str, long j2) {
        WorkDatabase workDatabaseHI = workManagerImpl.HI();
        SystemIdInfoDao systemIdInfoDaoD = workDatabaseHI.D();
        SystemIdInfo systemIdInfoN = systemIdInfoDaoD.n(str);
        if (systemIdInfoN != null) {
            rl(context, str, systemIdInfoN.rl);
            nr(context, str, systemIdInfoN.rl, j2);
        } else {
            int iRl = new IdGenerator(workDatabaseHI).rl();
            systemIdInfoDaoD.t(new SystemIdInfo(str, iRl));
            nr(context, str, iRl, j2);
        }
    }
}
