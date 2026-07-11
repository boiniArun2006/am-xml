package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final /* synthetic */ class zzhsm implements zzhjb {
    static final /* synthetic */ zzhsm zza = new zzhsm();

    private /* synthetic */ zzhsm() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjb
    public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
        zzhsg zzhsgVar = (zzhsg) zzhbpVar;
        int i2 = zzhso.zza;
        ECParameterSpec eCParameterSpecZza = zzhsgVar.zzd().zza();
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzhxe.zze.zzb("EC");
        keyPairGenerator.initialize(eCParameterSpecZza);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
        zzhsj zzhsjVar = new zzhsj(null);
        zzhsjVar.zza(zzhsgVar);
        zzhsjVar.zzc(num);
        zzhsjVar.zzb(eCPublicKey.getW());
        zzhsk zzhskVarZzd = zzhsjVar.zzd();
        zzhsh zzhshVar = new zzhsh(null);
        zzhshVar.zza(zzhskVarZzd);
        zzhshVar.zzb(zzhyf.zza(eCPrivateKey.getS(), zzhax.zza()));
        return zzhshVar.zzc();
    }
}
