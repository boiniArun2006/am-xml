package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhda {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhcy.zza, zzhcx.class, zzhas.class);
    private static final zzhba zzc = zzhjl.zze("type.googleapis.com/google.crypto.tink.AesEaxKey", zzhas.class, zzhqb.SYMMETRIC, zzhom.zzg());
    private static final zzhjb zzd = zzhcz.zza;

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i2 = zzhgh.zza;
        zzhgh.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("AES128_EAX", zzhfk.zzc);
        zzhdb zzhdbVar = new zzhdb(null);
        zzhdbVar.zzb(16);
        zzhdbVar.zza(16);
        zzhdbVar.zzc(16);
        zzhdc zzhdcVar = zzhdc.zzc;
        zzhdbVar.zzd(zzhdcVar);
        map.put("AES128_EAX_RAW", zzhdbVar.zze());
        map.put("AES256_EAX", zzhfk.zzd);
        zzhdb zzhdbVar2 = new zzhdb(null);
        zzhdbVar2.zzb(16);
        zzhdbVar2.zza(32);
        zzhdbVar2.zzc(16);
        zzhdbVar2.zzd(zzhdcVar);
        map.put("AES256_EAX_RAW", zzhdbVar2.zze());
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjx.zza().zzb(zzd, zzhdd.class);
        zzhjc.zza().zzb(zzc, true);
    }
}
