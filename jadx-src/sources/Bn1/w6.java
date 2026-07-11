package Bn1;

import B7.ci;
import B7.fuX;
import B7.w6;
import Bn1.I28;
import F6.w6;
import GJW.AbstractC1363t;
import GJW.OU;
import GJW.V1;
import GJW.lej;
import GJW.vd;
import GJW.xuv;
import GJW.yg;
import LQ.fuX;
import LQ.j;
import TFv.Lu;
import TFv.SPz;
import d2n.j;
import java.nio.ShortBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements B7.l3D {
    public static final Ml Ik = new Ml(null);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final long f617S;
    private static final long WPU;
    private static final long XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final long f618Z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f619o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f620r;
    private Function2 HI;
    private final Function0 J2;
    private final lej KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function1 f621O;
    private final B7.Ml Uo;
    private xuv az;
    private final xuv ck;
    private final B7.C gh;
    private final SPz mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private B7.s4 f622n;
    private final vd nr;
    private final int qie;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f623t;
    private boolean ty;
    private final B7.SPz xMQ;

    static final class C extends SuspendLambda implements Function2 {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        long f624O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ LQ.CN3 f625S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ long f626Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w6 f627g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f628n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ F6.j f629o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f630r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f631t;

        static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ long J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ long f632O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f633n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ w6 f634t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(w6 w6Var, long j2, long j3, Continuation continuation) {
                super(2, continuation);
                this.f634t = w6Var;
                this.f632O = j2;
                this.J2 = j3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f634t, this.f632O, this.J2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                fuX fux;
                long jTy;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f633n;
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    B7.s4 s4Var = this.f634t.f622n;
                    this.f633n = 1;
                    if (Bn1.Ml.KN(s4Var, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                do {
                    B7.Xo xoT = B7.eO.t(Bn1.Ml.xMQ(this.f634t.f622n, ((d2n.Ml) this.f634t.J2.invoke()).Ik(), this.f632O), this.J2);
                    SPz sPz = this.f634t.mUb;
                    w6 w6Var = this.f634t;
                    do {
                        value = sPz.getValue();
                        fux = (fuX) value;
                        if (!(fux.nr() instanceof CN3)) {
                            return Unit.INSTANCE;
                        }
                    } while (!sPz.Uo(value, fuX.rl(fux, new CN3(w6Var.J(fux, xoT)), null, 2, null)));
                    jTy = d2n.j.ty(w6.f617S);
                    this.f633n = 2;
                } while (yg.rl(jTy, this) != coroutine_suspended);
                return coroutine_suspended;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C(F6.j jVar, long j2, LQ.CN3 cn3, w6 w6Var, Continuation continuation) {
            super(2, continuation);
            this.f629o = jVar;
            this.f626Z = j2;
            this.f625S = cn3;
            this.f627g = w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C c2 = new C(this.f629o, this.f626Z, this.f625S, this.f627g, continuation);
            c2.f630r = obj;
            return c2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws fuX.j {
            xuv xuvVarNr;
            LQ.CN3 cn3;
            long j2;
            long j3;
            long j4;
            long j5;
            B7.Xo xoT;
            SPz sPz;
            w6 w6Var;
            Object value;
            fuX fux;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.J2;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        j4 = this.f624O;
                        j5 = this.f631t;
                        ResultKt.throwOnFailure(obj);
                        xoT = B7.eO.t(Bn1.Ml.xMQ(this.f627g.f622n, ((d2n.Ml) this.f627g.J2.invoke()).Ik(), j5), j4);
                        this.f627g.f622n.stop();
                        sPz = this.f627g.mUb;
                        w6Var = this.f627g;
                        do {
                            value = sPz.getValue();
                            fux = (fuX) value;
                        } while (!sPz.Uo(value, new fuX(new Dsr(w6Var.J(fux, xoT)), B7.j.rl(fux.t(), null, xoT.nr(), 1, null))));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j3 = this.f624O;
                j2 = this.f631t;
                cn3 = (LQ.CN3) this.f628n;
                xuvVarNr = (xuv) this.f630r;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f630r;
                long jO = this.f629o.O().O();
                long jHI = d2n.Ml.HI(jO, this.f626Z);
                xuvVarNr = GJW.C.nr(vdVar, null, null, new j(this.f627g, jO, jHI, null), 3, null);
                cn3 = this.f625S;
                w6 w6Var2 = this.f627g;
                F6.j jVar = this.f629o;
                long j6 = this.f626Z;
                this.f630r = xuvVarNr;
                this.f628n = cn3;
                this.f631t = jO;
                this.f624O = jHI;
                this.J2 = 1;
                obj = w6Var2.P5(jVar, j6, this);
                if (obj != coroutine_suspended) {
                    j2 = jO;
                    j3 = jHI;
                }
                return coroutine_suspended;
            }
            cn3.O((LQ.j) obj);
            this.f630r = null;
            this.f628n = null;
            this.f631t = j2;
            this.f624O = j3;
            this.J2 = 2;
            if (AbstractC1363t.Uo(xuvVarNr, this) != coroutine_suspended) {
                j4 = j3;
                j5 = j2;
                xoT = B7.eO.t(Bn1.Ml.xMQ(this.f627g.f622n, ((d2n.Ml) this.f627g.J2.invoke()).Ik(), j5), j4);
                this.f627g.f622n.stop();
                sPz = this.f627g.mUb;
                w6Var = this.f627g;
                do {
                    value = sPz.getValue();
                    fux = (fuX) value;
                } while (!sPz.Uo(value, new fuX(new Dsr(w6Var.J(fux, xoT)), B7.j.rl(fux.t(), null, xoT.nr(), 1, null))));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
    }

    private static final class CN3 implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final B7.Xo f635n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CN3) && Intrinsics.areEqual(this.f635n, ((CN3) obj).f635n);
        }

        public CN3(B7.Xo timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.f635n = timestamp;
        }

        public int hashCode() {
            return this.f635n.hashCode();
        }

        public final B7.Xo n() {
            return this.f635n;
        }

        public String toString() {
            return "Playing(timestamp=" + this.f635n + ')';
        }
    }

    private static final class Dsr implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final B7.Xo f636n;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dsr) && Intrinsics.areEqual(this.f636n, ((Dsr) obj).f636n);
        }

        public Dsr(B7.Xo timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.f636n = timestamp;
        }

        public int hashCode() {
            return this.f636n.hashCode();
        }

        public final B7.Xo n() {
            return this.f636n;
        }

        public String toString() {
            return "Stopped(timestamp=" + this.f636n + ')';
        }
    }

    public static final class Ml {
        public /* synthetic */ Ml(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Ml() {
        }
    }

    static final class Pl extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ w6 f638O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f639n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f640t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Pl(long j2, w6 w6Var, Continuation continuation) {
            super(2, continuation);
            this.f640t = j2;
            this.f638O = w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Pl(this.f640t, this.f638O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f639n == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z2 = true;
                if (d2n.j.nr(d2n.j.o(this.f640t, this.f638O.f622n.nr()), as.aC.rl(as.Ml.t(1), this.f638O.eF().t())) < 0) {
                    z2 = false;
                }
                return Boxing.boxBoolean(z2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(as.n nVar, Continuation continuation) {
            return ((Pl) create(nVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class Q implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f641n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ w6 f642t;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f643n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ w6 f644t;

            /* JADX INFO: renamed from: Bn1.w6$Q$j$j, reason: collision with other inner class name */
            public static final class C0018j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f646n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f647t;

                public C0018j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f646n = obj;
                    this.f647t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3, w6 w6Var) {
                this.f643n = cn3;
                this.f644t = w6Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C0018j c0018j;
                B7.j jVarT;
                if (continuation instanceof C0018j) {
                    c0018j = (C0018j) continuation;
                    int i2 = c0018j.f647t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0018j.f647t = i2 - Integer.MIN_VALUE;
                    } else {
                        c0018j = new C0018j(continuation);
                    }
                }
                Object obj2 = c0018j.f646n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0018j.f647t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f643n;
                    fuX fux = (fuX) obj;
                    Wre wreNr = fux.nr();
                    if (wreNr instanceof I28) {
                        jVarT = fux.t();
                    } else if (wreNr instanceof CN3) {
                        jVarT = null;
                    } else {
                        if (!(wreNr instanceof Dsr)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jVarT = fux.t();
                    }
                    w6.j jVarTy = jVarT != null ? Bn1.Ml.ty(jVarT, w6.XQ, this.f644t.eF()) : null;
                    if (jVarTy != null) {
                        c0018j.f647t = 1;
                        if (cn3.rl(jVarTy, c0018j) == coroutine_suspended) {
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

        public Q(TFv.Wre wre, w6 w6Var) {
            this.f641n = wre;
            this.f642t = w6Var;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f641n.n(new j(cn3, this.f642t), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class QJ extends SuspendLambda implements Function2 {
        final /* synthetic */ long J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ F6.j f648O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f649n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((QJ) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        QJ(F6.j jVar, long j2, Continuation continuation) {
            super(2, continuation);
            this.f648O = jVar;
            this.J2 = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new QJ(this.f648O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws fuX.j {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f649n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                w6 w6Var = w6.this;
                F6.j jVar = this.f648O;
                long j2 = this.J2;
                this.f649n = 1;
                obj = w6Var.U(jVar, j2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            LQ.j jVar2 = (LQ.j) obj;
            w6 w6Var2 = w6.this;
            if (jVar2 instanceof j.n) {
                w6Var2.E((B7.w6) ((j.n) jVar2).n());
            } else {
                boolean z2 = jVar2 instanceof j.w6;
            }
            return Unit.INSTANCE;
        }
    }

    static final class UGc extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ B7.j f651O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f652n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((UGc) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        UGc(B7.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f651O = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new UGc(this.f651O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f652n == 0) {
                ResultKt.throwOnFailure(obj);
                w6.this.B(this.f651O);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private interface Wre {
    }

    static final class Xo extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f654n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Xo) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Xo(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new Xo(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f654n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                w6 w6Var = w6.this;
                this.f654n = 1;
                if (w6Var.M(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class aC extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f657n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f658t;

        aC(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f658t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return w6.this.U(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: Bn1.w6$c, reason: case insensitive filesystem */
    static final class C1312c extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f660n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f661t;

        /* JADX INFO: renamed from: Bn1.w6$c$j */
        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ w6.j f662O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f663n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ w6 f664t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(w6 w6Var, w6.j jVar, Continuation continuation) {
                super(2, continuation);
                this.f664t = w6Var;
                this.f662O = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f664t, this.f662O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f663n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    B7.C c2 = this.f664t.gh;
                    w6.j jVar = this.f662O;
                    this.f663n = 1;
                    if (c2.rl(jVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        C1312c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C1312c c1312c = w6.this.new C1312c(continuation);
            c1312c.f661t = obj;
            return c1312c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f660n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                w6.j jVar = (w6.j) this.f661t;
                V1 v1 = V1.f3456n;
                j jVar2 = new j(w6.this, jVar, null);
                this.f660n = 1;
                if (GJW.Dsr.Uo(v1, jVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w6.j jVar, Continuation continuation) {
            return ((C1312c) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class eO extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f665n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((eO) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        eO(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new eO(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f665n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                xuv xuvVar = w6.this.az;
                if (xuvVar != null) {
                    this.f665n = 1;
                    if (AbstractC1363t.Uo(xuvVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            w6.this.az = null;
            w6.this.f622n.flush();
            return Unit.INSTANCE;
        }
    }

    private static final class fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Wre f667n;
        private final B7.j rl;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof fuX)) {
                return false;
            }
            fuX fux = (fuX) obj;
            return Intrinsics.areEqual(this.f667n, fux.f667n) && Intrinsics.areEqual(this.rl, fux.rl);
        }

        public fuX(Wre playbackState, B7.j dataWithPosition) {
            Intrinsics.checkNotNullParameter(playbackState, "playbackState");
            Intrinsics.checkNotNullParameter(dataWithPosition, "dataWithPosition");
            this.f667n = playbackState;
            this.rl = dataWithPosition;
        }

        public static /* synthetic */ fuX rl(fuX fux, Wre wre, B7.j jVar, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                wre = fux.f667n;
            }
            if ((i2 & 2) != 0) {
                jVar = fux.rl;
            }
            return fux.n(wre, jVar);
        }

        public int hashCode() {
            return (this.f667n.hashCode() * 31) + this.rl.hashCode();
        }

        public final fuX n(Wre playbackState, B7.j dataWithPosition) {
            Intrinsics.checkNotNullParameter(playbackState, "playbackState");
            Intrinsics.checkNotNullParameter(dataWithPosition, "dataWithPosition");
            return new fuX(playbackState, dataWithPosition);
        }

        public final Wre nr() {
            return this.f667n;
        }

        public final B7.j t() {
            return this.rl;
        }

        public String toString() {
            return "State(playbackState=" + this.f667n + ", dataWithPosition=" + this.rl + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
        j(Object obj) {
            super(1, obj, I28.j.class, "new", "new(Lcom/bendingspoons/fellini/utils/audio/AudioStream16BitProperties;)Lcom/bendingspoons/fellini/fmfoundation/player/internal/FelliniAudioTrack;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final B7.s4 invoke(as.CN3 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((I28.j) this.receiver).rl(p0);
        }
    }

    static final class l3D extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f668O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f669n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f670t;

        l3D(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, fuX fux, Continuation continuation) {
            l3D l3d = w6.this.new l3D(continuation);
            l3d.f670t = cn3;
            l3d.f668O = fux;
            return l3d.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        
            if (r3.rl(r1, r6) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            fuX fux;
            TFv.CN3 cn3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f669n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fux = (fuX) this.f668O;
                cn3 = (TFv.CN3) this.f670t;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn32 = (TFv.CN3) this.f670t;
                fux = (fuX) this.f668O;
                long jTy = d2n.j.ty(w6.this.p5());
                this.f670t = cn32;
                this.f668O = fux;
                this.f669n = 1;
                if (yg.rl(jTy, this) != coroutine_suspended) {
                    cn3 = cn32;
                }
                return coroutine_suspended;
            }
            this.f670t = null;
            this.f668O = null;
            this.f669n = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ class n extends FunctionReferenceImpl implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f671n = new n();

        n() {
            super(2, ci.class, "SingleThreadDispatcher", "SingleThreadDispatcher(Ljava/lang/String;Ljava/lang/Integer;)Lcom/bendingspoons/fellini/fmfoundation/player/internal/SingleThreadDispatcher;", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final B7.SPz invoke(String p0, Integer num) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ci.n(p0, num);
        }
    }

    static final class o extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f672O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f673n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f674r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f675t;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f672O = obj;
            this.f674r |= Integer.MIN_VALUE;
            return w6.this.P5(null, 0L, this);
        }
    }

    static final class qz extends SuspendLambda implements Function2 {
        final /* synthetic */ w6 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f676O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f677n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ LQ.CN3 f678r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f679t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        qz(long j2, w6 w6Var, LQ.CN3 cn3, Continuation continuation) {
            super(2, continuation);
            this.f676O = j2;
            this.J2 = w6Var;
            this.f678r = cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            qz qzVar = new qz(this.f676O, this.J2, this.f678r, continuation);
            qzVar.f679t = obj;
            return qzVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LQ.CN3 cn3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f677n;
            if (i2 != 0) {
                if (i2 == 1) {
                    cn3 = (LQ.CN3) this.f679t;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                as.n nVar = (as.n) this.f679t;
                as.n nVarUo = as.w6.Uo(nVar, d2n.j.o(this.f676O, this.J2.f622n.nr()));
                B7.Ml ml = this.J2.Uo;
                ShortBuffer shortBufferAsShortBuffer = nVar.O().asShortBuffer();
                Intrinsics.checkNotNullExpressionValue(shortBufferAsShortBuffer, "fragment.data.asShortBuffer()");
                ml.nr(shortBufferAsShortBuffer);
                LQ.CN3 cn32 = this.f678r;
                B7.s4 s4Var = this.J2.f622n;
                this.f679t = cn32;
                this.f677n = 1;
                Object objT = s4Var.t(nVarUo, this);
                if (objT == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cn3 = cn32;
                obj = objT;
            }
            cn3.O((LQ.j) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(as.n nVar, Continuation continuation) {
            return ((qz) create(nVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class s4 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f680n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((s4) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        s4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new s4(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
        
            if (r6.n(r5) != r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f680n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    w6.this.az = null;
                    w6.this.xMQ.release();
                    w6.this.f622n.release();
                    B7.C c2 = w6.this.gh;
                    this.f680n = 3;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                w6.this.ty = true;
                xuv xuvVar = w6.this.ck;
                this.f680n = 1;
                if (AbstractC1363t.Uo(xuvVar, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            xuv xuvVar2 = w6.this.az;
            if (xuvVar2 != null) {
                this.f680n = 2;
                if (AbstractC1363t.Uo(xuvVar2, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            w6.this.az = null;
            w6.this.xMQ.release();
            w6.this.f622n.release();
            B7.C c22 = w6.this.gh;
            this.f680n = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: Bn1.w6$w6, reason: collision with other inner class name */
    public static final class C0019w6 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0019w6 f682n = new C0019w6();

        C0019w6() {
            super(0);
        }

        public final long n() {
            return d2n.Ml.f63370t.t(System.nanoTime());
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            return d2n.Ml.rl(n());
        }
    }

    static final class z extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f683O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f684n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((z) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(long j2, Continuation continuation) {
            super(2, continuation);
            this.f683O = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new z(this.f683O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f684n == 0) {
                ResultKt.throwOnFailure(obj);
                w6.this.FX(this.f683O);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ w6(B7.s4 s4Var, F6.w6 w6Var, long j2, long j3, long j4, vd vdVar, Function1 function1, Function2 function2, Function0 function0, B7.Ml ml, lej lejVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(s4Var, w6Var, j2, j3, j4, vdVar, function1, function2, function0, ml, lejVar);
    }

    private static final class I28 implements Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final I28 f637n = new I28();

        private I28() {
        }
    }

    static {
        j.C0832j c0832j = d2n.j.f63374t;
        long jO = c0832j.O(2.0d);
        f620r = jO;
        f619o = c0832j.O(10.0d);
        f618Z = c0832j.t(100L);
        XQ = jO;
        f617S = c0832j.t(5L);
        WPU = c0832j.O(10800.0d);
    }

    private w6(B7.s4 s4Var, F6.w6 w6Var, long j2, long j3, long j4, vd vdVar, Function1 function1, Function2 function2, Function0 function0, B7.Ml ml, lej lejVar) {
        this.f622n = s4Var;
        this.rl = j2;
        this.f623t = j4;
        this.nr = vdVar;
        this.f621O = function1;
        this.J2 = function0;
        this.Uo = ml;
        this.KN = lejVar;
        if (!Intrinsics.areEqual(s4Var.getPlaybackState(), fuX.w6.f265n)) {
            throw new IllegalArgumentException(("The audio track must be in a stopped state, found: " + this.f622n.getPlaybackState()).toString());
        }
        if (d2n.j.nr(j3, j2) > 0) {
            this.xMQ = (B7.SPz) function2.invoke("AudioPlayerThread", -16);
            SPz sPzN = Lu.n(new fuX(I28.f637n, new B7.j(MoG.CN3.f6746O.n().nr(), d2n.Ml.f63370t.J2(), null)));
            this.mUb = sPzN;
            this.gh = new B7.C(w6Var);
            this.qie = (int) d2n.j.Uo(j3, j2);
            this.ck = TFv.fuX.T(TFv.fuX.s7N(new Q(TFv.fuX.P5(sPzN, new l3D(null)), this), new C1312c(null)), vdVar);
            return;
        }
        throw new IllegalArgumentException(("The total buffer duration (" + ((Object) d2n.j.S(j3)) + ") must be greater than or equal to the audio fragment duration (" + ((Object) d2n.j.S(j2)) + ").").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(B7.j jVar) {
        Object value;
        fuX fux;
        SPz sPz = this.mUb;
        do {
            value = sPz.getValue();
            fux = (fuX) value;
            Wre wreNr = fux.nr();
            if (!(Intrinsics.areEqual(wreNr, I28.f637n) ? true : wreNr instanceof Dsr)) {
                if (!(wreNr instanceof CN3)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Cannot change the audio data while playing");
            }
        } while (!sPz.Uo(value, fuX.rl(fux, null, jVar, 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(B7.w6 w6Var) {
        Object value;
        Function2 function2M7;
        if (Intrinsics.areEqual(w6Var, w6.j.f275n) ? true : Intrinsics.areEqual(w6Var, w6.n.f276n)) {
            this.f622n.release();
            this.f622n = (B7.s4) this.f621O.invoke(eF());
            SPz sPz = this.mUb;
            do {
                value = sPz.getValue();
            } while (!sPz.Uo(value, fuX.rl((fuX) value, I28.f637n, null, 2, null)));
            if (!(w6Var instanceof w6.n) || (function2M7 = M7()) == null) {
                return;
            }
            function2M7.invoke("ObscureFailureTag", w6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void FX(long j2) {
        F6.j jVarT;
        d2n.w6.n(j2, "duration");
        fuX fux = (fuX) this.mUb.getValue();
        B7.j jVarT2 = fux.t();
        long jNr = jVarT2.nr();
        Wre wreNr = fux.nr();
        if (wreNr instanceof CN3) {
            throw new IllegalStateException("Must not start playback while already playing");
        }
        if (!Intrinsics.areEqual(wreNr, I28.f637n) && !(wreNr instanceof Dsr)) {
            throw new NoWhenBranchMatchedException();
        }
        B7.Xo xoMUb = Bn1.Ml.mUb(((d2n.Ml) this.J2.invoke()).Ik(), jNr);
        long jWPU = ((d2n.j) RangesKt.coerceAtMost((d2n.j) RangesKt.coerceAtMost(d2n.j.rl(j2), d2n.j.rl(B7.n.rl(jVarT2))), d2n.j.rl(WPU))).WPU();
        if (as.Ml.Uo(as.aC.t(jWPU, eF().t())) || (jVarT = B7.n.t(jVarT2, this.rl)) == null) {
            return;
        }
        this.f622n.play();
        this.mUb.setValue(new fuX(new CN3(xoMUb), jVarT2));
        this.az = GJW.C.nr(this.nr, this.xMQ.J2(), null, new QJ(jVarT, jWPU, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M(Continuation continuation) {
        long jN;
        fuX fux = (fuX) this.mUb.getValue();
        Wre wreNr = fux.nr();
        I28 i28 = I28.f637n;
        if (Intrinsics.areEqual(wreNr, i28)) {
            return Unit.INSTANCE;
        }
        this.f622n.pause();
        Wre wreNr2 = fux.nr();
        if (Intrinsics.areEqual(wreNr2, i28)) {
            throw new IllegalStateException("Unexpected state paused while pausing");
        }
        if (wreNr2 instanceof CN3) {
            jN = ((d2n.Ml) RangesKt.coerceAtMost(d2n.Ml.rl(Bn1.Ml.gh(this.f622n, fux.t().nr())), d2n.Ml.rl(B7.n.n(fux.t())))).Ik();
        } else {
            if (!(wreNr2 instanceof Dsr)) {
                throw new NoWhenBranchMatchedException();
            }
            jN = B7.eO.n(((Dsr) fux.nr()).n(), ((d2n.Ml) this.J2.invoke()).Ik());
        }
        this.mUb.setValue(new fuX(i28, B7.j.rl(fux.t(), null, jN, 1, null)));
        Object objUo = GJW.Dsr.Uo(AbstractC1363t.az(this.nr.getCoroutineContext()), new eO(null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P5(F6.j jVar, long j2, Continuation continuation) throws fuX.j {
        o oVar;
        fuX.j jVar2;
        LQ.fuX fux;
        long jN;
        w6 w6Var;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.f674r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.f674r = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        }
        Object obj = oVar.f672O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oVar.f674r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            LQ.fuX fux2 = new LQ.fuX();
            try {
                jN = bK.j.n(j2);
                this.Uo.J2(jVar.O().O(), eF());
            } catch (fuX.j e2) {
                e = e2;
            }
            try {
                TFv.Wre wreU = TFv.fuX.U(TFv.fuX.s7N(TFv.fuX.e(TFv.o.rl(Bn1.Ml.qie(this.gh, jVar, eF()), this.qie, null, 2, null), this.KN), new qz(jN, this, fux2, null)), new Pl(jN, this, null));
                oVar.f673n = this;
                oVar.f675t = fux2;
                oVar.f674r = 1;
                if (TFv.fuX.mUb(wreU, oVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                w6Var = this;
                fux = fux2;
                w6Var.Uo.O();
                return new j.w6(Unit.INSTANCE);
            } catch (fuX.j e3) {
                e = e3;
                jVar2 = e;
                fux = fux2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fux = (LQ.fuX) oVar.f675t;
            w6Var = (w6) oVar.f673n;
            try {
                ResultKt.throwOnFailure(obj);
                try {
                    w6Var.Uo.O();
                    return new j.w6(Unit.INSTANCE);
                } catch (fuX.j e4) {
                    jVar2 = e4;
                }
            } catch (fuX.j e5) {
                jVar2 = e5;
            }
        }
        if (jVar2.rl() == fux) {
            return new j.n(jVar2.n());
        }
        throw jVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object U(F6.j jVar, long j2, Continuation continuation) throws fuX.j {
        aC aCVar;
        fuX.j jVar2;
        LQ.fuX fux;
        if (continuation instanceof aC) {
            aCVar = (aC) continuation;
            int i2 = aCVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aCVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                aCVar = new aC(continuation);
            }
        }
        Object obj = aCVar.f658t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aCVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            LQ.fuX fux2 = new LQ.fuX();
            try {
                C c2 = new C(jVar, j2, fux2, this, null);
                aCVar.f657n = fux2;
                aCVar.J2 = 1;
                if (GJW.Lu.J2(c2, aCVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fux = fux2;
            } catch (fuX.j e2) {
                jVar2 = e2;
                fux = fux2;
                if (jVar2.rl() != fux) {
                    return new j.n(jVar2.n());
                }
                throw jVar2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fux = (LQ.fuX) aCVar.f657n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (fuX.j e3) {
                jVar2 = e3;
                if (jVar2.rl() != fux) {
                }
            }
        }
        return new j.w6(Unit.INSTANCE);
    }

    @Override // B7.l3D
    public Object J2(long j2, Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(this.xMQ.J2(), new z(j2, null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    public Function2 M7() {
        return this.HI;
    }

    @Override // B7.l3D
    public void Uo(Function2 function2) {
        this.HI = function2;
    }

    public as.CN3 eF() {
        return this.f622n.n();
    }

    @Override // B7.l3D
    public boolean isPlaying() {
        Wre wreNr = ((fuX) this.mUb.getValue()).nr();
        if (Intrinsics.areEqual(wreNr, I28.f637n)) {
            return false;
        }
        if (wreNr instanceof CN3) {
            return true;
        }
        if (wreNr instanceof Dsr) {
            return !B7.eO.rl(((Dsr) wreNr).n(), ((d2n.Ml) this.J2.invoke()).Ik());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // B7.l3D
    public Object mUb(B7.j jVar, Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(this.xMQ.J2(), new UGc(jVar, null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    @Override // B7.l3D
    public Object n(Continuation continuation) throws Throwable {
        Wre wreNr = ((fuX) this.mUb.getValue()).nr();
        if (!(Intrinsics.areEqual(wreNr, I28.f637n) ? true : wreNr instanceof Dsr) && (wreNr instanceof CN3)) {
            throw new IllegalStateException("Cannot clear the cache while playing");
        }
        Object objN = this.gh.n(continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public long p5() {
        return this.f623t;
    }

    @Override // B7.l3D
    public Object r(Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(this.xMQ.J2(), new Xo(null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    @Override // w9.aC
    public Object rl(Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(V1.f3456n, new s4(null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    @Override // B7.l3D
    public Float t(long j2) {
        return this.Uo.t(j2);
    }

    @Override // B7.l3D
    public long xMQ() {
        return jB((fuX) this.mUb.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B7.Xo J(fuX fux, B7.Xo xo) {
        if (fux.nr() instanceof CN3) {
            B7.Xo xoN = ((CN3) fux.nr()).n();
            if (!d2n.Ml.KN(xoN.t(), xo.t())) {
                return B7.Xo.rl(xo, 0L, 0L, B7.eO.n(xoN, ((d2n.Ml) this.J2.invoke()).Ik()), 0L, 11, null);
            }
            return B7.Xo.rl(xoN, 0L, 0L, 0L, xo.nr(), 7, null);
        }
        throw new IllegalStateException(("Unexpected non-playing state when updating the timestamp: " + fux).toString());
    }

    private final long jB(fuX fux) {
        Wre wreNr = fux.nr();
        if (Intrinsics.areEqual(wreNr, I28.f637n)) {
            return fux.t().nr();
        }
        if (wreNr instanceof CN3) {
            return B7.eO.n(((CN3) fux.nr()).n(), ((d2n.Ml) this.J2.invoke()).Ik());
        }
        if (wreNr instanceof Dsr) {
            if (B7.eO.rl(((Dsr) fux.nr()).n(), ((d2n.Ml) this.J2.invoke()).Ik())) {
                return fux.t().nr();
            }
            return B7.eO.n(((Dsr) fux.nr()).n(), ((d2n.Ml) this.J2.invoke()).Ik());
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ w6(B7.s4 s4Var, F6.w6 w6Var, long j2, long j3, long j4, vd vdVar, Function1 function1, Function2 function2, Function0 function0, B7.Ml ml, lej lejVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(s4Var, w6Var, (i2 & 4) != 0 ? f620r : j2, (i2 & 8) != 0 ? f619o : j3, (i2 & 16) != 0 ? f618Z : j4, (i2 & 32) != 0 ? GJW.Lu.n(OU.n()) : vdVar, (i2 & 64) != 0 ? new j(Bn1.I28.mUb) : function1, (i2 & 128) != 0 ? n.f671n : function2, (i2 & 256) != 0 ? C0019w6.f682n : function0, (i2 & 512) != 0 ? new B7.I28(0, 0, 3, null) : ml, (i2 & 1024) != 0 ? OU.n() : lejVar, null);
    }
}
