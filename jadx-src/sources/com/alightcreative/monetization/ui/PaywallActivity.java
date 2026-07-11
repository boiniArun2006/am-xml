package com.alightcreative.monetization.ui;

import GJW.vd;
import HI0.M5;
import HI0.lej;
import R5.I28;
import R5.Ml;
import R5.n;
import Zd1.M;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.WindowCompat;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import androidx.view.OnBackPressedCallback;
import androidx.view.ViewModelProvider;
import androidx.view.ViewModelStoreOwner;
import androidx.view.compose.ComponentActivityKt;
import androidx.view.viewmodel.compose.LocalViewModelStoreOwner;
import com.alightcreative.monetization.ui.I28;
import com.alightcreative.monetization.ui.PaywallActivity;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.internal.play_billing.LFHI.HrvQKfmFZJudBc;
import com.safedk.android.internal.d;
import com.safedk.android.utils.Logger;
import f.EnumC1982eO;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0016\u0010\u0003R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/alightcreative/monetization/ui/PaywallActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroidx/compose/foundation/ScrollState;", "scrollState", "", "delayMillis", "", InneractiveMediationDefs.GENDER_FEMALE, "(Landroidx/compose/foundation/ScrollState;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Qu", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/alightcreative/monetization/ui/I28;", "viewModel", "Landroid/app/Activity;", "activity", "EWS", "(Lcom/alightcreative/monetization/ui/I28;Landroid/app/Activity;Landroidx/compose/runtime/Composer;I)V", "onResume", "Lcom/alightcreative/monetization/ui/I28$n;", "r", "Lcom/alightcreative/monetization/ui/I28$n;", "Uf", "()Lcom/alightcreative/monetization/ui/I28$n;", "setViewModelFactory", "(Lcom/alightcreative/monetization/ui/I28$n;)V", "viewModelFactory", "o", "Lcom/alightcreative/monetization/ui/I28;", "Z", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPaywallActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaywallActivity.kt\ncom/alightcreative/monetization/ui/PaywallActivity\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,374:1\n557#2:375\n554#2,6:376\n1247#3,3:382\n1250#3,3:386\n1247#3,6:389\n1247#3,6:395\n1247#3,6:401\n1247#3,6:407\n1247#3,6:413\n1247#3,6:419\n1247#3,6:425\n1247#3,6:431\n1247#3,6:437\n1247#3,6:443\n1247#3,6:449\n1247#3,6:455\n1247#3,6:461\n1247#3,6:467\n1247#3,6:473\n1247#3,6:479\n1247#3,6:485\n1247#3,6:491\n1247#3,6:497\n1247#3,6:503\n1247#3,6:509\n1247#3,6:515\n1247#3,6:521\n1247#3,6:527\n1247#3,6:533\n1247#3,6:539\n1247#3,6:545\n1247#3,6:551\n1247#3,6:557\n1247#3,6:563\n1247#3,6:569\n1247#3,6:575\n1247#3,6:581\n555#4:385\n*S KotlinDebug\n*F\n+ 1 PaywallActivity.kt\ncom/alightcreative/monetization/ui/PaywallActivity\n*L\n119#1:375\n119#1:376,6\n119#1:382,3\n119#1:386,3\n125#1:389,6\n133#1:395,6\n140#1:401,6\n141#1:407,6\n149#1:413,6\n150#1:419,6\n151#1:425,6\n157#1:431,6\n163#1:437,6\n164#1:443,6\n165#1:449,6\n173#1:455,6\n186#1:461,6\n187#1:467,6\n188#1:473,6\n194#1:479,6\n200#1:485,6\n206#1:491,6\n209#1:497,6\n216#1:503,6\n217#1:509,6\n218#1:515,6\n219#1:521,6\n220#1:527,6\n221#1:533,6\n228#1:539,6\n229#1:545,6\n230#1:551,6\n231#1:557,6\n237#1:563,6\n238#1:569,6\n245#1:575,6\n308#1:581,6\n119#1:385\n*E\n"})
public final class PaywallActivity extends j {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private com.alightcreative.monetization.ui.I28 viewModel;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public I28.n viewModelFactory;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f46837S = 8;

    /* synthetic */ class C extends FunctionReferenceImpl implements Function0 {
        C(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, "onManageSubscriptionClicked", "onManageSubscriptionClicked()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).ijL();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class Ml extends FunctionReferenceImpl implements Function0 {
        Ml(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, "onManageSubscriptionClicked", "onManageSubscriptionClicked()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).ijL();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class Pl extends FunctionReferenceImpl implements Function0 {
        Pl(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, "onCloseAttemptConfirmed", "onCloseAttemptConfirmed()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).Nxk();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    static final class Q implements Function3 {
        final /* synthetic */ Activity J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f46850O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ R5.Ml f46851n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ vd f46852r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.alightcreative.monetization.ui.I28 f46853t;

        /* synthetic */ class CN3 extends FunctionReferenceImpl implements Function0 {
            CN3(Object obj) {
                super(0, obj, com.alightcreative.monetization.ui.I28.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0);
            }

            public final void n() {
                ((com.alightcreative.monetization.ui.I28) this.receiver).Y();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class Dsr extends FunctionReferenceImpl implements Function1 {
            Dsr(Object obj) {
                super(1, obj, com.alightcreative.monetization.ui.I28.class, "onTierSelected", "onTierSelected(I)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void n(int i2) {
                ((com.alightcreative.monetization.ui.I28) this.receiver).fcU(i2);
            }
        }

        /* synthetic */ class I28 extends FunctionReferenceImpl implements Function0 {
            I28(Object obj) {
                super(0, obj, com.alightcreative.monetization.ui.I28.class, "onPhaseEnded", "onPhaseEnded()V", 0);
            }

            public final void n() {
                ((com.alightcreative.monetization.ui.I28) this.receiver).eTf();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class Ml extends FunctionReferenceImpl implements Function0 {
            Ml(Object obj) {
                super(0, obj, com.alightcreative.monetization.ui.I28.class, "onCloseAttemptConfirmed", "onCloseAttemptConfirmed()V", 0);
            }

            public final void n() {
                ((com.alightcreative.monetization.ui.I28) this.receiver).Nxk();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class Wre extends FunctionReferenceImpl implements Function1 {
            Wre(Object obj) {
                super(1, obj, com.alightcreative.monetization.ui.I28.class, "onBoxChosen", "onBoxChosen(Lcom/alightcreative/monetization/ui/entities/PlayfulState$InGame$Chosen$ChosenBox;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n((I28.n.j.EnumC0293j) obj);
                return Unit.INSTANCE;
            }

            public final void n(I28.n.j.EnumC0293j p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((com.alightcreative.monetization.ui.I28) this.receiver).D(p0);
            }
        }

        /* synthetic */ class aC extends FunctionReferenceImpl implements Function0 {
            aC(Object obj) {
                super(0, obj, com.alightcreative.monetization.ui.I28.class, "onManageSubscriptionClicked", "onManageSubscriptionClicked()V", 0);
            }

            public final void n() {
                ((com.alightcreative.monetization.ui.I28) this.receiver).ijL();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class fuX extends FunctionReferenceImpl implements Function1 {
            fuX(Object obj) {
                super(1, obj, com.alightcreative.monetization.ui.I28.class, "onSubscriptionClicked", "onSubscriptionClicked(I)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Number) obj).intValue());
                return Unit.INSTANCE;
            }

            public final void n(int i2) {
                ((com.alightcreative.monetization.ui.I28) this.receiver).Mx(i2);
            }
        }

        /* synthetic */ class j extends FunctionReferenceImpl implements Function0 {
            j(Object obj) {
                super(0, obj, com.alightcreative.monetization.ui.I28.class, "onPhaseEnded", "onPhaseEnded()V", 0);
            }

            public final void n() {
                ((com.alightcreative.monetization.ui.I28) this.receiver).eTf();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function0 {
            n(Object obj) {
                super(0, obj, com.alightcreative.monetization.ui.I28.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0);
            }

            public final void n() {
                ((com.alightcreative.monetization.ui.I28) this.receiver).Y();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        /* synthetic */ class w6 extends FunctionReferenceImpl implements Function0 {
            w6(Object obj) {
                super(0, obj, com.alightcreative.monetization.ui.I28.class, "onCloseAttemptCancelled", "onCloseAttemptCancelled()V", 0);
            }

            public final void n() {
                ((com.alightcreative.monetization.ui.I28) this.receiver).GR();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                n();
                return Unit.INSTANCE;
            }
        }

        static final class C extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f46854n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ModalBottomSheetState f46855t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                super(2, continuation);
                this.f46855t = modalBottomSheetState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C(this.f46855t, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f46854n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ModalBottomSheetState modalBottomSheetState = this.f46855t;
                    this.f46854n = 1;
                    if (modalBottomSheetState.qie(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        Q(R5.Ml ml, com.alightcreative.monetization.ui.I28 i28, ModalBottomSheetState modalBottomSheetState, Activity activity, vd vdVar) {
            this.f46851n = ml;
            this.f46853t = i28;
            this.f46850O = modalBottomSheetState;
            this.J2 = activity;
            this.f46852r = vdVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            t((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void t(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
            int i3;
            Integer numUo;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i2 & 6) == 0) {
                i3 = (composer.p5(BoxWithConstraints) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i3 & 19) == 18 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-234826097, i3, -1, "com.alightcreative.monetization.ui.PaywallActivity.PaywallActivityContent.<anonymous> (PaywallActivity.kt:262)");
            }
            R5.I28 i28O = ((Ml.j.C0296Ml) this.f46851n).O();
            if (Intrinsics.areEqual(i28O, I28.w6.f8652n)) {
                composer.eF(-613301772);
                R5.Wre wre = (R5.Wre) CollectionsKt.firstOrNull(((Ml.j.C0296Ml) this.f46851n).qie().gh());
                int iIntValue = (wre == null || (numUo = wre.Uo()) == null) ? 0 : numUo.intValue();
                com.alightcreative.monetization.ui.I28 i28 = this.f46853t;
                composer.eF(-1959438419);
                boolean zE2 = composer.E2(i28);
                Object objIF = composer.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new j(i28);
                    composer.o(objIF);
                }
                composer.Xw();
                M.xMQ(iIntValue, (Function0) ((KFunction) objIF), ((Ml.j.C0296Ml) this.f46851n).nr(), composer, 0);
                composer.Xw();
            } else if (i28O instanceof I28.n) {
                composer.eF(-612842848);
                I28.n nVar = (I28.n) ((Ml.j.C0296Ml) this.f46851n).O();
                float fT = BoxWithConstraints.t();
                boolean zT2 = ((Ml.j.C0296Ml) this.f46851n).t();
                com.alightcreative.monetization.ui.I28 i282 = this.f46853t;
                composer.eF(-1959423059);
                boolean zE22 = composer.E2(i282);
                Object objIF2 = composer.iF();
                if (zE22 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new I28(i282);
                    composer.o(objIF2);
                }
                composer.Xw();
                Function0 function0 = (Function0) ((KFunction) objIF2);
                com.alightcreative.monetization.ui.I28 i283 = this.f46853t;
                composer.eF(-1959420788);
                boolean zE23 = composer.E2(i283);
                Object objIF3 = composer.iF();
                if (zE23 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new Wre(i283);
                    composer.o(objIF3);
                }
                composer.Xw();
                Function1 function1 = (Function1) ((KFunction) objIF3);
                com.alightcreative.monetization.ui.I28 i284 = this.f46853t;
                composer.eF(-1959418315);
                boolean zE24 = composer.E2(i284);
                Object objIF4 = composer.iF();
                if (zE24 || objIF4 == Composer.INSTANCE.n()) {
                    objIF4 = new CN3(i284);
                    composer.o(objIF4);
                }
                composer.Xw();
                Zd1.o.az(BoxWithConstraints, nVar, fT, zT2, function0, function1, (Function0) ((KFunction) objIF4), composer, i3 & 14);
                composer.Xw();
            } else {
                if (!Intrinsics.areEqual(i28O, I28.j.f8646n)) {
                    composer.eF(-1959447184);
                    composer.Xw();
                    throw new NoWhenBranchMatchedException();
                }
                composer.eF(-612258374);
                Ml.j.C0296Ml c0296Ml = (Ml.j.C0296Ml) this.f46851n;
                ModalBottomSheetState modalBottomSheetState = this.f46850O;
                com.alightcreative.monetization.ui.I28 i285 = this.f46853t;
                composer.eF(-1959407146);
                boolean zE25 = composer.E2(i285);
                Object objIF5 = composer.iF();
                if (zE25 || objIF5 == Composer.INSTANCE.n()) {
                    objIF5 = new fuX(i285);
                    composer.o(objIF5);
                }
                composer.Xw();
                Function1 function12 = (Function1) ((KFunction) objIF5);
                com.alightcreative.monetization.ui.I28 i286 = this.f46853t;
                composer.eF(-1959404497);
                boolean zE26 = composer.E2(i286);
                Object objIF6 = composer.iF();
                if (zE26 || objIF6 == Composer.INSTANCE.n()) {
                    objIF6 = new Dsr(i286);
                    composer.o(objIF6);
                }
                composer.Xw();
                Function1 function13 = (Function1) ((KFunction) objIF6);
                composer.eF(-1959401755);
                boolean zE27 = composer.E2(this.f46853t) | composer.E2(this.J2);
                final com.alightcreative.monetization.ui.I28 i287 = this.f46853t;
                final Activity activity = this.J2;
                Object objIF7 = composer.iF();
                if (zE27 || objIF7 == Composer.INSTANCE.n()) {
                    objIF7 = new Function0() { // from class: com.alightcreative.monetization.ui.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaywallActivity.Q.O(i287, activity);
                        }
                    };
                    composer.o(objIF7);
                }
                Function0 function02 = (Function0) objIF7;
                composer.Xw();
                com.alightcreative.monetization.ui.I28 i288 = this.f46853t;
                composer.eF(-1959398212);
                boolean zE28 = composer.E2(i288);
                Object objIF8 = composer.iF();
                if (zE28 || objIF8 == Composer.INSTANCE.n()) {
                    objIF8 = new aC(i288);
                    composer.o(objIF8);
                }
                composer.Xw();
                Function0 function03 = (Function0) ((KFunction) objIF8);
                composer.eF(-1959394911);
                boolean zE29 = composer.E2(this.f46853t) | composer.E2(this.f46852r) | composer.E2(this.f46850O);
                final com.alightcreative.monetization.ui.I28 i289 = this.f46853t;
                final vd vdVar = this.f46852r;
                final ModalBottomSheetState modalBottomSheetState2 = this.f46850O;
                Object objIF9 = composer.iF();
                if (zE29 || objIF9 == Composer.INSTANCE.n()) {
                    objIF9 = new Function0() { // from class: com.alightcreative.monetization.ui.w6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaywallActivity.Q.nr(i289, vdVar, modalBottomSheetState2);
                        }
                    };
                    composer.o(objIF9);
                }
                Function0 function04 = (Function0) objIF9;
                composer.Xw();
                com.alightcreative.monetization.ui.I28 i2810 = this.f46853t;
                composer.eF(-1959384843);
                boolean zE210 = composer.E2(i2810);
                Object objIF10 = composer.iF();
                if (zE210 || objIF10 == Composer.INSTANCE.n()) {
                    objIF10 = new n(i2810);
                    composer.o(objIF10);
                }
                composer.Xw();
                Function0 function05 = (Function0) ((KFunction) objIF10);
                com.alightcreative.monetization.ui.I28 i2811 = this.f46853t;
                composer.eF(-1959382216);
                boolean zE211 = composer.E2(i2811);
                Object objIF11 = composer.iF();
                if (zE211 || objIF11 == Composer.INSTANCE.n()) {
                    objIF11 = new w6(i2811);
                    composer.o(objIF11);
                }
                composer.Xw();
                Function0 function06 = (Function0) ((KFunction) objIF11);
                com.alightcreative.monetization.ui.I28 i2812 = this.f46853t;
                composer.eF(-1959379528);
                boolean zE212 = composer.E2(i2812);
                Object objIF12 = composer.iF();
                if (zE212 || objIF12 == Composer.INSTANCE.n()) {
                    objIF12 = new Ml(i2812);
                    composer.o(objIF12);
                }
                composer.Xw();
                Zd1.Z.J2(c0296Ml, modalBottomSheetState, function12, function13, function02, function03, function04, function05, function06, (Function0) ((KFunction) objIF12), composer, ModalBottomSheetState.f22280O << 3);
                composer.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(com.alightcreative.monetization.ui.I28 i28, Activity activity) {
            i28.k(activity);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(com.alightcreative.monetization.ui.I28 i28, vd vdVar, ModalBottomSheetState modalBottomSheetState) {
            i28.m();
            GJW.C.nr(vdVar, null, null, new C(modalBottomSheetState, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class Xo extends FunctionReferenceImpl implements Function0 {
        Xo(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, "onCloseAttemptCancelled", "onCloseAttemptCancelled()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).GR();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    static final class Z implements Function2 {
        Z() {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            Integer num;
            boolean z2;
            Boolean boolValueOf;
            Boolean bool;
            EnumC1982eO enumC1982eO;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            I28.n nVar;
            Integer num2;
            Boolean bool2;
            String stringExtra;
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1426641600, i2, -1, "com.alightcreative.monetization.ui.PaywallActivity.onCreate.<anonymous> (PaywallActivity.kt:82)");
            }
            PaywallActivity paywallActivity = PaywallActivity.this;
            I28.j jVar = com.alightcreative.monetization.ui.I28.wTp;
            I28.n nVarUf = paywallActivity.Uf();
            Intent intent = PaywallActivity.this.getIntent();
            String stringExtra2 = intent != null ? intent.getStringExtra("product1NoTrialId") : null;
            Intent intent2 = PaywallActivity.this.getIntent();
            String stringExtra3 = intent2 != null ? intent2.getStringExtra("product1FreeTrialId") : null;
            Intent intent3 = PaywallActivity.this.getIntent();
            String stringExtra4 = intent3 != null ? intent3.getStringExtra("product2NoTrialId") : null;
            Intent intent4 = PaywallActivity.this.getIntent();
            String stringExtra5 = intent4 != null ? intent4.getStringExtra("product2FreeTrialId") : null;
            Intent intent5 = PaywallActivity.this.getIntent();
            String stringExtra6 = intent5 != null ? intent5.getStringExtra("product1UpsellNoTrialId") : null;
            Intent intent6 = PaywallActivity.this.getIntent();
            String stringExtra7 = intent6 != null ? intent6.getStringExtra("product1UpsellFreeTrialId") : null;
            Intent intent7 = PaywallActivity.this.getIntent();
            String stringExtra8 = intent7 != null ? intent7.getStringExtra("product2UpsellNoTrialId") : null;
            Intent intent8 = PaywallActivity.this.getIntent();
            String stringExtra9 = intent8 != null ? intent8.getStringExtra("product2UpsellFreeTrialId") : null;
            Intent intent9 = PaywallActivity.this.getIntent();
            String stringExtra10 = intent9 != null ? intent9.getStringExtra("product1DiscountedNoTrialId") : null;
            Intent intent10 = PaywallActivity.this.getIntent();
            String stringExtra11 = intent10 != null ? intent10.getStringExtra("product1DiscountedFreeTrialId") : null;
            Intent intent11 = PaywallActivity.this.getIntent();
            String stringExtra12 = intent11 != null ? intent11.getStringExtra("product2DiscountedNoTrialId") : null;
            Intent intent12 = PaywallActivity.this.getIntent();
            String stringExtra13 = intent12 != null ? intent12.getStringExtra("product2DiscountedFreeTrialId") : null;
            Intent intent13 = PaywallActivity.this.getIntent();
            String str10 = stringExtra13;
            Integer numValueOf = intent13 != null ? Integer.valueOf(intent13.getIntExtra("defaultSelectionIndex", 0)) : null;
            Intent intent14 = PaywallActivity.this.getIntent();
            ArrayList<Integer> integerArrayListExtra = intent14 != null ? intent14.getIntegerArrayListExtra("tiers") : null;
            Intent intent15 = PaywallActivity.this.getIntent();
            ArrayList<Integer> arrayList = integerArrayListExtra;
            if (intent15 != null) {
                num = numValueOf;
                z2 = false;
                boolValueOf = Boolean.valueOf(intent15.getBooleanExtra("canBeDismissedWithAd", false));
            } else {
                num = numValueOf;
                z2 = false;
                boolValueOf = null;
            }
            Intent intent16 = PaywallActivity.this.getIntent();
            Boolean bool3 = boolValueOf;
            Boolean boolValueOf2 = intent16 != null ? Boolean.valueOf(intent16.getBooleanExtra("isCloseButtonDelayed", z2)) : null;
            Intent intent17 = PaywallActivity.this.getIntent();
            if (intent17 != null) {
                bool = boolValueOf2;
                enumC1982eO = (EnumC1982eO) lej.n(intent17, "paywallType", EnumC1982eO.class);
            } else {
                bool = boolValueOf2;
                enumC1982eO = null;
            }
            Intent intent18 = PaywallActivity.this.getIntent();
            if (intent18 != null) {
                String str11 = stringExtra10;
                str = stringExtra11;
                str2 = stringExtra3;
                str3 = stringExtra4;
                str4 = stringExtra5;
                str5 = stringExtra6;
                str6 = stringExtra7;
                str7 = stringExtra8;
                str8 = stringExtra9;
                str9 = str11;
                nVar = nVarUf;
                num2 = num;
                bool2 = bool;
                stringExtra = intent18.getStringExtra("hook");
            } else {
                String str12 = stringExtra10;
                str = stringExtra11;
                str2 = stringExtra3;
                str3 = stringExtra4;
                str4 = stringExtra5;
                str5 = stringExtra6;
                str6 = stringExtra7;
                str7 = stringExtra8;
                str8 = stringExtra9;
                str9 = str12;
                nVar = nVarUf;
                num2 = num;
                bool2 = bool;
                stringExtra = null;
            }
            ViewModelProvider.Factory factoryN = jVar.n(nVar, stringExtra2, str2, str3, str4, str5, str6, str7, str8, str9, str, stringExtra12, str10, num2, arrayList, bool3, bool2, enumC1982eO, stringExtra);
            composer.eF(297168033);
            ViewModelStoreOwner viewModelStoreOwnerT = LocalViewModelStoreOwner.f39076n.t(composer, LocalViewModelStoreOwner.f39077t);
            if (viewModelStoreOwnerT == null) {
                throw new IllegalStateException("Required value was null.");
            }
            uW.w6 w6Var = (uW.w6) new ViewModelProvider(viewModelStoreOwnerT, factoryN).n(com.alightcreative.monetization.ui.I28.class);
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
            paywallActivity.viewModel = (com.alightcreative.monetization.ui.I28) w6Var;
            PaywallActivity paywallActivity2 = PaywallActivity.this;
            com.alightcreative.monetization.ui.I28 i28 = paywallActivity2.viewModel;
            if (i28 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                i28 = null;
            }
            paywallActivity2.EWS(i28, PaywallActivity.this, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* synthetic */ class aC extends FunctionReferenceImpl implements Function0 {
        aC(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, "onCancelButtonClicked", "onCancelButtonClicked()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).I();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class afx extends FunctionReferenceImpl implements Function0 {
        afx(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, "onWatchAnAdClicked", "onWatchAnAdClicked()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).ul();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.monetization.ui.PaywallActivity$c, reason: case insensitive filesystem */
    /* synthetic */ class C1758c extends FunctionReferenceImpl implements Function0 {
        C1758c(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, "onRetryButtonClicked", "onRetryButtonClicked()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).C();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class eO extends FunctionReferenceImpl implements Function0 {
        eO(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, "onManageSubscriptionClicked", "onManageSubscriptionClicked()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).ijL();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class fuX extends FunctionReferenceImpl implements Function0 {
        fuX(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).Y();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    /* synthetic */ class g9s extends FunctionReferenceImpl implements Function0 {
        g9s(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, HrvQKfmFZJudBc.mFKqnhTMJzA, "onCloseButtonClicked()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).Y();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class l3D extends FunctionReferenceImpl implements Function0 {
        l3D(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, "onCloseAttemptConfirmed", "onCloseAttemptConfirmed()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).Nxk();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class o extends FunctionReferenceImpl implements Function1 {
        o(Object obj) {
            super(1, obj, com.alightcreative.monetization.ui.I28.class, "onSubscriptionClicked", "onSubscriptionClicked(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void n(int i2) {
            ((com.alightcreative.monetization.ui.I28) this.receiver).Mx(i2);
        }
    }

    /* synthetic */ class qz extends FunctionReferenceImpl implements Function0 {
        qz(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).Y();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* synthetic */ class r extends FunctionReferenceImpl implements Function0 {
        r(Object obj) {
            super(0, obj, com.alightcreative.monetization.ui.I28.class, "onManageSubscriptionClicked", "onManageSubscriptionClicked()V", 0);
        }

        public final void n() {
            ((com.alightcreative.monetization.ui.I28) this.receiver).ijL();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            n();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.alightcreative.monetization.ui.PaywallActivity$z, reason: case insensitive filesystem */
    /* synthetic */ class C1759z extends FunctionReferenceImpl implements Function1 {
        C1759z(Object obj) {
            super(1, obj, com.alightcreative.monetization.ui.I28.class, "onSubscriptionClicked", "onSubscriptionClicked(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void n(int i2) {
            ((com.alightcreative.monetization.ui.I28) this.receiver).Mx(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VwL(PaywallActivity paywallActivity, com.alightcreative.monetization.ui.I28 i28, Activity activity, int i2, Composer composer, int i3) {
        paywallActivity.EWS(i28, activity, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static void safedk_Context_startActivity_0c4df6808b5c0cfc92f23c850e40a674(Context p0, Intent p1, Bundle p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1, p2);
    }

    static final class CN3 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ScrollState f46841O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46842n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(ScrollState scrollState, Continuation continuation) {
            super(2, continuation);
            this.f46841O = scrollState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PaywallActivity.this.new CN3(this.f46841O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((CN3) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46842n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PaywallActivity paywallActivity = PaywallActivity.this;
                ScrollState scrollState = this.f46841O;
                this.f46842n = 1;
                if (PaywallActivity.ub(paywallActivity, scrollState, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Dsr extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ScrollState f46844O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46845n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Dsr(ScrollState scrollState, Continuation continuation) {
            super(2, continuation);
            this.f46844O = scrollState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PaywallActivity.this.new Dsr(this.f46844O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Dsr) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46845n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PaywallActivity paywallActivity = PaywallActivity.this;
                ScrollState scrollState = this.f46844O;
                this.f46845n = 1;
                if (paywallActivity.f(scrollState, d.f62986a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ScrollState f46847O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46848n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(ScrollState scrollState, Continuation continuation) {
            super(2, continuation);
            this.f46847O = scrollState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PaywallActivity.this.new I28(this.f46847O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46848n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PaywallActivity paywallActivity = PaywallActivity.this;
                ScrollState scrollState = this.f46847O;
                this.f46848n = 1;
                if (PaywallActivity.ub(paywallActivity, scrollState, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class QJ extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f46856O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46857n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.alightcreative.monetization.ui.I28 f46858t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        QJ(com.alightcreative.monetization.ui.I28 i28, ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
            super(2, continuation);
            this.f46858t = i28;
            this.f46856O = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new QJ(this.f46858t, this.f46856O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((QJ) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46857n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f46858t.FX();
                ModalBottomSheetState modalBottomSheetState = this.f46856O;
                this.f46857n = 1;
                if (modalBottomSheetState.qie(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class SPz extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ScrollState f46859O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46860n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        SPz(ScrollState scrollState, Continuation continuation) {
            super(2, continuation);
            this.f46859O = scrollState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PaywallActivity.this.new SPz(this.f46859O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((SPz) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46860n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PaywallActivity paywallActivity = PaywallActivity.this;
                ScrollState scrollState = this.f46859O;
                this.f46860n = 1;
                if (PaywallActivity.ub(paywallActivity, scrollState, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class UGc extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ com.alightcreative.monetization.ui.I28 f46862O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46863n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f46864t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        UGc(ModalBottomSheetState modalBottomSheetState, com.alightcreative.monetization.ui.I28 i28, Continuation continuation) {
            super(2, continuation);
            this.f46864t = modalBottomSheetState;
            this.f46862O = i28;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new UGc(this.f46864t, this.f46862O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((UGc) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        
            if (r5.xMQ(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (r5.qie(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46863n;
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                if (this.f46864t.gh()) {
                    this.f46862O.M();
                    ModalBottomSheetState modalBottomSheetState = this.f46864t;
                    this.f46863n = 1;
                } else {
                    this.f46862O.FX();
                    ModalBottomSheetState modalBottomSheetState2 = this.f46864t;
                    this.f46863n = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ScrollState f46865O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46866n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(ScrollState scrollState, Continuation continuation) {
            super(2, continuation);
            this.f46865O = scrollState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PaywallActivity.this.new Wre(this.f46865O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46866n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PaywallActivity paywallActivity = PaywallActivity.this;
                ScrollState scrollState = this.f46865O;
                this.f46866n = 1;
                if (PaywallActivity.ub(paywallActivity, scrollState, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class ci extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ScrollState f46869O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46870n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ci(ScrollState scrollState, Continuation continuation) {
            super(2, continuation);
            this.f46869O = scrollState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PaywallActivity.this.new ci(this.f46869O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((ci) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46870n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PaywallActivity paywallActivity = PaywallActivity.this;
                ScrollState scrollState = this.f46869O;
                this.f46870n = 1;
                if (PaywallActivity.ub(paywallActivity, scrollState, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46872n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f46873t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
            super(2, continuation);
            this.f46873t = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f46873t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46872n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                ModalBottomSheetState modalBottomSheetState = this.f46873t;
                this.f46872n = 1;
                if (modalBottomSheetState.qie(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class s4 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f46874O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46875n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ com.alightcreative.monetization.ui.I28 f46876t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s4(com.alightcreative.monetization.ui.I28 i28, ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
            super(2, continuation);
            this.f46876t = i28;
            this.f46874O = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new s4(this.f46876t, this.f46874O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((s4) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46875n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.f46876t.M();
                ModalBottomSheetState modalBottomSheetState = this.f46874O;
                this.f46875n = 1;
                if (modalBottomSheetState.xMQ(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ ScrollState f46877O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46878n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(ScrollState scrollState, Continuation continuation) {
            super(2, continuation);
            this.f46877O = scrollState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PaywallActivity.this.new w6(this.f46877O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46878n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                PaywallActivity paywallActivity = PaywallActivity.this;
                ScrollState scrollState = this.f46877O;
                this.f46878n = 1;
                if (paywallActivity.f(scrollState, d.f62986a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(vd vdVar, com.alightcreative.monetization.ui.I28 i28, ModalBottomSheetState modalBottomSheetState) {
        GJW.C.nr(vdVar, null, null, new s4(i28, modalBottomSheetState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QZ6(vd vdVar, ModalBottomSheetState modalBottomSheetState, com.alightcreative.monetization.ui.I28 i28, OnBackPressedCallback BackPressHandler) {
        Intrinsics.checkNotNullParameter(BackPressHandler, "$this$BackPressHandler");
        GJW.C.nr(vdVar, null, null, new UGc(modalBottomSheetState, i28, null), 3, null);
        return Unit.INSTANCE;
    }

    private final void Qu() {
        new nv.n(this).o(2132019865).Uo(2132019864).setPositiveButton(2132017378, null).XQ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a63(vd vdVar, com.alightcreative.monetization.ui.I28 i28, ModalBottomSheetState modalBottomSheetState) {
        GJW.C.nr(vdVar, null, null, new QJ(i28, modalBottomSheetState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(ScrollState scrollState, int i2, Continuation continuation) {
        Object objGh = scrollState.gh(Integer.MAX_VALUE, AnimationSpecKt.az(1000, i2, EasingKt.O()), continuation);
        return objGh == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objGh : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hRu(com.alightcreative.monetization.ui.I28 i28, ModalBottomSheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it != ModalBottomSheetValue.f22291n) {
            return true;
        }
        i28.J();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit kSg(com.alightcreative.monetization.ui.I28 i28, OnBackPressedCallback BackPressHandler) {
        Intrinsics.checkNotNullParameter(BackPressHandler, "$this$BackPressHandler");
        i28.B();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tFV(PaywallActivity paywallActivity, R5.n action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof n.w6) {
            paywallActivity.setResult(-1, new Intent().putExtra("benefits", ((n.w6) action).n()));
            paywallActivity.finish();
        } else if (Intrinsics.areEqual(action, n.j.f8675n)) {
            paywallActivity.setResult(-2);
            paywallActivity.finish();
        } else if (Intrinsics.areEqual(action, n.I28.f8673n)) {
            paywallActivity.setResult(-3);
            paywallActivity.finish();
        } else if (action instanceof n.C0299n) {
            safedk_Context_startActivity_0c4df6808b5c0cfc92f23c850e40a674(paywallActivity, new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + ((n.C0299n) action).n() + "&package=com.alightcreative.motion")), null);
        } else {
            if (!Intrinsics.areEqual(action, n.Ml.f8674n)) {
                throw new NoWhenBranchMatchedException();
            }
            paywallActivity.Qu();
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object ub(PaywallActivity paywallActivity, ScrollState scrollState, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return paywallActivity.f(scrollState, i2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:225:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0725  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EWS(final com.alightcreative.monetization.ui.I28 viewModel, final Activity activity, Composer composer, final int i2) {
        int i3;
        int i5;
        boolean zE2;
        Object objIF;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Composer composerKN = composer.KN(752776545);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(viewModel) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(activity) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(this) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(752776545, i3, -1, "com.alightcreative.monetization.ui.PaywallActivity.PaywallActivityContent (PaywallActivity.kt:117)");
            }
            Object objIF2 = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF2 == companion.n()) {
                objIF2 = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF2);
            }
            final vd vdVar = (vd) objIF2;
            final ScrollState scrollStateT = ScrollKt.t(0, composerKN, 0, 1);
            WindowSizeClass windowSizeClassN = AndroidWindowSizeClass_androidKt.n(this, composerKN, (i3 >> 6) & 14);
            ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.f22291n;
            composerKN.eF(-1952074277);
            boolean zE22 = composerKN.E2(viewModel);
            Object objIF3 = composerKN.iF();
            if (zE22 || objIF3 == companion.n()) {
                objIF3 = new Function1() { // from class: cd.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(PaywallActivity.hRu(viewModel, (ModalBottomSheetValue) obj));
                    }
                };
                composerKN.o(objIF3);
            }
            composerKN.Xw();
            final ModalBottomSheetState modalBottomSheetStateMUb = ModalBottomSheetKt.mUb(modalBottomSheetValue, null, (Function1) objIF3, true, composerKN, 3078, 2);
            composerKN.eF(-1952067928);
            boolean zE23 = composerKN.E2(viewModel);
            Object objIF4 = composerKN.iF();
            if (zE23 || objIF4 == companion.n()) {
                objIF4 = new Function1() { // from class: cd.eO
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PaywallActivity.kSg(viewModel, (OnBackPressedCallback) obj);
                    }
                };
                composerKN.o(objIF4);
            }
            composerKN.Xw();
            N.I28.O(null, (Function1) objIF4, composerKN, 0, 1);
            R5.Ml ml = (R5.Ml) LiveDataAdapterKt.n(viewModel.t(), composerKN, 0).getValue();
            if (ml instanceof Ml.w6) {
                composerKN.eF(-1952062098);
                D.I28.rl(0.0f, false, composerKN, 0, 3);
                composerKN.Xw();
            } else if (ml instanceof Ml.n) {
                composerKN.eF(-1952059446);
                composerKN.eF(-1952057673);
                boolean zE24 = composerKN.E2(viewModel);
                Object objIF5 = composerKN.iF();
                if (zE24 || objIF5 == companion.n()) {
                    objIF5 = new aC(viewModel);
                    composerKN.o(objIF5);
                }
                composerKN.Xw();
                Function0 function0 = (Function0) ((KFunction) objIF5);
                composerKN.eF(-1952055338);
                boolean zE25 = composerKN.E2(viewModel);
                Object objIF6 = composerKN.iF();
                if (zE25 || objIF6 == companion.n()) {
                    objIF6 = new C1758c(viewModel);
                    composerKN.o(objIF6);
                }
                composerKN.Xw();
                wJ.C.rl(function0, (Function0) ((KFunction) objIF6), composerKN, 0);
                composerKN.Xw();
            } else if (ml instanceof Ml.j.I28) {
                composerKN.eF(-384028066);
                Ml.j.I28 i28 = (Ml.j.I28) ml;
                composerKN.eF(-1952043450);
                boolean zE26 = composerKN.E2(viewModel) | composerKN.E2(activity);
                Object objIF7 = composerKN.iF();
                if (zE26 || objIF7 == companion.n()) {
                    objIF7 = new Function0() { // from class: cd.z
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaywallActivity.mI(viewModel, activity);
                        }
                    };
                    composerKN.o(objIF7);
                }
                Function0 function02 = (Function0) objIF7;
                composerKN.Xw();
                composerKN.eF(-1952040291);
                boolean zE27 = composerKN.E2(viewModel);
                Object objIF8 = composerKN.iF();
                if (zE27 || objIF8 == companion.n()) {
                    objIF8 = new r(viewModel);
                    composerKN.o(objIF8);
                }
                composerKN.Xw();
                Function0 function03 = (Function0) ((KFunction) objIF8);
                composerKN.eF(-1952037269);
                boolean zE28 = composerKN.E2(viewModel) | composerKN.E2(vdVar) | composerKN.E2(this) | composerKN.p5(scrollStateT);
                Object objIF9 = composerKN.iF();
                if (zE28 || objIF9 == companion.n()) {
                    objIF9 = new Function0() { // from class: cd.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaywallActivity.UhV(viewModel, vdVar, this, scrollStateT);
                        }
                    };
                    composerKN.o(objIF9);
                }
                Function0 function04 = (Function0) objIF9;
                composerKN.Xw();
                composerKN.eF(-1952029016);
                boolean zE29 = composerKN.E2(viewModel) | composerKN.E2(vdVar) | composerKN.E2(this) | composerKN.p5(scrollStateT);
                Object objIF10 = composerKN.iF();
                if (zE29 || objIF10 == companion.n()) {
                    objIF10 = new Function1() { // from class: cd.w6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PaywallActivity.i(viewModel, vdVar, this, scrollStateT, ((Integer) obj).intValue());
                        }
                    };
                    composerKN.o(objIF10);
                }
                Function1 function1 = (Function1) objIF10;
                composerKN.Xw();
                composerKN.eF(-1952021130);
                boolean zE210 = composerKN.E2(viewModel);
                Object objIF11 = composerKN.iF();
                if (zE210 || objIF11 == companion.n()) {
                    objIF11 = new g9s(viewModel);
                    composerKN.o(objIF11);
                }
                composerKN.Xw();
                Function0 function05 = (Function0) ((KFunction) objIF11);
                composerKN.eF(-1952018764);
                boolean zE211 = composerKN.E2(viewModel);
                Object objIF12 = composerKN.iF();
                if (zE211 || objIF12 == companion.n()) {
                    objIF12 = new afx(viewModel);
                    composerKN.o(objIF12);
                }
                composerKN.Xw();
                Function0 function06 = (Function0) ((KFunction) objIF12);
                composerKN.eF(-1952016186);
                boolean zE212 = composerKN.E2(viewModel) | composerKN.E2(vdVar) | composerKN.E2(modalBottomSheetStateMUb);
                Object objIF13 = composerKN.iF();
                if (zE212 || objIF13 == companion.n()) {
                    objIF13 = new Function0() { // from class: cd.Ml
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaywallActivity.K(viewModel, vdVar, modalBottomSheetStateMUb);
                        }
                    };
                    composerKN.o(objIF13);
                }
                composerKN.Xw();
                D.w6.rl(scrollStateT, modalBottomSheetStateMUb, i28, windowSizeClassN, function02, function03, function04, function1, function05, function06, (Function0) objIF13, composerKN, ModalBottomSheetState.f22280O << 3, 0);
                composerKN = composerKN;
                Unit unit = Unit.INSTANCE;
                composerKN.eF(-1952007607);
                boolean zE213 = composerKN.E2(this) | composerKN.p5(scrollStateT);
                Object objIF14 = composerKN.iF();
                if (zE213 || objIF14 == companion.n()) {
                    objIF14 = new w6(scrollStateT, null);
                    composerKN.o(objIF14);
                }
                composerKN.Xw();
                EffectsKt.O(unit, (Function2) objIF14, composerKN, 6);
                composerKN.Xw();
            } else if (ml instanceof Ml.j.C0297j) {
                composerKN.eF(-382496077);
                Ml.j.C0297j c0297j = (Ml.j.C0297j) ml;
                LazyListState lazyListStateRl = LazyListStateKt.rl(c0297j.Uo(), 0, composerKN, 0, 2);
                composerKN.eF(-1951987034);
                boolean zE214 = composerKN.E2(viewModel) | composerKN.E2(activity);
                Object objIF15 = composerKN.iF();
                if (zE214 || objIF15 == companion.n()) {
                    objIF15 = new Function0() { // from class: cd.I28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaywallActivity.How(viewModel, activity);
                        }
                    };
                    composerKN.o(objIF15);
                }
                Function0 function07 = (Function0) objIF15;
                composerKN.Xw();
                composerKN.eF(-1951983875);
                boolean zE215 = composerKN.E2(viewModel);
                Object objIF16 = composerKN.iF();
                if (zE215 || objIF16 == companion.n()) {
                    objIF16 = new Ml(viewModel);
                    composerKN.o(objIF16);
                }
                composerKN.Xw();
                Function0 function08 = (Function0) ((KFunction) objIF16);
                composerKN.eF(-1951980853);
                boolean zE216 = composerKN.E2(viewModel) | composerKN.E2(vdVar) | composerKN.E2(this) | composerKN.p5(scrollStateT);
                Object objIF17 = composerKN.iF();
                if (zE216 || objIF17 == companion.n()) {
                    objIF17 = new Function0() { // from class: cd.Wre
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaywallActivity.tUK(viewModel, vdVar, this, scrollStateT);
                        }
                    };
                    composerKN.o(objIF17);
                }
                Function0 function09 = (Function0) objIF17;
                composerKN.Xw();
                composerKN.eF(-1951972600);
                boolean zE217 = composerKN.E2(viewModel) | composerKN.E2(vdVar) | composerKN.E2(this) | composerKN.p5(scrollStateT);
                Object objIF18 = composerKN.iF();
                if (zE217 || objIF18 == companion.n()) {
                    objIF18 = new Function1() { // from class: cd.CN3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PaywallActivity.ER(viewModel, vdVar, this, scrollStateT, ((Integer) obj).intValue());
                        }
                    };
                    composerKN.o(objIF18);
                }
                Function1 function12 = (Function1) objIF18;
                composerKN.Xw();
                composerKN.eF(-1951964671);
                boolean zE218 = composerKN.E2(viewModel) | composerKN.E2(vdVar) | composerKN.E2(this) | composerKN.p5(scrollStateT);
                Object objIF19 = composerKN.iF();
                if (zE218 || objIF19 == companion.n()) {
                    objIF19 = new Function1() { // from class: cd.fuX
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PaywallActivity.lLA(viewModel, vdVar, this, scrollStateT, ((Integer) obj).intValue());
                        }
                    };
                    composerKN.o(objIF19);
                }
                Function1 function13 = (Function1) objIF19;
                composerKN.Xw();
                composerKN.eF(-1951957002);
                boolean zE219 = composerKN.E2(viewModel);
                Object objIF20 = composerKN.iF();
                if (zE219 || objIF20 == companion.n()) {
                    objIF20 = new fuX(viewModel);
                    composerKN.o(objIF20);
                }
                composerKN.Xw();
                pTd.o.rl(scrollStateT, c0297j, windowSizeClassN, lazyListStateRl, function07, function08, function09, function12, function13, (Function0) ((KFunction) objIF20), composerKN, 0);
                composerKN = composerKN;
                Unit unit2 = Unit.INSTANCE;
                composerKN.eF(-1951953879);
                boolean zE220 = composerKN.E2(this) | composerKN.p5(scrollStateT);
                Object objIF21 = composerKN.iF();
                if (zE220 || objIF21 == companion.n()) {
                    objIF21 = new Dsr(scrollStateT, null);
                    composerKN.o(objIF21);
                }
                composerKN.Xw();
                EffectsKt.O(unit2, (Function2) objIF21, composerKN, 6);
                composerKN.Xw();
            } else if (ml instanceof Ml.j.n) {
                composerKN.eF(-380862687);
                Ml.j.n nVar = (Ml.j.n) ml;
                composerKN.eF(-1951944890);
                boolean zE221 = composerKN.E2(viewModel) | composerKN.E2(activity);
                Object objIF22 = composerKN.iF();
                if (zE221 || objIF22 == companion.n()) {
                    objIF22 = new Function0() { // from class: cd.Dsr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaywallActivity.W(viewModel, activity);
                        }
                    };
                    composerKN.o(objIF22);
                }
                Function0 function010 = (Function0) objIF22;
                composerKN.Xw();
                composerKN.eF(-1951941731);
                boolean zE222 = composerKN.E2(viewModel);
                Object objIF23 = composerKN.iF();
                if (zE222 || objIF23 == companion.n()) {
                    objIF23 = new C(viewModel);
                    composerKN.o(objIF23);
                }
                composerKN.Xw();
                Function0 function011 = (Function0) ((KFunction) objIF23);
                composerKN.eF(-1951939049);
                boolean zE223 = composerKN.E2(viewModel);
                Object objIF24 = composerKN.iF();
                if (zE223 || objIF24 == companion.n()) {
                    objIF24 = new o(viewModel);
                    composerKN.o(objIF24);
                }
                composerKN.Xw();
                Function1 function14 = (Function1) ((KFunction) objIF24);
                composerKN.eF(-1951936650);
                boolean zE224 = composerKN.E2(viewModel);
                Object objIF25 = composerKN.iF();
                if (zE224 || objIF25 == companion.n()) {
                    objIF25 = new qz(viewModel);
                    composerKN.o(objIF25);
                }
                composerKN.Xw();
                Function0 function012 = (Function0) ((KFunction) objIF25);
                composerKN.eF(-1951934119);
                boolean zE225 = composerKN.E2(viewModel);
                Object objIF26 = composerKN.iF();
                if (zE225 || objIF26 == companion.n()) {
                    objIF26 = new Pl(viewModel);
                    composerKN.o(objIF26);
                }
                composerKN.Xw();
                Function0 function013 = (Function0) ((KFunction) objIF26);
                composerKN.eF(-1951931495);
                boolean zE226 = composerKN.E2(viewModel);
                Object objIF27 = composerKN.iF();
                if (zE226 || objIF27 == companion.n()) {
                    objIF27 = new Xo(viewModel);
                    composerKN.o(objIF27);
                }
                composerKN.Xw();
                pBD.Ml.t(nVar, function010, function011, function14, function012, function013, (Function0) ((KFunction) objIF27), composerKN, 0);
                composerKN = composerKN;
                composerKN.Xw();
            } else if (ml instanceof Ml.j.w6) {
                composerKN.eF(-380173185);
                Ml.j.w6 w6Var = (Ml.j.w6) ml;
                composerKN.eF(-1951922074);
                boolean zE227 = composerKN.E2(viewModel) | composerKN.E2(activity);
                Object objIF28 = composerKN.iF();
                if (zE227 || objIF28 == companion.n()) {
                    objIF28 = new Function0() { // from class: cd.aC
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaywallActivity.RQ(viewModel, activity);
                        }
                    };
                    composerKN.o(objIF28);
                }
                Function0 function014 = (Function0) objIF28;
                composerKN.Xw();
                composerKN.eF(-1951918915);
                boolean zE228 = composerKN.E2(viewModel);
                Object objIF29 = composerKN.iF();
                if (zE228 || objIF29 == companion.n()) {
                    objIF29 = new eO(viewModel);
                    composerKN.o(objIF29);
                }
                composerKN.Xw();
                Function0 function015 = (Function0) ((KFunction) objIF29);
                composerKN.eF(-1951916233);
                boolean zE229 = composerKN.E2(viewModel);
                Object objIF30 = composerKN.iF();
                if (zE229 || objIF30 == companion.n()) {
                    objIF30 = new C1759z(viewModel);
                    composerKN.o(objIF30);
                }
                composerKN.Xw();
                Function1 function15 = (Function1) ((KFunction) objIF30);
                composerKN.eF(-1951913765);
                boolean zE230 = composerKN.E2(vdVar) | composerKN.E2(viewModel) | composerKN.E2(modalBottomSheetStateMUb);
                Object objIF31 = composerKN.iF();
                if (zE230 || objIF31 == companion.n()) {
                    objIF31 = new Function0() { // from class: cd.C
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaywallActivity.a63(vdVar, viewModel, modalBottomSheetStateMUb);
                        }
                    };
                    composerKN.o(objIF31);
                }
                Function0 function016 = (Function0) objIF31;
                composerKN.Xw();
                composerKN.eF(-1951906119);
                boolean zE231 = composerKN.E2(viewModel);
                Object objIF32 = composerKN.iF();
                if (zE231 || objIF32 == companion.n()) {
                    objIF32 = new l3D(viewModel);
                    composerKN.o(objIF32);
                }
                composerKN.Xw();
                Function0 function017 = (Function0) ((KFunction) objIF32);
                composerKN.eF(-1951903361);
                boolean zE232 = composerKN.E2(vdVar) | composerKN.E2(viewModel) | composerKN.E2(modalBottomSheetStateMUb);
                Object objIF33 = composerKN.iF();
                if (zE232 || objIF33 == companion.n()) {
                    objIF33 = new Function0() { // from class: cd.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaywallActivity.F(vdVar, viewModel, modalBottomSheetStateMUb);
                        }
                    };
                    composerKN.o(objIF33);
                }
                composerKN.Xw();
                pBD.UGc.rl(w6Var, modalBottomSheetStateMUb, function014, function015, function15, function016, function017, (Function0) objIF33, composerKN, ModalBottomSheetState.f22280O << 3);
                composerKN = composerKN;
                composerKN.eF(-1951895067);
                boolean zE233 = composerKN.E2(vdVar) | composerKN.E2(modalBottomSheetStateMUb) | composerKN.E2(viewModel);
                Object objIF34 = composerKN.iF();
                if (zE233 || objIF34 == companion.n()) {
                    objIF34 = new Function1() { // from class: cd.qz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PaywallActivity.QZ6(vdVar, modalBottomSheetStateMUb, viewModel, (OnBackPressedCallback) obj);
                        }
                    };
                    composerKN.o(objIF34);
                }
                composerKN.Xw();
                N.I28.O(null, (Function1) objIF34, composerKN, 0, 1);
                composerKN.Xw();
            } else {
                if (ml instanceof Ml.j.C0296Ml) {
                    composerKN.eF(-378672382);
                    i5 = i3;
                    BoxWithConstraintsKt.n(WindowInsetsPadding_androidKt.t(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null)), null, false, ComposableLambdaKt.nr(-234826097, true, new Q(ml, viewModel, modalBottomSheetStateMUb, activity, vdVar), composerKN, 54), composerKN, 3072, 6);
                    composerKN.Xw();
                } else {
                    i5 = i3;
                    if (ml != null) {
                        composerKN.eF(-1952057704);
                        composerKN.Xw();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerKN.eF(-376213028);
                    composerKN.Xw();
                }
                composerKN.eF(-1951795393);
                zE2 = composerKN.E2(this);
                objIF = composerKN.iF();
                if (!zE2 || objIF == companion.n()) {
                    objIF = new Function1() { // from class: cd.Pl
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return PaywallActivity.tFV(this.f43709n, (R5.n) obj);
                        }
                    };
                    composerKN.o(objIF);
                }
                composerKN.Xw();
                uW.I28.rl(viewModel, (Function1) objIF, composerKN, i5 & 14);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
            i5 = i3;
            composerKN.eF(-1951795393);
            zE2 = composerKN.E2(this);
            objIF = composerKN.iF();
            if (!zE2) {
                objIF = new Function1() { // from class: cd.Pl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PaywallActivity.tFV(this.f43709n, (R5.n) obj);
                    }
                };
                composerKN.o(objIF);
                composerKN.Xw();
                uW.I28.rl(viewModel, (Function1) objIF, composerKN, i5 & 14);
                if (ComposerKt.v()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: cd.Xo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaywallActivity.VwL(this.f43719n, viewModel, activity, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final I28.n Uf() {
        I28.n nVar = this.viewModelFactory;
        if (nVar != null) {
            return nVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ER(com.alightcreative.monetization.ui.I28 i28, vd vdVar, PaywallActivity paywallActivity, ScrollState scrollState, int i2) {
        i28.Mx(i2);
        GJW.C.nr(vdVar, null, null, paywallActivity.new Wre(scrollState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit How(com.alightcreative.monetization.ui.I28 i28, Activity activity) {
        i28.k(activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(com.alightcreative.monetization.ui.I28 i28, vd vdVar, ModalBottomSheetState modalBottomSheetState) {
        i28.m();
        GJW.C.nr(vdVar, null, null, new n(modalBottomSheetState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RQ(com.alightcreative.monetization.ui.I28 i28, Activity activity) {
        i28.k(activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UhV(com.alightcreative.monetization.ui.I28 i28, vd vdVar, PaywallActivity paywallActivity, ScrollState scrollState) {
        i28.z();
        GJW.C.nr(vdVar, null, null, paywallActivity.new SPz(scrollState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(com.alightcreative.monetization.ui.I28 i28, Activity activity) {
        i28.k(activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(com.alightcreative.monetization.ui.I28 i28, vd vdVar, PaywallActivity paywallActivity, ScrollState scrollState, int i2) {
        i28.Mx(i2);
        GJW.C.nr(vdVar, null, null, paywallActivity.new ci(scrollState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lLA(com.alightcreative.monetization.ui.I28 i28, vd vdVar, PaywallActivity paywallActivity, ScrollState scrollState, int i2) {
        i28.fcU(i2);
        GJW.C.nr(vdVar, null, null, paywallActivity.new CN3(scrollState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mI(com.alightcreative.monetization.ui.I28 i28, Activity activity) {
        i28.k(activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit tUK(com.alightcreative.monetization.ui.I28 i28, vd vdVar, PaywallActivity paywallActivity, ScrollState scrollState) {
        i28.z();
        GJW.C.nr(vdVar, null, null, paywallActivity.new I28(scrollState, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // com.alightcreative.monetization.ui.j, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setBackgroundDrawableResource(2131099811);
        super.onCreate(savedInstanceState);
        WindowCompat.rl(getWindow(), false);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        M5.rl(window, 0, getColor(2131099665), false, 4, null);
        ComponentActivityKt.rl(this, null, ComposableLambdaKt.rl(-1426641600, true, new Z()), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.alightcreative.monetization.ui.I28 i28 = this.viewModel;
        if (i28 != null) {
            if (i28 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                i28 = null;
            }
            i28.pJg();
        }
    }
}
