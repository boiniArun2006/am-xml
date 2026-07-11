package x0X;

import java.util.Collection;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class w6 {

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f75186n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f75187t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75186n = obj;
            this.f75187t |= Integer.MIN_VALUE;
            return w6.Uo(null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    public static final boolean J2(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return nVar instanceof n.w6;
    }

    public static final boolean O(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return nVar instanceof n.C1266n;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Uo(Function1 function1, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f75187t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f75187t = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objInvoke = jVar.f75186n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f75187t;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                jVar.f75187t = 1;
                objInvoke = function1.invoke(jVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
            return new n.w6(objInvoke);
        } catch (Throwable th) {
            return new n.C1266n(th);
        }
    }

    public static final n n(Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            return new n.w6(action.invoke());
        } catch (Throwable th) {
            return new n.C1266n(th);
        }
    }

    public static final Object nr(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        if (nVar instanceof n.w6) {
            return ((n.w6) nVar).n();
        }
        return null;
    }

    public static final Object rl(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        if (nVar instanceof n.C1266n) {
            return ((n.C1266n) nVar).n();
        }
        return null;
    }

    public static final n t(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar instanceof n.C1266n) {
                return new n.C1266n(((n.C1266n) nVar).n());
            }
        }
        return new n.w6(Unit.INSTANCE);
    }
}
