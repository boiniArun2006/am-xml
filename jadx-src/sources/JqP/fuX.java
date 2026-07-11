package JqP;

import android.net.Uri;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.material3.windowsizeclass.WindowSizeClass;
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class fuX {

    static final class j implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f4705O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Function1 f4706Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f4707n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function0 f4708o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f4709r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ a4.CN3 f4710t;

        /* JADX INFO: renamed from: JqP.fuX$j$j, reason: collision with other inner class name */
        static final class C0163j implements Function3 {
            final /* synthetic */ Function0 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ boolean f4711O;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ Function1 f4712Z;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ boolean f4713n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Function0 f4714o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Function0 f4715r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ a4.CN3 f4716t;

            /* JADX INFO: renamed from: JqP.fuX$j$j$j, reason: collision with other inner class name */
            static final class C0164j implements Function4 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ boolean f4717O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ a4.CN3 f4718n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Function1 f4719t;

                C0164j(a4.CN3 cn3, Function1 function1, boolean z2) {
                    this.f4718n = cn3;
                    this.f4719t = function1;
                    this.f4717O = z2;
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    n((PagerScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                    return Unit.INSTANCE;
                }

                public final void n(PagerScope HorizontalPager, int i2, Composer composer, int i3) {
                    Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-2055003004, i3, -1, "com.alightcreative.onboarding.ui.OnboardingContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnboardingActivity.kt:143)");
                    }
                    T.j jVar = (T.j) this.f4718n.rl().get(i2);
                    Function1 function1 = this.f4719t;
                    boolean z2 = this.f4717O;
                    a4.CN3 cn3 = this.f4718n;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.gh(), composer, 0);
                    int iN = ComposablesKt.n(composer, 0);
                    CompositionLocalMap compositionLocalMapIk = composer.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer, companion);
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
                    composer.eF(403596530);
                    x0X.n nVar = (x0X.n) function1.invoke(Integer.valueOf(jVar.t()));
                    if (!(nVar instanceof n.C1266n)) {
                        if (!(nVar instanceof n.w6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fuX.KN((Uri) ((n.w6) nVar).n(), fuX.ty(cn3.n(), i2), z2 ? AspectRatioKt.rl(columnScopeInstance.n(SizeKt.KN(companion, 0.0f, 1, null), 1.0f, false), 1.0f, false, 2, null) : AspectRatioKt.rl(SizeKt.KN(companion, 0.0f, 1, null), 0.8f, false, 2, null), composer, 0, 0);
                    }
                    composer.Xw();
                    fuX.J2(StringResources_androidKt.t(jVar.rl(), composer, 0), StringResources_androidKt.t(jVar.n(), composer, 0), Dp.KN(z2 ? 32 : 56), composer, 0);
                    composer.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }

            C0163j(boolean z2, a4.CN3 cn3, boolean z3, Function0 function0, Function0 function02, Function0 function03, Function1 function1) {
                this.f4713n = z2;
                this.f4716t = cn3;
                this.f4711O = z3;
                this.J2 = function0;
                this.f4715r = function02;
                this.f4714o = function03;
                this.f4712Z = function1;
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
                    ComposerKt.p5(-1278340517, i3, -1, "com.alightcreative.onboarding.ui.OnboardingContent.<anonymous>.<anonymous> (OnboardingActivity.kt:132)");
                }
                boolean z2 = this.f4713n && ((double) (BoxWithConstraints.nr() / BoxWithConstraints.t())) < 1.8d;
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierGh = PaddingKt.gh(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(this.f4713n ? 0 : 80), 0.0f, 2, null);
                a4.CN3 cn3 = this.f4716t;
                boolean z3 = this.f4711O;
                Function0 function0 = this.J2;
                Function0 function02 = this.f4715r;
                Function0 function03 = this.f4714o;
                boolean z4 = this.f4713n;
                Function1 function1 = this.f4712Z;
                Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composer, 0);
                int iN = ComposablesKt.n(composer, 0);
                CompositionLocalMap compositionLocalMapIk = composer.Ik();
                Modifier modifierO = ComposedModifierKt.O(composer, modifierGh);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0 function0N = companion3.n();
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
                Updater.O(composerN, measurePolicyN, companion3.t());
                Updater.O(composerN, compositionLocalMapIk, companion3.O());
                Function2 function2Rl = companion3.rl();
                if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                    composerN.o(Integer.valueOf(iN));
                    composerN.az(Integer.valueOf(iN), function2Rl);
                }
                Updater.O(composerN, modifierO, companion3.nr());
                PagerKt.n(cn3.n(), ColumnScope.rl(ColumnScopeInstance.f17468n, companion, 1.0f, false, 2, null), null, null, 0, 0.0f, companion2.qie(), null, false, false, null, null, null, null, ComposableLambdaKt.nr(-2055003004, true, new C0164j(cn3, function1, z2), composer, 54), composer, 1572864, 24576, 16316);
                a4.Wre.J2(cn3, z3, function0, function02, function03, SizeKt.KN(PaddingKt.mUb(companion, Dp.KN(z4 ? 24 : 26), Dp.KN(8)), 0.0f, 1, null), composer, 0, 0);
                composer.XQ();
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }
        }

        j(boolean z2, a4.CN3 cn3, boolean z3, Function0 function0, Function0 function02, Function0 function03, Function1 function1) {
            this.f4707n = z2;
            this.f4710t = cn3;
            this.f4705O = z3;
            this.J2 = function0;
            this.f4709r = function02;
            this.f4708o = function03;
            this.f4706Z = function1;
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
                ComposerKt.p5(906183793, i2, -1, "com.alightcreative.onboarding.ui.OnboardingContent.<anonymous> (OnboardingActivity.kt:127)");
            }
            BoxWithConstraintsKt.n(WindowInsetsPadding_androidKt.t(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null)), null, false, ComposableLambdaKt.nr(-1278340517, true, new C0163j(this.f4707n, this.f4710t, this.f4705O, this.J2, this.f4709r, this.f4708o, this.f4706Z), composer, 54), composer, 3072, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ty(PagerState pagerState, int i2) {
        float f3 = i2;
        return RangesKt.rangeTo(f3 - 0.5f, f3 + 0.5f).contains(Float.valueOf(pagerState.S() + pagerState.WPU()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(final String str, String str2, final float f3, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        final String str3;
        Composer composerKN = composer.KN(-787297720);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(str2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.rl(f3) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            str3 = str2;
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-787297720, i3, -1, "com.alightcreative.onboarding.ui.TextContent (OnboardingActivity.kt:208)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f4 = 24;
            Modifier modifierKN = SizeKt.KN(ScrollKt.Uo(PaddingKt.qie(companion, Dp.KN(f4), f3, Dp.KN(f4), Dp.KN(32)), ScrollKt.t(0, composerKN, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
            Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion2.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion3.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyN, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            Modifier modifierKN2 = SizeKt.KN(columnScopeInstance.t(companion, companion2.Uo()), 0.0f, 1, null);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            TextAlign textAlignKN = TextAlign.KN(companion4.n());
            H9N.j jVar = H9N.j.f3810n;
            composer2 = composerKN;
            TextKt.t(str, modifierKN2, 0L, 0L, null, null, null, 0L, null, textAlignKN, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).t(), composer2, i3 & 14, 0, 65020);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f4)), composer2, 6);
            str3 = str2;
            TextKt.t(str3, SizeKt.KN(columnScopeInstance.t(companion, companion2.Uo()), 0.0f, 1, null), Color.az(jVar.n(composer2, 6).t(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, TextAlign.KN(companion4.n()), 0L, 0, false, 0, 0, null, jVar.rl(composer2, 6).XQ(), composer2, (i3 >> 3) & 14, 0, 65016);
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: JqP.Wre
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.Uo(str, str3, f3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KN(final Uri uri, final boolean z2, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i5;
        Composer composerKN = composer.KN(1529103430);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.E2(uri) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z2) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.p5(modifier) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (i7 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1529103430, i5, -1, "com.alightcreative.onboarding.ui.VisualContent (OnboardingActivity.kt:194)");
            }
            MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0 function0N = companion.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N);
            } else {
                composerKN.r();
            }
            Composer composerN = Updater.n(composerKN);
            Updater.O(composerN, measurePolicyUo, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            a4.o.O(uri, z2, null, 0, composerKN, i5 & 126, 12);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: JqP.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.xMQ(uri, z2, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(a4.CN3 cn3, boolean z2, WindowSizeClass windowSizeClass, Function0 function0, Function0 function02, Function0 function03, Function1 function1, int i2, Composer composer, int i3) {
        nr(cn3, z2, windowSizeClass, function0, function02, function03, function1, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Uo(String str, String str2, float f3, int i2, Composer composer, int i3) {
        J2(str, str2, f3, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(final a4.CN3 cn3, final boolean z2, WindowSizeClass windowSizeClass, final Function0 function0, final Function0 function02, final Function0 function03, final Function1 function1, Composer composer, final int i2) {
        int i3;
        final WindowSizeClass windowSizeClass2;
        Composer composer2;
        Composer composerKN = composer.KN(1799809333);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(cn3) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            windowSizeClass2 = windowSizeClass;
            i3 |= composerKN.p5(windowSizeClass2) ? 256 : 128;
        } else {
            windowSizeClass2 = windowSizeClass;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(function02) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(function03) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(function1) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1799809333, i3, -1, "com.alightcreative.onboarding.ui.OnboardingContent (OnboardingActivity.kt:120)");
            }
            boolean zQie = WindowWidthSizeClass.qie(windowSizeClass2.getWidthSizeClass(), WindowWidthSizeClass.INSTANCE.nr());
            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
            H9N.j jVar = H9N.j.f3810n;
            composer2 = composerKN;
            SurfaceKt.n(modifierJ2, null, jVar.n(composerKN, 6).rl(), jVar.n(composerKN, 6).t(), null, 0.0f, ComposableLambdaKt.nr(906183793, true, new j(zQie, cn3, z2, function0, function02, function03, function1), composerKN, 54), composer2, 1572870, 50);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: JqP.I28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.O(cn3, z2, windowSizeClass2, function0, function02, function03, function1, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Uri uri, boolean z2, Modifier modifier, int i2, int i3, Composer composer, int i5) {
        KN(uri, z2, modifier, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
