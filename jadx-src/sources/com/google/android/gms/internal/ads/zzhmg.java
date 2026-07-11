package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhmg {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhmc.zza, zzhmb.class, zzhlx.class);
    private static final zzhku zzc = zzhku.zzd(zzhmf.zza, zzhmb.class, zzhbo.class);
    private static final zzhba zzd = zzhjl.zze("type.googleapis.com/google.crypto.tink.HmacKey", zzhbo.class, zzhqb.SYMMETRIC, zzhpv.zzh());
    private static final zzhjy zze = zzhme.zza;
    private static final zzhjb zzf = zzhmd.zza;
    private static final int zzg = 2;

    public static void zza(boolean z2) throws GeneralSecurityException {
        int i2 = zzg;
        if (!zzhid.zza(i2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i3 = zzhnl.zza;
        zzhnl.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhkd.zza().zzb(zzc);
        zzhkc zzhkcVarZza = zzhkc.zza();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzhmx.zza);
        zzhmh zzhmhVar = new zzhmh(null);
        zzhmhVar.zza(32);
        zzhmhVar.zzb(16);
        zzhmj zzhmjVar = zzhmj.zzd;
        zzhmhVar.zzc(zzhmjVar);
        zzhmi zzhmiVar = zzhmi.zzc;
        zzhmhVar.zzd(zzhmiVar);
        map.put("HMAC_SHA256_128BITTAG_RAW", zzhmhVar.zze());
        zzhmh zzhmhVar2 = new zzhmh(null);
        zzhmhVar2.zza(32);
        zzhmhVar2.zzb(32);
        zzhmj zzhmjVar2 = zzhmj.zza;
        zzhmhVar2.zzc(zzhmjVar2);
        zzhmhVar2.zzd(zzhmiVar);
        map.put("HMAC_SHA256_256BITTAG", zzhmhVar2.zze());
        zzhmh zzhmhVar3 = new zzhmh(null);
        zzhmhVar3.zza(32);
        zzhmhVar3.zzb(32);
        zzhmhVar3.zzc(zzhmjVar);
        zzhmhVar3.zzd(zzhmiVar);
        map.put("HMAC_SHA256_256BITTAG_RAW", zzhmhVar3.zze());
        zzhmh zzhmhVar4 = new zzhmh(null);
        zzhmhVar4.zza(64);
        zzhmhVar4.zzb(16);
        zzhmhVar4.zzc(zzhmjVar2);
        zzhmi zzhmiVar2 = zzhmi.zze;
        zzhmhVar4.zzd(zzhmiVar2);
        map.put("HMAC_SHA512_128BITTAG", zzhmhVar4.zze());
        zzhmh zzhmhVar5 = new zzhmh(null);
        zzhmhVar5.zza(64);
        zzhmhVar5.zzb(16);
        zzhmhVar5.zzc(zzhmjVar);
        zzhmhVar5.zzd(zzhmiVar2);
        map.put("HMAC_SHA512_128BITTAG_RAW", zzhmhVar5.zze());
        zzhmh zzhmhVar6 = new zzhmh(null);
        zzhmhVar6.zza(64);
        zzhmhVar6.zzb(32);
        zzhmhVar6.zzc(zzhmjVar2);
        zzhmhVar6.zzd(zzhmiVar2);
        map.put("HMAC_SHA512_256BITTAG", zzhmhVar6.zze());
        zzhmh zzhmhVar7 = new zzhmh(null);
        zzhmhVar7.zza(64);
        zzhmhVar7.zzb(32);
        zzhmhVar7.zzc(zzhmjVar);
        zzhmhVar7.zzd(zzhmiVar2);
        map.put("HMAC_SHA512_256BITTAG_RAW", zzhmhVar7.zze());
        map.put("HMAC_SHA512_512BITTAG", zzhmx.zzb);
        zzhmh zzhmhVar8 = new zzhmh(null);
        zzhmhVar8.zza(64);
        zzhmhVar8.zzb(64);
        zzhmhVar8.zzc(zzhmjVar);
        zzhmhVar8.zzd(zzhmiVar2);
        map.put("HMAC_SHA512_512BITTAG_RAW", zzhmhVar8.zze());
        zzhkcVarZza.zzd(Collections.unmodifiableMap(map));
        zzhjx.zza().zzb(zzf, zzhmk.class);
        zzhjz.zza().zzb(zze, zzhmk.class);
        zzhjc.zza().zzf(zzd, i2, true);
    }
}
