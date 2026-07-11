package ka;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lka/aC;", "LuW/w6;", "Lka/o;", "Lka/eO;", "", "LnYs/Ml;", "getAlightSettingsUseCase", "LJfs/n;", "getCreatorRankingUseCase", "LJfs/w6;", "getCurrentCreatorRankingDataUseCase", "LkgE/fuX;", "iapManager", "<init>", "(LnYs/Ml;LJfs/n;LJfs/w6;LkgE/fuX;)V", "", "Uo", "()V", "LnYs/Ml;", "ty", "()LnYs/Ml;", "KN", "LJfs/n;", "HI", "()LJfs/n;", "xMQ", "LJfs/w6;", "ck", "()LJfs/w6;", "mUb", "LkgE/fuX;", "Ik", "()LkgE/fuX;", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class aC extends uW.w6 {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Jfs.n getCreatorRankingUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final kgE.fuX iapManager;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Jfs.w6 getCurrentCreatorRankingDataUseCase;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f69987n;

        /* JADX INFO: renamed from: ka.aC$j$j, reason: collision with other inner class name */
        static final class C1031j extends SuspendLambda implements Function3 {
            /* synthetic */ Object J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            /* synthetic */ boolean f69989O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f69990n;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ aC f69991r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f69992t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1031j(aC aCVar, Continuation continuation) {
                super(3, continuation);
                this.f69991r = aCVar;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return n(((Boolean) obj).booleanValue(), (FX.n) obj2, (Continuation) obj3);
            }

            public final Object n(boolean z2, FX.n nVar, Continuation continuation) {
                C1031j c1031j = new C1031j(this.f69991r, continuation);
                c1031j.f69989O = z2;
                c1031j.J2 = nVar;
                return c1031j.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z2;
                FX.n nVar;
                aC aCVar;
                boolean zMUb;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f69992t;
                if (i2 != 0) {
                    if (i2 == 1) {
                        z2 = this.f69989O;
                        aCVar = (aC) this.f69990n;
                        nVar = (FX.n) this.J2;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    boolean z3 = this.f69989O;
                    FX.n nVar2 = (FX.n) this.J2;
                    aC aCVar2 = this.f69991r;
                    Jfs.n getCreatorRankingUseCase = aCVar2.getGetCreatorRankingUseCase();
                    this.J2 = nVar2;
                    this.f69990n = aCVar2;
                    this.f69989O = z3;
                    this.f69992t = 1;
                    Object objNr = getCreatorRankingUseCase.nr(this);
                    if (objNr == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z2 = z3;
                    obj = objNr;
                    nVar = nVar2;
                    aCVar = aCVar2;
                }
                List listEmptyList = (List) x0X.w6.nr((x0X.n) obj);
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                nYs.j jVarInvoke = this.f69991r.getGetAlightSettingsUseCase().invoke();
                if (jVarInvoke != null) {
                    zMUb = jVarInvoke.mUb();
                } else {
                    zMUb = false;
                }
                aCVar.mUb(new o(zMUb, z2, listEmptyList, nVar));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return aC.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f69987n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreFD = TFv.fuX.fD(aC.this.getIapManager().ck(), aC.this.getGetCurrentCreatorRankingDataUseCase().n(), new C1031j(aC.this, null));
                this.f69987n = 1;
                if (TFv.fuX.mUb(wreFD, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aC(nYs.Ml getAlightSettingsUseCase, Jfs.n getCreatorRankingUseCase, Jfs.w6 getCurrentCreatorRankingDataUseCase, kgE.fuX iapManager) {
        super(new Function1() { // from class: ka.Dsr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return aC.az((o) obj);
            }
        });
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(getCreatorRankingUseCase, "getCreatorRankingUseCase");
        Intrinsics.checkNotNullParameter(getCurrentCreatorRankingDataUseCase, "getCurrentCreatorRankingDataUseCase");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        this.getAlightSettingsUseCase = getAlightSettingsUseCase;
        this.getCreatorRankingUseCase = getCreatorRankingUseCase;
        this.getCurrentCreatorRankingDataUseCase = getCurrentCreatorRankingDataUseCase;
        this.iapManager = iapManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eO az(o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C.n(it);
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final Jfs.n getGetCreatorRankingUseCase() {
        return this.getCreatorRankingUseCase;
    }

    /* JADX INFO: renamed from: Ik, reason: from getter */
    public final kgE.fuX getIapManager() {
        return this.iapManager;
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final Jfs.w6 getGetCurrentCreatorRankingDataUseCase() {
        return this.getCurrentCreatorRankingDataUseCase;
    }

    /* JADX INFO: renamed from: ty, reason: from getter */
    public final nYs.Ml getGetAlightSettingsUseCase() {
        return this.getAlightSettingsUseCase;
    }

    @Override // uW.w6
    public void Uo() {
        GJW.C.nr(ViewModelKt.n(this), null, null, new j(null), 3, null);
    }
}
