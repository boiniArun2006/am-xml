package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class zzgxq {
    static long zza(double d2) {
        zzgrc.zzb(zzb(d2), "not a normal value");
        int exponent = Math.getExponent(d2);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d2) & 4503599627370495L;
        if (exponent == -1023) {
            return jDoubleToRawLongBits + jDoubleToRawLongBits;
        }
        return jDoubleToRawLongBits | 4503599627370496L;
    }

    static boolean zzb(double d2) {
        if (Math.getExponent(d2) <= 1023) {
            return true;
        }
        return false;
    }
}
