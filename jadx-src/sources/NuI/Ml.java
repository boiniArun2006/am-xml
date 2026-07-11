package NuI;

import TFv.rv6;
import com.alightcreative.gl.egl.il.inFlMLxL;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml implements NuI.w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final nYs.Ml f7198n;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f7199O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7200n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f7201r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7202t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7199O = obj;
            this.f7201r |= Integer.MIN_VALUE;
            return Ml.this.n(null, this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7203n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f7204t;

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = new w6(continuation);
            w6Var.f7204t = obj;
            return w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7203n == 0) {
                ResultKt.throwOnFailure(obj);
                if (((nYs.j) this.f7204t) != null) {
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

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[k.I28.values().length];
            try {
                iArr2[k.I28.f69641Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[k.I28.f69644r.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public Ml(nYs.Ml getAlightSettingsUseCase) {
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        this.f7198n = getAlightSettingsUseCase;
    }

    private final String rl(k.I28 i28, nYs.j jVar) {
        String strNr;
        String strT;
        int i2 = j.$EnumSwitchMapping$1[i28.ordinal()];
        return i2 != 1 ? i2 != 2 ? "" : (jVar == null || (strT = jVar.t()) == null) ? "ca-app-pub-6708589877934833/5313794019" : strT : (jVar == null || (strNr = jVar.nr()) == null) ? "ca-app-pub-6708589877934833/4875406788" : strNr;
    }

    private final String t(k.I28 i28, nYs.j jVar) {
        String strZ;
        String strO;
        int i2 = j.$EnumSwitchMapping$1[i28.ordinal()];
        return i2 != 1 ? i2 != 2 ? inFlMLxL.vKfEJkRTEVkLy : (jVar == null || (strO = jVar.o()) == null) ? "ea42f268cdda4cbb" : strO : (jVar == null || (strZ = jVar.Z()) == null) ? "4eca36ba8af8d6e0" : strZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // NuI.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(k.I28 i28, Continuation continuation) {
        n nVar;
        Ml ml;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f7201r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f7201r = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objTe = nVar.f7199O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f7201r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objTe);
            rv6 rv6VarRl = this.f7198n.rl();
            w6 w6Var = new w6(null);
            nVar.f7200n = this;
            nVar.f7202t = i28;
            nVar.f7201r = 1;
            objTe = TFv.fuX.te(rv6VarRl, w6Var, nVar);
            if (objTe == coroutine_suspended) {
                return coroutine_suspended;
            }
            ml = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i28 = (k.I28) nVar.f7202t;
            ml = (Ml) nVar.f7200n;
            ResultKt.throwOnFailure(objTe);
        }
        nYs.j jVar = (nYs.j) objTe;
        AdMediator adMediatorN = jVar != null ? jVar.n() : null;
        int i5 = adMediatorN == null ? -1 : j.$EnumSwitchMapping$0[adMediatorN.ordinal()];
        if (i5 != -1) {
            if (i5 == 1) {
                return ml.rl(i28, jVar);
            }
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return ml.t(i28, jVar);
    }
}
