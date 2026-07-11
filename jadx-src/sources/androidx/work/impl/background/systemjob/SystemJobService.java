package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
@RestrictTo
public class SystemJobService extends JobService implements ExecutionListener {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final String f42884O = Logger.J2("SystemJobService");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WorkManagerImpl f42885n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f42886t = new HashMap();

    private static String n(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f42885n == null) {
            Logger.t().n(f42884O, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strN = n(jobParameters);
        if (TextUtils.isEmpty(strN)) {
            Logger.t().rl(f42884O, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f42886t) {
            try {
                if (this.f42886t.containsKey(strN)) {
                    Logger.t().n(f42884O, String.format("Job is already being executed by SystemJobService: %s", strN), new Throwable[0]);
                    return false;
                }
                Logger.t().n(f42884O, String.format("onStartJob for %s", strN), new Throwable[0]);
                this.f42886t.put(strN, jobParameters);
                int i2 = Build.VERSION.SDK_INT;
                WorkerParameters.RuntimeExtras runtimeExtras = new WorkerParameters.RuntimeExtras();
                if (jobParameters.getTriggeredContentUris() != null) {
                    runtimeExtras.rl = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    runtimeExtras.f42767n = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i2 >= 28) {
                    runtimeExtras.f42768t = jobParameters.getNetwork();
                }
                this.f42885n.S(strN, runtimeExtras);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f42885n == null) {
            Logger.t().n(f42884O, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strN = n(jobParameters);
        if (TextUtils.isEmpty(strN)) {
            Logger.t().rl(f42884O, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        Logger.t().n(f42884O, String.format("onStopJob for %s", strN), new Throwable[0]);
        synchronized (this.f42886t) {
            this.f42886t.remove(strN);
        }
        this.f42885n.aYN(strN);
        return !this.f42885n.az().J2(strN);
    }

    @Override // androidx.work.impl.ExecutionListener
    public void O(String str, boolean z2) {
        JobParameters jobParameters;
        Logger.t().n(f42884O, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f42886t) {
            jobParameters = (JobParameters) this.f42886t.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z2);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl workManagerImplGh = WorkManagerImpl.gh(getApplicationContext());
            this.f42885n = workManagerImplGh;
            workManagerImplGh.az().t(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                Logger.t().KN(f42884O, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl = this.f42885n;
        if (workManagerImpl != null) {
            workManagerImpl.az().xMQ(this);
        }
    }
}
