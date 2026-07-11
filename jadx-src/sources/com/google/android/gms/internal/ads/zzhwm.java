package com.google.android.gms.internal.ads;

import androidx.work.impl.constraints.controllers.qRl.FijIa;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhwm implements zzhas {
    private static final ThreadLocal zza = new zzhwl();
    private final byte[] zzb;
    private final zzhnp zzc;
    private final SecretKeySpec zzd;
    private final int zze;

    public static zzhas zzb(zzhcx zzhcxVar) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        zzhcxVar.zzf();
        return new zzhwm(zzhcxVar.zze().zzc(zzhax.zza()), zzhcxVar.zzf().zzd(), zzhcxVar.zzc().zzc());
    }

    private final byte[] zzc(int i2, byte[] bArr, int i3, int i5) throws GeneralSecurityException {
        byte[] bArr2 = new byte[i5 + 16];
        bArr2[15] = (byte) i2;
        System.arraycopy(bArr, i3, bArr2, 16, i5);
        return this.zzc.zza(bArr2, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        int length2 = bArr3.length;
        int i2 = this.zze;
        int i3 = ((length - length2) - i2) - 16;
        if (i3 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException(FijIa.BjlrdMEGdYWQPL);
        }
        byte[] bArrZzc = zzc(0, bArr, length2, i2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrZzc2 = zzc(1, bArr2, 0, bArr2.length);
        byte[] bArrZzc3 = zzc(2, bArr, length2 + i2, i3);
        int i5 = length - 16;
        byte b2 = 0;
        for (int i7 = 0; i7 < 16; i7++) {
            b2 = (byte) (b2 | (((bArr[i5 + i7] ^ bArrZzc2[i7]) ^ bArrZzc[i7]) ^ bArrZzc3[i7]));
        }
        if (b2 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, this.zzd, new IvParameterSpec(bArrZzc));
        return cipher.doFinal(bArr, bArr3.length + i2, i3);
    }

    private zzhwm(byte[] bArr, int i2, byte[] bArr2) throws GeneralSecurityException {
        if (zzhid.zza(1)) {
            if (i2 != 12 && i2 != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.zze = i2;
            int length = bArr.length;
            zzhyc.zza(length);
            this.zzd = new SecretKeySpec(bArr, "AES");
            this.zzc = zzhxr.zzb(zzhnn.zzc(zzhno.zzb(length), zzhyg.zza(bArr, zzhax.zza())));
            this.zzb = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }
}
