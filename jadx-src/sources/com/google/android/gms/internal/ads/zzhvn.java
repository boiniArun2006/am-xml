package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhvn implements zzhbr {
    private static final byte[] zza = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }

    private zzhvn(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (zzhid.zza(1)) {
            if (bArr.length == 32) {
                KeyFactory.getInstance("Ed25519", provider).generatePrivate(new PKCS8EncodedKeySpec(zzhwr.zza(zza, bArr)));
                return;
            }
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    public static zzhbr zzb(zzhsr zzhsrVar) throws GeneralSecurityException {
        byte[] bArr;
        Provider providerZza = zzhih.zza();
        if (providerZza != null) {
            byte[] bArrZzc = zzhsrVar.zzf().zzc(zzhax.zza());
            byte[] bArrZzc2 = zzhsrVar.zze().zze().zzc();
            if (zzhsrVar.zzd().zzc().equals(zzhsp.zzc)) {
                bArr = new byte[]{0};
            } else {
                bArr = new byte[0];
            }
            return new zzhvn(bArrZzc, bArrZzc2, bArr, providerZza);
        }
        throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
    }
}
