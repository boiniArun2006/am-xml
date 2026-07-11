package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzys implements zzbe {
    private static final zzix.zza zza = zzix.zza.zzb;
    private final SecretKey zzb;
    private final byte[] zzc;

    public static zzbe zza(zzds zzdsVar) throws GeneralSecurityException {
        if (((zzdz) ((zzcx) zzdsVar.zza())).zzb() != 12) {
            throw new GeneralSecurityException("Expected IV Size 12, got " + ((zzdz) ((zzcx) zzdsVar.zza())).zzb());
        }
        if (((zzdz) ((zzcx) zzdsVar.zza())).zzd() == 16) {
            return new zzys(zzdsVar.zzf().zza(zzbj.zza()), zzdsVar.zzd());
        }
        throw new GeneralSecurityException("Expected tag Size 16, got " + ((zzdz) ((zzcx) zzdsVar.zza())).zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrZza = zzqg.zza(12);
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgu.zza(bArrZza);
        Cipher cipherZza = zzgu.zza();
        cipherZza.init(1, this.zzb, algorithmParameterSpecZza);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        int outputSize = cipherZza.getOutputSize(bArr.length);
        byte[] bArr3 = this.zzc;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrZza, 0, bArrCopyOf, this.zzc.length, 12);
        if (cipherZza.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.zzc.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    private zzys(byte[] bArr, zzaae zzaaeVar) throws GeneralSecurityException {
        if (zza.zza()) {
            this.zzb = zzgu.zzb(bArr);
            this.zzc = zzaaeVar.zzb();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.zzc;
            if (length >= bArr3.length + 28) {
                if (zzqq.zza(bArr3, bArr)) {
                    AlgorithmParameterSpec algorithmParameterSpecZza = zzgu.zza(bArr, this.zzc.length, 12);
                    Cipher cipherZza = zzgu.zza();
                    cipherZza.init(2, this.zzb, algorithmParameterSpecZza);
                    if (bArr2 != null && bArr2.length != 0) {
                        cipherZza.updateAAD(bArr2);
                    }
                    byte[] bArr4 = this.zzc;
                    return cipherZza.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
