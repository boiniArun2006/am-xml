package gIX;

import GJW.yg;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class vd {

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f67451O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f67452n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f67453t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67451O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return vd.n(null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(Function1 function1, Continuation continuation) {
        j jVar;
        int i2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i3 = jVar.J2;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f67451O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = jVar.J2;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            i2 = 0;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = jVar.f67453t;
            Function1 function12 = (Function1) jVar.f67452n;
            ResultKt.throwOnFailure(obj);
            i2 = i7;
            function1 = function12;
        }
        while (i2 < 100) {
            i2 += 2;
            function1.invoke(Boxing.boxFloat(i2 * 0.01f));
            jVar.f67452n = function1;
            jVar.f67453t = i2;
            jVar.J2 = 1;
            if (yg.rl(45L, jVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
