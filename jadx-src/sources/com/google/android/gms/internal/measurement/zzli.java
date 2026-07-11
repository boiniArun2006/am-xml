package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class zzli {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    /* synthetic */ zzli(byte[] bArr) {
    }

    public static int zzb(int i2) {
        return (i2 >>> 1) ^ (-(i2 & 1));
    }

    public static long zzc(long j2) {
        return (j2 >>> 1) ^ (-(1 & j2));
    }
}
