package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzfjv {
    public static zzboh zza(final zzeiu zzeiuVar, final zzfqk zzfqkVar, final zzcrv zzcrvVar, final zzdjm zzdjmVar) {
        return new zzboh() { // from class: com.google.android.gms.internal.ads.zzfju
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcjl zzcjlVar = (zzcjl) obj;
                zzbog.zzc(map, zzdjmVar);
                String str = (String) map.get("u");
                if (str == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                } else {
                    zzeiu zzeiuVar2 = zzeiuVar;
                    zzfqk zzfqkVar2 = zzfqkVar;
                    zzgzo.zzr(zzbog.zza(zzcjlVar, str), new zzfjs(zzcjlVar, zzcrvVar, zzfqkVar2, zzeiuVar2), zzcei.zza);
                }
            }
        };
    }

    public static zzboh zzb(final zzeiu zzeiuVar, final zzfqk zzfqkVar) {
        return new zzboh() { // from class: com.google.android.gms.internal.ads.zzfjt
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcjc zzcjcVar = (zzcjc) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
                    return;
                }
                zzfir zzfirVarZzC = zzcjcVar.zzC();
                if (zzfirVarZzC != null && !zzfirVarZzC.zzai) {
                    zzfqkVar.zzb(str, zzfirVarZzC.zzax, null, null);
                    return;
                }
                zzfiu zzfiuVarZzaC = ((zzcks) zzcjcVar).zzaC();
                if (zzfiuVarZzaC != null) {
                    zzeiuVar.zze(new zzeiw(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), zzfiuVarZzaC.zzb, str, 2));
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                }
            }
        };
    }
}
