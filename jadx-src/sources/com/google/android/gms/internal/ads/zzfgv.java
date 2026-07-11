package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfgv implements zzesf {
    private final Context zza;
    private final Executor zzb;
    private final zzcma zzc;
    private final zzerp zzd;
    private final zzfhv zze;

    @Nullable
    private zzbhz zzf;
    private final zzfor zzg;
    private final zzfjj zzh;
    private com.google.common.util.concurrent.Xo zzi;

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zza(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzesd zzesdVar, zzese zzeseVar) {
        zzdlu zzdluVarZzh;
        zzfoo zzfooVarZzc;
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
            return false;
        }
        if (zzb()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzw().zzc(true);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar = ((zzfgo) zzesdVar).zza;
        Bundle bundleZza = zzdxj.zza(new Pair(zzdxh.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdxh.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis())));
        zzfjj zzfjjVar = this.zzh;
        zzfjjVar.zzg(str);
        zzfjjVar.zzc(zzrVar);
        zzfjjVar.zza(zzmVar);
        zzfjjVar.zzv(bundleZza);
        Context context = this.zza;
        zzfjk zzfjkVarZzA = zzfjjVar.zzA();
        zzfoe zzfoeVarZzo = zzfoe.zzo(context, zzfon.zzg(zzfjkVarZzA), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjy)).booleanValue()) {
            zzdlt zzdltVarZzm = this.zzc.zzm();
            zzdan zzdanVar = new zzdan();
            zzdanVar.zza(context);
            zzdanVar.zzb(zzfjkVarZzA);
            zzdltVarZzm.zze(zzdanVar.zze());
            zzdhe zzdheVar = new zzdhe();
            zzerp zzerpVar = this.zzd;
            Executor executor = this.zzb;
            zzdheVar.zzm(zzerpVar, executor);
            zzdheVar.zze(zzerpVar, executor);
            zzdltVarZzm.zzf(zzdheVar.zzn());
            zzdltVarZzm.zzd(new zzepw(this.zzf));
            zzdluVarZzh = zzdltVarZzm.zzh();
        } else {
            zzdhe zzdheVar2 = new zzdhe();
            zzfhv zzfhvVar = this.zze;
            if (zzfhvVar != null) {
                Executor executor2 = this.zzb;
                zzdheVar2.zza(zzfhvVar, executor2);
                zzdheVar2.zzb(zzfhvVar, executor2);
                zzdheVar2.zzc(zzfhvVar, executor2);
            }
            zzdlt zzdltVarZzm2 = this.zzc.zzm();
            zzdan zzdanVar2 = new zzdan();
            zzdanVar2.zza(context);
            zzdanVar2.zzb(zzfjkVarZzA);
            zzdltVarZzm2.zze(zzdanVar2.zze());
            zzerp zzerpVar2 = this.zzd;
            Executor executor3 = this.zzb;
            zzdheVar2.zzm(zzerpVar2, executor3);
            zzdheVar2.zza(zzerpVar2, executor3);
            zzdheVar2.zzb(zzerpVar2, executor3);
            zzdheVar2.zzc(zzerpVar2, executor3);
            zzdheVar2.zzf(zzerpVar2, executor3);
            zzdheVar2.zzg(zzerpVar2, executor3);
            zzdheVar2.zze(zzerpVar2, executor3);
            zzdheVar2.zzk(zzerpVar2, executor3);
            zzdheVar2.zzd(zzerpVar2, executor3);
            zzdltVarZzm2.zzf(zzdheVar2.zzn());
            zzdltVarZzm2.zzd(new zzepw(this.zzf));
            zzdluVarZzh = zzdltVarZzm2.zzh();
        }
        zzdlu zzdluVar = zzdluVarZzh;
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzfooVarZzc = zzdluVar.zzc();
            zzfooVarZzc.zzi(4);
            zzfooVarZzc.zzc(zzmVar.zzp);
            zzfooVarZzc.zzd(zzmVar.zzm);
        } else {
            zzfooVarZzc = null;
        }
        zzfoo zzfooVar = zzfooVarZzc;
        zzcxj zzcxjVarZzb = zzdluVar.zzb();
        com.google.common.util.concurrent.Xo xoZzc = zzcxjVarZzb.zzc(zzcxjVarZzb.zzb());
        this.zzi = xoZzc;
        zzgzo.zzr(xoZzc, new zzfgt(this, zzeseVar, zzfooVar, zzfoeVarZzo, zzdluVar), this.zzb);
        return true;
    }

    public final void zzc(zzbhz zzbhzVar) {
        this.zzf = zzbhzVar;
    }

    final /* synthetic */ Executor zze() {
        return this.zzb;
    }

    final /* synthetic */ zzerp zzf() {
        return this.zzd;
    }

    final /* synthetic */ zzfhv zzg() {
        return this.zze;
    }

    final /* synthetic */ zzfor zzh() {
        return this.zzg;
    }

    final /* synthetic */ void zzi(com.google.common.util.concurrent.Xo xo) {
        this.zzi = null;
    }

    @Override // com.google.android.gms.internal.ads.zzesf
    public final boolean zzb() {
        com.google.common.util.concurrent.Xo xo = this.zzi;
        return (xo == null || xo.isDone()) ? false : true;
    }

    final /* synthetic */ void zzd() {
        this.zzd.zzdI(zzfkm.zzd(6, null, null));
    }

    public zzfgv(Context context, Executor executor, zzcma zzcmaVar, zzerp zzerpVar, zzfhv zzfhvVar, zzfjj zzfjjVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcmaVar;
        this.zzd = zzerpVar;
        this.zzh = zzfjjVar;
        this.zze = zzfhvVar;
        this.zzg = zzcmaVar.zzx();
    }
}
