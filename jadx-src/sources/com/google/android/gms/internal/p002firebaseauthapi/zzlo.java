package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdz;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzlo implements zzlq {
    private final int zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlq
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlq
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i2) throws GeneralSecurityException {
        if (bArr2.length < i2) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (bArr.length != this.zza) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKey secretKeyZzb = zzgu.zzb(bArr);
        int i3 = i2 + 12;
        if (bArr2.length < i2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgu.zza(bArr2, i2, 12);
        Cipher cipherZza = zzgu.zza();
        cipherZza.init(2, secretKeyZzb, algorithmParameterSpecZza);
        return cipherZza.doFinal(bArr2, i3, (bArr2.length - i2) - 12);
    }

    public zzlo(zzdz zzdzVar) throws GeneralSecurityException {
        if (zzdzVar.zzb() == 12) {
            if (zzdzVar.zzd() == 16) {
                if (zzdzVar.zzf() == zzdz.zzb.zzc) {
                    this.zza = zzdzVar.zzc();
                    return;
                }
                throw new GeneralSecurityException("invalid variant");
            }
            throw new GeneralSecurityException("invalid tag size");
        }
        throw new GeneralSecurityException("invalid IV size");
    }
}
