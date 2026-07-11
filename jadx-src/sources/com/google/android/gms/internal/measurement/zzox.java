package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzox implements zzow {
    public static final zzkl zza;

    static {
        zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zza = zzkfVarZzb.zzd("measurement.service.ad_impression.convert_value_to_double", true);
        zzkfVarZzb.zzd("measurement.service.separate_public_internal_event_blacklisting", true);
        zzkfVarZzb.zzd("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzow
    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }
}
