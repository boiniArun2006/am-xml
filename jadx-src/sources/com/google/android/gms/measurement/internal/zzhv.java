package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhv implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzhy zza;
    private final String zzb;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.zza.zzu.zzaV().zzb().zzb(this.zzb, th);
    }

    public zzhv(zzhy zzhyVar, String str) {
        Objects.requireNonNull(zzhyVar);
        this.zza = zzhyVar;
        Preconditions.checkNotNull(str);
        this.zzb = str;
    }
}
