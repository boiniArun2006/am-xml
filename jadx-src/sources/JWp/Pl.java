package JWp;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public enum Pl implements Executor {
    INSTANCE;


    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Handler f4582t = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f4582t.post(runnable);
    }
}
