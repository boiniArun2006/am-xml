package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhxw implements zzhbs {
    static final zzhiu zza;
    private static final byte[] zzb = new byte[0];
    private static final byte[] zzc = {0};

    static {
        zzhit zzhitVarZza = zzhiu.zza();
        zzhitVarZza.zza(zzhxn.SHA256, zzhtw.zza);
        zzhitVarZza.zza(zzhxn.SHA384, zzhtw.zzb);
        zzhitVarZza.zza(zzhxn.SHA512, zzhtw.zzc);
        zza = zzhitVarZza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }

    public static zzhbs zzb(zzhuc zzhucVar) throws GeneralSecurityException {
        byte[] bArr;
        try {
            return zzhvz.zzd(zzhucVar);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) zzhxe.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhucVar.zzd(), zzhucVar.zzf().zzd()));
            zzhxn zzhxnVar = (zzhxn) zza.zzb(zzhucVar.zzf().zzf());
            byte[] bArrZzc = zzhucVar.zze().zzc();
            if (zzhucVar.zzf().zze().equals(zzhtx.zzc)) {
                bArr = zzc;
            } else {
                bArr = zzb;
            }
            return new zzhxv(rSAPublicKey, zzhxnVar, bArrZzc, bArr, null);
        }
    }
}
