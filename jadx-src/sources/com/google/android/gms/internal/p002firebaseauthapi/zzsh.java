package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzsh implements zzqz {
    private static final zzix.zza zza = zzix.zza.zza;

    public zzsh(zzqp zzqpVar) throws GeneralSecurityException {
        if (zza.zza()) {
        } else {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
