package GJW;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Qik {

    static final class j extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f3443O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f3444n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f3445r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3446t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f3445r |= Integer.MIN_VALUE;
            return Qik.O(0L, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [GJW.V, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(long j2, Function2 function2, Continuation continuation) {
        j jVar;
        Ref.ObjectRef objectRef;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f3445r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f3445r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f3445r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (j2 <= 0) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                jVar.f3446t = function2;
                jVar.f3443O = objectRef2;
                jVar.f3444n = j2;
                jVar.f3445r = 1;
                ?? v2 = new V(j2, jVar);
                objectRef2.element = v2;
                Object objRl = rl(v2, function2);
                if (objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(jVar);
                }
                return objRl == coroutine_suspended ? coroutine_suspended : objRl;
            } catch (TimeoutCancellationException e2) {
                e = e2;
                objectRef = objectRef2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) jVar.f3443O;
            try {
                ResultKt.throwOnFailure(obj);
                return obj;
            } catch (TimeoutCancellationException e3) {
                e = e3;
            }
        }
        if (e.coroutine == objectRef.element) {
            return null;
        }
        throw e;
    }

    public static final TimeoutCancellationException n(long j2, iF iFVar, xuv xuvVar) {
        return new TimeoutCancellationException("Timed out waiting for " + j2 + " ms", xuvVar);
    }

    private static final Object rl(V v2, Function2 function2) {
        AbstractC1363t.mUb(v2, yg.nr(v2.J2.getContext()).U(v2.f3455r, v2, v2.getContext()));
        return hND.n.O(v2, v2, function2);
    }

    public static final Object t(long j2, Function2 function2, Continuation continuation) {
        if (j2 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objRl = rl(new V(j2, continuation), function2);
        if (objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objRl;
    }

    public static final Object J2(long j2, Function2 function2, Continuation continuation) {
        return O(yg.O(j2), function2, continuation);
    }

    public static final Object nr(long j2, Function2 function2, Continuation continuation) {
        return t(yg.O(j2), function2, continuation);
    }
}
