package ka;

import Dj7.AbstractC1328c;
import Dj7.CM;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import java.util.List;
import ka.eO;
import ka.vd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f70041n = Dp.KN(12);

    static final class j implements Function3 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f70042O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ eO.j f70043n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ MutableState f70044o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ MutableState f70045r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f70046t;

        /* JADX INFO: renamed from: ka.vd$j$j, reason: collision with other inner class name */
        static final class C1032j implements Function3 {
            final /* synthetic */ Function0 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f70047O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ eO.j f70048n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ MutableState f70049o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ MutableState f70050r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function0 f70051t;

            /* JADX INFO: renamed from: ka.vd$j$j$j, reason: collision with other inner class name */
            static final class C1033j implements Function3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ FX.n f70052n;

                C1033j(FX.n nVar) {
                    this.f70052n = nVar;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    n((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void n(ColumnScope CardWithMenu, Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(CardWithMenu, "$this$CardWithMenu");
                    if ((i2 & 17) == 16 && composer.xMQ()) {
                        composer.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(1870581247, i2, -1, "com.alightcreative.app.motion.ranking.ui.RankingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RankingScreen.kt:222)");
                    }
                    AbstractC2213c.t(this.f70052n.rl(), this.f70052n.n(), null, composer, 0, 4);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit xMQ(MutableState mutableState) {
                vd.qie(mutableState, false);
                return Unit.INSTANCE;
            }

            C1032j(eO.j jVar, Function0 function0, Function0 function02, Function0 function03, MutableState mutableState, MutableState mutableState2) {
                this.f70048n = jVar;
                this.f70051t = function0;
                this.f70047O = function02;
                this.J2 = function03;
                this.f70050r = mutableState;
                this.f70049o = mutableState2;
            }

            public final void O(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i2 & 17) == 16 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1500083439, i2, -1, "com.alightcreative.app.motion.ranking.ui.RankingScreen.<anonymous>.<anonymous> (RankingScreen.kt:201)");
                }
                FX.n nVarRl = this.f70048n.rl();
                if (nVarRl != null) {
                    final Function0 function0 = this.f70051t;
                    final Function0 function02 = this.f70047O;
                    final Function0 function03 = this.J2;
                    MutableState mutableState = this.f70050r;
                    final MutableState mutableState2 = this.f70049o;
                    float fBzg = ((Density) composer.ty(CompositionLocalsKt.J2())).bzg(vd.o(mutableState));
                    composer.eF(1065892373);
                    boolean zP5 = composer.p5(function0);
                    Object objIF = composer.iF();
                    if (zP5 || objIF == Composer.INSTANCE.n()) {
                        objIF = new Function0() { // from class: ka.lej
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return vd.j.C1032j.J2(function0, mutableState2);
                            }
                        };
                        composer.o(objIF);
                    }
                    Function0 function04 = (Function0) objIF;
                    composer.Xw();
                    composer.eF(1065897047);
                    boolean zP52 = composer.p5(function02);
                    Object objIF2 = composer.iF();
                    if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                        objIF2 = new Function0() { // from class: ka.iwV
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return vd.j.C1032j.Uo(function02, mutableState2);
                            }
                        };
                        composer.o(objIF2);
                    }
                    Function0 function05 = (Function0) objIF2;
                    composer.Xw();
                    composer.eF(1065901684);
                    boolean zP53 = composer.p5(function03);
                    Object objIF3 = composer.iF();
                    if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                        objIF3 = new Function0() { // from class: ka.M
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return vd.j.C1032j.KN(function03, mutableState2);
                            }
                        };
                        composer.o(objIF3);
                    }
                    Function0 function06 = (Function0) objIF3;
                    composer.Xw();
                    composer.eF(1065906093);
                    Object objIF4 = composer.iF();
                    if (objIF4 == Composer.INSTANCE.n()) {
                        objIF4 = new Function0() { // from class: ka.rv6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return vd.j.C1032j.xMQ(mutableState2);
                            }
                        };
                        composer.o(objIF4);
                    }
                    composer.Xw();
                    Wre.J2(fBzg, function04, function05, function06, (Function0) objIF4, ComposableLambdaKt.nr(1870581247, true, new C1033j(nVarRl), composer, 54), composer, 221184);
                }
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                O((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit J2(Function0 function0, MutableState mutableState) {
                function0.invoke();
                vd.qie(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit KN(Function0 function0, MutableState mutableState) {
                function0.invoke();
                vd.qie(mutableState, false);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit Uo(Function0 function0, MutableState mutableState) {
                function0.invoke();
                vd.qie(mutableState, false);
                return Unit.INSTANCE;
            }
        }

        j(eO.j jVar, Function0 function0, Function0 function02, Function0 function03, MutableState mutableState, MutableState mutableState2) {
            this.f70043n = jVar;
            this.f70046t = function0;
            this.f70042O = function02;
            this.J2 = function03;
            this.f70045r = mutableState;
            this.f70044o = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(-1749743685, i2, -1, "com.alightcreative.app.motion.ranking.ui.RankingScreen.<anonymous> (RankingScreen.kt:198)");
            }
            BoxWithConstraintsKt.n(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.nr(-1500083439, true, new C1032j(this.f70043n, this.f70046t, this.f70042O, this.J2, this.f70045r, this.f70044o), composer, 54), composer, 3078, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final class n extends Lambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f70053n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(List list) {
            super(1);
            this.f70053n = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return n(((Number) obj).intValue());
        }

        public final Object n(int i2) {
            this.f70053n.get(i2);
            return null;
        }
    }

    public static final class w6 extends Lambda implements Function4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ List f70054n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f70055t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(List list, Function1 function1) {
            super(4);
            this.f70054n = list;
            this.f70055t = function1;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
            int i5;
            if ((i3 & 6) == 0) {
                i5 = (composer.p5(lazyItemScope) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
            if ((i3 & 48) == 0) {
                i5 |= composer.t(i2) ? 32 : 16;
            }
            if (!composer.HI((i5 & 147) != 146, i5 & 1)) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1091073711, i5, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            FX.j jVar = (FX.j) this.f70054n.get(i2);
            composer.eF(827978423);
            afx.rl(i2, jVar, this.f70055t, composer, ((i5 & 126) >> 3) & 14);
            composer.Xw();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit az(MutableState mutableState) {
        qie(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(MutableState mutableState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Z(mutableState, Float.intBitsToFloat((int) (LayoutCoordinatesKt.O(it) & 4294967295L)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(eO.j jVar, Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List listN = jVar.n();
        LazyColumn.qie(listN.size(), null, new n(listN), ComposableLambdaKt.rl(-1091073711, true, new w6(listN, function1)));
        return Unit.INSTANCE;
    }

    private static final void KN(final Function0 function0, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-1355705778);
        if ((i2 & 6) == 0) {
            i3 = i2 | (composerKN.E2(function0) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1355705778, i3, -1, "com.alightcreative.app.motion.ranking.ui.JoinButton (RankingScreen.kt:237)");
            }
            Dj7.eO.J2(function0, StringResources_androidKt.t(2132017617, composerKN, 6), SizeKt.KN(PaddingKt.gh(Modifier.INSTANCE, Dp.KN(16), 0.0f, 2, null), 0.0f, 1, null), null, Dj7.CN3.f1597n, null, 0, 0, 0.0f, null, null, null, false, composerKN, (i3 & 14) | 24960, 0, 8168);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: ka.Ln
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return vd.xMQ(function0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void mUb(final eO.j viewState, final Function0 onSignInClicked, final Function1 onJoinClicked, final Function0 onOptOutClicked, final Function0 onEditClicked, final Function0 onFaqClicked, final Function1 onSocialMediaClicked, Composer composer, final int i2) {
        int i3;
        int i5;
        Modifier.Companion companion;
        int i7;
        MutableState mutableState;
        int i8;
        Easing easing;
        final eO.j jVar;
        float f3;
        int i9;
        final MutableState mutableState2;
        Unit unit;
        Composer composer2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onSignInClicked, "onSignInClicked");
        Intrinsics.checkNotNullParameter(onJoinClicked, "onJoinClicked");
        Intrinsics.checkNotNullParameter(onOptOutClicked, "onOptOutClicked");
        Intrinsics.checkNotNullParameter(onEditClicked, "onEditClicked");
        Intrinsics.checkNotNullParameter(onFaqClicked, "onFaqClicked");
        Intrinsics.checkNotNullParameter(onSocialMediaClicked, "onSocialMediaClicked");
        Composer composerKN = composer.KN(556603107);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(viewState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onSignInClicked) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onJoinClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onOptOutClicked) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onEditClicked) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onFaqClicked) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(onSocialMediaClicked) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(556603107, i3, -1, "com.alightcreative.app.motion.ranking.ui.RankingScreen (RankingScreen.kt:58)");
            }
            composerKN.eF(637221104);
            Object objIF = composerKN.iF();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objIF == companion2.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composerKN.o(objIF);
            }
            final MutableState mutableState3 = (MutableState) objIF;
            composerKN.Xw();
            composerKN.eF(637223533);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion2.n()) {
                objIF2 = SnapshotStateKt__SnapshotStateKt.O(Float.valueOf(0.0f), null, 2, null);
                composerKN.o(objIF2);
            }
            MutableState mutableState4 = (MutableState) objIF2;
            composerKN.Xw();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            int i10 = i3;
            Modifier modifierKN = SizeKt.KN(companion3, 0.0f, 1, null);
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Vertical verticalUo = arrangement.Uo();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion4.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion5.n();
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
            Updater.O(composerN, measurePolicyN, companion5.t());
            Updater.O(composerN, compositionLocalMapIk, companion5.O());
            Function2 function2Rl = companion5.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion5.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            float f4 = 24;
            SpacerKt.n(SizeKt.xMQ(companion3, Dp.KN(f4)), composerKN, 6);
            float f5 = 16;
            Modifier modifierGh = PaddingKt.gh(companion3, Dp.KN(f5), 0.0f, 2, null);
            MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), companion4.qie(), composerKN, 0);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierGh);
            Function0 function0N2 = companion5.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N2);
            } else {
                composerKN.r();
            }
            Composer composerN2 = Updater.n(composerKN);
            Updater.O(composerN2, measurePolicyRl, companion5.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion5.O());
            Function2 function2Rl2 = companion5.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion5.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            CM.S(StringResources_androidKt.t(2132017618, composerKN, 6), H9N.j.f3810n.rl(composerKN, 6).g(), RowScope.rl(rowScopeInstance, companion3, 1.0f, false, 2, null), aD.w6.F(), null, null, TextAlign.KN(TextAlign.INSTANCE.nr()), 0, false, 0, null, composerKN, 3072, 0, 1968);
            MutableState mutableState5 = mutableState4;
            Composer composer3 = composerKN;
            IconKt.n(PainterResources_androidKt.t(2131231930, composerKN, 6), null, ClickableKt.J2(SizeKt.Z(rowScopeInstance.t(companion3, companion4.xMQ()), Dp.KN(f4)), false, null, null, onFaqClicked, 7, null), 0L, composer3, 48, 8);
            composer3.XQ();
            SpacerKt.n(SizeKt.xMQ(companion3, Dp.KN(f4)), composer3, 6);
            if (viewState.nr()) {
                composer3.eF(-1520736071);
                Modifier modifierKN2 = SizeKt.KN(companion3, 0.0f, 1, null);
                long jQZ6 = aD.w6.QZ6();
                float f6 = 0;
                float fKN = Dp.KN(f6);
                float f7 = f70041n;
                CardKt.n(PaddingKt.gh(AbstractC1328c.n(modifierKN2, jQZ6, fKN, f7, (b.f61769v & 8) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 16) != 0 ? Dp.KN(0) : 0.0f, (b.f61769v & 32) != 0 ? 1.0f : 0.0f, (b.f61769v & 64) != 0 ? 1.0f : 0.0f), Dp.KN(f5), 0.0f, 2, null), RoundedCornerShapeKt.t(f7), 0L, 0L, null, Dp.KN(f6), CN3.f69956n.n(), composer3, 1769472, 28);
                composer3.Xw();
                mutableState = mutableState3;
                f3 = 0.0f;
                i8 = 2;
                easing = null;
                jVar = viewState;
                i7 = 1;
            } else {
                composer3.eF(-1518942938);
                if (viewState.t()) {
                    composer3.eF(-1518940458);
                    final FX.n nVarRl = viewState.rl();
                    composer3.eF(-741733176);
                    if (nVarRl == null) {
                        i9 = 1;
                        mutableState2 = mutableState5;
                        unit = null;
                    } else {
                        if (nVarRl.t()) {
                            composer3.eF(1026323187);
                            composer3.eF(-521079453);
                            Object objIF3 = composer3.iF();
                            if (objIF3 == companion2.n()) {
                                mutableState2 = mutableState5;
                                objIF3 = new Function1() { // from class: ka.Z
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return vd.HI(mutableState2, (LayoutCoordinates) obj);
                                    }
                                };
                                composer3.o(objIF3);
                            } else {
                                mutableState2 = mutableState5;
                            }
                            composer3.Xw();
                            Modifier modifierN = OnGloballyPositionedModifierKt.n(companion3, (Function1) objIF3);
                            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion4.HI(), false);
                            int iN3 = ComposablesKt.n(composer3, 0);
                            CompositionLocalMap compositionLocalMapIk3 = composer3.Ik();
                            Modifier modifierO3 = ComposedModifierKt.O(composer3, modifierN);
                            Function0 function0N3 = companion5.n();
                            if (composer3.getApplier() == null) {
                                ComposablesKt.t();
                            }
                            composer3.T();
                            if (composer3.getInserting()) {
                                composer3.s7N(function0N3);
                            } else {
                                composer3.r();
                            }
                            Composer composerN3 = Updater.n(composer3);
                            Updater.O(composerN3, measurePolicyUo, companion5.t());
                            Updater.O(composerN3, compositionLocalMapIk3, companion5.O());
                            Function2 function2Rl3 = companion5.rl();
                            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                                composerN3.o(Integer.valueOf(iN3));
                                composerN3.az(Integer.valueOf(iN3), function2Rl3);
                            }
                            Updater.O(composerN3, modifierO3, companion5.nr());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
                            Integer numRl = nVarRl.rl();
                            FX.j jVarN = nVarRl.n();
                            composer3.eF(1065825316);
                            Object objIF4 = composer3.iF();
                            if (objIF4 == companion2.n()) {
                                objIF4 = new Function0() { // from class: ka.Ew
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return vd.az(mutableState3);
                                    }
                                };
                                composer3.o(objIF4);
                            }
                            Function0 function0 = (Function0) objIF4;
                            composer3.Xw();
                            i9 = 1;
                            AbstractC2213c.t(numRl, jVarN, function0, composer3, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                            composer3.XQ();
                            composer3.Xw();
                        } else {
                            i9 = 1;
                            mutableState2 = mutableState5;
                            composer3.eF(1026951867);
                            composer3.eF(-521060724);
                            boolean zE2 = ((i10 & 896) == 256) | composer3.E2(nVarRl);
                            Object objIF5 = composer3.iF();
                            if (zE2 || objIF5 == companion2.n()) {
                                objIF5 = new Function0() { // from class: ka.nKK
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return vd.ty(onJoinClicked, nVarRl);
                                    }
                                };
                                composer3.o(objIF5);
                            }
                            composer3.Xw();
                            KN((Function0) objIF5, composer3, 0);
                            composer3.Xw();
                        }
                        unit = Unit.INSTANCE;
                    }
                    composer3.Xw();
                    if (unit == null) {
                        composer3.eF(-521055088);
                        int i11 = (i10 & 896) == 256 ? i9 : 0;
                        Object objIF6 = composer3.iF();
                        if (i11 != 0 || objIF6 == companion2.n()) {
                            objIF6 = new Function0() { // from class: ka.DAz
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return vd.ck(onJoinClicked);
                                }
                            };
                            composer3.o(objIF6);
                        }
                        composer3.Xw();
                        KN((Function0) objIF6, composer3, 0);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composer3.Xw();
                    mutableState = mutableState3;
                    companion = companion3;
                    i7 = i9;
                    i5 = i10;
                    mutableState5 = mutableState2;
                } else {
                    composer3.eF(-1517877561);
                    int i12 = ((i10 >> 3) & 14) | 24960;
                    i5 = i10;
                    companion = companion3;
                    i7 = 1;
                    mutableState = mutableState3;
                    Dj7.eO.J2(onSignInClicked, StringResources_androidKt.t(2132017627, composer3, 6), SizeKt.KN(PaddingKt.gh(companion3, Dp.KN(f5), 0.0f, 2, null), 0.0f, 1, null), null, Dj7.CN3.f1597n, null, 0, 0, 0.0f, null, null, null, false, composer3, i12, 0, 8168);
                    composer3 = composer3;
                    composer3.Xw();
                }
                float f8 = 12;
                SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f8)), composer3, 6);
                i8 = 2;
                easing = null;
                Modifier modifierJ2 = SizeKt.J2(PaddingKt.gh(companion, Dp.KN(f5), 0.0f, 2, null), 0.0f, i7, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalTy = arrangement.ty(Dp.KN(f8));
                PaddingValues paddingValuesO = PaddingKt.O(0.0f, Dp.KN(f8), 0.0f, Dp.KN(f5), 5, null);
                composer3.eF(-741676271);
                jVar = viewState;
                int i13 = (composer3.E2(jVar) ? 1 : 0) | ((i5 & 3670016) == 1048576 ? i7 : 0);
                Object objIF7 = composer3.iF();
                if (i13 != 0 || objIF7 == companion2.n()) {
                    objIF7 = new Function1() { // from class: ka.u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return vd.Ik(jVar, onSocialMediaClicked, (LazyListScope) obj);
                        }
                    };
                    composer3.o(objIF7);
                }
                composer3.Xw();
                Composer composer4 = composer3;
                f3 = 0.0f;
                LazyDslKt.rl(modifierJ2, null, paddingValuesO, false, horizontalOrVerticalTy, null, null, false, null, (Function1) objIF7, composer4, 24582, 490);
                composer3 = composer4;
                composer3.Xw();
            }
            composer3.XQ();
            Composer composer5 = composer3;
            AnimatedVisibilityKt.mUb(gh(mutableState), null, EnterExitTransitionKt.HI(AnimationSpecKt.ty(200, 0, easing, 6, easing), f3, i8, easing), ExitTransition.INSTANCE.n(), null, ComposableLambdaKt.nr(-1749743685, i7, new j(jVar, onEditClicked, onOptOutClicked, onFaqClicked, mutableState5, mutableState), composer3, 54), composer5, 196992, 18);
            composer2 = composer5;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: ka.qf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return vd.r(viewState, onSignInClicked, onJoinClicked, onOptOutClicked, onEditClicked, onFaqClicked, onSocialMediaClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(eO.j jVar, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function0 function04, Function1 function12, int i2, Composer composer, int i3) {
        mUb(jVar, function0, function1, function02, function03, function04, function12, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(Function0 function0, int i2, Composer composer, int i3) {
        KN(function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final void Z(MutableState mutableState, float f3) {
        mutableState.setValue(Float.valueOf(f3));
    }

    private static final boolean gh(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o(MutableState mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void qie(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ty(Function1 function1, FX.n nVar) {
        function1.invoke(Boolean.valueOf(nVar.nr()));
        return Unit.INSTANCE;
    }
}
