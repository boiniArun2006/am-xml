package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzbxd extends zzblv {
    final /* synthetic */ zzbxf zza;

    @Override // com.google.android.gms.internal.ads.zzblw
    public final void zze(zzblm zzblmVar, String str) {
        zzbxf zzbxfVar = this.zza;
        if (zzbxfVar.zze() == null) {
            return;
        }
        zzbxfVar.zze().onCustomClick(zzbxfVar.zzc(zzblmVar), str);
    }

    /* synthetic */ zzbxd(zzbxf zzbxfVar, byte[] bArr) {
        Objects.requireNonNull(zzbxfVar);
        this.zza = zzbxfVar;
    }
}
