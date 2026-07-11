package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.impl.workers.DiagnosticsWorker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42906n = Logger.J2("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Logger.t().n(f42906n, "Requesting diagnostics", new Throwable[0]);
        try {
            WorkManager.nr(context).rl(OneTimeWorkRequest.nr(DiagnosticsWorker.class));
        } catch (IllegalStateException e2) {
            Logger.t().rl(f42906n, "WorkManager is not initialized", e2);
        }
    }
}
