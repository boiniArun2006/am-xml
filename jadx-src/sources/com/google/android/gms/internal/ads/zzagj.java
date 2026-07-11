package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzagj {
    private final byte[] zza;
    private final int zzb;
    private int zzc;
    private int zzd;

    public final int zzd() {
        return (this.zzc * 8) + this.zzd;
    }

    public final boolean zza() {
        int i2 = (this.zza[this.zzc] & UByte.MAX_VALUE) >> this.zzd;
        zzc(1);
        return 1 == (i2 & 1);
    }

    public final int zzb(int i2) {
        int i3 = this.zzc;
        int i5 = 8 - this.zzd;
        int i7 = i3 + 1;
        byte[] bArr = this.zza;
        int iMin = Math.min(i2, i5);
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) >> this.zzd) & (255 >> (8 - iMin));
        while (iMin < i2) {
            i8 |= (bArr[i7] & UByte.MAX_VALUE) << iMin;
            iMin += 8;
            i7++;
        }
        int i9 = i8 & ((-1) >>> (32 - i2));
        zzc(i2);
        return i9;
    }

    public final void zzc(int i2) {
        int i3;
        int i5 = i2 / 8;
        int i7 = this.zzc + i5;
        this.zzc = i7;
        int i8 = this.zzd + (i2 - (i5 * 8));
        this.zzd = i8;
        if (i8 > 7) {
            i7++;
            this.zzc = i7;
            i8 -= 8;
            this.zzd = i8;
        }
        boolean z2 = false;
        if (i7 >= 0 && (i7 < (i3 = this.zzb) || (i7 == i3 && i8 == 0))) {
            z2 = true;
        }
        zzgrc.zzi(z2);
    }

    public zzagj(byte[] bArr) {
        this.zza = bArr;
        this.zzb = bArr.length;
    }
}
