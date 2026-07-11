package qE;

import GJW.Lu;
import GJW.OU;
import GJW.vd;
import GJW.yg;
import K6D.Ml;
import K6D.j;
import androidx.tracing.Trace;
import com.bendingspoons.networking.NetworkError;
import com.bendingspoons.oracle.models.OracleResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.TimeoutCancellationException;
import qu.I28;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class s4 implements qu.I28 {
    private final rB.Ml J2;
    private final List KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final I28.n f72314O;
    private final vd Uo;
    private final TFv.Wre mUb;
    private final bH.CN3 nr;
    private final qu.Dsr rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final fuX f72315t;
    private final TFv.Wre xMQ;

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f72316O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72317n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ x0X.n f72318r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72319t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(x0X.n nVar, Continuation continuation) {
            super(2, continuation);
            this.f72318r = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return s4.this.new I28(this.f72318r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x0X.n nVar;
            Iterator it;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72316O;
            if (i2 != 0) {
                if (i2 == 1) {
                    it = (Iterator) this.f72319t;
                    nVar = (x0X.n) this.f72317n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                List list = s4.this.KN;
                nVar = this.f72318r;
                it = list.iterator();
            }
            if (!it.hasNext()) {
                return Unit.INSTANCE;
            }
            android.support.v4.media.j.n(it.next());
            this.f72317n = nVar;
            this.f72319t = it;
            this.f72316O = 1;
            throw null;
        }
    }

    static final class Ml extends ContinuationImpl {
        int E2;
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f72320O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        /* synthetic */ Object f72321S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        boolean f72322Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72324n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f72325o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f72326r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f72327t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f72321S = obj;
            this.E2 |= Integer.MIN_VALUE;
            return s4.this.n(0, 0L, null, this);
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ rB.Ml f72328O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f72329n;

        /* JADX INFO: renamed from: qE.s4$j$j, reason: collision with other inner class name */
        static final class C1116j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ s4 f72331n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ rB.Ml f72332t;

            C1116j(s4 s4Var, rB.Ml ml) {
                this.f72331n = s4Var;
                this.f72332t = ml;
            }

            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(OracleResponse oracleResponse, Continuation continuation) {
                bH.CN3 cn3;
                boolean zIsSpoonerDevice = oracleResponse.getSettings().isSpoonerDevice();
                s4 s4Var = this.f72331n;
                rB.Ml ml = this.f72332t;
                if (zIsSpoonerDevice && (cn3 = s4Var.nr) != null) {
                    cn3.nr(true);
                }
                if (s4Var.f72314O.n()) {
                    ml.xMQ(zIsSpoonerDevice);
                }
                if (this.f72331n.f72314O.t()) {
                    this.f72332t.KN(UGc.t(oracleResponse));
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(rB.Ml ml, Continuation continuation) {
            super(2, continuation);
            this.f72328O = ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return s4.this.new j(this.f72328O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72329n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreAYN = TFv.fuX.aYN(s4.this.f72315t.getResponse());
                C1116j c1116j = new C1116j(s4.this, this.f72328O);
                this.f72329n = 1;
                if (wreAYN.n(c1116j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function1 {
        final /* synthetic */ s4 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Ref.LongRef f72333O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f72334n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Integer f72335o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ajd.j f72336r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f72337t;

        /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            K6D.j jVar;
            boolean z2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f72337t;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                long j2 = this.f72333O.element;
                this.f72337t = 1;
                if (yg.t(j2, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K6D.j jVar2 = (K6D.j) this.f72334n;
                ResultKt.throwOnFailure(obj);
                jVar = jVar2;
                x0X.n nVar = (x0X.n) obj;
                z2 = nVar instanceof n.C1266n;
                if (!z2) {
                    if (!(nVar instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j.C0175j.n(jVar, null, 1, null);
                }
                if (!z2) {
                    j.C0175j.rl(jVar, null, null, pq.I28.n(pq.n.O("error_type", com.bendingspoons.networking.j.rl((NetworkError) ((n.C1266n) nVar).n()))), 3, null);
                    return nVar;
                }
                if (nVar instanceof n.w6) {
                    return nVar;
                }
                throw new NoWhenBranchMatchedException();
            }
            ResultKt.throwOnFailure(obj);
            Ref.LongRef longRef = this.f72333O;
            longRef.element = Duration.m1683timesUwyO8pc(((Duration) RangesKt.coerceAtLeast(Duration.m1650boximpl(longRef.element), Duration.m1650boximpl(DurationKt.toDuration(2, DurationUnit.SECONDS)))).getRawValue(), 2);
            K6D.j jVarNr = Ml.n.nr(this.J2.J2.O(), this.f72336r, null, 2, null);
            qu.Dsr dsr = this.J2.rl;
            Integer num = this.f72335o;
            this.f72334n = jVarNr;
            this.f72337t = 2;
            Object objN = Ew.n(dsr, num, this);
            if (objN != coroutine_suspended) {
                jVar = jVarNr;
                obj = objN;
                x0X.n nVar2 = (x0X.n) obj;
                z2 = nVar2 instanceof n.C1266n;
                if (!z2) {
                }
                if (!z2) {
                }
            }
            return coroutine_suspended;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Ref.LongRef longRef, s4 s4Var, ajd.j jVar, Integer num, Continuation continuation) {
            super(1, continuation);
            this.f72333O = longRef;
            this.J2 = s4Var;
            this.f72336r = jVar;
            this.f72335o = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new n(this.f72333O, this.J2, this.f72336r, this.f72335o, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class w6 implements TFv.Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TFv.Wre f72338n;

        public static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ TFv.CN3 f72339n;

            /* JADX INFO: renamed from: qE.s4$w6$j$j, reason: collision with other inner class name */
            public static final class C1117j extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f72341n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f72342t;

                public C1117j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f72341n = obj;
                    this.f72342t |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            public j(TFv.CN3 cn3) {
                this.f72339n = cn3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(Object obj, Continuation continuation) {
                C1117j c1117j;
                if (continuation instanceof C1117j) {
                    c1117j = (C1117j) continuation;
                    int i2 = c1117j.f72342t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1117j.f72342t = i2 - Integer.MIN_VALUE;
                    } else {
                        c1117j = new C1117j(continuation);
                    }
                }
                Object obj2 = c1117j.f72341n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c1117j.f72342t;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    TFv.CN3 cn3 = this.f72339n;
                    Long l2 = (Long) obj;
                    Date date = l2 != null ? new Date(l2.longValue()) : null;
                    c1117j.f72342t = 1;
                    if (cn3.rl(date, c1117j) == coroutine_suspended) {
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

        public w6(TFv.Wre wre) {
            this.f72338n = wre;
        }

        @Override // TFv.Wre
        public Object n(TFv.CN3 cn3, Continuation continuation) {
            Object objN = this.f72338n.n(new j(cn3), continuation);
            return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
        }
    }

    public s4(qu.Dsr oracleService, fuX oracleResponseDataStore, rB.Ml spiderSense, bH.CN3 cn3, I28.n config, GJW.lej mainDispatcher, GJW.lej backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(oracleService, "oracleService");
        Intrinsics.checkNotNullParameter(oracleResponseDataStore, "oracleResponseDataStore");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.rl = oracleService;
        this.f72315t = oracleResponseDataStore;
        this.nr = cn3;
        this.f72314O = config;
        this.J2 = d3.j.J2(spiderSense, "oracle", "responseStore");
        GJW.C.nr(Lu.n(backgroundDispatcher), null, null, new j(spiderSense, null), 3, null);
        this.Uo = Lu.n(mainDispatcher);
        this.KN = new ArrayList();
        this.xMQ = oracleResponseDataStore.getResponse();
        this.mUb = new w6(oracleResponseDataStore.O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(s4 s4Var, ajd.j jVar, TimeoutCancellationException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Ml.n.n(s4Var.J2.O(), jVar, null, 2, null);
        return Unit.INSTANCE;
    }

    private final Object mUb(int i2, long j2, boolean z2, Integer num, Continuation continuation) {
        List listListOf = CollectionsKt.listOf("downloadSetup");
        pq.Ml ml = new pq.Ml();
        ml.KN("is_setup_response_cached", z2);
        Unit unit = Unit.INSTANCE;
        final ajd.j jVar = new ajd.j(listListOf, null, "Download setup", null, ml, 10, null);
        Ref.LongRef longRef = new Ref.LongRef();
        Duration.Companion companion = Duration.INSTANCE;
        longRef.element = DurationKt.toDuration(0, DurationUnit.SECONDS);
        return UGc.nr(j2, i2, new Function1() { // from class: qE.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s4.gh(this.f72265n, jVar, (TimeoutCancellationException) obj);
            }
        }, new n(longRef, this, jVar, num, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #4 {all -> 0x006f, blocks: (B:26:0x006a, B:48:0x0114, B:50:0x0118), top: B:103:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ca  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // qu.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(int i2, long j2, Integer num, Continuation continuation) throws Throwable {
        Ml ml;
        boolean zKN;
        Integer num2;
        int i3;
        long j3;
        s4 s4Var;
        Integer num3;
        long j4;
        s4 s4Var2;
        Duration duration;
        int i5;
        boolean z2;
        boolean z3;
        int i7;
        long j5;
        boolean z4;
        s4 s4Var3;
        long j6;
        boolean z5;
        boolean z6;
        x0X.n w6Var;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i8 = ml.E2;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                ml.E2 = i8 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Ml ml2 = ml;
        Object objRl = ml2.f72321S;
        ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = ml2.E2;
        try {
            if (i9 == 0) {
                ResultKt.throwOnFailure(objRl);
                Pair pairN = oZ.j.n();
                String str = (String) pairN.component1();
                String str2 = (String) pairN.component2();
                zKN = Trace.KN();
                if (zKN) {
                    Trace.t("[custom] " + str + "." + str2);
                }
                try {
                    fuX fux = this.f72315t;
                    ml2.f72324n = this;
                    num2 = num;
                    ml2.f72327t = num2;
                    i3 = i2;
                    ml2.J2 = i3;
                    j3 = j2;
                    ml2.f72325o = j3;
                    ml2.f72322Z = zKN;
                    ml2.E2 = 1;
                    objRl = fux.rl(ml2);
                    if (objRl == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    s4Var = this;
                } catch (Throwable th) {
                    th = th;
                    coroutine_suspended = zKN;
                    if (coroutine_suspended != 0) {
                    }
                    throw th;
                }
            } else {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            boolean z7 = ml2.f72322Z;
                            s4Var2 = (s4) ml2.f72324n;
                            ResultKt.throwOnFailure(objRl);
                            z5 = z7;
                            w6Var = (x0X.n) objRl;
                            coroutine_suspended = z5;
                            GJW.C.nr(s4Var2.Uo, null, null, s4Var2.new I28(w6Var, null), 3, null);
                            if (coroutine_suspended != 0) {
                            }
                            return w6Var;
                        }
                        if (i9 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z9 = ml2.f72322Z;
                        s4Var2 = (s4) ml2.f72324n;
                        ResultKt.throwOnFailure(objRl);
                        z6 = z9;
                        Intrinsics.checkNotNull(objRl);
                        w6Var = new n.w6((OracleResponse) objRl);
                        coroutine_suspended = z6;
                        GJW.C.nr(s4Var2.Uo, null, null, s4Var2.new I28(w6Var, null), 3, null);
                        if (coroutine_suspended != 0) {
                            Trace.J2();
                        }
                        return w6Var;
                    }
                    i7 = ml2.f72326r;
                    z4 = ml2.f72322Z;
                    j5 = ml2.f72325o;
                    i5 = ml2.J2;
                    duration = (Duration) ml2.f72320O;
                    num3 = (Integer) ml2.f72327t;
                    s4Var3 = (s4) ml2.f72324n;
                    try {
                        ResultKt.throwOnFailure(objRl);
                        Integer num4 = (Integer) objRl;
                        z2 = i7 <= (num4 == null ? num4.intValue() : -1);
                        long j7 = j5;
                        z3 = z4;
                        j4 = j7;
                        s4Var2 = s4Var3;
                        if (!z2 || duration == null) {
                            j6 = j4;
                        } else {
                            j6 = j4;
                            try {
                                if (Duration.m1651compareToLRDsOJo(duration.getRawValue(), s4Var2.f72314O.rl()) <= 0) {
                                    TFv.Wre response = s4Var2.f72315t.getResponse();
                                    ml2.f72324n = s4Var2;
                                    ml2.f72327t = null;
                                    ml2.f72320O = null;
                                    ml2.f72322Z = z3;
                                    ml2.E2 = 4;
                                    objRl = TFv.fuX.ViF(response, ml2);
                                    if (objRl != coroutine_suspended) {
                                        z6 = z3;
                                        Intrinsics.checkNotNull(objRl);
                                        w6Var = new n.w6((OracleResponse) objRl);
                                        coroutine_suspended = z6;
                                        GJW.C.nr(s4Var2.Uo, null, null, s4Var2.new I28(w6Var, null), 3, null);
                                        if (coroutine_suspended != 0) {
                                        }
                                        return w6Var;
                                    }
                                    return coroutine_suspended;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                coroutine_suspended = z3;
                                if (coroutine_suspended != 0) {
                                    Trace.J2();
                                }
                                throw th;
                            }
                        }
                        int iCoerceAtLeast = RangesKt.coerceAtLeast(i5, 1);
                        long rawValue = ((Duration) RangesKt.coerceAtLeast(Duration.m1650boximpl(j6), Duration.m1650boximpl(DurationKt.toDuration(0.5d, DurationUnit.SECONDS)))).getRawValue();
                        boolean z10 = duration != null;
                        Integer num5 = z2 ? num3 : null;
                        ml2.f72324n = s4Var2;
                        ml2.f72327t = null;
                        ml2.f72320O = null;
                        ml2.f72322Z = z3;
                        ml2.E2 = 3;
                        objRl = s4Var2.mUb(iCoerceAtLeast, rawValue, z10, num5, ml2);
                        if (objRl != coroutine_suspended) {
                            z5 = z3;
                            w6Var = (x0X.n) objRl;
                            coroutine_suspended = z5;
                            GJW.C.nr(s4Var2.Uo, null, null, s4Var2.new I28(w6Var, null), 3, null);
                            if (coroutine_suspended != 0) {
                            }
                            return w6Var;
                        }
                        return coroutine_suspended;
                    } catch (Throwable th3) {
                        th = th3;
                        coroutine_suspended = z4;
                        if (coroutine_suspended != 0) {
                        }
                        throw th;
                    }
                }
                boolean z11 = ml2.f72322Z;
                long j9 = ml2.f72325o;
                int i10 = ml2.J2;
                Integer num6 = (Integer) ml2.f72327t;
                s4Var = (s4) ml2.f72324n;
                try {
                    ResultKt.throwOnFailure(objRl);
                    zKN = z11;
                    num2 = num6;
                    j3 = j9;
                    i3 = i10;
                } catch (Throwable th4) {
                    th = th4;
                    coroutine_suspended = z11;
                    if (coroutine_suspended != 0) {
                    }
                    throw th;
                }
            }
            Duration duration2 = (Duration) objRl;
            if (num2 == null) {
                num3 = num2;
                j4 = j3;
                s4Var2 = s4Var;
                duration = duration2;
                i5 = i3;
                z2 = false;
                z3 = zKN;
                if (z2) {
                }
                j6 = j4;
                int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i5, 1);
                long rawValue2 = ((Duration) RangesKt.coerceAtLeast(Duration.m1650boximpl(j6), Duration.m1650boximpl(DurationKt.toDuration(0.5d, DurationUnit.SECONDS)))).getRawValue();
                if (duration != null) {
                }
                if (z2) {
                }
                ml2.f72324n = s4Var2;
                ml2.f72327t = null;
                ml2.f72320O = null;
                ml2.f72322Z = z3;
                ml2.E2 = 3;
                objRl = s4Var2.mUb(iCoerceAtLeast2, rawValue2, z10, num5, ml2);
                if (objRl != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            int iIntValue = num2.intValue();
            TFv.Wre wreNr = s4Var.f72315t.nr();
            ml2.f72324n = s4Var;
            ml2.f72327t = num2;
            ml2.f72320O = duration2;
            ml2.J2 = i3;
            ml2.f72325o = j3;
            ml2.f72322Z = zKN;
            ml2.f72326r = iIntValue;
            ml2.E2 = 2;
            Object objViF = TFv.fuX.ViF(wreNr, ml2);
            if (objViF != coroutine_suspended) {
                num3 = num2;
                i7 = iIntValue;
                i5 = i3;
                j5 = j3;
                z4 = zKN;
                s4Var3 = s4Var;
                duration = duration2;
                objRl = objViF;
                Integer num42 = (Integer) objRl;
                if (i7 <= (num42 == null ? num42.intValue() : -1)) {
                }
                long j72 = j5;
                z3 = z4;
                j4 = j72;
                s4Var2 = s4Var3;
                if (z2) {
                }
                j6 = j4;
                int iCoerceAtLeast22 = RangesKt.coerceAtLeast(i5, 1);
                long rawValue22 = ((Duration) RangesKt.coerceAtLeast(Duration.m1650boximpl(j6), Duration.m1650boximpl(DurationKt.toDuration(0.5d, DurationUnit.SECONDS)))).getRawValue();
                if (duration != null) {
                }
                if (z2) {
                }
                ml2.f72324n = s4Var2;
                ml2.f72327t = null;
                ml2.f72320O = null;
                ml2.f72322Z = z3;
                ml2.E2 = 3;
                objRl = s4Var2.mUb(iCoerceAtLeast22, rawValue22, z10, num5, ml2);
                if (objRl != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final TFv.Wre qie() {
        return this.mUb;
    }

    @Override // qu.I28
    public TFv.Wre rl() {
        return this.xMQ;
    }

    public /* synthetic */ s4(qu.Dsr dsr, fuX fux, rB.Ml ml, bH.CN3 cn3, I28.n nVar, GJW.lej lejVar, GJW.lej lejVar2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dsr, fux, ml, cn3, nVar, (i2 & 32) != 0 ? OU.t() : lejVar, (i2 & 64) != 0 ? OU.n() : lejVar2);
    }
}
