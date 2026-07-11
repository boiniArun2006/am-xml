package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhsk extends zzhuw {
    private final zzhsg zza;
    private final ECPoint zzb;
    private final zzhye zzc;
    private final Integer zzd;

    /* synthetic */ zzhsk(zzhsg zzhsgVar, ECPoint eCPoint, zzhye zzhyeVar, Integer num, byte[] bArr) {
        this.zza = zzhsgVar;
        this.zzb = eCPoint;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhsj zzc() {
        return new zzhsj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhuw, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zzd;
    }

    public final ECPoint zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhuw
    public final zzhye zze() {
        return this.zzc;
    }

    public final zzhsg zzf() {
        return this.zza;
    }
}
