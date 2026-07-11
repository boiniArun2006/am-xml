package VoG;

import GJW.AbstractC1363t;
import GJW.OU;
import GJW.V1;
import GJW.vd;
import GJW.xuv;
import LQ.fuX;
import LQ.j;
import com.bendingspoons.fellini.utils.either.UnhandledFailureException;
import com.google.android.exoplayer2.extractor.SeekPoint;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import uPp.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml implements RK.n {
    private RK.j J2;
    private n KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final vd f11286O;
    private long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final VoG.w6 f11287n;
    private final CN3.n nr;
    private final CSs.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final d2n.Wre f11288t;
    private xuv xMQ;
    private static final j mUb = new j(null);
    private static final long gh = d2n.j.f63374t.O(0.5d);

    static final class C extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11290n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f11291t;

        C(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Throwable th, Continuation continuation) {
            C c2 = Ml.this.new C(continuation);
            c2.f11291t = th;
            return c2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11290n;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th = (Throwable) this.f11291t;
                ResultKt.throwOnFailure(obj);
                throw th;
            }
            ResultKt.throwOnFailure(obj);
            Throwable th2 = (Throwable) this.f11291t;
            Ml ml = Ml.this;
            this.f11291t = th2;
            this.f11290n = 1;
            if (ml.rl(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th2;
        }
    }

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ n f11292O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11293n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(n nVar, Continuation continuation) {
            super(2, continuation);
            this.f11292O = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new CN3(this.f11292O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11293n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Ml ml = Ml.this;
                n nVar = this.f11292O;
                this.f11293n = 1;
                if (ml.nHg(nVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Dsr extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11296n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f11297t;

        Dsr(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Dsr dsr = Ml.this.new Dsr(continuation);
            dsr.f11297t = obj;
            return dsr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11296n == 0) {
                ResultKt.throwOnFailure(obj);
                Ml.this.J2 = (RK.j) this.f11297t;
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(RK.j jVar, Continuation continuation) {
            return ((Dsr) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11298n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        I28(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new I28(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11298n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Ml ml = Ml.this;
                n nVar = ml.KN;
                this.f11298n = 1;
                if (ml.nHg(nVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: VoG.Ml$Ml, reason: collision with other inner class name */
    static final class C0404Ml implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ n f11300n;

        C0404Ml(n nVar) {
            this.f11300n = nVar;
        }

        @Override // TFv.CN3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object rl(VoG.j jVar, Continuation continuation) {
            this.f11300n.n().xMQ(jVar);
            return Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11301n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Wre(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new Wre(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11301n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                xuv xuvVar = Ml.this.xMQ;
                this.f11301n = 1;
                if (AbstractC1363t.Uo(xuvVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Ml.this.f11287n.release();
            Ml.this.rl.release();
            return Unit.INSTANCE;
        }
    }

    static final class aC extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11304n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f11305t;

        aC(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            aC aCVar = Ml.this.new aC(continuation);
            aCVar.f11305t = obj;
            return aCVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f11304n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f11305t;
                AbstractC1363t.qie(get$context());
                RK.j jVar = Ml.this.J2;
                if (jVar != null) {
                    this.f11304n = 1;
                    if (cn3.rl(jVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((aC) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class fuX extends SuspendLambda implements Function2 {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f11306O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ long f11307S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ LQ.w6 f11308Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f11309n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f11311r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f11312t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(LQ.w6 w6Var, long j2, Continuation continuation) {
            super(2, continuation);
            this.f11308Z = w6Var;
            this.f11307S = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            fuX fux = Ml.this.new fuX(this.f11308Z, this.f11307S, continuation);
            fux.f11311r = obj;
            return fux;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
        
            r1 = r7;
            r6 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ILs.Dsr dsrUo;
            TFv.CN3 cn3;
            TFv.CN3 cn32;
            ILs.Dsr dsr;
            VoG.j jVar;
            LQ.w6 w6Var;
            boolean zBooleanValue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.J2;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            dsrUo = (ILs.Dsr) this.f11309n;
                            cn3 = (TFv.CN3) this.f11311r;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        w6Var = (LQ.w6) this.f11306O;
                        jVar = (VoG.j) this.f11312t;
                        dsr = (ILs.Dsr) this.f11309n;
                        cn32 = (TFv.CN3) this.f11311r;
                        ResultKt.throwOnFailure(obj);
                        zBooleanValue = ((Boolean) w6Var.O((LQ.j) obj)).booleanValue();
                        Ml.this.Uo = jVar.n().rl();
                        if (!zBooleanValue) {
                            RK.j jVarN = jVar.n();
                            this.f11311r = cn32;
                            this.f11309n = dsr;
                            this.f11312t = null;
                            this.f11306O = null;
                            this.J2 = 3;
                            if (cn32.rl(jVarN, this) != coroutine_suspended) {
                                dsrUo = dsr;
                                cn3 = cn32;
                            }
                            return coroutine_suspended;
                        }
                    }
                } else {
                    dsrUo = (ILs.Dsr) this.f11309n;
                    cn3 = (TFv.CN3) this.f11311r;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        VoG.j jVar2 = (VoG.j) this.f11308Z.O((LQ.j) dsrUo.next());
                        if (d2n.Ml.nr(jVar2.n().rl(), this.f11307S) <= 0 || Ml.this.J2 == null) {
                            LQ.w6 w6Var2 = this.f11308Z;
                            this.f11311r = cn3;
                            this.f11309n = dsrUo;
                            this.f11312t = jVar2;
                            this.f11306O = w6Var2;
                            this.J2 = 2;
                            Object objRl = jVar2.rl(this);
                            if (objRl != coroutine_suspended) {
                                TFv.CN3 cn33 = cn3;
                                jVar = jVar2;
                                obj = objRl;
                                cn32 = cn33;
                                dsr = dsrUo;
                                w6Var = w6Var2;
                                zBooleanValue = ((Boolean) w6Var.O((LQ.j) obj)).booleanValue();
                                Ml.this.Uo = jVar.n().rl();
                                if (!zBooleanValue) {
                                }
                            }
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn34 = (TFv.CN3) this.f11311r;
                dsrUo = Ml.this.KN.n().Uo();
                cn3 = cn34;
            }
            this.f11311r = cn3;
            this.f11309n = dsrUo;
            this.f11312t = null;
            this.f11306O = null;
            this.J2 = 1;
            obj = dsrUo.rl(this);
            if (obj != coroutine_suspended) {
                if (((Boolean) obj).booleanValue()) {
                }
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((fuX) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    private static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SeekPoint f11313n;
        private final VoG.n rl;

        public n(SeekPoint seekPoint) {
            Intrinsics.checkNotNullParameter(seekPoint, "seekPoint");
            this.f11313n = seekPoint;
            this.rl = new VoG.n();
        }

        public final VoG.n n() {
            return this.rl;
        }

        public final SeekPoint rl() {
            return this.f11313n;
        }
    }

    static final class o implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ LQ.w6 f11314n;

        o(LQ.w6 w6Var) {
            this.f11314n = w6Var;
        }

        @Override // TFv.CN3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object rl(RK.j jVar, Continuation continuation) {
            Object objRl = this.f11314n.rl(jVar, continuation);
            return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
        }
    }

    public static final class qz implements LQ.n {
        final /* synthetic */ long rl;

        public static final class j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f11316O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f11317n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f11318t;

            public j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f11318t = obj;
                this.f11316O |= Integer.MIN_VALUE;
                return qz.this.n(null, this);
            }
        }

        public static final class n extends SuspendLambda implements Function2 {
            final /* synthetic */ Ml J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ LQ.CN3 f11319O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f11320n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            Object f11321o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ long f11322r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f11323t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(LQ.CN3 cn3, Continuation continuation, Ml ml, long j2) {
                super(2, continuation);
                this.f11319O = cn3;
                this.J2 = ml;
                this.f11322r = j2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                n nVar = new n(this.f11319O, continuation, this.J2, this.f11322r);
                nVar.f11323t = obj;
                return nVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x00df, code lost:
            
                if (r12.n(r1, r11) != r0) goto L21;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                LQ.w6 w6Var;
                LQ.w6 w6Var2;
                SeekPoint seekPoint;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f11320n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    seekPoint = (SeekPoint) this.f11321o;
                    w6Var2 = (LQ.w6) this.f11323t;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    LQ.Ml ml = new LQ.Ml(this.f11319O, (TFv.CN3) this.f11323t);
                    SeekPoint seekPointS7N = this.J2.s7N(this.f11322r);
                    if (seekPointS7N != null) {
                        xuv xuvVar = this.J2.xMQ;
                        this.f11323t = ml;
                        this.f11321o = seekPointS7N;
                        this.f11320n = 1;
                        if (AbstractC1363t.Uo(xuvVar, this) != coroutine_suspended) {
                            w6Var2 = ml;
                            seekPoint = seekPointS7N;
                        }
                        return coroutine_suspended;
                    }
                    w6Var = ml;
                    TFv.Wre wreUo = TFv.fuX.Uo(TFv.fuX.wTp(TFv.fuX.s7N(TFv.fuX.iF(this.J2.new fuX(w6Var, this.f11322r, null)), this.J2.new Dsr(null)), this.J2.new aC(null)), this.J2.new C(null));
                    o oVar = new o(w6Var);
                    this.f11323t = null;
                    this.f11321o = null;
                    this.f11320n = 2;
                }
                w6Var2.O(this.J2.KN.n().KN());
                this.J2.rl.n(seekPoint);
                n nVar = new n(seekPoint);
                this.J2.KN = nVar;
                this.J2.Uo = VoG.I28.rl(seekPoint);
                Ml ml2 = this.J2;
                ml2.xMQ = GJW.C.nr(ml2.f11286O, OU.nr(), null, this.J2.new CN3(nVar, null), 2, null);
                w6Var = w6Var2;
                TFv.Wre wreUo2 = TFv.fuX.Uo(TFv.fuX.wTp(TFv.fuX.s7N(TFv.fuX.iF(this.J2.new fuX(w6Var, this.f11322r, null)), this.J2.new Dsr(null)), this.J2.new aC(null)), this.J2.new C(null));
                o oVar2 = new o(w6Var);
                this.f11323t = null;
                this.f11321o = null;
                this.f11320n = 2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
                return ((n) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public qz(long j2) {
            this.rl = j2;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // LQ.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(TFv.CN3 cn3, Continuation continuation) throws fuX.j {
            j jVar;
            fuX.j jVar2;
            LQ.fuX fux;
            if (continuation instanceof j) {
                jVar = (j) continuation;
                int i2 = jVar.f11316O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jVar.f11316O = i2 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(continuation);
                }
            }
            Object obj = jVar.f11318t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = jVar.f11316O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                LQ.fuX fux2 = new LQ.fuX();
                try {
                    TFv.Wre wreIF = TFv.fuX.iF(new n(fux2, null, Ml.this, this.rl));
                    jVar.f11317n = fux2;
                    jVar.f11316O = 1;
                    if (wreIF.n(cn3, jVar) == coroutine_suspended) {
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
                fux = (LQ.fuX) jVar.f11317n;
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
    }

    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f11325n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f11326t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11326t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Ml.this.nHg(null, this);
        }
    }

    public Ml(VoG.w6 decoder, CSs.j assetSampleStream, d2n.Wre videoStreamTimeRange, CN3.n mediaTrack, vd scope) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(assetSampleStream, "assetSampleStream");
        Intrinsics.checkNotNullParameter(videoStreamTimeRange, "videoStreamTimeRange");
        Intrinsics.checkNotNullParameter(mediaTrack, "mediaTrack");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f11287n = decoder;
        this.rl = assetSampleStream;
        this.f11288t = videoStreamTimeRange;
        this.nr = mediaTrack;
        this.f11286O = scope;
        if (!decoder.isInitialized()) {
            throw new IllegalArgumentException("The renderer must be initialized");
        }
        this.Uo = d2n.Ml.f63370t.J2();
        SeekPoint START = SeekPoint.START;
        Intrinsics.checkNotNullExpressionValue(START, "START");
        this.KN = new n(START);
        this.xMQ = GJW.C.nr(scope, OU.nr(), null, new I28(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object nHg(n nVar, Continuation continuation) {
        w6 w6Var;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.J2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objN = w6Var.f11326t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.J2;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objN);
                LQ.n nVarT = this.f11287n.t(VoG.I28.rl(nVar.rl()));
                C0404Ml c0404Ml = new C0404Ml(nVar);
                w6Var.f11325n = nVar;
                w6Var.J2 = 1;
                objN = nVarT.n(c0404Ml, w6Var);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nVar = (n) w6Var.f11325n;
                ResultKt.throwOnFailure(objN);
            }
            LQ.j jVar = (LQ.j) objN;
            if (jVar instanceof j.n) {
                nVar.n().J2((uPp.o) ((j.n) jVar).n());
            } else {
                if (!(jVar instanceof j.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVar.n().nr();
            }
        } catch (UnhandledFailureException e2) {
            Object failure = e2.getFailure();
            if (failure instanceof uPp.o) {
                nVar.n().J2((uPp.o) failure);
            }
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th) {
            nVar.n().O(th);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SeekPoint s7N(long j2) {
        long jIk = ((d2n.Ml) RangesKt.coerceAtLeast(d2n.Ml.rl(this.f11287n.KN()), d2n.Ml.rl(d2n.Ml.HI(this.Uo, gh)))).Ik();
        if (d2n.Ml.nr(j2, this.Uo) < 0) {
            SeekPoint seekPoint = this.rl.getSeekPoints(d2n.Ml.xMQ(j2)).first;
            Intrinsics.checkNotNullExpressionValue(seekPoint, "assetSampleStream.getSeekPoints(time.micros).first");
            if (d2n.Ml.nr(VoG.I28.rl(seekPoint), j2) <= 0) {
                return seekPoint;
            }
            return null;
        }
        if (d2n.Ml.nr(j2, jIk) <= 0) {
            return null;
        }
        SeekPoint seekPoint2 = this.rl.getSeekPoints(d2n.Ml.xMQ(j2)).first;
        Intrinsics.checkNotNullExpressionValue(seekPoint2, "assetSampleStream.getSeekPoints(time.micros).first");
        if (d2n.Ml.nr(VoG.I28.rl(seekPoint2), jIk) <= 0) {
            return null;
        }
        return seekPoint2;
    }

    @Override // RK.n
    public d2n.Wre o() {
        return this.f11288t;
    }

    @Override // w9.aC
    public Object rl(Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(V1.f3456n, new Wre(null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    @Override // RK.n
    public LQ.n Ik(long j2) {
        if (d2n.CN3.nr(o(), j2)) {
            return new qz(j2);
        }
        throw new IllegalArgumentException(("The requested time " + ((Object) d2n.Ml.ck(j2)) + " is not in the valid time range: " + o()).toString());
    }
}
