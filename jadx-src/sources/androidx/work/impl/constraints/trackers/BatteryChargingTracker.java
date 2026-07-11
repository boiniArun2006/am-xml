package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class BatteryChargingTracker extends BroadcastReceiverConstraintTracker<Boolean> {
    private static final String xMQ = Logger.J2("BatteryChrgTracker");

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void KN(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        Logger.t().n(xMQ, String.format("Received %s", action), new Throwable[0]);
        switch (action) {
            case "android.intent.action.ACTION_POWER_DISCONNECTED":
                nr(Boolean.FALSE);
                break;
            case "android.os.action.DISCHARGING":
                nr(Boolean.FALSE);
                break;
            case "android.os.action.CHARGING":
                nr(Boolean.TRUE);
                break;
            case "android.intent.action.ACTION_POWER_CONNECTED":
                nr(Boolean.TRUE);
                break;
        }
    }

    private boolean mUb(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public IntentFilter Uo() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public Boolean rl() {
        Intent intentRegisterReceiver = this.rl.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(mUb(intentRegisterReceiver));
        }
        Logger.t().rl(xMQ, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    public BatteryChargingTracker(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
    }
}
