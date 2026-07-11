package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfwf;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzh implements zzfwf {
    final /* synthetic */ zzk zza;

    zzh(zzk zzkVar) {
        Objects.requireNonNull(zzkVar);
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zza(int i2, long j2) {
        this.zza.zzo().zzb(i2, System.currentTimeMillis() - j2);
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final void zzb(int i2, long j2, String str) {
        this.zza.zzo().zzf(i2, System.currentTimeMillis() - j2, str);
    }
}
