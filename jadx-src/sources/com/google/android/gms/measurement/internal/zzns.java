package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.MainThread;
import com.google.android.gms.common.internal.Preconditions;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzns {
    private final Context zza;

    @MainThread
    public static final boolean zzj(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @MainThread
    public final int zzc(final Intent intent, int i2, final int i3) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.zza;
        zzib zzibVarZzy = zzib.zzy(context, null, null);
        final zzgt zzgtVarZzaV = zzibVarZzy.zzaV();
        String action = intent.getAction();
        zzibVarZzy.zzaU();
        zzgtVarZzaV.zzk().zzc("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zzk(zzpf.zza(context), new Runnable() { // from class: com.google.android.gms.measurement.internal.zznr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzf(i3, zzgtVarZzaV, intent);
                }
            });
        }
        return 2;
    }

    @MainThread
    public static final void zzi(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @MainThread
    public final void zza() {
        Log.v("FA", this.zza.getClass().getSimpleName().concat(" is starting up."));
    }

    @MainThread
    public final void zzb() {
        Log.v("FA", this.zza.getClass().getSimpleName().concat(" is shutting down."));
    }

    @MainThread
    public final IBinder zzd(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzjc(zzpf.zza(this.zza), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zzf(int i2, zzgt zzgtVar, Intent intent) {
        Context context = this.zza;
        zzno zznoVar = (zzno) context;
        if (zznoVar.zza(i2)) {
            zzgtVar.zzk().zzb("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            zzib.zzy(context, null, null).zzaV().zzk().zza("Completed wakeful intent.");
            zznoVar.zzc(intent);
        }
    }

    final /* synthetic */ void zzh(JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((zzno) this.zza).zzb(jobParameters, false);
    }

    public zzns(Context context) {
        Preconditions.checkNotNull(context);
        this.zza = context;
    }

    private final void zzk(zzpf zzpfVar, Runnable runnable) {
        zzpfVar.zzaW().zzj(new zznn(this, zzpfVar, runnable));
    }

    @MainThread
    public final boolean zze(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString(FileUploadManager.f61572j);
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) Preconditions.checkNotNull(string);
            zzpf zzpfVarZza = zzpf.zza(this.zza);
            final zzgt zzgtVarZzaV = zzpfVarZza.zzaV();
            zzpfVarZza.zzaU();
            zzgtVarZzaV.zzk().zzb("Local AppMeasurementJobService called. action", str);
            zzk(zzpfVarZza, new Runnable() { // from class: com.google.android.gms.measurement.internal.zznp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(zzgtVarZzaV, jobParameters);
                }
            });
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            com.google.android.gms.internal.measurement.zzfb.zza(this.zza, null).zzw(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh(jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    final /* synthetic */ void zzg(zzgt zzgtVar, JobParameters jobParameters) {
        zzgtVar.zzk().zza("AppMeasurementJobService processed last upload request.");
        ((zzno) this.zza).zzb(jobParameters, false);
    }
}
