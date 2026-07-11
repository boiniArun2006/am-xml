package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhwh implements zzhbr {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }

    private zzhwh(RSAPrivateCrtKey rSAPrivateCrtKey, zzhui zzhuiVar, zzhui zzhuiVar2, int i2, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzhid.zza(2)) {
            zzhyc.zzc(rSAPrivateCrtKey.getModulus().bitLength());
            zzhyc.zzd(rSAPrivateCrtKey.getPublicExponent());
            zzhwi.zzc(zzhuiVar);
            zzhwi.zzd(zzhuiVar, zzhuiVar2, i2);
            return;
        }
        throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static zzhbr zzb(zzhum zzhumVar) throws GeneralSecurityException {
        byte[] bArr;
        Provider providerZzb = zzhwi.zzb();
        if (providerZzb != null) {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerZzb);
            zzhuk zzhukVarZzd = zzhumVar.zzd();
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(zzhumVar.zze().zzd(), zzhukVarZzd.zzd(), zzhumVar.zzi().zzb(zzhax.zza()), zzhumVar.zzf().zzb(zzhax.zza()), zzhumVar.zzh().zzb(zzhax.zza()), zzhumVar.zzj().zzb(zzhax.zza()), zzhumVar.zzk().zzb(zzhax.zza()), zzhumVar.zzl().zzb(zzhax.zza())));
            zzhui zzhuiVarZzf = zzhukVarZzd.zzf();
            zzhui zzhuiVarZzg = zzhukVarZzd.zzg();
            int iZzh = zzhukVarZzd.zzh();
            byte[] bArrZzc = zzhumVar.zze().zze().zzc();
            if (zzhukVarZzd.zze().equals(zzhuj.zzc)) {
                bArr = zzb;
            } else {
                bArr = zza;
            }
            return new zzhwh(rSAPrivateCrtKey, zzhuiVarZzf, zzhuiVarZzg, iZzh, bArrZzc, bArr, providerZzb);
        }
        throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
    }
}
