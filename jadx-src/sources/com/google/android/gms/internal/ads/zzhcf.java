package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhcf {
    public static final /* synthetic */ int zza = 0;
    private static final zzhix zzb = zzb();

    private static zzhix zzb() {
        try {
            zzhkv zzhkvVarZza = zzhky.zza();
            zzhcl.zzd(zzhkvVarZza);
            zzhkvVarZza.zza(zzhku.zzd(zzhcd.zza, zzhcn.class, zzhas.class));
            zzhkvVarZza.zza(zzhku.zzd(zzhcb.zza, zzhdf.class, zzhas.class));
            zzhkvVarZza.zza(zzhku.zzd(zzhcc.zza, zzhdo.class, zzhas.class));
            zzhkvVarZza.zza(zzhku.zzd(zzhca.zza, zzhcx.class, zzhas.class));
            zzhkvVarZza.zza(zzhku.zzd(zzhbz.zza, zzhdw.class, zzhas.class));
            zzhkvVarZza.zza(zzhku.zzd(zzhby.zza, zzhfr.class, zzhas.class));
            zzhkvVarZza.zza(zzhku.zzd(zzhce.zza, zzhfl.class, zzhas.class));
            return zzhix.zzb(zzhkvVarZza.zzc());
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static zzhaw zza() throws GeneralSecurityException {
        if (!zzhie.zza()) {
            return zzb;
        }
        throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
    }
}
