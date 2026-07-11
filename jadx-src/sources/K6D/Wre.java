package K6D;

import K6D.j;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Wre {

    static final class j extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f4832O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f4833n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4834r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f4835t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f4834r |= Integer.MIN_VALUE;
            return Wre.rl(null, null, null, null, null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f4836n = new n();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }

        n() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pq.Ml nr(x0X.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new pq.Ml();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(rB.Ml ml, ajd.j jVar, Function1 function1, Function1 function12, Function1 function13, Continuation continuation) {
        j jVar2;
        K6D.j jVarRl;
        if (continuation instanceof j) {
            jVar2 = (j) continuation;
            int i2 = jVar2.f4834r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar2.f4834r = i2 - Integer.MIN_VALUE;
            } else {
                jVar2 = new j(continuation);
            }
        }
        Object objInvoke = jVar2.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar2.f4834r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            jVarRl = ml.O().rl(jVar, UUID.randomUUID().toString());
            jVar2.f4833n = function1;
            jVar2.f4835t = function12;
            jVar2.f4832O = jVarRl;
            jVar2.f4834r = 1;
            objInvoke = function13.invoke(jVar2);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVarRl = (K6D.j) jVar2.f4832O;
            function12 = (Function1) jVar2.f4835t;
            function1 = (Function1) jVar2.f4833n;
            ResultKt.throwOnFailure(objInvoke);
        }
        K6D.j jVar3 = jVarRl;
        x0X.n nVar = (x0X.n) objInvoke;
        pq.Ml ml2 = (pq.Ml) function1.invoke(nVar);
        boolean z2 = nVar instanceof n.C1266n;
        if (!z2) {
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            ((n.w6) nVar).n();
            jVar3.n(ml2);
        }
        if (z2) {
            j.C0175j.rl(jVar3, (String) function12.invoke(((n.C1266n) nVar).n()), null, ml2, 2, null);
            return nVar;
        }
        if (nVar instanceof n.w6) {
            return nVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Object t(rB.Ml ml, ajd.j jVar, Function1 function1, Function1 function12, Function1 function13, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = new Function1() { // from class: K6D.I28
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Wre.nr((x0X.n) obj2);
                }
            };
        }
        Function1 function14 = function1;
        if ((i2 & 4) != 0) {
            function12 = n.f4836n;
        }
        return rl(ml, jVar, function14, function12, function13, continuation);
    }
}
