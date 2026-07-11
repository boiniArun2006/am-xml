package com.alightcreative.onboarding.ui;

import GJW.C;
import GJW.vd;
import HI0.M5;
import JqP.fuX;
import a4.CN3;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.windowsizeclass.AndroidWindowSizeClass_androidKt;
import androidx.compose.material3.windowsizeclass.WindowSizeClass;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.WindowCompat;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.HasDefaultViewModelProviderFactory;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.ComponentActivityKt;
import androidx.view.viewmodel.CreationExtras;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.view.viewmodel.compose.ViewModelKt;
import com.alightcreative.onboarding.ui.I28;
import com.alightcreative.onboarding.ui.OnboardingActivity;
import com.alightcreative.onboarding.ui.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import uW.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/alightcreative/onboarding/ui/OnboardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/alightcreative/onboarding/ui/w6;", "viewModel", "G7", "(Lcom/alightcreative/onboarding/ui/w6;Landroidx/compose/runtime/Composer;I)V", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOnboardingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnboardingActivity.kt\ncom/alightcreative/onboarding/ui/OnboardingActivity\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,294:1\n557#2:295\n554#2,6:296\n1247#3,3:302\n1250#3,3:306\n1247#3,6:309\n1247#3,6:315\n1247#3,6:321\n1247#3,6:327\n1247#3,6:333\n1247#3,6:339\n555#4:305\n*S KotlinDebug\n*F\n+ 1 OnboardingActivity.kt\ncom/alightcreative/onboarding/ui/OnboardingActivity\n*L\n79#1:295\n79#1:296,6\n79#1:302,3\n79#1:306,3\n82#1:309,6\n91#1:315,6\n92#1:321,6\n93#1:327,6\n94#1:333,6\n100#1:339,6\n79#1:305\n*E\n"})
public final class OnboardingActivity extends com.alightcreative.onboarding.ui.j {

    static final class I28 implements Function2 {
        I28() {
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
                ComposerKt.p5(1981964088, i2, -1, "com.alightcreative.onboarding.ui.OnboardingActivity.onCreate.<anonymous> (OnboardingActivity.kt:67)");
            }
            OnboardingActivity onboardingActivity = OnboardingActivity.this;
            composer.eF(-2135558586);
            composer.te(1890788296);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryN = HiltViewModelKt.n(viewModelStoreOwnerT, composer, 0);
            composer.te(1729797275);
            ViewModel viewModelRl = ViewModelKt.rl(com.alightcreative.onboarding.ui.w6.class, viewModelStoreOwnerT, null, factoryN, viewModelStoreOwnerT instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwnerT).getDefaultViewModelCreationExtras() : CreationExtras.Empty.f39070t, composer, 36936, 0);
            composer.M7();
            composer.M7();
            uW.w6 w6Var = (uW.w6) viewModelRl;
            composer.eF(-589589419);
            Lifecycle lifecycleRegistry = ((LifecycleOwner) composer.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycleRegistry();
            composer.eF(23938127);
            boolean zE2 = composer.E2(w6Var) | composer.E2(lifecycleRegistry);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Wre(w6Var, lifecycleRegistry, null);
                composer.o(objIF);
            }
            composer.Xw();
            EffectsKt.nr(w6Var, lifecycleRegistry, (Function2) objIF, composer, 0);
            composer.Xw();
            composer.Xw();
            onboardingActivity.G7((com.alightcreative.onboarding.ui.w6) w6Var, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function1 {
        Ml(Object obj) {
            super(1, obj, com.alightcreative.onboarding.ui.w6.class, "getUri", "getUri(I)Lcom/bendingspoons/core/functional/Either;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final x0X.n n(int i2) {
            return ((com.alightcreative.onboarding.ui.w6) this.receiver).HI(i2);
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46892n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ CN3 f46893t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f46893t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(CN3 cn3, Continuation continuation) {
            super(2, continuation);
            this.f46893t = cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46892n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                CN3 cn3 = this.f46893t;
                this.f46892n = 1;
                if (cn3.nr(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
        n(Object obj) {
            super(0, obj, com.alightcreative.onboarding.ui.w6.class, "onGotItButtonClicked", "onGotItButtonClicked()V", 0);
        }

        public final void n() {
            ((com.alightcreative.onboarding.ui.w6) this.receiver).ck();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
        w6(Object obj) {
            super(0, obj, com.alightcreative.onboarding.ui.w6.class, "onSkipButtonClicked", "onSkipButtonClicked()V", 0);
        }

        public final void n() {
            ((com.alightcreative.onboarding.ui.w6) this.receiver).Ik();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n1(OnboardingActivity onboardingActivity, com.alightcreative.onboarding.ui.w6 w6Var, int i2, Composer composer, int i3) {
        onboardingActivity.G7(w6Var, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eWT(vd vdVar, CN3 cn3) {
        C.nr(vdVar, null, null, new j(cn3, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ul(OnboardingActivity onboardingActivity, com.alightcreative.onboarding.ui.n it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!(it instanceof n.j)) {
            throw new NoWhenBranchMatchedException();
        }
        onboardingActivity.setResult(-1);
        onboardingActivity.finish();
        return Unit.INSTANCE;
    }

    public final void G7(final com.alightcreative.onboarding.ui.w6 viewModel, Composer composer, final int i2) {
        int i3;
        boolean z2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerKN = composer.KN(1680326644);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(viewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(this) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1680326644, i5, -1, "com.alightcreative.onboarding.ui.OnboardingActivity.OnboardingActivityContent (OnboardingActivity.kt:77)");
            }
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF);
            }
            final vd vdVar = (vd) objIF;
            List listN = T.n.n();
            composerKN.eF(1934045070);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new Function0() { // from class: JqP.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Integer.valueOf(OnboardingActivity.fcU());
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            final CN3 cn3Az = a4.Wre.az(listN, PagerStateKt.qie(0, 0.0f, (Function0) objIF2, composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 3), composerKN, 0);
            WindowSizeClass windowSizeClassN = AndroidWindowSizeClass_androidKt.n(this, composerKN, (i5 >> 3) & 14);
            com.alightcreative.onboarding.ui.I28 i28 = (com.alightcreative.onboarding.ui.I28) LiveDataAdapterKt.n(viewModel.t(), composerKN, 0).getValue();
            composerKN.eF(1934049319);
            if (i28 instanceof I28.j) {
                boolean zN = ((I28.j) i28).n();
                composerKN.eF(1934060835);
                boolean zE2 = composerKN.E2(vdVar) | composerKN.E2(cn3Az);
                Object objIF3 = composerKN.iF();
                if (zE2 || objIF3 == companion.n()) {
                    objIF3 = new Function0() { // from class: JqP.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OnboardingActivity.eWT(vdVar, cn3Az);
                        }
                    };
                    composerKN.o(objIF3);
                }
                Function0 function0 = (Function0) objIF3;
                composerKN.Xw();
                composerKN.eF(1934063726);
                boolean zE22 = composerKN.E2(viewModel);
                Object objIF4 = composerKN.iF();
                if (zE22 || objIF4 == companion.n()) {
                    objIF4 = new n(viewModel);
                    composerKN.o(objIF4);
                }
                composerKN.Xw();
                Function0 function02 = (Function0) ((KFunction) objIF4);
                composerKN.eF(1934065933);
                boolean zE23 = composerKN.E2(viewModel);
                Object objIF5 = composerKN.iF();
                if (zE23 || objIF5 == companion.n()) {
                    objIF5 = new w6(viewModel);
                    composerKN.o(objIF5);
                }
                composerKN.Xw();
                Function0 function03 = (Function0) ((KFunction) objIF5);
                composerKN.eF(1934068256);
                boolean zE24 = composerKN.E2(viewModel);
                Object objIF6 = composerKN.iF();
                if (zE24 || objIF6 == companion.n()) {
                    objIF6 = new Ml(viewModel);
                    composerKN.o(objIF6);
                }
                composerKN.Xw();
                z2 = false;
                fuX.nr(cn3Az, zN, windowSizeClassN, function0, function02, function03, (Function1) ((KFunction) objIF6), composerKN, 0);
                composerKN = composerKN;
            } else {
                z2 = false;
            }
            composerKN.Xw();
            composerKN.eF(1934072226);
            boolean z3 = (i5 & 112) == 32 ? true : z2;
            Object objIF7 = composerKN.iF();
            if (z3 || objIF7 == companion.n()) {
                objIF7 = new Function1() { // from class: JqP.w6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OnboardingActivity.ul(this.f4723n, (com.alightcreative.onboarding.ui.n) obj);
                    }
                };
                composerKN.o(objIF7);
            }
            composerKN.Xw();
            uW.I28.rl(viewModel, (Function1) objIF7, composerKN, i5 & 14);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: JqP.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnboardingActivity.n1(this.f4699n, viewModel, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int fcU() {
        return T.n.n().size();
    }

    @Override // com.alightcreative.onboarding.ui.j, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.rl(getWindow(), false);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        M5.rl(window, 0, getColor(2131099665), false, 4, null);
        ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(1981964088, true, new I28()), 1, null);
    }
}
