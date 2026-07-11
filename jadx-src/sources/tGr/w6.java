package tGr;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadPoolExecutor f73452n;
    public static final Handler rl = new Handler(Looper.getMainLooper());

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(5), new j(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f73452n = threadPoolExecutor;
    }
}
