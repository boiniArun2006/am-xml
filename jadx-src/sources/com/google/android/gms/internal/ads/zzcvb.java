package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public interface zzcvb extends zzdal {
    @Override // com.google.android.gms.internal.ads.zzdal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    zzcvc zzh();

    zzcvb zzb(@Nullable zzffr zzffrVar);

    zzcvb zzc(@Nullable zzfgn zzfgnVar);

    zzcvb zzd(zzdml zzdmlVar);

    zzcvb zze(zzctu zzctuVar);

    zzcvb zzf(zzeoa zzeoaVar);

    zzcvb zzg(zzcvx zzcvxVar);

    zzcvb zzk(zzepw zzepwVar);

    zzcvb zzl(zzdao zzdaoVar);

    zzcvb zzm(zzdhf zzdhfVar);

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
