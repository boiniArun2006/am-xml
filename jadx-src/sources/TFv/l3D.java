package TFv;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract /* synthetic */ class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f10453n = dzu.DAz.rl("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    static final class j extends SuspendLambda implements Function3 {
        final /* synthetic */ Function2 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f10454O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10455n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f10456t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function2 function2, Continuation continuation) {
            super(3, continuation);
            this.J2 = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CN3 cn3, Object obj, Continuation continuation) {
            j jVar = new j(this.J2, continuation);
            jVar.f10456t = cn3;
            jVar.f10454O = obj;
            return jVar.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.rl(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CN3 cn3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f10455n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cn3 = (CN3) this.f10456t;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                cn3 = (CN3) this.f10456t;
                Object obj2 = this.f10454O;
                Function2 function2 = this.J2;
                this.f10456t = cn3;
                this.f10455n = 1;
                obj = function2.invoke(obj2, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            this.f10456t = null;
            this.f10455n = 2;
        }
    }

    public static final Wre n(Wre wre, Function2 function2) {
        return fuX.P5(wre, new j(function2, null));
    }

    public static final Wre rl(Wre wre, Function3 function3) {
        return new teV.fuX(function3, wre, null, 0, null, 28, null);
    }
}
