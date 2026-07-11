package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzrf implements zzre {
    public static final zzkl zza;
    public static final zzkl zzb;

    static {
        zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zza = zzkfVarZzb.zzd("measurement.tcf.consent_fix", false);
        zzkfVarZzb.zzd("measurement.tcf.client", true);
        zzb = zzkfVarZzb.zzd("measurement.tcf.empty_pref_fix", true);
        zzkfVarZzb.zzc("measurement.id.tcf", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzre
    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzre
    public final boolean zzb() {
        return ((Boolean) zzb.zzd()).booleanValue();
    }
}
