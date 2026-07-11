package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzwb {
    private static final AtomicLong zza = new AtomicLong();

    public zzwb(long j2, zzhf zzhfVar, Uri uri, Map map, long j3, long j4, long j5) {
    }

    public static long zza() {
        return zza.getAndIncrement();
    }
}
