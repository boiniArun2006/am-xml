package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgwx extends zzgwz {
    private zzgwx(zzgwv zzgwvVar, Character ch) {
        super(zzgwvVar, ch);
        zzgrc.zza(zzgwvVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    final void zza(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i5 = 0;
        zzgrc.zzo(0, i3, bArr.length);
        for (int i7 = i3; i7 >= 3; i7 -= 3) {
            int i8 = bArr[i5] & UByte.MAX_VALUE;
            int i9 = bArr[i5 + 1] & UByte.MAX_VALUE;
            int i10 = bArr[i5 + 2] & UByte.MAX_VALUE;
            zzgwv zzgwvVar = this.zzb;
            int i11 = (i9 << 8) | (i8 << 16) | i10;
            appendable.append(zzgwvVar.zza(i11 >>> 18));
            appendable.append(zzgwvVar.zza((i11 >>> 12) & 63));
            appendable.append(zzgwvVar.zza((i11 >>> 6) & 63));
            appendable.append(zzgwvVar.zza(i11 & 63));
            i5 += 3;
        }
        if (i5 < i3) {
            zze(appendable, bArr, i5, i3 - i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    final zzgxa zzc(zzgwv zzgwvVar, Character ch) {
        return new zzgwx(zzgwvVar, ch);
    }

    zzgwx(String str, String str2, Character ch) {
        this(new zzgwv(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgwv zzgwvVar = this.zzb;
        if (zzgwvVar.zzb(length)) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < charSequenceZzg.length()) {
                int i5 = i3 + 1;
                int iZzc = (zzgwvVar.zzc(charSequenceZzg.charAt(i2 + 1)) << 12) | (zzgwvVar.zzc(charSequenceZzg.charAt(i2)) << 18);
                bArr[i3] = (byte) (iZzc >>> 16);
                int i7 = i2 + 2;
                if (i7 < charSequenceZzg.length()) {
                    int i8 = i2 + 3;
                    int iZzc2 = iZzc | (zzgwvVar.zzc(charSequenceZzg.charAt(i7)) << 6);
                    int i9 = i3 + 2;
                    bArr[i5] = (byte) ((iZzc2 >>> 8) & 255);
                    if (i8 < charSequenceZzg.length()) {
                        i2 += 4;
                        i3 += 3;
                        bArr[i9] = (byte) ((iZzc2 | zzgwvVar.zzc(charSequenceZzg.charAt(i8))) & 255);
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
        int length2 = charSequenceZzg.length();
        StringBuilder sb = new StringBuilder(String.valueOf(length2).length() + 21);
        sb.append("Invalid input length ");
        sb.append(length2);
        throw new zzgwy(sb.toString());
    }
}
