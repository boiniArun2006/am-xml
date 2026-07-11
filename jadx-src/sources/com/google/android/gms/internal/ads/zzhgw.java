package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzhgw implements zzhas {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = zzhxo.zza("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    private static final byte[] zzc = zzhxo.zza("070000004041424344454647");
    private static final byte[] zzd = zzhxo.zza("a0784d7a4716f3feb4f64e7f4b39bf04");
    private final SecretKey zze;
    private final byte[] zzf;
    private final Provider zzg;

    static Cipher zzc() throws GeneralSecurityException {
        Cipher cipher = (Cipher) zzhxe.zza.zzb("ChaCha20-Poly1305");
        if (zze(cipher)) {
            return cipher;
        }
        throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    private static boolean zze(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(zzc);
            byte[] bArr = zzb;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = zzd;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzf;
        int length = bArr.length;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, length2, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Provider provider = this.zzg;
        SecretKey secretKey = this.zze;
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
        cipher.init(2, secretKey, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }

    private zzhgw(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzhid.zza(1)) {
            if (bArr.length == 32) {
                this.zze = new SecretKeySpec(bArr, "ChaCha20");
                this.zzf = bArr2;
                this.zzg = provider;
                return;
            }
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static zzhas zzb(zzhdw zzhdwVar) throws GeneralSecurityException {
        return new zzhgw(zzhdwVar.zze().zzc(zzhax.zza()), zzhdwVar.zzc().zzc(), zzc().getProvider());
    }

    public static boolean zzd() {
        try {
            zzc();
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
