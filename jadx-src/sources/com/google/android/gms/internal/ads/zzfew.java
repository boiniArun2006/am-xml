package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzfew implements zzese {
    final /* synthetic */ zzfez zza;

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        zzfez zzfezVar = this.zza;
        synchronized (zzfezVar) {
            zzfezVar.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzctr zzctrVar = (zzctr) obj;
        zzfez zzfezVar = this.zza;
        synchronized (zzfezVar) {
            try {
                zzctr zzctrVar2 = zzfezVar.zza;
                if (zzctrVar2 != null) {
                    zzctrVar2.zzd();
                }
                zzfezVar.zza = zzctrVar;
                zzctrVar.zza(zzfezVar);
                zzfezVar.zzN().zzs(new zzcts(zzctrVar, zzfezVar, zzfezVar.zzN(), zzfezVar.zzO()));
                zzctrVar.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    zzfew(zzfez zzfezVar) {
        Objects.requireNonNull(zzfezVar);
        this.zza = zzfezVar;
    }
}
