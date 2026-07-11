package st;

import GJW.C;
import GJW.Lu;
import GJW.vd;
import GJW.xuv;
import GJW.yg;
import com.bendingspoons.picox.network.models.NetworkException;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import st.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Wre implements st.j {
    private final v8.j J2;
    private final AtomicBoolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f73328O;
    private final vd Uo;
    private int gh;
    private SpD.Dsr mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final JR.j f73329n;
    private final long nr;
    private long qie;
    private final j0a.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f73330t;
    private xuv xMQ;

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f73331O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f73332n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f73333r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f73334t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f73331O = obj;
            this.f73333r |= Integer.MIN_VALUE;
            return Wre.this.qie(this);
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73336n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f73337t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String mUb() {
            return "Error while processing pending events.";
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = Wre.this.new n(continuation);
            nVar.f73337t = obj;
            return nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String gh(Exception exc) {
            return ExceptionsKt.stackTraceToString(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String qie(Wre wre) {
            return "Waiting for " + Duration.m1692toStringimpl(wre.qie);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[Catch: Exception -> 0x0026, CancellationException -> 0x0028, TRY_ENTER, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0028, Exception -> 0x0026, blocks: (B:19:0x0038, B:10:0x0022), top: B:32:0x0022 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0091 -> B:17:0x0032). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vd vdVar;
            long j2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73336n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        vdVar = (vd) this.f73337t;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vdVar = (vd) this.f73337t;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        v8.n.t(Wre.this.J2, new Function0() { // from class: st.CN3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Wre.n.mUb();
                            }
                        });
                        v8.n.t(Wre.this.J2, new Function0() { // from class: st.fuX
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Wre.n.gh(e3);
                            }
                        });
                    }
                    if (!Duration.m1657equalsimpl0(Wre.this.qie, Wre.this.f73330t)) {
                        v8.j jVar = Wre.this.J2;
                        final Wre wre = Wre.this;
                        v8.n.n(jVar, new Function0() { // from class: st.Dsr
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Wre.n.qie(wre);
                            }
                        });
                    }
                    j2 = Wre.this.qie;
                    this.f73337t = vdVar;
                    this.f73336n = 2;
                    if (yg.t(j2, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vdVar = (vd) this.f73337t;
            }
            if (!Lu.KN(vdVar)) {
                Wre wre2 = Wre.this;
                this.f73337t = vdVar;
                this.f73336n = 1;
                if (wre2.qie(this) != coroutine_suspended) {
                    if (!Duration.m1657equalsimpl0(Wre.this.qie, Wre.this.f73330t)) {
                    }
                    j2 = Wre.this.qie;
                    this.f73337t = vdVar;
                    this.f73336n = 2;
                    if (yg.t(j2, this) != coroutine_suspended) {
                        if (!Lu.KN(vdVar)) {
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            }
        }
    }

    public /* synthetic */ Wre(JR.j jVar, j0a.j jVar2, long j2, long j3, long j4, v8.j jVar3, vd vdVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, jVar2, j2, j3, j4, jVar3, vdVar);
    }

    private Wre(JR.j network, j0a.j persistence, long j2, long j3, long j4, v8.j localLogger, vd scope) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(persistence, "persistence");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f73329n = network;
        this.rl = persistence;
        this.f73330t = j2;
        this.nr = j3;
        this.f73328O = j4;
        this.J2 = localLogger;
        this.Uo = scope;
        this.KN = new AtomicBoolean(false);
        this.mUb = new SpD.Dsr(0, null);
        this.qie = j2;
    }

    private final long KN(int i2) {
        long rawValue = ((Duration) RangesKt.coerceAtMost(Duration.m1650boximpl(Duration.m1682timesUwyO8pc(this.nr, Math.pow(2.0d, ((double) RangesKt.coerceAtMost(i2, 64)) - ((double) 1)))), Duration.m1650boximpl(this.f73328O))).getRawValue();
        Random.Companion companion = Random.INSTANCE;
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        return DurationKt.toDuration(companion.nextDouble(0.0d, Duration.m1688toDoubleimpl(rawValue, durationUnit)), durationUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az() {
        return "Scheduler already started. Starting it again has no effect.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String gh(Wre wre, Exception exc) {
        return "Failed to upload events, will retry in " + Duration.m1692toStringimpl(wre.qie) + ": " + exc.getMessage();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object qie(Continuation continuation) {
        j jVar;
        Wre wre;
        final Wre wre2;
        final List list;
        final Exception e2;
        j0a.j jVar2;
        Wre wre3;
        final Exception exc;
        Wre wre4;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f73333r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f73333r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objRl = jVar.f73331O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f73333r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            j0a.j jVar3 = this.rl;
            jVar.f73332n = this;
            jVar.f73333r = 1;
            objRl = jVar3.rl(jVar);
            if (objRl != coroutine_suspended) {
                wre = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    exc = (Exception) jVar.f73334t;
                    wre4 = (Wre) jVar.f73332n;
                    ResultKt.throwOnFailure(objRl);
                    v8.n.Uo(wre4.J2, new Function0() { // from class: st.Ml
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Wre.mUb(exc);
                        }
                    });
                    return Unit.INSTANCE;
                }
                list = (List) jVar.f73334t;
                wre3 = (Wre) jVar.f73332n;
                try {
                    ResultKt.throwOnFailure(objRl);
                    v8.n.n(wre3.J2, new Function0() { // from class: st.w6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Wre.xMQ(list);
                        }
                    });
                } catch (Exception e3) {
                    e2 = e3;
                    wre2 = wre3;
                    if (!(e2 instanceof NetworkException)) {
                    }
                    wre2.qie = wre2.KN(wre2.gh);
                    v8.n.t(wre2.J2, new Function0() { // from class: st.I28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Wre.gh(this.f73325n, e2);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            list = (List) jVar.f73334t;
            wre2 = (Wre) jVar.f73332n;
            try {
                ResultKt.throwOnFailure(objRl);
                wre2.mUb = (SpD.Dsr) objRl;
                wre2.qie = wre2.f73330t;
                wre2.gh = 0;
                jVar2 = wre2.rl;
                jVar.f73332n = wre2;
                jVar.f73334t = list;
                jVar.f73333r = 3;
            } catch (Exception e4) {
                e2 = e4;
                if (!(e2 instanceof NetworkException)) {
                }
                wre2.qie = wre2.KN(wre2.gh);
                v8.n.t(wre2.J2, new Function0() { // from class: st.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.gh(this.f73325n, e2);
                    }
                });
            }
            if (jVar2.n(list, jVar) != coroutine_suspended) {
                wre3 = wre2;
                v8.n.n(wre3.J2, new Function0() { // from class: st.w6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Wre.xMQ(list);
                    }
                });
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }
        wre = (Wre) jVar.f73332n;
        ResultKt.throwOnFailure(objRl);
        List list2 = (List) objRl;
        if (list2.isEmpty()) {
            wre.qie = wre.f73330t;
            return Unit.INSTANCE;
        }
        wre.gh++;
        try {
            JR.j jVar4 = wre.f73329n;
            SpD.Dsr dsr = wre.mUb;
            jVar.f73332n = wre;
            jVar.f73334t = list2;
            jVar.f73333r = 2;
            Object objN = jVar4.n(list2, dsr, jVar);
            if (objN != coroutine_suspended) {
                Wre wre5 = wre;
                list = list2;
                objRl = objN;
                wre2 = wre5;
                wre2.mUb = (SpD.Dsr) objRl;
                wre2.qie = wre2.f73330t;
                wre2.gh = 0;
                jVar2 = wre2.rl;
                jVar.f73332n = wre2;
                jVar.f73334t = list;
                jVar.f73333r = 3;
                if (jVar2.n(list, jVar) != coroutine_suspended) {
                }
            }
        } catch (Exception e5) {
            wre2 = wre;
            list = list2;
            e2 = e5;
            if (!(e2 instanceof NetworkException) && aC.f73338n.contains(((NetworkException) e2).getError())) {
                wre2.qie = wre2.f73330t;
                wre2.gh = 0;
                j0a.j jVar5 = wre2.rl;
                jVar.f73332n = wre2;
                jVar.f73334t = e2;
                jVar.f73333r = 4;
                if (jVar5.n(list, jVar) != coroutine_suspended) {
                    exc = e2;
                    wre4 = wre2;
                    v8.n.Uo(wre4.J2, new Function0() { // from class: st.Ml
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Wre.mUb(exc);
                        }
                    });
                }
                return coroutine_suspended;
            }
            wre2.qie = wre2.KN(wre2.gh);
            v8.n.t(wre2.J2, new Function0() { // from class: st.I28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wre.gh(this.f73325n, e2);
                }
            });
        }
        return coroutine_suspended;
    }

    @Override // st.j
    public void start() {
        if (this.KN.getAndSet(true)) {
            v8.n.Uo(this.J2, new Function0() { // from class: st.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Wre.az();
                }
            });
        } else {
            this.xMQ = C.nr(this.Uo, null, null, new n(null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb(Exception exc) {
        return "Client error while uploading events, removing them: " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String xMQ(List list) {
        return "Successfully uploaded " + list.size() + " events.";
    }
}
