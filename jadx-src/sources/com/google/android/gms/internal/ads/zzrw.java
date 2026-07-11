package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzrw implements zzsj {
    final /* synthetic */ zzsd zza;

    @Override // com.google.android.gms.internal.ads.zzsj
    public final void zzb(final long j2) {
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzrv
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                ((zzqa) obj).zza(j2);
            }
        };
        zzed zzedVarZzs = this.zza.zzs();
        zzedVarZzs.zzd(-1, zzdyVar);
        zzedVarZzs.zze();
    }

    /* synthetic */ zzrw(zzsd zzsdVar, byte[] bArr) {
        Objects.requireNonNull(zzsdVar);
        this.zza = zzsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsj
    public final void zza(long j2) {
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 41);
        sb.append("Ignoring impossibly large audio latency: ");
        sb.append(j2);
        zzee.zzc("AudioTrackAudioOutput", sb.toString());
    }
}
