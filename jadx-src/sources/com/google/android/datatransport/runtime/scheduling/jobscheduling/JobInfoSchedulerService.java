package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import Kn.j;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import veW.eO;
import veW.s4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        s4.J2(getApplicationContext());
        eO.j jVarNr = eO.n().rl(string).nr(j.rl(i2));
        if (string2 != null) {
            jVarNr.t(Base64.decode(string2, 0));
        }
        s4.t().O().az(jVarNr.n(), i3, new Runnable() { // from class: Gg.I28
            @Override // java.lang.Runnable
            public final void run() {
                this.f3698n.jobFinished(jobParameters, false);
            }
        });
        return true;
    }
}
