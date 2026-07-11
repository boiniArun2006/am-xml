package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzqg {
    private static final ThreadLocal<SecureRandom> zza = new zzqf();

    static /* synthetic */ SecureRandom zza() {
        SecureRandom secureRandomZzb = zzb();
        secureRandomZzb.nextLong();
        return secureRandomZzb;
    }

    public static byte[] zza(int i2) {
        byte[] bArr = new byte[i2];
        zza.get().nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom zzb() {
        Provider providerZza = zzng.zza();
        if (providerZza != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider providerZzb = zzng.zzb();
        if (providerZzb != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerZzb);
            } catch (GeneralSecurityException unused2) {
            }
        }
        return new SecureRandom();
    }
}
