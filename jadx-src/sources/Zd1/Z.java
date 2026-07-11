package Zd1;

import Dj7.YzO;
import Dj7.xZD;
import GJW.vd;
import R5.Ml;
import Zd1.Z;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.SurfaceKt;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.account.PurchasePeriod;
import com.alightcreative.monorepo.settings.PlayfulUnlockStyle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
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
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public abstract class Z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final R5.Wre f12443n;
    private static final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final R5.CN3 f12444t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class j implements Function3 {
        final /* synthetic */ vd J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f12445O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ml.j.C0296Ml f12446n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ModalBottomSheetState f12447r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ List f12448t;

        /* JADX INFO: renamed from: Zd1.Z$j$j, reason: collision with other inner class name */
        static final class C0448j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f12449n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ModalBottomSheetState f12450t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0448j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0448j(ModalBottomSheetState modalBottomSheetState, Continuation continuation) {
                super(2, continuation);
                this.f12450t = modalBottomSheetState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0448j(this.f12450t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f12449n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    ModalBottomSheetState modalBottomSheetState = this.f12450t;
                    this.f12449n = 1;
                    if (modalBottomSheetState.xMQ(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        j(Ml.j.C0296Ml c0296Ml, List list, Function1 function1, vd vdVar, ModalBottomSheetState modalBottomSheetState) {
            this.f12446n = c0296Ml;
            this.f12448t = list;
            this.f12445O = function1;
            this.J2 = vdVar;
            this.f12447r = modalBottomSheetState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(vd vdVar, ModalBottomSheetState modalBottomSheetState) {
            GJW.C.nr(vdVar, null, null, new C0448j(modalBottomSheetState, null), 3, null);
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
                ComposerKt.p5(807530294, i2, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulEndScreen.<anonymous> (PlayfulEndScreen.kt:82)");
            }
            R5.Wre wreRl = this.f12446n.rl();
            List list = this.f12448t;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((R5.Wre) ((Pair) it.next()).getSecond());
            }
            composer.eF(-917033270);
            List list2 = this.f12448t;
            Ml.j.C0296Ml c0296Ml = this.f12446n;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(eo.Wre.n((mg4.w6) ((Pair) it2.next()).component1(), c0296Ml.ty(), composer, 0));
            }
            composer.Xw();
            Function1 function1 = this.f12445O;
            composer.eF(-917024189);
            boolean zE2 = composer.E2(this.J2) | composer.E2(this.f12447r);
            final vd vdVar = this.J2;
            final ModalBottomSheetState modalBottomSheetState = this.f12447r;
            Object objIF = composer.iF();
            if (zE2 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: Zd1.afx
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Z.j.t(vdVar, modalBottomSheetState);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            D.qz.KN(wreRl, arrayList, true, function1, arrayList2, false, 0, (Function0) objIF, composer, 196992, 64);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class n implements Function2 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f12451O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function0 f12452Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Ml.j.C0296Ml f12453n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f12454o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f12455r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f12456t;

        static final class j implements Function2 {
            final /* synthetic */ Function1 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f12457O;

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            final /* synthetic */ Function0 f12458S;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ Function0 f12459Z;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function0 f12460n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Function0 f12461o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function1 f12462r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Ml.j.C0296Ml f12463t;

            /* JADX INFO: renamed from: Zd1.Z$n$j$j, reason: collision with other inner class name */
            static final class C0449j implements Function3 {
                final /* synthetic */ Function1 J2;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Function1 f12464O;

                /* JADX INFO: renamed from: Z, reason: collision with root package name */
                final /* synthetic */ Function0 f12465Z;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ boolean f12466n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                final /* synthetic */ Function0 f12467o;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ Function0 f12468r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Ml.j.C0296Ml f12469t;

                C0449j(boolean z2, Ml.j.C0296Ml c0296Ml, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03) {
                    this.f12466n = z2;
                    this.f12469t = c0296Ml;
                    this.f12464O = function1;
                    this.J2 = function12;
                    this.f12468r = function0;
                    this.f12467o = function02;
                    this.f12465Z = function03;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    n((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void n(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i2 & 17) == 16 && composer.xMQ()) {
                        composer.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-859152841, i2, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulEndScreen.<anonymous>.<anonymous>.<anonymous> (PlayfulEndScreen.kt:113)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierJ2 = SizeKt.J2(companion, 0.0f, 1, null);
                    Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
                    boolean z2 = this.f12466n;
                    Ml.j.C0296Ml c0296Ml = this.f12469t;
                    Function1 function1 = this.f12464O;
                    Function1 function12 = this.J2;
                    Function0 function0 = this.f12468r;
                    Function0 function02 = this.f12467o;
                    Function0 function03 = this.f12465Z;
                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), horizontalUo, composer, 48);
                    int iN = ComposablesKt.n(composer, 0);
                    CompositionLocalMap compositionLocalMapIk = composer.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer, modifierJ2);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0 function0N = companion2.n();
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
                    Updater.O(composerN, measurePolicyN, companion2.t());
                    Updater.O(composerN, compositionLocalMapIk, companion2.O());
                    Function2 function2Rl = companion2.rl();
                    if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                        composerN.o(Integer.valueOf(iN));
                        composerN.az(Integer.valueOf(iN), function2Rl);
                    }
                    Updater.O(composerN, modifierO, companion2.nr());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
                    composer.eF(-872679490);
                    if (!z2 && c0296Ml.KN() != null) {
                        mb8.fuX.ty(c0296Ml.KN(), c0296Ml.J2(), function1, PaddingKt.az(WindowInsetsPadding_androidKt.nr(companion), 0.0f, Dp.KN(48), 0.0f, 0.0f, 13, null), composer, 0, 0);
                    }
                    composer.Xw();
                    Z.KN(columnScopeInstance, !z2, c0296Ml.gh(), composer, 6);
                    R5.Wre wreRl = c0296Ml.rl();
                    composer.eF(-872654017);
                    if (wreRl != null) {
                        nKK.rl(c0296Ml, wreRl, function12, function0, function02, function03, composer, 0);
                    }
                    composer.Xw();
                    composer.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }

            j(Function0 function0, Ml.j.C0296Ml c0296Ml, boolean z2, Function1 function1, Function1 function12, Function0 function02, Function0 function03, Function0 function04) {
                this.f12460n = function0;
                this.f12463t = c0296Ml;
                this.f12457O = z2;
                this.J2 = function1;
                this.f12462r = function12;
                this.f12461o = function02;
                this.f12459Z = function03;
                this.f12458S = function04;
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
                    ComposerKt.p5(1261340001, i2, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulEndScreen.<anonymous>.<anonymous> (PlayfulEndScreen.kt:109)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BoxWithConstraintsKt.n(SizeKt.J2(companion, 0.0f, 1, null), null, false, ComposableLambdaKt.nr(-859152841, true, new C0449j(this.f12457O, this.f12463t, this.J2, this.f12462r, this.f12461o, this.f12459Z, this.f12458S), composer, 54), composer, 3078, 6);
                o.CN3.t(this.f12460n, PaddingKt.az(WindowInsetsPadding_androidKt.nr(companion), Dp.KN(8), Dp.KN(4), 0.0f, 0.0f, 12, null), PaddingKt.n(Dp.KN(12)), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                D.I28.rl(0.9f, this.f12463t.nr(), composer, 6, 0);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        n(Ml.j.C0296Ml c0296Ml, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function0 function03, Function0 function04) {
            this.f12453n = c0296Ml;
            this.f12456t = function0;
            this.f12451O = function1;
            this.J2 = function12;
            this.f12455r = function02;
            this.f12454o = function03;
            this.f12452Z = function04;
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
                ComposerKt.p5(-139562979, i2, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulEndScreen.<anonymous> (PlayfulEndScreen.kt:101)");
            }
            boolean z2 = this.f12453n.gh() == PlayfulUnlockStyle.CALM_OLD;
            Modifier modifierT = WindowInsetsPadding_androidKt.t(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null));
            H9N.j jVar = H9N.j.f3810n;
            SurfaceKt.n(modifierT, null, jVar.n(composer, 6).rl(), jVar.n(composer, 6).t(), null, 0.0f, ComposableLambdaKt.nr(1261340001, true, new j(this.f12456t, this.f12453n, z2, this.f12451O, this.J2, this.f12455r, this.f12454o, this.f12452Z), composer, 54), composer, 1572864, 50);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    static final class w6 implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f12470n;

        w6(boolean z2) {
            this.f12470n = z2;
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
                ComposerKt.p5(-350570231, i3, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulEndVisual.<anonymous> (PlayfulEndScreen.kt:182)");
            }
            int i5 = (i3 & 14) | 28080;
            Z.nr(BoxWithConstraints, Color.az(ColorKt.nr(4294010246L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Dp.KN(-80), Dp.KN(-20), Dp.KN(188), composer, i5);
            float f3 = 80;
            Z.nr(BoxWithConstraints, Color.az(ColorKt.nr(4294565478L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), Dp.KN(f3), Dp.KN(20), Dp.KN(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE), composer, i5);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Dj7.lej.t(2131951646, BoxWithConstraints.n(companion, companion2.O()), true, false, null, null, composer, 390, 56);
            composer.eF(-412188732);
            if (this.f12470n) {
                YzO.rl(aD.w6.M7(), BoxWithConstraints.n(SizeKt.xMQ(companion, Dp.KN(f3)), companion2.az()), xZD.f1895n, composer, 390, 0);
            }
            composer.Xw();
            YzO.rl(aD.w6.M7(), BoxWithConstraints.n(SizeKt.xMQ(companion, Dp.KN(f3)), companion2.rl()), xZD.f1896t, composer, 390, 0);
            Dj7.lej.t(2131951624, BoxWithConstraints.n(companion, companion2.O()), false, false, ContentScale.INSTANCE.nr(), null, composer, 24966, 40);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public /* synthetic */ class Ml {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayfulUnlockStyle.values().length];
            try {
                iArr[PlayfulUnlockStyle.CARDS_VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayfulUnlockStyle.CARDS_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        PurchasePeriod.Companion companion = PurchasePeriod.INSTANCE;
        R5.Wre wre = new R5.Wre("$3.99", 3990000L, "USD", companion.rl(), null, null, null, null, 7, null, null, null, 3824, null);
        f12443n = wre;
        List listListOf = CollectionsKt.listOf((Object[]) new R5.Wre[]{wre, R5.Wre.rl(wre, null, 0L, null, companion.t(), null, null, null, null, null, null, null, null, 4087, null)});
        rl = listListOf;
        Pair pair = TuplesKt.to(mg4.w6.f70997n, listListOf);
        mg4.w6 w6Var = mg4.w6.f70998t;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(R5.Wre.rl((R5.Wre) it.next(), "$5.99", 5990000L, null, null, null, null, null, null, null, null, null, null, 4092, null));
        }
        f12444t = new R5.CN3(pair, TuplesKt.to(w6Var, arrayList));
    }

    public static final void J2(final Ml.j.C0296Ml c0296Ml, final ModalBottomSheetState sheetState, final Function1 onSubscriptionClicked, final Function1 onTierSelected, Function0 onContinueButtonClicked, final Function0 onManageSubscriptionClicked, final Function0 onOtherOptionsClicked, final Function0 onCloseIconClicked, Function0 function0, Function0 onSkipClicked, Composer composer, final int i2) {
        Composer composer2;
        final Function0 function02;
        final Function0 function03;
        final Function0 function04;
        R5.Wre wre;
        Ml.j.C0296Ml viewState = c0296Ml;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onTierSelected, "onTierSelected");
        Intrinsics.checkNotNullParameter(onContinueButtonClicked, "onContinueButtonClicked");
        Intrinsics.checkNotNullParameter(onManageSubscriptionClicked, "onManageSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onOtherOptionsClicked, "onOtherOptionsClicked");
        Intrinsics.checkNotNullParameter(onCloseIconClicked, "onCloseIconClicked");
        Intrinsics.checkNotNullParameter(function0, Apsps.LzrqKRO);
        Intrinsics.checkNotNullParameter(onSkipClicked, "onSkipClicked");
        Composer composerKN = composer.KN(-768752604);
        int i3 = (i2 & 6) == 0 ? (composerKN.E2(viewState) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? composerKN.p5(sheetState) : composerKN.E2(sheetState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onSubscriptionClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onTierSelected) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onContinueButtonClicked) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onManageSubscriptionClicked) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(onOtherOptionsClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.E2(onCloseIconClicked) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerKN.E2(function0) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= composerKN.E2(onSkipClicked) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((306783379 & i5) == 306783378 && composerKN.xMQ()) {
            composerKN.wTp();
            function02 = onContinueButtonClicked;
            function03 = function0;
            function04 = onSkipClicked;
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-768752604, i5, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulEndScreen (PlayfulEndScreen.kt:72)");
            }
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF);
            }
            vd vdVar = (vd) objIF;
            List<mg4.w6> listAz = viewState.az();
            ArrayList arrayList = new ArrayList();
            for (mg4.w6 w6Var : listAz) {
                vd vdVar2 = vdVar;
                List list = (List) viewState.qie().get(w6Var);
                Pair pair = (list == null || (wre = (R5.Wre) CollectionsKt.getOrNull(list, c0296Ml.J2())) == null) ? null : TuplesKt.to(w6Var, wre);
                if (pair != null) {
                    arrayList.add(pair);
                }
                viewState = c0296Ml;
                vdVar = vdVar2;
            }
            vd vdVar3 = vdVar;
            float f3 = 20;
            composer2 = composerKN;
            ModalBottomSheetKt.rl(ComposableLambdaKt.nr(807530294, true, new j(c0296Ml, arrayList, onTierSelected, vdVar3, sheetState), composerKN, 54), null, sheetState, false, RoundedCornerShapeKt.O(Dp.KN(f3), Dp.KN(f3), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, aD.w6.fD(), ComposableLambdaKt.nr(-139562979, true, new n(c0296Ml, onCloseIconClicked, onSubscriptionClicked, onTierSelected, onContinueButtonClicked, onManageSubscriptionClicked, onOtherOptionsClicked), composerKN, 54), composer2, (ModalBottomSheetState.f22280O << 6) | 905969670 | ((i5 << 3) & 896), 234);
            if (c0296Ml.HI()) {
                function02 = onContinueButtonClicked;
                function03 = function0;
                function04 = onSkipClicked;
                wJ.Wre.t(function03, function04, function02, composer2, ((i5 >> 24) & 126) | ((i5 >> 6) & 896));
            } else {
                function02 = onContinueButtonClicked;
                function03 = function0;
                function04 = onSkipClicked;
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.SPz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Z.Uo(c0296Ml, sheetState, onSubscriptionClicked, onTierSelected, function02, onManageSubscriptionClicked, onOtherOptionsClicked, onCloseIconClicked, function03, function04, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(final ColumnScope columnScope, final boolean z2, final PlayfulUnlockStyle playfulUnlockStyle, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(426121651);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(columnScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(playfulUnlockStyle) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(426121651, i3, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulEndVisual (PlayfulEndScreen.kt:169)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            int i5 = Ml.$EnumSwitchMapping$0[playfulUnlockStyle.ordinal()];
            BoxWithConstraintsKt.n(SizeKt.KN((i5 == 1 || i5 == 2) ? ColumnScope.rl(columnScope, companion, 1.0f, false, 2, null) : SizeKt.t(companion, 0.5f), 0.0f, 1, null), null, false, ComposableLambdaKt.nr(-350570231, true, new w6(z2), composerKN, 54), composerKN, 3072, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.ci
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Z.xMQ(columnScope, z2, playfulUnlockStyle, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(BoxWithConstraintsScope boxWithConstraintsScope, long j2, float f3, float f4, float f5, int i2, Composer composer, int i3) {
        nr(boxWithConstraintsScope, j2, f3, f4, f5, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(Ml.j.C0296Ml c0296Ml, ModalBottomSheetState modalBottomSheetState, Function1 function1, Function1 function12, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, int i2, Composer composer, int i3) {
        J2(c0296Ml, modalBottomSheetState, function1, function12, function0, function02, function03, function04, function05, function06, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(final BoxWithConstraintsScope boxWithConstraintsScope, final long j2, final float f3, final float f4, final float f5, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(1030531862);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(boxWithConstraintsScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.nr(j2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.rl(f3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.rl(f4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.rl(f5) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1030531862, i3, -1, "com.alightcreative.monetization.ui.components.playfulunlock.Glow (PlayfulEndScreen.kt:231)");
            }
            Density density = (Density) composerKN.ty(CompositionLocalsKt.J2());
            float f6 = 2;
            BoxKt.n(BackgroundKt.rl(SizeKt.J2(boxWithConstraintsScope.n(Modifier.INSTANCE, Alignment.INSTANCE.HI()), 0.0f, 1, null), Brush.Companion.O(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.xMQ(j2), Color.xMQ(Color.INSTANCE.J2())}), Offset.O((((long) Float.floatToRawIntBits(density.l(Dp.KN(Dp.KN(boxWithConstraintsScope.nr() / f6) + f4)))) & 4294967295L) | (((long) Float.floatToRawIntBits(density.l(Dp.KN(Dp.KN(boxWithConstraintsScope.t() / f6) + f3)))) << 32)), density.l(f5), 0, 8, null), null, 0.0f, 6, null), composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.g9s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Z.O(boxWithConstraintsScope, j2, f3, f4, f5, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(ColumnScope columnScope, boolean z2, PlayfulUnlockStyle playfulUnlockStyle, int i2, Composer composer, int i3) {
        KN(columnScope, z2, playfulUnlockStyle, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
