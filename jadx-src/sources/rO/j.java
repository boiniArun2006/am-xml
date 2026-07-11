package rO;

import QmE.iF;
import QmE.j;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {
    public static final C1157j rl = new C1157j(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f73013t = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iF f73014n;

    /* JADX INFO: renamed from: rO.j$j, reason: collision with other inner class name */
    public static final class C1157j {
        public /* synthetic */ C1157j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1157j() {
        }
    }

    static final class n implements OnCompleteListener {
        final /* synthetic */ Continuation rl;

        n(Continuation continuation) {
            this.rl = continuation;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (!task.isSuccessful()) {
                j.this.t(task.getException());
            }
            Continuation continuation = this.rl;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m313constructorimpl(Unit.INSTANCE));
        }
    }

    public j(iF eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73014n = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(Exception exc) {
        this.f73014n.n(new j.C0292j(exc != null ? exc.getMessage() : null, "unable_to_set_campaign"));
    }

    public final Object rl(Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        com.google.firebase.functions.n.mUb.t().ck("setAccountProperty").rl(MapsKt.mapOf(TuplesKt.to("campaign", cg.n.f43808t.rl()))).addOnCompleteListener(new n(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? orThrow : Unit.INSTANCE;
    }
}
