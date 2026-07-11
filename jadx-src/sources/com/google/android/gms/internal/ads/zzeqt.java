package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzeqt implements zzese {
    final /* synthetic */ zzequ zza;

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        zzequ zzequVar = this.zza;
        synchronized (zzequVar) {
            zzequVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzequ zzequVar = this.zza;
        zzctx zzctxVar = (zzctx) obj;
        synchronized (zzequVar) {
            try {
                if (zzequVar.zzM() != null) {
                    if (zzctxVar.zzo() != null && zzequVar.zzM().zzo() != null) {
                        zzctxVar.zzo().zzb(zzequVar.zzM().zzo().zza());
                    }
                    zzequVar.zzM().zzd();
                }
                zzequVar.zzN(zzctxVar);
                zzequVar.zzM().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    zzeqt(zzequ zzequVar) {
        Objects.requireNonNull(zzequVar);
        this.zza = zzequVar;
    }
}
