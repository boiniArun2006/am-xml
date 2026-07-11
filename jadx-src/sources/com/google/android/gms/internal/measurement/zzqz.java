package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzqz implements zzqy {
    public static final zzkl zza;

    static {
        zzkf zzkfVarZzb = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb();
        zza = zzkfVarZzb.zzd("measurement.client.sessions.enable_fix_background_engagement", false);
        zzkfVarZzb.zzd("measurement.client.sessions.enable_pause_engagement_in_background", true);
        zzkfVarZzb.zzc("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqy
    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }
}
