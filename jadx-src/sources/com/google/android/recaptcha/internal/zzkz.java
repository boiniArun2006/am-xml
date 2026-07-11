package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzkz extends zzlc {
    private final int zzc;

    @Override // com.google.android.recaptcha.internal.zzlc
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zza(int i2) {
        int i3 = this.zzc;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return ((zzlc) this).zza[i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    final byte zzb(int i2) {
        return ((zzlc) this).zza[i2];
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    protected final void zze(byte[] bArr, int i2, int i3, int i5) {
        System.arraycopy(((zzlc) this).zza, 0, bArr, 0, i5);
    }

    zzkz(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzle.zzi(0, i3, bArr.length);
        this.zzc = i3;
    }
}
