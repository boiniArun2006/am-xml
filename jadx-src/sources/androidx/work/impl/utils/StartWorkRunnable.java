package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class StartWorkRunnable implements Runnable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private WorkerParameters.RuntimeExtras f43002O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WorkManagerImpl f43003n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f43004t;

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        this.f43003n.az().gh(this.f43004t, this.f43002O);
    }

    public StartWorkRunnable(WorkManagerImpl workManagerImpl, String str, WorkerParameters.RuntimeExtras runtimeExtras) {
        this.f43003n = workManagerImpl;
        this.f43004t = str;
        this.f43002O = runtimeExtras;
    }
}
