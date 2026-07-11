package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzps implements zzpr {
    public static final zzkl zza;
    public static final zzkl zzb;
    public static final zzkl zzc;

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zza() {
        return true;
    }

    static {
        zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zzkfVarZzb.zzd("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        zza = zzkfVarZzb.zzd("measurement.audience.refresh_event_count_filters_timestamp", false);
        zzb = zzkfVarZzb.zzd("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        zzc = zzkfVarZzb.zzd("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzb() {
        return ((Boolean) zza.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzc() {
        return ((Boolean) zzb.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzd() {
        return ((Boolean) zzc.zzd()).booleanValue();
    }
}
