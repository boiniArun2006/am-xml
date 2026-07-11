package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzka extends zzjr {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    private final void zzc() {
        zzjf.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    /* synthetic */ zzka(MessageDigest messageDigest, int i2, zzkb zzkbVar) {
        this.zza = messageDigest;
        this.zzb = i2;
    }

    @Override // com.google.android.recaptcha.internal.zzjr
    protected final void zza(byte[] bArr, int i2, int i3) {
        zzc();
        this.zza.update(bArr, 0, i3);
    }

    @Override // com.google.android.recaptcha.internal.zzjx
    public final zzjv zzb() {
        zzc();
        this.zzc = true;
        int i2 = this.zzb;
        if (i2 == this.zza.getDigestLength()) {
            byte[] bArrDigest = this.zza.digest();
            int i3 = zzjv.zzb;
            return new zzju(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.zza.digest(), i2);
        int i5 = zzjv.zzb;
        return new zzju(bArrCopyOf);
    }
}
