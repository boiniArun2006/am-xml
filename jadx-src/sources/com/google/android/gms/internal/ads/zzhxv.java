package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzhxv implements zzhbs {
    private final RSAPublicKey zza;
    private final zzhxn zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza;
        int i2;
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrZzb = zzhig.zzb(bigInteger.modPow(publicExponent, modulus), iBitLength);
        zzhxn zzhxnVar = this.zzb;
        zzhyc.zzb(zzhxnVar);
        MessageDigest messageDigest = (MessageDigest) zzhxe.zzd.zzb(zzhyb.zzb(zzhxnVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzd;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = zzhxnVar.ordinal();
        int i3 = 2;
        if (iOrdinal == 2) {
            bArrZza = zzhxo.zza("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrZza = zzhxo.zza("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(zzhxnVar.toString()));
            }
            bArrZza = zzhxo.zza("3051300d060960864801650304020305000440");
        }
        if (iBitLength < bArrZza.length + bArrDigest.length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i5 = 0;
        while (true) {
            i2 = i3 + 1;
            if (i5 >= (iBitLength - r5) - 3) {
                break;
            }
            bArr4[i3] = -1;
            i5++;
            i3 = i2;
        }
        bArr4[i3] = 0;
        int length = bArrZza.length;
        System.arraycopy(bArrZza, 0, bArr4, i2, length);
        System.arraycopy(bArrDigest, 0, bArr4, i2 + length, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrZzb, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzc;
        int length = bArr3.length;
        if (length == 0) {
            zzb(bArr, bArr2);
        } else {
            if (!zzhln.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            zzb(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    /* synthetic */ zzhxv(RSAPublicKey rSAPublicKey, zzhxn zzhxnVar, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!zzhie.zza()) {
            zzhyc.zzb(zzhxnVar);
            zzhyc.zzc(rSAPublicKey.getModulus().bitLength());
            zzhyc.zzd(rSAPublicKey.getPublicExponent());
            this.zza = rSAPublicKey;
            this.zzb = zzhxnVar;
            this.zzc = bArr;
            this.zzd = bArr2;
            return;
        }
        throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
    }
}
