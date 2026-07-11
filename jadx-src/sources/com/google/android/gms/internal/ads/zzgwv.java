package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgwv {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    zzgwv(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i2 = 0; i2 < cArr.length; i2++) {
            char c2 = cArr[i2];
            boolean z2 = true;
            zzgrc.zzc(c2 < 128, "Non-ASCII character: %s", c2);
            if (bArr[c2] != -1) {
                z2 = false;
            }
            zzgrc.zzc(z2, "Duplicate character: %s", c2);
            bArr[c2] = (byte) i2;
        }
        this(str, cArr, bArr, false);
    }

    public final String toString() {
        return this.zze;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    final zzgwv zzd() {
        boolean z2;
        int i2 = 0;
        while (true) {
            char[] cArr = this.zzf;
            int length = cArr.length;
            if (i2 >= length) {
                return this;
            }
            if (zzgql.zzd(cArr[i2])) {
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        break;
                    }
                    if (zzgql.zzc(cArr[i3])) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
                zzgrc.zzj(!z2, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[cArr.length];
                for (int i5 = 0; i5 < cArr.length; i5++) {
                    char c2 = cArr[i5];
                    if (zzgql.zzd(c2)) {
                        c2 ^= 32;
                    }
                    cArr2[i5] = (char) c2;
                }
                zzgwv zzgwvVar = new zzgwv(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzgwvVar.zzi) {
                    return zzgwvVar;
                }
                byte[] bArr = zzgwvVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (int i7 = 65; i7 <= 90; i7++) {
                    int i8 = i7 | 32;
                    byte b2 = bArr[i7];
                    byte b4 = bArr[i8];
                    if (b2 == -1) {
                        bArrCopyOf[i7] = b4;
                    } else {
                        char c4 = (char) i7;
                        char c5 = (char) i8;
                        if (b4 != -1) {
                            throw new IllegalStateException(zzgrt.zzd("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                        }
                        bArrCopyOf[i8] = b2;
                    }
                }
                return new zzgwv(zzgwvVar.zze.concat(".ignoreCase()"), zzgwvVar.zzf, bArrCopyOf, true);
            }
            i2++;
        }
    }

    final /* synthetic */ char[] zzf() {
        return this.zzf;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgwv) {
            zzgwv zzgwvVar = (zzgwv) obj;
            if (this.zzi == zzgwvVar.zzi && Arrays.equals(this.zzf, zzgwvVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    final char zza(int i2) {
        return this.zzf[i2];
    }

    final boolean zzb(int i2) {
        return this.zzh[i2 % this.zzc];
    }

    final int zzc(char c2) throws zzgwy {
        if (c2 > 127) {
            throw new zzgwy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c2))));
        }
        byte b2 = this.zzg[c2];
        if (b2 != -1) {
            return b2;
        }
        if (c2 <= ' ' || c2 == 127) {
            throw new zzgwy("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c2))));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 24);
        sb.append("Unrecognized character: ");
        sb.append(c2);
        throw new zzgwy(sb.toString());
    }

    public final boolean zze(char c2) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzgwv(String str, char[] cArr, byte[] bArr, boolean z2) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZza = zzgxs.zza(length, RoundingMode.UNNECESSARY);
            this.zzb = iZza;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZza);
            int i2 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i2;
            this.zzd = iZza >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i2];
            for (int i3 = 0; i3 < this.zzd; i3++) {
                zArr[zzgxs.zzb(i3 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z2;
        } catch (ArithmeticException e2) {
            int length2 = cArr.length;
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 24);
            sb.append("Illegal alphabet length ");
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString(), e2);
        }
    }
}
