package ILs;

import GJW.vd;
import ILs.C;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
abstract /* synthetic */ class Xo {

    static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ r f4181O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f4182n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f4183t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(r rVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f4181O = rVar;
            this.J2 = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f4181O, this.J2, continuation);
            jVar.f4183t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM313constructorimpl;
            Object objN;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f4182n;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    r rVar = this.f4181O;
                    Object obj2 = this.J2;
                    Result.Companion companion = Result.INSTANCE;
                    this.f4182n = 1;
                    if (rVar.mUb(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m320isSuccessimpl(objM313constructorimpl)) {
                objN = C.rl.t(Unit.INSTANCE);
            } else {
                objN = C.rl.n(Result.m316exceptionOrNullimpl(objM313constructorimpl));
            }
            return C.rl(objN);
        }
    }

    public static final Object n(r rVar, Object obj) {
        Object objNr = rVar.nr(obj);
        if (!(objNr instanceof C.w6)) {
            return C.rl.t(Unit.INSTANCE);
        }
        return ((C) GJW.aC.rl(null, new j(rVar, obj, null), 1, null)).az();
    }
}
