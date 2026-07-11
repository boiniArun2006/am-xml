package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzkg implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzli zzb;

    zzkg(zzli zzliVar, long j2) {
        this.zza = j2;
        Objects.requireNonNull(zzliVar);
        this.zzb = zzliVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzli zzliVar = this.zzb;
        zzliVar.zzg();
        zzliVar.zzb();
        zzib zzibVar = zzliVar.zzu;
        zzibVar.zzaV().zzj().zza("Resetting analytics data (FE)");
        zzib zzibVar2 = zzliVar.zzu;
        zzob zzobVarZzh = zzibVar2.zzh();
        zzobVarZzh.zzg();
        zzobVarZzh.zzb.zzc();
        zzibVar2.zzv().zzi();
        boolean z2 = !zzliVar.zzu.zzB();
        zzhg zzhgVarZzd = zzibVar.zzd();
        zzhgVarZzd.zzc.zzb(this.zza);
        zzib zzibVar3 = zzhgVarZzd.zzu;
        if (!TextUtils.isEmpty(zzibVar3.zzd().zzq.zza())) {
            zzhgVarZzd.zzq.zzb(null);
        }
        zzhgVarZzd.zzk.zzb(0L);
        zzhgVarZzd.zzl.zzb(0L);
        if (!zzibVar3.zzc().zzt()) {
            zzhgVarZzd.zzn(z2);
        }
        zzhgVarZzd.zzr.zzb(null);
        zzhgVarZzd.zzs.zzb(0L);
        zzhgVarZzd.zzt.zzb(null);
        zzibVar2.zzt().zzB();
        zzibVar2.zzh().zza.zza();
        zzliVar.zzc = z2;
        zzibVar2.zzt().zzC(new AtomicReference());
    }
}
