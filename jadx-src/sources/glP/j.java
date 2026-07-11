package glP;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import w.InterfaceC2413n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j implements Zs.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2413n f67638n;

    /* JADX INFO: renamed from: glP.j$j, reason: collision with other inner class name */
    static final class C0950j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f67639O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f67640n;

        C0950j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f67640n = obj;
            this.f67639O |= Integer.MIN_VALUE;
            return j.this.n(this);
        }
    }

    public j(InterfaceC2413n getMonorepoLibUseCase) {
        Intrinsics.checkNotNullParameter(getMonorepoLibUseCase, "getMonorepoLibUseCase");
        this.f67638n = getMonorepoLibUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Zs.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        C0950j c0950j;
        Pr.w6 w6VarUo;
        if (continuation instanceof C0950j) {
            c0950j = (C0950j) continuation;
            int i2 = c0950j.f67639O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0950j.f67639O = i2 - Integer.MIN_VALUE;
            } else {
                c0950j = new C0950j(continuation);
            }
        }
        Object objUo = c0950j.f67640n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0950j.f67639O;
        boolean z2 = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            K0.n nVarN = this.f67638n.n();
            if (nVarN != null && (w6VarUo = nVarN.Uo()) != null) {
                c0950j.f67639O = 1;
                objUo = w6VarUo.Uo(c0950j);
                if (objUo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxBoolean(z2);
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objUo);
        if (((Boolean) objUo).booleanValue()) {
            z2 = true;
        }
        return Boxing.boxBoolean(z2);
    }
}
