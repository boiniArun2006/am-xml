package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzol extends zzon {
    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zza(Object obj, long j2, byte b2) {
        if (zzoo.zzb) {
            zzoo.zzD(obj, j2, b2);
        } else {
            zzoo.zzE(obj, j2, b2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final boolean zzb(Object obj, long j2) {
        return zzoo.zzb ? zzoo.zzu(obj, j2) : zzoo.zzv(obj, j2);
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zzc(Object obj, long j2, boolean z2) {
        if (zzoo.zzb) {
            zzoo.zzD(obj, j2, z2 ? (byte) 1 : (byte) 0);
        } else {
            zzoo.zzE(obj, j2, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final float zzd(Object obj, long j2) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j2));
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final double zzf(Object obj, long j2) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j2));
    }

    zzol(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zze(Object obj, long j2, float f3) {
        this.zza.putInt(obj, j2, Float.floatToIntBits(f3));
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final void zzg(Object obj, long j2, double d2) {
        this.zza.putLong(obj, j2, Double.doubleToLongBits(d2));
    }
}
