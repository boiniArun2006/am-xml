package androidx.core.os;

import ILs.l3D;
import ILs.s4;
import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LILs/s4;", "Landroid/os/ProfilingResult;", "", "<anonymous>", "(LILs/s4;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", f = "Profiling.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
final class Profiling$registerForAllProfilingResults$1 extends SuspendLambda implements Function2<s4, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Context f36542O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f36543n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private /* synthetic */ Object f36544t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Profiling$registerForAllProfilingResults$1(Context context, Continuation continuation) {
        super(2, continuation);
        this.f36542O = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Profiling$registerForAllProfilingResults$1 profiling$registerForAllProfilingResults$1 = new Profiling$registerForAllProfilingResults$1(this.f36542O, continuation);
        profiling$registerForAllProfilingResults$1.f36544t = obj;
        return profiling$registerForAllProfilingResults$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(s4 s4Var, ProfilingResult result) {
        Intrinsics.checkNotNullExpressionValue(result, "result");
        s4Var.nr(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gh(Runnable runnable) {
        runnable.run();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f36543n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final s4 s4Var = (s4) this.f36544t;
            final Consumer consumer = new Consumer() { // from class: androidx.core.os.I28
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    Profiling$registerForAllProfilingResults$1.mUb(s4Var, (ProfilingResult) obj2);
                }
            };
            final ProfilingManager profilingManagerN = w6.n(this.f36542O.getSystemService(n.n()));
            profilingManagerN.registerForAllProfilingResults(new Executor() { // from class: androidx.core.os.Wre
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    Profiling$registerForAllProfilingResults$1.gh(runnable);
                }
            }, consumer);
            Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.core.os.Profiling$registerForAllProfilingResults$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    profilingManagerN.unregisterForAllProfilingResults(consumer);
                }
            };
            this.f36543n = 1;
            if (l3D.rl(s4Var, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public final Object invoke(s4 s4Var, Continuation continuation) {
        return ((Profiling$registerForAllProfilingResults$1) create(s4Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
