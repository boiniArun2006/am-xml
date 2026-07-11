package NuI;

import TFv.rv6;
import com.alightcreative.monorepo.settings.AdMediator;
import k.InterfaceC2202n;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n implements NuI.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC2342j f7223n;
    private final InterfaceC2342j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nYs.Ml f7224t;

    /* JADX INFO: renamed from: NuI.n$n, reason: collision with other inner class name */
    static final class C0246n extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7226n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7227t;

        C0246n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7227t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return n.this.n(this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7228n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7229t;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = new w6(continuation);
            w6Var.f7229t = obj;
            return w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7228n == 0) {
                ResultKt.throwOnFailure(obj);
                if (((nYs.j) this.f7229t) != null) {
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

    public n(InterfaceC2342j adMobAdOrable, InterfaceC2342j maxAdOrable, nYs.Ml getAlightSettingsUseCase) {
        Intrinsics.checkNotNullParameter(adMobAdOrable, "adMobAdOrable");
        Intrinsics.checkNotNullParameter(maxAdOrable, "maxAdOrable");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        this.f7223n = adMobAdOrable;
        this.rl = maxAdOrable;
        this.f7224t = getAlightSettingsUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // NuI.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        C0246n c0246n;
        n nVar;
        if (continuation instanceof C0246n) {
            c0246n = (C0246n) continuation;
            int i2 = c0246n.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0246n.J2 = i2 - Integer.MIN_VALUE;
            } else {
                c0246n = new C0246n(continuation);
            }
        }
        Object objTe = c0246n.f7227t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0246n.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objTe);
            rv6 rv6VarRl = this.f7224t.rl();
            w6 w6Var = new w6(null);
            c0246n.f7226n = this;
            c0246n.J2 = 1;
            objTe = TFv.fuX.te(rv6VarRl, w6Var, c0246n);
            if (objTe == coroutine_suspended) {
                return coroutine_suspended;
            }
            nVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = (n) c0246n.f7226n;
            ResultKt.throwOnFailure(objTe);
        }
        nYs.j jVar = (nYs.j) objTe;
        AdMediator adMediatorN = jVar != null ? jVar.n() : null;
        int i5 = adMediatorN == null ? -1 : j.$EnumSwitchMapping$0[adMediatorN.ordinal()];
        if (i5 != -1) {
            if (i5 == 1) {
                Object obj = nVar.f7223n.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                return (InterfaceC2202n) obj;
            }
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Object obj2 = nVar.rl.get();
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (InterfaceC2202n) obj2;
    }
}
