package D;

import D.w6;
import GJW.vd;
import R5.Ml;
import ScC.FuwU.pTYaLzzmJSGAPQ;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material3.windowsizeclass.WindowSizeClass;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.account.PurchasePeriod;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List f1138n;
    private static final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List f1139t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class j implements Function3 {
        final /* synthetic */ ModalBottomSheetState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ vd f1140O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ml.j.I28 f1141n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f1142t;

        /* JADX INFO: renamed from: D.w6$j$j, reason: collision with other inner class name */
        static final class C0040j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f1143n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ModalBottomSheetState f1144t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0040j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0040j(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                super(2, continuation);
                this.f1144t = modalBottomSheetState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0040j(this.f1144t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f1143n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ModalBottomSheetState modalBottomSheetState = this.f1144t;
                    this.f1143n = 1;
                    if (modalBottomSheetState.xMQ(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        j(Ml.j.I28 i28, Function1 function1, vd vdVar, ModalBottomSheetState modalBottomSheetState) {
            this.f1141n = i28;
            this.f1142t = function1;
            this.f1140O = vdVar;
            this.J2 = modalBottomSheetState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(vd vdVar, ModalBottomSheetState modalBottomSheetState) {
            GJW.C.nr(vdVar, null, null, new C0040j(modalBottomSheetState, null), 3, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            rl((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(ColumnScope ModalBottomSheetLayout, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(395467950, i2, -1, "com.alightcreative.monetization.ui.components.PaywallContent.<anonymous> (PaywallContent.kt:53)");
            }
            R5.Wre wreRl = this.f1141n.rl();
            List listKN = this.f1141n.KN();
            boolean zNr = this.f1141n.nr();
            Function1 function1 = this.f1142t;
            composer.eF(-1988954293);
            boolean zE2 = composer.E2(this.f1140O) | composer.E2(this.J2);
            final vd vdVar = this.f1140O;
            final ModalBottomSheetState modalBottomSheetState = this.J2;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: D.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w6.j.t(vdVar, modalBottomSheetState);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            qz.KN(wreRl, listKN, zNr, function1, null, false, 0, (Function0) objIF, composer, 0, 112);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class n implements Function2 {
        final /* synthetic */ Function0 E2;
        final /* synthetic */ ScrollState J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f1145O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Function0 f1146S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function0 f1147Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f1148g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ml.j.I28 f1149n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f1150o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ WindowSizeClass f1151r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f1152t;

        static final class j implements Function2 {
            final /* synthetic */ Function0 E2;
            final /* synthetic */ ScrollState J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f1153O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ Function0 f1154S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ Function0 f1155Z;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function1 f1156g;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Ml.j.I28 f1157n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Function0 f1158o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ WindowSizeClass f1159r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function0 f1160t;

            /* JADX INFO: renamed from: D.w6$n$j$j, reason: collision with other inner class name */
            static final class C0041j implements Function3 {
                final /* synthetic */ Function0 J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ WindowSizeClass f1161O;

                /* JADX INFO: renamed from: S, reason: collision with root package name */
                final /* synthetic */ Function0 f1162S;

                /* JADX INFO: renamed from: Z, reason: collision with root package name */
                final /* synthetic */ Function1 f1163Z;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ ScrollState f1164n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ Function0 f1165o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Function0 f1166r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Ml.j.I28 f1167t;

                C0041j(ScrollState scrollState, Ml.j.I28 i28, WindowSizeClass windowSizeClass, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function0 function04) {
                    this.f1164n = scrollState;
                    this.f1167t = i28;
                    this.f1161O = windowSizeClass;
                    this.J2 = function0;
                    this.f1166r = function02;
                    this.f1165o = function03;
                    this.f1163Z = function1;
                    this.f1162S = function04;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    n((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void n(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
                    int i3;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer.p5(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i3 = i2;
                    }
                    if ((i3 & 19) == 18 && composer.xMQ()) {
                        composer.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1956432563, i3, -1, "com.alightcreative.monetization.ui.components.PaywallContent.<anonymous>.<anonymous>.<anonymous> (PaywallContent.kt:78)");
                    }
                    Modifier modifierUo = ScrollKt.Uo(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), this.f1164n, false, null, false, 14, null);
                    Ml.j.I28 i28 = this.f1167t;
                    WindowSizeClass windowSizeClass = this.f1161O;
                    Function0 function0 = this.J2;
                    Function0 function02 = this.f1166r;
                    Function0 function03 = this.f1165o;
                    Function1 function1 = this.f1163Z;
                    Function0 function04 = this.f1162S;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                    int iN = ComposablesKt.n(composer, 0);
                    CompositionLocalMap compositionLocalMapIk = composer.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer, modifierUo);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion.n();
                    if (composer.getApplier() == null) {
                        ComposablesKt.t();
                    }
                    composer.T();
                    if (composer.getInserting()) {
                        composer.s7N(function0N);
                    } else {
                        composer.r();
                    }
                    Composer composerN = Updater.n(composer);
                    Updater.O(composerN, measurePolicyUo, companion.t());
                    Updater.O(composerN, compositionLocalMapIk, companion.O());
                    Function2 function2Rl = companion.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion.nr());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                    AbstractC1319c.ty(boxScopeInstance, i28.J2(), windowSizeClass, BoxWithConstraints.nr(), BoxWithConstraints.t(), composer, 6);
                    fuX.t(boxScopeInstance, windowSizeClass, BoxWithConstraints.nr(), i28, function0, function02, function03, function1, function04, composer, 6);
                    composer.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }

            j(Ml.j.I28 i28, Function0 function0, Function0 function02, ScrollState scrollState, WindowSizeClass windowSizeClass, Function0 function03, Function0 function04, Function0 function05, Function1 function1, Function0 function06) {
                this.f1157n = i28;
                this.f1160t = function0;
                this.f1153O = function02;
                this.J2 = scrollState;
                this.f1159r = windowSizeClass;
                this.f1158o = function03;
                this.f1155Z = function04;
                this.f1154S = function05;
                this.f1156g = function1;
                this.E2 = function06;
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
                    ComposerKt.p5(-460165533, i2, -1, "com.alightcreative.monetization.ui.components.PaywallContent.<anonymous>.<anonymous> (PaywallContent.kt:73)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BoxWithConstraintsKt.n(WindowInsetsPadding_androidKt.t(SizeKt.J2(companion, 0.0f, 1, null)), null, false, ComposableLambdaKt.nr(-1956432563, true, new C0041j(this.J2, this.f1157n, this.f1159r, this.f1158o, this.f1155Z, this.f1154S, this.f1156g, this.E2), composer, 54), composer, 3072, 6);
                if (this.f1157n.t()) {
                    composer.eF(292782168);
                    o.Dsr.rl(this.f1160t, composer, 0);
                    composer.Xw();
                } else {
                    composer.eF(292920366);
                    o.CN3.t(this.f1153O, PaddingKt.az(WindowInsetsPadding_androidKt.nr(companion), Dp.KN(8), Dp.KN(4), 0.0f, 0.0f, 12, null), PaddingKt.n(Dp.KN(12)), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    composer.Xw();
                }
                I28.rl(0.9f, this.f1157n.O(), composer, 6, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        n(Ml.j.I28 i28, Function0 function0, Function0 function02, ScrollState scrollState, WindowSizeClass windowSizeClass, Function0 function03, Function0 function04, Function0 function05, Function1 function1, Function0 function06) {
            this.f1149n = i28;
            this.f1152t = function0;
            this.f1145O = function02;
            this.J2 = scrollState;
            this.f1151r = windowSizeClass;
            this.f1150o = function03;
            this.f1147Z = function04;
            this.f1146S = function05;
            this.f1148g = function1;
            this.E2 = function06;
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
                ComposerKt.p5(204266791, i2, -1, "com.alightcreative.monetization.ui.components.PaywallContent.<anonymous> (PaywallContent.kt:68)");
            }
            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
            H9N.j jVar = H9N.j.f3810n;
            SurfaceKt.n(modifierJ2, null, jVar.n(composer, 6).rl(), jVar.n(composer, 6).t(), null, 0.0f, ComposableLambdaKt.nr(-460165533, true, new j(this.f1149n, this.f1152t, this.f1145O, this.J2, this.f1151r, this.f1150o, this.f1147Z, this.f1146S, this.f1148g, this.E2), composer, 54), composer, 1572870, 50);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        PurchasePeriod.Companion companion = PurchasePeriod.INSTANCE;
        List listListOf = CollectionsKt.listOf(new R5.Wre("$2.99", 2990000L, "USD", companion.rl(), null, null, null, null, null, null, null, null, 4080, null));
        f1138n = listListOf;
        List listListOf2 = CollectionsKt.listOf(R5.Wre.rl((R5.Wre) listListOf.get(0), null, 0L, null, null, null, null, null, null, 7, null, null, null, 3839, null));
        rl = listListOf2;
        f1139t = CollectionsKt.listOf((Object[]) new R5.Wre[]{listListOf2.get(0), R5.Wre.rl((R5.Wre) listListOf2.get(0), pTYaLzzmJSGAPQ.quBlHhf, 0L, null, companion.t(), null, null, null, null, null, null, null, null, 4086, null)});
    }

    public static final void rl(final ScrollState scrollState, final ModalBottomSheetState sheetState, final Ml.j.I28 viewState, final WindowSizeClass windowSizeClass, final Function0 onContinueButtonClicked, final Function0 onManageSubscriptionClicked, final Function0 onFreeTrialCheckboxClicked, final Function1 onSubscriptionClicked, final Function0 onCloseIconClicked, final Function0 onWatchAnAdClicked, final Function0 onOtherOptionsClicked, Composer composer, final int i2, final int i3) {
        int i5;
        int i7;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(windowSizeClass, "windowSizeClass");
        Intrinsics.checkNotNullParameter(onContinueButtonClicked, "onContinueButtonClicked");
        Intrinsics.checkNotNullParameter(onManageSubscriptionClicked, "onManageSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onFreeTrialCheckboxClicked, "onFreeTrialCheckboxClicked");
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onCloseIconClicked, "onCloseIconClicked");
        Intrinsics.checkNotNullParameter(onWatchAnAdClicked, "onWatchAnAdClicked");
        Intrinsics.checkNotNullParameter(onOtherOptionsClicked, "onOtherOptionsClicked");
        Composer composerKN = composer.KN(-1051042176);
        if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(scrollState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= (i2 & 64) == 0 ? composerKN.p5(sheetState) : composerKN.E2(sheetState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(viewState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerKN.p5(windowSizeClass) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerKN.E2(onContinueButtonClicked) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= composerKN.E2(onManageSubscriptionClicked) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= composerKN.E2(onFreeTrialCheckboxClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= composerKN.E2(onSubscriptionClicked) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= composerKN.E2(onCloseIconClicked) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= composerKN.E2(onWatchAnAdClicked) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (composerKN.E2(onOtherOptionsClicked) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i5 & 306783379) == 306783378 && (i7 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1051042176, i5, i7, "com.alightcreative.monetization.ui.components.PaywallContent (PaywallContent.kt:48)");
            }
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF);
            }
            float f3 = 20;
            ModalBottomSheetKt.rl(ComposableLambdaKt.nr(395467950, true, new j(viewState, onSubscriptionClicked, (vd) objIF, sheetState), composerKN, 54), null, sheetState, false, RoundedCornerShapeKt.O(Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, aD.w6.fD(), ComposableLambdaKt.nr(204266791, true, new n(viewState, onWatchAnAdClicked, onCloseIconClicked, scrollState, windowSizeClass, onContinueButtonClicked, onManageSubscriptionClicked, onFreeTrialCheckboxClicked, onSubscriptionClicked, onOtherOptionsClicked), composerKN, 54), composerKN, (ModalBottomSheetState.f22280O << 6) | 905969670 | ((i5 << 3) & 896), 234);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: D.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w6.t(scrollState, sheetState, viewState, windowSizeClass, onContinueButtonClicked, onManageSubscriptionClicked, onFreeTrialCheckboxClicked, onSubscriptionClicked, onCloseIconClicked, onWatchAnAdClicked, onOtherOptionsClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(ScrollState scrollState, ModalBottomSheetState modalBottomSheetState, Ml.j.I28 i28, WindowSizeClass windowSizeClass, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function0 function04, Function0 function05, Function0 function06, int i2, int i3, Composer composer, int i5) {
        rl(scrollState, modalBottomSheetState, i28, windowSizeClass, function0, function02, function03, function1, function04, function05, function06, composer, RecomposeScopeImplKt.n(i2 | 1), RecomposeScopeImplKt.n(i3));
        return Unit.INSTANCE;
    }
}
