package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.safedk.android.analytics.brandsafety.FileUploadManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzlp extends zzg {
    private JobScheduler zza;

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    @WorkerThread
    protected final void zzf() {
        this.zza = (JobScheduler) this.zzu.zzaY().getSystemService("jobscheduler");
    }

    @VisibleForTesting
    final int zzi() {
        return "measurement-client".concat(String.valueOf(this.zzu.zzaY().getPackageName())).hashCode();
    }

    public zzlp(zzib zzibVar) {
        super(zzibVar);
    }

    @WorkerThread
    public final void zzh(long j2) {
        String str;
        zzb();
        zzg();
        JobScheduler jobScheduler = this.zza;
        if (jobScheduler != null && jobScheduler.getPendingJob(zzi()) != null) {
            this.zzu.zzaV().zzk().zza("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        com.google.android.gms.internal.measurement.zzin zzinVarZzj = zzj();
        if (zzinVarZzj == com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE) {
            zzib zzibVar = this.zzu;
            zzibVar.zzaV().zzk().zzb("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j2));
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(FileUploadManager.f61572j, "com.google.android.gms.measurement.SCION_UPLOAD");
            int iSchedule = ((JobScheduler) Preconditions.checkNotNull(this.zza)).schedule(new JobInfo.Builder(zzi(), new ComponentName(zzibVar.zzaY(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j2).setOverrideDeadline(j2 + j2).setExtras(persistableBundle).build());
            zzgr zzgrVarZzk = zzibVar.zzaV().zzk();
            if (iSchedule == 1) {
                str = "SUCCESS";
            } else {
                str = "FAILURE";
            }
            zzgrVarZzk.zzb("[sgtm] Scion upload job scheduled with result", str);
            return;
        }
        this.zzu.zzaV().zzk().zzb("[sgtm] Not eligible for Scion upload", zzinVarZzj.name());
    }

    @WorkerThread
    final com.google.android.gms.internal.measurement.zzin zzj() {
        zzb();
        zzg();
        if (this.zza != null) {
            zzib zzibVar = this.zzu;
            if (zzibVar.zzc().zzx()) {
                zzib zzibVar2 = this.zzu;
                if (zzibVar2.zzv().zzn() >= 119000) {
                    if (!zzpo.zzR(zzibVar.zzaY(), "com.google.android.gms.measurement.AppMeasurementJobService")) {
                        return com.google.android.gms.internal.measurement.zzin.MEASUREMENT_SERVICE_NOT_ENABLED;
                    }
                    if (!zzibVar2.zzt().zzK()) {
                        return com.google.android.gms.internal.measurement.zzin.NON_PLAY_MODE;
                    }
                    return com.google.android.gms.internal.measurement.zzin.CLIENT_UPLOAD_ELIGIBLE;
                }
                return com.google.android.gms.internal.measurement.zzin.SDK_TOO_OLD;
            }
            return com.google.android.gms.internal.measurement.zzin.NOT_ENABLED_IN_MANIFEST;
        }
        return com.google.android.gms.internal.measurement.zzin.MISSING_JOB_SCHEDULER;
    }
}
