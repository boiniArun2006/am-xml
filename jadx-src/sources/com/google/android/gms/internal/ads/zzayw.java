package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzayw implements zzfwf {
    final /* synthetic */ zzfvh zza;

    zzayw(zzfvh zzfvhVar) {
        this.zza = zzfvhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zza(int i2, long j2) {
        this.zza.zzb(i2, System.currentTimeMillis() - j2);
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zzb(int i2, long j2, String str) {
        this.zza.zzf(i2, System.currentTimeMillis() - j2, str);
    }
}
