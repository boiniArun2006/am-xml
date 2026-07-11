package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhhl implements zzhas {
    private final byte[] zza;
    private final int zzb;
    private final zzhnp zzc;

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zza;
        int i2 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i3 = i2 + length2;
        if (length < i3 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i3);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        zzhnp zzhnpVar = this.zzc;
        byte[] bArr6 = new byte[32];
        System.arraycopy(zzhnpVar.zza(bArr4, 16), 0, bArr6, 0, 16);
        System.arraycopy(zzhnpVar.zza(bArr5, 16), 0, bArr6, 16, 16);
        if (!zzhid.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        SecretKey secretKeyZzb = zzhgj.zzb(bArr6);
        int i5 = i3 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i3, i5);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i3 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZzc = zzhgj.zzc(bArrCopyOfRange2, 0, 12);
        Cipher cipherZza = zzhgj.zza();
        cipherZza.init(2, secretKeyZzb, algorithmParameterSpecZzc);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        return cipherZza.doFinal(bArr, i5, length - i5);
    }

    private zzhhl(byte[] bArr, zzhye zzhyeVar, int i2) throws GeneralSecurityException {
        this.zzc = zzhxr.zzb(zzhnn.zzc(zzhno.zzb(bArr.length), zzhyg.zza(bArr, zzhax.zza())));
        this.zza = zzhyeVar.zzc();
        this.zzb = i2;
    }

    public static zzhas zzb(zzhfl zzhflVar) throws GeneralSecurityException {
        zzhflVar.zzf();
        zzhflVar.zzf();
        return new zzhhl(zzhflVar.zze().zzc(zzhax.zza()), zzhflVar.zzc(), zzhflVar.zzf().zzd());
    }
}
