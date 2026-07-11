package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzkk {
    public static long zza(long j2, long j3) {
        long j4 = j2 + j3;
        zzkl.zza(((j2 ^ j3) < 0) | ((j2 ^ j4) >= 0), "checkedAdd", j2, j3);
        return j4;
    }

    public static long zzb(long j2, long j3) {
        long j4 = (-1) + j2;
        zzkl.zza(((1 ^ j2) >= 0) | ((j2 ^ j4) >= 0), "checkedSubtract", j2, 1L);
        return j4;
    }
}
