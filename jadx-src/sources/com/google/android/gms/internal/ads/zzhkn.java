package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzhkn {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhkn(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhkn zzd(zzhkm zzhkmVar, Class cls, Class cls2) {
        return new zzhkl(cls, cls2, zzhkmVar);
    }

    public abstract zzhlg zza(zzhbp zzhbpVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
