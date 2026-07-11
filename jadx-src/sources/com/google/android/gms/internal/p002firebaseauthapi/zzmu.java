package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzmu implements zzms {
    private static final byte[] zza = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    private static final byte[] zzb = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    private final Provider zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzms
    public final zzmv zza() throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH", this.zzc);
        keyPairGenerator.initialize(255);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] encoded = keyPairGenerateKeyPair.getPrivate().getEncoded();
        int length = encoded.length;
        byte[] bArr = zza;
        if (length != bArr.length + 32) {
            throw new GeneralSecurityException("Invalid encoded private key length");
        }
        if (!zzqq.zza(bArr, encoded)) {
            throw new GeneralSecurityException("Invalid encoded private key prefix");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, bArr.length, encoded.length);
        byte[] encoded2 = keyPairGenerateKeyPair.getPublic().getEncoded();
        int length2 = encoded2.length;
        byte[] bArr2 = zzb;
        if (length2 != bArr2.length + 32) {
            throw new GeneralSecurityException("Invalid encoded public key length");
        }
        if (zzqq.zza(bArr2, encoded2)) {
            return new zzmv(bArrCopyOfRange, Arrays.copyOfRange(encoded2, bArr2.length, encoded2.length));
        }
        throw new GeneralSecurityException("Invalid encoded public key prefix");
    }

    private zzmu(Provider provider) {
        this.zzc = provider;
    }

    public static zzms zzb() throws GeneralSecurityException {
        Provider providerZza = zzng.zza();
        if (providerZza != null) {
            KeyFactory.getInstance("XDH", providerZza);
            KeyAgreement.getInstance("XDH", providerZza);
            zzmu zzmuVar = new zzmu(providerZza);
            zzmuVar.zza();
            return zzmuVar;
        }
        throw new GeneralSecurityException("Conscrypt is not available.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzms
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        KeyFactory keyFactory = KeyFactory.getInstance("XDH", this.zzc);
        if (bArr.length == 32) {
            PrivateKey privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(zzyt.zza(zza, bArr)));
            if (bArr2.length == 32) {
                PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(zzyt.zza(zzb, bArr2)));
                KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH", this.zzc);
                keyAgreement.init(privateKeyGeneratePrivate);
                keyAgreement.doPhase(publicKeyGeneratePublic, true);
                return keyAgreement.generateSecret();
            }
            throw new InvalidKeyException("Invalid X25519 public key");
        }
        throw new InvalidKeyException("Invalid X25519 private key");
    }
}
