package fE;

import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Wre {

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f66647O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f66648n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f66649t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f66649t = obj;
            this.f66647O |= Integer.MIN_VALUE;
            return Wre.n(null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(w6 w6Var, Continuation continuation) {
        j jVar;
        List list;
        x0X.n nVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f66647O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f66647O = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objJ2 = jVar.f66649t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f66647O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objJ2);
            jVar.f66648n = w6Var;
            jVar.f66647O = 1;
            objJ2 = w6Var.J2("subs", jVar);
            if (objJ2 != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) jVar.f66648n;
            ResultKt.throwOnFailure(objJ2);
            nVar = (x0X.n) objJ2;
            if (!(nVar instanceof n.C1266n)) {
                return nVar;
            }
            if (nVar instanceof n.w6) {
                return new n.w6(CollectionsKt.plus((Collection) list, (Iterable) ((n.w6) nVar).n()));
            }
            throw new NoWhenBranchMatchedException();
        }
        w6Var = (w6) jVar.f66648n;
        ResultKt.throwOnFailure(objJ2);
        x0X.n nVar2 = (x0X.n) objJ2;
        if (nVar2 instanceof n.C1266n) {
            return nVar2;
        }
        if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        List list2 = (List) ((n.w6) nVar2).n();
        jVar.f66648n = list2;
        jVar.f66647O = 2;
        Object objJ22 = w6Var.J2("inapp", jVar);
        if (objJ22 != coroutine_suspended) {
            objJ2 = objJ22;
            list = list2;
            nVar = (x0X.n) objJ2;
            if (!(nVar instanceof n.C1266n)) {
            }
        }
        return coroutine_suspended;
    }
}
