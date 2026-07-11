package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzhji {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhji(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhji zzd(zzhjh zzhjhVar, Class cls, Class cls2) {
        return new zzhjg(cls, cls2, zzhjhVar);
    }

    public abstract zzhlg zza(zzhaz zzhazVar, zzhbt zzhbtVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
