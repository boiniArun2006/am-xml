package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzob extends zzg {
    protected final zzoa zza;
    protected final zznz zzb;
    protected final zznx zzc;
    private Handler zzd;
    private boolean zze;

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    final /* synthetic */ Handler zzm() {
        return this.zzd;
    }

    zzob(zzib zzibVar) {
        super(zzibVar);
        this.zze = true;
        this.zza = new zzoa(this);
        this.zzb = new zznz(this);
        this.zzc = new zznx(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzj() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzcn(Looper.getMainLooper());
        }
    }

    @WorkerThread
    final void zzh(boolean z2) {
        zzg();
        this.zze = z2;
    }

    @WorkerThread
    final boolean zzi() {
        zzg();
        return this.zze;
    }

    final /* synthetic */ void zzk(long j2) {
        zzg();
        zzj();
        zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zzb("Activity resumed, time", Long.valueOf(j2));
        if (zzibVar.zzc().zzp(null, zzfx.zzaU)) {
            if (zzibVar.zzc().zzv() || this.zze) {
                this.zzb.zza(j2);
            }
        } else if (zzibVar.zzc().zzv() || zzibVar.zzd().zzn.zza()) {
            this.zzb.zza(j2);
        }
        this.zzc.zza();
        zzoa zzoaVar = this.zza;
        zzob zzobVar = zzoaVar.zza;
        zzobVar.zzg();
        if (!zzobVar.zzu.zzB()) {
            return;
        }
        zzoaVar.zzb(zzobVar.zzu.zzaZ().currentTimeMillis(), false);
    }

    final /* synthetic */ void zzl(long j2) {
        zzg();
        zzj();
        zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zzb("Activity paused, time", Long.valueOf(j2));
        this.zzc.zzb(j2);
        if (zzibVar.zzc().zzv()) {
            this.zzb.zzb(j2);
        }
    }
}
