package Zo7;

import Ds.Ml;
import Fl.eO;
import GJW.Dsr;
import GJW.OU;
import GJW.vd;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import w.InterfaceC2413n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j implements vjm.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2413n f12603n;

    /* JADX INFO: renamed from: Zo7.j$j, reason: collision with other inner class name */
    static final class C0456j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f12604n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0456j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        C0456j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new C0456j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strN;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f12604n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
                if (jVar.getNewInstall() && !jVar.getAgreedPrivacy()) {
                    return eO.j.f3095n;
                }
                K0.n nVarN = j.this.f12603n.n();
                if (nVarN != null) {
                    this.f12604n = 1;
                    obj = nVarN.O(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                strN = null;
                return new eO.n(strN);
            }
            Ml ml = (Ml) obj;
            if (ml != null) {
                strN = ml.n();
            } else {
                strN = null;
            }
            return new eO.n(strN);
        }
    }

    public j(InterfaceC2413n getMonorepoLibUseCase) {
        Intrinsics.checkNotNullParameter(getMonorepoLibUseCase, "getMonorepoLibUseCase");
        this.f12603n = getMonorepoLibUseCase;
    }

    @Override // vjm.j
    public Object n(Continuation continuation) {
        return Dsr.Uo(OU.rl(), new C0456j(null), continuation);
    }
}
