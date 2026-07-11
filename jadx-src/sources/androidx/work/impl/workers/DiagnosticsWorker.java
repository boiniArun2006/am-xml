package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RestrictTo
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f43079n = Logger.J2("DiagnosticsWrkr");

    private static String n(WorkSpec workSpec, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", workSpec.f42950n, workSpec.f42952t, num, workSpec.rl.name(), str, str2);
    }

    private static String t(WorkNameDao workNameDao, WorkTagDao workTagDao, SystemIdInfoDao systemIdInfoDao, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WorkSpec workSpec = (WorkSpec) it.next();
            SystemIdInfo systemIdInfoN = systemIdInfoDao.n(workSpec.f42950n);
            sb.append(n(workSpec, TextUtils.join(",", workNameDao.rl(workSpec.f42950n)), systemIdInfoN != null ? Integer.valueOf(systemIdInfoN.rl) : null, TextUtils.join(",", workTagDao.n(workSpec.f42950n))));
        }
        return sb.toString();
    }

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() {
        WorkDatabase workDatabaseHI = WorkManagerImpl.gh(getApplicationContext()).HI();
        WorkSpecDao workSpecDaoGR = workDatabaseHI.GR();
        WorkNameDao workNameDaoA = workDatabaseHI.a();
        WorkTagDao workTagDaoNxk = workDatabaseHI.Nxk();
        SystemIdInfoDao systemIdInfoDaoD = workDatabaseHI.D();
        List listNr = workSpecDaoGR.nr(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listZ = workSpecDaoGR.Z();
        List listTy = workSpecDaoGR.ty(200);
        if (listNr != null && !listNr.isEmpty()) {
            Logger loggerT = Logger.t();
            String str = f43079n;
            loggerT.nr(str, "Recently completed work:\n\n", new Throwable[0]);
            Logger.t().nr(str, t(workNameDaoA, workTagDaoNxk, systemIdInfoDaoD, listNr), new Throwable[0]);
        }
        if (listZ != null && !listZ.isEmpty()) {
            Logger loggerT2 = Logger.t();
            String str2 = f43079n;
            loggerT2.nr(str2, "Running work:\n\n", new Throwable[0]);
            Logger.t().nr(str2, t(workNameDaoA, workTagDaoNxk, systemIdInfoDaoD, listZ), new Throwable[0]);
        }
        if (listTy != null && !listTy.isEmpty()) {
            Logger loggerT3 = Logger.t();
            String str3 = f43079n;
            loggerT3.nr(str3, "Enqueued work:\n\n", new Throwable[0]);
            Logger.t().nr(str3, t(workNameDaoA, workTagDaoNxk, systemIdInfoDaoD, listTy), new Throwable[0]);
        }
        return ListenableWorker.Result.t();
    }
}
