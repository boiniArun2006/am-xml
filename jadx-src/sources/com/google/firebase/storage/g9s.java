package com.google.firebase.storage;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.storage.g9s;
import com.google.firebase.storage.u;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class g9s extends com.google.firebase.storage.n {
    private static final HashMap gh;
    private static final HashMap mUb;
    private j xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Object f60876n = new Object();
    final u rl = new u(this, 128, new u.j() { // from class: com.google.firebase.storage.Pl
        @Override // com.google.firebase.storage.u.j
        public final void n(Object obj, Object obj2) {
            g9s.Uo(this.f60852n, (OnSuccessListener) obj, (g9s.j) obj2);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final u f60877t = new u(this, 64, new u.j() { // from class: com.google.firebase.storage.QJ
        @Override // com.google.firebase.storage.u.j
        public final void n(Object obj, Object obj2) {
            g9s.nr(this.f60855n, (OnFailureListener) obj, (g9s.j) obj2);
        }
    });
    final u nr = new u(this, 448, new u.j() { // from class: com.google.firebase.storage.l3D
        @Override // com.google.firebase.storage.u.j
        public final void n(Object obj, Object obj2) {
            g9s.O(this.f60879n, (OnCompleteListener) obj, (g9s.j) obj2);
        }
    });

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final u f60875O = new u(this, 256, new u.j() { // from class: com.google.firebase.storage.c
        @Override // com.google.firebase.storage.u.j
        public final void n(Object obj, Object obj2) {
            g9s.KN(this.f60869n, (OnCanceledListener) obj, (g9s.j) obj2);
        }
    });
    final u J2 = new u(this, -465, new u.j() { // from class: com.google.firebase.storage.s4
        @Override // com.google.firebase.storage.u.j
        public final void n(Object obj, Object obj2) {
            ((aC) obj).n((g9s.j) obj2);
        }
    });
    final u Uo = new u(this, 16, new u.j() { // from class: com.google.firebase.storage.UGc
        @Override // com.google.firebase.storage.u.j
        public final void n(Object obj, Object obj2) {
            android.support.v4.media.j.n(obj);
            throw null;
        }
    });
    private volatile int KN = 1;

    protected interface j {
        Exception getError();
    }

    public class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Exception f60878n;

        public n(Exception exc) {
            if (exc != null) {
                this.f60878n = exc;
                return;
            }
            if (g9s.this.isCanceled()) {
                this.f60878n = StorageException.t(Status.RESULT_CANCELED);
            } else if (g9s.this.g() == 64) {
                this.f60878n = StorageException.t(Status.RESULT_INTERNAL_ERROR);
            } else {
                this.f60878n = null;
            }
        }

        @Override // com.google.firebase.storage.g9s.j
        public Exception getError() {
            return this.f60878n;
        }
    }

    private String E2(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? i2 != 16 ? i2 != 32 ? i2 != 64 ? i2 != 128 ? i2 != 256 ? "Unknown Internal State!" : "INTERNAL_STATE_CANCELED" : "INTERNAL_STATE_SUCCESS" : "INTERNAL_STATE_FAILURE" : "INTERNAL_STATE_CANCELING" : "INTERNAL_STATE_PAUSED" : "INTERNAL_STATE_PAUSING" : "INTERNAL_STATE_IN_PROGRESS" : "INTERNAL_STATE_QUEUED" : "INTERNAL_STATE_NOT_STARTED";
    }

    private String e(int[] iArr) {
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 : iArr) {
            sb.append(E2(i2));
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    abstract j M7();

    abstract void U();

    abstract o X();

    boolean Xw() {
        if (!eF(2, false)) {
            return false;
        }
        U();
        return true;
    }

    protected void bzg() {
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWith(Continuation continuation) {
        return WPU(null, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWithTask(Continuation continuation) {
        return aYN(null, continuation);
    }

    abstract void jB();

    protected void nHg() {
    }

    @Override // com.google.android.gms.tasks.Task
    public Task onSuccessTask(SuccessContinuation successContinuation) {
        return p5(null, successContinuation);
    }

    protected void rV9() {
    }

    protected void s7N() {
    }

    protected void v() {
    }

    protected void wTp() {
    }

    static {
        HashMap map = new HashMap();
        mUb = map;
        HashMap map2 = new HashMap();
        gh = map2;
        map.put(1, new HashSet(Arrays.asList(16, 256)));
        map.put(2, new HashSet(Arrays.asList(8, 32)));
        map.put(4, new HashSet(Arrays.asList(8, 32)));
        map.put(16, new HashSet(Arrays.asList(2, 256)));
        map.put(64, new HashSet(Arrays.asList(2, 256)));
        map2.put(1, new HashSet(Arrays.asList(2, 64)));
        map2.put(2, new HashSet(Arrays.asList(4, 64, 128)));
        map2.put(4, new HashSet(Arrays.asList(4, 64, 128)));
        map2.put(8, new HashSet(Arrays.asList(16, 64, 128)));
        map2.put(32, new HashSet(Arrays.asList(256, 64, 128)));
    }

    private Task WPU(Executor executor, final Continuation continuation) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.nr.nr(null, executor, new OnCompleteListener() { // from class: com.google.firebase.storage.Q
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                g9s.n(this.f60853n, continuation, taskCompletionSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private Task aYN(Executor executor, final Continuation continuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.nr.nr(null, executor, new OnCompleteListener() { // from class: com.google.firebase.storage.SPz
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                g9s.J2(this.f60856n, continuation, taskCompletionSource, cancellationTokenSource, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private j nY() {
        j jVar = this.xMQ;
        if (jVar != null) {
            return jVar;
        }
        if (!isComplete()) {
            return null;
        }
        if (this.xMQ == null) {
            this.xMQ = P5();
        }
        return this.xMQ;
    }

    private Task p5(Executor executor, final SuccessContinuation successContinuation) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.rl.nr(null, executor, new OnSuccessListener() { // from class: com.google.firebase.storage.ci
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                g9s.t(successContinuation, taskCompletionSource, cancellationTokenSource, (g9s.j) obj);
            }
        });
        return taskCompletionSource.getTask();
    }

    boolean E(int[] iArr, boolean z2) {
        HashMap map = z2 ? mUb : gh;
        synchronized (this.f60876n) {
            try {
                for (int i2 : iArr) {
                    HashSet hashSet = (HashSet) map.get(Integer.valueOf(g()));
                    if (hashSet != null && hashSet.contains(Integer.valueOf(i2))) {
                        this.KN = i2;
                        int i3 = this.KN;
                        if (i3 == 2) {
                            afx.rl().n(this);
                            rV9();
                        } else if (i3 == 4) {
                            v();
                        } else if (i3 == 16) {
                            wTp();
                        } else if (i3 == 64) {
                            s7N();
                        } else if (i3 == 128) {
                            bzg();
                        } else if (i3 == 256) {
                            nHg();
                        }
                        this.rl.O();
                        this.f60877t.O();
                        this.f60875O.O();
                        this.nr.O();
                        this.Uo.O();
                        this.J2.O();
                        if (Log.isLoggable("StorageTask", 3)) {
                            Log.d("StorageTask", "changed internal state to: " + E2(i2) + " isUser: " + z2 + " from state:" + E2(this.KN));
                        }
                        return true;
                    }
                }
                Log.w("StorageTask", "unable to change internal state to: " + e(iArr) + " isUser: " + z2 + " from state:" + E2(this.KN));
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    j P5() {
        j jVarM7;
        synchronized (this.f60876n) {
            jVarM7 = M7();
        }
        return jVarM7;
    }

    public boolean S() {
        return E(new int[]{256, 32}, true);
    }

    Object T() {
        return this.f60876n;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWith(Executor executor, Continuation continuation) {
        return WPU(executor, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    public Task continueWithTask(Executor executor, Continuation continuation) {
        return aYN(executor, continuation);
    }

    Runnable fD() {
        return new Runnable() { // from class: com.google.firebase.storage.r
            @Override // java.lang.Runnable
            public final void run() {
                g9s.rl(this.f60899n);
            }
        };
    }

    int g() {
        return this.KN;
    }

    @Override // com.google.android.gms.tasks.Task
    public Task onSuccessTask(Executor executor, SuccessContinuation successContinuation) {
        return p5(executor, successContinuation);
    }

    protected g9s() {
    }

    public static /* synthetic */ void J2(g9s g9sVar, Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, Task task) {
        g9sVar.getClass();
        try {
            Task task2 = (Task) continuation.then(g9sVar);
            if (!taskCompletionSource.getTask().isComplete()) {
                if (task2 == null) {
                    taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                    return;
                }
                task2.addOnSuccessListener(new Xo(taskCompletionSource));
                task2.addOnFailureListener(new eO(taskCompletionSource));
                Objects.requireNonNull(cancellationTokenSource);
                task2.addOnCanceledListener(new C1918z(cancellationTokenSource));
            }
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e2.getCause());
            } else {
                taskCompletionSource.setException(e2);
            }
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    public static /* synthetic */ void KN(g9s g9sVar, OnCanceledListener onCanceledListener, j jVar) {
        g9sVar.getClass();
        afx.rl().t(g9sVar);
        onCanceledListener.onCanceled();
    }

    public static /* synthetic */ void O(g9s g9sVar, OnCompleteListener onCompleteListener, j jVar) {
        g9sVar.getClass();
        afx.rl().t(g9sVar);
        onCompleteListener.onComplete(g9sVar);
    }

    public static /* synthetic */ void Uo(g9s g9sVar, OnSuccessListener onSuccessListener, j jVar) {
        g9sVar.getClass();
        afx.rl().t(g9sVar);
        onSuccessListener.onSuccess(jVar);
    }

    private void ViF() {
        if (!isComplete() && !N() && g() != 2 && !eF(256, false)) {
            eF(64, false);
        }
    }

    public static /* synthetic */ void n(g9s g9sVar, Continuation continuation, TaskCompletionSource taskCompletionSource, Task task) {
        g9sVar.getClass();
        try {
            Object objThen = continuation.then(g9sVar);
            if (!taskCompletionSource.getTask().isComplete()) {
                taskCompletionSource.setResult(objThen);
            }
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e2.getCause());
            } else {
                taskCompletionSource.setException(e2);
            }
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    public static /* synthetic */ void nr(g9s g9sVar, OnFailureListener onFailureListener, j jVar) {
        g9sVar.getClass();
        afx.rl().t(g9sVar);
        onFailureListener.onFailure(jVar.getError());
    }

    public static /* synthetic */ void rl(g9s g9sVar) {
        g9sVar.getClass();
        try {
            g9sVar.jB();
        } finally {
            g9sVar.ViF();
        }
    }

    public static /* synthetic */ void t(SuccessContinuation successContinuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource, j jVar) {
        try {
            Task taskThen = successContinuation.then(jVar);
            Objects.requireNonNull(taskCompletionSource);
            taskThen.addOnSuccessListener(new Xo(taskCompletionSource));
            taskThen.addOnFailureListener(new eO(taskCompletionSource));
            Objects.requireNonNull(cancellationTokenSource);
            taskThen.addOnCanceledListener(new C1918z(cancellationTokenSource));
        } catch (RuntimeExecutionException e2) {
            if (e2.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e2.getCause());
            } else {
                taskCompletionSource.setException(e2);
            }
        } catch (Exception e3) {
            taskCompletionSource.setException(e3);
        }
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public g9s addOnFailureListener(Activity activity, OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        Preconditions.checkNotNull(activity);
        this.f60877t.nr(activity, null, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: Ik, reason: merged with bridge method [inline-methods] */
    public g9s addOnFailureListener(Executor executor, OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        Preconditions.checkNotNull(executor);
        this.f60877t.nr(null, executor, onFailureListener);
        return this;
    }

    public boolean N() {
        if ((g() & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public g9s addOnSuccessListener(Executor executor, OnSuccessListener onSuccessListener) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(onSuccessListener);
        this.rl.nr(null, executor, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public g9s addOnSuccessListener(OnSuccessListener onSuccessListener) {
        Preconditions.checkNotNull(onSuccessListener);
        this.rl.nr(null, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: az, reason: merged with bridge method [inline-methods] */
    public g9s addOnCompleteListener(OnCompleteListener onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        this.nr.nr(null, null, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public g9s addOnFailureListener(OnFailureListener onFailureListener) {
        Preconditions.checkNotNull(onFailureListener);
        this.f60877t.nr(null, null, onFailureListener);
        return this;
    }

    boolean eF(int i2, boolean z2) {
        return E(new int[]{i2}, z2);
    }

    @Override // com.google.android.gms.tasks.Task
    public Exception getException() {
        if (nY() == null) {
            return null;
        }
        return nY().getError();
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
    public g9s addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        Preconditions.checkNotNull(executor);
        this.f60875O.nr(null, executor, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: iF, reason: merged with bridge method [inline-methods] */
    public j getResult(Class cls) throws Throwable {
        if (nY() != null) {
            if (!cls.isInstance(nY().getError())) {
                Exception error = nY().getError();
                if (error == null) {
                    return nY();
                }
                throw new RuntimeExecutionException(error);
            }
            throw ((Throwable) cls.cast(nY().getError()));
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isCanceled() {
        if (g() == 256) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isComplete() {
        if ((g() & 448) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    public boolean isSuccessful() {
        if ((g() & 128) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public g9s addOnCanceledListener(OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        this.f60875O.nr(null, null, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g9s addOnSuccessListener(Activity activity, OnSuccessListener onSuccessListener) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(onSuccessListener);
        this.rl.nr(activity, null, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public g9s addOnCompleteListener(Activity activity, OnCompleteListener onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        Preconditions.checkNotNull(activity);
        this.nr.nr(activity, null, onCompleteListener);
        return this;
    }

    public g9s r(aC aCVar) {
        Preconditions.checkNotNull(aCVar);
        this.J2.nr(null, null, aCVar);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: te, reason: merged with bridge method [inline-methods] */
    public j getResult() {
        if (nY() != null) {
            Exception error = nY().getError();
            if (error == null) {
                return nY();
            }
            throw new RuntimeExecutionException(error);
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: ty, reason: merged with bridge method [inline-methods] */
    public g9s addOnCompleteListener(Executor executor, OnCompleteListener onCompleteListener) {
        Preconditions.checkNotNull(onCompleteListener);
        Preconditions.checkNotNull(executor);
        this.nr.nr(null, executor, onCompleteListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public g9s addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        Preconditions.checkNotNull(onCanceledListener);
        Preconditions.checkNotNull(activity);
        this.f60875O.nr(activity, null, onCanceledListener);
        return this;
    }
}
