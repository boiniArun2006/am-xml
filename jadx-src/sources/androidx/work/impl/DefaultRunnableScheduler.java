package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class DefaultRunnableScheduler implements RunnableScheduler {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f42769n = HandlerCompat.n(Looper.getMainLooper());

    @Override // androidx.work.RunnableScheduler
    public void n(Runnable runnable) {
        this.f42769n.removeCallbacks(runnable);
    }

    @Override // androidx.work.RunnableScheduler
    public void rl(long j2, Runnable runnable) {
        this.f42769n.postDelayed(runnable, j2);
    }
}
