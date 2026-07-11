package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzgr extends zzgu {
    private final int zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.fido.zzgu
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final byte zza(int i2) {
        int i3 = this.zzd;
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return this.zza[this.zzc + i2];
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    final byte zzb(int i2) {
        return this.zza[this.zzc + i2];
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    protected final void zze(byte[] bArr, int i2, int i3, int i5) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i5);
    }

    zzgr(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzgx.zzj(i2, i2 + i3, bArr.length);
        this.zzc = i2;
        this.zzd = i3;
    }
}
