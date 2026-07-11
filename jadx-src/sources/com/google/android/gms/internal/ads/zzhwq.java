package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhwq {
    private static final Charset zza = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);

    public static byte[] zza(String str, int i2) {
        byte[] bytes = str.getBytes(zza);
        int length = bytes.length;
        zzhwp zzhwpVar = new zzhwp(2, new byte[(length * 3) / 4]);
        if (!zzhwpVar.zza(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i3 = zzhwpVar.zzb;
        byte[] bArr = zzhwpVar.zza;
        if (i3 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        return bArr2;
    }
}
