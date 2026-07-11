package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzagr implements zzafy {
    final /* synthetic */ zzagt zza;
    private final long zzb;

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j2) {
        zzagt zzagtVar = this.zza;
        zzafw zzafwVarZzg = zzagtVar.zzh()[0].zzg(j2);
        for (int i2 = 1; i2 < zzagtVar.zzh().length; i2++) {
            zzafw zzafwVarZzg2 = zzagtVar.zzh()[i2].zzg(j2);
            if (zzafwVarZzg2.zza.zzc < zzafwVarZzg.zza.zzc) {
                zzafwVarZzg = zzafwVarZzg2;
            }
        }
        return zzafwVarZzg;
    }

    public zzagr(zzagt zzagtVar, long j2) {
        Objects.requireNonNull(zzagtVar);
        this.zza = zzagtVar;
        this.zzb = j2;
    }
}
