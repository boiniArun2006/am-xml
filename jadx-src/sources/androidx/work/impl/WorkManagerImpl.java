package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.R;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.greedy.GreedyScheduler;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.PreferenceUtils;
import androidx.work.impl.utils.StartWorkRunnable;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@RestrictTo
public class WorkManagerImpl extends WorkManager {
    private Processor J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private List f42799O;
    private PreferenceUtils Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f42800n;
    private TaskExecutor nr;
    private Configuration rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private WorkDatabase f42801t;
    private BroadcastReceiver.PendingResult xMQ;
    private static final String mUb = Logger.J2("WorkManagerImpl");
    private static WorkManagerImpl gh = null;
    private static WorkManagerImpl qie = null;
    private static final Object az = new Object();

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImpl$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ SettableFuture f42802n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ PreferenceUtils f42803t;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f42802n.HI(Long.valueOf(this.f42803t.n()));
            } catch (Throwable th) {
                this.f42802n.ck(th);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkManagerImpl$2, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    class AnonymousClass2 implements Function<List<WorkSpec.WorkInfoPojo>, WorkInfo> {
        @Override // androidx.arch.core.util.Function
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public WorkInfo apply(List list) {
            if (list == null || list.size() <= 0) {
                return null;
            }
            return ((WorkSpec.WorkInfoPojo) list.get(0)).n();
        }
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor) {
        this(context, configuration, taskExecutor, context.getResources().getBoolean(R.bool.f42744n));
    }

    public void XQ(String str) {
        S(str, null);
    }

    public static void O(Context context, Configuration configuration) {
        synchronized (az) {
            try {
                WorkManagerImpl workManagerImpl = gh;
                if (workManagerImpl != null && qie != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (workManagerImpl == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (qie == null) {
                        qie = new WorkManagerImpl(applicationContext, configuration, new WorkManagerTaskExecutor(configuration.qie()));
                    }
                    gh = qie;
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WorkManagerImpl gh(Context context) {
        WorkManagerImpl workManagerImplMUb;
        synchronized (az) {
            try {
                workManagerImplMUb = mUb();
                if (workManagerImplMUb == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (!(applicationContext instanceof Configuration.Provider)) {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                    O(applicationContext, ((Configuration.Provider) applicationContext).n());
                    workManagerImplMUb = gh(applicationContext);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return workManagerImplMUb;
    }

    public static WorkManagerImpl mUb() {
        synchronized (az) {
            try {
                WorkManagerImpl workManagerImpl = gh;
                if (workManagerImpl != null) {
                    return workManagerImpl;
                }
                return qie;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public WorkDatabase HI() {
        return this.f42801t;
    }

    public Context KN() {
        return this.f42800n;
    }

    public void S(String str, WorkerParameters.RuntimeExtras runtimeExtras) {
        this.nr.rl(new StartWorkRunnable(this, str, runtimeExtras));
    }

    public void WPU(String str) {
        this.nr.rl(new StopWorkRunnable(this, str, true));
    }

    public void Z(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (az) {
            try {
                this.xMQ = pendingResult;
                if (this.KN) {
                    pendingResult.finish();
                    this.xMQ = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void aYN(String str) {
        this.nr.rl(new StopWorkRunnable(this, str, false));
    }

    public Processor az() {
        return this.J2;
    }

    public TaskExecutor ck() {
        return this.nr;
    }

    public PreferenceUtils qie() {
        return this.Uo;
    }

    public void r() {
        synchronized (az) {
            try {
                this.KN = true;
                BroadcastReceiver.PendingResult pendingResult = this.xMQ;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.xMQ = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List ty() {
        return this.f42799O;
    }

    public Configuration xMQ() {
        return this.rl;
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor, boolean z2) {
        this(context, configuration, taskExecutor, WorkDatabase.p5(context.getApplicationContext(), taskExecutor.getBackgroundExecutor(), z2));
    }

    private void Ik(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, List list, Processor processor) {
        Context applicationContext = context.getApplicationContext();
        this.f42800n = applicationContext;
        this.rl = configuration;
        this.nr = taskExecutor;
        this.f42801t = workDatabase;
        this.f42799O = list;
        this.J2 = processor;
        this.Uo = new PreferenceUtils(workDatabase);
        this.KN = false;
        if (!applicationContext.isDeviceProtectedStorage()) {
            this.nr.rl(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public Operation J2(UUID uuid) {
        CancelWorkRunnable cancelWorkRunnableRl = CancelWorkRunnable.rl(uuid, this);
        this.nr.rl(cancelWorkRunnableRl);
        return cancelWorkRunnableRl.O();
    }

    public List Uo(Context context, Configuration configuration, TaskExecutor taskExecutor) {
        return Arrays.asList(Schedulers.n(context, this), new GreedyScheduler(context, configuration, taskExecutor, this));
    }

    @Override // androidx.work.WorkManager
    public Operation n(String str) {
        CancelWorkRunnable cancelWorkRunnableNr = CancelWorkRunnable.nr(str, this);
        this.nr.rl(cancelWorkRunnableNr);
        return cancelWorkRunnableNr.O();
    }

    public void o() {
        SystemJobScheduler.rl(KN());
        HI().GR().HI();
        Schedulers.rl(xMQ(), HI(), ty());
    }

    @Override // androidx.work.WorkManager
    public Operation t(List list) {
        if (!list.isEmpty()) {
            return new WorkContinuationImpl(this, list).n();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        Logger.O(new Logger.LogcatLogger(configuration.mUb()));
        List listUo = Uo(applicationContext, configuration, taskExecutor);
        Ik(context, configuration, taskExecutor, workDatabase, listUo, new Processor(context, configuration, taskExecutor, workDatabase, listUo));
    }
}
