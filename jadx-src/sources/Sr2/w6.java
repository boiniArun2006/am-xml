package Sr2;

import Fw3.Dsr;
import GJW.OU;
import MoG.CN3;
import TFv.Wre;
import TFv.fuX;
import Z4.Ml;
import android.content.Context;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mF.w6;
import w9.C;
import w9.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class w6 {

    public static final class j implements Wre {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ CN3 f9964O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f9965n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Z4.Ml f9966t;

        /* JADX INFO: renamed from: Sr2.w6$j$j, reason: collision with other inner class name */
        public static final class C0342j implements TFv.CN3 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ CN3 f9967O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f9968n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Z4.Ml f9969t;

            /* JADX INFO: renamed from: Sr2.w6$j$j$j, reason: collision with other inner class name */
            public static final class C0343j extends ContinuationImpl {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                Object f9970O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f9971n;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f9972r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f9973t;

                public C0343j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f9971n = obj;
                    this.f9973t |= Integer.MIN_VALUE;
                    return C0342j.this.rl(null, this);
                }
            }

            public C0342j(TFv.CN3 cn3, Z4.Ml ml, CN3 cn32) {
                this.f9968n = cn3;
                this.f9969t = ml;
                this.f9967O = cn32;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
            
                if (r2.rl(r14, r0) == r1) goto L26;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0343j c0343j;
                TFv.CN3 cn3;
                Ml.j jVar;
                d2n.Ml ml;
                if (continuation instanceof C0343j) {
                    c0343j = (C0343j) continuation;
                    int i2 = c0343j.f9973t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0343j.f9973t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0343j = new C0343j(continuation);
                    }
                }
                Object obj2 = c0343j.f9971n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0343j.f9973t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    cn3 = this.f9968n;
                    Pair pair = (Pair) obj;
                    long jIk = ((d2n.Ml) pair.component1()).Ik();
                    d2n.Ml ml2 = (d2n.Ml) pair.component2();
                    d2n.Ml mlRl = d2n.Ml.rl(jIk);
                    Z4.Ml ml3 = this.f9969t;
                    Z4.n nVar = new Z4.n(this.f9967O, jIk, null);
                    if (ml2 != null) {
                        jVar = new Ml.j(new Z4.n(this.f9967O, ml2.Ik(), null), Ml.n.MEMORY_SAVING);
                    } else {
                        jVar = null;
                    }
                    c0343j.f9970O = cn3;
                    c0343j.f9972r = mlRl;
                    c0343j.f9973t = 1;
                    Object objAz = ml3.az(nVar, jVar, c0343j);
                    if (objAz != coroutine_suspended) {
                        obj2 = objAz;
                        ml = mlRl;
                    }
                    return coroutine_suspended;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    return Unit.INSTANCE;
                }
                ml = (d2n.Ml) c0343j.f9972r;
                cn3 = (TFv.CN3) c0343j.f9970O;
                ResultKt.throwOnFailure(obj2);
                Pair pair2 = TuplesKt.to(ml, obj2);
                c0343j.f9970O = null;
                c0343j.f9972r = null;
                c0343j.f9973t = 2;
            }
        }

        public j(Wre wre, Z4.Ml ml, CN3 cn3) {
            this.f9965n = wre;
            this.f9966t = ml;
            this.f9964O = cn3;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f9965n.n(new C0342j(cn3, this.f9966t, this.f9964O), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final class n implements Wre {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Sr2.n f9974O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Wre f9975n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Object f9976t;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Sr2.n f9977O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f9978n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Object f9979t;

            /* JADX INFO: renamed from: Sr2.w6$n$j$j, reason: collision with other inner class name */
            public static final class C0344j extends ContinuationImpl {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                Object f9980O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f9981n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                long f9982o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f9983r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f9984t;

                public C0344j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f9981n = obj;
                    this.f9984t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, Object obj, Sr2.n nVar) {
                this.f9978n = cn3;
                this.f9979t = obj;
                this.f9977O = nVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
            
                if (r12.rl(r13, r0) != r1) goto L29;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0344j c0344j;
                TFv.CN3 cn3;
                long jIk;
                Object obj2;
                Ml ml;
                TFv.CN3 cn32;
                long j2;
                if (continuation instanceof C0344j) {
                    c0344j = (C0344j) continuation;
                    int i2 = c0344j.f9984t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0344j.f9984t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0344j = new C0344j(continuation);
                    }
                }
                Object obj3 = c0344j.f9981n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0344j.f9984t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj3);
                    cn3 = this.f9978n;
                    Pair pair = (Pair) obj;
                    jIk = ((d2n.Ml) pair.component1()).Ik();
                    Map map = (Map) pair.component2();
                    Sr2.j jVar = new Sr2.j(jIk, this.f9979t, null);
                    Ml ml2 = new Ml(map);
                    Sr2.n nVar = this.f9977O;
                    c0344j.f9980O = cn3;
                    c0344j.f9983r = ml2;
                    c0344j.f9982o = jIk;
                    c0344j.f9984t = 1;
                    Object objN = nVar.n(jVar, c0344j);
                    if (objN != coroutine_suspended) {
                        obj2 = objN;
                        ml = ml2;
                    }
                    return coroutine_suspended;
                }
                if (i3 == 1) {
                    jIk = c0344j.f9982o;
                    ml = (Ml) c0344j.f9983r;
                    TFv.CN3 cn33 = (TFv.CN3) c0344j.f9980O;
                    ResultKt.throwOnFailure(obj3);
                    obj2 = obj3;
                    cn3 = cn33;
                } else {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj3);
                        return Unit.INSTANCE;
                    }
                    j2 = c0344j.f9982o;
                    cn32 = (TFv.CN3) c0344j.f9980O;
                    ResultKt.throwOnFailure(obj3);
                    d2n.Ml mlRl = d2n.Ml.rl(j2);
                    c0344j.f9980O = null;
                    c0344j.f9984t = 3;
                }
                c0344j.f9980O = cn3;
                c0344j.f9983r = null;
                c0344j.f9982o = jIk;
                c0344j.f9984t = 2;
                if (((I28) obj2).n(ml, c0344j) != coroutine_suspended) {
                    cn32 = cn3;
                    j2 = jIk;
                    d2n.Ml mlRl2 = d2n.Ml.rl(j2);
                    c0344j.f9980O = null;
                    c0344j.f9984t = 3;
                }
                return coroutine_suspended;
            }
        }

        public n(Wre wre, Object obj, Sr2.n nVar) {
            this.f9975n = wre;
            this.f9976t = obj;
            this.f9974O = nVar;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f9975n.n(new j(cn3, this.f9976t, this.f9974O), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: Sr2.w6$w6, reason: collision with other inner class name */
    static final class C0345w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ Sr2.n E2;
        final /* synthetic */ CN3 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private /* synthetic */ Object f9985O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Object f9986S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ VD.j f9987Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f9988g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f9989n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ w6.n f9990o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f9991r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f9992t;

        /* JADX INFO: renamed from: Sr2.w6$w6$j */
        static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f9993O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ long f9994n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ float f9995t;

            j(long j2, float f3, TFv.CN3 cn3) {
                this.f9994n = j2;
                this.f9995t = f3;
                this.f9993O = cn3;
            }

            public final Object n(long j2, Continuation continuation) {
                Object objRl = this.f9993O.rl(k9w.I28.t(k9w.I28.f69676t.n((j2 - this.f9994n) / this.f9995t)), continuation);
                return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
            }

            @Override // TFv.CN3
            public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
                return n(((d2n.Ml) obj).Ik(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0345w6(CN3 cn3, Context context, w6.n nVar, VD.j jVar, Object obj, float f3, Sr2.n nVar2, Continuation continuation) {
            super(2, continuation);
            this.J2 = cn3;
            this.f9991r = context;
            this.f9990o = nVar;
            this.f9987Z = jVar;
            this.f9986S = obj;
            this.f9988g = f3;
            this.E2 = nVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C0345w6 c0345w6 = new C0345w6(this.J2, this.f9991r, this.f9990o, this.f9987Z, this.f9986S, this.f9988g, this.E2, continuation);
            c0345w6.f9985O = obj;
            return c0345w6;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
        
            if (r1.rl(r15, r14) != r0) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            TFv.CN3 cn3;
            aC aCVar;
            TFv.CN3 cn32;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f9992t;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) this.f9985O;
                        ResultKt.throwOnFailure(obj);
                        throw th;
                    }
                    cn32 = (TFv.CN3) this.f9985O;
                    ResultKt.throwOnFailure(obj);
                    k9w.I28 i28T = k9w.I28.t(k9w.I28.f69676t.rl());
                    this.f9985O = null;
                    this.f9989n = null;
                    this.f9992t = 4;
                } else {
                    aCVar = (aC) this.f9989n;
                    TFv.CN3 cn33 = (TFv.CN3) this.f9985O;
                    try {
                        ResultKt.throwOnFailure(obj);
                        cn3 = cn33;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            this.f9985O = th3;
                            this.f9989n = null;
                            this.f9992t = 3;
                            if (C.n(aCVar, th, this) != coroutine_suspended) {
                                throw th3;
                            }
                        }
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                cn3 = (TFv.CN3) this.f9985O;
                float fT = this.J2.Uo().t();
                long jO = this.J2.Uo().O();
                Z4.Ml mlN = Z4.I28.n(this.f9991r, this.f9990o, Dsr.f3224t.n(), this.f9987Z, true);
                try {
                    Wre wreRl = w6.rl(mlN, this.J2, this.f9986S, this.f9988g, this.E2);
                    j jVar = new j(jO, fT, cn3);
                    this.f9985O = cn3;
                    this.f9989n = mlN;
                    this.f9992t = 1;
                    if (wreRl.n(jVar, this) != coroutine_suspended) {
                        aCVar = mlN;
                    }
                    return coroutine_suspended;
                } catch (Throwable th4) {
                    th = th4;
                    aCVar = mlN;
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
            this.f9985O = cn3;
            this.f9989n = unit;
            this.f9992t = 2;
            if (C.n(aCVar, null, this) != coroutine_suspended) {
                cn32 = cn3;
                k9w.I28 i28T2 = k9w.I28.t(k9w.I28.f69676t.rl());
                this.f9985O = null;
                this.f9989n = null;
                this.f9992t = 4;
            }
            return coroutine_suspended;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((C0345w6) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final Wre t(CN3 cn3, Context context, Sr2.n compositor, Object obj, w6.n resourceProvider, float f3, VD.j logger) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(compositor, "compositor");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return fuX.e(fuX.iF(new C0345w6(cn3, context, resourceProvider, logger, obj, f3, compositor, null)), OU.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Wre rl(Z4.Ml ml, CN3 cn3, Object obj, float f3, Sr2.n nVar) {
        return new n(new j(fuX.n(v9.fuX.n(k9w.j.J2(cn3.Uo(), f3))), ml, cn3), obj, nVar);
    }
}
