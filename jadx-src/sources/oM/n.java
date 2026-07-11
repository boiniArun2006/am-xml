package oM;

import GJW.Pl;
import GJW.eO;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {

    static final class j implements OnCompleteListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Pl f71431n;

        j(Pl pl) {
            this.f71431n = pl;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    Pl.j.n(this.f71431n, null, 1, null);
                    return;
                }
                Pl pl = this.f71431n;
                Result.Companion companion = Result.INSTANCE;
                pl.resumeWith(Result.m313constructorimpl(task.getResult()));
                return;
            }
            Pl pl3 = this.f71431n;
            Result.Companion companion2 = Result.INSTANCE;
            pl3.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(exception)));
        }
    }

    /* JADX INFO: renamed from: oM.n$n, reason: collision with other inner class name */
    static final class C1083n implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f71432n;

        C1083n(CancellationTokenSource cancellationTokenSource) {
            this.f71432n = cancellationTokenSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void n(Throwable th) {
            this.f71432n.cancel();
        }
    }

    public static final Object n(Task task, Continuation continuation) {
        return rl(task, null, continuation);
    }

    private static final Object rl(Task task, CancellationTokenSource cancellationTokenSource, Continuation continuation) throws Exception {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (!task.isCanceled()) {
                    return task.getResult();
                }
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            throw exception;
        }
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        task.addOnCompleteListener(oM.j.f71430n, new j(eOVar));
        if (cancellationTokenSource != null) {
            eOVar.J2(new C1083n(cancellationTokenSource));
        }
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU;
    }
}
