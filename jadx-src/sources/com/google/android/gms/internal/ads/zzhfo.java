package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhfo {
    private static final zzhjb zza = zzhfn.zza;
    private static final zzhku zzb = zzhku.zzd(zzhfm.zza, zzhfl.class, zzhas.class);

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzhhq.zza;
        zzhhq.zza(zzhkg.zza());
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", zzhfk.zzg);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzhfk.zzh);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzhfk.zzi);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzhfk.zzj);
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhkd.zza().zzb(zzb);
        zzhjx.zza().zzb(zza, zzhfq.class);
    }
}
