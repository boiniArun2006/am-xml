package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzgit extends zzfvh {
    private final zzgdh zzb;

    zzgit(Context context, Executor executor, zzgdh zzgdhVar) {
        super(context, executor, new TaskCompletionSource().getTask(), false);
        this.zzb = zzgdhVar;
    }

    private static Task zzh() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final Task zzb(int i2, long j2) {
        this.zzb.zzb(i2, j2, null, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final Task zzc(int i2, long j2, Exception exc) {
        this.zzb.zzb(i2, j2, exc, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final Task zze(int i2, String str) {
        this.zzb.zzb(i2, -1L, null, str);
        return zzh();
    }
}
