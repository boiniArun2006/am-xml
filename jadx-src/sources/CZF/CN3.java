package CZF;

import CZF.I28;
import GJW.C;
import GJW.vd;
import ILs.aC;
import TFv.Lu;
import TFv.SPz;
import ajd.j;
import com.bendingspoons.pico.domain.entities.PicoEvent;
import com.bendingspoons.pico.domain.entities.additionalInfo.pico.PicoAdditionalInfo;
import com.bendingspoons.pico.domain.internal.PicoBaseInfo;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class CN3 implements CZF.I28 {
    public static final w6 Ik = new w6(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final List f938r = CollectionsKt.listOf((Object[]) new String[]{"privacy_settings_displayed", "privacy_settings_cancel", "privacy_settings_done", "privacy_settings_accept_all", "privacy_settings_deny", "privacy_banner_displayed", "privacy_banner_closed", "privacy_banner_accept_all", "privacy_banner_customize", "privacy_settings_updated", "first_party_analytics_disabled"});
    private boolean HI;
    private final vd5.j J2;
    private final rB.Ml KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final com.bendingspoons.pico.domain.entities.additionalInfo.pico.j f939O;
    private final v8.j Uo;
    private List az;
    private boolean ck;
    private final vd gh;
    private final ILs.CN3 mUb;
    private final Function0 nr;
    private List qie;
    private final La.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final juU.w6 f940t;
    private final List ty;
    private SPz xMQ;

    static final class I28 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f942n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f943t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f943t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return CN3.this.rl(this);
        }
    }

    static final class Ml extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f944O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f945Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f946n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f948r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f949t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f948r = obj;
            this.f945Z |= Integer.MIN_VALUE;
            return CN3.this.KN(this);
        }
    }

    static final class Wre extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f950O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f951S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f953n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f954o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        double f955r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f956t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f954o = obj;
            this.f951S |= Integer.MIN_VALUE;
            return CN3.this.Ik(null, 0.0d, this);
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f957O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f958n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f959t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: CZF.CN3$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C0026j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[I28.w6.values().length];
                try {
                    iArr[I28.w6.J2.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[I28.w6.f989r.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[I28.w6.f985O.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CN3.this.new j(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
        
            if (r10.n(r1, r9) == r0) goto L39;
         */
        /* JADX WARN: Path cross not found for [B:13:0x0030, B:20:0x0061], limit reached: 40 */
        /* JADX WARN: Path cross not found for [B:27:0x0080, B:21:0x0063], limit reached: 40 */
        /* JADX WARN: Path cross not found for [B:30:0x0095, B:18:0x004b], limit reached: 40 */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[PHI: r10
          0x0045: PHI (r10v1 java.lang.Object) = (r10v18 java.lang.Object), (r10v0 java.lang.Object) binds: [B:14:0x0041, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:13:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0077 -> B:13:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0092 -> B:13:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0099 -> B:13:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bd -> B:13:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00cd -> B:40:0x00d0). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            n nVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f957O;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        if (i2 == 4) {
                            I28.w6 w6VarN = (I28.w6) this.f959t;
                            CN3 cn3 = (CN3) this.f958n;
                            ResultKt.throwOnFailure(obj);
                            cn3.xMQ.setValue(w6VarN);
                            ILs.CN3 cn32 = CN3.this.mUb;
                            this.f958n = null;
                            this.f959t = null;
                            this.f957O = 1;
                            obj = cn32.KN(this);
                            if (obj != coroutine_suspended) {
                                nVar = (n) obj;
                                if (nVar instanceof n.w6) {
                                    int i3 = C0026j.$EnumSwitchMapping$0[((I28.w6) CN3.this.xMQ.getValue()).ordinal()];
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            if (i3 == 3) {
                                                CN3 cn33 = CN3.this;
                                                n.w6 w6Var = (n.w6) nVar;
                                                PicoEvent picoEventN = w6Var.n();
                                                double dRl = w6Var.rl();
                                                this.f957O = 3;
                                                if (cn33.Ik(picoEventN, dRl, this) != coroutine_suspended) {
                                                }
                                            } else {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                        } else {
                                            CN3 cn34 = CN3.this;
                                            n.w6 w6Var2 = (n.w6) nVar;
                                            PicoEvent picoEventN2 = w6Var2.n();
                                            double dRl2 = w6Var2.rl();
                                            this.f957O = 2;
                                            if (cn34.Ik(picoEventN2, dRl2, this) != coroutine_suspended) {
                                            }
                                        }
                                    }
                                    ILs.CN3 cn322 = CN3.this.mUb;
                                    this.f958n = null;
                                    this.f959t = null;
                                    this.f957O = 1;
                                    obj = cn322.KN(this);
                                    if (obj != coroutine_suspended) {
                                    }
                                } else {
                                    if (nVar instanceof n.C0027n) {
                                        CN3.this.ty.add(((n.C0027n) nVar).n());
                                    } else if (nVar instanceof n.j) {
                                        w6VarN = ((n.j) nVar).n();
                                        cn3 = CN3.this;
                                        if (cn3.xMQ.getValue() != w6VarN) {
                                            La.Ml ml = cn3.rl;
                                            this.f958n = cn3;
                                            this.f959t = w6VarN;
                                            this.f957O = 4;
                                        }
                                    } else {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ILs.CN3 cn3222 = CN3.this.mUb;
                                    this.f958n = null;
                                    this.f959t = null;
                                    this.f957O = 1;
                                    obj = cn3222.KN(this);
                                    if (obj != coroutine_suspended) {
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    nVar = (n) obj;
                    if (nVar instanceof n.w6) {
                    }
                }
            }
            ResultKt.throwOnFailure(obj);
            ILs.CN3 cn32222 = CN3.this.mUb;
            this.f958n = null;
            this.f959t = null;
            this.f957O = 1;
            obj = cn32222.KN(this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }

    private static abstract class n {

        public static final class j extends n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final I28.w6 f960n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(I28.w6 state) {
                super(null);
                Intrinsics.checkNotNullParameter(state, "state");
                this.f960n = state;
            }

            public final I28.w6 n() {
                return this.f960n;
            }
        }

        /* JADX INFO: renamed from: CZF.CN3$n$n, reason: collision with other inner class name */
        public static final class C0027n extends n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final AR.w6 f961n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0027n(AR.w6 userAdditionalInfoProvider) {
                super(null);
                Intrinsics.checkNotNullParameter(userAdditionalInfoProvider, "userAdditionalInfoProvider");
                this.f961n = userAdditionalInfoProvider;
            }

            public final AR.w6 n() {
                return this.f961n;
            }
        }

        public static final class w6 extends n {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final PicoEvent f962n;
            private final double rl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public w6(PicoEvent event, double d2) {
                super(null);
                Intrinsics.checkNotNullParameter(event, "event");
                this.f962n = event;
                this.rl = d2;
            }

            public final PicoEvent n() {
                return this.f962n;
            }

            public final double rl() {
                return this.rl;
            }
        }

        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    public static final class w6 {
        public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private w6() {
        }
    }

    public CN3(La.Ml picoEventManager, juU.w6 sessionManager, Function0 currentDateProvider, com.bendingspoons.pico.domain.entities.additionalInfo.pico.j picoAdditionalInfoProvider, vd5.j trackingSettingsRepository, rB.Ml spiderSense, sJa.Ml dispatcherProvider, v8.j localLogger) {
        Intrinsics.checkNotNullParameter(picoEventManager, "picoEventManager");
        Intrinsics.checkNotNullParameter(sessionManager, "sessionManager");
        Intrinsics.checkNotNullParameter(currentDateProvider, "currentDateProvider");
        Intrinsics.checkNotNullParameter(picoAdditionalInfoProvider, "picoAdditionalInfoProvider");
        Intrinsics.checkNotNullParameter(trackingSettingsRepository, "trackingSettingsRepository");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        this.rl = picoEventManager;
        this.f940t = sessionManager;
        this.nr = currentDateProvider;
        this.f939O = picoAdditionalInfoProvider;
        this.J2 = trackingSettingsRepository;
        this.Uo = localLogger;
        this.KN = d3.j.nr(spiderSense, "actor");
        this.xMQ = Lu.n(I28.w6.f987n.n());
        this.mUb = aC.rl(Integer.MAX_VALUE, null, null, 6, null);
        vd vdVarN = GJW.Lu.n(dispatcherProvider.t());
        this.gh = vdVarN;
        this.qie = CollectionsKt.emptyList();
        this.az = CollectionsKt.emptyList();
        this.ty = new ArrayList();
        this.HI = trackingSettingsRepository.n();
        this.ck = trackingSettingsRepository.t();
        C.nr(vdVarN, null, null, new j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014f, code lost:
    
        if (r1.rl(r9, r2) != r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ik(PicoEvent picoEvent, double d2, Continuation continuation) {
        Wre wre;
        PicoEvent picoEvent2;
        double d4;
        CN3 cn3;
        PicoBaseInfo picoBaseInfo;
        CN3 cn32;
        x0X.n nVar;
        PicoEvent picoEvent3;
        PicoAdditionalInfo picoAdditionalInfo;
        PicoBaseInfo picoBaseInfo2;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.f951S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.f951S = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object objT = wre.f954o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.f951S;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objT);
            juU.w6 w6Var = this.f940t;
            wre.f953n = this;
            picoEvent2 = picoEvent;
            wre.f956t = picoEvent2;
            wre.f955r = d2;
            wre.f951S = 1;
            objT = w6Var.t(wre);
            if (objT != coroutine_suspended) {
                d4 = d2;
                cn3 = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            d4 = wre.f955r;
            picoEvent2 = (PicoEvent) wre.f956t;
            cn3 = (CN3) wre.f953n;
            ResultKt.throwOnFailure(objT);
        } else {
            if (i3 == 2) {
                PicoBaseInfo picoBaseInfo3 = (PicoBaseInfo) wre.f950O;
                PicoEvent picoEvent4 = (PicoEvent) wre.f956t;
                CN3 cn33 = (CN3) wre.f953n;
                ResultKt.throwOnFailure(objT);
                picoBaseInfo = picoBaseInfo3;
                picoEvent2 = picoEvent4;
                cn32 = cn33;
                nVar = (x0X.n) objT;
                if (!(nVar instanceof n.C1266n)) {
                    rB.I28.rl(cn32.KN, CollectionsKt.listOf((Object[]) new String[]{MRAIDPresenter.ERROR, "additionalInfo"}), j.EnumC0481j.f13104r, "Unable to retrieve Pico additional info.", null, ((WN.j) ((n.C1266n) nVar).n()).n(), 8, null);
                    return Unit.INSTANCE;
                }
                if (!(nVar instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                PicoAdditionalInfo picoAdditionalInfo2 = (PicoAdditionalInfo) ((n.w6) nVar).n();
                wre.f953n = cn32;
                wre.f956t = picoEvent2;
                wre.f950O = picoBaseInfo;
                wre.J2 = picoAdditionalInfo2;
                wre.f951S = 3;
                Object objKN = cn32.KN(wre);
                if (objKN != coroutine_suspended) {
                    picoEvent3 = picoEvent2;
                    picoAdditionalInfo = picoAdditionalInfo2;
                    objT = objKN;
                    picoBaseInfo2 = picoBaseInfo;
                    QAv.j jVar = new QAv.j(picoEvent3, picoBaseInfo2, picoAdditionalInfo, ((pq.Ml) objT).n());
                    La.Ml ml = cn32.rl;
                    wre.f953n = null;
                    wre.f956t = null;
                    wre.f950O = null;
                    wre.J2 = null;
                    wre.f951S = 4;
                }
                return coroutine_suspended;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objT);
                return Unit.INSTANCE;
            }
            picoAdditionalInfo = (PicoAdditionalInfo) wre.J2;
            picoBaseInfo2 = (PicoBaseInfo) wre.f950O;
            picoEvent3 = (PicoEvent) wre.f956t;
            cn32 = (CN3) wre.f953n;
            ResultKt.throwOnFailure(objT);
            QAv.j jVar2 = new QAv.j(picoEvent3, picoBaseInfo2, picoAdditionalInfo, ((pq.Ml) objT).n());
            La.Ml ml2 = cn32.rl;
            wre.f953n = null;
            wre.f956t = null;
            wre.f950O = null;
            wre.J2 = null;
            wre.f951S = 4;
        }
        x0X.n nVar2 = (x0X.n) objT;
        if (nVar2 instanceof n.C1266n) {
            rB.I28.rl(cn3.KN, CollectionsKt.listOf((Object[]) new String[]{MRAIDPresenter.ERROR, "sessionInfo"}), j.EnumC0481j.f13104r, "Unable to retrieve Pico base info.", null, ((WN.j) ((n.C1266n) nVar2).n()).n(), 8, null);
            return Unit.INSTANCE;
        }
        if (!(nVar2 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        picoBaseInfo = new PicoBaseInfo(d4, (PicoBaseInfo.Session) ((n.w6) nVar2).n());
        com.bendingspoons.pico.domain.entities.additionalInfo.pico.j jVar3 = cn3.f939O;
        wre.f953n = cn3;
        wre.f956t = picoEvent2;
        wre.f950O = picoBaseInfo;
        wre.f951S = 2;
        objT = com.bendingspoons.pico.domain.entities.additionalInfo.pico.w6.rl(jVar3, wre);
        if (objT != coroutine_suspended) {
            cn32 = cn3;
            nVar = (x0X.n) objT;
            if (!(nVar instanceof n.C1266n)) {
            }
        }
        return coroutine_suspended;
    }

    private final pq.Ml Z(List list) {
        pq.Ml ml = new pq.Ml();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ml.xMQ((pq.Ml) it.next());
        }
        return ml;
    }

    @Override // CZF.I28
    public void J2(AR.w6 userAdditionalInfoProvider) {
        Intrinsics.checkNotNullParameter(userAdditionalInfoProvider, "userAdditionalInfoProvider");
        this.mUb.nr(new n.C0027n(userAdditionalInfoProvider));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0071 -> B:20:0x0074). Please report as a decompilation issue!!! */
    @Override // CZF.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KN(Continuation continuation) {
        Ml ml;
        CN3 cn3;
        Iterator it;
        Collection collection;
        CN3 cn32;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f945Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f945Z = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objN = ml.f948r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f945Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            List list = this.ty;
            ArrayList arrayList = new ArrayList();
            cn3 = this;
            it = list.iterator();
            collection = arrayList;
            cn32 = cn3;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn32 = (CN3) ml.J2;
            it = (Iterator) ml.f944O;
            collection = (Collection) ml.f949t;
            cn3 = (CN3) ml.f946n;
            ResultKt.throwOnFailure(objN);
            x0X.n nVar = (x0X.n) objN;
            if (nVar instanceof n.C1266n) {
                rB.I28.rl(cn3.KN, CollectionsKt.listOf((Object[]) new String[]{"userAdditionalInfo", "exceptionThrown"}), j.EnumC0481j.f13105t, "Unable to retrieve Pico user additional info.", null, ((WN.j) ((n.C1266n) nVar).n()).n(), 8, null);
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            pq.Ml ml2 = (pq.Ml) x0X.w6.nr(nVar);
            if (ml2 != null) {
                collection.add(ml2);
            }
            if (it.hasNext()) {
                AR.w6 w6Var = (AR.w6) it.next();
                ml.f946n = cn3;
                ml.f949t = collection;
                ml.f944O = it;
                ml.J2 = cn32;
                ml.f945Z = 1;
                objN = AR.Ml.n(w6Var, ml);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                x0X.n nVar2 = (x0X.n) objN;
                if (nVar2 instanceof n.C1266n) {
                }
                pq.Ml ml22 = (pq.Ml) x0X.w6.nr(nVar2);
                if (ml22 != null) {
                }
                if (it.hasNext()) {
                    return cn32.Z((List) collection);
                }
            }
        }
    }

    @Override // CZF.I28
    public void O(boolean z2) {
        this.J2.rl(z2);
        this.ck = z2;
    }

    @Override // CZF.I28
    public void Uo(List actionKinds) {
        Intrinsics.checkNotNullParameter(actionKinds, "actionKinds");
        this.qie = actionKinds;
    }

    public boolean ck() {
        return this.HI;
    }

    @Override // CZF.I28
    public void n(final PicoEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (o(event)) {
            this.mUb.nr(new n.w6(event, ((Date) this.nr.invoke()).getTime() / 1000.0d));
            v8.n.n(this.Uo, new Function0() { // from class: CZF.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CN3.XQ(event);
                }
            });
        }
    }

    @Override // CZF.I28
    public void nr(List actionKinds) {
        Intrinsics.checkNotNullParameter(actionKinds, "actionKinds");
        this.az = actionKinds;
    }

    public void r(I28.w6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.mUb.nr(new n.j(state));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // CZF.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Continuation continuation) {
        I28 i28;
        CN3 cn3;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.J2 = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objRl = i28.f943t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objRl);
            com.bendingspoons.pico.domain.entities.additionalInfo.pico.j jVar = this.f939O;
            i28.f942n = this;
            i28.J2 = 1;
            objRl = com.bendingspoons.pico.domain.entities.additionalInfo.pico.w6.rl(jVar, i28);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
            cn3 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cn3 = (CN3) i28.f942n;
            ResultKt.throwOnFailure(objRl);
        }
        x0X.n w6Var = (x0X.n) objRl;
        boolean z2 = w6Var instanceof n.C1266n;
        if (z2) {
            rB.I28.rl(cn3.KN, CollectionsKt.listOf((Object[]) new String[]{MRAIDPresenter.ERROR, "additionalInfo"}), j.EnumC0481j.f13104r, "Unable to retrieve Pico additional info.", null, ((WN.j) ((n.C1266n) w6Var).n()).n(), 8, null);
        } else if (!(w6Var instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z2) {
            if (!(w6Var instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            w6Var = new n.w6(cn3.HI((PicoAdditionalInfo) ((n.w6) w6Var).n()));
        }
        return x0X.w6.nr(w6Var);
    }

    @Override // CZF.I28
    public boolean t() {
        return this.ck;
    }

    private final AR.I28 HI(PicoAdditionalInfo picoAdditionalInfo) {
        Boolean boolValueOf;
        Map<String, Integer> mapEmptyMap;
        String country = picoAdditionalInfo.getDevice().getSoftware().getCountry();
        String language = picoAdditionalInfo.getDevice().getSoftware().getLanguage();
        String language2 = picoAdditionalInfo.getDevice().getSoftware().getLanguage();
        String locale = picoAdditionalInfo.getDevice().getSoftware().getLocale();
        String version = picoAdditionalInfo.getApp().getVersion();
        String bundleVersion = picoAdditionalInfo.getApp().getBundleVersion();
        boolean occurredBeforePico = picoAdditionalInfo.getInstall().getOccurredBeforePico();
        PicoAdditionalInfo.Experiment experiment = picoAdditionalInfo.getExperiment();
        if (experiment != null) {
            boolValueOf = Boolean.valueOf(experiment instanceof PicoAdditionalInfo.Experiment.Baseline);
        } else {
            boolValueOf = null;
        }
        Boolean bool = boolValueOf;
        Boolean everythingIsFree = picoAdditionalInfo.getMonetization().getEverythingIsFree();
        AR.n nVar = new AR.n(picoAdditionalInfo.getDevice().getSoftware().getTimezone().getGmtOffsetSeconds(), picoAdditionalInfo.getDevice().getSoftware().getTimezone().getName(), picoAdditionalInfo.getDevice().getSoftware().getTimezone().isDaylightSaving());
        PicoAdditionalInfo.Experiment experiment2 = picoAdditionalInfo.getExperiment();
        if (experiment2 instanceof PicoAdditionalInfo.Experiment.Segmented) {
            mapEmptyMap = ((PicoAdditionalInfo.Experiment.Segmented) experiment2).getSegments();
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return new AR.I28(country, language, language2, locale, version, bundleVersion, occurredBeforePico, bool, everythingIsFree, nVar, new AR.j(picoAdditionalInfo.getDevice().getSoftware().getOsVersionApi(), picoAdditionalInfo.getDevice().getSoftware().getOsVersionRelease(), picoAdditionalInfo.getDevice().getSoftware().getOsBuildId(), picoAdditionalInfo.getDevice().getHardware().getScreenSizeInches(), picoAdditionalInfo.getDevice().getHardware().getManufacturer(), picoAdditionalInfo.getDevice().getHardware().getModel()), mapEmptyMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XQ(PicoEvent picoEvent) {
        return picoEvent.toString();
    }

    private final boolean o(PicoEvent picoEvent) {
        String str;
        Object obj = picoEvent.getData().n().get("action_kind");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            return true;
        }
        boolean zContains = this.qie.contains(str);
        if (this.az.contains(str) || f938r.contains(str) || ck() || (zContains && t())) {
            return true;
        }
        return false;
    }
}
