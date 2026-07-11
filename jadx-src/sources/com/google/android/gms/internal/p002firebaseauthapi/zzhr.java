package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhr {
    private static final zzix.zza zza = zzix.zza.zzb;
    private final SecretKey zzb;

    public final byte[] zza(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i2 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgu.zza(bArr);
        Cipher cipherZza = zzgu.zza();
        cipherZza.init(2, this.zzb, algorithmParameterSpecZza);
        if (bArr3 != null && bArr3.length != 0) {
            cipherZza.updateAAD(bArr3);
        }
        return cipherZza.doFinal(bArr2, i2, bArr2.length - i2);
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgu.zza(bArr);
        Cipher cipherZza = zzgu.zza();
        cipherZza.init(1, this.zzb, algorithmParameterSpecZza);
        if (bArr3 != null && bArr3.length != 0) {
            cipherZza.updateAAD(bArr3);
        }
        int outputSize = cipherZza.getOutputSize(bArr2.length);
        if (outputSize > Integer.MAX_VALUE - i2) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i2 + outputSize];
        if (cipherZza.doFinal(bArr2, 0, bArr2.length, bArr4, i2) == outputSize) {
            return bArr4;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    public zzhr(byte[] bArr) throws GeneralSecurityException {
        if (zza.zza()) {
            this.zzb = zzgu.zzb(bArr);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
