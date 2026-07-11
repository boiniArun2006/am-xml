package com.google.android.gms.internal.ads;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class zzgn {
    private byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private final int zzi() {
        int i2 = 0;
        while (!zze()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? zzf(i2) : 0);
    }

    private final boolean zzj(int i2) {
        if (i2 < 2 || i2 >= this.zzb) {
            return false;
        }
        byte[] bArr = this.zza;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 + (-1)] == 0;
    }

    private final void zzk() {
        int i2;
        int i3 = this.zzc;
        boolean z2 = false;
        if (i3 >= 0 && (i3 < (i2 = this.zzb) || (i3 == i2 && this.zzd == 0))) {
            z2 = true;
        }
        zzgrc.zzi(z2);
    }

    public final void zza() {
        int i2 = this.zzd + 1;
        this.zzd = i2;
        if (i2 == 8) {
            this.zzd = 0;
            int i3 = this.zzc;
            this.zzc = i3 + (true == zzj(i3 + 1) ? 2 : 1);
        }
        zzk();
    }

    public final void zzb(int i2) {
        int i3 = this.zzc;
        int i5 = i2 / 8;
        int i7 = i3 + i5;
        this.zzc = i7;
        int i8 = this.zzd + (i2 - (i5 * 8));
        this.zzd = i8;
        if (i8 > 7) {
            this.zzc = i7 + 1;
            this.zzd = i8 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.zzc) {
                zzk();
                return;
            } else if (zzj(i3)) {
                this.zzc++;
                i3 += 2;
            }
        }
    }

    public final void zzc() {
        int i2 = this.zzd;
        if (i2 > 0) {
            zzb(8 - i2);
        }
    }

    public final boolean zzd(int i2) {
        int i3 = this.zzc;
        int i5 = i2 / 8;
        int i7 = i3 + i5;
        int i8 = (this.zzd + i2) - (i5 * 8);
        if (i8 > 7) {
            i7++;
            i8 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i7 || i7 >= this.zzb) {
                break;
            }
            if (zzj(i3)) {
                i7++;
                i3 += 2;
            }
        }
        int i9 = this.zzb;
        if (i7 >= i9) {
            return i7 == i9 && i8 == 0;
        }
        return true;
    }

    public final boolean zze() {
        int i2 = this.zza[this.zzc] & (128 >> this.zzd);
        zza();
        return i2 != 0;
    }

    public final int zzf(int i2) {
        int i3;
        this.zzd += i2;
        int i5 = 0;
        while (true) {
            i3 = this.zzd;
            if (i3 <= 8) {
                break;
            }
            int i7 = i3 - 8;
            this.zzd = i7;
            byte[] bArr = this.zza;
            int i8 = this.zzc;
            i5 |= (bArr[i8] & UByte.MAX_VALUE) << i7;
            if (true != zzj(i8 + 1)) {
                i = 1;
            }
            this.zzc = i8 + i;
        }
        byte[] bArr2 = this.zza;
        int i9 = this.zzc;
        int i10 = i5 | ((bArr2[i9] & UByte.MAX_VALUE) >> (8 - i3));
        int i11 = 32 - i2;
        if (i3 == 8) {
            this.zzd = 0;
            this.zzc = i9 + (true != zzj(i9 + 1) ? 1 : 2);
        }
        int i12 = ((-1) >>> i11) & i10;
        zzk();
        return i12;
    }

    public zzgn(byte[] bArr, int i2, int i3) {
        this.zza = bArr;
        this.zzc = i2;
        this.zzb = i3;
        zzk();
    }

    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        int iZzi = zzi();
        int i2 = iZzi % 2;
        int i3 = 1;
        int i5 = iZzi + 1;
        if (i2 == 0) {
            i3 = -1;
        }
        return i3 * (i5 / 2);
    }
}
