package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzcc {
    public static zzbq zza(zzby zzbyVar, zzck zzckVar) throws GeneralSecurityException, IOException {
        if (zzckVar != null) {
            return zzbq.zza(zzbyVar.zzb());
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }

    public static void zza(zzbq zzbqVar, zzbx zzbxVar, zzck zzckVar) throws IOException {
        if (zzckVar != null) {
            zzbxVar.zza(zzbqVar.zzd());
            return;
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }
}
