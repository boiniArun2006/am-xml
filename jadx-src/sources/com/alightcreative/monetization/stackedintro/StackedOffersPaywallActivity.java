package com.alightcreative.monetization.stackedintro;

import Dj7.u;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.view.EdgeToEdge;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.OnBackPressedCallback;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.ComponentActivityKt;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import com.alightcreative.monetization.stackedintro.C;
import com.alightcreative.monetization.stackedintro.StackedOffersPaywallActivity;
import com.alightcreative.monorepo.settings.StackedIntroOffersEntity;
import g8.s4;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/alightcreative/monetization/stackedintro/StackedOffersPaywallActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/alightcreative/monetization/stackedintro/C$Ml;", "r", "Lcom/alightcreative/monetization/stackedintro/C$Ml;", "eTf", "()Lcom/alightcreative/monetization/stackedintro/C$Ml;", "setViewModelFactory", "(Lcom/alightcreative/monetization/stackedintro/C$Ml;)V", "viewModelFactory", "Lcom/alightcreative/monorepo/settings/StackedIntroOffersEntity;", "o", "Lkotlin/Lazy;", "m", "()Lcom/alightcreative/monorepo/settings/StackedIntroOffersEntity;", com.safedk.android.utils.j.f63190c, "Z", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StackedOffersPaywallActivity extends j {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Lazy configuration = LazyKt.lazy(new Function0() { // from class: K.j
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StackedOffersPaywallActivity.ijL(this.f4725n);
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public C.Ml viewModelFactory;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f46793S = 8;

    /* JADX INFO: renamed from: com.alightcreative.monetization.stackedintro.StackedOffersPaywallActivity$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent n(Context context, StackedIntroOffersEntity configuration, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intent intent = new Intent(context, (Class<?>) StackedOffersPaywallActivity.class);
            intent.putExtras(BundleKt.n(TuplesKt.to("ARG_CONFIG", configuration), TuplesKt.to("ARG_CAN_BE_DISMISSED_WITH_AD", Boolean.valueOf(z2))));
            return intent;
        }
    }

    static final class n implements Function2 {

        static final class j implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ C f46798n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ StackedOffersPaywallActivity f46799t;

            /* JADX INFO: renamed from: com.alightcreative.monetization.stackedintro.StackedOffersPaywallActivity$n$j$j, reason: collision with other inner class name */
            static final class C0671j implements Function3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ C f46800n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ StackedOffersPaywallActivity f46801t;

                C0671j(C c2, StackedOffersPaywallActivity stackedOffersPaywallActivity) {
                    this.f46800n = c2;
                    this.f46801t = stackedOffersPaywallActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit KN(C c2, OnBackPressedCallback BackPressHandler) {
                    Intrinsics.checkNotNullParameter(BackPressHandler, "$this$BackPressHandler");
                    c2.S();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit gh(C c2, s4 it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    c2.ViF(it);
                    return Unit.INSTANCE;
                }

                public final void Uo(PaddingValues innerPadding, Composer composer, int i2) {
                    int i3;
                    Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                    if ((i2 & 6) == 0) {
                        i3 = (composer.p5(innerPadding) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i3 & 19) == 18 && composer.xMQ()) {
                        composer.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1962901648, i3, -1, "com.alightcreative.monetization.stackedintro.StackedOffersPaywallActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (StackedOffersPaywallActivity.kt:69)");
                    }
                    State stateN = LiveDataAdapterKt.n(this.f46800n.t(), composer, 0);
                    u.rl(stateN.getValue() instanceof C.CN3.n, 0L, composer, 0, 2);
                    composer.eF(1285287211);
                    boolean zE2 = composer.E2(this.f46800n);
                    final C c2 = this.f46800n;
                    Object objIF = composer.iF();
                    if (zE2 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function1() { // from class: com.alightcreative.monetization.stackedintro.w6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return StackedOffersPaywallActivity.n.j.C0671j.KN(c2, (OnBackPressedCallback) obj);
                            }
                        };
                        composer.o(objIF);
                    }
                    composer.Xw();
                    N.I28.O(null, (Function1) objIF, composer, 0, 1);
                    C.CN3 cn3 = (C.CN3) stateN.getValue();
                    if (cn3 != null && (cn3 instanceof C.CN3.j)) {
                        Modifier modifierKN = PaddingKt.KN(Modifier.INSTANCE, innerPadding);
                        C.CN3.j jVar = (C.CN3.j) cn3;
                        composer.eF(1285302911);
                        boolean zE22 = composer.E2(this.f46800n);
                        final C c4 = this.f46800n;
                        Object objIF2 = composer.iF();
                        if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                            objIF2 = new Function0() { // from class: com.alightcreative.monetization.stackedintro.Ml
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return StackedOffersPaywallActivity.n.j.C0671j.mUb(c4);
                                }
                            };
                            composer.o(objIF2);
                        }
                        Function0 function0 = (Function0) objIF2;
                        composer.Xw();
                        composer.eF(1285305672);
                        boolean zE23 = composer.E2(this.f46800n);
                        final C c5 = this.f46800n;
                        Object objIF3 = composer.iF();
                        if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                            objIF3 = new Function1() { // from class: com.alightcreative.monetization.stackedintro.I28
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return StackedOffersPaywallActivity.n.j.C0671j.gh(c5, (s4) obj);
                                }
                            };
                            composer.o(objIF3);
                        }
                        Function1 function1 = (Function1) objIF3;
                        composer.Xw();
                        composer.eF(1285308646);
                        boolean zE24 = composer.E2(this.f46800n);
                        final C c6 = this.f46800n;
                        Object objIF4 = composer.iF();
                        if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                            objIF4 = new Function1() { // from class: com.alightcreative.monetization.stackedintro.Wre
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return StackedOffersPaywallActivity.n.j.C0671j.qie(c6, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.o(objIF4);
                        }
                        Function1 function12 = (Function1) objIF4;
                        composer.Xw();
                        composer.eF(1285311791);
                        boolean zE25 = composer.E2(this.f46800n);
                        final C c7 = this.f46800n;
                        Object objIF5 = composer.iF();
                        if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                            objIF5 = new Function0() { // from class: com.alightcreative.monetization.stackedintro.CN3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return StackedOffersPaywallActivity.n.j.C0671j.az(c7);
                                }
                            };
                            composer.o(objIF5);
                        }
                        Function0 function02 = (Function0) objIF5;
                        composer.Xw();
                        composer.eF(1285314951);
                        boolean zE26 = composer.E2(this.f46800n) | composer.E2(this.f46801t);
                        final C c8 = this.f46800n;
                        final StackedOffersPaywallActivity stackedOffersPaywallActivity = this.f46801t;
                        Object objIF6 = composer.iF();
                        if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                            objIF6 = new Function0() { // from class: com.alightcreative.monetization.stackedintro.fuX
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return StackedOffersPaywallActivity.n.j.C0671j.xMQ(c8, stackedOffersPaywallActivity);
                                }
                            };
                            composer.o(objIF6);
                        }
                        composer.Xw();
                        aC.rl(modifierKN, jVar, function0, function1, function12, function02, (Function0) objIF6, composer, 0, 0);
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    Uo((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit az(C c2) {
                    c2.g();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit mUb(C c2) {
                    c2.WPU();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit qie(C c2, boolean z2) {
                    c2.aYN(z2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit xMQ(C c2, StackedOffersPaywallActivity stackedOffersPaywallActivity) {
                    c2.nY(stackedOffersPaywallActivity);
                    return Unit.INSTANCE;
                }
            }

            j(C c2, StackedOffersPaywallActivity stackedOffersPaywallActivity) {
                this.f46798n = c2;
                this.f46799t = stackedOffersPaywallActivity;
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
                    ComposerKt.p5(-1113839967, i2, -1, "com.alightcreative.monetization.stackedintro.StackedOffersPaywallActivity.onCreate.<anonymous>.<anonymous> (StackedOffersPaywallActivity.kt:68)");
                }
                ScaffoldKt.n(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.nr(-1962901648, true, new C0671j(this.f46798n, this.f46799t), composer, 54), composer, 805306374, 510);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(StackedOffersPaywallActivity stackedOffersPaywallActivity, C.Wre action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof C.Wre.j) {
                if (((C.Wre.j) action).n()) {
                    stackedOffersPaywallActivity.setResult(-1);
                } else if (stackedOffersPaywallActivity.getIntent().getBooleanExtra("ARG_CAN_BE_DISMISSED_WITH_AD", false)) {
                    stackedOffersPaywallActivity.setResult(-3);
                } else {
                    stackedOffersPaywallActivity.setResult(-2);
                }
                stackedOffersPaywallActivity.finish();
            }
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
                ComposerKt.p5(1377882325, i2, -1, "com.alightcreative.monetization.stackedintro.StackedOffersPaywallActivity.onCreate.<anonymous> (StackedOffersPaywallActivity.kt:43)");
            }
            ViewModelProvider.Factory factoryN = C.f46753r.n(StackedOffersPaywallActivity.this.eTf(), StackedOffersPaywallActivity.this.m());
            composer.eF(297168033);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("Required value was null.");
            }
            uW.w6 w6Var = (uW.w6) new ViewModelProvider(viewModelStoreOwnerT, factoryN).n(C.class);
            composer.eF(-589589419);
            Lifecycle lifecycleRegistry = ((LifecycleOwner) composer.ty(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycleRegistry();
            composer.eF(23938127);
            boolean zE2 = composer.E2(w6Var) | composer.E2(lifecycleRegistry);
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new uW.Wre(w6Var, lifecycleRegistry, null);
                composer.o(objIF);
            }
            composer.Xw();
            EffectsKt.nr(w6Var, lifecycleRegistry, (Function2) objIF, composer, 0);
            composer.Xw();
            composer.Xw();
            C c2 = (C) w6Var;
            composer.eF(-1406755151);
            boolean zE22 = composer.E2(StackedOffersPaywallActivity.this);
            final StackedOffersPaywallActivity stackedOffersPaywallActivity = StackedOffersPaywallActivity.this;
            Object objIF2 = composer.iF();
            if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function1() { // from class: com.alightcreative.monetization.stackedintro.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return StackedOffersPaywallActivity.n.t(stackedOffersPaywallActivity, (C.Wre) obj);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            uW.I28.rl(c2, (Function1) objIF2, composer, 0);
            H9N.w6.rl(ComposableLambdaKt.nr(-1113839967, true, new j(c2, StackedOffersPaywallActivity.this), composer, 54), composer, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StackedIntroOffersEntity m() {
        return (StackedIntroOffersEntity) this.configuration.getValue();
    }

    public final C.Ml eTf() {
        C.Ml ml = this.viewModelFactory;
        if (ml != null) {
            return ml;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackedIntroOffersEntity ijL(StackedOffersPaywallActivity stackedOffersPaywallActivity) {
        Bundle extras = stackedOffersPaywallActivity.getIntent().getExtras();
        if (extras != null) {
            Object objN = BundleCompat.n(extras, "ARG_CONFIG", StackedIntroOffersEntity.class);
            Intrinsics.checkNotNull(objN);
            return (StackedIntroOffersEntity) objN;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.alightcreative.monetization.stackedintro.j, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.rl(this, null, null, 3, null);
        ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(1377882325, true, new n()), 1, null);
    }
}
