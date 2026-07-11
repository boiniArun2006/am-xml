package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzpp implements zzpo {
    public static final zzkl zza;
    public static final zzkl zzb;

    @Override // com.google.android.gms.internal.measurement.zzpo
    public final boolean zza() {
        return true;
    }

    static {
        zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zzkfVarZzb.zzd("measurement.collection.event_safelist", true);
        zza = zzkfVarZzb.zzd("measurement.service.store_null_safelist", true);
        zzb = zzkfVarZzb.zzd("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpo
    public final boolean zzb() {
        return ((Boolean) zza.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpo
    public final boolean zzc() {
        return ((Boolean) zzb.zzd()).booleanValue();
    }
}
