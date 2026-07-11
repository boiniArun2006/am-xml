package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzhlc implements zzhlg {
    private final zzhye zza;
    private final zzhqf zzb;

    private zzhlc(zzhqf zzhqfVar, zzhye zzhyeVar) {
        this.zzb = zzhqfVar;
        this.zza = zzhyeVar;
    }

    public final zzhqf zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final zzhye zzf() {
        return this.zza;
    }

    public static zzhlc zza(zzhqf zzhqfVar) {
        return new zzhlc(zzhqfVar, zzhln.zza(zzhqfVar.zza()));
    }

    public static zzhlc zzb(zzhqf zzhqfVar) throws GeneralSecurityException {
        return new zzhlc(zzhqfVar, zzhln.zzb(zzhqfVar.zza()));
    }
}
