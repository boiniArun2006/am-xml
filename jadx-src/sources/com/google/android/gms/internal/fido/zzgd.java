package com.google.android.gms.internal.fido;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzgd extends zzge {
    private zzgd(zzgb zzgbVar, Character ch) {
        super(zzgbVar, ch);
        zzbm.zzc(zzgbVar.zzf.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    final void zzb(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        int i5 = 0;
        zzbm.zze(0, i3, bArr.length);
        for (int i7 = i3; i7 >= 3; i7 -= 3) {
            int i8 = bArr[i5] & UByte.MAX_VALUE;
            int i9 = ((bArr[i5 + 1] & UByte.MAX_VALUE) << 8) | (i8 << 16) | (bArr[i5 + 2] & UByte.MAX_VALUE);
            appendable.append(this.zzb.zza(i9 >>> 18));
            appendable.append(this.zzb.zza((i9 >>> 12) & 63));
            appendable.append(this.zzb.zza((i9 >>> 6) & 63));
            appendable.append(this.zzb.zza(i9 & 63));
            i5 += 3;
        }
        if (i5 < i3) {
            zze(appendable, bArr, i5, i3 - i5);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzge
    final zzgf zza(zzgb zzgbVar, Character ch) {
        return new zzgd(zzgbVar, ch);
    }

    zzgd(String str, String str2, Character ch) {
        this(new zzgb(str, str2.toCharArray()), ch);
    }
}
