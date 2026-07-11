package M;

import M.Ogx;
import QmE.j;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
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
import com.alightcreative.app.motion.activities.creatorprogram.qas.ui.QAsActivity;
import com.alightcreative.app.motion.ranking.ui.editprofile.EditProfileActivity;
import ka.eO;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0004R\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LM/Ogx;", "Landroidx/fragment/app/Fragment;", "LKC/g9s;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "Uo", "LQmE/iF;", "o", "LQmE/iF;", "g", "()LQmE/iF;", "setEventLogger", "(LQmE/iF;)V", "eventLogger", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Ogx extends w6 implements KC.g9s {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public QmE.iF eventLogger;

    static final class j implements Function2 {
        j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit az(Ogx ogx) {
            QAsActivity.Companion companion = QAsActivity.INSTANCE;
            Context contextRequireContext = ogx.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            companion.n(contextRequireContext, F2p.Ml.f2488t);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(Ogx ogx, FX.Ml it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Context contextRequireContext = ogx.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            XoT.fuX.S(contextRequireContext, it.n());
            return Unit.INSTANCE;
        }

        public final void Uo(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-998825571, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.MainTabRankingFragment.onCreateView.<anonymous>.<anonymous> (MainTabRankingFragment.kt:44)");
            }
            composer.eF(-2135558586);
            composer.te(1890788296);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryN = HiltViewModelKt.n(viewModelStoreOwnerT, composer, 0);
            composer.te(1729797275);
            ViewModel viewModelRl = ViewModelKt.rl(ka.aC.class, viewModelStoreOwnerT, null, factoryN, viewModelStoreOwnerT instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerT).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t, composer, 36936, 0);
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
            ka.eO eOVar = (ka.eO) LiveDataAdapterKt.n(((ka.aC) w6Var).t(), composer, 0).getValue();
            if (eOVar instanceof eO.j) {
                composer.eF(-1910092983);
                eO.j jVar = (eO.j) eOVar;
                composer.eF(-1910090946);
                boolean zE22 = composer.E2(Ogx.this);
                final Ogx ogx = Ogx.this;
                Object objIF2 = composer.iF();
                if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0() { // from class: M.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Ogx.j.KN(ogx);
                        }
                    };
                    composer.o(objIF2);
                }
                Function0 function0 = (Function0) objIF2;
                composer.Xw();
                composer.eF(-1910083870);
                boolean zE23 = composer.E2(Ogx.this);
                final Ogx ogx2 = Ogx.this;
                Object objIF3 = composer.iF();
                if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new Function1() { // from class: M.cA
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Ogx.j.mUb(ogx2, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.o(objIF3);
                }
                Function1 function1 = (Function1) objIF3;
                composer.Xw();
                composer.eF(-1910074677);
                boolean zE24 = composer.E2(Ogx.this);
                final Ogx ogx3 = Ogx.this;
                Object objIF4 = composer.iF();
                if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                    objIF4 = new Function0() { // from class: M.g9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Ogx.j.gh(ogx3);
                        }
                    };
                    composer.o(objIF4);
                }
                Function0 function02 = (Function0) objIF4;
                composer.Xw();
                composer.eF(-1910067257);
                boolean zE25 = composer.E2(Ogx.this);
                final Ogx ogx4 = Ogx.this;
                Object objIF5 = composer.iF();
                if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                    objIF5 = new Function0() { // from class: M.L0y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Ogx.j.qie(ogx4);
                        }
                    };
                    composer.o(objIF5);
                }
                Function0 function03 = (Function0) objIF5;
                composer.Xw();
                composer.eF(-1910059953);
                boolean zE26 = composer.E2(Ogx.this);
                final Ogx ogx5 = Ogx.this;
                Object objIF6 = composer.iF();
                if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                    objIF6 = new Function0() { // from class: M.CM
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Ogx.j.az(ogx5);
                        }
                    };
                    composer.o(objIF6);
                }
                Function0 function04 = (Function0) objIF6;
                composer.Xw();
                composer.eF(-1910051280);
                boolean zE27 = composer.E2(Ogx.this);
                final Ogx ogx6 = Ogx.this;
                Object objIF7 = composer.iF();
                if (zE27 || objIF7 == Composer.INSTANCE.n()) {
                    objIF7 = new Function1() { // from class: M.crp
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Ogx.j.xMQ(ogx6, (FX.Ml) obj);
                        }
                    };
                    composer.o(objIF7);
                }
                composer.Xw();
                ka.vd.mUb(jVar, function0, function1, function02, function03, function04, (Function1) objIF7, composer, 0);
                composer.Xw();
            } else {
                if (eOVar != null) {
                    composer.eF(-1910096730);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composer.eF(918102661);
                Dj7.u.rl(true, Color.INSTANCE.J2(), composer, 54, 0);
                composer.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            Uo((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit KN(Ogx ogx) {
            FragmentActivity activity = ogx.getActivity();
            if (activity != null) {
                PJ9.DAz.E2(activity, null, 1, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit gh(Ogx ogx) {
            ka.fuX fux;
            ogx.g().n(j.giR.f8510n);
            KeyEventDispatcher.Component activity = ogx.getActivity();
            if (activity instanceof ka.fuX) {
                fux = (ka.fuX) activity;
            } else {
                fux = null;
            }
            if (fux != null) {
                fux.aYN();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit mUb(Ogx ogx, boolean z2) {
            ka.fuX fux;
            ogx.g().n(new j.CM(rWZ.aC.f73077n));
            KeyEventDispatcher.Component activity = ogx.getActivity();
            if (activity instanceof ka.fuX) {
                fux = (ka.fuX) activity;
            } else {
                fux = null;
            }
            if (fux != null) {
                fux.O(z2);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit qie(Ogx ogx) {
            ogx.g().n(j.nr.f8537n);
            EditProfileActivity.Companion companion = EditProfileActivity.INSTANCE;
            Context contextRequireContext = ogx.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            companion.n(contextRequireContext);
            return Unit.INSTANCE;
        }
    }

    public final QmE.iF g() {
        QmE.iF iFVar = this.eventLogger;
        if (iFVar != null) {
            return iFVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.rl);
        composeView.setContent(ComposableLambdaKt.rl(-998825571, true, new j()));
        return composeView;
    }

    @Override // KC.g9s
    public void Uo() {
        KC.rrk rrkVar;
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof KC.rrk) {
            rrkVar = (KC.rrk) activity;
        } else {
            rrkVar = null;
        }
        if (rrkVar != null) {
            rrkVar.XQ(0);
        }
    }
}
