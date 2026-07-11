package TFv;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class iwV implements Ln {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ rv6 f10442O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10443n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f10444t;

        /* JADX INFO: renamed from: TFv.iwV$j$j, reason: collision with other inner class name */
        static final class C0366j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Ref.BooleanRef f10445n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ CN3 f10446t;

            /* JADX INFO: renamed from: TFv.iwV$j$j$j, reason: collision with other inner class name */
            static final class C0367j extends ContinuationImpl {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                int f10447O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f10448n;

                C0367j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f10448n = obj;
                    this.f10447O |= Integer.MIN_VALUE;
                    return C0366j.this.n(0, this);
                }
            }

            C0366j(Ref.BooleanRef booleanRef, CN3 cn3) {
                this.f10445n = booleanRef;
                this.f10446t = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object n(int i2, Continuation continuation) {
                C0367j c0367j;
                if (continuation instanceof C0367j) {
                    c0367j = (C0367j) continuation;
                    int i3 = c0367j.f10447O;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c0367j.f10447O = i3 - Integer.MIN_VALUE;
                    } else {
                        c0367j = new C0367j(continuation);
                    }
                }
                Object obj = c0367j.f10448n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i5 = c0367j.f10447O;
                if (i5 == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (i2 > 0) {
                        Ref.BooleanRef booleanRef = this.f10445n;
                        if (!booleanRef.element) {
                            booleanRef.element = true;
                            CN3 cn3 = this.f10446t;
                            u uVar = u.f10480n;
                            c0367j.f10447O = 1;
                            if (cn3.rl(uVar, c0367j) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }

            @Override // TFv.CN3
            public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
                return n(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(rv6 rv6Var, Continuation continuation) {
            super(2, continuation);
            this.f10442O = rv6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f10442O, continuation);
            jVar.f10444t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f10443n;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                CN3 cn3 = (CN3) this.f10444t;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                rv6 rv6Var = this.f10442O;
                C0366j c0366j = new C0366j(booleanRef, cn3);
                this.f10443n = 1;
                if (rv6Var.n(c0366j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CN3 cn3, Continuation continuation) {
            return ((j) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // TFv.Ln
    public Wre n(rv6 rv6Var) {
        return fuX.iF(new j(rv6Var, null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
