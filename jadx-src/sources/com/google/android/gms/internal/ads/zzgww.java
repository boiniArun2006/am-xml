package com.google.android.gms.internal.ads;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzgww extends zzgwz {
    final char[] zza;

    private zzgww(zzgwv zzgwvVar) {
        super(zzgwvVar, null);
        this.zza = new char[512];
        zzgrc.zza(zzgwvVar.zzf().length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            this.zza[i2] = zzgwvVar.zza(i2 >>> 4);
            this.zza[i2 | 256] = zzgwvVar.zza(i2 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    final void zza(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        zzgrc.zzo(0, i3, bArr.length);
        for (int i5 = 0; i5 < i3; i5++) {
            int i7 = bArr[i5] & UByte.MAX_VALUE;
            char[] cArr = this.zza;
            appendable.append(cArr[i7]);
            appendable.append(cArr[i7 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    final zzgxa zzc(zzgwv zzgwvVar, Character ch) {
        return new zzgww(zzgwvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    final int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy {
        if (charSequence.length() % 2 != 1) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < charSequence.length()) {
                zzgwv zzgwvVar = this.zzb;
                bArr[i3] = (byte) (zzgwvVar.zzc(charSequence.charAt(i2 + 1)) | (zzgwvVar.zzc(charSequence.charAt(i2)) << 4));
                i2 += 2;
                i3++;
            }
            return i3;
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 21);
        sb.append("Invalid input length ");
        sb.append(length);
        throw new zzgwy(sb.toString());
    }

    zzgww(String str, String str2) {
        this(new zzgwv("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
