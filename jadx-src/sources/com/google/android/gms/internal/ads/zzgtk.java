package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzgtk extends zzgsw {
    final /* synthetic */ zzgtm zza;
    private final Object zzb;
    private int zzc;

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    private final void zza() {
        int i2 = this.zzc;
        if (i2 != -1) {
            zzgtm zzgtmVar = this.zza;
            if (i2 < zzgtmVar.size() && Objects.equals(this.zzb, zzgtmVar.zzo(this.zzc))) {
                return;
            }
        }
        this.zzc = this.zza.zzi(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object getValue() {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        if (mapZzc != null) {
            return mapZzc.get(this.zzb);
        }
        zza();
        int i2 = this.zzc;
        if (i2 == -1) {
            return null;
        }
        return zzgtmVar.zzp(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgsw, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgtm zzgtmVar = this.zza;
        Map mapZzc = zzgtmVar.zzc();
        if (mapZzc != null) {
            return mapZzc.put(this.zzb, obj);
        }
        zza();
        int i2 = this.zzc;
        if (i2 == -1) {
            zzgtmVar.put(this.zzb, obj);
            return null;
        }
        Object objZzp = zzgtmVar.zzp(i2);
        zzgtmVar.zzq(this.zzc, obj);
        return objZzp;
    }

    zzgtk(zzgtm zzgtmVar, int i2) {
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
        this.zzb = zzgtmVar.zzo(i2);
        this.zzc = i2;
    }
}
