package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhve implements zzhbr {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }

    private zzhve(ECPrivateKey eCPrivateKey, zzhxn zzhxnVar, zzhwx zzhwxVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzhid.zza(2)) {
            zzhyb.zza(zzhxnVar);
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }

    public static zzhbr zzb(zzhsi zzhsiVar) throws GeneralSecurityException {
        KeyFactory keyFactory;
        byte[] bArr;
        Provider providerZza = zzhih.zza();
        zzhxn zzhxnVar = (zzhxn) zzhvf.zza.zzb(zzhsiVar.zzd().zze());
        zzhwx zzhwxVar = (zzhwx) zzhvf.zzb.zzb(zzhsiVar.zzd().zzc());
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(zzhsiVar.zzf().zzb(zzhax.zza()), zzhwy.zzb((zzhww) zzhvf.zzc.zzb(zzhsiVar.zzd().zzd())));
        if (providerZza != null) {
            keyFactory = KeyFactory.getInstance("EC", providerZza);
        } else {
            keyFactory = (KeyFactory) zzhxe.zzf.zzb("EC");
        }
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyFactory.generatePrivate(eCPrivateKeySpec);
        byte[] bArrZzc = zzhsiVar.zze().zze().zzc();
        if (zzhsiVar.zzd().zzf().equals(zzhsf.zzc)) {
            bArr = zzb;
        } else {
            bArr = zza;
        }
        return new zzhve(eCPrivateKey, zzhxnVar, zzhwxVar, bArrZzc, bArr, providerZza);
    }
}
