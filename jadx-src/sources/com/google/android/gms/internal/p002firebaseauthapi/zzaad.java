package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class zzaad {
    private final BigInteger zza;

    public static zzaad zza(BigInteger bigInteger, zzck zzckVar) {
        if (zzckVar != null) {
            return new zzaad(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    private zzaad(BigInteger bigInteger) {
        this.zza = bigInteger;
    }

    public final BigInteger zza(zzck zzckVar) {
        if (zzckVar != null) {
            return this.zza;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
