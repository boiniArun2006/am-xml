package com.bendingspoons.secretmenu.ui.mainscreen;

import GJW.C;
import GJW.vd;
import TFv.rv6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.LifecycleOwnerKt;
import androidx.view.NavController;
import androidx.view.RepeatOnLifecycleKt;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStore;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.FlowExtKt;
import androidx.view.fragment.NavHostFragment;
import androidx.view.viewmodel.CreationExtras;
import com.bendingspoons.secretmenu.ui.items.exit.ExitActivity;
import com.bendingspoons.secretmenu.ui.mainscreen.Ml;
import com.bendingspoons.secretmenu.ui.mainscreen.SecretMenuFragment;
import com.bendingspoons.secretmenu.ui.mainscreen.fuX;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import r4.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0016²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"Lcom/bendingspoons/secretmenu/ui/mainscreen/SecretMenuFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroidx/navigation/NavController;", "nY", "()Landroidx/navigation/NavController;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", c.f62177j, "j", "Lcom/bendingspoons/secretmenu/ui/mainscreen/fuX;", "viewModel", "LE14/I28;", "state", "secretmenu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSecretMenuFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecretMenuFragment.kt\ncom/bendingspoons/secretmenu/ui/mainscreen/SecretMenuFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FlowExtensions.kt\ncom/bendingspoons/secretmenu/ui/extensions/FlowExtensionsKt\n*L\n1#1,106:1\n106#2,15:107\n12#3,11:122\n*S KotlinDebug\n*F\n+ 1 SecretMenuFragment.kt\ncom/bendingspoons/secretmenu/ui/mainscreen/SecretMenuFragment\n*L\n34#1:107,15\n49#1:122,11\n*E\n"})
public final class SecretMenuFragment extends Fragment {

    static final class CN3 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Lazy f51525n;

        static final class j implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Lazy f51526n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ State f51527t;

            j(Lazy lazy, State state) {
                this.f51526n = lazy;
                this.f51527t = state;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit t(Lazy lazy, String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SecretMenuFragment.te(lazy).gh(it);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                rl((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void rl(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-834121705, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.SecretMenuFragment.onCreateView.<anonymous>.<anonymous> (SecretMenuFragment.kt:86)");
                }
                List listRl = CN3.O(this.f51527t).rl();
                composer.eF(-1105336722);
                boolean zE2 = composer.E2(this.f51526n);
                final Lazy lazy = this.f51526n;
                Object objIF = composer.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function1() { // from class: com.bendingspoons.secretmenu.ui.mainscreen.CN3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SecretMenuFragment.CN3.j.t(lazy, (String) obj);
                        }
                    };
                    composer.o(objIF);
                }
                composer.Xw();
                r4.Wre.t(listRl, (Function1) objIF, composer, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        CN3(Lazy lazy) {
            this.f51525n = lazy;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            nr((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void nr(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1553557749, i2, -1, "com.bendingspoons.secretmenu.ui.mainscreen.SecretMenuFragment.onCreateView.<anonymous> (SecretMenuFragment.kt:79)");
            }
            State stateT = FlowExtKt.t(SecretMenuFragment.te(this.f51525n).KN(), null, null, null, composer, 0, 7);
            E14.n nVarN = O(stateT).n();
            Modifier modifierO = WindowInsetsPadding_androidKt.O(Modifier.INSTANCE);
            composer.eF(1048705134);
            boolean zE2 = composer.E2(this.f51525n);
            final Lazy lazy = this.f51525n;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: com.bendingspoons.secretmenu.ui.mainscreen.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecretMenuFragment.CN3.J2(lazy);
                    }
                };
                composer.o(objIF);
            }
            Function0 function0 = (Function0) objIF;
            composer.Xw();
            composer.eF(1048707181);
            boolean zE22 = composer.E2(this.f51525n);
            final Lazy lazy2 = this.f51525n;
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: com.bendingspoons.secretmenu.ui.mainscreen.Wre
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecretMenuFragment.CN3.Uo(lazy2);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            o.rl(modifierO, nVarN, function0, (Function0) objIF2, ComposableLambdaKt.nr(-834121705, true, new j(this.f51525n, stateT), composer, 54), composer, 24576, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(Lazy lazy) {
            SecretMenuFragment.te(lazy).mUb();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final E14.I28 O(State state) {
            return (E14.I28) state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(Lazy lazy) {
            SecretMenuFragment.te(lazy).xMQ();
            return Unit.INSTANCE;
        }
    }

    public static final class I28 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Lazy f51528n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I28(Lazy lazy) {
            super(0);
            this.f51528n = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return FragmentViewModelLazyKt.O(this.f51528n).getViewModelStore();
        }
    }

    public static final class Ml extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f51529n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Function0 function0) {
            super(0);
            this.f51529n = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f51529n.invoke();
        }
    }

    public static final class Wre extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f51530n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Lazy f51531t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Wre(Function0 function0, Lazy lazy) {
            super(0);
            this.f51530n = function0;
            this.f51531t = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f51530n;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwnerO = FragmentViewModelLazyKt.O(this.f51531t);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerO instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerO : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t;
        }
    }

    public static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ TFv.Wre J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Lifecycle.State f51532O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f51533n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ SecretMenuFragment f51534r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LifecycleOwner f51535t;

        public static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ SecretMenuFragment J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ TFv.Wre f51536O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f51537n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f51538t;

            /* JADX INFO: renamed from: com.bendingspoons.secretmenu.ui.mainscreen.SecretMenuFragment$n$j$j, reason: collision with other inner class name */
            public static final class C0736j implements TFv.CN3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ vd f51539n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ SecretMenuFragment f51540t;

                public C0736j(vd vdVar, SecretMenuFragment secretMenuFragment) {
                    this.f51540t = secretMenuFragment;
                    this.f51539n = vdVar;
                }

                @Override // TFv.CN3
                public final Object rl(Object obj, Continuation continuation) {
                    com.bendingspoons.secretmenu.ui.mainscreen.Ml ml = (com.bendingspoons.secretmenu.ui.mainscreen.Ml) obj;
                    if (Intrinsics.areEqual(ml, Ml.n.f51517n)) {
                        this.f51540t.requireActivity().finish();
                    } else if (Intrinsics.areEqual(ml, Ml.w6.f51518n)) {
                        Boxing.boxBoolean(this.f51540t.nY().FX());
                    } else if (ml instanceof Ml.C0734Ml) {
                        this.f51540t.nY().P5(bH.w6.rl, BundleKt.n(TuplesKt.to("customItemId", ((Ml.C0734Ml) ml).n())));
                    } else if (ml instanceof Ml.I28) {
                        this.f51540t.nY().P5(bH.w6.f43257t, BundleKt.n(TuplesKt.to("menuItemId", ((Ml.I28) ml).n())));
                    } else {
                        if (!Intrinsics.areEqual(ml, Ml.j.f51516n)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ExitActivity.Companion companion = ExitActivity.INSTANCE;
                        Context applicationContext = this.f51540t.requireActivity().getApplication().getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        companion.n(applicationContext);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f51536O, continuation, this.J2);
                jVar.f51538t = obj;
                return jVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(TFv.Wre wre, Continuation continuation, SecretMenuFragment secretMenuFragment) {
                super(2, continuation);
                this.f51536O = wre;
                this.J2 = secretMenuFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f51537n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f51538t;
                    TFv.Wre wre = this.f51536O;
                    C0736j c0736j = new C0736j(vdVar, this.J2);
                    this.f51537n = 1;
                    if (wre.n(c0736j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f51535t, this.f51532O, this.J2, continuation, this.f51534r);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(LifecycleOwner lifecycleOwner, Lifecycle.State state, TFv.Wre wre, Continuation continuation, SecretMenuFragment secretMenuFragment) {
            super(2, continuation);
            this.f51535t = lifecycleOwner;
            this.f51532O = state;
            this.J2 = wre;
            this.f51534r = secretMenuFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f51533n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner lifecycleOwner = this.f51535t;
                Lifecycle.State state = this.f51532O;
                j jVar = new j(this.J2, null, this.f51534r);
                this.f51533n = 1;
                if (RepeatOnLifecycleKt.rl(lifecycleOwner, state, jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class w6 extends Lambda implements Function0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Fragment f51541n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Fragment fragment) {
            super(0);
            this.f51541n = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f51541n;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory g(SecretMenuFragment secretMenuFragment) {
        fuX.j jVar = fuX.J2;
        Dsr dsrN = Dsr.rl.n();
        Intrinsics.checkNotNull(dsrN);
        rv6 rv6VarT = dsrN.t();
        DSG.fuX fuxT = DSG.fuX.f1456n.t();
        Context applicationContext = secretMenuFragment.requireContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        PJ.w6 w6Var = new PJ.w6(applicationContext);
        Context applicationContext2 = secretMenuFragment.requireContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        PJ.n nVar = new PJ.n(applicationContext2);
        Bundle arguments = secretMenuFragment.getArguments();
        return jVar.rl(rv6VarT, fuxT, w6Var, nVar, arguments != null ? arguments.getString("menuItemId") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Function0 function0 = new Function0() { // from class: SRO.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SecretMenuFragment.g(this.f9753n);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Ml(new w6(this)));
        Lazy lazyT = FragmentViewModelLazyKt.t(this, Reflection.getOrCreateKotlinClass(fuX.class), new I28(lazy), new Wre(null, lazy), function0);
        TFv.Wre wreJ2 = te(lazyT).J2();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C.nr(LifecycleOwnerKt.n(viewLifecycleOwner), null, null, new n(viewLifecycleOwner, Lifecycle.State.J2, wreJ2, null, this), 3, null);
        return VA.n.rl(this, null, null, ComposableLambdaKt.rl(-1553557749, true, new CN3(lazyT)), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavController nY() {
        Fragment fragmentXg = requireActivity().getSupportFragmentManager().xg(bH.w6.f43256n);
        Intrinsics.checkNotNull(fragmentXg, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return ((NavHostFragment) fragmentXg).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fuX te(Lazy lazy) {
        return (fuX) lazy.getValue();
    }
}
