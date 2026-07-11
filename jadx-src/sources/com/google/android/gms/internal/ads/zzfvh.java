package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class zzfvh {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfvh(@NonNull Context context, @NonNull Executor executor, @NonNull Task task, boolean z2) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z2;
    }

    static void zzg(int i2) {
        zzf = i2;
    }

    public Task zzb(int i2, long j2) {
        return zzh(i2, j2, null, null, null, null);
    }

    public Task zzc(int i2, long j2, Exception exc) {
        return zzh(i2, j2, exc, null, null, null);
    }

    public final Task zzd(int i2, long j2, String str, Map map) {
        return zzh(i2, j2, null, str, null, null);
    }

    public Task zze(int i2, String str) {
        return zzh(i2, 0L, null, null, null, str);
    }

    public final Task zzf(int i2, long j2, String str) {
        return zzh(i2, j2, null, null, null, str);
    }

    public static zzfvh zza(@NonNull final Context context, @NonNull Executor executor, boolean z2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z2) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i2 = zzfvh.zza;
                    taskCompletionSource.setResult(zzfxd.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfvf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i2 = zzfvh.zza;
                    taskCompletionSource.setResult(zzfxd.zzc());
                }
            });
        }
        return new zzfvh(context, executor, taskCompletionSource.getTask(), z2);
    }

    private final Task zzh(final int i2, long j2, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfvg.zza);
        }
        Context context = this.zzb;
        final zzavm zzavmVarZza = zzavq.zza();
        zzavmVarZza.zza(context.getPackageName());
        zzavmVarZza.zzb(j2);
        zzavmVarZza.zzg(zzf);
        if (exc != null) {
            int i3 = zzgrz.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzavmVarZza.zzc(stringWriter.toString());
            zzavmVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzavmVarZza.zze(str2);
        }
        if (str != null) {
            zzavmVarZza.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfve
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                int i5 = zzfvh.zza;
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i7 = i2;
                zzfxc zzfxcVarZza = ((zzfxd) task.getResult()).zza(((zzavq) zzavmVarZza.zzbu()).zzaN());
                zzfxcVarZza.zzc(i7);
                zzfxcVarZza.zza();
                return Boolean.TRUE;
            }
        });
    }
}
