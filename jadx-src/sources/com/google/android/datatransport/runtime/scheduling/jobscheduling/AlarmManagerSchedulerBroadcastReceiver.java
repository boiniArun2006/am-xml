package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import Kn.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import veW.eO;
import veW.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static /* synthetic */ void n() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = intent.getExtras().getInt("attemptNumber");
        s4.J2(context);
        eO.j jVarNr = eO.n().rl(queryParameter).nr(j.rl(iIntValue));
        if (queryParameter2 != null) {
            jVarNr.t(Base64.decode(queryParameter2, 0));
        }
        s4.t().O().az(jVarNr.n(), i2, new Runnable() { // from class: Gg.j
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.n();
            }
        });
    }
}
