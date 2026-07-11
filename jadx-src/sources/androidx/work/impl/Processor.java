package androidx.work.impl;

import aT.dE.JLZo;
import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.Xo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@RestrictTo
public class Processor implements ExecutionListener, ForegroundProcessor {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final String f42771X = Logger.J2("Processor");
    private TaskExecutor J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Configuration f42772O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private List f42773S;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WorkDatabase f42779r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Context f42780t;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private Map f42774Z = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map f42778o = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set f42776g = new HashSet();
    private final List E2 = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PowerManager.WakeLock f42777n = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f42775e = new Object();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
    private static class FutureListener implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Xo f42781O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ExecutionListener f42782n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f42783t;

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) this.f42781O.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f42782n.O(this.f42783t, zBooleanValue);
        }

        FutureListener(ExecutionListener executionListener, String str, Xo xo) {
            this.f42782n = executionListener;
            this.f42783t = str;
            this.f42781O = xo;
        }
    }

    private static boolean nr(String str, WorkerWrapper workerWrapper) {
        if (workerWrapper == null) {
            Logger.t().n(f42771X, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        workerWrapper.nr();
        Logger.t().n(f42771X, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    public boolean mUb(String str) {
        return gh(str, null);
    }

    private void az() {
        synchronized (this.f42775e) {
            try {
                if (this.f42778o.isEmpty()) {
                    try {
                        this.f42780t.startService(SystemForegroundDispatcher.nr(this.f42780t));
                    } catch (Throwable th) {
                        Logger.t().rl(f42771X, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f42777n;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f42777n = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean HI(String str) {
        boolean zNr;
        synchronized (this.f42775e) {
            Logger.t().n(f42771X, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zNr = nr(str, (WorkerWrapper) this.f42774Z.remove(str));
        }
        return zNr;
    }

    public boolean J2(String str) {
        boolean zContains;
        synchronized (this.f42775e) {
            zContains = this.f42776g.contains(str);
        }
        return zContains;
    }

    public boolean KN(String str) {
        boolean zContainsKey;
        synchronized (this.f42775e) {
            zContainsKey = this.f42778o.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // androidx.work.impl.ExecutionListener
    public void O(String str, boolean z2) {
        synchronized (this.f42775e) {
            try {
                this.f42774Z.remove(str);
                Logger.t().n(f42771X, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z2)), new Throwable[0]);
                Iterator it = this.E2.iterator();
                while (it.hasNext()) {
                    ((ExecutionListener) it.next()).O(str, z2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean Uo(String str) {
        boolean z2;
        synchronized (this.f42775e) {
            try {
                z2 = this.f42774Z.containsKey(str) || this.f42778o.containsKey(str);
            } finally {
            }
        }
        return z2;
    }

    public boolean gh(String str, WorkerParameters.RuntimeExtras runtimeExtras) throws Throwable {
        Throwable th;
        synchronized (this.f42775e) {
            try {
                try {
                    if (!Uo(str)) {
                        WorkerWrapper workerWrapperN = new WorkerWrapper.Builder(this.f42780t, this.f42772O, this.J2, this, this.f42779r, str).t(this.f42773S).rl(runtimeExtras).n();
                        Xo xoRl = workerWrapperN.rl();
                        xoRl.addListener(new FutureListener(this, str, xoRl), this.J2.n());
                        this.f42774Z.put(str, workerWrapperN);
                        this.J2.getBackgroundExecutor().execute(workerWrapperN);
                        Logger.t().n(f42771X, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                        return true;
                    }
                    try {
                        Logger.t().n(f42771X, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            th = th;
            throw th;
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void n(String str) {
        synchronized (this.f42775e) {
            this.f42778o.remove(str);
            az();
        }
    }

    public boolean qie(String str) {
        boolean zNr;
        synchronized (this.f42775e) {
            try {
                Logger.t().n(f42771X, String.format(JLZo.xlotIcBxoI, str), new Throwable[0]);
                this.f42776g.add(str);
                WorkerWrapper workerWrapper = (WorkerWrapper) this.f42778o.remove(str);
                boolean z2 = workerWrapper != null;
                if (workerWrapper == null) {
                    workerWrapper = (WorkerWrapper) this.f42774Z.remove(str);
                }
                zNr = nr(str, workerWrapper);
                if (z2) {
                    az();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zNr;
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public void rl(String str, ForegroundInfo foregroundInfo) {
        synchronized (this.f42775e) {
            try {
                Logger.t().nr(f42771X, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                WorkerWrapper workerWrapper = (WorkerWrapper) this.f42774Z.remove(str);
                if (workerWrapper != null) {
                    if (this.f42777n == null) {
                        PowerManager.WakeLock wakeLockRl = WakeLocks.rl(this.f42780t, "ProcessorForegroundLck");
                        this.f42777n = wakeLockRl;
                        wakeLockRl.acquire();
                    }
                    this.f42778o.put(str, workerWrapper);
                    ContextCompat.startForegroundService(this.f42780t, SystemForegroundDispatcher.t(this.f42780t, str, foregroundInfo));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(ExecutionListener executionListener) {
        synchronized (this.f42775e) {
            this.E2.add(executionListener);
        }
    }

    public boolean ty(String str) {
        boolean zNr;
        synchronized (this.f42775e) {
            Logger.t().n(f42771X, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zNr = nr(str, (WorkerWrapper) this.f42778o.remove(str));
        }
        return zNr;
    }

    public void xMQ(ExecutionListener executionListener) {
        synchronized (this.f42775e) {
            this.E2.remove(executionListener);
        }
    }

    public Processor(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkDatabase workDatabase, List list) {
        this.f42780t = context;
        this.f42772O = configuration;
        this.J2 = taskExecutor;
        this.f42779r = workDatabase;
        this.f42773S = list;
    }
}
