package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final /* synthetic */ class zzhjw implements zzhjb {
    static final /* synthetic */ zzhjw zza = new zzhjw();

    private /* synthetic */ zzhjw() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjb
    public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
        int i2 = zzhjx.zza;
        zzhqf zzhqfVarZzc = ((zzhjp) zzhbpVar).zzb().zzc();
        zzhba zzhbaVarZzd = zzhjc.zza().zzd(zzhqfVarZzc.zza());
        if (!zzhjc.zza().zze(zzhqfVarZzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhqc zzhqcVarZzd = zzhbaVarZzd.zzd(zzhqfVarZzc.zzb());
        return new zzhjo(zzhlb.zza(zzhqcVarZzd.zza(), zzhqcVarZzd.zzb(), zzhqcVarZzd.zzc(), zzhqfVarZzc.zzc(), num), zzhax.zza());
    }
}
