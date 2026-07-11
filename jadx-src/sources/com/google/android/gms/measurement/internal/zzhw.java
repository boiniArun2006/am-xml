package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class zzhw extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzhy zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhw(zzhy zzhyVar, Runnable runnable, boolean z2, String str) {
        super(runnable, null);
        Objects.requireNonNull(zzhyVar);
        this.zzb = zzhyVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzhy.zzj.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z2;
        if (andIncrement == Long.MAX_VALUE) {
            zzhyVar.zzu.zzaV().zzb().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        zzhw zzhwVar = (zzhw) obj;
        boolean z2 = zzhwVar.zza;
        boolean z3 = this.zza;
        if (z3 != z2) {
            return !z3 ? 1 : -1;
        }
        long j2 = this.zzc;
        long j3 = zzhwVar.zzc;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        this.zzb.zzu.zzaV().zzc().zzb("Two tasks share the same index. index", Long.valueOf(j2));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzu.zzaV().zzb().zzb(this.zzd, th);
        if ((th instanceof zzhu) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhw(zzhy zzhyVar, Callable callable, boolean z2, String str) {
        super(callable);
        Objects.requireNonNull(zzhyVar);
        this.zzb = zzhyVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzhy.zzj.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z2;
        if (andIncrement == Long.MAX_VALUE) {
            zzhyVar.zzu.zzaV().zzb().zza("Tasks index overflow");
        }
    }
}
