package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzeot implements zzekg {
    private final Context zza;
    private final zzduv zzb;
    private final zzdue zzc;
    private final zzfjk zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbok zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkp)).booleanValue();
    private final zzejf zzi;
    private final zzdxt zzj;
    private final zzdxz zzk;

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final com.google.common.util.concurrent.Xo zzb(final zzfjc zzfjcVar, final zzfir zzfirVar) {
        final zzduz zzduzVar = new zzduz();
        com.google.common.util.concurrent.Xo xoZza = zzgzo.zza(null);
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeos
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzc(zzfirVar, zzfjcVar, zzduzVar, obj);
            }
        };
        Executor executor = this.zze;
        com.google.common.util.concurrent.Xo xoZzj = zzgzo.zzj(xoZza, zzgywVar, executor);
        xoZzj.addListener(new Runnable(zzduzVar) { // from class: com.google.android.gms.internal.ads.zzeom
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
            }
        }, executor);
        return xoZzj;
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzc(final zzfir zzfirVar, zzfjc zzfjcVar, zzduz zzduzVar, Object obj) throws zzcka {
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzduv zzduvVar = this.zzb;
        zzfjk zzfjkVar = this.zzd;
        final zzcjl zzcjlVarZza = zzduvVar.zza(zzfjkVar.zzf, zzfirVar, zzfjcVar.zzb.zzb);
        zzcjlVarZza.zzaw(zzfirVar.zzW);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzj.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcen zzcenVar = new zzcen();
        zzdue zzdueVar = this.zzc;
        zzcwv zzcwvVar = new zzcwv(zzfjcVar, zzfirVar, null);
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzf;
        zzbok zzbokVar = this.zzg;
        boolean z2 = this.zzh;
        zzejf zzejfVar = this.zzi;
        zzdxt zzdxtVar = this.zzj;
        final zzdua zzduaVarZzf = zzdueVar.zzf(zzcwvVar, new zzdub(new zzeop(context, zzduvVar, zzfjkVar, versionInfoParcel, zzfirVar, zzcenVar, zzcjlVarZza, zzbokVar, z2, zzejfVar, zzdxtVar, this.zzk), zzcjlVarZza));
        zzcenVar.zzc(zzduaVarZzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            zzdxtVar.zze().putLong(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzbpa.zzb(zzcjlVarZza, zzduaVarZzf.zzk());
        zzduaVarZzf.zzd().zzq(new zzdbz() { // from class: com.google.android.gms.internal.ads.zzeoq
            @Override // com.google.android.gms.internal.ads.zzdbz
            public final /* synthetic */ void zzdr() {
                zzcjl zzcjlVar = zzcjlVarZza;
                if (zzcjlVar.zzP() != null) {
                    zzcjlVar.zzP().zzq();
                }
            }
        }, zzcei.zzg);
        zzduaVarZzf.zzl().zzi(zzcjlVarZza, true, true != z2 ? null : zzbokVar, zzdxtVar.zze());
        zzfiw zzfiwVar = zzfirVar.zzs;
        String strZza = zzfiwVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && zzduaVarZzf.zzo().zza(true)) {
            strZza = zzclc.zza(strZza, zzclc.zzb(zzfirVar));
        }
        zzduaVarZzf.zzl();
        return zzgzo.zzk(zzduu.zzj(zzcjlVarZza, zzfiwVar.zzb, strZza, zzdxtVar.zze(), zzdueVar.zzd()), new zzgqt(this) { // from class: com.google.android.gms.internal.ads.zzeor
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj2) {
                zzcjl zzcjlVar = zzcjlVarZza;
                if (zzfirVar.zzM) {
                    zzcjlVar.zzav();
                }
                zzdua zzduaVar = zzduaVarZzf;
                zzcjlVar.zzJ();
                zzcjlVar.onPause();
                return zzduaVar.zzh();
            }
        }, this.zze);
    }

    public zzeot(Context context, VersionInfoParcel versionInfoParcel, zzfjk zzfjkVar, Executor executor, zzdue zzdueVar, zzduv zzduvVar, zzbok zzbokVar, zzejf zzejfVar, zzdxt zzdxtVar, zzdxz zzdxzVar) {
        this.zza = context;
        this.zzd = zzfjkVar;
        this.zzc = zzdueVar;
        this.zze = executor;
        this.zzf = versionInfoParcel;
        this.zzb = zzduvVar;
        this.zzg = zzbokVar;
        this.zzi = zzejfVar;
        this.zzj = zzdxtVar;
        this.zzk = zzdxzVar;
    }
}
