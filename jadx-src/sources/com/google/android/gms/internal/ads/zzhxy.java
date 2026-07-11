package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhxy implements zzhbr {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }

    public static zzhbr zzb(zzhum zzhumVar) throws GeneralSecurityException {
        byte[] bArr;
        try {
            return zzhwh.zzb(zzhumVar);
        } catch (NoSuchProviderException unused) {
            RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) ((KeyFactory) zzhxe.zzf.zzb("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(zzhumVar.zze().zzd(), zzhumVar.zzd().zzd(), zzhumVar.zzi().zzb(zzhax.zza()), zzhumVar.zzf().zzb(zzhax.zza()), zzhumVar.zzh().zzb(zzhax.zza()), zzhumVar.zzj().zzb(zzhax.zza()), zzhumVar.zzk().zzb(zzhax.zza()), zzhumVar.zzl().zzb(zzhax.zza())));
            zzhuk zzhukVarZzd = zzhumVar.zzd();
            zzhiu zzhiuVar = zzhya.zza;
            zzhxn zzhxnVar = (zzhxn) zzhiuVar.zzb(zzhukVarZzd.zzf());
            zzhxn zzhxnVar2 = (zzhxn) zzhiuVar.zzb(zzhukVarZzd.zzg());
            int iZzh = zzhukVarZzd.zzh();
            byte[] bArrZzc = zzhumVar.zze().zze().zzc();
            if (zzhumVar.zzd().zze().equals(zzhuj.zzc)) {
                bArr = zzb;
            } else {
                bArr = zza;
            }
            return new zzhxx(rSAPrivateCrtKey, zzhxnVar, zzhxnVar2, iZzh, bArrZzc, bArr, null);
        }
    }
}
