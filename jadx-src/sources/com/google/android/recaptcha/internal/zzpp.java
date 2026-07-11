package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzpp extends zzpr {
    @Override // com.google.android.recaptcha.internal.zzpr
    public final double zza(Object obj, long j2) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j2));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final float zzb(Object obj, long j2) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j2));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzc(Object obj, long j2, boolean z2) {
        if (zzps.zzb) {
            zzps.zzD(obj, j2, z2 ? (byte) 1 : (byte) 0);
        } else {
            zzps.zzE(obj, j2, z2 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzd(Object obj, long j2, byte b2) {
        if (zzps.zzb) {
            zzps.zzD(obj, j2, b2);
        } else {
            zzps.zzE(obj, j2, b2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final boolean zzg(Object obj, long j2) {
        return zzps.zzb ? zzps.zzt(obj, j2) : zzps.zzu(obj, j2);
    }

    zzpp(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zze(Object obj, long j2, double d2) {
        this.zza.putLong(obj, j2, Double.doubleToLongBits(d2));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzf(Object obj, long j2, float f3) {
        this.zza.putInt(obj, j2, Float.floatToIntBits(f3));
    }
}
