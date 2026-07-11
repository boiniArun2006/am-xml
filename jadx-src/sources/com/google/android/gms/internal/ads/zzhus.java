package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhus {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhup.zza, zzhum.class, zzhbr.class);
    private static final zzhku zzc = zzhku.zzd(zzhur.zza, zzhuo.class, zzhbs.class);
    private static final zzhbq zzd = zzhjl.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zzhbr.class, zzhro.zzl());
    private static final zzhba zze = zzhjl.zze("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zzhbs.class, zzhqb.ASYMMETRIC_PUBLIC, zzhrq.zzi());
    private static final zzhjb zzf = zzhuq.zza;
    private static final int zzg = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzg;
        if (!zzhid.zza(i2)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = zzhwg.zza;
        zzhwg.zza(zzhkg.zza());
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        BigInteger bigInteger = zzhuk.zza;
        zzhuh zzhuhVar = new zzhuh(null);
        zzhui zzhuiVar = zzhui.zza;
        zzhuhVar.zzd(zzhuiVar);
        zzhuhVar.zze(zzhuiVar);
        zzhuhVar.zzf(32);
        zzhuhVar.zza(3072);
        BigInteger bigInteger2 = zzhuk.zza;
        zzhuhVar.zzb(bigInteger2);
        zzhuj zzhujVar = zzhuj.zza;
        zzhuhVar.zzc(zzhujVar);
        map.put("RSA_SSA_PSS_3072_SHA256_F4", zzhuhVar.zzg());
        zzhuh zzhuhVar2 = new zzhuh(null);
        zzhuhVar2.zzd(zzhuiVar);
        zzhuhVar2.zze(zzhuiVar);
        zzhuhVar2.zzf(32);
        zzhuhVar2.zza(3072);
        zzhuhVar2.zzb(bigInteger2);
        zzhuj zzhujVar2 = zzhuj.zzd;
        zzhuhVar2.zzc(zzhujVar2);
        map.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", zzhuhVar2.zzg());
        map.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", zzhtm.zzk);
        zzhuh zzhuhVar3 = new zzhuh(null);
        zzhui zzhuiVar2 = zzhui.zzc;
        zzhuhVar3.zzd(zzhuiVar2);
        zzhuhVar3.zze(zzhuiVar2);
        zzhuhVar3.zzf(64);
        zzhuhVar3.zza(4096);
        zzhuhVar3.zzb(bigInteger2);
        zzhuhVar3.zzc(zzhujVar);
        map.put("RSA_SSA_PSS_4096_SHA512_F4", zzhuhVar3.zzg());
        zzhuh zzhuhVar4 = new zzhuh(null);
        zzhuhVar4.zzd(zzhuiVar2);
        zzhuhVar4.zze(zzhuiVar2);
        zzhuhVar4.zzf(64);
        zzhuhVar4.zza(4096);
        zzhuhVar4.zzb(bigInteger2);
        zzhuhVar4.zzc(zzhujVar2);
        map.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", zzhuhVar4.zzg());
        map.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", zzhtm.zzl);
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhkd.zza().zzb(zzb);
        zzhkd.zza().zzb(zzc);
        zzhjx.zza().zzb(zzf, zzhuk.class);
        zzhjc.zza().zzf(zzd, i2, true);
        zzhjc.zza().zzf(zze, i2, false);
    }
}
