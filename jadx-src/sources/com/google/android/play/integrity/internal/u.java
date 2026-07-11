package com.google.android.play.integrity.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final TaskCompletionSource f59586a;

    u() {
        this.f59586a = null;
    }

    protected abstract void b();

    @Nullable
    final TaskCompletionSource c() {
        return this.f59586a;
    }

    public u(TaskCompletionSource taskCompletionSource) {
        this.f59586a = taskCompletionSource;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f59586a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e2) {
            a(e2);
        }
    }
}
