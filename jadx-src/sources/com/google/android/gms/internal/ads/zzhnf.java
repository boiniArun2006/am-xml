package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhnf implements zzhlx {
    public zzhnf(zzhlp zzhlpVar) {
    }

    public static zzhlx zza(zzhlp zzhlpVar) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerZza = zzhih.zza();
        if (providerZza != null) {
            try {
                return zzhne.zza(zzhlpVar, providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhnf(zzhlpVar);
    }
}
