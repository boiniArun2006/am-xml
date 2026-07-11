package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhei {
    public static final /* synthetic */ int zza = 0;
    private static final zzhba zzb = zzhjl.zze("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzhas.class, zzhqb.SYMMETRIC, zzhqv.zze());
    private static final zzhjb zzc = zzheh.zza;
    private static final zzhku zzd = zzhku.zzd(zzheg.zza, zzher.class, zzhas.class);

    public static void zza(boolean z2) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i2 = zzhfa.zza;
        zzhfa.zza(zzhkg.zza());
        zzhjx.zza().zzb(zzc, zzhev.class);
        zzhkd.zza().zzb(zzd);
        zzhjc.zza().zzb(zzb, true);
    }
}
