package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class zzhxx implements zzhbr {
    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }

    /* synthetic */ zzhxx(RSAPrivateCrtKey rSAPrivateCrtKey, zzhxn zzhxnVar, zzhxn zzhxnVar2, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!zzhie.zza()) {
            zzhyc.zzb(zzhxnVar);
            if (zzhxnVar.equals(zzhxnVar2)) {
                zzhyc.zzc(rSAPrivateCrtKey.getModulus().bitLength());
                zzhyc.zzd(rSAPrivateCrtKey.getPublicExponent());
                return;
            }
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }
}
