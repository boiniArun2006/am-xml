package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzdmj implements zzcwi {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzikv zzd;
    private final zzdor zze;

    zzdmj(Map map, Map map2, Map map3, zzikv zzikvVar, zzdor zzdorVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzikvVar;
        this.zze = zzdorVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    @Nullable
    public final zzekg zza(int i2, String str) {
        zzekg zzekgVarZza;
        zzekg zzekgVar = (zzekg) this.zza.get(str);
        if (zzekgVar != null) {
            return zzekgVar;
        }
        if (i2 != 1) {
            if (i2 != 4) {
                return null;
            }
            zzemm zzemmVar = (zzemm) this.zzc.get(str);
            if (zzemmVar != null) {
                return zzcwn.zza(zzemmVar);
            }
            zzekgVarZza = (zzekg) this.zzb.get(str);
            if (zzekgVarZza == null) {
                return null;
            }
        } else if (this.zze.zzd() == null || (zzekgVarZza = ((zzcwi) this.zzd.zzb()).zza(i2, str)) == null) {
            return null;
        }
        return zzcwn.zzb(zzekgVarZza);
    }
}
