package pTd;

import GJW.vd;
import R5.Ml;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material3.windowsizeclass.WindowSizeClass;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.account.PurchasePeriod;
import f.EnumC1982eO;
import java.util.ArrayList;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pTd.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final R5.CN3 f71959n;
    private static final R5.CN3 nr;
    private static final R5.CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final R5.CN3 f71960t;

    static final class j implements Function2 {
        final /* synthetic */ Function0 E2;
        final /* synthetic */ Ml.j.C0297j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ LazyListState f71961O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ Function1 f71962S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function0 f71963Z;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ vd f71964e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1 f71965g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ WindowSizeClass f71966n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f71967o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f71968r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ScrollState f71969t;

        /* JADX INFO: renamed from: pTd.o$j$j, reason: collision with other inner class name */
        static final class C1103j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Ml.j.C0297j f71970O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f71971n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ LazyListState f71972t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C1103j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1103j(LazyListState lazyListState, Ml.j.C0297j c0297j, Continuation continuation) {
                super(2, continuation);
                this.f71972t = lazyListState;
                this.f71970O = c0297j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C1103j(this.f71972t, this.f71970O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f71971n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    LazyListState lazyListState = this.f71972t;
                    int iMin = Math.min(this.f71970O.KN() + 1, this.f71970O.ty().size() - 1);
                    this.f71971n = 1;
                    if (LazyListState.qie(lazyListState, iMin, 0, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        j(WindowSizeClass windowSizeClass, ScrollState scrollState, LazyListState lazyListState, Ml.j.C0297j c0297j, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Function0 function04, vd vdVar) {
            this.f71966n = windowSizeClass;
            this.f71969t = scrollState;
            this.f71961O = lazyListState;
            this.J2 = c0297j;
            this.f71968r = function0;
            this.f71967o = function02;
            this.f71963Z = function03;
            this.f71962S = function1;
            this.f71965g = function12;
            this.E2 = function04;
            this.f71964e = vdVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(vd vdVar, LazyListState lazyListState, Ml.j.C0297j c0297j) {
            GJW.C.nr(vdVar, null, null, new C1103j(lazyListState, c0297j, null), 3, null);
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
                ComposerKt.p5(-232478192, i2, -1, "com.alightcreative.monetization.ui.components.cloudcards.PaywallCloudCardsContent.<anonymous> (CloudCardsContent.kt:57)");
            }
            Pl.rl(this.f71966n, this.f71969t, this.f71961O, this.J2, this.f71968r, this.f71967o, this.f71963Z, this.f71962S, this.f71965g, composer, 0);
            if (this.J2.ck()) {
                composer.eF(-539163577);
                o.CN3.t(this.E2, PaddingKt.az(WindowInsetsPadding_androidKt.nr(Modifier.INSTANCE), Dp.KN(8), Dp.KN(4), 0.0f, 0.0f, 12, null), PaddingKt.n(Dp.KN(12)), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                composer.Xw();
            } else if (this.J2.KN() >= this.J2.ty().size() - 1 || !(this.J2.J2() == EnumC1982eO.J2 || this.J2.J2() == EnumC1982eO.f64024r || this.J2.J2() == EnumC1982eO.f64019Z)) {
                composer.eF(-537858384);
                composer.Xw();
            } else {
                composer.eF(-538510903);
                composer.eF(536819816);
                boolean zE2 = composer.E2(this.f71964e) | composer.p5(this.f71961O) | composer.E2(this.J2);
                final vd vdVar = this.f71964e;
                final LazyListState lazyListState = this.f71961O;
                final Ml.j.C0297j c0297j = this.J2;
                Object objIF = composer.iF();
                if (zE2 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: pTd.C
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.j.t(vdVar, lazyListState, c0297j);
                        }
                    };
                    composer.o(objIF);
                }
                composer.Xw();
                o.Xo.t((Function0) objIF, PaddingKt.az(WindowInsetsPadding_androidKt.nr(Modifier.INSTANCE), 0.0f, Dp.KN(4), Dp.KN(8), 0.0f, 9, null), PaddingKt.n(Dp.KN(12)), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                composer.Xw();
            }
            D.I28.rl(0.9f, this.J2.nr(), composer, 6, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        mg4.w6 w6Var = mg4.w6.f70997n;
        PurchasePeriod.Companion companion = PurchasePeriod.INSTANCE;
        R5.CN3 cn3 = new R5.CN3(TuplesKt.to(w6Var, CollectionsKt.listOf(new R5.Wre("$2.99", 2990000L, "USD", companion.rl(), null, null, null, null, null, null, null, null, 4080, null))));
        f71959n = cn3;
        R5.CN3 cn32 = new R5.CN3(TuplesKt.to(w6Var, CollectionsKt.listOf(R5.Wre.rl((R5.Wre) cn3.gh().get(0), null, 0L, null, null, null, null, null, null, 7, null, null, null, 3839, null))));
        rl = cn32;
        R5.CN3 cn33 = new R5.CN3(TuplesKt.to(w6Var, CollectionsKt.listOf((Object[]) new R5.Wre[]{cn32.gh().get(0), R5.Wre.rl((R5.Wre) cn32.gh().get(0), "$29.99", 0L, null, companion.t(), null, null, null, null, null, null, null, null, 4086, null)})));
        f71960t = cn33;
        Pair pair = TuplesKt.to(w6Var, cn33.gh());
        mg4.w6 w6Var2 = mg4.w6.f70998t;
        List<R5.Wre> listGh = cn33.gh();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listGh, 10));
        for (R5.Wre wre : listGh) {
            arrayList.add(R5.Wre.rl(wre, StringsKt.replace$default(wre.qie(), '2', '5', false, 4, (Object) null), 0L, null, null, null, null, null, null, null, null, null, null, 4094, null));
        }
        nr = new R5.CN3(pair, TuplesKt.to(w6Var2, arrayList));
    }

    public static final void rl(final ScrollState scrollState, final Ml.j.C0297j viewState, final WindowSizeClass windowSizeClass, final LazyListState cloudBackupRowLazyListState, final Function0 onContinueButtonClicked, final Function0 onManageSubscriptionClicked, final Function0 onFreeTrialCheckboxClicked, final Function1 onSubscriptionClicked, final Function1 onTierSelected, final Function0 onCloseIconClicked, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(windowSizeClass, "windowSizeClass");
        Intrinsics.checkNotNullParameter(cloudBackupRowLazyListState, "cloudBackupRowLazyListState");
        Intrinsics.checkNotNullParameter(onContinueButtonClicked, "onContinueButtonClicked");
        Intrinsics.checkNotNullParameter(onManageSubscriptionClicked, "onManageSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onFreeTrialCheckboxClicked, "onFreeTrialCheckboxClicked");
        Intrinsics.checkNotNullParameter(onSubscriptionClicked, "onSubscriptionClicked");
        Intrinsics.checkNotNullParameter(onTierSelected, "onTierSelected");
        Intrinsics.checkNotNullParameter(onCloseIconClicked, "onCloseIconClicked");
        Composer composerKN = composer.KN(-1073475116);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(scrollState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(viewState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.p5(windowSizeClass) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.p5(cloudBackupRowLazyListState) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onContinueButtonClicked) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onManageSubscriptionClicked) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(onFreeTrialCheckboxClicked) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerKN.E2(onSubscriptionClicked) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerKN.E2(onTierSelected) ? androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= composerKN.E2(onCloseIconClicked) ? 536870912 : 268435456;
        }
        if ((306783379 & i3) == 306783378 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1073475116, i3, -1, "com.alightcreative.monetization.ui.components.cloudcards.PaywallCloudCardsContent (CloudCardsContent.kt:50)");
            }
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = EffectsKt.mUb(EmptyCoroutineContext.INSTANCE, composerKN);
                composerKN.o(objIF);
            }
            vd vdVar = (vd) objIF;
            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
            H9N.j jVar = H9N.j.f3810n;
            composer2 = composerKN;
            SurfaceKt.n(modifierJ2, null, jVar.n(composerKN, 6).rl(), jVar.n(composerKN, 6).t(), null, 0.0f, ComposableLambdaKt.nr(-232478192, true, new j(windowSizeClass, scrollState, cloudBackupRowLazyListState, viewState, onContinueButtonClicked, onManageSubscriptionClicked, onFreeTrialCheckboxClicked, onSubscriptionClicked, onTierSelected, onCloseIconClicked, vdVar), composerKN, 54), composer2, 1572870, 50);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pTd.aC
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.t(scrollState, viewState, windowSizeClass, cloudBackupRowLazyListState, onContinueButtonClicked, onManageSubscriptionClicked, onFreeTrialCheckboxClicked, onSubscriptionClicked, onTierSelected, onCloseIconClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(ScrollState scrollState, Ml.j.C0297j c0297j, WindowSizeClass windowSizeClass, LazyListState lazyListState, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Function0 function04, int i2, Composer composer, int i3) {
        rl(scrollState, c0297j, windowSizeClass, lazyListState, function0, function02, function03, function1, function12, function04, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
