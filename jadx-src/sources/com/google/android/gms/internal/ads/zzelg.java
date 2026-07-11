package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzelg implements zzekg {
    private final zzcvc zza;
    private final Context zzb;
    private final zzduv zzc;
    private final zzfjk zzd;
    private final Executor zze;
    private final zzgqt zzf;
    private final zzdxt zzg;

    public zzelg(zzcvc zzcvcVar, Context context, Executor executor, zzduv zzduvVar, zzfjk zzfjkVar, zzgqt zzgqtVar, zzdxt zzdxtVar) {
        this.zzb = context;
        this.zza = zzcvcVar;
        this.zze = executor;
        this.zzc = zzduvVar;
        this.zzd = zzfjkVar;
        this.zzf = zzgqtVar;
        this.zzg = zzdxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final com.google.common.util.concurrent.Xo zzb(final zzfjc zzfjcVar, final zzfir zzfirVar) {
        return zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzelf
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzc(zzfjcVar, zzfirVar, obj);
            }
        }, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zza == null) ? false : true;
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzc(zzfjc zzfjcVar, zzfir zzfirVar, Object obj) throws zzcka {
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVarZza = zzfjq.zza(context, zzfirVar.zzu);
        final zzcjl zzcjlVarZza = this.zzc.zza(zzrVarZza, zzfirVar, zzfjcVar.zzb.zzb);
        zzcjlVarZza.zzaw(zzfirVar.zzW);
        View viewZza = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjd)).booleanValue() && zzfirVar.zzag) ? zzcvr.zza(context, zzcjlVarZza.zzE(), zzfirVar) : new zzduy(context, zzcjlVarZza.zzE(), (com.google.android.gms.ads.internal.util.zzat) this.zzf.apply(zzfirVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcvc zzcvcVar = this.zza;
        final zzcty zzctyVarZzf = zzcvcVar.zzf(new zzcwv(zzfjcVar, zzfirVar, null), new zzcue(viewZza, zzcjlVarZza, new zzcwd() { // from class: com.google.android.gms.internal.ads.zzelb
            @Override // com.google.android.gms.internal.ads.zzcwd
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() {
                return zzcjlVarZza.zzh();
            }
        }, zzfjq.zzb(zzrVarZza)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
            this.zzg.zze().putLong(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzduu zzduuVarZzj = zzctyVarZzf.zzj();
        zzdxt zzdxtVar = this.zzg;
        zzduuVarZzj.zzi(zzcjlVarZza, false, null, zzdxtVar.zze());
        zzdbx zzdbxVarZzd = zzctyVarZzf.zzd();
        zzdbz zzdbzVar = new zzdbz() { // from class: com.google.android.gms.internal.ads.zzelc
            @Override // com.google.android.gms.internal.ads.zzdbz
            public final /* synthetic */ void zzdr() {
                zzcjl zzcjlVar = zzcjlVarZza;
                if (zzcjlVar.zzP() != null) {
                    zzcjlVar.zzP().zzq();
                }
            }
        };
        zzgzy zzgzyVar = zzcei.zzg;
        zzdbxVarZzd.zzq(zzdbzVar, zzgzyVar);
        zzfiw zzfiwVar = zzfirVar.zzs;
        String strZza = zzfiwVar.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && zzctyVarZzf.zzm().zza(true)) {
            strZza = zzclc.zza(strZza, zzclc.zzb(zzfirVar));
        }
        zzctyVarZzf.zzj();
        com.google.common.util.concurrent.Xo xoZzj = zzduu.zzj(zzcjlVarZza, zzfiwVar.zzb, strZza, zzdxtVar.zze(), zzcvcVar.zze());
        if (zzfirVar.zzM) {
            xoZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzela
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcjlVarZza.zzav();
                }
            }, this.zze);
        }
        xoZzj.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeld
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(zzcjlVarZza);
            }
        }, this.zze);
        return zzgzo.zzk(xoZzj, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzele
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj2) {
                return zzctyVarZzf.zzi();
            }
        }, zzgzyVar);
    }

    final /* synthetic */ void zzd(zzcjl zzcjlVar) {
        zzcjlVar.zzJ();
        zzfjk zzfjkVar = this.zzd;
        zzckr zzckrVarZzh = zzcjlVar.zzh();
        com.google.android.gms.ads.internal.client.zzga zzgaVar = zzfjkVar.zza;
        if (zzgaVar != null && zzckrVarZzh != null) {
            zzckrVarZzh.zzc(zzgaVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbP)).booleanValue() && !zzcjlVar.isAttachedToWindow()) {
            zzcjlVar.onPause();
            zzcjlVar.zzaG(true);
        }
    }
}
