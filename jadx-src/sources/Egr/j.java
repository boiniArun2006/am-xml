package Egr;

import GJW.C;
import GJW.Lu;
import GJW.vd;
import GJW.xuv;
import GJW.yg;
import Gw.C1369j;
import TFv.fuX;
import com.bendingspoons.pico.domain.entities.PicoEvent;
import com.bendingspoons.pico.domain.internal.PicoBaseInfo;
import java.util.Date;
import juU.Ml;
import juU.w6;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lt.InterfaceC2271j;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class j implements juU.w6 {
    public static final C0083j qie = new C0083j(null);
    private final yB.j J2;
    private GUx.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f2335O;
    private final vd Uo;
    private w6.n gh;
    private xuv mUb;
    private final Function0 nr;
    private final He.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC2271j f2336t;
    private xuv xMQ;

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ j f2337O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2338n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ juU.Ml f2339t;

        /* JADX INFO: renamed from: Egr.j$CN3$j, reason: collision with other inner class name */
        static final class C0081j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ j f2340n;

            /* JADX INFO: renamed from: Egr.j$CN3$j$j, reason: collision with other inner class name */
            public /* synthetic */ class C0082j {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Ml.j.values().length];
                    try {
                        iArr[Ml.j.f69627n.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Ml.j.f69628t.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            C0081j(j jVar) {
                this.f2340n = jVar;
            }

            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(Ml.j jVar, Continuation continuation) {
                int i2 = C0082j.$EnumSwitchMapping$0[jVar.ordinal()];
                if (i2 == 1) {
                    Object objAz = this.f2340n.az(continuation);
                    return objAz == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAz : Unit.INSTANCE;
                }
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objQie = this.f2340n.qie(continuation);
                return objQie == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQie : Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(juU.Ml ml, j jVar, Continuation continuation) {
            super(2, continuation);
            this.f2339t = ml;
            this.f2337O = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new CN3(this.f2339t, this.f2337O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2338n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreIk = fuX.Ik(this.f2339t.n());
                C0081j c0081j = new C0081j(this.f2337O);
                this.f2338n = 1;
                if (wreIk.n(c0081j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class I28 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f2341O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2342n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f2343r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f2344t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2341O = obj;
            this.f2343r |= Integer.MIN_VALUE;
            return j.this.az(this);
        }
    }

    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f2345O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2346n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f2347r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f2348t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2345O = obj;
            this.f2347r |= Integer.MIN_VALUE;
            return j.this.qie(this);
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f2349n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Wre(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new Wre(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        
            if (r8 == r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0032 -> B:11:0x0021). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            GUx.j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f2349n;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        this.f2349n = 1;
                        if (yg.rl(1000L, this) != coroutine_suspended) {
                            jVar = j.this.KN;
                            if (jVar != null) {
                                this.f2349n = 1;
                                if (yg.rl(1000L, this) != coroutine_suspended) {
                                }
                            } else {
                                j jVar2 = j.this;
                                He.j jVar3 = jVar2.rl;
                                double dGh = jVar2.gh(jVar.rl());
                                this.f2349n = 2;
                                obj = jVar3.t(dGh, this);
                            }
                        }
                        return coroutine_suspended;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                jVar = j.this.KN;
                if (jVar != null) {
                }
                return coroutine_suspended;
            }
            ResultKt.throwOnFailure(obj);
            this.f2349n = 1;
            if (yg.rl(1000L, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: renamed from: Egr.j$j, reason: collision with other inner class name */
    public static final class C0083j {
        public /* synthetic */ C0083j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0083j() {
        }
    }

    static final class n extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f2351O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f2352n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f2353o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f2355t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f2353o |= Integer.MIN_VALUE;
            return j.this.mUb(this);
        }
    }

    static final class w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f2356O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f2357n;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f2357n = obj;
            this.f2356O |= Integer.MIN_VALUE;
            return j.this.t(this);
        }
    }

    public j(He.j sessionRepository, InterfaceC2271j crashManager, Function0 currentDateProvider, sJa.Ml dispatcherProvider) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(crashManager, "crashManager");
        Intrinsics.checkNotNullParameter(currentDateProvider, "currentDateProvider");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.rl = sessionRepository;
        this.f2336t = crashManager;
        this.nr = currentDateProvider;
        this.J2 = yB.CN3.rl(false, 1, null);
        this.Uo = Lu.n(dispatcherProvider.t());
        crashManager.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v5, types: [yB.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object az(Continuation continuation) {
        I28 i28;
        j jVar;
        yB.j jVar2;
        j jVar3;
        He.j jVar4;
        String id$pico_release;
        PicoEvent picoEvent;
        j jVar5;
        yB.j jVar6;
        w6.n nVar;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f2343r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f2343r = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object obj = i28.f2341O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = i28.f2343r;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(obj);
                yB.j jVar7 = this.J2;
                i28.f2342n = this;
                i28.f2344t = jVar7;
                i28.f2343r = 1;
                if (jVar7.Z(null, i28) != coroutine_suspended) {
                    jVar = this;
                    jVar2 = jVar7;
                }
                return coroutine_suspended;
            }
            if (r2 != 1) {
                if (r2 != 2) {
                    if (r2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    picoEvent = (PicoEvent) i28.f2344t;
                    jVar5 = (j) i28.f2342n;
                    ResultKt.throwOnFailure(obj);
                    nVar = jVar5.gh;
                    if (nVar != null) {
                        nVar.n(picoEvent);
                    }
                    jVar5.KN = new GUx.j(picoEvent.getId$pico_release(), (Date) jVar5.nr.invoke());
                    jVar5.mUb = C.nr(jVar5.Uo, null, null, jVar5.new Wre(null), 3, null);
                    return Unit.INSTANCE;
                }
                yB.j jVar8 = (yB.j) i28.f2344t;
                jVar3 = (j) i28.f2342n;
                ResultKt.throwOnFailure(obj);
                jVar6 = jVar8;
                jVar3.f2335O = true;
                r2 = jVar6;
                Unit unit = Unit.INSTANCE;
                r2.T(null);
                PicoEvent picoEventRl = PicoEvent.INSTANCE.rl(C1369j.f3786O.t());
                jVar4 = jVar3.rl;
                id$pico_release = picoEventRl.getId$pico_release();
                i28.f2342n = jVar3;
                i28.f2344t = picoEventRl;
                i28.f2343r = 3;
                if (jVar4.n(id$pico_release, i28) != coroutine_suspended) {
                    picoEvent = picoEventRl;
                    jVar5 = jVar3;
                    nVar = jVar5.gh;
                    if (nVar != null) {
                    }
                    jVar5.KN = new GUx.j(picoEvent.getId$pico_release(), (Date) jVar5.nr.invoke());
                    jVar5.mUb = C.nr(jVar5.Uo, null, null, jVar5.new Wre(null), 3, null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            yB.j jVar9 = (yB.j) i28.f2344t;
            jVar = (j) i28.f2342n;
            ResultKt.throwOnFailure(obj);
            jVar2 = jVar9;
            if (jVar.f2335O) {
                jVar3 = jVar;
                r2 = jVar2;
                Unit unit2 = Unit.INSTANCE;
                r2.T(null);
                PicoEvent picoEventRl2 = PicoEvent.INSTANCE.rl(C1369j.f3786O.t());
                jVar4 = jVar3.rl;
                id$pico_release = picoEventRl2.getId$pico_release();
                i28.f2342n = jVar3;
                i28.f2344t = picoEventRl2;
                i28.f2343r = 3;
                if (jVar4.n(id$pico_release, i28) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            i28.f2342n = jVar;
            i28.f2344t = jVar2;
            i28.f2343r = 2;
            if (jVar.mUb(i28) == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar3 = jVar;
            jVar6 = jVar2;
            jVar3.f2335O = true;
            r2 = jVar6;
            Unit unit22 = Unit.INSTANCE;
            r2.T(null);
            PicoEvent picoEventRl22 = PicoEvent.INSTANCE.rl(C1369j.f3786O.t());
            jVar4 = jVar3.rl;
            id$pico_release = picoEventRl22.getId$pico_release();
            i28.f2342n = jVar3;
            i28.f2344t = picoEventRl22;
            i28.f2343r = 3;
            if (jVar4.n(id$pico_release, i28) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            r2.T(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double gh(Date date) {
        return (((Date) this.nr.invoke()).getTime() - date.getTime()) / 1000.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        if (r11.nr(r0) != r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mUb(Continuation continuation) {
        n nVar;
        j jVar;
        GUx.n nVar2;
        x0X.n nVar3;
        w6.n nVar4;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f2353o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f2353o = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objRl = nVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f2353o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            He.j jVar2 = this.rl;
            nVar.f2352n = this;
            nVar.f2353o = 1;
            objRl = jVar2.rl(nVar);
            if (objRl != coroutine_suspended) {
                jVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            j jVar3 = (j) nVar.f2352n;
            ResultKt.throwOnFailure(objRl);
            jVar = jVar3;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRl);
                return Unit.INSTANCE;
            }
            nVar2 = (GUx.n) nVar.f2351O;
            nVar3 = (x0X.n) nVar.f2355t;
            jVar = (j) nVar.f2352n;
            ResultKt.throwOnFailure(objRl);
            C1369j c1369jN = !Intrinsics.areEqual(x0X.w6.nr((x0X.n) objRl), Boxing.boxBoolean(true)) ? C1369j.f3786O.n(nVar2.t(), nVar2.n()) : C1369j.f3786O.rl(nVar2.t(), nVar2.n());
            nVar4 = jVar.gh;
            if (nVar4 != null) {
                nVar4.n(PicoEvent.INSTANCE.rl(c1369jN));
            }
            He.j jVar4 = jVar.rl;
            nVar.f2352n = nVar3;
            nVar.f2355t = null;
            nVar.f2351O = null;
            nVar.f2353o = 3;
        }
        x0X.n nVar5 = (x0X.n) objRl;
        if (!(nVar5 instanceof n.C1266n)) {
            if (!(nVar5 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            nVar2 = (GUx.n) ((n.w6) nVar5).n();
            if (nVar2 != null && !nVar2.rl()) {
                InterfaceC2271j interfaceC2271j = jVar.f2336t;
                nVar.f2352n = jVar;
                nVar.f2355t = nVar5;
                nVar.f2351O = nVar2;
                nVar.f2353o = 2;
                Object objRl2 = interfaceC2271j.rl(nVar);
                if (objRl2 != coroutine_suspended) {
                    nVar3 = nVar5;
                    objRl = objRl2;
                    if (!Intrinsics.areEqual(x0X.w6.nr((x0X.n) objRl), Boxing.boxBoolean(true))) {
                    }
                    nVar4 = jVar.gh;
                    if (nVar4 != null) {
                    }
                    He.j jVar42 = jVar.rl;
                    nVar.f2352n = nVar3;
                    nVar.f2355t = null;
                    nVar.f2351O = null;
                    nVar.f2353o = 3;
                }
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (GJW.AbstractC1363t.Uo(r12, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object qie(Continuation continuation) {
        Ml ml;
        GUx.j jVar;
        j jVar2;
        j jVar3;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f2347r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f2347r = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object obj = ml.f2345O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f2347r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            jVar = this.KN;
            if (jVar != null) {
                xuv xuvVar = this.mUb;
                if (xuvVar != null) {
                    ml.f2346n = this;
                    ml.f2348t = jVar;
                    ml.f2347r = 1;
                }
                jVar2 = this;
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar3 = (j) ml.f2346n;
            ResultKt.throwOnFailure(obj);
            jVar3.KN = null;
            return Unit.INSTANCE;
        }
        jVar = (GUx.j) ml.f2348t;
        jVar2 = (j) ml.f2346n;
        ResultKt.throwOnFailure(obj);
        jVar2.mUb = null;
        w6.n nVar = jVar2.gh;
        if (nVar != null) {
            nVar.n(PicoEvent.INSTANCE.rl(C1369j.f3786O.rl(jVar.n(), jVar2.gh(jVar.rl()))));
        }
        He.j jVar4 = jVar2.rl;
        ml.f2346n = jVar2;
        ml.f2348t = null;
        ml.f2347r = 2;
        if (jVar4.nr(ml) != coroutine_suspended) {
            jVar3 = jVar2;
            jVar3.KN = null;
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @Override // juU.w6
    public void n(juU.Ml sessionProvider) {
        Intrinsics.checkNotNullParameter(sessionProvider, "sessionProvider");
        xuv xuvVar = this.xMQ;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        this.xMQ = C.nr(this.Uo, null, null, new CN3(sessionProvider, this, null), 3, null);
    }

    @Override // juU.w6
    public void rl(w6.n sessionLogger) {
        Intrinsics.checkNotNullParameter(sessionLogger, "sessionLogger");
        this.gh = sessionLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // juU.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Continuation continuation) {
        w6 w6Var;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f2356O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f2356O = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objRl = w6Var.f2357n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f2356O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            GUx.j jVar = this.KN;
            if (jVar != null) {
                return new n.w6(PicoBaseInfo.Session.INSTANCE.n(jVar.n(), gh(jVar.rl())));
            }
            He.j jVar2 = this.rl;
            w6Var.f2356O = 1;
            objRl = jVar2.rl(w6Var);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRl);
        }
        x0X.n nVar = (x0X.n) objRl;
        if (nVar instanceof n.C1266n) {
            return nVar;
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        GUx.n nVar2 = (GUx.n) ((n.w6) nVar).n();
        return new n.w6(nVar2 != null ? PicoBaseInfo.Session.INSTANCE.rl(nVar2.t()) : PicoBaseInfo.Session.INSTANCE.t());
    }
}
