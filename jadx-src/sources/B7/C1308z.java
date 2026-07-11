package B7;

import B7.Q;
import B7.Z;
import GJW.AbstractC1363t;
import GJW.N;
import GJW.OU;
import GJW.P;
import GJW.V1;
import GJW.iwV;
import GJW.vd;
import GJW.xuv;
import ILs.r;
import Oe.j;
import Sbr.j;
import TFv.Lu;
import TFv.rv6;
import Z4.Ml;
import android.view.Surface;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import com.bendingspoons.spidersense.data.storageManager.internal.CV.jhotmBbwMbr;
import d2n.Ml;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: B7.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C1308z implements Sbr.j {
    public static final Ml XQ = new Ml(null);
    private long HI;
    private final xuv Ik;
    private final Q J2;
    private final xgd.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final l3D f277O;
    private final vd Uo;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final xuv f278Z;
    private final AtomicBoolean az;
    private final Wre ck;
    private final TFv.SPz gh;
    private Object mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mF.n f279n;
    private final Z4.Ml nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final xuv f280o;
    private final rv6 qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final g9s f281r;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final VD.j f282t;
    private boolean ty;
    private MoG.CN3 xMQ;

    /* JADX INFO: renamed from: B7.z$C */
    static final class C extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f283n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        C(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C1308z.this.new C(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (B7.QJ.KN(r5, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            if (r5.GR(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f283n;
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                if (C1308z.this.az.getAndSet(true)) {
                    rv6 state = C1308z.this.getState();
                    this.f283n = 1;
                } else {
                    C1308z.this.ck.n();
                    C1308z c1308z = C1308z.this;
                    this.f283n = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: B7.z$CN3 */
    private static final class CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f285n;

        public /* synthetic */ CN3(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CN3) && d2n.j.gh(this.f285n, ((CN3) obj).f285n);
        }

        private CN3(long j2) {
            this.f285n = j2;
        }

        public int hashCode() {
            return d2n.j.ck(this.f285n);
        }

        public String toString() {
            return "TimeRangeDeviation(deviation=" + ((Object) d2n.j.S(this.f285n)) + ')';
        }
    }

    /* JADX INFO: renamed from: B7.z$Dsr */
    static final class Dsr extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f287n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f288t;

        Dsr(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f288t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return C1308z.this.J(this);
        }
    }

    /* JADX INFO: renamed from: B7.z$I28 */
    private interface I28 {

        /* JADX INFO: renamed from: B7.z$I28$I28, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public static final class C0004I28 implements I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final MoG.CN3 f289n;
            private final Object rl;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0004I28)) {
                    return false;
                }
                C0004I28 c0004i28 = (C0004I28) obj;
                return Intrinsics.areEqual(this.f289n, c0004i28.f289n) && Intrinsics.areEqual(this.rl, c0004i28.rl);
            }

            public C0004I28(MoG.CN3 cn3, Object obj) {
                Intrinsics.checkNotNullParameter(cn3, obbPUqyhtS.vOzIwXkxZn);
                this.f289n = cn3;
                this.rl = obj;
            }

            public int hashCode() {
                int iHashCode = this.f289n.hashCode() * 31;
                Object obj = this.rl;
                return iHashCode + (obj == null ? 0 : obj.hashCode());
            }

            public final MoG.CN3 n() {
                return this.f289n;
            }

            public final Object rl() {
                return this.rl;
            }

            public String toString() {
                return "UpdateComposition(composition=" + this.f289n + ", compositionInstruction=" + this.rl + ')';
            }
        }

        /* JADX INFO: renamed from: B7.z$I28$Ml */
        public static final class Ml implements I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final long f290n;

            public /* synthetic */ Ml(long j2, DefaultConstructorMarker defaultConstructorMarker) {
                this(j2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Ml) && d2n.Ml.KN(this.f290n, ((Ml) obj).f290n);
            }

            private Ml(long j2) {
                this.f290n = j2;
            }

            public int hashCode() {
                return d2n.Ml.qie(this.f290n);
            }

            public final long n() {
                return this.f290n;
            }

            public String toString() {
                return "SetTime(time=" + ((Object) d2n.Ml.ck(this.f290n)) + ')';
            }
        }

        /* JADX INFO: renamed from: B7.z$I28$Wre */
        public static final class Wre implements I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f291n;

            public /* synthetic */ Wre(int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Wre) && as.eO.Uo(this.f291n, ((Wre) obj).f291n);
            }

            private Wre(int i2) {
                this.f291n = i2;
            }

            public int hashCode() {
                return as.eO.KN(this.f291n);
            }

            public final int n() {
                return this.f291n;
            }

            public String toString() {
                return "UpdateFrameRate(frameRate=" + ((Object) as.eO.xMQ(this.f291n)) + ')';
            }
        }

        /* JADX INFO: renamed from: B7.z$I28$w6 */
        public static final class w6 implements I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final long f294n;

            public /* synthetic */ w6(long j2, DefaultConstructorMarker defaultConstructorMarker) {
                this(j2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof w6) && d2n.Ml.KN(this.f294n, ((w6) obj).f294n);
            }

            private w6(long j2) {
                this.f294n = j2;
            }

            public int hashCode() {
                return d2n.Ml.qie(this.f294n);
            }

            public final long n() {
                return this.f294n;
            }

            public String toString() {
                return "PlayUntil(endTime=" + ((Object) d2n.Ml.ck(this.f294n)) + ')';
            }
        }

        /* JADX INFO: renamed from: B7.z$I28$j */
        public static final class j implements I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final j f292n = new j();

            private j() {
            }
        }

        /* JADX INFO: renamed from: B7.z$I28$n */
        public static final class n implements I28 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final n f293n = new n();

            private n() {
            }
        }
    }

    /* JADX INFO: renamed from: B7.z$Ml */
    public static final class Ml {
        public /* synthetic */ Ml(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Ml() {
        }
    }

    /* JADX INFO: renamed from: B7.z$Pl */
    static final class Pl extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f296n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f297t;

        Pl(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f297t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return C1308z.this.GR(this);
        }
    }

    /* JADX INFO: renamed from: B7.z$QJ */
    static final class QJ extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f298O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f299Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f300n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f302r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f303t;

        QJ(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f302r = obj;
            this.f299Z |= Integer.MIN_VALUE;
            return C1308z.this.k(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: B7.z$Wre */
    private static final class Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ILs.CN3 f304n;
        private final TFv.Wre rl;

        public final void n() {
            r.j.n(this.f304n, null, 1, null);
        }

        public final TFv.Wre rl() {
            return this.rl;
        }

        public final Object t(I28 request) {
            Object objNr;
            Intrinsics.checkNotNullParameter(request, "request");
            synchronized (this) {
                objNr = this.f304n.nr(request);
            }
            return objNr;
        }

        public Wre() {
            ILs.CN3 cn3Rl = ILs.aC.rl(Integer.MAX_VALUE, null, null, 6, null);
            this.f304n = cn3Rl;
            this.rl = TFv.fuX.ck(cn3Rl);
        }
    }

    /* JADX INFO: renamed from: B7.z$Xo */
    static final class Xo extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f305n;

        /* JADX INFO: renamed from: B7.z$Xo$j */
        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ C1308z f307O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f308n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f309t;

            /* JADX INFO: renamed from: B7.z$Xo$j$j, reason: collision with other inner class name */
            static final class C0005j extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f310n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ C1308z f311t;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((C0005j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0005j(C1308z c1308z, Continuation continuation) {
                    super(2, continuation);
                    this.f311t = c1308z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0005j(this.f311t, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f310n == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f311t.KN.release();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX INFO: renamed from: B7.z$Xo$j$n */
            static final class n extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f312n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ C1308z f313t;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                n(C1308z c1308z, Continuation continuation) {
                    super(2, continuation);
                    this.f313t = c1308z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new n(this.f313t, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f312n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        l3D l3d = this.f313t.f277O;
                        this.f312n = 1;
                        if (l3d.rl(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: B7.z$Xo$j$w6 */
            static final class w6 extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f314n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ C1308z f315t;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                w6(C1308z c1308z, Continuation continuation) {
                    super(2, continuation);
                    this.f315t = c1308z;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new w6(this.f315t, continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
                
                    if (r5.n(r4) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f314n;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        xuv xuvVar = this.f315t.f278Z;
                        this.f314n = 1;
                        if (AbstractC1363t.Uo(xuvVar, this) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    Z4.Ml ml = this.f315t.nr;
                    this.f314n = 2;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(C1308z c1308z, Continuation continuation) {
                super(2, continuation);
                this.f307O = c1308z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f307O, continuation);
                jVar.f309t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f308n == 0) {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f309t;
                    GJW.C.nr(vdVar, null, null, new C0005j(this.f307O, null), 3, null);
                    GJW.C.nr(vdVar, null, null, new n(this.f307O, null), 3, null);
                    return GJW.C.nr(vdVar, null, null, new w6(this.f307O, null), 3, null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Xo) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Xo(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C1308z.this.new Xo(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objT;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f305n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    j jVar = new j(C1308z.this, null);
                    this.f305n = 3;
                    objT = N.t(jVar, this);
                    if (objT != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objT;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                C1308z.this.J2.n(false);
                xuv xuvVar = C1308z.this.Ik;
                this.f305n = 1;
                if (AbstractC1363t.Uo(xuvVar, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            xuv xuvVar2 = C1308z.this.f280o;
            this.f305n = 2;
            if (AbstractC1363t.Uo(xuvVar2, this) != coroutine_suspended) {
                j jVar2 = new j(C1308z.this, null);
                this.f305n = 3;
                objT = N.t(jVar2, this);
                if (objT != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: renamed from: B7.z$aC */
    static final class aC extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f316O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f317n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f318r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f319t;

        aC(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f316O = obj;
            this.f318r |= Integer.MIN_VALUE;
            return C1308z.this.D(0L, this);
        }
    }

    /* JADX INFO: renamed from: B7.z$eO */
    static final class eO extends SuspendLambda implements Function2 {
        final /* synthetic */ C1308z J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ B7.Pl f320O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f321n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f322t;

        /* JADX INFO: renamed from: B7.z$eO$j */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ B7.Pl f323O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f324n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ C1308z f325t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(C1308z c1308z, B7.Pl pl, Continuation continuation) {
                super(2, continuation);
                this.f325t = c1308z;
                this.f323O = pl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f325t, this.f323O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Ml.j jVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f324n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException(jhotmBbwMbr.nYzZesrVGU);
                }
                ResultKt.throwOnFailure(obj);
                Z4.Ml ml = this.f325t.nr;
                Z4.n nVarRl = this.f323O.rl();
                Z4.n nVarT = this.f323O.t();
                if (nVarT != null) {
                    jVar = new Ml.j(nVarT, Ml.n.HIGH_PERFORMANCE);
                } else {
                    jVar = null;
                }
                this.f324n = 1;
                Object objAz = ml.az(nVarRl, jVar, this);
                if (objAz == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objAz;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((eO) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        eO(B7.Pl pl, C1308z c1308z, Continuation continuation) {
            super(2, continuation);
            this.f320O = pl;
            this.J2 = c1308z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            eO eOVar = new eO(this.f320O, this.J2, continuation);
            eOVar.f322t = obj;
            return eOVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
        
            if (r1.n(r4, r14) != r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            P pRl;
            mF.I28 i28;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f321n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i28 = (mF.I28) this.f322t;
                    ResultKt.throwOnFailure(obj);
                    mF.Ml ml = new mF.Ml((Map) obj, this.f320O.nr(), d2n.Ml.f63370t.J2(), null);
                    this.f322t = null;
                    this.f321n = 3;
                } else {
                    pRl = (P) this.f322t;
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f322t;
                Oe.j jVar = new Oe.j(this.f320O.O(), j.n.DEGREE_0);
                mF.j jVar2 = new mF.j(this.f320O.n(), this.f320O.J2(), jVar, null);
                pRl = GJW.C.rl(vdVar, null, null, new j(this.J2, this.f320O, null), 3, null);
                mF.n nVar = this.J2.f279n;
                this.f322t = pRl;
                this.f321n = 1;
                obj = nVar.n(jVar2, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            mF.I28 i282 = (mF.I28) obj;
            this.f322t = i282;
            this.f321n = 2;
            Object objAwait = pRl.await(this);
            if (objAwait != coroutine_suspended) {
                i28 = i282;
                obj = objAwait;
                mF.Ml ml2 = new mF.Ml((Map) obj, this.f320O.nr(), d2n.Ml.f63370t.J2(), null);
                this.f322t = null;
                this.f321n = 3;
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: renamed from: B7.z$fuX */
    static final class fuX extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f326n;

        /* JADX INFO: renamed from: B7.z$fuX$j */
        static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ C1308z f328n;

            j(C1308z c1308z) {
                this.f328n = c1308z;
            }

            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(B7.Pl pl, Continuation continuation) {
                Object objNxk = this.f328n.Nxk(pl, continuation);
                return objNxk == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNxk : Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: B7.z$fuX$n */
        public static final class n implements TFv.Wre {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f329n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ C1308z f330t;

            /* JADX INFO: renamed from: B7.z$fuX$n$j */
            public static final class j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ TFv.CN3 f331n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ C1308z f332t;

                /* JADX INFO: renamed from: B7.z$fuX$n$j$j, reason: collision with other inner class name */
                public static final class C0006j extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f334n;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    int f335t;

                    public C0006j(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f334n = obj;
                        this.f335t |= Integer.MIN_VALUE;
                        return j.this.rl(null, this);
                    }
                }

                public j(TFv.CN3 cn3, C1308z c1308z) {
                    this.f331n = cn3;
                    this.f332t = c1308z;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // TFv.CN3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object rl(Object obj, Continuation continuation) {
                    C0006j c0006j;
                    if (continuation instanceof C0006j) {
                        c0006j = (C0006j) continuation;
                        int i2 = c0006j.f335t;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0006j.f335t = i2 - Integer.MIN_VALUE;
                        } else {
                            c0006j = new C0006j(continuation);
                        }
                    }
                    Object obj2 = c0006j.f334n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i3 = c0006j.f335t;
                    if (i3 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        TFv.CN3 cn3 = this.f331n;
                        j.w6 w6Var = (j.w6) obj;
                        Surface surfaceRl = afx.rl(this.f332t.ck());
                        B7.Pl plXMQ = surfaceRl != null ? B7.QJ.xMQ(w6Var, surfaceRl, this.f332t.rl, this.f332t.HI) : null;
                        if (plXMQ != null) {
                            c0006j.f335t = 1;
                            if (cn3.rl(plXMQ, c0006j) == coroutine_suspended) {
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

            public n(TFv.Wre wre, C1308z c1308z) {
                this.f329n = wre;
                this.f330t = c1308z;
            }

            @Override // TFv.Wre
            public Object n(TFv.CN3 cn3, Continuation continuation) {
                Object objN = this.f329n.n(new j(cn3, this.f330t), continuation);
                return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((fuX) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        fuX(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C1308z.this.new fuX(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f326n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreIk = TFv.fuX.Ik(new n(C1308z.this.getState(), C1308z.this));
                j jVar = new j(C1308z.this);
                this.f326n = 1;
                if (wreIk.n(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: B7.z$j */
    /* synthetic */ class j extends FunctionReferenceImpl implements Function2 {
        j(Object obj) {
            super(2, obj, P2H.j.class, "logFailure", "logFailure(Lcom/bendingspoons/fellini/utils/log/api/Logger;Ljava/lang/String;Ljava/lang/Object;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((String) obj, obj2);
            return Unit.INSTANCE;
        }

        public final void n(String p0, Object p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            P2H.j.n((VD.j) this.receiver, p0, p1);
        }
    }

    /* JADX INFO: renamed from: B7.z$n */
    static final class n extends Lambda implements Function1 {

        /* JADX INFO: renamed from: B7.z$n$j */
        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f337n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ C1308z f338t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(C1308z c1308z, Continuation continuation) {
                super(2, continuation);
                this.f338t = c1308z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f338t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f337n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C1308z c1308z = this.f338t;
                    this.f337n = 1;
                    if (c1308z.rl(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        n() {
            super(1);
        }

        public final void invoke(Throwable th) {
            C1308z.this.ty = th != null;
            if (B7.QJ.Uo((j.w6) C1308z.this.getState().getValue())) {
                return;
            }
            GJW.C.nr(C1308z.this.Uo, V1.f3456n, null, new j(C1308z.this, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: B7.z$o */
    static final class o extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f340n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f341t;

        /* JADX INFO: renamed from: B7.z$o$j */
        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f342n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ C1308z f343t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(C1308z c1308z, Continuation continuation) {
                super(2, continuation);
                this.f343t = c1308z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new j(this.f343t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f342n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Z4.Ml ml = this.f343t.nr;
                    this.f342n = 1;
                    if (ml.n(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: B7.z$o$n */
        static final class n extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f344n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ C1308z f345t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(C1308z c1308z, Continuation continuation) {
                super(2, continuation);
                this.f345t = c1308z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new n(this.f345t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f344n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    l3D l3d = this.f345t.f277O;
                    this.f344n = 1;
                    if (l3d.n(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((o) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        o(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            o oVar = C1308z.this.new o(continuation);
            oVar.f341t = obj;
            return oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f340n == 0) {
                ResultKt.throwOnFailure(obj);
                vd vdVar = (vd) this.f341t;
                GJW.C.nr(vdVar, null, null, new j(C1308z.this, null), 3, null);
                return GJW.C.nr(vdVar, null, null, new n(C1308z.this, null), 3, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: B7.z$qz */
    public static final class qz extends AbstractCoroutineContextElement implements iwV {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C1308z f346n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public qz(iwV.j jVar, C1308z c1308z) {
            super(jVar);
            this.f346n = c1308z;
        }

        @Override // GJW.iwV
        public void a(CoroutineContext coroutineContext, Throwable th) {
            this.f346n.f282t.n("PreviewerFinalization", "Previewer finalization failed", th);
        }
    }

    /* JADX INFO: renamed from: B7.z$w6 */
    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f347n;

        /* JADX INFO: renamed from: B7.z$w6$j */
        static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ C1308z f349n;

            j(C1308z c1308z) {
                this.f349n = c1308z;
            }

            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(I28 i28, Continuation continuation) {
                if (i28 instanceof I28.w6) {
                    Object objD = this.f349n.D(((I28.w6) i28).n(), continuation);
                    return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Unit.INSTANCE;
                }
                if (i28 instanceof I28.n) {
                    Object objJ = this.f349n.J(continuation);
                    return objJ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ : Unit.INSTANCE;
                }
                if (i28 instanceof I28.Ml) {
                    Object objY = this.f349n.Y(((I28.Ml) i28).n(), continuation);
                    return objY == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objY : Unit.INSTANCE;
                }
                if (i28 instanceof I28.C0004I28) {
                    I28.C0004I28 c0004i28 = (I28.C0004I28) i28;
                    Object objK = this.f349n.k(c0004i28.n(), c0004i28.rl(), null, continuation);
                    return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : Unit.INSTANCE;
                }
                if (i28 instanceof I28.Wre) {
                    this.f349n.dR0(((I28.Wre) i28).n());
                } else if (i28 instanceof I28.j) {
                    Object objI = this.f349n.I(continuation);
                    return objI == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objI : Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C1308z.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f347n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreRl = C1308z.this.ck.rl();
                j jVar = new j(C1308z.this);
                this.f347n = 1;
                if (wreRl.n(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: B7.z$z, reason: collision with other inner class name */
    static final class C0007z extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f350n;

        /* JADX INFO: renamed from: B7.z$z$j */
        static final class j extends SuspendLambda implements Function3 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ C1308z f352O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f353n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f354t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(C1308z c1308z, Continuation continuation) {
                super(3, continuation);
                this.f352O = c1308z;
            }

            @Override // kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Q.j jVar, Z z2, Continuation continuation) {
                j jVar2 = new j(this.f352O, continuation);
                jVar2.f354t = z2;
                return jVar2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                j.n c0316j;
                Float fT;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f353n == 0) {
                    ResultKt.throwOnFailure(obj);
                    Z z2 = (Z) this.f354t;
                    if (z2 instanceof Z.n) {
                        if (this.f352O.f277O.isPlaying()) {
                            fT = this.f352O.f277O.t(this.f352O.f277O.xMQ());
                        } else {
                            fT = null;
                        }
                        c0316j = new j.n.C0316j(((Z.n) z2).n(), this.f352O.f277O.isPlaying(), fT);
                    } else if (z2 instanceof Z.j) {
                        c0316j = j.n.C0317n.f9787n;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    j.n nVar = c0316j;
                    long jXMQ = this.f352O.f277O.xMQ();
                    return new j.w6.C0318j(this.f352O.xMQ, this.f352O.mUb, jXMQ, nVar, null);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: B7.z$z$n */
        static final class n implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ C1308z f355n;

            n(C1308z c1308z) {
                this.f355n = c1308z;
            }

            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(j.w6.C0318j c0318j, Continuation continuation) {
                this.f355n.gh.setValue(c0318j);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0007z) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        C0007z(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C1308z.this.new C0007z(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f350n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreTy = TFv.fuX.ty(C1308z.this.J2.nr(), C1308z.this.ck().t(), new j(C1308z.this, null));
                n nVar = new n(C1308z.this);
                this.f350n = 1;
                if (wreTy.n(nVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C1308z(mF.n nVar, int i2, VD.j jVar, Z4.Ml ml, l3D l3d, Q q2, vd vdVar, xgd.j jVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, i2, jVar, ml, l3d, q2, vdVar, jVar2);
    }

    private C1308z(mF.n nVar, int i2, VD.j jVar, Z4.Ml ml, l3D l3d, Q q2, vd vdVar, xgd.j jVar2) {
        this.f279n = nVar;
        this.rl = i2;
        this.f282t = jVar;
        this.nr = ml;
        this.f277O = l3d;
        this.J2 = q2;
        this.Uo = vdVar;
        this.KN = jVar2;
        MoG.CN3 cn3N = MoG.CN3.f6746O.n();
        this.xMQ = cn3N;
        Object obj = this.mUb;
        Ml.j jVar3 = d2n.Ml.f63370t;
        TFv.SPz sPzN = Lu.n(new j.w6.C0318j(cn3N, obj, jVar3.J2(), j.n.C0317n.f9787n, null));
        this.gh = sPzN;
        this.qie = TFv.fuX.t(sPzN);
        this.az = new AtomicBoolean(false);
        this.HI = jVar3.J2();
        this.ck = new Wre();
        this.f281r = new g9s();
        l3d.Uo(new j(jVar));
        AbstractC1363t.az(vdVar.getCoroutineContext()).invokeOnCompletion(new n());
        this.Ik = GJW.C.nr(vdVar, null, null, new w6(null), 3, null);
        a(new I28.C0004I28(this.xMQ, this.mUb));
        this.f280o = GJW.C.nr(vdVar, OU.nr(), null, new C0007z(null), 2, null);
        this.f278Z = B(vdVar);
    }

    private final xuv B(vd vdVar) {
        return GJW.C.nr(vdVar, null, null, new fuX(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(long j2, Continuation continuation) {
        aC aCVar;
        C1308z c1308z;
        C1308z c1308z2;
        if (continuation instanceof aC) {
            aCVar = (aC) continuation;
            int i2 = aCVar.f318r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aCVar.f318r = i2 - Integer.MIN_VALUE;
            } else {
                aCVar = new aC(continuation);
            }
        }
        Object obj = aCVar.f316O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = aCVar.f318r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            rv6 state = getState();
            aCVar.f317n = this;
            aCVar.f319t = j2;
            aCVar.f318r = 1;
            if (B7.QJ.O(state, aCVar) != coroutine_suspended) {
                c1308z = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1308z2 = (C1308z) aCVar.f317n;
            ResultKt.throwOnFailure(obj);
            c1308z2.J2.t(false);
            c1308z = c1308z2;
            c1308z.J2.n(true);
            return Unit.INSTANCE;
        }
        j2 = aCVar.f319t;
        c1308z = (C1308z) aCVar.f317n;
        ResultKt.throwOnFailure(obj);
        long jAz = d2n.Ml.az(j2, c1308z.f277O.xMQ());
        if (d2n.j.nr(jAz, d2n.j.f63374t.J2()) <= 0) {
            return Unit.INSTANCE;
        }
        if (!c1308z.f277O.isPlaying()) {
            c1308z.J2.n(false);
            c1308z.HI = c1308z.f277O.xMQ();
            l3D l3d = c1308z.f277O;
            aCVar.f317n = c1308z;
            aCVar.f318r = 2;
            if (l3d.J2(jAz, aCVar) != coroutine_suspended) {
                c1308z2 = c1308z;
                c1308z2.J2.t(false);
                c1308z = c1308z2;
            }
            return coroutine_suspended;
        }
        c1308z.J2.n(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object GR(Continuation continuation) throws Throwable {
        Pl pl;
        C1308z c1308z;
        if (continuation instanceof Pl) {
            pl = (Pl) continuation;
            int i2 = pl.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pl.J2 = i2 - Integer.MIN_VALUE;
            } else {
                pl = new Pl(continuation);
            }
        }
        Object obj = pl.f297t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pl.J2;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1308z = (C1308z) pl.f296n;
            try {
                ResultKt.throwOnFailure(obj);
                c1308z.gh.setValue(j.w6.n.f9790n);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                th = th;
                c1308z.gh.setValue(j.w6.n.f9790n);
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        try {
            CoroutineContext coroutineContextPlus = V1.f3456n.plus(new qz(iwV.rl, this));
            Xo xo = new Xo(null);
            pl.f296n = this;
            pl.J2 = 1;
            if (GJW.Dsr.Uo(coroutineContextPlus, xo, pl) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c1308z = this;
            c1308z.gh.setValue(j.w6.n.f9790n);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            c1308z = this;
            c1308z.gh.setValue(j.w6.n.f9790n);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I(Continuation continuation) {
        if (this.f277O.isPlaying()) {
            throw new IllegalStateException("Cannot release the cache while the previewer is playing");
        }
        Object objJ2 = GJW.Lu.J2(new o(null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(Continuation continuation) {
        Dsr dsr;
        C1308z c1308z;
        if (continuation instanceof Dsr) {
            dsr = (Dsr) continuation;
            int i2 = dsr.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dsr.J2 = i2 - Integer.MIN_VALUE;
            } else {
                dsr = new Dsr(continuation);
            }
        }
        Object obj = dsr.f288t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = dsr.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f277O.isPlaying()) {
                l3D l3d = this.f277O;
                dsr.f287n = this;
                dsr.J2 = 1;
                if (l3d.r(dsr) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            c1308z = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1308z = (C1308z) dsr.f287n;
            ResultKt.throwOnFailure(obj);
        }
        c1308z.J2.n(false);
        return Unit.INSTANCE;
    }

    private final void M(String str) {
        if (this.az.get()) {
            throw new IllegalStateException(("Previewer cannot " + str + " after its release method has been called.").toString());
        }
        if (this.ty) {
            throw new IllegalStateException(("Previewer cannot " + str + " after it crashed.").toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Nxk(B7.Pl pl, Continuation continuation) {
        Object objJ2 = GJW.Lu.J2(new eO(pl, this, null), continuation);
        return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y(long j2, Continuation continuation) {
        long jN = d2n.I28.n(j2, this.xMQ.Uo());
        long jQie = d2n.j.qie(d2n.Ml.az(j2, jN));
        if (d2n.j.az(jQie) >= 1) {
            P2H.j.n(this.f282t, "IncorrectSeekTime", new CN3(jQie, null));
        }
        Object objK = k(this.xMQ, this.mUb, d2n.Ml.rl(jN), continuation);
        return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : Unit.INSTANCE;
    }

    private final void a(I28 i28) {
        this.ck.t(i28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dR0(int i2) {
        this.rl = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(MoG.CN3 cn3, Object obj, d2n.Ml ml, Continuation continuation) {
        QJ qj;
        d2n.Ml ml2;
        C1308z c1308z;
        MoG.CN3 cn32;
        Object obj2;
        if (continuation instanceof QJ) {
            qj = (QJ) continuation;
            int i2 = qj.f299Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qj.f299Z = i2 - Integer.MIN_VALUE;
            } else {
                qj = new QJ(continuation);
            }
        }
        Object obj3 = qj.f302r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = qj.f299Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj3);
            if (Intrinsics.areEqual(cn3, this.xMQ) && ml == null) {
                c1308z = this;
                c1308z.mUb = obj;
                boolean zRl = c1308z.J2.rl();
                c1308z.J2.n(false);
                c1308z.J2.t(true);
                c1308z.J2.n(zRl);
                return Unit.INSTANCE;
            }
            qj.f300n = this;
            qj.f303t = cn3;
            qj.f298O = obj;
            qj.J2 = ml;
            qj.f299Z = 1;
            if (J(qj) != coroutine_suspended) {
                ml2 = ml;
                c1308z = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = qj.f298O;
            cn32 = (MoG.CN3) qj.f303t;
            c1308z = (C1308z) qj.f300n;
            ResultKt.throwOnFailure(obj3);
            c1308z.xMQ = cn32;
            obj = obj2;
            c1308z.mUb = obj;
            boolean zRl2 = c1308z.J2.rl();
            c1308z.J2.n(false);
            c1308z.J2.t(true);
            c1308z.J2.n(zRl2);
            return Unit.INSTANCE;
        }
        d2n.Ml ml3 = (d2n.Ml) qj.J2;
        obj = qj.f298O;
        cn3 = (MoG.CN3) qj.f303t;
        C1308z c1308z2 = (C1308z) qj.f300n;
        ResultKt.throwOnFailure(obj3);
        ml2 = ml3;
        c1308z = c1308z2;
        l3D l3d = c1308z.f277O;
        B7.j jVar = new B7.j(cn3.nr(), ml2 != null ? ml2.Ik() : ((d2n.Ml) RangesKt.coerceAtMost(d2n.Ml.rl(c1308z.f277O.xMQ()), d2n.Ml.rl(cn3.Uo().nr()))).Ik(), null);
        qj.f300n = c1308z;
        qj.f303t = cn3;
        qj.f298O = obj;
        qj.J2 = null;
        qj.f299Z = 2;
        if (l3d.mUb(jVar, qj) != coroutine_suspended) {
            Object obj4 = obj;
            cn32 = cn3;
            obj2 = obj4;
            c1308z.xMQ = cn32;
            obj = obj2;
            c1308z.mUb = obj;
            boolean zRl22 = c1308z.J2.rl();
            c1308z.J2.n(false);
            c1308z.J2.t(true);
            c1308z.J2.n(zRl22);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @Override // Sbr.j
    /* JADX INFO: renamed from: FX, reason: merged with bridge method [inline-methods] */
    public g9s ck() {
        return this.f281r;
    }

    @Override // Sbr.j
    public void HI(MoG.CN3 composition, Object compositionInstruction) {
        Intrinsics.checkNotNullParameter(composition, "composition");
        Intrinsics.checkNotNullParameter(compositionInstruction, "compositionInstruction");
        M("update composition");
        a(new I28.C0004I28(composition, compositionInstruction));
    }

    @Override // Sbr.j
    public void WPU(int i2) {
        a(new I28.Wre(i2, null));
    }

    @Override // Sbr.j
    public void Z(long j2) {
        M("seekTo");
        a(new I28.Ml(j2, null));
    }

    @Override // Sbr.j
    public rv6 getState() {
        return this.qie;
    }

    @Override // Sbr.j
    public void gh(long j2) {
        M("play until");
        a(new I28.w6(j2, null));
    }

    @Override // Sbr.j
    public void nr() {
        M("clear cache");
        a(I28.j.f292n);
    }

    @Override // Sbr.j
    public void pause() {
        M("pause");
        a(I28.n.f293n);
    }

    @Override // w9.aC
    public Object rl(Continuation continuation) {
        Object objUo = GJW.Dsr.Uo(V1.f3456n, new C(null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    public /* synthetic */ C1308z(mF.n nVar, int i2, VD.j jVar, Z4.Ml ml, l3D l3d, Q q2, vd vdVar, xgd.j jVar2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, i2, jVar, ml, l3d, (i3 & 32) != 0 ? new Bn1.Dsr(null, false, null, 7, null) : q2, vdVar, (i3 & 128) != 0 ? xgd.n.n() : jVar2, null);
    }
}
