package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class Trackers {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static Trackers f42903O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BatteryChargingTracker f42904n;
    private StorageNotLowTracker nr;
    private BatteryNotLowTracker rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private NetworkStateTracker f42905t;

    public static synchronized Trackers t(Context context, TaskExecutor taskExecutor) {
        try {
            if (f42903O == null) {
                f42903O = new Trackers(context, taskExecutor);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f42903O;
    }

    public StorageNotLowTracker O() {
        return this.nr;
    }

    public BatteryChargingTracker n() {
        return this.f42904n;
    }

    public NetworkStateTracker nr() {
        return this.f42905t;
    }

    public BatteryNotLowTracker rl() {
        return this.rl;
    }

    private Trackers(Context context, TaskExecutor taskExecutor) {
        Context applicationContext = context.getApplicationContext();
        this.f42904n = new BatteryChargingTracker(applicationContext, taskExecutor);
        this.rl = new BatteryNotLowTracker(applicationContext, taskExecutor);
        this.f42905t = new NetworkStateTracker(applicationContext, taskExecutor);
        this.nr = new StorageNotLowTracker(applicationContext, taskExecutor);
    }
}
