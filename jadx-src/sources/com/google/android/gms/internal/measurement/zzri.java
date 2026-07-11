package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzri implements zzrh {
    public static final zzkl zza = new zzkf(zzka.zza("com.google.android.gms.measurement")).zza().zzb().zzd("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zzrh
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzrh
    public final boolean zzb() {
        return ((Boolean) zza.zzd()).booleanValue();
    }
}
