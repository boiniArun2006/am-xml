package HX;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n {

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f3912n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3913t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3912n = obj;
            this.f3913t |= Integer.MIN_VALUE;
            return n.n(null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(HX.j jVar, Continuation continuation) {
        j jVar2;
        if (continuation instanceof j) {
            jVar2 = (j) continuation;
            int i2 = jVar2.f3913t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar2.f3913t = i2 - Integer.MIN_VALUE;
            } else {
                jVar2 = new j(continuation);
            }
        }
        Object objN = jVar2.f3912n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar2.f3913t;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objN);
                jVar2.f3913t = 1;
                objN = jVar.n(jVar2);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objN);
            }
            return new n.w6(objN);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            return new n.C1266n(e3);
        }
    }
}
