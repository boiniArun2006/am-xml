package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhwv implements zzhbs {
    private final zzhye zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public static zzhbs zzb(zzhsx zzhsxVar) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhvo.zzb(zzhsxVar);
        } catch (GeneralSecurityException unused) {
            return new zzhwv(zzhsxVar.zzd().zzc(), zzhsxVar.zze().zzc(), zzhsxVar.zzf().zzc().equals(zzhsp.zzc) ? new byte[]{0} : new byte[0]);
        }
    }

    private final void zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
        }
        if (!zzhio.zzc(bArr2, bArr, this.zza.zzc())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhln.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.zzc;
            if (bArr4.length != 0) {
                bArr2 = zzhwr.zza(bArr2, bArr4);
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    private zzhwv(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (zzhid.zza(1)) {
            if (bArr.length == 32) {
                this.zza = zzhye.zza(bArr);
                this.zzb = bArr2;
                this.zzc = bArr3;
                zzhio.zzd();
                return;
            }
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
    }
}
