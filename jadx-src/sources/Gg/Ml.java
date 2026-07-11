package Gg;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Ml implements r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f3700n;
    private final ePt.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Wre f3701t;

    @Override // Gg.r
    public void n(veW.eO eOVar, int i2) {
        rl(eOVar, i2, false);
    }

    @Override // Gg.r
    public void rl(veW.eO eOVar, int i2, boolean z2) {
        ComponentName componentName = new ComponentName(this.f3700n, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f3700n.getSystemService("jobscheduler");
        int iT = t(eOVar);
        if (!z2 && nr(jobScheduler, iT, i2)) {
            l0.j.rl("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", eOVar);
            return;
        }
        long jG = this.rl.g(eOVar);
        JobInfo.Builder builderT = this.f3701t.t(new JobInfo.Builder(iT, componentName), eOVar.nr(), jG, i2);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", eOVar.rl());
        persistableBundle.putInt("priority", Kn.j.n(eOVar.nr()));
        if (eOVar.t() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(eOVar.t(), 0));
        }
        builderT.setExtras(persistableBundle);
        l0.j.t("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", eOVar, Integer.valueOf(iT), Long.valueOf(this.f3701t.Uo(eOVar.nr(), jG, i2)), Long.valueOf(jG), Integer.valueOf(i2));
        jobScheduler.schedule(builderT.build());
    }

    int t(veW.eO eOVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f3700n.getPackageName().getBytes(Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME)));
        adler32.update(eOVar.rl().getBytes(Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(Kn.j.n(eOVar.nr())).array());
        if (eOVar.t() != null) {
            adler32.update(eOVar.t());
        }
        return (int) adler32.getValue();
    }

    public Ml(Context context, ePt.Ml ml, Wre wre) {
        this.f3700n = context;
        this.rl = ml;
        this.f3701t = wre;
    }

    private boolean nr(JobScheduler jobScheduler, int i2, int i3) {
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            JobInfo next = it.next();
            int i5 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i2) {
                if (i5 >= i3) {
                    return true;
                }
            }
        }
        return false;
    }
}
