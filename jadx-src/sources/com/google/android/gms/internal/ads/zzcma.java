package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class zzcma implements zzcqi {
    private static zzcma zza;

    public abstract zzdzq zzA();

    public abstract zzfka zzB();

    public abstract zzecc zzC();

    public abstract zzdxz zzD();

    abstract zzdvh zzE();

    public abstract zzcdk zzG();

    public abstract Executor zzb();

    public abstract ScheduledExecutorService zzc();

    public abstract zzdeg zzd();

    public abstract zzcpj zze();

    public abstract zzfrd zzf();

    public abstract zzefu zzg();

    public abstract zzefw zzh();

    public abstract zzcvb zzi();

    public abstract zzffh zzj();

    public abstract zzctk zzk();

    public abstract zzfdu zzl();

    public abstract zzdlt zzm();

    public abstract zzfgx zzn();

    public abstract zzdmp zzo();

    public abstract zzdud zzp();

    public abstract zzfik zzq();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzab zzr();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzau zzs();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzt();

    public abstract zzejf zzu();

    public abstract zzfkj zzv();

    public abstract zzebf zzw();

    public abstract zzfor zzx();

    protected abstract zzfbz zzz(zzfdc zzfdcVar);

    private static synchronized zzcma zzH(Context context, zzbtt zzbttVar, int i2, boolean z2, int i3, zzcnl zzcnlVar) {
        try {
            zzcma zzcmaVar = zza;
            if (zzcmaVar != null) {
                return zzcmaVar;
            }
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzbhe.zza(context);
            if (((Boolean) zzbiw.zze.zze()).booleanValue()) {
                zzbgp.zza(context);
            }
            zzfkg zzfkgVarZza = zzfkg.zza(context);
            VersionInfoParcel versionInfoParcelZzb = zzfkgVarZza.zzb(ModuleDescriptor.MODULE_VERSION, false, i3);
            zzfkgVarZza.zzc(zzbttVar);
            zzcoa zzcoaVar = new zzcoa(null);
            zzcmb zzcmbVar = new zzcmb();
            zzcmbVar.zza(versionInfoParcelZzb);
            zzcmbVar.zzb(context);
            zzcmbVar.zzc(jCurrentTimeMillis);
            zzcoaVar.zza(new zzcmc(zzcmbVar, null));
            zzcoaVar.zzb(new zzcox(zzcnlVar));
            zzcma zzcmaVarZzc = zzcoaVar.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpk)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zze().zza(zzfmk.zzc(), zzcmaVarZzc.zzD(), context);
                com.google.android.gms.ads.internal.zzt.zze().zzb();
            }
            ((zzecp) ((zzcnp) zzcmaVarZzc).zzo.zzb()).zza();
            ((zzclt) ((zzcnp) zzcmaVarZzc).zzn.zzb()).zza(context, versionInfoParcelZzb);
            com.google.android.gms.ads.internal.zzt.zzh().zze(context, versionInfoParcelZzb, zzcmaVarZzc.zzD());
            com.google.android.gms.ads.internal.zzt.zzj().zza(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzc(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzd(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzg().zza(context);
            com.google.android.gms.ads.internal.zzt.zzA().zza(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpG)).booleanValue()) {
                String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpH);
                if (!str.isEmpty()) {
                    if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                        zzcmaVarZzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                    }
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpF)).booleanValue()) {
                    zzcmaVarZzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                }
            }
            ((com.google.android.gms.ads.internal.util.zzbz) ((zzcnp) zzcmaVarZzc).zzau.zzb()).zza();
            zzccr.zzb(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhf)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbe)).booleanValue()) {
                    new zzeii(context, versionInfoParcelZzb, new zzbgd(new zzbgi(context)), new zzehn(new zzehj(context), (zzgzy) ((zzcnp) zzcmaVarZzc).zzd.zzb())).zza(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpz)).booleanValue()) {
                zzcmaVarZzc.zzg().zza();
            }
            zza = zzcmaVarZzc;
            return zzcmaVarZzc;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static zzcma zza(Context context, zzbtt zzbttVar, int i2) {
        return zzH(context, zzbttVar, ModuleDescriptor.MODULE_VERSION, false, i2, new zzcnl());
    }

    @Override // com.google.android.gms.internal.ads.zzcqi
    public final zzfbz zzy(zzbzu zzbzuVar, int i2) {
        return zzz(new zzfdc(zzbzuVar, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzcqi
    public final zzcdk zzF() {
        return zzG();
    }
}
