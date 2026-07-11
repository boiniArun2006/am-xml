package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhbv {
    public static byte[] zza(zzhbp zzhbpVar) throws GeneralSecurityException {
        return ((zzhlc) zzhkg.zza().zzk(zzhbpVar, zzhlc.class)).zzc().zzaN();
    }

    public static zzhbp zzb(byte[] bArr) throws GeneralSecurityException {
        try {
            zzhqf zzhqfVarZzd = zzhqf.zzd(bArr, zzibb.zza());
            zzhkg zzhkgVarZza = zzhkg.zza();
            zzhlc zzhlcVarZzb = zzhlc.zzb(zzhqfVarZzd);
            if (!zzhkgVarZza.zzi(zzhlcVarZzb)) {
                return new zzhjp(zzhlcVarZzb);
            }
            return zzhkgVarZza.zzj(zzhlcVarZzb);
        } catch (IOException e2) {
            throw new GeneralSecurityException("Failed to parse proto", e2);
        }
    }
}
