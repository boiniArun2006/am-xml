package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzsz implements zzrg {
    final /* synthetic */ zzta zza;

    @Override // com.google.android.gms.internal.ads.zzrg
    public final void zza(Exception exc) {
        zzee.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaw().zzi(exc);
    }

    /* synthetic */ zzsz(zzta zztaVar, byte[] bArr) {
        Objects.requireNonNull(zztaVar);
        this.zza = zztaVar;
    }
}
