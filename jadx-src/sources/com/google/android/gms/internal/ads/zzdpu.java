package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzdpu {
    private final zzduv zza;
    private final zzdtk zzb;
    private final zzctc zzc;
    private final zzdop zzd;

    public zzdpu(zzduv zzduvVar, zzdtk zzdtkVar, zzctc zzctcVar, zzdop zzdopVar) {
        this.zza = zzduvVar;
        this.zzb = zzdtkVar;
        this.zzc = zzctcVar;
        this.zzd = zzdopVar;
    }

    public final View zza() throws zzcka {
        zzcjl zzcjlVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zzcjlVarZza.zzE().setVisibility(8);
        zzcjlVarZza.zzab("/sendMessageToSdk", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpt
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcjl) obj, map);
            }
        });
        zzcjlVarZza.zzab("/adMuted", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpo
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc((zzcjl) obj, map);
            }
        });
        WeakReference weakReference = new WeakReference(zzcjlVarZza);
        zzboh zzbohVar = new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpp
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, final Map map) {
                zzcjl zzcjlVar = (zzcjl) obj;
                zzclj zzcljVarZzP = zzcjlVar.zzP();
                final zzdpu zzdpuVar = this.zza;
                zzcljVarZzP.zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdps
                    @Override // com.google.android.gms.internal.ads.zzclh
                    public final /* synthetic */ void zza(boolean z2, int i2, String str, String str2) {
                        zzdpuVar.zzf(map, z2, i2, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcjlVar.loadData(str, "text/html", com.google.android.exoplayer2.C.UTF8_NAME);
                } else {
                    zzcjlVar.loadDataWithBaseURL(str2, str, "text/html", com.google.android.exoplayer2.C.UTF8_NAME, null);
                }
            }
        };
        zzdtk zzdtkVar = this.zzb;
        zzdtkVar.zzh(weakReference, "/loadHtml", zzbohVar);
        zzdtkVar.zzh(new WeakReference(zzcjlVarZza), "/showOverlay", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpq
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzd((zzcjl) obj, map);
            }
        });
        zzdtkVar.zzh(new WeakReference(zzcjlVarZza), "/hideOverlay", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpr
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zze((zzcjl) obj, map);
            }
        });
        return zzcjlVarZza.zzE();
    }

    final /* synthetic */ void zzb(zzcjl zzcjlVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void zzc(zzcjl zzcjlVar, Map map) {
        this.zzd.zzt();
    }

    final /* synthetic */ void zzd(zzcjl zzcjlVar, Map map) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Showing native ads overlay.");
        zzcjlVar.zzE().setVisibility(0);
        this.zzc.zze(true);
    }

    final /* synthetic */ void zze(zzcjl zzcjlVar, Map map) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Hiding native ads overlay.");
        zzcjlVar.zzE().setVisibility(8);
        this.zzc.zze(false);
    }

    final /* synthetic */ void zzf(Map map, boolean z2, int i2, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "htmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", map2);
    }
}
