package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzow implements zzgv {
    final /* synthetic */ String zza;
    final /* synthetic */ zzpi zzb;
    final /* synthetic */ zzpf zzc;

    zzow(zzpf zzpfVar, String str, zzpi zzpiVar) {
        this.zza = str;
        this.zzb = zzpiVar;
        Objects.requireNonNull(zzpfVar);
        this.zzc = zzpfVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgv
    public final void zza(String str, int i2, Throwable th, byte[] bArr, Map map) {
        this.zzc.zzQ(this.zza, i2, th, bArr, this.zzb);
    }
}
