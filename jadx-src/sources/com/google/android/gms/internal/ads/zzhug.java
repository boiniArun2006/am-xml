package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhug {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhud.zza, zzhua.class, zzhbr.class);
    private static final zzhku zzc = zzhku.zzd(zzhuf.zza, zzhuc.class, zzhbs.class);
    private static final zzhbq zzd = zzhjl.zzf("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zzhbr.class, zzhrg.zzl());
    private static final zzhba zze = zzhjl.zze("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", zzhbs.class, zzhqb.ASYMMETRIC_PUBLIC, zzhri.zzi());
    private static final zzhjb zzf = zzhue.zza;
    private static final int zzg = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzg;
        if (!zzhid.zza(i2)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = zzhvx.zza;
        zzhvx.zza(zzhkg.zza());
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4", zzhtm.zzh);
        BigInteger bigInteger = zzhty.zza;
        zzhtv zzhtvVar = new zzhtv(null);
        zzhtvVar.zzd(zzhtw.zza);
        zzhtvVar.zza(3072);
        BigInteger bigInteger2 = zzhty.zza;
        zzhtvVar.zzb(bigInteger2);
        zzhtx zzhtxVar = zzhtx.zzd;
        zzhtvVar.zzc(zzhtxVar);
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", zzhtvVar.zze());
        map.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", zzhtm.zzi);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4", zzhtm.zzj);
        zzhtv zzhtvVar2 = new zzhtv(null);
        zzhtvVar2.zzd(zzhtw.zzc);
        zzhtvVar2.zza(4096);
        zzhtvVar2.zzb(bigInteger2);
        zzhtvVar2.zzc(zzhtxVar);
        map.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", zzhtvVar2.zze());
        zzhkcVarZza.zzd(map);
        zzhkd.zza().zzb(zzb);
        zzhkd.zza().zzb(zzc);
        zzhjx.zza().zzb(zzf, zzhty.class);
        zzhjc.zza().zzf(zzd, i2, true);
        zzhjc.zza().zzf(zze, i2, false);
    }
}
