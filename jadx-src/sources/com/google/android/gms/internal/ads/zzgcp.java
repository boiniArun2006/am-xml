package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class zzgcp implements Comparable {
    final Runnable zza;
    final long zzb;

    zzgcp(Runnable runnable, long j2) {
        this.zza = runnable;
        this.zzb = j2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zzb, ((zzgcp) obj).zzb);
    }
}
