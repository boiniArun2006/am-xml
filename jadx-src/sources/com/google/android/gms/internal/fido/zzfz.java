package com.google.android.gms.internal.fido;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzfz extends zzfp {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    private final void zzd() {
        zzbm.zzf(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    /* synthetic */ zzfz(MessageDigest messageDigest, int i2, zzfy zzfyVar) {
        this.zza = messageDigest;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.fido.zzfp
    protected final void zzb(byte[] bArr, int i2, int i3) {
        zzd();
        this.zza.update(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.fido.zzfv
    public final zzft zzc() {
        zzd();
        this.zzc = true;
        int i2 = this.zzb;
        if (i2 == this.zza.getDigestLength()) {
            byte[] bArrDigest = this.zza.digest();
            int i3 = zzft.zzb;
            return new zzfs(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.zza.digest(), i2);
        int i5 = zzft.zzb;
        return new zzfs(bArrCopyOf);
    }
}
