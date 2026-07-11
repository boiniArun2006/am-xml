package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzqh implements zzqg {
    public static final zzkl zza;

    static {
        zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zzkfVarZzb.zzd("measurement.sdk.collection.enable_extend_user_property_size", true);
        zza = zzkfVarZzb.zzd("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzkfVarZzb.zzc("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqg
    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }
}
