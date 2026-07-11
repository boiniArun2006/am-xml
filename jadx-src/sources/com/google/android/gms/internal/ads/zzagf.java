package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RestrictTo
public final class zzagf implements zzaex {
    private final long zzb;
    private final zzaex zzc;

    public zzagf(long j2, zzaex zzaexVar) {
        this.zzb = j2;
        this.zzc = zzaexVar;
    }

    final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final zzagh zzu(int i2, int i3) {
        return this.zzc.zzu(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final void zzw(zzafy zzafyVar) {
        this.zzc.zzw(new zzage(this, zzafyVar, zzafyVar));
    }
}
