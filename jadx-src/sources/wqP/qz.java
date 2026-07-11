package wqP;

import android.os.AsyncTask;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Executor f75137n = TaskExecutors.MAIN_THREAD;
    public static final Executor rl = new androidx.credentials.j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Executor f75138t = new Q(4, AsyncTask.THREAD_POOL_EXECUTOR);
}
