package k9w;

import F6.w6;
import GJW.OU;
import GJW.vd;
import LQ.fuX;
import LQ.j;
import Z4.Ml;
import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import mF.w6;
import w9.C;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {

    public static final class CN3 implements LQ.n {
        final /* synthetic */ Object J2;
        final /* synthetic */ w6.n KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ mF.n f69678O;
        final /* synthetic */ boolean Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MoG.CN3 f69679n;
        final /* synthetic */ Context nr;
        final /* synthetic */ Uri rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ k9w.n f69680t;
        final /* synthetic */ VD.j xMQ;

        /* JADX INFO: renamed from: k9w.j$CN3$j, reason: collision with other inner class name */
        public static final class C1007j extends ContinuationImpl {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f69681O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f69682n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f69683t;

            public C1007j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f69683t = obj;
                this.f69681O |= Integer.MIN_VALUE;
                return CN3.this.n(null, this);
            }
        }

        public static final class n extends SuspendLambda implements Function2 {
            final /* synthetic */ boolean E2;
            final /* synthetic */ MoG.CN3 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ LQ.CN3 f69684O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ mF.n f69685S;

            /* JADX INFO: renamed from: T, reason: collision with root package name */
            Object f69686T;

            /* JADX INFO: renamed from: X, reason: collision with root package name */
            final /* synthetic */ VD.j f69687X;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ Context f69688Z;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ w6.n f69689e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Object f69690g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f69691n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ k9w.n f69692o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Uri f69693r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f69694t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(LQ.CN3 cn3, Continuation continuation, MoG.CN3 cn32, Uri uri, k9w.n nVar, Context context, mF.n nVar2, Object obj, boolean z2, w6.n nVar3, VD.j jVar) {
                super(2, continuation);
                this.f69684O = cn3;
                this.J2 = cn32;
                this.f69693r = uri;
                this.f69692o = nVar;
                this.f69688Z = context;
                this.f69685S = nVar2;
                this.f69690g = obj;
                this.E2 = z2;
                this.f69689e = nVar3;
                this.f69687X = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                n nVar = new n(this.f69684O, continuation, this.J2, this.f69693r, this.f69692o, this.f69688Z, this.f69685S, this.f69690g, this.E2, this.f69689e, this.f69687X);
                nVar.f69694t = obj;
                return nVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
            
                if (r3.rl(r14, r13) == r0) goto L16;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                LQ.w6 ml;
                LQ.w6 w6Var;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f69691n;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ml = (LQ.w6) this.f69686T;
                    w6Var = (LQ.w6) this.f69694t;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    ml = new LQ.Ml(this.f69684O, (TFv.CN3) this.f69694t);
                    float fT = this.J2.Uo().t();
                    LQ.n nVarKN = j.KN(this.J2, this.f69693r, this.f69692o, this.f69688Z, this.f69685S, this.f69690g, this.E2, this.f69689e, this.f69687X);
                    fuX fux = new fuX(ml, fT);
                    this.f69694t = ml;
                    this.f69686T = ml;
                    this.f69691n = 1;
                    obj = nVarKN.n(fux, this);
                    if (obj != coroutine_suspended) {
                        w6Var = ml;
                    }
                    return coroutine_suspended;
                }
                ml.O((LQ.j) obj);
                k9w.I28 i28T = k9w.I28.t(k9w.I28.f69676t.rl());
                this.f69694t = null;
                this.f69686T = null;
                this.f69691n = 2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
                return ((n) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public CN3(MoG.CN3 cn3, Uri uri, k9w.n nVar, Context context, mF.n nVar2, Object obj, boolean z2, w6.n nVar3, VD.j jVar) {
            this.f69679n = cn3;
            this.rl = uri;
            this.f69680t = nVar;
            this.nr = context;
            this.f69678O = nVar2;
            this.J2 = obj;
            this.Uo = z2;
            this.KN = nVar3;
            this.xMQ = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // LQ.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object n(TFv.CN3 cn3, Continuation continuation) throws fuX.j {
            C1007j c1007j;
            LQ.fuX fux;
            if (continuation instanceof C1007j) {
                c1007j = (C1007j) continuation;
                int i2 = c1007j.f69681O;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c1007j.f69681O = i2 - Integer.MIN_VALUE;
                } else {
                    c1007j = new C1007j(continuation);
                }
            }
            Object obj = c1007j.f69683t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = c1007j.f69681O;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                LQ.fuX fux2 = new LQ.fuX();
                try {
                    TFv.Wre wreIF = TFv.fuX.iF(new n(fux2, null, this.f69679n, this.rl, this.f69680t, this.nr, this.f69678O, this.J2, this.Uo, this.KN, this.xMQ));
                    c1007j.f69682n = fux2;
                    c1007j.f69681O = 1;
                    if (wreIF.n(cn3, c1007j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fux = fux2;
                } catch (fuX.j e2) {
                    e = e2;
                    fux = fux2;
                    if (e.rl() != fux) {
                        return new j.n(e.n());
                    }
                    throw e;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fux = (LQ.fuX) c1007j.f69682n;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (fuX.j e3) {
                    e = e3;
                    if (e.rl() != fux) {
                    }
                }
            }
            return new j.w6(Unit.INSTANCE);
        }
    }

    static final class Dsr extends SuspendLambda implements Function2 {
        final /* synthetic */ VD.j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f69695O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69696n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ oC.n f69697o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ MoG.CN3 f69698r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f69699t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Dsr(Context context, VD.j jVar, MoG.CN3 cn3, oC.n nVar, Continuation continuation) {
            super(2, continuation);
            this.f69695O = context;
            this.J2 = jVar;
            this.f69698r = cn3;
            this.f69697o = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Dsr dsr = new Dsr(this.f69695O, this.J2, this.f69698r, this.f69697o, continuation);
            dsr.f69699t = obj;
            return dsr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        
            if (r1.n(r10) == r0) goto L28;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [F6.w6] */
        /* JADX WARN: Type inference failed for: r1v5, types: [F6.w6] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r12 = this.f69696n;
            try {
            } catch (Throwable th) {
                this.f69699t = th;
                this.f69696n = 3;
                if (r12.n(this) != coroutine_suspended) {
                    throw th;
                }
            }
            if (r12 != 0) {
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th2 = (Throwable) this.f69699t;
                        ResultKt.throwOnFailure(obj);
                        throw th2;
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                F6.w6 w6Var = (F6.w6) this.f69699t;
                ResultKt.throwOnFailure(obj);
                r12 = w6Var;
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f69699t;
                F6.w6 w6VarN = F6.Ml.n(this.f69695O, this.J2, true);
                MoG.CN3 cn32 = this.f69698r;
                oC.n nVar = this.f69697o;
                TFv.Wre wreNr = j.nr(w6VarN, d2n.j.f63374t.O(2.0d), nVar.O(), cn32.nr());
                this.f69699t = w6VarN;
                this.f69696n = 1;
                r12 = w6VarN;
                if (TFv.fuX.S(cn3, wreNr, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            this.f69699t = Unit.INSTANCE;
            this.f69696n = 2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((Dsr) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class I28 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ d2n.Wre f69700n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ double f69701t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(d2n.Wre wre, double d2) {
            super(1);
            this.f69700n = wre;
            this.f69701t = d2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return d2n.Ml.rl(n(((Number) obj).intValue()));
        }

        public final long n(int i2) {
            return d2n.Ml.HI(this.f69700n.O(), d2n.j.f63374t.O(((double) i2) / this.f69701t));
        }
    }

    static final class Ml extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f69702n = new Ml();

        Ml() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Integer n(int i2) {
            return Integer.valueOf(i2 + 1);
        }
    }

    static final class Wre extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ d2n.Wre f69703n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(d2n.Wre wre) {
            super(1);
            this.f69703n = wre;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((d2n.Ml) obj).Ik());
        }

        public final Boolean n(long j2) {
            return Boolean.valueOf(d2n.Ml.nr(j2, this.f69703n.nr()) < 0);
        }
    }

    static final class aC implements fOK.Wre {
        final /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MoG.CN3 f69704O;
        final /* synthetic */ mF.n Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f69705n;
        final /* synthetic */ oC.Wre nr;
        final /* synthetic */ w6.n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ VD.j f69706t;

        /* JADX INFO: renamed from: k9w.j$aC$j, reason: collision with other inner class name */
        static final class C1008j extends SuspendLambda implements Function2 {
            final /* synthetic */ mF.n E2;
            final /* synthetic */ w6.n J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Context f69707O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ Object f69708S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ MoG.CN3 f69709Z;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Surface f69710g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f69711n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ oC.Wre f69712o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ VD.j f69713r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f69714t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1008j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1008j(Context context, w6.n nVar, VD.j jVar, oC.Wre wre, MoG.CN3 cn3, Object obj, Surface surface, mF.n nVar2, Continuation continuation) {
                super(2, continuation);
                this.f69707O = context;
                this.J2 = nVar;
                this.f69713r = jVar;
                this.f69712o = wre;
                this.f69709Z = cn3;
                this.f69708S = obj;
                this.f69710g = surface;
                this.E2 = nVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1008j(this.f69707O, this.J2, this.f69713r, this.f69712o, this.f69709Z, this.f69708S, this.f69710g, this.E2, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
            
                if (w9.C.n(r1, null, r12) == r9) goto L35;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v10 */
            /* JADX WARN: Type inference failed for: r1v6, types: [w9.aC] */
            /* JADX WARN: Type inference failed for: r1v9 */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [w9.aC] */
            /* JADX WARN: Type inference failed for: r2v4 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                ?? r2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f69714t;
                ?? r12 = 1;
                try {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Throwable th = (Throwable) this.f69711n;
                                ResultKt.throwOnFailure(obj);
                                throw th;
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        w9.aC aCVar = (w9.aC) this.f69711n;
                        ResultKt.throwOnFailure(obj);
                        r12 = aCVar;
                    } else {
                        ResultKt.throwOnFailure(obj);
                        Z4.Ml mlN = Z4.I28.n(this.f69707O, this.J2, Fw3.Dsr.f3224t.n(), this.f69713r, true);
                        oC.Wre wre = this.f69712o;
                        MoG.CN3 cn3 = this.f69709Z;
                        Object obj2 = this.f69708S;
                        Surface surface = this.f69710g;
                        mF.n nVar = this.E2;
                        try {
                            float fO = wre.O();
                            MoG.CN3 cn3J2 = cn3.J2();
                            Oe.j jVarNr = wre.nr();
                            this.f69711n = mlN;
                            this.f69714t = 1;
                            Z4.Ml ml = mlN;
                            Object objO = j.O(ml, cn3J2, obj2, surface, jVarNr, fO, nVar, this);
                            r12 = ml;
                            if (objO == coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = mlN;
                            Throwable th3 = th;
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                this.f69711n = th4;
                                this.f69714t = 3;
                                if (C.n(r2, th3, this) != coroutine_suspended) {
                                    throw th4;
                                }
                            }
                        }
                    }
                    this.f69711n = Unit.INSTANCE;
                    this.f69714t = 2;
                } catch (Throwable th5) {
                    th = th5;
                    r2 = r12;
                }
            }
        }

        aC(Context context, w6.n nVar, VD.j jVar, oC.Wre wre, MoG.CN3 cn3, Object obj, mF.n nVar2) {
            this.f69705n = context;
            this.rl = nVar;
            this.f69706t = jVar;
            this.nr = wre;
            this.f69704O = cn3;
            this.J2 = obj;
            this.Uo = nVar2;
        }

        @Override // fOK.Wre
        public final Object n(Surface surface, Continuation continuation) {
            Object objUo = GJW.Dsr.Uo(OU.n(), new C1008j(this.f69705n, this.rl, this.f69706t, this.nr, this.f69704O, this.J2, surface, this.Uo, null), continuation);
            if (objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objUo;
            }
            return Unit.INSTANCE;
        }
    }

    static final class fuX implements TFv.CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ LQ.w6 f69715n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ float f69716t;

        fuX(LQ.w6 w6Var, float f3) {
            this.f69715n = w6Var;
            this.f69716t = f3;
        }

        public final Object n(long j2, Continuation continuation) {
            Object objRl = this.f69715n.rl(k9w.I28.t(k9w.I28.f69676t.n(j2 / this.f69716t)), continuation);
            return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
        }

        @Override // TFv.CN3
        public /* bridge */ /* synthetic */ Object rl(Object obj, Continuation continuation) {
            return n(((d2n.Ml) obj).Ik(), continuation);
        }
    }

    /* JADX INFO: renamed from: k9w.j$j, reason: collision with other inner class name */
    public static final class C1009j implements TFv.Wre {
        final /* synthetic */ as.CN3 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MoG.CN3 f69717O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f69718n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ F6.w6 f69719t;

        /* JADX INFO: renamed from: k9w.j$j$j, reason: collision with other inner class name */
        public static final class C1010j implements TFv.CN3 {
            final /* synthetic */ as.CN3 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MoG.CN3 f69720O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f69721n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ F6.w6 f69722t;

            /* JADX INFO: renamed from: k9w.j$j$j$j, reason: collision with other inner class name */
            public static final class C1011j extends ContinuationImpl {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                Object f69723O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f69724n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f69725t;

                public C1011j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f69724n = obj;
                    this.f69725t |= Integer.MIN_VALUE;
                    return C1010j.this.rl(null, this);
                }
            }

            public C1010j(TFv.CN3 cn3, F6.w6 w6Var, MoG.CN3 cn32, as.CN3 cn33) {
                this.f69721n = cn3;
                this.f69722t = w6Var;
                this.f69720O = cn32;
                this.J2 = cn33;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
            
                if (r13.rl(r14, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1011j c1011j;
                TFv.CN3 cn3;
                if (continuation instanceof C1011j) {
                    c1011j = (C1011j) continuation;
                    int i2 = c1011j.f69725t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1011j.f69725t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1011j = new C1011j(continuation);
                    }
                }
                Object obj2 = c1011j.f69724n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1011j.f69725t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn32 = this.f69721n;
                    F6.w6 w6Var = this.f69722t;
                    w6.j jVar = new w6.j(new F6.j(this.f69720O, (d2n.Wre) obj), this.J2, null, 4, null);
                    c1011j.f69723O = cn32;
                    c1011j.f69725t = 1;
                    Object objRl = w6Var.rl(jVar, c1011j);
                    if (objRl != coroutine_suspended) {
                        obj2 = objRl;
                        cn3 = cn32;
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
                cn3 = (TFv.CN3) c1011j.f69723O;
                ResultKt.throwOnFailure(obj2);
                ByteBuffer byteBufferO = ((as.n) obj2).O();
                c1011j.f69723O = null;
                c1011j.f69725t = 2;
            }
        }

        public C1009j(TFv.Wre wre, F6.w6 w6Var, MoG.CN3 cn3, as.CN3 cn32) {
            this.f69718n = wre;
            this.f69719t = w6Var;
            this.f69717O = cn3;
            this.J2 = cn32;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f69718n.n(new C1010j(cn3, this.f69719t, this.f69717O, this.J2), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public static final class n implements TFv.Wre {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ MoG.CN3 f69726O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f69727n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Z4.Ml f69728t;

        /* JADX INFO: renamed from: k9w.j$n$j, reason: collision with other inner class name */
        public static final class C1012j implements TFv.CN3 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ MoG.CN3 f69729O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f69730n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Z4.Ml f69731t;

            /* JADX INFO: renamed from: k9w.j$n$j$j, reason: collision with other inner class name */
            public static final class C1013j extends ContinuationImpl {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                Object f69732O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f69733n;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f69734r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f69735t;

                public C1013j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f69733n = obj;
                    this.f69735t |= Integer.MIN_VALUE;
                    return C1012j.this.rl(null, this);
                }
            }

            public C1012j(TFv.CN3 cn3, Z4.Ml ml, MoG.CN3 cn32) {
                this.f69730n = cn3;
                this.f69731t = ml;
                this.f69729O = cn32;
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
                C1013j c1013j;
                TFv.CN3 cn3;
                Ml.j jVar;
                d2n.Ml ml;
                if (continuation instanceof C1013j) {
                    c1013j = (C1013j) continuation;
                    int i2 = c1013j.f69735t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1013j.f69735t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1013j = new C1013j(continuation);
                    }
                }
                Object obj2 = c1013j.f69733n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1013j.f69735t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    cn3 = this.f69730n;
                    Pair pair = (Pair) obj;
                    long jIk = ((d2n.Ml) pair.component1()).Ik();
                    d2n.Ml ml2 = (d2n.Ml) pair.component2();
                    d2n.Ml mlRl = d2n.Ml.rl(jIk);
                    Z4.Ml ml3 = this.f69731t;
                    Z4.n nVar = new Z4.n(this.f69729O, jIk, null);
                    if (ml2 != null) {
                        jVar = new Ml.j(new Z4.n(this.f69729O, ml2.Ik(), null), Ml.n.MEMORY_SAVING);
                    } else {
                        jVar = null;
                    }
                    c1013j.f69732O = cn3;
                    c1013j.f69734r = mlRl;
                    c1013j.f69735t = 1;
                    Object objAz = ml3.az(nVar, jVar, c1013j);
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
                ml = (d2n.Ml) c1013j.f69734r;
                cn3 = (TFv.CN3) c1013j.f69732O;
                ResultKt.throwOnFailure(obj2);
                Pair pair2 = TuplesKt.to(ml, obj2);
                c1013j.f69732O = null;
                c1013j.f69734r = null;
                c1013j.f69735t = 2;
            }
        }

        public n(TFv.Wre wre, Z4.Ml ml, MoG.CN3 cn3) {
            this.f69727n = wre;
            this.f69728t = ml;
            this.f69726O = cn3;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f69727n.n(new C1012j(cn3, this.f69728t, this.f69726O), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    static final class w6 implements TFv.CN3 {
        final /* synthetic */ Surface J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f69736O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Object f69737n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ mF.n f69738r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Oe.j f69739t;

        /* JADX INFO: renamed from: k9w.j$w6$j, reason: collision with other inner class name */
        static final class C1014j extends ContinuationImpl {
            int J2;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f69741n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f69742t;

            C1014j(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f69742t = obj;
                this.J2 |= Integer.MIN_VALUE;
                return w6.this.rl(null, this);
            }
        }

        w6(Object obj, Oe.j jVar, long j2, Surface surface, mF.n nVar) {
            this.f69737n = obj;
            this.f69739t = jVar;
            this.f69736O = j2;
            this.J2 = surface;
            this.f69738r = nVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
        
            if (((mF.I28) r1).n(r4, r2) == r3) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        @Override // TFv.CN3
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object rl(Pair pair, Continuation continuation) {
            C1014j c1014j;
            mF.Ml ml;
            if (continuation instanceof C1014j) {
                c1014j = (C1014j) continuation;
                int i2 = c1014j.J2;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c1014j.J2 = i2 - Integer.MIN_VALUE;
                } else {
                    c1014j = new C1014j(continuation);
                }
            }
            Object objN = c1014j.f69742t;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = c1014j.J2;
            if (i3 == 0) {
                ResultKt.throwOnFailure(objN);
                long jIk = ((d2n.Ml) pair.component1()).Ik();
                Map map = (Map) pair.component2();
                mF.j jVar = new mF.j(this.f69737n, jIk, this.f69739t, null);
                mF.Ml ml2 = new mF.Ml(map, this.J2, d2n.Ml.ty(jIk, this.f69736O), null);
                mF.n nVar = this.f69738r;
                c1014j.f69741n = ml2;
                c1014j.J2 = 1;
                objN = nVar.n(jVar, c1014j);
                if (objN != coroutine_suspended) {
                    ml = ml2;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objN);
                return Unit.INSTANCE;
            }
            ml = (mF.Ml) c1014j.f69741n;
            ResultKt.throwOnFailure(objN);
            c1014j.f69741n = null;
            c1014j.J2 = 2;
        }
    }

    public static final Sequence J2(d2n.Wre wre, double d2) {
        Intrinsics.checkNotNullParameter(wre, "<this>");
        return SequencesKt.takeWhile(SequencesKt.map(SequencesKt.generateSequence(0, Ml.f69702n), new I28(wre, d2)), new Wre(wre));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LQ.n KN(MoG.CN3 cn3, Uri uri, k9w.n nVar, Context context, mF.n nVar2, Object obj, boolean z2, w6.n nVar3, VD.j jVar) {
        oC.Wre wreJ2 = k9w.Ml.J2(nVar, z2);
        oC.n nVarN = k9w.Ml.n(nVar);
        return UP.n.n(fOK.I28.f66900n).n(context, uri, TuplesKt.to(wreJ2, new aC(context, nVar3, jVar, wreJ2, cn3, obj, nVar2)), TuplesKt.to(nVarN, TFv.fuX.e(TFv.fuX.iF(new Dsr(context, jVar, cn3, nVarN, null)), OU.n())), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object O(Z4.Ml ml, MoG.CN3 cn3, Object obj, Surface surface, Oe.j jVar, float f3, mF.n nVar, Continuation continuation) {
        Object objN = new n(TFv.fuX.n(v9.fuX.n(J2(cn3.Uo(), f3))), ml, cn3).n(new w6(obj, jVar, d2n.j.f63374t.nr(cn3.Uo().O()), surface, nVar), continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public static final TFv.Wre Uo(MoG.CN3 cn3, Uri outputUri, k9w.n settings, Context context, mF.n compositor, Object obj, boolean z2, w6.n resourceProvider, VD.j logger) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(outputUri, "outputUri");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(compositor, "compositor");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return LQ.I28.n(new CN3(cn3, outputUri, settings, context, compositor, obj, z2, resourceProvider, logger));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TFv.Wre nr(F6.w6 w6Var, long j2, as.CN3 cn3, MoG.CN3 cn32) {
        return new C1009j(TFv.fuX.n(d2n.CN3.n(cn32.Uo(), j2)), w6Var, cn32, cn3);
    }
}
