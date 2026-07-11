package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzerz implements zzese {
    final /* synthetic */ zzesa zza;

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcwf zzcwfVar = (zzcwf) obj;
        zzesa zzesaVar = this.zza;
        synchronized (zzesaVar) {
            zzesaVar.zze(zzcwfVar.zzn());
            zzcwfVar.zzj();
        }
    }

    zzerz(zzesa zzesaVar) {
        Objects.requireNonNull(zzesaVar);
        this.zza = zzesaVar;
    }
}
