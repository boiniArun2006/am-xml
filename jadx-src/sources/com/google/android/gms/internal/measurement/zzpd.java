package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzpd implements zzpc {
    public static final zzkl zza;

    static {
        zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zzkfVarZzb.zzd("measurement.client.3p_consent_state_v1", true);
        zza = zzkfVarZzb.zzc("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpc
    public final long zza() {
        return ((Long) zza.zzd()).longValue();
    }
}
