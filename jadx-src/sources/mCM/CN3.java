package mCM;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import oSp.j;
import oW.InterfaceC2314n;
import yJ.InterfaceC2435j;
import yJ.InterfaceC2436n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class CN3 implements j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AtomicReference f70650O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final oSp.n f70651n;
    private final String nr;
    private final oSp.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f70652t;

    public CN3(oSp.n tokenProvider, oSp.n instanceId, oSp.j appCheckDeferred, Executor executor) {
        Intrinsics.checkNotNullParameter(tokenProvider, "tokenProvider");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(appCheckDeferred, "appCheckDeferred");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f70651n = tokenProvider;
        this.rl = instanceId;
        this.f70652t = executor;
        this.nr = "FirebaseContextProvider";
        this.f70650O = new AtomicReference();
        appCheckDeferred.n(new j.InterfaceC1084j() { // from class: mCM.n
            @Override // oSp.j.InterfaceC1084j
            public final void n(oSp.n nVar) {
                CN3.Uo(this.f70670n, nVar);
            }
        });
    }

    private final Task KN(boolean z2) {
        InterfaceC2436n interfaceC2436n = (InterfaceC2436n) this.f70650O.get();
        if (interfaceC2436n == null) {
            Task taskForResult = Tasks.forResult(null);
            Intrinsics.checkNotNullExpressionValue(taskForResult, "forResult(null)");
            return taskForResult;
        }
        Task taskT = z2 ? interfaceC2436n.t() : interfaceC2436n.n(false);
        Intrinsics.checkNotNullExpressionValue(taskT, "if (getLimitedUseAppChec… appCheck.getToken(false)");
        Task taskOnSuccessTask = taskT.onSuccessTask(this.f70652t, new SuccessContinuation() { // from class: mCM.I28
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return CN3.xMQ(this.f70654n, (Dh.Ml) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(taskOnSuccessTask, "tokenTask.onSuccessTask(…esult(result.token)\n    }");
        return taskOnSuccessTask;
    }

    public static void O(Dh.Ml it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo(CN3 this$0, oSp.n p2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(p2, "p");
        InterfaceC2436n interfaceC2436n = (InterfaceC2436n) p2.get();
        this$0.f70650O.set(interfaceC2436n);
        interfaceC2436n.rl(new InterfaceC2435j() { // from class: mCM.Wre
            @Override // yJ.InterfaceC2435j
            public final void n(Dh.Ml ml) {
                CN3.O(ml);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gh(Task task) throws Exception {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            return ((com.google.firebase.auth.Dsr) task.getResult()).t();
        }
        Exception exception = task.getException();
        if (exception instanceof FirebaseNoSignedInUserException) {
            return null;
        }
        Intrinsics.checkNotNull(exception);
        throw exception;
    }

    private final Task mUb() {
        InterfaceC2314n interfaceC2314n = (InterfaceC2314n) this.f70651n.get();
        if (interfaceC2314n == null) {
            Task taskForResult = Tasks.forResult(null);
            Intrinsics.checkNotNullExpressionValue(taskForResult, "forResult(null)");
            return taskForResult;
        }
        Task taskContinueWith = interfaceC2314n.rl(false).continueWith(this.f70652t, new Continuation() { // from class: mCM.Ml
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return CN3.gh(task);
            }
        });
        Intrinsics.checkNotNullExpressionValue(taskContinueWith, "auth.getAccessToken(fals…  }\n      authToken\n    }");
        return taskContinueWith;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task qie(Task authToken, CN3 this$0, Task appCheckToken, Void r3) {
        Intrinsics.checkNotNullParameter(authToken, "$authToken");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appCheckToken, "$appCheckToken");
        return Tasks.forResult(new z((String) authToken.getResult(), ((Qc1.j) this$0.rl.get()).n(), (String) appCheckToken.getResult()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Task xMQ(CN3 this$0, Dh.Ml result) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.n() != null) {
            Log.w(this$0.nr, "Error getting App Check token. Error: " + result.n());
        }
        return Tasks.forResult(result.rl());
    }

    @Override // mCM.j
    public Task n(boolean z2) {
        final Task taskMUb = mUb();
        final Task taskKN = KN(z2);
        return Tasks.whenAll((Task<?>[]) new Task[]{taskMUb, taskKN}).onSuccessTask(this.f70652t, new SuccessContinuation() { // from class: mCM.w6
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return CN3.qie(taskMUb, this, taskKN, (Void) obj);
            }
        });
    }
}
