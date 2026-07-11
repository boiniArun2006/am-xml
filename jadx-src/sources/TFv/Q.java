package TFv;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.InlineMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract /* synthetic */ class Q {

    static final class Ml extends SuspendLambda implements Function3 {
        final /* synthetic */ Function3 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f10301O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10302n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f10303t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Function3 function3, Continuation continuation) {
            super(3, continuation);
            this.J2 = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CN3 cn3, Object[] objArr, Continuation continuation) {
            Ml ml = new Ml(this.J2, continuation);
            ml.f10303t = cn3;
            ml.f10301O = objArr;
            return ml.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r1.rl(r7, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CN3 cn3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f10302n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cn3 = (CN3) this.f10303t;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                cn3 = (CN3) this.f10303t;
                Object[] objArr = (Object[]) this.f10301O;
                Function3 function3 = this.J2;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f10303t = cn3;
                this.f10302n = 1;
                obj = function3.invoke(obj2, obj3, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            this.f10303t = null;
            this.f10302n = 2;
        }
    }

    public static final class j implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre[] f10304n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function4 f10305t;

        /* JADX INFO: renamed from: TFv.Q$j$j, reason: collision with other inner class name */
        public static final class C0362j extends SuspendLambda implements Function3 {
            final /* synthetic */ Function4 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            /* synthetic */ Object f10306O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f10307n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f10308t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0362j(Continuation continuation, Function4 function4) {
                super(3, continuation);
                this.J2 = function4;
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CN3 cn3, Object[] objArr, Continuation continuation) {
                C0362j c0362j = new C0362j(continuation, this.J2);
                c0362j.f10308t = cn3;
                c0362j.f10306O = objArr;
                return c0362j.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
            
                if (r1.rl(r8, r7) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                CN3 cn3;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f10307n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cn3 = (CN3) this.f10308t;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    cn3 = (CN3) this.f10308t;
                    Object[] objArr = (Object[]) this.f10306O;
                    Function4 function4 = this.J2;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f10308t = cn3;
                    this.f10307n = 1;
                    InlineMarker.mark(6);
                    obj = function4.invoke(obj2, obj3, obj4, this);
                    InlineMarker.mark(7);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                this.f10308t = null;
                this.f10307n = 2;
            }
        }

        public j(Wre[] wreArr, Function4 function4) {
            this.f10304n = wreArr;
            this.f10305t = function4;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = teV.Dsr.n(cn3, this.f10304n, Q.J2(), new C0362j(null, this.f10305t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final class n implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre[] f10309n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function5 f10310t;

        public static final class j extends SuspendLambda implements Function3 {
            final /* synthetic */ Function5 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            /* synthetic */ Object f10311O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f10312n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f10313t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(Continuation continuation, Function5 function5) {
                super(3, continuation);
                this.J2 = function5;
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CN3 cn3, Object[] objArr, Continuation continuation) {
                j jVar = new j(continuation, this.J2);
                jVar.f10313t = cn3;
                jVar.f10311O = objArr;
                return jVar.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
            
                if (r1.rl(r11, r10) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                CN3 cn3;
                j jVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f10312n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cn3 = (CN3) this.f10313t;
                    ResultKt.throwOnFailure(obj);
                    jVar = this;
                } else {
                    ResultKt.throwOnFailure(obj);
                    cn3 = (CN3) this.f10313t;
                    Object[] objArr = (Object[]) this.f10311O;
                    Function5 function5 = this.J2;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f10313t = cn3;
                    this.f10312n = 1;
                    InlineMarker.mark(6);
                    jVar = this;
                    obj = function5.invoke(obj2, obj3, obj4, obj5, jVar);
                    InlineMarker.mark(7);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                jVar.f10313t = null;
                jVar.f10312n = 2;
            }
        }

        public n(Wre[] wreArr, Function5 function5) {
            this.f10309n = wreArr;
            this.f10310t = function5;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = teV.Dsr.n(cn3, this.f10309n, Q.J2(), new j(null, this.f10310t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final class w6 implements Wre {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function3 f10314O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f10315n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Wre f10316t;

        public w6(Wre wre, Wre wre2, Function3 function3) {
            this.f10315n = wre;
            this.f10316t = wre2;
            this.f10314O = function3;
        }

        @Override // TFv.Wre
        public Object n(CN3 cn3, Continuation continuation) {
            Object objN = teV.Dsr.n(cn3, new Wre[]{this.f10315n, this.f10316t}, Q.J2(), new Ml(this.f10314O, null), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final Wre rl(Wre wre, Wre wre2, Wre wre3, Wre wre4, Function5 function5) {
        return new n(new Wre[]{wre, wre2, wre3, wre4}, function5);
    }

    public static final Wre t(Wre wre, Wre wre2, Wre wre3, Function4 function4) {
        return new j(new Wre[]{wre, wre2, wre3}, function4);
    }

    static final class I28 implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f10300n = new I28();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }

        I28() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0 J2() {
        return I28.f10300n;
    }

    public static final Wre O(Wre wre, Wre wre2, Function3 function3) {
        return new w6(wre, wre2, function3);
    }

    public static final Wre nr(Wre wre, Wre wre2, Function3 function3) {
        return fuX.fD(wre, wre2, function3);
    }
}
