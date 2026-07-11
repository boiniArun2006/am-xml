package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzvt implements zzye {
    private final zzye zza;
    private final zzguf zzb;

    public final zzguf zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzg(long j2) {
        this.zza.zzg(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final long zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final long zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final boolean zzm(zzll zzllVar) {
        return this.zza.zzm(zzllVar);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final boolean zzn() {
        return this.zza.zzn();
    }

    public zzvt(zzye zzyeVar, List list) {
        this.zza = zzyeVar;
        this.zzb = zzguf.zzq(list);
    }
}
