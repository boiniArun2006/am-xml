package androidx.work;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class WorkerFactory {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f42763n = Logger.J2("WorkerFactory");

    public abstract ListenableWorker n(Context context, String str, WorkerParameters workerParameters);

    public static WorkerFactory t() {
        return new WorkerFactory() { // from class: androidx.work.WorkerFactory.1
            @Override // androidx.work.WorkerFactory
            public ListenableWorker n(Context context, String str, WorkerParameters workerParameters) {
                return null;
            }
        };
    }

    public final ListenableWorker rl(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        ListenableWorker listenableWorkerN = n(context, str, workerParameters);
        if (listenableWorkerN == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                Logger.t().rl(f42763n, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerN = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    Logger.t().rl(f42763n, "Could not instantiate " + str, th2);
                }
            }
        }
        if (listenableWorkerN != null && listenableWorkerN.isUsed()) {
            throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
        }
        return listenableWorkerN;
    }
}
