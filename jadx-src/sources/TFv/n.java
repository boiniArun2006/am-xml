package TFv;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class n extends Ml {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Function2 f10457r;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10459n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f10460t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10460t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.mUb(null, this);
        }
    }

    public /* synthetic */ n(Function2 function2, CoroutineContext coroutineContext, int i2, ILs.j jVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i3 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i3 & 4) != 0 ? -2 : i2, (i3 & 8) != 0 ? ILs.j.f4185n : jVar);
    }

    @Override // TFv.Ml, teV.Ml
    protected teV.Ml gh(CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        return new n(this.f10457r, coroutineContext, i2, jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // TFv.Ml, teV.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Object mUb(ILs.s4 s4Var, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f10460t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            jVar.f10459n = s4Var;
            jVar.J2 = 1;
            if (super.mUb(s4Var, jVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s4Var = (ILs.s4) jVar.f10459n;
            ResultKt.throwOnFailure(obj);
        }
        if (s4Var.gh()) {
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    public n(Function2 function2, CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        super(function2, coroutineContext, i2, jVar);
        this.f10457r = function2;
    }
}
