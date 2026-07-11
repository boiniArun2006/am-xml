package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
abstract class zzias extends zziaw {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    zzias(int i2) {
        super(null);
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i2, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zziaw
    public final int zzb() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void zzc(byte b2) {
        byte[] bArr = this.zza;
        int i2 = this.zzc;
        bArr[i2] = b2;
        this.zzc = i2 + 1;
        this.zzd++;
    }

    final void zzf(int i2) {
        int i3 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >> 8);
        bArr[i3 + 2] = (byte) (i2 >> 16);
        bArr[i3 + 3] = (byte) (i2 >> 24);
        this.zzc = i3 + 4;
        this.zzd += 4;
    }

    final void zzg(long j2) {
        int i2 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i2] = (byte) j2;
        bArr[i2 + 1] = (byte) (j2 >> 8);
        bArr[i2 + 2] = (byte) (j2 >> 16);
        bArr[i2 + 3] = (byte) (j2 >> 24);
        bArr[i2 + 4] = (byte) (j2 >> 32);
        bArr[i2 + 5] = (byte) (j2 >> 40);
        bArr[i2 + 6] = (byte) (j2 >> 48);
        bArr[i2 + 7] = (byte) (j2 >> 56);
        this.zzc = i2 + 8;
        this.zzd += 8;
    }

    final void zzd(int i2) {
        if (zziaw.zza) {
            long j2 = this.zzc;
            while ((i2 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i3 = this.zzc;
                this.zzc = i3 + 1;
                zziem.zzp(bArr, i3, (byte) (i2 | 128));
                i2 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i5 = this.zzc;
            this.zzc = i5 + 1;
            zziem.zzp(bArr2, i5, (byte) i2);
            this.zzd += (int) (((long) this.zzc) - j2);
            return;
        }
        while ((i2 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i7 = this.zzc;
            this.zzc = i7 + 1;
            bArr3[i7] = (byte) (i2 | 128);
            this.zzd++;
            i2 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        bArr4[i8] = (byte) i2;
        this.zzd++;
    }

    final void zze(long j2) {
        if (zziaw.zza) {
            long j3 = this.zzc;
            while (true) {
                int i2 = (int) j2;
                if ((j2 & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i3 = this.zzc;
                    this.zzc = i3 + 1;
                    zziem.zzp(bArr, i3, (byte) i2);
                    this.zzd += (int) (((long) this.zzc) - j3);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i5 = this.zzc;
                this.zzc = i5 + 1;
                zziem.zzp(bArr2, i5, (byte) (i2 | 128));
                j2 >>>= 7;
            }
        } else {
            while (true) {
                int i7 = (int) j2;
                if ((j2 & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i8 = this.zzc;
                    this.zzc = i8 + 1;
                    bArr3[i8] = (byte) i7;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i9 = this.zzc;
                this.zzc = i9 + 1;
                bArr4[i9] = (byte) (i7 | 128);
                this.zzd++;
                j2 >>>= 7;
            }
        }
    }
}
