package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhdz {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhdy.zza, zzhdw.class, zzhas.class);
    private static final zzhjb zzc = zzhdx.zza;
    private static final zzhba zzd = zzhjl.zze("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzhas.class, zzhqb.SYMMETRIC, zzhpa.zze());

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i2 = zzhhb.zza;
        zzhhb.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhjx.zza().zzb(zzc, zzheb.class);
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", zzheb.zzb(zzhea.zza));
        map.put("CHACHA20_POLY1305_RAW", zzheb.zzb(zzhea.zzc));
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjc.zza().zzb(zzd, true);
    }
}
