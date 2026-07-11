package TFv;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class K implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f10283n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function2 f10284t;

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f10285O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f10286n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f10287r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f10288t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f10285O = obj;
            this.f10287r |= Integer.MIN_VALUE;
            return K.this.n(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (((TFv.K) r7).n(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [teV.l3D] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Continuation continuation) {
        j jVar;
        teV.l3D l3d;
        K k2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f10287r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f10287r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f10285O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = jVar.f10287r;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(obj);
                l3d = new teV.l3D(this.f10283n, jVar.getContext());
                Function2 function2 = this.f10284t;
                jVar.f10286n = this;
                jVar.f10288t = l3d;
                jVar.f10287r = 1;
                if (function2.invoke(l3d, jVar) != coroutine_suspended) {
                    k2 = this;
                }
                return coroutine_suspended;
            }
            if (r2 != 1) {
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            l3d = (teV.l3D) jVar.f10288t;
            k2 = (K) jVar.f10286n;
            ResultKt.throwOnFailure(obj);
            l3d.releaseIntercepted();
            CN3 cn3 = k2.f10283n;
            r2 = cn3 instanceof K;
            if (r2 == 0) {
                return Unit.INSTANCE;
            }
            jVar.f10286n = null;
            jVar.f10288t = null;
            jVar.f10287r = 2;
        } catch (Throwable th) {
            r2.releaseIntercepted();
            throw th;
        }
    }

    @Override // TFv.CN3
    public Object rl(Object obj, Continuation continuation) {
        return this.f10283n.rl(obj, continuation);
    }

    public K(CN3 cn3, Function2 function2) {
        this.f10283n = cn3;
        this.f10284t = function2;
    }
}
