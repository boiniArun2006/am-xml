package com.google.android.gms.internal.fido;

import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class zzgc extends zzge {
    final char[] zza;

    private zzgc(zzgb zzgbVar) {
        super(zzgbVar, null);
        this.zza = new char[512];
        zzbm.zzc(zzgbVar.zzf.length == 16);
        for (int i2 = 0; i2 < 256; i2++) {
            this.zza[i2] = zzgbVar.zza(i2 >>> 4);
            this.zza[i2 | 256] = zzgbVar.zza(i2 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzge, com.google.android.gms.internal.fido.zzgf
    final void zzb(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
        zzbm.zze(0, i3, bArr.length);
        for (int i5 = 0; i5 < i3; i5++) {
            int i7 = bArr[i5] & UByte.MAX_VALUE;
            appendable.append(this.zza[i7]);
            appendable.append(this.zza[i7 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzge
    final zzgf zza(zzgb zzgbVar, Character ch) {
        return new zzgc(zzgbVar);
    }

    zzgc(String str, String str2) {
        this(new zzgb("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
