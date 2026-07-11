package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class zzhuo extends zzhuw {
    private final zzhuk zza;
    private final BigInteger zzb;
    private final zzhye zzc;
    private final Integer zzd;

    /* synthetic */ zzhuo(zzhuk zzhukVar, BigInteger bigInteger, zzhye zzhyeVar, Integer num, byte[] bArr) {
        this.zza = zzhukVar;
        this.zzb = bigInteger;
        this.zzc = zzhyeVar;
        this.zzd = num;
    }

    public static zzhun zzc() {
        return new zzhun(null);
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

    public final zzhuk zzf() {
        return this.zza;
    }
}
