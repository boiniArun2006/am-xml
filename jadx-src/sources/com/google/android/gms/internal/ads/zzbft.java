package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzbft extends zzcen {
    final /* synthetic */ zzbfz zza;

    @Override // com.google.android.gms.internal.ads.zzcen, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        this.zza.zzb();
        return super.cancel(z2);
    }

    zzbft(zzbfz zzbfzVar) {
        Objects.requireNonNull(zzbfzVar);
        this.zza = zzbfzVar;
    }
}
