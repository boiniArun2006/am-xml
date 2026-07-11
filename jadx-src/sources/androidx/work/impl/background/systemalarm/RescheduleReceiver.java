package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f42859n = Logger.J2("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Logger.t().n(f42859n, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            WorkManagerImpl.gh(context).Z(goAsync());
        } catch (IllegalStateException e2) {
            Logger.t().rl(f42859n, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
        }
    }
}
