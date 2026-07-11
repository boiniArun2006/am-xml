package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class zzerw implements zzese {
    final /* synthetic */ zzerx zza;

    @Override // com.google.android.gms.internal.ads.zzese
    public final void zza() {
        zzerx zzerxVar = this.zza;
        synchronized (zzerxVar) {
            zzerxVar.zzM(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzese
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzerx zzerxVar = this.zza;
        zzdkn zzdknVar = (zzdkn) obj;
        synchronized (zzerxVar) {
            zzerxVar.zzM(zzdknVar);
            zzerxVar.zzL().zzj();
        }
    }

    zzerw(zzerx zzerxVar) {
        Objects.requireNonNull(zzerxVar);
        this.zza = zzerxVar;
    }
}
