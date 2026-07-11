package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhcr {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhcq.zza, zzhcn.class, zzhas.class);
    private static final zzhba zzc = zzhjl.zze("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzhas.class, zzhqb.SYMMETRIC, zzhoc.zzg());
    private static final zzhjy zzd = zzhcp.zza;
    private static final zzhjb zze = zzhco.zza;
    private static final int zzf = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzf;
        if (!zzhid.zza(i2)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = zzhgc.zza;
        zzhgc.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzhfk.zze);
        zzhcs zzhcsVar = new zzhcs(null);
        zzhcsVar.zza(16);
        zzhcsVar.zzb(32);
        zzhcsVar.zzd(16);
        zzhcsVar.zzc(16);
        zzhct zzhctVar = zzhct.zzc;
        zzhcsVar.zzf(zzhctVar);
        zzhcu zzhcuVar = zzhcu.zzc;
        zzhcsVar.zze(zzhcuVar);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzhcsVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", zzhfk.zzf);
        zzhcs zzhcsVar2 = new zzhcs(null);
        zzhcsVar2.zza(32);
        zzhcsVar2.zzb(32);
        zzhcsVar2.zzd(32);
        zzhcsVar2.zzc(16);
        zzhcsVar2.zzf(zzhctVar);
        zzhcsVar2.zze(zzhcuVar);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzhcsVar2.zzg());
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjz.zza().zzb(zzd, zzhcv.class);
        zzhjx.zza().zzb(zze, zzhcv.class);
        zzhjc.zza().zzf(zzc, i2, true);
    }
}
