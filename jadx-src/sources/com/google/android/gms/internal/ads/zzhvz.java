package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhvz implements zzhbs {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final Provider zzg;

    public static String zzc(zzhtw zzhtwVar) throws GeneralSecurityException {
        if (zzhtwVar == zzhtw.zza) {
            return "SHA256withRSA";
        }
        if (zzhtwVar == zzhtw.zzb) {
            return "SHA384withRSA";
        }
        if (zzhtwVar == zzhtw.zzc) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static zzhbs zze(zzhuc zzhucVar, Provider provider) throws GeneralSecurityException {
        return new zzhvz((RSAPublicKey) KeyFactory.getInstance("RSA", provider).generatePublic(new RSAPublicKeySpec(zzhucVar.zzd(), zzhucVar.zzf().zzd())), zzhucVar.zzf().zzf(), zzhucVar.zze().zzc(), zzhucVar.zzf().zze().equals(zzhtx.zzc) ? zzb : zza, provider);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zze;
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.zzd;
        Provider provider = this.zzg;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.update(bArr2);
        byte[] bArr4 = this.zzf;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }

    private zzhvz(RSAPublicKey rSAPublicKey, zzhtw zzhtwVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzhid.zza(2)) {
            zzhyc.zzc(rSAPublicKey.getModulus().bitLength());
            zzhyc.zzd(rSAPublicKey.getPublicExponent());
            this.zzc = rSAPublicKey;
            this.zzd = zzc(zzhtwVar);
            this.zze = bArr;
            this.zzf = bArr2;
            this.zzg = provider;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
    }

    static Provider zzb() {
        if (zzhln.zzc()) {
            zzhln.zzd().getClass();
        }
        return zzhih.zza();
    }

    public static zzhbs zzd(zzhuc zzhucVar) throws GeneralSecurityException {
        Provider providerZzb = zzb();
        if (providerZzb != null) {
            return zze(zzhucVar, providerZzb);
        }
        throw new NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
    }
}
