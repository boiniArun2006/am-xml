package i6;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.fragment.app.FragmentKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.view.viewmodel.compose.ViewModelKt;
import i6.aC;
import i6.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qcD.nehv.Apsps;
import yF6.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Li6/Ml;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Li6/Wre;", "viewModel", "", "iF", "(Li6/Wre;Landroidx/compose/runtime/Composer;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "o", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppSetupFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetupFragment.kt\ncom/alightcreative/setup/ui/AppSetupFragment\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,82:1\n1247#2,6:83\n*S KotlinDebug\n*F\n+ 1 AppSetupFragment.kt\ncom/alightcreative/setup/ui/AppSetupFragment\n*L\n68#1:83,6\n*E\n"})
public final class Ml extends C {

    static final class n implements Function2 {

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        static final class j implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Ml f68110n;

            j(Ml ml) {
                this.f68110n = ml;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                n((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void n(Composer composer, int i2) {
                if ((i2 & 3) == 2 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(409293862, i2, -1, Apsps.tkRjKyJolggwV);
                }
                Ml ml = this.f68110n;
                composer.eF(-2135558586);
                composer.te(1890788296);
                ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
                if (viewModelStoreOwnerT == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModelProvider.Factory factoryN = HiltViewModelKt.n(viewModelStoreOwnerT, composer, 0);
                composer.te(1729797275);
                ViewModel viewModelRl = ViewModelKt.rl(Wre.class, viewModelStoreOwnerT, null, factoryN, viewModelStoreOwnerT instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerT).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t, composer, 36936, 0);
                composer.M7();
                composer.M7();
                uW.w6 w6Var = (uW.w6) viewModelRl;
                composer.eF(-589589419);
                Lifecycle lifecycle = ((LifecycleOwner) composer.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
                composer.eF(23938127);
                boolean zE2 = composer.E2(w6Var) | composer.E2(lifecycle);
                Object objIF = composer.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new uW.Wre(w6Var, lifecycle, null);
                    composer.o(objIF);
                }
                composer.Xw();
                EffectsKt.nr(w6Var, lifecycle, (Function2) objIF, composer, 0);
                composer.Xw();
                composer.Xw();
                ml.iF((Wre) w6Var, composer, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        n() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1717110138, i2, -1, "com.alightcreative.setup.ui.AppSetupFragment.onCreateView.<anonymous>.<anonymous> (AppSetupFragment.kt:34)");
            }
            MaterialThemeKt.n(null, null, null, ComposableLambdaKt.nr(409293862, true, new j(Ml.this), composer, 54), composer, 3072, 7);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E2(Ml ml, Wre wre, int i2, Composer composer, int i3) {
        ml.iF(wre, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fD(Ml ml, j action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!Intrinsics.areEqual(action, j.C0966j.f68117n)) {
            throw new NoWhenBranchMatchedException();
        }
        Bundle EMPTY = Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        FragmentKt.n(ml, "setup_key", EMPTY);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.rl);
        composeView.setContent(ComposableLambdaKt.rl(1717110138, true, new n()));
        return composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iF(final Wre wre, Composer composer, final int i2) {
        int i3;
        int i5;
        boolean zE2;
        int i7;
        Composer composerKN = composer.KN(-1141970018);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                zE2 = composerKN.p5(wre);
            } else {
                zE2 = composerKN.E2(wre);
            }
            if (zE2) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (composerKN.p5(this)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1141970018, i3, -1, "com.alightcreative.setup.ui.AppSetupFragment.AppSetupScreen (AppSetupFragment.kt:44)");
            }
            boolean z2 = false;
            aC aCVar = (aC) LiveDataAdapterKt.n(wre.t(), composerKN, 0).getValue();
            if (Intrinsics.areEqual(aCVar, aC.n.f68114n)) {
                composerKN.eF(1587238200);
                yF6.w6.t(Ml.n.f75589n, null, composerKN, 6, 2);
                composerKN.Xw();
            } else if (Intrinsics.areEqual(aCVar, aC.w6.f68115n)) {
                composerKN.eF(1587368090);
                yF6.w6.t(new Ml.j(StringResources_androidKt.t(2132017274, composerKN, 6), StringResources_androidKt.t(2132017275, composerKN, 6)), null, composerKN, 0, 2);
                composerKN.Xw();
            } else if (Intrinsics.areEqual(aCVar, aC.j.f68113n)) {
                composerKN.eF(1587742012);
                yF6.w6.t(new Ml.j(StringResources_androidKt.t(2132017272, composerKN, 6), StringResources_androidKt.t(2132017273, composerKN, 6)), null, composerKN, 0, 2);
                composerKN.Xw();
            } else if (aCVar == null) {
                composerKN.eF(1990890978);
                composerKN.Xw();
            } else {
                composerKN.eF(1990861786);
                composerKN.Xw();
                throw new NoWhenBranchMatchedException();
            }
            composerKN.eF(1990892715);
            if ((i3 & 112) == 32) {
                z2 = true;
            }
            Object objIF = composerKN.iF();
            if (z2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: i6.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Ml.fD(this.f68118n, (j) obj);
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            uW.I28.rl(wre, (Function1) objIF, composerKN, i3 & 14);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: i6.w6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Ml.E2(this.f68120n, wre, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
