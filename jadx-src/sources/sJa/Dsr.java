package sJa;

import GJW.C;
import GJW.Lu;
import GJW.vd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Dsr {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1[] f73195O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73196n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f73197t;

        /* JADX INFO: renamed from: sJa.Dsr$j$j, reason: collision with other inner class name */
        static final class C1164j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f73198n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function1 f73199t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1164j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1164j(Function1 function1, Continuation continuation) {
                super(2, continuation);
                this.f73199t = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1164j(this.f73199t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f73198n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.f73199t;
                this.f73198n = 1;
                Object objInvoke = function1.invoke(this);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function1[] function1Arr, Continuation continuation) {
            super(2, continuation);
            this.f73195O = function1Arr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f73195O, continuation);
            jVar.f73197t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73196n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f73197t;
            List list = ArraysKt.toList(this.f73195O);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C.rl(vdVar, null, null, new C1164j((Function1) it.next(), null), 3, null));
            }
            this.f73196n = 1;
            Object objN = GJW.Wre.n(arrayList, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }
    }

    public static final Object n(Function1[] function1Arr, Continuation continuation) {
        return Lu.J2(new j(function1Arr, null), continuation);
    }
}
