package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class zzbc {
    public static long zza(long j2, long j3) {
        long j4 = j2 + j3;
        zzbb.zza(((j2 ^ j3) < 0) | ((j2 ^ j4) >= 0), "checkedAdd", j2, j3);
        return j4;
    }

    public static long zzb(long j2, long j3) {
        long j4 = j2 - 1;
        zzbb.zza(((1 ^ j2) >= 0) | ((j2 ^ j4) >= 0), "checkedSubtract", j2, 1L);
        return j4;
    }
}
