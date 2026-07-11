package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class zzgwz extends zzgxa {
    private volatile zzgxa zza;
    final zzgwv zzb;
    final Character zzc;

    zzgwz(zzgwv zzgwvVar, Character ch) {
        this.zzb = zzgwvVar;
        boolean z2 = true;
        if (ch != null && zzgwvVar.zze('=')) {
            z2 = false;
        }
        zzgrc.zzf(z2, "Padding character %s was already in alphabet", ch);
        this.zzc = ch;
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    void zza(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i5 = 0;
        zzgrc.zzo(0, i3, bArr.length);
        while (i5 < i3) {
            int i7 = this.zzb.zzd;
            zze(appendable, bArr, i5, Math.min(i7, i3 - i5));
            i5 += i7;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    final int zzf(int i2) {
        return (int) (((((long) this.zzb.zzb) * ((long) i2)) + 7) / 8);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgwz) {
            zzgwz zzgwzVar = (zzgwz) obj;
            if (this.zzb.equals(zzgwzVar.zzb) && Objects.equals(this.zzc, zzgwzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        zzgwv zzgwvVar = this.zzb;
        sb.append(zzgwvVar);
        if (8 % zzgwvVar.zzb != 0) {
            Character ch = this.zzc;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy {
        int i2;
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgwv zzgwvVar = this.zzb;
        if (!zzgwvVar.zzb(length)) {
            int length2 = charSequenceZzg.length();
            StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 21);
            sb.append("Invalid input length ");
            sb.append(length2);
            throw new zzgwy(sb.toString());
        }
        int i3 = 0;
        int i5 = 0;
        while (i3 < charSequenceZzg.length()) {
            long jZzc = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                i2 = zzgwvVar.zzc;
                if (i7 >= i2) {
                    break;
                }
                jZzc <<= zzgwvVar.zzb;
                if (i3 + i7 < charSequenceZzg.length()) {
                    jZzc |= (long) zzgwvVar.zzc(charSequenceZzg.charAt(i8 + i3));
                    i8++;
                }
                i7++;
            }
            int i9 = zzgwvVar.zzd;
            int i10 = i8 * zzgwvVar.zzb;
            int i11 = (i9 - 1) * 8;
            while (i11 >= (i9 * 8) - i10) {
                bArr[i5] = (byte) ((jZzc >>> i11) & 255);
                i11 -= 8;
                i5++;
            }
            i3 += i2;
        }
        return i5;
    }

    zzgxa zzc(zzgwv zzgwvVar, Character ch) {
        return new zzgwz(zzgwvVar, ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    final int zzd(int i2) {
        zzgwv zzgwvVar = this.zzb;
        return zzgwvVar.zzc * zzgxs.zzb(i2, zzgwvVar.zzd, RoundingMode.CEILING);
    }

    final void zze(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        zzgrc.zzo(i2, i2 + i3, bArr.length);
        zzgwv zzgwvVar = this.zzb;
        int i5 = zzgwvVar.zzd;
        int i7 = 0;
        zzgrc.zza(i3 <= i5);
        long j2 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            j2 = (j2 | ((long) (bArr[i2 + i8] & UByte.MAX_VALUE))) << 8;
        }
        int i9 = (i3 + 1) * 8;
        int i10 = zzgwvVar.zzb;
        while (i7 < i3 * 8) {
            appendable.append(zzgwvVar.zza(zzgwvVar.zza & ((int) (j2 >>> ((i9 - i10) - i7)))));
            i7 += i10;
        }
        if (this.zzc != null) {
            while (i7 < i5 * 8) {
                appendable.append('=');
                i7 += i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final zzgxa zzh() {
        return this.zzc == null ? this : zzc(this.zzb, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    public final zzgxa zzi() {
        zzgxa zzgxaVarZzc = this.zza;
        if (zzgxaVarZzc == null) {
            zzgwv zzgwvVar = this.zzb;
            zzgwv zzgwvVarZzd = zzgwvVar.zzd();
            zzgxaVarZzc = zzgwvVarZzd == zzgwvVar ? this : zzc(zzgwvVarZzd, this.zzc);
            this.zza = zzgxaVarZzc;
        }
        return zzgxaVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxa
    final CharSequence zzg(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    zzgwz(String str, String str2, Character ch) {
        this(new zzgwv(str, str2.toCharArray()), ch);
    }
}
