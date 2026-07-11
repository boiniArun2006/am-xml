package com.google.android.recaptcha.internal;

import GJW.P;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class zzas {
    public static final Task zza(P p2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        p2.invokeOnCompletion(new zzar(taskCompletionSource, p2));
        return taskCompletionSource.getTask();
    }
}
