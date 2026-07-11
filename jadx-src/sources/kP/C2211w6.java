package kP;

import GJW.Lu;
import GJW.N;
import GJW.OU;
import GJW.vd;
import KW9.n;
import TFv.SPz;
import android.content.Context;
import com.bendingspoons.injet.ui.InjetPresenterActivity;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import x0X.n;

/* JADX INFO: renamed from: kP.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C2211w6 implements InterfaceC2210n {
    private SPz HI;
    private final j8.Ml Ik;
    private final Function1 J2;
    private final EnumC2205I28 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final rB.Ml f69861O;
    private final Function1 Uo;
    private boolean az;
    private final qI.w6 ck;
    private final nfZ.CN3 gh;
    private final vd mUb;
    private final sP.j nr;
    private final SPz qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final qI.n f69862r;
    private final Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f69863t;
    private boolean ty;
    private final Function0 xMQ;

    /* JADX INFO: renamed from: kP.w6$C */
    static final class C extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69864n;

        C(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return C2211w6.this.new C(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69864n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C2211w6 c2211w6 = C2211w6.this;
                this.f69864n = 1;
                if (c2211w6.Ik(false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            C2211w6.this.qie.setValue(j.n.f69899n);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: kP.w6$CN3 */
    public static final class CN3 implements TFv.Wre {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f69866O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f69867n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ C2211w6 f69868t;

        /* JADX INFO: renamed from: kP.w6$CN3$j */
        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ String f69869O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f69870n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ C2211w6 f69871t;

            /* JADX INFO: renamed from: kP.w6$CN3$j$j, reason: collision with other inner class name */
            public static final class C1024j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f69873n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f69874t;

                public C1024j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f69873n = obj;
                    this.f69874t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, C2211w6 c2211w6, String str) {
                this.f69870n = cn3;
                this.f69871t = c2211w6;
                this.f69869O = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1024j c1024j;
                if (continuation instanceof C1024j) {
                    c1024j = (C1024j) continuation;
                    int i2 = c1024j.f69874t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1024j.f69874t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1024j = new C1024j(continuation);
                    }
                }
                Object obj2 = c1024j.f69873n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1024j.f69874t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f69870n;
                    j.C1026j c1026j = (j.C1026j) obj;
                    KW9.w6.rl(this.f69871t.f69861O, new n.w6.I28(this.f69869O, c1026j.n()));
                    Boolean boolBoxBoolean = Boxing.boxBoolean(c1026j.n());
                    c1024j.f69874t = 1;
                    if (cn3.rl(boolBoxBoolean, c1024j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public CN3(TFv.Wre wre, C2211w6 c2211w6, String str) {
            this.f69867n = wre;
            this.f69868t = c2211w6;
            this.f69866O = str;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f69867n.n(new j(cn3, this.f69868t, this.f69866O), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kP.w6$Dsr */
    static final class Dsr extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f69875O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69876n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f69877r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f69878t;

        Dsr(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69875O = obj;
            this.f69877r |= Integer.MIN_VALUE;
            return C2211w6.this.Ik(false, this);
        }
    }

    /* JADX INFO: renamed from: kP.w6$I28 */
    static final class I28 extends ContinuationImpl {
        long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f69879O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f69880Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f69881n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f69883r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f69884t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69883r = obj;
            this.f69880Z |= Integer.MIN_VALUE;
            return C2211w6.this.rl(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kP.w6$Ml */
    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function2, SuspendFunction {
        Ml(Object obj) {
            super(2, obj, C2211w6.class, "finishTriggerEvaluation", "finishTriggerEvaluation$injet_release(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        public final Object n(boolean z2, Continuation continuation) {
            return ((C2211w6) this.receiver).Ik(z2, continuation);
        }
    }

    /* JADX INFO: renamed from: kP.w6$Wre */
    public static final class Wre implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f69885n;

        /* JADX INFO: renamed from: kP.w6$Wre$j */
        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f69886n;

            /* JADX INFO: renamed from: kP.w6$Wre$j$j, reason: collision with other inner class name */
            public static final class C1025j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f69888n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f69889t;

                public C1025j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f69888n = obj;
                    this.f69889t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3) {
                this.f69886n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1025j c1025j;
                if (continuation instanceof C1025j) {
                    c1025j = (C1025j) continuation;
                    int i2 = c1025j.f69889t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1025j.f69889t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1025j = new C1025j(continuation);
                    }
                }
                Object obj2 = c1025j.f69888n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1025j.f69889t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f69886n;
                    if (obj instanceof j.C1026j) {
                        c1025j.f69889t = 1;
                        if (cn3.rl(obj, c1025j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Wre(TFv.Wre wre) {
            this.f69885n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f69885n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: kP.w6$aC */
    static final class aC extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69890n;

        /* JADX INFO: renamed from: kP.w6$aC$j */
        static final class j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ C2211w6 f69892O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f69893n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f69894t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(C2211w6 c2211w6, Continuation continuation) {
                super(1, continuation);
                this.f69892O = c2211w6;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new j(this.f69892O, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x0107, code lost:
            
                if (r8.J2(r7) != r0) goto L37;
             */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[PHI: r8
              0x0093: PHI (r8v16 java.lang.Object) = (r8v15 java.lang.Object), (r8v0 java.lang.Object) binds: [B:23:0x0090, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                C2211w6 c2211w6;
                C2211w6 c2211w62;
                x0X.n nVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f69894t;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        ResultKt.throwOnFailure(obj);
                                        this.f69892O.HI.setValue(n.j.f69904n);
                                        return new n.w6(Unit.INSTANCE);
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                j8.n.n(this.f69892O.ck, this.f69892O.gh);
                                j8.n.n(this.f69892O.Ik, this.f69892O.gh);
                                j8.n.n(this.f69892O.f69862r, this.f69892O.gh);
                                j8.n.rl(this.f69892O.f69863t, this.f69892O.gh);
                                this.f69892O.gh.KN((String) obj);
                                qI.w6 w6Var = this.f69892O.ck;
                                this.f69894t = 5;
                            } else {
                                ResultKt.throwOnFailure(obj);
                                nVar = (x0X.n) obj;
                                if (!(nVar instanceof n.C1266n)) {
                                    return (n.C1266n) nVar;
                                }
                                if (nVar instanceof n.w6) {
                                    ((n.w6) nVar).n();
                                    sP.j jVar = this.f69892O.nr;
                                    this.f69894t = 4;
                                    obj = jVar.rl(this);
                                    if (obj != coroutine_suspended) {
                                        j8.n.n(this.f69892O.ck, this.f69892O.gh);
                                        j8.n.n(this.f69892O.Ik, this.f69892O.gh);
                                        j8.n.n(this.f69892O.f69862r, this.f69892O.gh);
                                        j8.n.rl(this.f69892O.f69863t, this.f69892O.gh);
                                        this.f69892O.gh.KN((String) obj);
                                        qI.w6 w6Var2 = this.f69892O.ck;
                                        this.f69894t = 5;
                                    }
                                    return coroutine_suspended;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            c2211w62 = (C2211w6) this.f69893n;
                            ResultKt.throwOnFailure(obj);
                            c2211w62.ty = ((Boolean) obj).booleanValue();
                            sP.j jVar2 = this.f69892O.nr;
                            this.f69893n = null;
                            this.f69894t = 3;
                            obj = jVar2.n(this);
                            if (obj != coroutine_suspended) {
                                nVar = (x0X.n) obj;
                                if (!(nVar instanceof n.C1266n)) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    } else {
                        c2211w6 = (C2211w6) this.f69893n;
                        ResultKt.throwOnFailure(obj);
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.f69892O.HI.setValue(n.Ml.f69903n);
                    c2211w6 = this.f69892O;
                    Function1 function1 = c2211w6.J2;
                    this.f69893n = c2211w6;
                    this.f69894t = 1;
                    obj = function1.invoke(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                c2211w6.az = ((Boolean) obj).booleanValue();
                c2211w62 = this.f69892O;
                Function1 function12 = c2211w62.Uo;
                this.f69893n = c2211w62;
                this.f69894t = 2;
                obj = function12.invoke(this);
                if (obj != coroutine_suspended) {
                    c2211w62.ty = ((Boolean) obj).booleanValue();
                    sP.j jVar22 = this.f69892O.nr;
                    this.f69893n = null;
                    this.f69894t = 3;
                    obj = jVar22.n(this);
                    if (obj != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((aC) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        aC(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C2211w6.this.new aC(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            aC aCVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69890n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    aCVar = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                rB.Ml ml = C2211w6.this.f69861O;
                ajd.j jVarRl = n.Ml.nr.rl();
                j jVar = new j(C2211w6.this, null);
                this.f69890n = 1;
                aCVar = this;
                obj = K6D.Wre.t(ml, jVarRl, null, null, jVar, aCVar, 6, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            C2211w6 c2211w6 = C2211w6.this;
            if (nVar instanceof n.C1266n) {
                d8q.j jVar2 = (d8q.j) ((n.C1266n) nVar).n();
                c2211w6.HI.setValue(new n.C1029w6(jVar2));
                new n.C1266n(jVar2);
                return nVar;
            }
            if (nVar instanceof n.w6) {
                return nVar;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: kP.w6$fuX */
    static final class fuX extends SuspendLambda implements Function2 {
        final /* synthetic */ String[] J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f69895O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69896n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((fuX) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(String str, String[] strArr, Continuation continuation) {
            super(2, continuation);
            this.f69895O = str;
            this.J2 = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C2211w6.this.new fuX(this.f69895O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69896n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            nfZ.CN3 cn3 = C2211w6.this.gh;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.add(this.f69895O);
            spreadBuilder.addSpread(this.J2);
            String[] strArr = (String[]) spreadBuilder.toArray(new String[spreadBuilder.size()]);
            this.f69896n = 1;
            Object objNr = cn3.nr("executeWebFunction", strArr, string, this);
            if (objNr == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objNr;
        }
    }

    /* JADX INFO: renamed from: kP.w6$j */
    public interface j {

        /* JADX INFO: renamed from: kP.w6$j$j, reason: collision with other inner class name */
        public static final class C1026j implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final boolean f69898n;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1026j) && this.f69898n == ((C1026j) obj).f69898n;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f69898n);
            }

            public final boolean n() {
                return this.f69898n;
            }

            public String toString() {
                return "AboutToFinish(hasUserCompletedFlow=" + this.f69898n + ")";
            }

            public C1026j(boolean z2) {
                this.f69898n = z2;
            }
        }

        /* JADX INFO: renamed from: kP.w6$j$n */
        public static final class n implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final n f69899n = new n();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public String toString() {
                return "NotEvaluating";
            }

            private n() {
            }

            public int hashCode() {
                return -1138598259;
            }
        }

        /* JADX INFO: renamed from: kP.w6$j$w6, reason: collision with other inner class name */
        public static final class C1027w6 implements j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final String f69900n;
            private final long rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final EnumC2205I28 f69901t;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1027w6)) {
                    return false;
                }
                C1027w6 c1027w6 = (C1027w6) obj;
                return Intrinsics.areEqual(this.f69900n, c1027w6.f69900n) && this.rl == c1027w6.rl && this.f69901t == c1027w6.f69901t;
            }

            public C1027w6(String trigger, long j2, EnumC2205I28 enumC2205I28) {
                Intrinsics.checkNotNullParameter(trigger, "trigger");
                this.f69900n = trigger;
                this.rl = j2;
                this.f69901t = enumC2205I28;
            }

            public int hashCode() {
                int iHashCode = ((this.f69900n.hashCode() * 31) + Long.hashCode(this.rl)) * 31;
                EnumC2205I28 enumC2205I28 = this.f69901t;
                return iHashCode + (enumC2205I28 == null ? 0 : enumC2205I28.hashCode());
            }

            public final long n() {
                return this.rl;
            }

            public final EnumC2205I28 rl() {
                return this.f69901t;
            }

            public final String t() {
                return this.f69900n;
            }

            public String toString() {
                return "Ongoing(trigger=" + this.f69900n + ", callTime=" + this.rl + ", navigationStyleOverride=" + this.f69901t + ")";
            }
        }
    }

    /* JADX INFO: renamed from: kP.w6$n */
    public interface n {

        /* JADX INFO: renamed from: kP.w6$n$I28 */
        public static final class I28 implements n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final I28 f69902n = new I28();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof I28);
            }

            public String toString() {
                return "NotStarted";
            }

            private I28() {
            }

            public int hashCode() {
                return -793290362;
            }

            @Override // kP.C2211w6.n
            public String n() {
                return C1028n.n(this);
            }
        }

        /* JADX INFO: renamed from: kP.w6$n$Ml */
        public static final class Ml implements n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final Ml f69903n = new Ml();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Ml);
            }

            public String toString() {
                return "InProgress";
            }

            private Ml() {
            }

            public int hashCode() {
                return 990293450;
            }

            @Override // kP.C2211w6.n
            public String n() {
                return C1028n.n(this);
            }
        }

        /* JADX INFO: renamed from: kP.w6$n$j */
        public static final class j implements n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final j f69904n = new j();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public String toString() {
                return "Completed";
            }

            private j() {
            }

            public int hashCode() {
                return -1743176717;
            }

            @Override // kP.C2211w6.n
            public String n() {
                return C1028n.n(this);
            }
        }

        /* JADX INFO: renamed from: kP.w6$n$n, reason: collision with other inner class name */
        public static final class C1028n {
            public static String n(n nVar) {
                if (nVar instanceof I28) {
                    return "NotStarted";
                }
                if (nVar instanceof Ml) {
                    return "InProgress";
                }
                if (nVar instanceof j) {
                    return "Completed";
                }
                if (!(nVar instanceof C1029w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                return "Failed: " + ((C1029w6) nVar).rl();
            }
        }

        /* JADX INFO: renamed from: kP.w6$n$w6, reason: collision with other inner class name */
        public static final class C1029w6 implements n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final d8q.j f69905n;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1029w6) && Intrinsics.areEqual(this.f69905n, ((C1029w6) obj).f69905n);
            }

            public C1029w6(d8q.j error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f69905n = error;
            }

            public int hashCode() {
                return this.f69905n.hashCode();
            }

            public final d8q.j rl() {
                return this.f69905n;
            }

            public String toString() {
                return "Failed(error=" + this.f69905n + ")";
            }

            @Override // kP.C2211w6.n
            public String n() {
                return C1028n.n(this);
            }
        }

        String n();
    }

    /* JADX INFO: renamed from: kP.w6$w6, reason: collision with other inner class name */
    /* synthetic */ class C1030w6 extends FunctionReferenceImpl implements Function0 {
        C1030w6(Object obj) {
            super(0, obj, C2211w6.class, "presentWebApp", "presentWebApp$injet_release()V", 0);
        }

        public final void n() {
            ((C2211w6) this.receiver).r();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    public C2211w6(Context context, sP.w6 assetManager, List appModules, sP.j assetProvider, rB.Ml spiderSense, Function1 getShouldPresentFullScreen, Function1 getShouldDisableBackButton, EnumC2205I28 navigationStyle, Function0 getCustomBackgroundColor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(appModules, "appModules");
        Intrinsics.checkNotNullParameter(assetProvider, "assetProvider");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(getShouldPresentFullScreen, "getShouldPresentFullScreen");
        Intrinsics.checkNotNullParameter(getShouldDisableBackButton, "getShouldDisableBackButton");
        Intrinsics.checkNotNullParameter(navigationStyle, "navigationStyle");
        Intrinsics.checkNotNullParameter(getCustomBackgroundColor, "getCustomBackgroundColor");
        this.rl = context;
        this.f69863t = appModules;
        this.nr = assetProvider;
        this.f69861O = spiderSense;
        this.J2 = getShouldPresentFullScreen;
        this.Uo = getShouldDisableBackButton;
        this.KN = navigationStyle;
        this.xMQ = getCustomBackgroundColor;
        vd vdVarN = Lu.n(N.rl(null, 1, null).plus(OU.n()));
        this.mUb = vdVarN;
        this.gh = new nfZ.CN3(context, assetManager, spiderSense, vdVarN);
        this.qie = TFv.Lu.n(j.n.f69899n);
        this.HI = TFv.Lu.n(n.I28.f69902n);
        this.ck = new qI.w6(new C1030w6(this), new Ml(this));
        this.Ik = new j8.Ml(new C(null));
        this.f69862r = new qI.n(spiderSense);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ik(boolean z2, Continuation continuation) {
        Dsr dsr;
        C2211w6 c2211w6;
        if (continuation instanceof Dsr) {
            dsr = (Dsr) continuation;
            int i2 = dsr.f69877r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dsr.f69877r = i2 - Integer.MIN_VALUE;
            } else {
                dsr = new Dsr(continuation);
            }
        }
        Object obj = dsr.f69875O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dsr.f69877r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            InjetPresenterActivity.Companion jVar = InjetPresenterActivity.INSTANCE;
            dsr.f69876n = this;
            dsr.f69878t = z2;
            dsr.f69877r = 1;
            if (jVar.rl(dsr) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c2211w6 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = dsr.f69878t;
            c2211w6 = (C2211w6) dsr.f69876n;
            ResultKt.throwOnFailure(obj);
        }
        c2211w6.qie.setValue(new j.C1026j(z2));
        return Unit.INSTANCE;
    }

    public final void r() {
        EnumC2205I28 enumC2205I28Rl;
        j jVar = (j) this.qie.getValue();
        boolean z2 = jVar instanceof j.C1027w6;
        if (!z2 || (enumC2205I28Rl = ((j.C1027w6) jVar).rl()) == null) {
            enumC2205I28Rl = this.KN;
        }
        InjetPresenterActivity.INSTANCE.J2(this.gh, this.rl, this.f69861O, this.az, this.ty, enumC2205I28Rl, this.xMQ);
        if (z2) {
            j.C1027w6 c1027w6 = (j.C1027w6) jVar;
            KW9.w6.rl(this.f69861O, new n.w6.fuX(c1027w6.t(), System.currentTimeMillis() - c1027w6.n()));
        } else {
            if (!(jVar instanceof j.C1026j) && !Intrinsics.areEqual(jVar, j.n.f69899n)) {
                throw new NoWhenBranchMatchedException();
            }
            KW9.w6.rl(this.f69861O, n.j.Wre.f5474O);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0113, code lost:
    
        if (r13.ty(r11, r0) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x018c, code lost:
    
        if (r13 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kP.InterfaceC2210n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(String str, EnumC2205I28 enumC2205I28, Continuation continuation) {
        I28 i28;
        long jCurrentTimeMillis;
        C2211w6 c2211w6;
        String str2;
        C2211w6 c2211w62;
        Object w6Var;
        boolean z2;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f69880Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f69880Z = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objViF = i28.f69883r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.f69880Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            if (!Intrinsics.areEqual(this.HI.getValue(), n.j.f69904n)) {
                KW9.w6.rl(this.f69861O, new n.j.C0183n(str, ((n) this.HI.getValue()).n()));
                return new n.C1266n(new Exception("Injet has not been initialized"));
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            KW9.w6.rl(this.f69861O, new n.w6.C0189w6(str));
            if (!Intrinsics.areEqual(this.qie.getValue(), j.n.f69899n)) {
                KW9.w6.rl(this.f69861O, new n.w6.C0188n(str, this.qie.getValue().toString()));
                return new n.C1266n(new Exception("Trigger evaluation already in progress"));
            }
            Context applicationContext = this.rl.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            if (!AbstractC2206Ml.n(applicationContext)) {
                KW9.w6.rl(this.f69861O, new n.w6.Ml(str));
                return new n.C1266n(new Exception("Application is not in foreground"));
            }
            KW9.Wre wreJ2 = KW9.Wre.rl.J2();
            if (wreJ2 != null) {
                i28.f69881n = this;
                i28.f69884t = str;
                i28.f69879O = enumC2205I28;
                i28.J2 = jCurrentTimeMillis;
                i28.f69880Z = 1;
            }
            c2211w6 = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2211w62 = (C2211w6) i28.f69881n;
                    ResultKt.throwOnFailure(objViF);
                    w6Var = new n.w6(Boxing.boxBoolean(((Boolean) objViF).booleanValue()));
                    c2211w62.qie.setValue(j.n.f69899n);
                    return w6Var;
                }
                String str3 = (String) i28.f69884t;
                C2211w6 c2211w63 = (C2211w6) i28.f69881n;
                ResultKt.throwOnFailure(objViF);
                str2 = str3;
                c2211w62 = c2211w63;
                w6Var = (x0X.n) objViF;
                z2 = w6Var instanceof n.C1266n;
                if (!z2) {
                    KW9.w6.rl(c2211w62.f69861O, new n.j.w6(str2, ((Exception) ((n.C1266n) w6Var).n()).getMessage()));
                } else if (!(w6Var instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!z2) {
                    if (!(w6Var instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    KW9.w6.rl(c2211w62.f69861O, new n.w6.Wre(str2));
                    CN3 cn3 = new CN3(new Wre(c2211w62.qie), c2211w62, str2);
                    i28.f69881n = c2211w62;
                    i28.f69884t = null;
                    i28.f69880Z = 3;
                    objViF = TFv.fuX.ViF(cn3, i28);
                }
                c2211w62.qie.setValue(j.n.f69899n);
                return w6Var;
            }
            long j2 = i28.J2;
            EnumC2205I28 enumC2205I282 = (EnumC2205I28) i28.f69879O;
            String str4 = (String) i28.f69884t;
            C2211w6 c2211w64 = (C2211w6) i28.f69881n;
            ResultKt.throwOnFailure(objViF);
            c2211w6 = c2211w64;
            jCurrentTimeMillis = j2;
            enumC2205I28 = enumC2205I282;
            str = str4;
        }
        c2211w6.qie.setValue(new j.C1027w6(str, jCurrentTimeMillis, enumC2205I28));
        i28.f69881n = c2211w6;
        i28.f69884t = str;
        i28.f69879O = null;
        i28.f69880Z = 2;
        Object objCk = c2211w6.ck("evaluateTrigger", new String[]{str}, i28);
        if (objCk != coroutine_suspended) {
            str2 = str;
            c2211w62 = c2211w6;
            objViF = objCk;
            w6Var = (x0X.n) objViF;
            z2 = w6Var instanceof n.C1266n;
            if (!z2) {
            }
            if (!z2) {
            }
            c2211w62.qie.setValue(j.n.f69899n);
            return w6Var;
        }
        return coroutine_suspended;
    }

    public Object ck(String str, String[] strArr, Continuation continuation) {
        return GJW.Dsr.Uo(OU.t(), new fuX(str, strArr, null), continuation);
    }

    @Override // kP.InterfaceC2210n
    public Object n(Continuation continuation) {
        return GJW.Dsr.Uo(OU.t(), new aC(null), continuation);
    }
}
