package androidx.work;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class DelegatingWorkerFactory extends WorkerFactory {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f42718t = Logger.J2("DelegatingWkrFctry");
    private final List rl;

    @Override // androidx.work.WorkerFactory
    public final ListenableWorker n(Context context, String str, WorkerParameters workerParameters) {
        Iterator it = this.rl.iterator();
        while (it.hasNext()) {
            try {
                ListenableWorker listenableWorkerN = ((WorkerFactory) it.next()).n(context, str, workerParameters);
                if (listenableWorkerN != null) {
                    return listenableWorkerN;
                }
            } catch (Throwable th) {
                Logger.t().rl(f42718t, String.format("Unable to instantiate a ListenableWorker (%s)", str), th);
                throw th;
            }
        }
        return null;
    }
}
