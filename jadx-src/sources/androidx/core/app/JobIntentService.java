package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Deprecated
public abstract class JobIntentService extends Service {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    static final Object f36229S = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final HashMap f36230g = new HashMap();
    boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    CommandProcessor f36231O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final ArrayList f36232Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CompatJobEngine f36233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f36234o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f36235r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    WorkEnqueuer f36236t;

    final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        CommandProcessor() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                GenericWorkItem genericWorkItemN = JobIntentService.this.n();
                if (genericWorkItemN == null) {
                    return null;
                }
                JobIntentService.this.O(genericWorkItemN.getIntent());
                genericWorkItemN.rl();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            JobIntentService.this.Uo();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            JobIntentService.this.Uo();
        }
    }

    interface CompatJobEngine {
        IBinder n();

        GenericWorkItem rl();
    }

    final class CompatWorkItem implements GenericWorkItem {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Intent f36239n;
        final int rl;

        CompatWorkItem(Intent intent, int i2) {
            this.f36239n = intent;
            this.rl = i2;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            return this.f36239n;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public void rl() {
            JobIntentService.this.stopSelf(this.rl);
        }
    }

    interface GenericWorkItem {
        Intent getIntent();

        void rl();
    }

    @RequiresApi
    static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final JobIntentService f36241n;
        final Object rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        JobParameters f36242t;

        final class WrapperWorkItem implements GenericWorkItem {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final JobWorkItem f36243n;

            WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.f36243n = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                return this.f36243n.getIntent();
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public void rl() {
                synchronized (JobServiceEngineImpl.this.rl) {
                    try {
                        JobParameters jobParameters = JobServiceEngineImpl.this.f36242t;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f36243n);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f36242t = jobParameters;
            this.f36241n.t(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean zRl = this.f36241n.rl();
            synchronized (this.rl) {
                this.f36242t = null;
            }
            return zRl;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public GenericWorkItem rl() {
            synchronized (this.rl) {
                try {
                    JobParameters jobParameters = this.f36242t;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f36241n.getClassLoader());
                    return new WrapperWorkItem(jobWorkItemDequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.rl = new Object();
            this.f36241n = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public IBinder n() {
            return getBinder();
        }
    }

    static abstract class WorkEnqueuer {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final ComponentName f36245n;
        boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f36246t;

        public void nr() {
        }

        public void rl() {
        }

        public void t() {
        }

        void n(int i2) {
            if (!this.rl) {
                this.rl = true;
                this.f36246t = i2;
            } else {
                if (this.f36246t == i2) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i2 + " is different than previous " + this.f36246t);
            }
        }

        WorkEnqueuer(ComponentName componentName) {
            this.f36245n = componentName;
        }
    }

    public boolean J2() {
        return true;
    }

    protected abstract void O(Intent intent);

    static final class CompatWorkEnqueuer extends WorkEnqueuer {
        private final PowerManager.WakeLock J2;
        boolean KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final PowerManager.WakeLock f36238O;
        boolean Uo;
        private final Context nr;

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void nr() {
            synchronized (this) {
                this.Uo = false;
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void rl() {
            synchronized (this) {
                try {
                    if (this.KN) {
                        if (this.Uo) {
                            this.f36238O.acquire(60000L);
                        }
                        this.KN = false;
                        this.J2.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void t() {
            synchronized (this) {
                try {
                    if (!this.KN) {
                        this.KN = true;
                        this.J2.acquire(600000L);
                        this.f36238O.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(componentName);
            this.nr = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f36238O = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.J2 = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }
    }

    @RequiresApi
    static final class JobWorkEnqueuer extends WorkEnqueuer {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final JobScheduler f36244O;
        private final JobInfo nr;

        JobWorkEnqueuer(Context context, ComponentName componentName, int i2) {
            super(componentName);
            n(i2);
            this.nr = new JobInfo.Builder(i2, this.f36245n).setOverrideDeadline(0L).build();
            this.f36244O = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    static WorkEnqueuer nr(Context context, ComponentName componentName, boolean z2, int i2) {
        WorkEnqueuer compatWorkEnqueuer;
        HashMap map = f36230g;
        WorkEnqueuer workEnqueuer = (WorkEnqueuer) map.get(componentName);
        if (workEnqueuer != null) {
            return workEnqueuer;
        }
        if (Build.VERSION.SDK_INT < 26) {
            compatWorkEnqueuer = new CompatWorkEnqueuer(context, componentName);
        } else {
            if (!z2) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            compatWorkEnqueuer = new JobWorkEnqueuer(context, componentName, i2);
        }
        map.put(componentName, compatWorkEnqueuer);
        return compatWorkEnqueuer;
    }

    void Uo() {
        ArrayList arrayList = this.f36232Z;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f36231O = null;
                    ArrayList arrayList2 = this.f36232Z;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        t(false);
                    } else if (!this.f36234o) {
                        this.f36236t.rl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    GenericWorkItem n() {
        CompatJobEngine compatJobEngine = this.f36233n;
        if (compatJobEngine != null) {
            return compatJobEngine.rl();
        }
        synchronized (this.f36232Z) {
            try {
                if (this.f36232Z.size() <= 0) {
                    return null;
                }
                return (GenericWorkItem) this.f36232Z.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        CompatJobEngine compatJobEngine = this.f36233n;
        if (compatJobEngine != null) {
            return compatJobEngine.n();
        }
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        if (this.f36232Z == null) {
            return 2;
        }
        this.f36236t.nr();
        synchronized (this.f36232Z) {
            ArrayList arrayList = this.f36232Z;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i3));
            t(true);
        }
        return 3;
    }

    boolean rl() {
        CommandProcessor commandProcessor = this.f36231O;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.J2);
        }
        this.f36235r = true;
        return J2();
    }

    void t(boolean z2) {
        if (this.f36231O == null) {
            this.f36231O = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.f36236t;
            if (workEnqueuer != null && z2) {
                workEnqueuer.t();
            }
            this.f36231O.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f36233n = new JobServiceEngineImpl(this);
            this.f36236t = null;
        } else {
            this.f36233n = null;
            this.f36236t = nr(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f36232Z;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f36234o = true;
                this.f36236t.rl();
            }
        }
    }
}
