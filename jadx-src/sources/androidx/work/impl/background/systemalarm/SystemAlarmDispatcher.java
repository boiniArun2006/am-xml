package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.SerialExecutor;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public class SystemAlarmDispatcher implements ExecutionListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f42860e = Logger.J2("SystemAlarmDispatcher");
    public CommandsCompletedListener E2;
    public final Processor J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final WorkTimer f42861O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final List f42862S;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final Handler f42863Z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f42864g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f42865n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CommandHandler f42866o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final WorkManagerImpl f42867r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TaskExecutor f42868t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static class AddRunnable implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final int f42870O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final SystemAlarmDispatcher f42871n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Intent f42872t;

        @Override // java.lang.Runnable
        public void run() {
            this.f42871n.n(this.f42872t, this.f42870O);
        }

        public AddRunnable(SystemAlarmDispatcher systemAlarmDispatcher, Intent intent, int i2) {
            this.f42871n = systemAlarmDispatcher;
            this.f42872t = intent;
            this.f42870O = i2;
        }
    }

    interface CommandsCompletedListener {
        void rl();
    }

    static class DequeueAndCheckForCompletion implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final SystemAlarmDispatcher f42873n;

        @Override // java.lang.Runnable
        public void run() {
            this.f42873n.t();
        }

        public DequeueAndCheckForCompletion(SystemAlarmDispatcher systemAlarmDispatcher) {
            this.f42873n = systemAlarmDispatcher;
        }
    }

    public SystemAlarmDispatcher(Context context) {
        this(context, null, null);
    }

    public SystemAlarmDispatcher(Context context, Processor processor, WorkManagerImpl workManagerImpl) {
        Context applicationContext = context.getApplicationContext();
        this.f42865n = applicationContext;
        this.f42866o = new CommandHandler(applicationContext);
        this.f42861O = new WorkTimer();
        workManagerImpl = workManagerImpl == null ? WorkManagerImpl.gh(context) : workManagerImpl;
        this.f42867r = workManagerImpl;
        processor = processor == null ? workManagerImpl.az() : processor;
        this.J2 = processor;
        this.f42868t = workManagerImpl.ck();
        processor.t(this);
        this.f42862S = new ArrayList();
        this.f42864g = null;
        this.f42863Z = new Handler(Looper.getMainLooper());
    }

    private void rl() {
        if (this.f42863Z.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    TaskExecutor J2() {
        return this.f42868t;
    }

    WorkTimer KN() {
        return this.f42861O;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void O(String str, boolean z2) {
        gh(new AddRunnable(this, CommandHandler.t(this.f42865n, str, z2), 0));
    }

    WorkManagerImpl Uo() {
        return this.f42867r;
    }

    void az(CommandsCompletedListener commandsCompletedListener) {
        if (this.E2 != null) {
            Logger.t().rl(f42860e, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.E2 = commandsCompletedListener;
        }
    }

    void gh(Runnable runnable) {
        this.f42863Z.post(runnable);
    }

    Processor nr() {
        return this.J2;
    }

    private void qie() {
        rl();
        PowerManager.WakeLock wakeLockRl = WakeLocks.rl(this.f42865n, "ProcessCommand");
        try {
            wakeLockRl.acquire();
            this.f42867r.ck().rl(new Runnable() { // from class: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (SystemAlarmDispatcher.this.f42862S) {
                        SystemAlarmDispatcher systemAlarmDispatcher = SystemAlarmDispatcher.this;
                        systemAlarmDispatcher.f42864g = (Intent) systemAlarmDispatcher.f42862S.get(0);
                    }
                    Intent intent = SystemAlarmDispatcher.this.f42864g;
                    if (intent != null) {
                        String action = intent.getAction();
                        int intExtra = SystemAlarmDispatcher.this.f42864g.getIntExtra("KEY_START_ID", 0);
                        Logger loggerT = Logger.t();
                        String str = SystemAlarmDispatcher.f42860e;
                        loggerT.n(str, String.format("Processing command %s, %s", SystemAlarmDispatcher.this.f42864g, Integer.valueOf(intExtra)), new Throwable[0]);
                        PowerManager.WakeLock wakeLockRl2 = WakeLocks.rl(SystemAlarmDispatcher.this.f42865n, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                        try {
                            Logger.t().n(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockRl2), new Throwable[0]);
                            wakeLockRl2.acquire();
                            SystemAlarmDispatcher systemAlarmDispatcher2 = SystemAlarmDispatcher.this;
                            systemAlarmDispatcher2.f42866o.HI(systemAlarmDispatcher2.f42864g, intExtra, systemAlarmDispatcher2);
                            Logger.t().n(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockRl2), new Throwable[0]);
                            wakeLockRl2.release();
                            SystemAlarmDispatcher systemAlarmDispatcher3 = SystemAlarmDispatcher.this;
                            systemAlarmDispatcher3.gh(new DequeueAndCheckForCompletion(systemAlarmDispatcher3));
                        } catch (Throwable th) {
                            try {
                                Logger loggerT2 = Logger.t();
                                String str2 = SystemAlarmDispatcher.f42860e;
                                loggerT2.rl(str2, "Unexpected error in onHandleIntent", th);
                                Logger.t().n(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockRl2), new Throwable[0]);
                                wakeLockRl2.release();
                                SystemAlarmDispatcher systemAlarmDispatcher4 = SystemAlarmDispatcher.this;
                                systemAlarmDispatcher4.gh(new DequeueAndCheckForCompletion(systemAlarmDispatcher4));
                            } catch (Throwable th2) {
                                Logger.t().n(SystemAlarmDispatcher.f42860e, String.format("Releasing operation wake lock (%s) %s", action, wakeLockRl2), new Throwable[0]);
                                wakeLockRl2.release();
                                SystemAlarmDispatcher systemAlarmDispatcher5 = SystemAlarmDispatcher.this;
                                systemAlarmDispatcher5.gh(new DequeueAndCheckForCompletion(systemAlarmDispatcher5));
                                throw th2;
                            }
                        }
                    }
                }
            });
        } finally {
            wakeLockRl.release();
        }
    }

    private boolean xMQ(String str) {
        rl();
        synchronized (this.f42862S) {
            try {
                Iterator it = this.f42862S.iterator();
                while (it.hasNext()) {
                    if (str.equals(((Intent) it.next()).getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void mUb() {
        Logger.t().n(f42860e, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.J2.xMQ(this);
        this.f42861O.n();
        this.E2 = null;
    }

    public boolean n(Intent intent, int i2) {
        Logger loggerT = Logger.t();
        String str = f42860e;
        loggerT.n(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i2)), new Throwable[0]);
        rl();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.t().KN(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && xMQ("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i2);
        synchronized (this.f42862S) {
            try {
                boolean zIsEmpty = this.f42862S.isEmpty();
                this.f42862S.add(intent);
                if (zIsEmpty) {
                    qie();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    void t() {
        Logger loggerT = Logger.t();
        String str = f42860e;
        loggerT.n(str, "Checking if commands are complete.", new Throwable[0]);
        rl();
        synchronized (this.f42862S) {
            try {
                if (this.f42864g != null) {
                    Logger.t().n(str, String.format("Removing command %s", this.f42864g), new Throwable[0]);
                    if (((Intent) this.f42862S.remove(0)).equals(this.f42864g)) {
                        this.f42864g = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                SerialExecutor backgroundExecutor = this.f42868t.getBackgroundExecutor();
                if (!this.f42866o.ty() && this.f42862S.isEmpty() && !backgroundExecutor.n()) {
                    Logger.t().n(str, "No more commands & intents.", new Throwable[0]);
                    CommandsCompletedListener commandsCompletedListener = this.E2;
                    if (commandsCompletedListener != null) {
                        commandsCompletedListener.rl();
                    }
                } else if (!this.f42862S.isEmpty()) {
                    qie();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
