package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhgj {
    private static final ThreadLocal zza = new zzhgi();

    public static SecretKey zzb(byte[] bArr) throws GeneralSecurityException {
        zzhyc.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static Cipher zza() {
        return (Cipher) zza.get();
    }

    public static AlgorithmParameterSpec zzc(byte[] bArr, int i2, int i3) {
        zzhln.zzd();
        return new GCMParameterSpec(128, bArr, i2, 12);
    }
}
