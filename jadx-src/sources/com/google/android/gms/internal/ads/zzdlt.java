package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface zzdlt extends zzdal {
    @Override // com.google.android.gms.internal.ads.zzdal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    zzdlu zzh();

    zzdlt zzb(@Nullable zzffr zzffrVar);

    zzdlt zzc(@Nullable zzfgn zzfgnVar);

    zzdlt zzd(zzepw zzepwVar);

    zzdlt zze(zzdao zzdaoVar);

    zzdlt zzf(zzdhf zzdhfVar);

    @Override // com.google.android.gms.internal.ads.zzdal
    /* bridge */ /* synthetic */ default zzdal zzi(@Nullable zzffr zzffrVar) {
        zzb(zzffrVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdal
    /* bridge */ /* synthetic */ default zzdal zzj(@Nullable zzfgn zzfgnVar) {
        zzc(zzfgnVar);
        return this;
    }
}
