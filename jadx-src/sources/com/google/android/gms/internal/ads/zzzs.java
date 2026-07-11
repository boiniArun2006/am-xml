package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class zzzs {
    public final int zza;
    public final zzbg zzb;
    public final int zzc;
    public final zzv zzd;

    public abstract int zza();

    public abstract boolean zzc(zzzs zzzsVar);

    public zzzs(int i2, zzbg zzbgVar, int i3) {
        this.zza = i2;
        this.zzb = zzbgVar;
        this.zzc = i3;
        this.zzd = zzbgVar.zza(i3);
    }
}
