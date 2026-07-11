package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhnm implements zzhbo {
    private zzhnm(zzhbo zzhboVar, zzhqy zzhqyVar, byte[] bArr) {
    }

    public static zzhbo zza(zzhjo zzhjoVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzhlb zzhlbVarZzc = zzhjoVar.zzc(zzhax.zza());
        zzhbo zzhboVar = (zzhbo) zzhjc.zza().zzc(zzhlbVarZzc.zzg(), zzhbo.class).zza(zzhlbVarZzc.zzb());
        zzhqy zzhqyVarZzd = zzhlbVarZzc.zzd();
        int iOrdinal = zzhqyVarZzd.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    bArrZzc = zzhkh.zza(zzhjoVar.zzb().intValue()).zzc();
                } else {
                    bArrZzc = zzhkh.zza.zzc();
                }
            } else {
                bArrZzc = zzhkh.zza(zzhjoVar.zzb().intValue()).zzc();
            }
        } else {
            bArrZzc = zzhkh.zzb(zzhjoVar.zzb().intValue()).zzc();
        }
        return new zzhnm(zzhboVar, zzhqyVarZzd, bArrZzc);
    }
}
