package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final /* synthetic */ class zzhcz implements zzhjb {
    static final /* synthetic */ zzhcz zza = new zzhcz();

    private /* synthetic */ zzhcz() {
    }

    @Override // com.google.android.gms.internal.ads.zzhjb
    public final /* synthetic */ zzhaz zza(zzhbp zzhbpVar, Integer num) throws GeneralSecurityException {
        zzhdd zzhddVar = (zzhdd) zzhbpVar;
        int i2 = zzhda.zza;
        if (zzhddVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzhcw zzhcwVar = new zzhcw(null);
        zzhcwVar.zza(zzhddVar);
        zzhcwVar.zzc(num);
        zzhcwVar.zzb(zzhyg.zzb(zzhddVar.zzc()));
        return zzhcwVar.zzd();
    }
}
