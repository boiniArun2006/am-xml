package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhc implements zzbe {
    private static final byte[] zza = zzzr.zza("7a806c");
    private static final byte[] zzb = zzzr.zza("46bb91c3c5");
    private static final byte[] zzc = zzzr.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzzr.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzzr.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private final zzhb<Cipher> zzf;
    private final SecretKey zzg;
    private final byte[] zzh;

    public static zzbe zza(zzeb zzebVar, zzhb<Cipher> zzhbVar) throws GeneralSecurityException {
        if (zza(zzhbVar.zza())) {
            return new zzhc(zzebVar.zzf().zza(zzbj.zza()), zzebVar.zzd().zzb(), zzhbVar);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherZza = this.zzf.zza();
        int length = bArr.length;
        byte[] bArr3 = this.zzh;
        if (length > 2147483619 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + bArr.length + 16);
        byte[] bArrZza = zzqg.zza(12);
        System.arraycopy(bArrZza, 0, bArrCopyOf, this.zzh.length, 12);
        cipherZza.init(1, this.zzg, zza(bArrZza, 0, bArrZza.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        int iDoFinal = cipherZza.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.zzh.length + 12);
        if (iDoFinal == bArr.length + 16) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException(String.format("encryption failed; AES-GCM-SIV tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }

    private zzhc(byte[] bArr, byte[] bArr2, zzhb<Cipher> zzhbVar) throws GeneralSecurityException {
        this.zzh = bArr2;
        zzzz.zza(bArr.length);
        this.zzg = new SecretKeySpec(bArr, "AES");
        this.zzf = zzhbVar;
    }

    private static AlgorithmParameterSpec zza(byte[] bArr, int i2, int i3) {
        return new GCMParameterSpec(128, bArr, i2, i3);
    }

    public static boolean zza(Cipher cipher) {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new SecretKeySpec(zzc, "AES"), zza(bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzh;
        if (length >= bArr3.length + 28) {
            if (zzqq.zza(bArr3, bArr)) {
                Cipher cipherZza = this.zzf.zza();
                cipherZza.init(2, this.zzg, zza(bArr, this.zzh.length, 12));
                if (bArr2 != null && bArr2.length != 0) {
                    cipherZza.updateAAD(bArr2);
                }
                byte[] bArr4 = this.zzh;
                return cipherZza.doFinal(bArr, bArr4.length + 12, (bArr.length - bArr4.length) - 12);
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
