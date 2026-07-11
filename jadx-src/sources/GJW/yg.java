package GJW;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class yg {

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f3510n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3511t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3510n = obj;
            this.f3511t |= Integer.MIN_VALUE;
            return yg.n(this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f3511t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f3511t = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f3510n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f3511t;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            jVar.f3511t = 1;
            eO eOVar = new eO(IntrinsicsKt.intercepted(jVar), 1);
            eOVar.e();
            Object objWPU = eOVar.WPU();
            if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(jVar);
            }
            if (objWPU == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    public static final iF nr(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(ContinuationInterceptor.INSTANCE);
        iF iFVar = element instanceof iF ? (iF) element : null;
        return iFVar == null ? Zs.n() : iFVar;
    }

    public static final Object rl(long j2, Continuation continuation) {
        if (j2 <= 0) {
            return Unit.INSTANCE;
        }
        eO eOVar = new eO(IntrinsicsKt.intercepted(continuation), 1);
        eOVar.e();
        if (j2 < Long.MAX_VALUE) {
            nr(eOVar.get$context()).z(j2, eOVar);
        }
        Object objWPU = eOVar.WPU();
        if (objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objWPU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWPU : Unit.INSTANCE;
    }

    public static final long O(long j2) {
        boolean zM1679isPositiveimpl = Duration.m1679isPositiveimpl(j2);
        if (zM1679isPositiveimpl) {
            return Duration.m1663getInWholeMillisecondsimpl(Duration.m1681plusLRDsOJo(j2, DurationKt.toDuration(999999L, DurationUnit.NANOSECONDS)));
        }
        if (!zM1679isPositiveimpl) {
            return 0L;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Object t(long j2, Continuation continuation) {
        Object objRl = rl(O(j2), continuation);
        if (objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objRl;
        }
        return Unit.INSTANCE;
    }
}
