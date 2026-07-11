package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhya implements zzhbs {
    static final zzhiu zza;
    private static final byte[] zzb;
    private static final byte[] zzc;

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }

    static {
        zzhit zzhitVarZza = zzhiu.zza();
        zzhitVarZza.zza(zzhxn.SHA256, zzhui.zza);
        zzhitVarZza.zza(zzhxn.SHA384, zzhui.zzb);
        zzhitVarZza.zza(zzhxn.SHA512, zzhui.zzc);
        zza = zzhitVarZza.zzb();
        zzb = new byte[0];
        zzc = new byte[]{0};
    }

    public static zzhbs zzb(zzhuo zzhuoVar) throws GeneralSecurityException {
        byte[] bArr;
        try {
            return zzhwi.zze(zzhuoVar);
        } catch (NoSuchProviderException unused) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) ((KeyFactory) zzhxe.zzf.zzb("RSA")).generatePublic(new RSAPublicKeySpec(zzhuoVar.zzd(), zzhuoVar.zzf().zzd()));
            zzhuk zzhukVarZzf = zzhuoVar.zzf();
            zzhiu zzhiuVar = zza;
            zzhxn zzhxnVar = (zzhxn) zzhiuVar.zzb(zzhukVarZzf.zzf());
            zzhxn zzhxnVar2 = (zzhxn) zzhiuVar.zzb(zzhukVarZzf.zzg());
            int iZzh = zzhukVarZzf.zzh();
            byte[] bArrZzc = zzhuoVar.zze().zzc();
            if (zzhuoVar.zzf().zze().equals(zzhuj.zzc)) {
                bArr = zzc;
            } else {
                bArr = zzb;
            }
            return new zzhxz(rSAPublicKey, zzhxnVar, zzhxnVar2, iZzh, bArrZzc, bArr, null);
        }
    }
}
