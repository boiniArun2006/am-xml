package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzgb {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzgb(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < cArr.length; i2++) {
            char c2 = cArr[i2];
            boolean z2 = true;
            zzbm.zzd(c2 < 128, "Non-ASCII character: %s", c2);
            if (bArr[c2] != -1) {
                z2 = false;
            }
            zzbm.zzd(z2, "Duplicate character: %s", c2);
            bArr[c2] = (byte) i2;
        }
        this(str, cArr, bArr, false);
    }

    public final String toString() {
        return this.zze;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    final zzgb zzb() {
        int i2;
        boolean z2;
        int i3 = 0;
        int i5 = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i5 >= cArr.length) {
                return this;
            }
            if (zzba.zza(cArr[i5])) {
                int i7 = 0;
                while (true) {
                    if (i7 >= cArr.length) {
                        z2 = false;
                        break;
                    }
                    char c2 = cArr[i7];
                    if (c2 >= 'A' && c2 <= 'Z') {
                        z2 = true;
                        break;
                    }
                    i7++;
                }
                zzbm.zzf(!z2, "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.zzf.length];
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i3 >= cArr3.length) {
                        break;
                    }
                    char c4 = cArr3[i3];
                    if (zzba.zza(c4)) {
                        c4 ^= 32;
                    }
                    cArr2[i3] = (char) c4;
                    i3++;
                }
                zzgb zzgbVar = new zzgb(this.zze.concat(".upperCase()"), cArr2);
                if (!this.zzh || zzgbVar.zzh) {
                    return zzgbVar;
                }
                byte[] bArr = zzgbVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (i2 = 65; i2 <= 90; i2++) {
                    int i8 = i2 | 32;
                    byte[] bArr2 = zzgbVar.zzg;
                    byte b2 = bArr2[i2];
                    byte b4 = bArr2[i8];
                    if (b2 == -1) {
                        bArrCopyOf[i2] = b4;
                    } else {
                        char c5 = (char) i2;
                        char c6 = (char) i8;
                        if (b4 != -1) {
                            throw new IllegalStateException(zzbo.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c5), Character.valueOf(c6)));
                        }
                        bArrCopyOf[i8] = b2;
                    }
                }
                return new zzgb(zzgbVar.zze.concat(".ignoreCase()"), zzgbVar.zzf, bArrCopyOf, true);
            }
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgb) {
            zzgb zzgbVar = (zzgb) obj;
            if (this.zzh == zzgbVar.zzh && Arrays.equals(this.zzf, zzgbVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    final char zza(int i2) {
        return this.zzf[i2];
    }

    public final boolean zzc(char c2) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzgb(String str, char[] cArr, byte[] bArr, boolean z2) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzgh.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i2 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i2;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i2];
            for (int i3 = 0; i3 < this.zzd; i3++) {
                zArr[zzgh.zza(i3 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z2;
        } catch (ArithmeticException e2) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
        }
    }
}
