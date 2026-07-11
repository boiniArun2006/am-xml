package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhlt {
    private static final zzhjb zza = zzhls.zza;
    private static final zzhku zzb = zzhku.zzd(zzhlq.zza, zzhlp.class, zzhlx.class);
    private static final zzhku zzc = zzhku.zzd(zzhlr.zza, zzhlp.class, zzhbo.class);
    private static final zzhba zzd = zzhjl.zze("type.googleapis.com/google.crypto.tink.AesCmacKey", zzhbo.class, zzhqb.SYMMETRIC, zzhnw.zzg());

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i2 = zzhnc.zza;
        zzhnc.zza(zzhkg.zza());
        zzhjx.zza().zzb(zza, zzhlw.class);
        zzhkd.zza().zzb(zzb);
        zzhkd.zza().zzb(zzc);
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        zzhlw zzhlwVar = zzhmx.zzc;
        map.put("AES_CMAC", zzhlwVar);
        map.put("AES256_CMAC", zzhlwVar);
        zzhlu zzhluVar = new zzhlu(null);
        zzhluVar.zza(32);
        zzhluVar.zzb(16);
        zzhluVar.zzc(zzhlv.zzd);
        map.put("AES256_CMAC_RAW", zzhluVar.zzd());
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjc.zza().zzb(zzd, true);
    }

    static /* synthetic */ zzhlp zzb(zzhlw zzhlwVar, Integer num) throws GeneralSecurityException {
        zze(zzhlwVar);
        zzhlo zzhloVar = new zzhlo(null);
        zzhloVar.zza(zzhlwVar);
        zzhloVar.zzb(zzhyg.zzb(zzhlwVar.zzc()));
        zzhloVar.zzc(num);
        return zzhloVar.zzd();
    }

    static /* synthetic */ zzhlx zzc(zzhlp zzhlpVar) throws GeneralSecurityException {
        zze(zzhlpVar.zzf());
        return zzhnf.zza(zzhlpVar);
    }

    static /* synthetic */ zzhbo zzd(zzhlp zzhlpVar) throws GeneralSecurityException {
        zze(zzhlpVar.zzf());
        return zzhxu.zza(zzhlpVar);
    }

    private static void zze(zzhlw zzhlwVar) throws GeneralSecurityException {
        if (zzhlwVar.zzc() == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
