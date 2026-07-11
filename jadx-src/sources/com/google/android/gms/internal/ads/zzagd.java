package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RestrictTo
public final class zzagd extends zzafi {
    private final long zza;

    @Override // com.google.android.gms.internal.ads.zzafi, com.google.android.gms.internal.ads.zzaev
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafi, com.google.android.gms.internal.ads.zzaev
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafi, com.google.android.gms.internal.ads.zzaev
    public final long zzo() {
        return super.zzo() - this.zza;
    }

    public zzagd(zzaev zzaevVar, long j2) {
        boolean z2;
        super(zzaevVar);
        if (zzaevVar.zzn() >= j2) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzgrc.zza(z2);
        this.zza = j2;
    }
}
