package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzpg implements zzpf {
    public static final zzkl zza;
    public static final zzkl zzb;

    static {
        zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zzkfVarZzb.zzd("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        zzkfVarZzb.zzd("measurement.set_default_event_parameters_with_backfill.service", true);
        zzkfVarZzb.zzc("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        zza = zzkfVarZzb.zzd("measurement.set_default_event_parameters.fix_app_update_logging", true);
        zzb = zzkfVarZzb.zzd("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        zzkfVarZzb.zzd("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final boolean zzb() {
        return ((Boolean) zzb.zzd()).booleanValue();
    }
}
