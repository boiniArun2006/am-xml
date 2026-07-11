package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcyf implements com.google.android.gms.ads.internal.client.zza {
    private final zzcyj zza;
    private final zzfjk zzb;

    zzcyf(zzcyj zzcyjVar, zzfjk zzfjkVar) {
        this.zza = zzcyjVar;
        this.zzb = zzfjkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zza.zza(this.zzb.zzg);
    }
}
