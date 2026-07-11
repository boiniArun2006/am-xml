package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzcyj {
    private final Object zza = new Object();
    private final ConcurrentHashMap zzb = new ConcurrentHashMap();
    private final ConcurrentHashMap zzc = new ConcurrentHashMap();
    private final ConcurrentHashMap zzd = new ConcurrentHashMap();

    public final void zza(String str) {
        synchronized (this.zza) {
            try {
                ConcurrentHashMap concurrentHashMap = this.zzb;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zzb(String str) {
        Integer num = (Integer) this.zzb.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long zzc(String str) {
        Long l2 = (Long) this.zzd.get(str);
        if (l2 == null) {
            return -1L;
        }
        return l2.longValue();
    }

    public final void zze(String str, String str2, long j2) {
        ConcurrentHashMap concurrentHashMap = this.zzc;
        Long l2 = (Long) concurrentHashMap.get(str2);
        if (l2 == null) {
            return;
        }
        concurrentHashMap.remove(str2);
        this.zzd.put(str, Long.valueOf(j2 - l2.longValue()));
    }

    @VisibleForTesting
    public zzcyj() {
    }

    public final void zzd(String str, long j2) {
        this.zzc.put(str, Long.valueOf(j2));
    }
}
