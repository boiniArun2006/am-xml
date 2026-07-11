package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class zzhjf {
    private final zzhye zza;
    private final Class zzb;

    /* synthetic */ zzhjf(zzhye zzhyeVar, Class cls, byte[] bArr) {
        this.zza = zzhyeVar;
        this.zzb = cls;
    }

    public static zzhjf zzd(zzhje zzhjeVar, zzhye zzhyeVar, Class cls) {
        return new zzhjd(zzhyeVar, cls, zzhjeVar);
    }

    public abstract zzhaz zza(zzhlg zzhlgVar, zzhbt zzhbtVar) throws GeneralSecurityException;

    public final zzhye zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
