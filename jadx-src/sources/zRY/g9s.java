package zRY;

import GJW.vd;
import QmE.iF;
import QmE.j;
import androidx.view.ViewModel;
import androidx.view.ViewModelKt;
import androidx.view.ViewModelProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class g9s extends uW.w6 {
    public static final j gh = new j(null);
    public static final int qie = 8;
    private final iF KN;
    private final uF.j Uo;
    private final List mUb;
    private final eQ.fuX xMQ;

    public static final class j {

        /* JADX INFO: renamed from: zRY.g9s$j$j, reason: collision with other inner class name */
        public static final class C1298j implements ViewModelProvider.Factory {
            final /* synthetic */ n rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f76518t;

            C1298j(n nVar, List list) {
                this.rl = nVar;
                this.f76518t = list;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public ViewModel t(Class modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                g9s g9sVarN = this.rl.n(this.f76518t);
                Intrinsics.checkNotNull(g9sVarN, "null cannot be cast to non-null type T of com.alightcreative.app.motion.premade.ui.PremadeContentViewModel.Companion.provideFactory.<no name provided>.create");
                return g9sVarN;
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final ViewModelProvider.Factory n(n assistedFactory, List typeFilters) {
            Intrinsics.checkNotNullParameter(assistedFactory, "assistedFactory");
            Intrinsics.checkNotNullParameter(typeFilters, "typeFilters");
            return new C1298j(assistedFactory, typeFilters);
        }
    }

    public interface n {
        g9s n(List list);
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f76519n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        w6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return g9s.this.new w6(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strN;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f76519n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                uF.j jVar = g9s.this.Uo;
                this.f76519n = 1;
                obj = jVar.n(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            g9s g9sVar = g9s.this;
            if (!(nVar instanceof n.C1266n)) {
                if (nVar instanceof n.w6) {
                    List list = (List) ((n.w6) nVar).n();
                    tN.j jVar2 = (tN.j) CollectionsKt.getOrNull(list, 0);
                    if (jVar2 != null) {
                        strN = jVar2.n();
                    } else {
                        strN = null;
                    }
                    g9sVar.mUb(new Z(list, strN, g9sVar.mUb));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9s(uF.j getPremadeCategoriesUseCase, iF eventLogger, eQ.fuX imageLoader, List typeFilters) {
        super(new Function1() { // from class: zRY.ci
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g9s.az((Z) obj);
            }
        });
        Intrinsics.checkNotNullParameter(getPremadeCategoriesUseCase, "getPremadeCategoriesUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(typeFilters, "typeFilters");
        this.Uo = getPremadeCategoriesUseCase;
        this.KN = eventLogger;
        this.xMQ = imageLoader;
        this.mUb = typeFilters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ew az(Z it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return afx.n(it);
    }

    public final void Ik(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        this.KN.n(new j.Pmq(categoryId));
        Z z2 = (Z) nr();
        mUb(z2 != null ? Z.rl(z2, null, categoryId, null, 5, null) : null);
    }

    public final eQ.fuX ck() {
        return this.xMQ;
    }

    public final void r(tN.fuX selectedTypeFilter) {
        List<tN.fuX> listO;
        boolean z2;
        Intrinsics.checkNotNullParameter(selectedTypeFilter, "selectedTypeFilter");
        Z z3 = (Z) nr();
        if (z3 == null || (listO = z3.O()) == null) {
            return;
        }
        if (!selectedTypeFilter.t()) {
            z2 = false;
            break;
        }
        if (!listO.isEmpty()) {
            for (tN.fuX fux : listO) {
                if (!Intrinsics.areEqual(fux, selectedTypeFilter) && fux.t()) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        Z z4 = (Z) nr();
        Z zRl = null;
        if (z4 != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listO, 10));
            for (tN.fuX fuxRl : listO) {
                if (Intrinsics.areEqual(fuxRl, selectedTypeFilter)) {
                    fuxRl = tN.fuX.rl(fuxRl, null, !selectedTypeFilter.t(), 1, null);
                } else if (z2) {
                    fuxRl = tN.fuX.rl(fuxRl, null, true, 1, null);
                }
                arrayList.add(fuxRl);
            }
            zRl = Z.rl(z4, null, null, arrayList, 3, null);
        }
        mUb(zRl);
    }

    @Override // uW.w6
    public void Uo() {
        GJW.C.nr(ViewModelKt.n(this), null, null, new w6(null), 3, null);
    }
}
