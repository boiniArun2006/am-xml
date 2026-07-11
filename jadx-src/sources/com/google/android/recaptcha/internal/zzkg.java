package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
class zzkg extends zzkh {
    final zzkd zza;
    final Character zzb;

    zzkg(zzkd zzkdVar, Character ch) {
        this.zza = zzkdVar;
        if (ch != null && zzkdVar.zzd('=')) {
            throw new IllegalArgumentException(zzji.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzb = ch;
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    void zzb(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i5 = 0;
        zzjf.zzd(0, i3, bArr.length);
        while (i5 < i3) {
            zzf(appendable, bArr, i5, Math.min(this.zza.zzd, i3 - i5));
            i5 += this.zza.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    final int zzc(int i2) {
        return (int) (((((long) this.zza.zzb) * ((long) i2)) + 7) / 8);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkg) {
            zzkg zzkgVar = (zzkg) obj;
            if (this.zza.equals(zzkgVar.zza) && Objects.equals(this.zzb, zzkgVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzb);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    final int zzd(int i2) {
        zzkd zzkdVar = this.zza;
        return zzkdVar.zzc * zzkj.zza(i2, zzkdVar.zzd, RoundingMode.CEILING);
    }

    final void zzf(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        zzjf.zzd(i2, i2 + i3, bArr.length);
        int i5 = 0;
        zzjf.zza(i3 <= this.zza.zzd);
        long j2 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            j2 = (j2 | ((long) (bArr[i2 + i7] & UByte.MAX_VALUE))) << 8;
        }
        int i8 = (i3 + 1) * 8;
        zzkd zzkdVar = this.zza;
        while (i5 < i3 * 8) {
            long j3 = j2 >>> ((i8 - zzkdVar.zzb) - i5);
            zzkd zzkdVar2 = this.zza;
            appendable.append(zzkdVar2.zza(((int) j3) & zzkdVar2.zza));
            i5 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i5 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i5 += this.zza.zzb;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    int zza(byte[] bArr, CharSequence charSequence) throws zzkf {
        zzkd zzkdVar;
        CharSequence charSequenceZze = zze(charSequence);
        if (this.zza.zzc(charSequenceZze.length())) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < charSequenceZze.length()) {
                long jZzb = 0;
                int i5 = 0;
                int i7 = 0;
                while (true) {
                    zzkdVar = this.zza;
                    if (i5 >= zzkdVar.zzc) {
                        break;
                    }
                    jZzb <<= zzkdVar.zzb;
                    if (i2 + i5 < charSequenceZze.length()) {
                        jZzb |= (long) this.zza.zzb(charSequenceZze.charAt(i7 + i2));
                        i7++;
                    }
                    i5++;
                }
                int i8 = zzkdVar.zzd;
                int i9 = i7 * zzkdVar.zzb;
                int i10 = (i8 - 1) * 8;
                while (i10 >= (i8 * 8) - i9) {
                    bArr[i3] = (byte) ((jZzb >>> i10) & 255);
                    i10 -= 8;
                    i3++;
                }
                i2 += this.zza.zzc;
            }
            return i3;
        }
        throw new zzkf("Invalid input length " + charSequenceZze.length());
    }

    @Override // com.google.android.recaptcha.internal.zzkh
    final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
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

    zzkg(String str, String str2, Character ch) {
        this(new zzkd(str, str2.toCharArray()), ch);
    }
}
