package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhy {
    private static final zzix.zza zza = zzix.zza.zza;
    private final SecretKey zzb;

    public static zzhy zza(byte[] bArr) throws GeneralSecurityException {
        return new zzhy(bArr);
    }

    public static boolean zza() {
        return zzhk.zza() != null;
    }

    private zzhy(byte[] bArr) throws GeneralSecurityException {
        if (zza.zza()) {
            if (zza()) {
                if (bArr.length == 32) {
                    this.zzb = new SecretKeySpec(bArr, "ChaCha20");
                    return;
                }
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, int i2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr2 != null) {
            if (bArr.length == 12) {
                if (bArr2.length >= i2 + 16) {
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                    Cipher cipherZza = zzhk.zza();
                    cipherZza.init(2, this.zzb, ivParameterSpec);
                    if (bArr3 != null && bArr3.length != 0) {
                        cipherZza.updateAAD(bArr3);
                    }
                    return cipherZza.doFinal(bArr2, i2, bArr2.length - i2);
                }
                throw new GeneralSecurityException("ciphertext too short");
            }
            throw new GeneralSecurityException("nonce length must be 12 bytes.");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
