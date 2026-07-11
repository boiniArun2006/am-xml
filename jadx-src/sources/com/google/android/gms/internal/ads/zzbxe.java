package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzbxe extends zzbly {
    final /* synthetic */ zzbxf zza;

    @Override // com.google.android.gms.internal.ads.zzblz
    public final void zze(zzblm zzblmVar) {
        zzbxf zzbxfVar = this.zza;
        zzbxfVar.zzd().onCustomFormatAdLoaded(zzbxfVar.zzc(zzblmVar));
    }

    /* synthetic */ zzbxe(zzbxf zzbxfVar, byte[] bArr) {
        Objects.requireNonNull(zzbxfVar);
        this.zza = zzbxfVar;
    }
}
