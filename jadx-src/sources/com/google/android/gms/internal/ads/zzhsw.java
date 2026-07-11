package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhsw {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhsu.zza, zzhsr.class, zzhbr.class);
    private static final zzhku zzc = zzhku.zzd(zzhsv.zza, zzhsx.class, zzhbs.class);
    private static final zzhbq zzd = zzhjl.zzf("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zzhbr.class, zzhpp.zzg());
    private static final zzhba zze = zzhjl.zze("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", zzhbs.class, zzhqb.ASYMMETRIC_PUBLIC, zzhpr.zzg());
    private static final zzhjy zzf = zzhst.zza;
    private static final zzhjb zzg = zzhss.zza;

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i2 = zzhvm.zza;
        zzhvm.zza(zzhkg.zza());
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("ED25519", zzhsq.zzb(zzhsp.zza));
        zzhsp zzhspVar = zzhsp.zzd;
        map.put("ED25519_RAW", zzhsq.zzb(zzhspVar));
        map.put("ED25519WithRawOutput", zzhsq.zzb(zzhspVar));
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjx.zza().zzb(zzg, zzhsq.class);
        zzhjz.zza().zzb(zzf, zzhsq.class);
        zzhkd.zza().zzb(zzb);
        zzhkd.zza().zzb(zzc);
        zzhjc.zza().zzb(zzd, true);
        zzhjc.zza().zzb(zze, false);
    }
}
