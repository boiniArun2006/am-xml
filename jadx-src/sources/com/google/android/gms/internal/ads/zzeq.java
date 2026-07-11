package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzeq {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzeq(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzd = i2;
    }

    public final void zzb(byte[] bArr, int i2) {
        this.zza = bArr;
        this.zzb = 0;
        this.zzc = 0;
        this.zzd = i2;
    }

    public final int zzc() {
        return ((this.zzd - this.zzb) * 8) - this.zzc;
    }

    public final int zzd() {
        return (this.zzb * 8) + this.zzc;
    }

    public final int zzj(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.zzc += i2;
        int i5 = 0;
        while (true) {
            i3 = this.zzc;
            if (i3 <= 8) {
                break;
            }
            int i7 = i3 - 8;
            this.zzc = i7;
            byte[] bArr = this.zza;
            int i8 = this.zzb;
            this.zzb = i8 + 1;
            i5 |= (bArr[i8] & UByte.MAX_VALUE) << i7;
        }
        byte[] bArr2 = this.zza;
        int i9 = this.zzb;
        int i10 = i5 | ((bArr2[i9] & UByte.MAX_VALUE) >> (8 - i3));
        int i11 = 32 - i2;
        if (i3 == 8) {
            this.zzc = 0;
            this.zzb = i9 + 1;
        }
        int i12 = ((-1) >>> i11) & i10;
        zzq();
        return i12;
    }

    public final void zzl(byte[] bArr, int i2, int i3) {
        int i5;
        int i7 = 0;
        while (true) {
            i5 = i3 >> 3;
            if (i7 >= i5) {
                break;
            }
            byte[] bArr2 = this.zza;
            int i8 = this.zzb;
            int i9 = i8 + 1;
            this.zzb = i9;
            byte b2 = bArr2[i8];
            int i10 = this.zzc;
            byte b4 = (byte) (b2 << i10);
            bArr[i7] = b4;
            bArr[i7] = (byte) (((bArr2[i9] & UByte.MAX_VALUE) >> (8 - i10)) | b4);
            i7++;
        }
        int i11 = i3 & 7;
        if (i11 == 0) {
            return;
        }
        byte b5 = (byte) (bArr[i5] & (255 >> i11));
        bArr[i5] = b5;
        int i12 = this.zzc;
        if (i12 + i11 > 8) {
            byte[] bArr3 = this.zza;
            int i13 = this.zzb;
            this.zzb = i13 + 1;
            b5 = (byte) (b5 | ((bArr3[i13] & UByte.MAX_VALUE) << i12));
            bArr[i5] = b5;
            i12 -= 8;
        }
        int i14 = i12 + i11;
        this.zzc = i14;
        byte[] bArr4 = this.zza;
        int i15 = this.zzb;
        bArr[i5] = (byte) (((byte) (((255 & bArr4[i15]) >> (8 - i14)) << (8 - i11))) | b5);
        if (i14 == 8) {
            this.zzc = 0;
            this.zzb = i15 + 1;
        }
        zzq();
    }

    public zzeq() {
        this.zza = zzfj.zzb;
    }

    private final void zzq() {
        int i2;
        int i3 = this.zzb;
        boolean z2 = false;
        if (i3 >= 0 && (i3 < (i2 = this.zzd) || (i3 == i2 && this.zzc == 0))) {
            z2 = true;
        }
        zzgrc.zzi(z2);
    }

    public final int zze() {
        zzgrc.zzi(this.zzc == 0);
        return this.zzb;
    }

    public final void zzf(int i2) {
        int i3 = i2 / 8;
        this.zzb = i3;
        this.zzc = i2 - (i3 * 8);
        zzq();
    }

    public final void zzg() {
        int i2 = this.zzc + 1;
        this.zzc = i2;
        if (i2 == 8) {
            this.zzc = 0;
            this.zzb++;
        }
        zzq();
    }

    public final void zzh(int i2) {
        int i3 = i2 / 8;
        int i5 = this.zzb + i3;
        this.zzb = i5;
        int i7 = this.zzc + (i2 - (i3 * 8));
        this.zzc = i7;
        if (i7 > 7) {
            this.zzb = i5 + 1;
            this.zzc = i7 - 8;
        }
        zzq();
    }

    public final boolean zzi() {
        int i2 = this.zza[this.zzb] & (128 >> this.zzc);
        zzg();
        return i2 != 0;
    }

    public final void zzm() {
        if (this.zzc == 0) {
            return;
        }
        this.zzc = 0;
        this.zzb++;
        zzq();
    }

    public final void zzn(byte[] bArr, int i2, int i3) {
        zzgrc.zzi(this.zzc == 0);
        System.arraycopy(this.zza, this.zzb, bArr, 0, i3);
        this.zzb += i3;
        zzq();
    }

    public final void zzo(int i2) {
        zzgrc.zzi(this.zzc == 0);
        this.zzb += i2;
        zzq();
    }

    public final void zzp(int i2, int i3) {
        int iMin = Math.min(8 - this.zzc, 14);
        int i5 = this.zzc;
        int i7 = (8 - i5) - iMin;
        byte[] bArr = this.zza;
        int i8 = this.zzb;
        byte b2 = (byte) (((65280 >> i5) | ((1 << i7) - 1)) & bArr[i8]);
        bArr[i8] = b2;
        int i9 = 14 - iMin;
        int i10 = i2 & 16383;
        bArr[i8] = (byte) (b2 | ((i10 >>> i9) << i7));
        int i11 = i8 + 1;
        while (i9 > 8) {
            i9 -= 8;
            this.zza[i11] = (byte) (i10 >>> i9);
            i11++;
        }
        byte[] bArr2 = this.zza;
        byte b4 = (byte) (bArr2[i11] & ((1 << r0) - 1));
        bArr2[i11] = b4;
        bArr2[i11] = (byte) (((i10 & ((1 << i9) - 1)) << (8 - i9)) | b4);
        zzh(14);
        zzq();
    }

    public final void zza(zzer zzerVar) {
        zzb(zzerVar.zzi(), zzerVar.zze());
        zzf(zzerVar.zzg() * 8);
    }

    public final long zzk(int i2) {
        if (i2 <= 32) {
            int iZzj = zzj(i2);
            String str = zzfj.zza;
            return 4294967295L & ((long) iZzj);
        }
        int iZzj2 = zzj(i2 - 32);
        int iZzj3 = zzj(32);
        String str2 = zzfj.zza;
        return (4294967295L & ((long) iZzj3)) | ((((long) iZzj2) & 4294967295L) << 32);
    }
}
