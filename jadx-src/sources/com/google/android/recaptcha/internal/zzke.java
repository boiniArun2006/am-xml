package com.google.android.recaptcha.internal;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzke extends zzkg {
    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    final void zzb(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i5 = 0;
        zzjf.zzd(0, i3, bArr.length);
        for (int i7 = i3; i7 >= 3; i7 -= 3) {
            int i8 = bArr[i5] & UByte.MAX_VALUE;
            int i9 = ((bArr[i5 + 1] & UByte.MAX_VALUE) << 8) | (i8 << 16) | (bArr[i5 + 2] & UByte.MAX_VALUE);
            appendable.append(this.zza.zza(i9 >>> 18));
            appendable.append(this.zza.zza((i9 >>> 12) & 63));
            appendable.append(this.zza.zza((i9 >>> 6) & 63));
            appendable.append(this.zza.zza(i9 & 63));
            i5 += 3;
        }
        if (i5 < i3) {
            zzf(appendable, bArr, i5, i3 - i5);
        }
    }

    zzke(String str, String str2, Character ch) {
        zzkd zzkdVar = new zzkd(str, str2.toCharArray());
        super(zzkdVar, ch);
        zzjf.zza(zzkdVar.zzf.length == 64);
    }

    @Override // com.google.android.recaptcha.internal.zzkg, com.google.android.recaptcha.internal.zzkh
    final int zza(byte[] bArr, CharSequence charSequence) throws zzkf {
        CharSequence charSequenceZze = zze(charSequence);
        if (this.zza.zzc(charSequenceZze.length())) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < charSequenceZze.length()) {
                int i5 = i3 + 1;
                int iZzb = (this.zza.zzb(charSequenceZze.charAt(i2)) << 18) | (this.zza.zzb(charSequenceZze.charAt(i2 + 1)) << 12);
                bArr[i3] = (byte) (iZzb >>> 16);
                int i7 = i2 + 2;
                if (i7 < charSequenceZze.length()) {
                    int i8 = i2 + 3;
                    int iZzb2 = iZzb | (this.zza.zzb(charSequenceZze.charAt(i7)) << 6);
                    int i9 = i3 + 2;
                    bArr[i5] = (byte) ((iZzb2 >>> 8) & 255);
                    if (i8 < charSequenceZze.length()) {
                        i2 += 4;
                        i3 += 3;
                        bArr[i9] = (byte) ((iZzb2 | this.zza.zzb(charSequenceZze.charAt(i8))) & 255);
                    } else {
                        i3 = i9;
                        i2 = i8;
                    }
                } else {
                    i2 = i7;
                    i3 = i5;
                }
            }
            return i3;
        }
        throw new zzkf("Invalid input length " + charSequenceZze.length());
    }
}
