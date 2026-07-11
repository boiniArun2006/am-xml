package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhvy implements zzhbr {
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};
    private static final byte[] zzd = {1, 2, 3};
    Provider zza;
    private final RSAPrivateCrtKey zze;
    private final String zzf;
    private final byte[] zzg;
    private final byte[] zzh;
    private final zzhbs zzi;

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        Signature signature;
        Provider provider = this.zza;
        if (provider != null) {
            signature = Signature.getInstance(this.zzf, provider);
        } else {
            signature = (Signature) zzhxe.zzc.zzb(this.zzf);
        }
        signature.initSign(this.zze);
        signature.update(bArr);
        byte[] bArr2 = this.zzh;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = this.zzg;
        if (bArr3.length > 0) {
            bArrSign = zzhwr.zza(bArr3, bArrSign);
        }
        try {
            this.zzi.zza(bArrSign, bArr);
            return bArrSign;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException("RSA signature computation error", e2);
        }
    }

    private zzhvy(RSAPrivateCrtKey rSAPrivateCrtKey, zzhtw zzhtwVar, byte[] bArr, byte[] bArr2, zzhbs zzhbsVar, Provider provider) throws GeneralSecurityException {
        if (zzhid.zza(2)) {
            if (zzhtwVar != zzhtw.zza && zzhtwVar != zzhtw.zzb && zzhtwVar != zzhtw.zzc) {
                throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zzhtwVar)));
            }
            zzhyc.zzc(rSAPrivateCrtKey.getModulus().bitLength());
            zzhyc.zzd(rSAPrivateCrtKey.getPublicExponent());
            this.zze = rSAPrivateCrtKey;
            this.zzf = zzhvz.zzc(zzhtwVar);
            this.zzg = bArr;
            this.zzh = bArr2;
            this.zzi = zzhbsVar;
            this.zza = provider;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static zzhbr zzb(zzhua zzhuaVar) throws GeneralSecurityException {
        KeyFactory keyFactory;
        zzhbs zzhbsVarZzb;
        byte[] bArr;
        Provider providerZzb = zzhvz.zzb();
        if (providerZzb != null) {
            keyFactory = KeyFactory.getInstance("RSA", providerZzb);
        } else {
            keyFactory = (KeyFactory) zzhxe.zzf.zzb("RSA");
        }
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(zzhuaVar.zze().zzd(), zzhuaVar.zzd().zzd(), zzhuaVar.zzi().zzb(zzhax.zza()), zzhuaVar.zzf().zzb(zzhax.zza()), zzhuaVar.zzh().zzb(zzhax.zza()), zzhuaVar.zzj().zzb(zzhax.zza()), zzhuaVar.zzk().zzb(zzhax.zza()), zzhuaVar.zzl().zzb(zzhax.zza())));
        if (providerZzb != null) {
            zzhbsVarZzb = zzhvz.zze(zzhuaVar.zze(), providerZzb);
        } else {
            zzhbsVarZzb = zzhxw.zzb(zzhuaVar.zze());
        }
        zzhbs zzhbsVar = zzhbsVarZzb;
        zzhtw zzhtwVarZzf = zzhuaVar.zzd().zzf();
        byte[] bArrZzc = zzhuaVar.zze().zze().zzc();
        if (zzhuaVar.zzd().zze().equals(zzhtx.zzc)) {
            bArr = zzc;
        } else {
            bArr = zzb;
        }
        zzhvy zzhvyVar = new zzhvy(rSAPrivateCrtKey, zzhtwVarZzf, bArrZzc, bArr, zzhbsVar, providerZzb);
        zzhvyVar.zza(zzd);
        return zzhvyVar;
    }
}
