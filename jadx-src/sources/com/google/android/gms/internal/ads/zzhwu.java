package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhwu implements zzhbr {
    private final byte[] zza;

    public static zzhbr zzb(zzhsr zzhsrVar) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhvn.zzb(zzhsrVar);
        } catch (GeneralSecurityException unused) {
            return new zzhwu(zzhsrVar.zzf().zzc(zzhax.zza()), zzhsrVar.zze().zze().zzc(), zzhsrVar.zzd().zzc().equals(zzhsp.zzc) ? new byte[]{0} : new byte[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }

    private zzhwu(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhid.zza(1)) {
            if (bArr.length == 32) {
                byte[] bArrZzb = zzhio.zzb(bArr);
                this.zza = bArrZzb;
                zzhio.zza(bArrZzb);
                return;
            }
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }
}
