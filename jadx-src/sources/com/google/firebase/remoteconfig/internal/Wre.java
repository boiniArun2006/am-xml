package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f60736n;
    private final s4 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Task f60737t = null;
    private static final Map nr = new HashMap();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Executor f60735O = new androidx.credentials.j();

    private static class n implements OnSuccessListener, OnFailureListener, OnCanceledListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final CountDownLatch f60738n;

        private n() {
            this.f60738n = new CountDownLatch(1);
        }

        public boolean n(long j2, TimeUnit timeUnit) {
            return this.f60738n.await(j2, timeUnit);
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.f60738n.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f60738n.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(Object obj) {
            this.f60738n.countDown();
        }
    }

    private synchronized void gh(CN3 cn3) {
        this.f60737t = Tasks.forResult(cn3);
    }

    public synchronized Task O() {
        try {
            Task task = this.f60737t;
            if (task == null || (task.isComplete() && !this.f60737t.isSuccessful())) {
                Executor executor = this.f60736n;
                final s4 s4Var = this.rl;
                Objects.requireNonNull(s4Var);
                this.f60737t = Tasks.call(executor, new Callable() { // from class: com.google.firebase.remoteconfig.internal.w6
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return s4Var.nr();
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f60737t;
    }

    CN3 Uo(long j2) {
        synchronized (this) {
            try {
                Task task = this.f60737t;
                if (task != null && task.isSuccessful()) {
                    return (CN3) this.f60737t.getResult();
                }
                try {
                    return (CN3) t(O(), j2, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void nr() {
        synchronized (this) {
            this.f60737t = Tasks.forResult(null);
        }
        this.rl.n();
    }

    public Task xMQ(CN3 cn3) {
        return mUb(cn3, true);
    }

    public static synchronized Wre KN(Executor executor, s4 s4Var) {
        String strRl;
        Map map;
        try {
            strRl = s4Var.rl();
            map = nr;
            if (!map.containsKey(strRl)) {
                map.put(strRl, new Wre(executor, s4Var));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Wre) map.get(strRl);
    }

    public static /* synthetic */ Task n(Wre wre, boolean z2, CN3 cn3, Void r3) {
        if (z2) {
            wre.gh(cn3);
        } else {
            wre.getClass();
        }
        return Tasks.forResult(cn3);
    }

    private static Object t(Task task, long j2, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        n nVar = new n();
        Executor executor = f60735O;
        task.addOnSuccessListener(executor, nVar);
        task.addOnFailureListener(executor, nVar);
        task.addOnCanceledListener(executor, nVar);
        if (!nVar.n(j2, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public CN3 J2() {
        return Uo(5L);
    }

    public Task mUb(final CN3 cn3, final boolean z2) {
        return Tasks.call(this.f60736n, new Callable() { // from class: com.google.firebase.remoteconfig.internal.Ml
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f60724n.rl.O(cn3);
            }
        }).onSuccessTask(this.f60736n, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.I28
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Wre.n(this.f60722n, z2, cn3, (Void) obj);
            }
        });
    }

    private Wre(Executor executor, s4 s4Var) {
        this.f60736n = executor;
        this.rl = s4Var;
    }
}
