package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class zzefc implements zzefe {
    private final Map zza;
    private final zzgzy zzb;
    private final zzdej zzc;

    public zzefc(Map map, zzgzy zzgzyVar, zzdej zzdejVar) {
        this.zza = map;
        this.zzb = zzgzyVar;
        this.zzc = zzdejVar;
    }

    final /* synthetic */ zzdej zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzefe
    public final com.google.common.util.concurrent.Xo zza(final zzbzu zzbzuVar) {
        this.zzc.zzdO(zzbzuVar);
        com.google.common.util.concurrent.Xo xoZzc = zzgzo.zzc(new zzecr(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjz)).split(",")) {
            final zzikv zzikvVar = (zzikv) this.zza.get(str.trim());
            if (zzikvVar != null) {
                xoZzc = zzgzo.zzh(xoZzc, zzecr.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzefb
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ com.google.common.util.concurrent.Xo zza(Object obj) {
                        return ((zzefe) zzikvVar.zzb()).zza(zzbzuVar);
                    }
                }, this.zzb);
            }
        }
        zzgzo.zzr(xoZzc, new zzefa(this), zzcei.zzg);
        return xoZzc;
    }
}
