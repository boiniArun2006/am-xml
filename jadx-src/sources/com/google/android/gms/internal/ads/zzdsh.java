package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdsh {
    private final zzfjk zza;
    private final Executor zzb;
    private final zzduv zzc;
    private final zzdtq zzd;
    private final Context zze;
    private final zzdxz zzf;
    private final zzfqk zzg;
    private final zzeiu zzh;
    private final zzdxt zzi;
    private final zzdzc zzj;

    public zzdsh(zzfjk zzfjkVar, Executor executor, zzduv zzduvVar, Context context, zzdxz zzdxzVar, zzfqk zzfqkVar, zzeiu zzeiuVar, zzdtq zzdtqVar, zzdxt zzdxtVar, zzdzc zzdzcVar) {
        this.zza = zzfjkVar;
        this.zzb = executor;
        this.zzc = zzduvVar;
        this.zze = context;
        this.zzf = zzdxzVar;
        this.zzg = zzfqkVar;
        this.zzh = zzeiuVar;
        this.zzd = zzdtqVar;
        this.zzi = zzdxtVar;
        this.zzj = zzdzcVar;
    }

    private final void zzh(zzcjl zzcjlVar, zzcem zzcemVar) {
        com.google.android.gms.ads.internal.client.zzga zzgaVar = this.zza.zza;
        if (zzgaVar != null && zzcjlVar.zzh() != null) {
            zzcjlVar.zzh().zzc(zzgaVar);
        }
        zzcemVar.zzb();
    }

    private static final void zzj(zzcjl zzcjlVar) {
        zzcjlVar.zzab("/videoClicked", zzbog.zzh);
        zzcjlVar.zzP().zzR(true);
        zzcjlVar.zzab("/getNativeAdViewSignals", zzbog.zzs);
        zzcjlVar.zzab("/getNativeClickMeta", zzbog.zzt);
    }

    public final com.google.common.util.concurrent.Xo zza(final JSONObject jSONObject, @Nullable final com.google.android.gms.ads.internal.zzb zzbVar, @Nullable final zzcce zzcceVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzi.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_VIDEO_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        com.google.common.util.concurrent.Xo xoZza = zzgzo.zza(null);
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdsc
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zze(zzbVar, zzcceVar, obj);
            }
        };
        Executor executor = this.zzb;
        return zzgzo.zzj(zzgzo.zzj(xoZza, zzgywVar, executor), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdsg
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcjl) obj);
            }
        }, executor);
    }

    public final com.google.common.util.concurrent.Xo zzb(final String str, final String str2, final zzfir zzfirVar, final zzfiu zzfiuVar, final com.google.android.gms.ads.internal.client.zzr zzrVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcce zzcceVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzi.zze().putLong(zzdxh.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzgzo.zzj(zzgzo.zza(null), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdsb
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                return this.zza.zzd(zzrVar, zzfirVar, zzfiuVar, zzbVar, zzcceVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzc(JSONObject jSONObject, final zzcjl zzcjlVar) {
        zzbqs zzbqsVar = this.zza.zzb;
        final zzcem zzcemVarZza = zzcem.zza(zzcjlVar);
        if (zzbqsVar != null) {
            zzcjlVar.zzaf(zzclv.zze());
        } else {
            zzcjlVar.zzaf(zzclv.zzd());
        }
        zzcjlVar.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdsf
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z2, int i2, String str, String str2) {
                this.zza.zzg(zzcjlVar, zzcemVarZza, z2, i2, str, str2);
            }
        });
        zzcjlVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcemVarZza;
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zzd(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfir zzfirVar, zzfiu zzfiuVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar, String str, String str2, Object obj) throws zzcka {
        final zzcjl zzcjlVarZza = this.zzc.zza(zzrVar, zzfirVar, zzfiuVar);
        final zzcem zzcemVarZza = zzcem.zza(zzcjlVarZza);
        if (this.zza.zzb != null) {
            zzi(zzcjlVarZza, zzbVar, zzcceVar);
            zzcjlVarZza.zzaf(zzclv.zze());
        } else {
            zzdtn zzdtnVarZza = this.zzd.zza();
            zzclj zzcljVarZzP = zzcjlVarZza.zzP();
            zzbgv zzbgvVar = zzbhe.zzpf;
            zzcljVarZzP.zzab(zzdtnVarZza, zzdtnVarZza, zzdtnVarZza, zzdtnVarZza, zzdtnVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zze, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() ? null : zzcceVar, this.zzh, this.zzg, this.zzf, null, zzdtnVarZza, null, null, null, null, this.zzj, null, null);
            zzj(zzcjlVarZza);
        }
        zzcjlVarZza.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdse
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z2, int i2, String str3, String str4) {
                this.zza.zzf(zzcjlVarZza, zzcemVarZza, z2, i2, str3, str4);
            }
        });
        zzcjlVarZza.zzau(str, str2, null);
        return zzcemVarZza;
    }

    final /* synthetic */ com.google.common.util.concurrent.Xo zze(com.google.android.gms.ads.internal.zzb zzbVar, zzcce zzcceVar, Object obj) throws zzcka {
        zzcjl zzcjlVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        final zzcem zzcemVarZza = zzcem.zza(zzcjlVarZza);
        zzi(zzcjlVarZza, zzbVar, zzcceVar);
        zzcjlVarZza.zzP().zzH(new zzcli() { // from class: com.google.android.gms.internal.ads.zzdsd
            @Override // com.google.android.gms.internal.ads.zzcli
            public final /* synthetic */ void zza() {
                zzcemVarZza.zzb();
            }
        });
        zzcjlVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeF));
        return zzcemVarZza;
    }

    final /* synthetic */ void zzf(zzcjl zzcjlVar, zzcem zzcemVar, boolean z2, int i2, String str, String str2) {
        if (z2) {
            com.google.android.gms.ads.internal.client.zzga zzgaVar = this.zza.zza;
            if (zzgaVar != null && zzcjlVar.zzh() != null) {
                zzcjlVar.zzh().zzc(zzgaVar);
            }
            zzcemVar.zzb();
            return;
        }
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Html video Web View failed to load. Error code: ");
        sb.append(i2);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzcemVar.zzd(new zzenv(1, sb.toString()));
    }

    final /* synthetic */ void zzg(zzcjl zzcjlVar, zzcem zzcemVar, boolean z2, int i2, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeN)).booleanValue()) {
            zzh(zzcjlVar, zzcemVar);
            return;
        }
        if (z2) {
            zzh(zzcjlVar, zzcemVar);
            return;
        }
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Native Video WebView failed to load. Error code: ");
        sb.append(i2);
        sb.append(", Description: ");
        sb.append(str);
        sb.append(", Failing URL: ");
        sb.append(str2);
        zzcemVar.zzd(new zzenv(1, sb.toString()));
    }

    private final void zzi(zzcjl zzcjlVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzcce zzcceVar) {
        zzdzc zzdzcVar;
        com.google.android.gms.ads.internal.zzb zzbVar2;
        zzj(zzcjlVar);
        zzcjlVar.zzab("/video", zzbog.zzl);
        zzcjlVar.zzab("/videoMeta", zzbog.zzm);
        zzcjlVar.zzab("/precache", new zzchs());
        zzcjlVar.zzab("/delayPageLoaded", zzbog.zzp);
        zzcjlVar.zzab("/instrument", zzbog.zzn);
        zzcjlVar.zzab("/log", zzbog.zzg);
        zzcjlVar.zzab("/click", zzbog.zzb(null, null));
        if (this.zza.zzb != null) {
            zzcjlVar.zzP().zzT(true);
            if (true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpf)).booleanValue()) {
                zzbVar2 = null;
            } else {
                zzbVar2 = zzbVar;
            }
            zzcjlVar.zzab("/open", new zzbou(zzbVar2, null, null, null, null, null));
        } else {
            zzcjlVar.zzP().zzT(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcjlVar.getContext())) {
            Map map = new HashMap();
            if (zzcjlVar.zzC() != null) {
                map = zzcjlVar.zzC().zzaw;
            }
            zzcjlVar.zzab("/logScionEvent", new zzbon(zzcjlVar.getContext(), map));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpf)).booleanValue()) {
            zzcjlVar.zzP().zzi(zzbVar);
            zzcjlVar.zzP().zzj(zzcceVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue() && (zzdzcVar = this.zzj) != null) {
            zzcjlVar.zzab("/onDeviceStorageEvent", new zzbop(zzdzcVar));
        }
    }
}
