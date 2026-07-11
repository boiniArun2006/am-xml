package NuI;

import TFv.rv6;
import com.alightcreative.monorepo.settings.AdMediator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qp.InterfaceC2342j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fuX implements CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f7216n;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nYs.Ml f7217t;

    static final class n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7219n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7220t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7220t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return fuX.this.n(this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7221n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7222t;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = new w6(continuation);
            w6Var.f7222t = obj;
            return w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7221n == 0) {
                ResultKt.throwOnFailure(obj);
                if (((nYs.j) this.f7222t) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boxing.boxBoolean(z2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(nYs.j jVar, Continuation continuation) {
            return ((w6) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdMediator.values().length];
            try {
                iArr[AdMediator.ADMOB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdMediator.MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fuX(InterfaceC2342j adMobRewardedAdLauncher, InterfaceC2342j maxAdRewardedAdLauncher, nYs.Ml getAlightSettingsUseCase) {
        Intrinsics.checkNotNullParameter(adMobRewardedAdLauncher, "adMobRewardedAdLauncher");
        Intrinsics.checkNotNullParameter(maxAdRewardedAdLauncher, "maxAdRewardedAdLauncher");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        this.f7216n = adMobRewardedAdLauncher;
        this.rl = maxAdRewardedAdLauncher;
        this.f7217t = getAlightSettingsUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // NuI.CN3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        n nVar;
        fuX fux;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objTe = nVar.f7220t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objTe);
            rv6 rv6VarRl = this.f7217t.rl();
            w6 w6Var = new w6(null);
            nVar.f7219n = this;
            nVar.J2 = 1;
            objTe = TFv.fuX.te(rv6VarRl, w6Var, nVar);
            if (objTe == coroutine_suspended) {
                return coroutine_suspended;
            }
            fux = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fux = (fuX) nVar.f7219n;
            ResultKt.throwOnFailure(objTe);
        }
        nYs.j jVar = (nYs.j) objTe;
        AdMediator adMediatorN = jVar != null ? jVar.n() : null;
        int i5 = adMediatorN == null ? -1 : j.$EnumSwitchMapping$0[adMediatorN.ordinal()];
        if (i5 != -1) {
            if (i5 == 1) {
                Object obj = fux.f7216n.get();
                Intrinsics.checkNotNull(obj);
                return (ScC.w6) obj;
            }
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Object obj2 = fux.rl.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (ScC.w6) obj2;
    }
}
