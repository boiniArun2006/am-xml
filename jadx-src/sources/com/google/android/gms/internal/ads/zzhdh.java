package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final /* synthetic */ class zzhdh implements zzhjb {
    static final /* synthetic */ zzhdh zza = new zzhdh();

    private /* synthetic */ zzhdh() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjb
    public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
        zzhdm zzhdmVar = (zzhdm) zzhbpVar;
        int i2 = zzhdj.zza;
        if (zzhdmVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzhde zzhdeVar = new zzhde(null);
        zzhdeVar.zza(zzhdmVar);
        zzhdeVar.zzc(num);
        zzhdeVar.zzb(zzhyg.zzb(zzhdmVar.zzc()));
        return zzhdeVar.zzd();
    }
}
