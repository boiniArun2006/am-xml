package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzhkk {
    private final zzhye zza;
    private final Class zzb;

    /* synthetic */ zzhkk(zzhye zzhyeVar, Class cls, byte[] bArr) {
        this.zza = zzhyeVar;
        this.zzb = cls;
    }

    public static zzhkk zzd(zzhkj zzhkjVar, zzhye zzhyeVar, Class cls) {
        return new zzhki(zzhyeVar, cls, zzhkjVar);
    }

    public abstract zzhbp zza(zzhlg zzhlgVar) throws GeneralSecurityException;

    public final zzhye zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
