package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class zzma {
    private static final byte[] zza = new byte[0];
    private final zzmb zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private BigInteger zzf = BigInteger.ZERO;

    public static zzma zza(byte[] bArr, zzmh zzmhVar, zzme zzmeVar, zzmf zzmfVar, zzmb zzmbVar, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza = zzmeVar.zza(bArr, zzmhVar);
        byte[] bArr3 = zzmn.zza;
        byte[] bArrZza2 = zzmn.zza(zzmeVar.zza(), zzmfVar.zzb(), zzmbVar.zzc());
        byte[] bArr4 = zzmn.zzl;
        byte[] bArr5 = zza;
        byte[] bArrZza3 = zzyt.zza(bArr3, zzmfVar.zza(bArr4, bArr5, "psk_id_hash", bArrZza2), zzmfVar.zza(bArr4, bArr2, "info_hash", bArrZza2));
        byte[] bArrZza4 = zzmfVar.zza(bArrZza, bArr5, "secret", bArrZza2);
        byte[] bArrZza5 = zzmfVar.zza(bArrZza4, bArrZza3, "key", bArrZza2, zzmbVar.zza());
        byte[] bArrZza6 = zzmfVar.zza(bArrZza4, bArrZza3, "base_nonce", bArrZza2, zzmbVar.zzb());
        zzmbVar.zzb();
        BigInteger bigInteger = BigInteger.ONE;
        return new zzma(bArr, bArrZza5, bArrZza6, bigInteger.shiftLeft(96).subtract(bigInteger), zzmbVar);
    }

    private zzma(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzmb zzmbVar) {
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzmbVar;
    }

    private final synchronized byte[] zza() throws GeneralSecurityException {
        byte[] bArrZza;
        bArrZza = zzyt.zza(this.zze, zznh.zza(this.zzf, this.zzb.zzb()));
        if (this.zzf.compareTo(this.zzc) < 0) {
            this.zzf = this.zzf.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return bArrZza;
    }

    final byte[] zza(byte[] bArr, int i2, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zza(this.zzd, zza(), bArr, i2, bArr2);
    }
}
