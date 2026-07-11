package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhne implements zzhlx {
    public static zzhlx zza(zzhlp zzhlpVar, Provider provider) throws GeneralSecurityException {
        return new zzhne(zzhlpVar, provider);
    }

    private zzhne(zzhlp zzhlpVar, Provider provider) throws GeneralSecurityException {
        if (zzhid.zza(1)) {
            try {
                Mac.getInstance("AESCMAC", provider);
                zzhlpVar.zze().zzc();
                zzhlpVar.zzf();
                new SecretKeySpec(zzhlpVar.zzd().zzc(zzhax.zza()), "AES");
                return;
            } catch (NoSuchAlgorithmException e2) {
                throw new GeneralSecurityException("AES-CMAC not available.", e2);
            }
        }
        throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
    }
}
