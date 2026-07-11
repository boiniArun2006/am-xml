package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.IdGenerator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
@RestrictTo
public class SystemJobScheduler implements Scheduler {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f42880r = Logger.J2("SystemJobScheduler");
    private final SystemJobInfoConverter J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final WorkManagerImpl f42881O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f42882n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JobScheduler f42883t;

    public SystemJobScheduler(Context context, WorkManagerImpl workManagerImpl) {
        this(context, workManagerImpl, (JobScheduler) context.getSystemService("jobscheduler"), new SystemJobInfoConverter(context));
    }

    private static List Uo(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            Logger.t().rl(f42880r, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // androidx.work.impl.Scheduler
    public boolean nr() {
        return true;
    }

    private static String KN(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static void rl(Context context) {
        List listUo;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listUo = Uo(context, jobScheduler)) == null || listUo.isEmpty()) {
            return;
        }
        Iterator it = listUo.iterator();
        while (it.hasNext()) {
            O(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static boolean xMQ(Context context, WorkManagerImpl workManagerImpl) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listUo = Uo(context, jobScheduler);
        List listRl = workManagerImpl.HI().D().rl();
        boolean z2 = false;
        HashSet hashSet = new HashSet(listUo != null ? listUo.size() : 0);
        if (listUo != null && !listUo.isEmpty()) {
            for (JobInfo jobInfo : listUo) {
                String strKN = KN(jobInfo);
                if (TextUtils.isEmpty(strKN)) {
                    O(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strKN);
                }
            }
        }
        Iterator it = listRl.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                Logger.t().n(f42880r, "Reconciling jobs", new Throwable[0]);
                z2 = true;
                break;
            }
        }
        if (!z2) {
            return z2;
        }
        WorkDatabase workDatabaseHI = workManagerImpl.HI();
        workDatabaseHI.xMQ();
        try {
            WorkSpecDao workSpecDaoGR = workDatabaseHI.GR();
            Iterator it2 = listRl.iterator();
            while (it2.hasNext()) {
                workSpecDaoGR.ck((String) it2.next(), -1L);
            }
            workDatabaseHI.P5();
            workDatabaseHI.r();
            return z2;
        } catch (Throwable th) {
            workDatabaseHI.r();
            throw th;
        }
    }

    public void mUb(WorkSpec workSpec, int i2) {
        JobInfo jobInfoN = this.J2.n(workSpec, i2);
        Logger loggerT = Logger.t();
        String str = f42880r;
        loggerT.n(str, String.format("Scheduling work ID %s Job ID %s", workSpec.f42950n, Integer.valueOf(i2)), new Throwable[0]);
        try {
            if (this.f42883t.schedule(jobInfoN) == 0) {
                Logger.t().KN(str, String.format("Unable to schedule work ID %s", workSpec.f42950n), new Throwable[0]);
                if (workSpec.Ik && workSpec.f42951r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.Ik = false;
                    Logger.t().n(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.f42950n), new Throwable[0]);
                    mUb(workSpec, i2);
                }
            }
        } catch (IllegalStateException e2) {
            List listUo = Uo(this.f42882n, this.f42883t);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listUo != null ? listUo.size() : 0), Integer.valueOf(this.f42881O.HI().GR().J2().size()), Integer.valueOf(this.f42881O.xMQ().KN()));
            Logger.t().rl(f42880r, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e2);
        } catch (Throwable th) {
            Logger.t().rl(f42880r, String.format("Unable to schedule %s", workSpec), th);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void n(String str) {
        List listJ2 = J2(this.f42882n, this.f42883t, str);
        if (listJ2 == null || listJ2.isEmpty()) {
            return;
        }
        Iterator it = listJ2.iterator();
        while (it.hasNext()) {
            O(this.f42883t, ((Integer) it.next()).intValue());
        }
        this.f42881O.HI().D().nr(str);
    }

    @Override // androidx.work.impl.Scheduler
    public void t(WorkSpec... workSpecArr) {
        WorkDatabase workDatabaseHI = this.f42881O.HI();
        IdGenerator idGenerator = new IdGenerator(workDatabaseHI);
        for (WorkSpec workSpec : workSpecArr) {
            workDatabaseHI.xMQ();
            try {
                WorkSpec workSpecMUb = workDatabaseHI.GR().mUb(workSpec.f42950n);
                if (workSpecMUb == null) {
                    Logger.t().KN(f42880r, "Skipping scheduling " + workSpec.f42950n + " because it's no longer in the DB", new Throwable[0]);
                    workDatabaseHI.P5();
                } else if (workSpecMUb.rl != WorkInfo.State.ENQUEUED) {
                    Logger.t().KN(f42880r, "Skipping scheduling " + workSpec.f42950n + " because it is no longer enqueued", new Throwable[0]);
                    workDatabaseHI.P5();
                } else {
                    SystemIdInfo systemIdInfoN = workDatabaseHI.D().n(workSpec.f42950n);
                    int iNr = systemIdInfoN != null ? systemIdInfoN.rl : idGenerator.nr(this.f42881O.xMQ().xMQ(), this.f42881O.xMQ().Uo());
                    if (systemIdInfoN == null) {
                        this.f42881O.HI().D().t(new SystemIdInfo(workSpec.f42950n, iNr));
                    }
                    mUb(workSpec, iNr);
                    workDatabaseHI.P5();
                }
            } finally {
                workDatabaseHI.r();
            }
        }
    }

    private static List J2(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listUo = Uo(context, jobScheduler);
        if (listUo == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listUo) {
            if (str.equals(KN(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static void O(JobScheduler jobScheduler, int i2) {
        try {
            jobScheduler.cancel(i2);
        } catch (Throwable th) {
            Logger.t().rl(f42880r, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i2)), th);
        }
    }

    public SystemJobScheduler(Context context, WorkManagerImpl workManagerImpl, JobScheduler jobScheduler, SystemJobInfoConverter systemJobInfoConverter) {
        this.f42882n = context;
        this.f42881O = workManagerImpl;
        this.f42883t = jobScheduler;
        this.J2 = systemJobInfoConverter;
    }
}
