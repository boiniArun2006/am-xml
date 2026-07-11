package teV;

import GJW.AbstractC1363t;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class l3D extends ContinuationImpl implements TFv.CN3, CoroutineStackFrame {
    private CoroutineContext J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f73651O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TFv.CN3 f73652n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Continuation f73653r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CoroutineContext f73654t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public l3D(TFv.CN3 cn3, CoroutineContext coroutineContext) {
        super(Xo.f73620n, EmptyCoroutineContext.INSTANCE);
        this.f73652n = cn3;
        this.f73654t = coroutineContext;
        this.f73651O = ((Number) coroutineContext.fold(0, new Function2() { // from class: teV.QJ
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(l3D.xMQ(((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue();
    }

    private final void O(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Object obj) {
        if (coroutineContext2 instanceof aC) {
            gh((aC) coroutineContext2, obj);
        }
        UGc.rl(this, coroutineContext);
    }

    private final void gh(aC aCVar, Object obj) {
        throw new IllegalStateException(StringsKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aCVar.f73623t + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int xMQ(int i2, CoroutineContext.Element element) {
        return i2 + 1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f73653r;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.J2;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    private final Object mUb(Continuation continuation, Object obj) {
        CoroutineContext context = continuation.getContext();
        AbstractC1363t.qie(context);
        CoroutineContext coroutineContext = this.J2;
        if (coroutineContext != context) {
            O(context, coroutineContext, obj);
            this.J2 = context;
        }
        this.f73653r = continuation;
        Function3 function3 = AbstractC2379c.f73624n;
        TFv.CN3 cn3 = this.f73652n;
        Intrinsics.checkNotNull(cn3, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = function3.invoke(cn3, obj, this);
        if (!Intrinsics.areEqual(objInvoke, IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
            this.f73653r = null;
        }
        return objInvoke;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    protected Object invokeSuspend(Object obj) {
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(obj);
        if (thM316exceptionOrNullimpl != null) {
            this.J2 = new aC(thM316exceptionOrNullimpl, getContext());
        }
        Continuation continuation = this.f73653r;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // TFv.CN3
    public Object rl(Object obj, Continuation continuation) {
        try {
            Object objMUb = mUb(continuation, obj);
            if (objMUb == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            if (objMUb == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objMUb;
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.J2 = new aC(th, continuation.getContext());
            throw th;
        }
    }
}
