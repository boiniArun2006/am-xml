package M;

import M.oXP;
import QmE.j;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 ;2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001<B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001d\u001a\u00020\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0010¢\u0006\u0004\b!\u0010 J!\u0010%\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010$\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u001bH\u0001¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0015¢\u0006\u0004\b.\u0010 J\r\u0010/\u001a\u00020\u0015¢\u0006\u0004\b/\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"LM/OA;", "LuW/w6;", "LM/HcS;", "LM/eZk;", "LM/oXP;", "Lr53/aC;", "importTemplateUseCase", "LU/j;", "getProjectListSortOrderUseCase", "LU/w6;", "setProjectListSortOrderUseCase", "LuF/j;", "getPremadeCategoriesUseCase", "LQmE/iF;", "eventLogger", "LnYs/Ml;", "getAlightSettingsUseCase", "<init>", "(Lr53/aC;LU/j;LU/w6;LuF/j;LQmE/iF;LnYs/Ml;)V", "", "isSingleImport", "", "WPU", "(Z)V", "", "id", "Lkotlin/Pair;", "", "importTemplateSuccessAndFailCount", "XQ", "(Ljava/lang/String;Lkotlin/Pair;)V", "te", "()V", "Uo", "Landroid/net/Uri;", "uri", "type", "Z", "(Landroid/net/Uri;Ljava/lang/String;)V", "progressDialogValue", "ViF", "(I)V", "LKA9/u;", "option", "nY", "(LKA9/u;)V", "o", "g", "Lr53/aC;", "KN", "LU/j;", "xMQ", "LU/w6;", "mUb", "LuF/j;", "gh", "LQmE/iF;", "qie", "LnYs/Ml;", "az", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OA extends uW.w6 {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final U.j getProjectListSortOrderUseCase;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final r53.aC importTemplateUseCase;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final QmE.iF eventLogger;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final uF.j getPremadeCategoriesUseCase;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final nYs.Ml getAlightSettingsUseCase;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final U.w6 setProjectListSortOrderUseCase;

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Uri f6298O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6299n;

        /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
            j(Object obj) {
                super(1, obj, OA.class, "onProgressChanged", "onProgressChanged$app_productionRelease(I)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void n(int i2) {
                ((OA) this.receiver).ViF(i2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f6298O = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OA.this.new Ml(this.f6298O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6299n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                r53.aC aCVar = OA.this.importTemplateUseCase;
                Uri uri = this.f6298O;
                j jVar = new j(OA.this);
                this.f6299n = 1;
                obj = aCVar.rl(uri, jVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            OA oa = OA.this;
            boolean z2 = nVar instanceof n.C1266n;
            if (!z2) {
                if (nVar instanceof n.w6) {
                    OA.S(oa, null, (Pair) ((n.w6) nVar).n(), 1, null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            OA oa2 = OA.this;
            if (z2) {
                oa2.WPU(false);
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    static final class j extends SuspendLambda implements Function2 {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f6301O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6302n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6304r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f6305t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OA.this.new j(continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r14v24 */
        /* JADX WARN: Type inference failed for: r14v8 */
        /* JADX WARN: Type inference failed for: r14v9, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OA oa;
            KA9.u uVarInvoke;
            ?? Bzg;
            ?? XQ;
            ?? r02;
            ?? r12;
            List listEmptyList;
            boolean z2;
            boolean z3;
            tN.j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6304r;
            if (i2 != 0) {
                if (i2 == 1) {
                    int i3 = this.J2;
                    int i5 = this.f6301O;
                    uVarInvoke = (KA9.u) this.f6305t;
                    oa = (OA) this.f6302n;
                    ResultKt.throwOnFailure(obj);
                    r02 = i3;
                    r12 = i5;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                oa = OA.this;
                uVarInvoke = oa.getProjectListSortOrderUseCase.invoke();
                nYs.j jVarInvoke = OA.this.getAlightSettingsUseCase.invoke();
                if (jVarInvoke != null) {
                    Bzg = jVarInvoke.bzg();
                } else {
                    Bzg = 0;
                }
                nYs.j jVarInvoke2 = OA.this.getAlightSettingsUseCase.invoke();
                if (jVarInvoke2 != null) {
                    XQ = jVarInvoke2.XQ();
                } else {
                    XQ = 0;
                }
                uF.j jVar2 = OA.this.getPremadeCategoriesUseCase;
                this.f6302n = oa;
                this.f6305t = uVarInvoke;
                this.f6301O = Bzg;
                this.J2 = XQ;
                this.f6304r = 1;
                Object objN = jVar2.n(this);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r02 = XQ;
                obj = objN;
                r12 = Bzg;
            }
            OA oa2 = oa;
            KA9.u uVar = uVarInvoke;
            List list = (List) x0X.w6.nr((x0X.n) obj);
            if (list == null || (jVar = (tN.j) CollectionsKt.getOrNull(list, 0)) == null || (listEmptyList = jVar.rl()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List list2 = listEmptyList;
            if (r12 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (r02 != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            oa2.mUb(new HcS(uVar, z2, z3, list2, null, 16, null));
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Uri f6306O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6307n;

        /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
            j(Object obj) {
                super(1, obj, OA.class, "onProgressChanged", "onProgressChanged$app_productionRelease(I)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void n(int i2) {
                ((OA) this.receiver).ViF(i2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f6306O = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return OA.this.new w6(this.f6306O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6307n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                r53.aC aCVar = OA.this.importTemplateUseCase;
                Uri uri = this.f6306O;
                j jVar = new j(OA.this);
                this.f6307n = 1;
                obj = aCVar.n(uri, jVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            OA oa = OA.this;
            boolean z2 = nVar instanceof n.C1266n;
            if (!z2) {
                if (nVar instanceof n.w6) {
                    OA.S(oa, (String) ((n.w6) nVar).n(), null, 2, null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            OA oa2 = OA.this;
            if (z2) {
                OA.aYN(oa2, false, 1, null);
            } else if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    static /* synthetic */ void aYN(OA oa, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        oa.WPU(z2);
    }

    @Override // uW.w6
    public void Uo() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OA(r53.aC importTemplateUseCase, U.j getProjectListSortOrderUseCase, U.w6 setProjectListSortOrderUseCase, uF.j getPremadeCategoriesUseCase, QmE.iF eventLogger, nYs.Ml getAlightSettingsUseCase) {
        super(new Function1() { // from class: M.z3w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OA.az((HcS) obj);
            }
        });
        Intrinsics.checkNotNullParameter(importTemplateUseCase, "importTemplateUseCase");
        Intrinsics.checkNotNullParameter(getProjectListSortOrderUseCase, "getProjectListSortOrderUseCase");
        Intrinsics.checkNotNullParameter(setProjectListSortOrderUseCase, "setProjectListSortOrderUseCase");
        Intrinsics.checkNotNullParameter(getPremadeCategoriesUseCase, "getPremadeCategoriesUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        this.importTemplateUseCase = importTemplateUseCase;
        this.getProjectListSortOrderUseCase = getProjectListSortOrderUseCase;
        this.setProjectListSortOrderUseCase = setProjectListSortOrderUseCase;
        this.getPremadeCategoriesUseCase = getPremadeCategoriesUseCase;
        this.eventLogger = eventLogger;
        this.getAlightSettingsUseCase = getAlightSettingsUseCase;
        GJW.C.nr(ViewModelKt.n(this), null, null, new j(null), 3, null);
    }

    static /* synthetic */ void S(OA oa, String str, Pair pair, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            pair = null;
        }
        oa.XQ(str, pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eZk az(HcS it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Mo.n(it);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r11.equals("text/xml") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r11.equals("application/xml") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        r0 = GJW.C.nr(androidx.view.ViewModelKt.n(r9), null, null, new M.OA.w6(r9, r10, null), 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(Uri uri, String type) {
        this.eventLogger.n(j.g9.f8508n);
        if (uri == null) {
            aYN(this, false, 1, null);
            return;
        }
        ViF(0);
        if (type != null) {
            int iHashCode = type.hashCode();
            if (iHashCode != -1248326952) {
                if (iHashCode != -1248325150) {
                    if (iHashCode == -1004727243) {
                    }
                } else if (type.equals("application/zip")) {
                    GJW.C.nr(ViewModelKt.n(this), null, null, new Ml(uri, null), 3, null);
                    return;
                }
            }
        }
        aYN(this, false, 1, null);
        Unit unit = Unit.INSTANCE;
    }

    public final void g() {
        this.eventLogger.n(j.L0y.f8417n);
        xMQ(oXP.w6.f6450n);
    }

    public final void nY(KA9.u option) {
        Intrinsics.checkNotNullParameter(option, "option");
        if (this.getProjectListSortOrderUseCase.invoke() != option) {
            this.setProjectListSortOrderUseCase.n(option);
        }
        HcS hcS = (HcS) nr();
        mUb(hcS != null ? HcS.rl(hcS, option, false, false, null, null, 30, null) : null);
    }

    public final void o() {
        KA9.u uVarInvoke = this.getProjectListSortOrderUseCase.invoke();
        HcS hcS = (HcS) nr();
        if ((hcS != null ? hcS.J2() : null) != uVarInvoke) {
            HcS hcS2 = (HcS) nr();
            mUb(hcS2 != null ? HcS.rl(hcS2, uVarInvoke, false, false, null, null, 30, null) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void WPU(boolean isSingleImport) {
        te();
        this.eventLogger.n(j.cA.f8485n);
        xMQ(new oXP.j(isSingleImport));
    }

    private final void XQ(String id, Pair importTemplateSuccessAndFailCount) {
        Pair pair;
        te();
        if (importTemplateSuccessAndFailCount == null) {
            pair = new Pair(1, 0);
        } else {
            pair = importTemplateSuccessAndFailCount;
        }
        int iIntValue = ((Number) pair.component1()).intValue();
        this.eventLogger.n(new j.C1446t(((Number) pair.component2()).intValue() + iIntValue, iIntValue, rWZ.QJ.f73066n));
        xMQ(new oXP.n(id, importTemplateSuccessAndFailCount));
    }

    private final void te() {
        HcS hcSRl;
        HcS hcS = (HcS) nr();
        if (hcS != null) {
            hcSRl = HcS.rl(hcS, null, false, false, null, null, 15, null);
        } else {
            hcSRl = null;
        }
        mUb(hcSRl);
    }

    public final void ViF(int progressDialogValue) {
        HcS hcSRl;
        HcS hcS = (HcS) nr();
        if (hcS != null) {
            hcSRl = HcS.rl(hcS, null, false, false, null, Integer.valueOf(progressDialogValue), 15, null);
        } else {
            hcSRl = null;
        }
        mUb(hcSRl);
    }
}
