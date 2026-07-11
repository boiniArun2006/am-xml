package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzhxz implements zzhbs {
    private final RSAPublicKey zza;
    private final zzhxn zzb;
    private final zzhxn zzc;
    private final int zzd;
    private final byte[] zze;
    private final byte[] zzf;

    private final void zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.zza;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = modulus.bitLength() + 7;
        int iBitLength2 = modulus.bitLength() + 6;
        if (iBitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrZzb = zzhig.zzb(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        zzhxn zzhxnVar = this.zzb;
        zzhyc.zzb(zzhxnVar);
        zzhxe zzhxeVar = zzhxe.zzd;
        MessageDigest messageDigest = (MessageDigest) zzhxeVar.zzb(zzhyb.zzb(zzhxnVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.zzf;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrZzb.length;
        int i2 = this.zzd;
        if (length < digestLength + i2 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrZzb[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i3 = length - digestLength;
        int i5 = i3 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrZzb, i5);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrZzb, length2, length2 + digestLength);
        int i7 = 0;
        while (true) {
            long j2 = (((long) length) * 8) - ((long) iBitLength3);
            if (i7 < j2) {
                if (((bArrCopyOf[i7 / 8] >> (7 - (i7 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i7++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) zzhxeVar.zzb(zzhyb.zzb(this.zzc));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i5];
                int i8 = 0;
                int i9 = 0;
                while (i8 <= (i3 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    int i10 = i2;
                    messageDigest2.update(zzhig.zzb(BigInteger.valueOf(i8), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i9, Math.min(length3, i5 - i9));
                    i9 += length3;
                    i8++;
                    i2 = i10;
                    messageDigest2 = messageDigest2;
                }
                int i11 = i2;
                byte[] bArr5 = new byte[i5];
                for (int i12 = 0; i12 < i5; i12++) {
                    bArr5[i12] = (byte) (bArr4[i12] ^ bArrCopyOf[i12]);
                }
                for (int i13 = 0; i13 <= j2; i13++) {
                    int i14 = i13 / 8;
                    bArr5[i14] = (byte) ((~(1 << (7 - (i13 % 8)))) & bArr5[i14]);
                }
                int i15 = 0;
                while (true) {
                    int i16 = (i3 - i11) - 2;
                    if (i15 >= i16) {
                        if (bArr5[i16] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i5 - i11, i5);
                        int i17 = digestLength + 8;
                        byte[] bArr6 = new byte[i17 + i11];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i17, bArrCopyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i15] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i15++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
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

    /* synthetic */ zzhxz(RSAPublicKey rSAPublicKey, zzhxn zzhxnVar, zzhxn zzhxnVar2, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!zzhie.zza()) {
            zzhyc.zzb(zzhxnVar);
            if (zzhxnVar.equals(zzhxnVar2)) {
                zzhyc.zzc(rSAPublicKey.getModulus().bitLength());
                zzhyc.zzd(rSAPublicKey.getPublicExponent());
                this.zza = rSAPublicKey;
                this.zzb = zzhxnVar;
                this.zzc = zzhxnVar2;
                this.zzd = i2;
                this.zze = bArr;
                this.zzf = bArr2;
                return;
            }
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }
}
