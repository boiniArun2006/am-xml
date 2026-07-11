package xhQ;

import GJW.vd;
import Hr.CQ.USEaHtCMH;
import SJ0.Ji;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.LifecycleOwner;
import androidx.view.LifecycleOwnerKt;
import androidx.view.Observer;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.ViewModelStoreOwner;
import androidx.view.viewmodel.CreationExtras;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import xhQ.UGc;
import xhQ.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"LxhQ/Xo;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "LxhQ/UGc$j;", AppLovinEventTypes.USER_VIEWED_CONTENT, "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(LxhQ/UGc$j;)V", "", "", "projectIDs", "", "numAdsWatched", "numAdsToWatch", "s7N", "(Ljava/util/List;II)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LSJ0/Ji;", "o", "LSJ0/Ji;", "_binding", "LxhQ/QJ;", "Z", "Lkotlin/Lazy;", "nHg", "()LxhQ/QJ;", "viewModel", "N", "()LSJ0/Ji;", "binding", "S", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrialListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrialListFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/trialList/TrialListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,137:1\n106#2,15:138\n257#3,2:153\n*S KotlinDebug\n*F\n+ 1 TrialListFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/trialList/TrialListFragment\n*L\n25#1:138,15\n85#1:153,2\n*E\n"})
public final class Xo extends xhQ.Wre {

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f75445g = 8;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Ji _binding;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class CN3 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f75448n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f75449t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CN3(Function0 function0, Lazy lazy) {
            super(0);
            this.f75448n = function0;
            this.f75449t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f75448n;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f75449t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class I28 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f75450n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Function0 function0) {
            super(0);
            this.f75450n = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f75450n.invoke();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class Ml extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f75451n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Fragment fragment) {
            super(0);
            this.f75451n = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f75451n;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class Wre extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Lazy f75452n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Lazy lazy) {
            super(0);
            this.f75452n = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.O(this.f75452n).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class fuX extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f75453n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f75454t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public fuX(Fragment fragment, Lazy lazy) {
            super(0);
            this.f75453n = fragment;
            this.f75454t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f75454t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.f75453n.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: xhQ.Xo$j, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void n(FragmentManager fragmentManager, int i2, List projectIDs, int i3, int i5) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(projectIDs, "projectIDs");
            Fragment fragmentPJg = fragmentManager.pJg("TrialListFragment");
            Xo xo = fragmentPJg instanceof Xo ? (Xo) fragmentPJg : null;
            if (xo == null) {
                xo = new Xo();
                FragmentTransaction fragmentTransactionO = fragmentManager.o();
                fragmentTransactionO.WPU(2130772031, 2130772002, 2130772000, 2130772034);
                fragmentTransactionO.t(i2, xo, "TrialListFragment");
                fragmentTransactionO.KN(null);
                fragmentTransactionO.mUb();
            }
            xo.s7N(projectIDs, i3, i5);
        }

        public final Unit rl(FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Fragment fragmentPJg = fragmentManager.pJg("TrialListFragment");
            if (fragmentPJg == null) {
                return null;
            }
            FragmentTransaction fragmentTransactionO = fragmentManager.o();
            fragmentTransactionO.r(fragmentPJg);
            fragmentTransactionO.mUb();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ List f75455O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75456n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f75457r;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(List list, int i2, int i3, Continuation continuation) {
            super(2, continuation);
            this.f75455O = list;
            this.J2 = i2;
            this.f75457r = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Xo.this.new n(this.f75455O, this.J2, this.f75457r, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f75456n == 0) {
                ResultKt.throwOnFailure(obj);
                Xo.this.nHg().S(this.f75455O, this.J2, this.f75457r);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class w6 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final /* synthetic */ Function1 f75459n;

        w6(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f75459n = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f75459n;
        }

        @Override // androidx.view.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f75459n.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    private final Ji N() {
        Ji ji = this._binding;
        Intrinsics.checkNotNull(ji);
        return ji;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Xw(Xo xo, xhQ.fuX action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!Intrinsics.areEqual(action, fuX.j.f75462n)) {
            throw new NoWhenBranchMatchedException();
        }
        xo.getParentFragmentManager().Zmq();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jB(Xo xo, UGc uGc) {
        if (uGc instanceof UGc.j) {
            xo.T((UGc.j) uGc);
        } else if (uGc != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QJ nHg() {
        return (QJ) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = Ji.t(inflater, container, false);
        ConstraintLayout root = N().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, USEaHtCMH.dWDHwI);
        super.onViewCreated(view, savedInstanceState);
        N().f9170t.setOnClickListener(new View.OnClickListener() { // from class: xhQ.Dsr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Xo.wTp(this.f75404n, view2);
            }
        });
        N().nr.setOnClickListener(new View.OnClickListener() { // from class: xhQ.aC
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Xo.v(this.f75460n, view2);
            }
        });
        N().Uo.setOnClickListener(new View.OnClickListener() { // from class: xhQ.C
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Xo.rV9(this.f75403n, view2);
            }
        });
        N().f9168O.setOnClickListener(new View.OnClickListener() { // from class: xhQ.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Xo.bzg(this.f75467n, view2);
            }
        });
        RecyclerView recyclerView = N().mUb;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(new r());
        QJ qjNHg = nHg();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        uW.I28.nr(qjNHg, viewLifecycleOwner, new Function1() { // from class: xhQ.qz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Xo.Xw(this.f75468n, (fuX) obj);
            }
        });
        nHg().t().mUb(getViewLifecycleOwner(), new w6(new Function1() { // from class: xhQ.Pl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Xo.jB(this.f75413n, (UGc) obj);
            }
        }));
    }

    public final void s7N(List projectIDs, int numAdsWatched, int numAdsToWatch) {
        Intrinsics.checkNotNullParameter(projectIDs, "projectIDs");
        LifecycleOwnerKt.n(this).t(new n(projectIDs, numAdsWatched, numAdsToWatch, null));
    }

    public Xo() {
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new I28(new Ml(this)));
        this.viewModel = FragmentViewModelLazyKt.t(this, Reflection.getOrCreateKotlinClass(QJ.class), new Wre(lazy), new CN3(null, lazy), new fuX(this, lazy));
    }

    private final void T(UGc.j content) {
        r rVar;
        int i2;
        RecyclerView.Adapter adapter = N().mUb.getAdapter();
        if (adapter instanceof r) {
            rVar = (r) adapter;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            return;
        }
        rVar.ty(content.n());
        LinearLayout freeExportButton = N().f9168O;
        Intrinsics.checkNotNullExpressionValue(freeExportButton, "freeExportButton");
        if (content.O()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        freeExportButton.setVisibility(i2);
        N().J2.setText(getString(2132019889, Integer.valueOf(content.t()), Integer.valueOf(content.rl())));
        N().rl.HI(content.nr(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bzg(Xo xo, View view) {
        xo.nHg().ViF();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rV9(Xo xo, View view) {
        xo.nHg().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Xo xo, View view) {
        xo.nHg().aYN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void wTp(Xo xo, View view) {
        xo.nHg().WPU();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
