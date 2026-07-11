package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzesm implements zzesf {
    private final zzfjj zza;
    private final zzcma zzb;
    private final Context zzc;
    private final zzesc zzd;
    private final zzfor zze;

    @Nullable
    private zzcwu zzf;

    final /* synthetic */ zzcma zze() {
        return this.zzb;
    }

    final /* synthetic */ zzesc zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfor zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzesd zzesdVar, zzese zzeseVar) throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zzc;
        if (com.google.android.gms.ads.internal.util.zzs.zzM(context) && zzmVar.zzs == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
            return false;
        }
        if (str == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        boolean z2 = zzmVar.zzf;
        zzfkh.zzb(context, z2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && z2) {
            this.zzb.zzw().zzc(true);
        }
        int i5 = ((zzesg) zzesdVar).zza;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        String strZza = zzdxh.PUBLIC_API_CALL.zza();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Bundle bundleZza = zzdxj.zza(new Pair(strZza, lValueOf), new Pair(zzdxh.DYNAMITE_ENTER.zza(), lValueOf));
        zzfjj zzfjjVar = this.zza;
        zzfjjVar.zza(zzmVar);
        zzfjjVar.zzv(bundleZza);
        zzfjjVar.zzl(i5);
        zzfjk zzfjkVarZzA = zzfjjVar.zzA();
        zzfoe zzfoeVarZzo = zzfoe.zzo(context, zzfon.zzg(zzfjkVarZzA), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzco zzcoVar = zzfjkVarZzA.zzo;
        if (zzcoVar != null) {
            this.zzd.zzc().zzn(zzcoVar);
        }
        zzcma zzcmaVar = this.zzb;
        zzdmp zzdmpVarZzo = zzcmaVar.zzo();
        zzdan zzdanVar = new zzdan();
        zzdanVar.zza(context);
        zzdanVar.zzb(zzfjkVarZzA);
        zzdmpVarZzo.zzf(zzdanVar.zze());
        zzdhe zzdheVar = new zzdhe();
        zzesc zzescVar = this.zzd;
        zzdheVar.zze(zzescVar.zzc(), zzcmaVar.zzb());
        zzdmpVarZzo.zzg(zzdheVar.zzn());
        zzdmpVarZzo.zze(zzescVar.zzb());
        zzfoo zzfooVarZzc = null;
        zzdmpVarZzo.zzd(new zzctu(null));
        zzdmq zzdmqVarZzh = zzdmpVarZzo.zzh();
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzfooVarZzc = zzdmqVarZzh.zzc();
            zzfooVarZzc.zzi(8);
            zzfooVarZzc.zzc(zzmVar.zzp);
            zzfooVarZzc.zzd(zzmVar.zzm);
        }
        zzfoo zzfooVar = zzfooVarZzc;
        zzcmaVar.zzv().zza(1);
        zzgzy zzgzyVarZzc = zzfmk.zzc();
        ScheduledExecutorService scheduledExecutorServiceZzc = zzcmaVar.zzc();
        zzcxj zzcxjVarZza = zzdmqVarZzh.zza();
        zzcwu zzcwuVar = new zzcwu(zzgzyVarZzc, scheduledExecutorServiceZzc, zzcxjVarZza.zzc(zzcxjVarZza.zzb()));
        this.zzf = zzcwuVar;
        zzcwuVar.zza(new zzesj(this, zzeseVar, zzfooVar, zzfoeVarZzo, zzdmqVarZzh));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zzb() {
        zzcwu zzcwuVar = this.zzf;
        return zzcwuVar != null && zzcwuVar.zzb();
    }

    final /* synthetic */ void zzc() {
        this.zzd.zze().zzdI(zzfkm.zzd(4, null, null));
    }

    final /* synthetic */ void zzd() {
        this.zzd.zze().zzdI(zzfkm.zzd(6, null, null));
    }

    public zzesm(zzcma zzcmaVar, Context context, zzesc zzescVar, zzfjj zzfjjVar) {
        this.zzb = zzcmaVar;
        this.zzc = context;
        this.zzd = zzescVar;
        this.zza = zzfjjVar;
        this.zze = zzcmaVar.zzx();
        zzfjjVar.zzt(zzescVar.zzc());
    }
}
