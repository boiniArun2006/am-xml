package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzmo implements zzbk {
    private zzmo(zzbk zzbkVar, byte[] bArr) {
    }

    public static zzbk zza(zzoe zzoeVar) throws GeneralSecurityException {
        byte[] bArrZzb;
        zzqe zzqeVarZza = zzoeVar.zza(zzbj.zza());
        zzbk zzbkVar = (zzbk) zznt.zza().zza(zzqeVarZza.zzf(), zzbk.class).zzb(zzqeVarZza.zzd());
        zzxu zzxuVarZzc = zzqeVarZza.zzc();
        int i2 = zzmr.zza[zzxuVarZzc.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    bArrZzb = zzpd.zzb(zzoeVar.zzb().intValue()).zzb();
                } else {
                    throw new GeneralSecurityException("unknown output prefix type " + String.valueOf(zzxuVarZzc));
                }
            } else {
                bArrZzb = zzpd.zza(zzoeVar.zzb().intValue()).zzb();
            }
        } else {
            bArrZzb = zzpd.zza.zzb();
        }
        return new zzmo(zzbkVar, bArrZzb);
    }
}
