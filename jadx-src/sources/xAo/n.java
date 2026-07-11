package xAo;

import android.content.Intent;
import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Continuation f75284n;
    private ActivityResultLauncher rl;

    static final class j extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f75285O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75286n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f75287o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f75289t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f75287o |= Integer.MIN_VALUE;
            return n.this.rl(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(n nVar, ActivityResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Continuation continuation = nVar.f75284n;
        nVar.f75284n = null;
        if (continuation != null) {
            continuation.resumeWith(Result.m313constructorimpl(it));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rl(Intent intent, Function1 function1, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f75287o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f75287o = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object orThrow = jVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f75287o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(orThrow);
            jVar.f75286n = this;
            jVar.f75289t = intent;
            jVar.f75285O = function1;
            jVar.f75287o = 1;
            SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(jVar));
            this.f75284n = safeContinuation;
            ActivityResultLauncher activityResultLauncher = this.rl;
            if (activityResultLauncher != null) {
                activityResultLauncher.n(intent);
            }
            orThrow = safeContinuation.getOrThrow();
            if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(jVar);
            }
            if (orThrow == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) jVar.f75285O;
            ResultKt.throwOnFailure(orThrow);
        }
        function1.invoke((ActivityResult) orThrow);
        return Unit.INSTANCE;
    }

    public final void t(ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.rl = activity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: xAo.j
            @Override // androidx.view.result.ActivityResultCallback
            public final void n(Object obj) {
                n.nr(this.f75282n, (ActivityResult) obj);
            }
        });
    }
}
