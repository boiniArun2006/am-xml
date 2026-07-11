package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhuc extends zzhuw {
    private final zzhty zza;
    private final BigInteger zzb;
    private final zzhye zzc;
    private final Integer zzd;

    /* synthetic */ zzhuc(zzhty zzhtyVar, BigInteger bigInteger, zzhye zzhyeVar, Integer num, byte[] bArr) {
        this.zza = zzhtyVar;
        this.zzb = bigInteger;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhub zzc() {
        return new zzhub(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhuw, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer zzb() {
        return this.zzd;
    }

    public final BigInteger zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhuw
    public final zzhye zze() {
        return this.zzc;
    }

    public final zzhty zzf() {
        return this.zza;
    }
}
