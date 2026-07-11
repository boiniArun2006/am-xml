package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhds {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhdp.zza, zzhdo.class, zzhas.class);
    private static final zzhjb zzc = zzhdr.zza;
    private static final zzhjy zzd = zzhdq.zza;
    private static final zzhba zze = zzhjl.zze("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzhas.class, zzhqb.SYMMETRIC, zzhow.zze());

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i2 = zzhgv.zza;
        zzhgv.zza(zzhkg.zza());
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        zzhdt zzhdtVar = new zzhdt(null);
        zzhdtVar.zza(16);
        zzhdu zzhduVar = zzhdu.zza;
        zzhdtVar.zzb(zzhduVar);
        map.put("AES128_GCM_SIV", zzhdtVar.zzc());
        zzhdt zzhdtVar2 = new zzhdt(null);
        zzhdtVar2.zza(16);
        zzhdu zzhduVar2 = zzhdu.zzc;
        zzhdtVar2.zzb(zzhduVar2);
        map.put("AES128_GCM_SIV_RAW", zzhdtVar2.zzc());
        zzhdt zzhdtVar3 = new zzhdt(null);
        zzhdtVar3.zza(32);
        zzhdtVar3.zzb(zzhduVar);
        map.put("AES256_GCM_SIV", zzhdtVar3.zzc());
        zzhdt zzhdtVar4 = new zzhdt(null);
        zzhdtVar4.zza(32);
        zzhdtVar4.zzb(zzhduVar2);
        map.put("AES256_GCM_SIV_RAW", zzhdtVar4.zzc());
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjz.zza().zzb(zzd, zzhdv.class);
        zzhjx.zza().zzb(zzc, zzhdv.class);
        zzhkd.zza().zzb(zzb);
        zzhjc.zza().zzb(zze, true);
    }
}
