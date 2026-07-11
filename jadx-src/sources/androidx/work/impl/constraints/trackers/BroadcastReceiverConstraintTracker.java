package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public abstract class BroadcastReceiverConstraintTracker<T> extends ConstraintTracker<T> {
    private static final String KN = Logger.J2("BrdcstRcvrCnstrntTrckr");
    private final BroadcastReceiver Uo;

    public abstract void KN(Context context, Intent intent);

    public abstract IntentFilter Uo();

    public BroadcastReceiverConstraintTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        this.Uo = new BroadcastReceiver() { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                VMRunner.invoke("peDVEOlFBQL2SkBg", new Object[]{this, context2, intent});
            }
        };
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void J2() {
        Logger.t().n(KN, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.rl.unregisterReceiver(this.Uo);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void O() {
        Logger.t().n(KN, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.rl.registerReceiver(this.Uo, Uo());
    }
}
