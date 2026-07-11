package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class zzon {
    final Unsafe zza;

    zzon(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public abstract void zza(Object obj, long j2, byte b2);

    public abstract boolean zzb(Object obj, long j2);

    public abstract void zzc(Object obj, long j2, boolean z2);

    public abstract float zzd(Object obj, long j2);

    public abstract void zze(Object obj, long j2, float f3);

    public abstract double zzf(Object obj, long j2);

    public abstract void zzg(Object obj, long j2, double d2);
}
