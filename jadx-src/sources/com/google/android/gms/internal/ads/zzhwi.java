package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class zzhwi implements zzhbs {
    private static final byte[] zza = new byte[0];
    private static final byte[] zzb = {0};
    private final RSAPublicKey zzc;
    private final String zzd;
    private final PSSParameterSpec zze;
    private final byte[] zzf;
    private final byte[] zzg;
    private final Provider zzh;

    static String zzc(zzhui zzhuiVar) {
        if (zzhuiVar == zzhui.zza) {
            return gUxOLwRQBPPLC.dkiTNEmJ;
        }
        if (zzhuiVar == zzhui.zzb) {
            return "SHA384withRSA/PSS";
        }
        if (zzhuiVar == zzhui.zzc) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(zzhuiVar)));
    }

    static PSSParameterSpec zzd(zzhui zzhuiVar, zzhui zzhuiVar2, int i2) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        zzhui zzhuiVar3 = zzhui.zza;
        if (zzhuiVar == zzhuiVar3) {
            str = "SHA-256";
        } else if (zzhuiVar == zzhui.zzb) {
            str = "SHA-384";
        } else {
            if (zzhuiVar != zzhui.zzc) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(zzhuiVar)));
            }
            str = "SHA-512";
        }
        if (zzhuiVar2 == zzhuiVar3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (zzhuiVar2 == zzhui.zzb) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (zzhuiVar2 != zzhui.zzc) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(zzhuiVar2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i2, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzf;
        if (!zzhln.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.zzd;
        Provider provider = this.zzh;
        RSAPublicKey rSAPublicKey = this.zzc;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.zze);
        signature.update(bArr2);
        byte[] bArr4 = this.zzg;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }

    private zzhwi(RSAPublicKey rSAPublicKey, zzhui zzhuiVar, zzhui zzhuiVar2, int i2, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (zzhid.zza(2)) {
            if (zzhuiVar.equals(zzhuiVar2)) {
                zzhyc.zzc(rSAPublicKey.getModulus().bitLength());
                zzhyc.zzd(rSAPublicKey.getPublicExponent());
                this.zzc = rSAPublicKey;
                this.zzd = zzc(zzhuiVar);
                this.zze = zzd(zzhuiVar, zzhuiVar2, i2);
                this.zzf = bArr;
                this.zzg = bArr2;
                this.zzh = provider;
                return;
            }
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }

    static Provider zzb() {
        if (zzhln.zzc() && zzhln.zzd().intValue() <= 23) {
            return null;
        }
        return zzhih.zza();
    }

    public static zzhbs zze(zzhuo zzhuoVar) throws GeneralSecurityException {
        byte[] bArr;
        Provider providerZzb = zzb();
        if (providerZzb != null) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA", providerZzb).generatePublic(new RSAPublicKeySpec(zzhuoVar.zzd(), zzhuoVar.zzf().zzd()));
            zzhuk zzhukVarZzf = zzhuoVar.zzf();
            zzhui zzhuiVarZzf = zzhukVarZzf.zzf();
            zzhui zzhuiVarZzg = zzhukVarZzf.zzg();
            int iZzh = zzhukVarZzf.zzh();
            byte[] bArrZzc = zzhuoVar.zze().zzc();
            if (zzhuoVar.zzf().zze().equals(zzhuj.zzc)) {
                bArr = zzb;
            } else {
                bArr = zza;
            }
            return new zzhwi(rSAPublicKey, zzhuiVarZzf, zzhuiVarZzg, iZzh, bArrZzc, bArr, providerZzb);
        }
        throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
    }
}
