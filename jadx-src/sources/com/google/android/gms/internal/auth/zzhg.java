package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class zzhg extends zzhi {
    @Override // com.google.android.gms.internal.auth.zzhi
    public final double zza(Object obj, long j2) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j2));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final float zzb(Object obj, long j2) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j2));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzc(Object obj, long j2, boolean z2) {
        if (zzhj.zza) {
            zzhj.zzi(obj, j2, z2);
        } else {
            zzhj.zzj(obj, j2, z2);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final boolean zzf(Object obj, long j2) {
        return zzhj.zza ? zzhj.zzq(obj, j2) : zzhj.zzr(obj, j2);
    }

    zzhg(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzd(Object obj, long j2, double d2) {
        this.zza.putLong(obj, j2, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zze(Object obj, long j2, float f3) {
        this.zza.putInt(obj, j2, Float.floatToIntBits(f3));
    }
}
