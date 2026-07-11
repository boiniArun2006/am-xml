package w9;

import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class C {

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f74797O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f74798n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f74799t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f74799t = obj;
            this.f74797O |= Integer.MIN_VALUE;
            return C.n(null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r5.rl(r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r5.rl(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(aC aCVar, Throwable th, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f74797O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f74797O = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f74799t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f74797O;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (aCVar != null) {
                    if (th == null) {
                        jVar.f74797O = 1;
                    } else {
                        jVar.f74798n = th;
                        jVar.f74797O = 2;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i3 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) jVar.f74798n;
                ResultKt.throwOnFailure(obj);
            }
        } catch (Throwable th2) {
            ExceptionsKt.addSuppressed(th, th2);
        }
        return Unit.INSTANCE;
    }
}
