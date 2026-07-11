package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.safedk.android.analytics.brandsafety.FileUploadManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzoj extends zzor {
    private final AlarmManager zza;
    private zzay zzb;
    private Integer zzc;

    private final zzay zzf() {
        if (this.zzb == null) {
            this.zzb = new zzoi(this, this.zzg.zzaf());
        }
        return this.zzb;
    }

    private final void zzh() {
        JobScheduler jobScheduler = (JobScheduler) this.zzu.zzaY().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(zzi());
        }
    }

    private final int zzi() {
        if (this.zzc == null) {
            this.zzc = Integer.valueOf("measurement".concat(String.valueOf(this.zzu.zzaY().getPackageName())).hashCode());
        }
        return this.zzc.intValue();
    }

    private final PendingIntent zzj() {
        Context contextZzaY = this.zzu.zzaY();
        return PendingIntent.getBroadcast(contextZzaY, 0, new Intent().setClassName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzcg.zza);
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    protected final boolean zzbb() {
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzj());
        }
        zzh();
        return false;
    }

    protected zzoj(zzpf zzpfVar) {
        super(zzpfVar);
        this.zza = (AlarmManager) this.zzu.zzaY().getSystemService("alarm");
    }

    public final void zzc(long j2) {
        zzay();
        zzib zzibVar = this.zzu;
        zzibVar.zzaU();
        Context contextZzaY = zzibVar.zzaY();
        if (!zzpo.zzau(contextZzaY)) {
            zzibVar.zzaV().zzj().zza("Receiver not registered/enabled");
        }
        if (!zzpo.zzQ(contextZzaY, false)) {
            zzibVar.zzaV().zzj().zza("Service not registered/enabled");
        }
        zzd();
        zzibVar.zzaV().zzk().zzb("Scheduling upload, millis", Long.valueOf(j2));
        zzibVar.zzaZ().elapsedRealtime();
        zzibVar.zzc();
        if (j2 < Math.max(0L, ((Long) zzfx.zzL.zzb(null)).longValue()) && !zzf().zzc()) {
            zzf().zzb(j2);
        }
        zzibVar.zzaU();
        Context contextZzaY2 = zzibVar.zzaY();
        ComponentName componentName = new ComponentName(contextZzaY2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iZzi = zzi();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(FileUploadManager.f61572j, "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzch.zza(contextZzaY2, new JobInfo.Builder(iZzi, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 + j2).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void zzd() {
        zzay();
        this.zzu.zzaV().zzk().zza("Unscheduling upload");
        AlarmManager alarmManager = this.zza;
        if (alarmManager != null) {
            alarmManager.cancel(zzj());
        }
        zzf().zzd();
        zzh();
    }
}
