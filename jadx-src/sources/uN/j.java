package uN;

import GJW.Dsr;
import GJW.vd;
import HX.Wre;
import WJ.phkN.HFAkacKHsU;
import com.bendingspoons.concierge.domain.entities.Id;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.fido.common.bH.gUxOLwRQBPPLC;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;
import zD.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j implements Wre {
    public static final C1223j Uo = new C1223j(null);
    private final sJa.Ml J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function0 f74350O;
    private final Function0 nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function0 f74351t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74352n;

        /* JADX INFO: renamed from: uN.j$Ml$j, reason: collision with other inner class name */
        static final class C1222j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f74354n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ j f74355t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1222j(j jVar, Continuation continuation) {
                super(1, continuation);
                this.f74355t = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C1222j(this.f74355t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f74354n == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.f74355t.rl.get(Id.Predefined.External.j.J2);
                    if (str != null) {
                        return new Id.Predefined.External.AppSetId(str, ((Number) this.f74355t.f74350O.invoke()).longValue() + 33696000000L, 2);
                    }
                    Object objInvoke = this.f74355t.nr.invoke();
                    j jVar = this.f74355t;
                    AppSetIdInfo appSetIdInfo = (AppSetIdInfo) objInvoke;
                    String id = appSetIdInfo.getId();
                    Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
                    return new Id.Predefined.External.AppSetId(id, ((Number) jVar.f74350O.invoke()).longValue() + 33696000000L, appSetIdInfo.getScope());
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((C1222j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74352n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C1222j c1222j = new C1222j(j.this, null);
                this.f74352n = 1;
                obj = x0X.w6.Uo(c1222j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            if (nVar instanceof n.C1266n) {
                return new n.C1266n(new zD.j(j.w6.J2, j.EnumC1290j.J2, j.n.f76392r, "Unable to retrieve the App set ID.", (Throwable) ((n.C1266n) nVar).n()));
            }
            if (nVar instanceof n.w6) {
                return nVar;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: uN.j$j, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public static final class C1223j {
        public /* synthetic */ C1223j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1223j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74356n;

        /* JADX INFO: renamed from: uN.j$w6$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        static final class C1224j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f74358n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ j f74359t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1224j(j jVar, Continuation continuation) {
                super(1, continuation);
                this.f74359t = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C1224j(this.f74359t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String id;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f74358n == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = (String) this.f74359t.rl.get(Id.Predefined.External.j.f51212O);
                    if (str != null) {
                        return new Id.Predefined.External.AAID(str, ((Number) this.f74359t.f74350O.invoke()).longValue() + 43200000);
                    }
                    Object objInvoke = this.f74359t.f74351t.invoke();
                    j jVar = this.f74359t;
                    AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) objInvoke;
                    if (info.isLimitAdTrackingEnabled()) {
                        id = Id.Predefined.External.AAID.LIMIT_AD_TRACKING_VALUE;
                    } else {
                        id = info.getId();
                        Intrinsics.checkNotNull(id);
                    }
                    return new Id.Predefined.External.AAID(id, ((Number) jVar.f74350O.invoke()).longValue() + 43200000);
                }
                throw new IllegalStateException(gUxOLwRQBPPLC.HQLPfTkuHLpf);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((C1224j) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            return j.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74356n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C1224j c1224j = new C1224j(j.this, null);
                this.f74356n = 1;
                obj = x0X.w6.Uo(c1224j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            if (nVar instanceof n.C1266n) {
                return new n.C1266n(new zD.j(j.w6.J2, j.EnumC1290j.J2, j.n.f76392r, "Unable to retrieve the AAID.", (Throwable) ((n.C1266n) nVar).n()));
            }
            if (nVar instanceof n.w6) {
                return nVar;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public /* synthetic */ class n {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Id.Predefined.External.j.values().length];
            try {
                iArr[Id.Predefined.External.j.f51212O.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Id.Predefined.External.j.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j(Map mockedIds, Function0 getAdvertisingInfo, Function0 getAppSetIdInfo, Function0 function0, sJa.Ml dispatcherProvider) {
        Intrinsics.checkNotNullParameter(mockedIds, "mockedIds");
        Intrinsics.checkNotNullParameter(getAdvertisingInfo, "getAdvertisingInfo");
        Intrinsics.checkNotNullParameter(getAppSetIdInfo, "getAppSetIdInfo");
        Intrinsics.checkNotNullParameter(function0, HFAkacKHsU.pMbiGhryyf);
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.rl = mockedIds;
        this.f74351t = getAdvertisingInfo;
        this.nr = getAppSetIdInfo;
        this.f74350O = function0;
        this.J2 = dispatcherProvider;
    }

    private final Object J2(Continuation continuation) {
        return Dsr.Uo(this.J2.nr(), new w6(null), continuation);
    }

    private final Object Uo(Continuation continuation) {
        return Dsr.Uo(this.J2.nr(), new Ml(null), continuation);
    }

    @Override // HX.Wre
    public Object n(Id.Predefined.External.j jVar, Continuation continuation) {
        int i2 = n.$EnumSwitchMapping$0[jVar.ordinal()];
        if (i2 == 1) {
            Object objJ2 = J2(continuation);
            return objJ2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJ2 : (x0X.n) objJ2;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Object objUo = Uo(continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : (x0X.n) objUo;
    }
}
