package nN;

import GJW.vd;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import nN.fuX;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"LnN/Ml;", "LuW/n;", "LnN/fuX;", "", "LkgE/fuX;", "iapManager", "LnYs/Ml;", "getAlightSettingsUseCase", "LW/j;", "getCreatorProgramDataUseCase", "<init>", "(LkgE/fuX;LnYs/Ml;LW/j;)V", "LTFv/Wre;", "HI", "()LTFv/Wre;", "", "Uo", "()V", "LkgE/fuX;", "KN", "LnYs/Ml;", "xMQ", "LW/j;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Ml extends uW.n {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final kgE.fuX iapManager;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final W.j getCreatorProgramDataUseCase;

    static final class j extends SuspendLambda implements Function3 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f71062O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71063n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f71064t;

        j(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return n(((Boolean) obj).booleanValue(), (cg.Wre) obj2, (Continuation) obj3);
        }

        public final Object n(boolean z2, cg.Wre wre, Continuation continuation) {
            j jVar = new j(continuation);
            jVar.f71064t = z2;
            jVar.f71062O = wre;
            return jVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f71063n == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z2 = this.f71064t;
                cg.Wre wre = (cg.Wre) this.f71062O;
                if (z2) {
                    if (wre != null) {
                        return new fuX.I28(wre.O(), wre.Uo());
                    }
                    return fuX.n.f71089n;
                }
                return fuX.Ml.f71087n;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71065n;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Ml f71067O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f71068n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f71069t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Ml ml, Continuation continuation) {
                super(2, continuation);
                this.f71067O = ml;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f71067O, continuation);
                jVar.f71069t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f71068n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f71067O.mUb((fuX) this.f71069t);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException(Apsps.hIvdBGqGvHX);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(fuX fux, Continuation continuation) {
                return ((j) create(fux, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71065n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreHI = Ml.this.HI();
                j jVar = new j(Ml.this, null);
                this.f71065n = 1;
                if (TFv.fuX.gh(wreHI, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public Ml(kgE.fuX iapManager, nYs.Ml getAlightSettingsUseCase, W.j getCreatorProgramDataUseCase) {
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(getCreatorProgramDataUseCase, "getCreatorProgramDataUseCase");
        this.iapManager = iapManager;
        this.getAlightSettingsUseCase = getAlightSettingsUseCase;
        this.getCreatorProgramDataUseCase = getCreatorProgramDataUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TFv.Wre HI() {
        return TFv.fuX.fD(this.iapManager.ck(), this.getCreatorProgramDataUseCase.t(), new j(null));
    }

    @Override // uW.w6
    public void Uo() {
        nYs.j jVarInvoke = this.getAlightSettingsUseCase.invoke();
        if (jVarInvoke == null || !jVarInvoke.J2()) {
            mUb(fuX.j.f71088n);
        } else if (jVarInvoke == null || !jVarInvoke.KN()) {
            GJW.C.nr(ViewModelKt.n(this), null, null, new n(null), 3, null);
        } else {
            mUb(fuX.w6.f71090n);
        }
    }
}
