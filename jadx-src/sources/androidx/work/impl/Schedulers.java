package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.PackageManagerHelper;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class Schedulers {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42784n = Logger.J2("Schedulers");

    static Scheduler n(Context context, WorkManagerImpl workManagerImpl) {
        SystemJobScheduler systemJobScheduler = new SystemJobScheduler(context, workManagerImpl);
        PackageManagerHelper.n(context, SystemJobService.class, true);
        Logger.t().n(f42784n, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return systemJobScheduler;
    }

    public static void rl(Configuration configuration, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        WorkSpecDao workSpecDaoGR = workDatabase.GR();
        workDatabase.xMQ();
        try {
            List listR = workSpecDaoGR.r(configuration.KN());
            List listTy = workSpecDaoGR.ty(200);
            if (listR != null && listR.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = listR.iterator();
                while (it.hasNext()) {
                    workSpecDaoGR.ck(((WorkSpec) it.next()).f42950n, jCurrentTimeMillis);
                }
            }
            workDatabase.P5();
            workDatabase.r();
            if (listR != null && listR.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) listR.toArray(new WorkSpec[listR.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Scheduler scheduler = (Scheduler) it2.next();
                    if (scheduler.nr()) {
                        scheduler.t(workSpecArr);
                    }
                }
            }
            if (listTy == null || listTy.size() <= 0) {
                return;
            }
            WorkSpec[] workSpecArr2 = (WorkSpec[]) listTy.toArray(new WorkSpec[listTy.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                Scheduler scheduler2 = (Scheduler) it3.next();
                if (!scheduler2.nr()) {
                    scheduler2.t(workSpecArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.r();
            throw th;
        }
    }
}
