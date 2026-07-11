package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzck {
    private static final zzck zza = new zzck();

    private zzck() {
    }

    static zzck zza() {
        return zza;
    }

    public static zzck zza(zzck zzckVar) throws GeneralSecurityException {
        if (zzckVar != null) {
            return zzckVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
