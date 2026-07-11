package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzpc {
    final String zza;
    long zzb;

    /* synthetic */ zzpc(zzpf zzpfVar, String str, byte[] bArr) {
        this(zzpfVar, str);
    }

    private zzpc(zzpf zzpfVar, String str) {
        Objects.requireNonNull(zzpfVar);
        this.zza = str;
        this.zzb = zzpfVar.zzaZ().elapsedRealtime();
    }

    /* synthetic */ zzpc(zzpf zzpfVar, byte[] bArr) {
        this(zzpfVar, zzpfVar.zzt().zzaw());
    }
}
