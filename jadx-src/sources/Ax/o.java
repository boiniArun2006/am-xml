package Ax;

import Ax.o;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class o {

    static final class j implements Function3 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f183O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f184n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ qz f185o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f186r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f187t;

        /* JADX INFO: renamed from: Ax.o$j$j, reason: collision with other inner class name */
        static final class C0001j implements Function3 {
            final /* synthetic */ Function0 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function0 f188O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Function0 f189n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ MutableState f190o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ qz f191r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Function0 f192t;

            /* JADX INFO: renamed from: Ax.o$j$j$j, reason: collision with other inner class name */
            static final class C0002j implements Function3 {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                final /* synthetic */ qz f193n;

                C0002j(qz qzVar) {
                    this.f193n = qzVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit O(qz it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit nr(FX.Ml it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    t((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return Unit.INSTANCE;
                }

                public final void t(ColumnScope CardWithMenu, Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(CardWithMenu, "$this$CardWithMenu");
                    if ((i2 & 17) == 16 && composer.xMQ()) {
                        composer.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-264384419, i2, -1, "com.alightcreative.app.motion.ranking.ui.card.CreatorRankingCardMenu.<anonymous>.<anonymous>.<anonymous> (CreatorRankingCardMenu.kt:67)");
                    }
                    Modifier modifierGh = PaddingKt.gh(Modifier.INSTANCE, Dp.KN(32), 0.0f, 2, null);
                    qz qzVar = this.f193n;
                    MeasurePolicy measurePolicyUo = BoxKt.Uo(Alignment.INSTANCE.HI(), false);
                    int iN = ComposablesKt.n(composer, 0);
                    CompositionLocalMap compositionLocalMapIk = composer.Ik();
                    Modifier modifierO = ComposedModifierKt.O(composer, modifierGh);
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
                    FX.n nVarRl = qzVar.rl();
                    composer.eF(-2075751295);
                    Object objIF = composer.iF();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objIF == companion2.n()) {
                        objIF = new Function1() { // from class: Ax.aC
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return o.j.C0001j.C0002j.nr((FX.Ml) obj);
                            }
                        };
                        composer.o(objIF);
                    }
                    Function1 function1 = (Function1) objIF;
                    composer.Xw();
                    composer.eF(-2075749375);
                    Object objIF2 = composer.iF();
                    if (objIF2 == companion2.n()) {
                        objIF2 = new Function1() { // from class: Ax.C
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return o.j.C0001j.C0002j.O((qz) obj);
                            }
                        };
                        composer.o(objIF2);
                    }
                    composer.Xw();
                    SPz.Uo(nVarRl, function1, (Function1) objIF2, composer, 432);
                    composer.XQ();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            }

            C0001j(Function0 function0, Function0 function02, Function0 function03, Function0 function04, qz qzVar, MutableState mutableState) {
                this.f189n = function0;
                this.f192t = function02;
                this.f188O = function03;
                this.J2 = function04;
                this.f191r = qzVar;
                this.f190o = mutableState;
            }

            public final void O(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i2 & 17) == 16 && composer.xMQ()) {
                    composer.wTp();
                    return;
                }
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1086866604, i2, -1, "com.alightcreative.app.motion.ranking.ui.card.CreatorRankingCardMenu.<anonymous>.<anonymous> (CreatorRankingCardMenu.kt:50)");
                }
                Object objTy = composer.ty(CompositionLocalsKt.J2());
                Density density = (Density) objTy;
                float fKN = Dp.KN(density.bzg(this.f191r.n()) - density.bzg(o.t(this.f190o)));
                composer.eF(-67767816);
                boolean zP5 = composer.p5(this.f189n);
                final Function0 function0 = this.f189n;
                Object objIF = composer.iF();
                if (zP5 || objIF == Composer.INSTANCE.n()) {
                    objIF = new Function0() { // from class: Ax.Wre
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.j.C0001j.J2(function0);
                        }
                    };
                    composer.o(objIF);
                }
                Function0 function02 = (Function0) objIF;
                composer.Xw();
                composer.eF(-67764902);
                boolean zP52 = composer.p5(this.f192t);
                final Function0 function03 = this.f192t;
                Object objIF2 = composer.iF();
                if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                    objIF2 = new Function0() { // from class: Ax.CN3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.j.C0001j.Uo(function03);
                        }
                    };
                    composer.o(objIF2);
                }
                Function0 function04 = (Function0) objIF2;
                composer.Xw();
                composer.eF(-67762025);
                boolean zP53 = composer.p5(this.f188O);
                final Function0 function05 = this.f188O;
                Object objIF3 = composer.iF();
                if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                    objIF3 = new Function0() { // from class: Ax.fuX
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.j.C0001j.KN(function05);
                        }
                    };
                    composer.o(objIF3);
                }
                Function0 function06 = (Function0) objIF3;
                composer.Xw();
                composer.eF(-67759340);
                boolean zP54 = composer.p5(this.J2);
                final Function0 function07 = this.J2;
                Object objIF4 = composer.iF();
                if (zP54 || objIF4 == Composer.INSTANCE.n()) {
                    objIF4 = new Function0() { // from class: Ax.Dsr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.j.C0001j.xMQ(function07);
                        }
                    };
                    composer.o(objIF4);
                }
                composer.Xw();
                ka.Wre.J2(fKN, function02, function04, function06, (Function0) objIF4, ComposableLambdaKt.nr(-264384419, true, new C0002j(this.f191r), composer, 54), composer, 196608);
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
            public static final Unit J2(Function0 function0) {
                function0.invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit KN(Function0 function0) {
                function0.invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit Uo(Function0 function0) {
                function0.invoke();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit xMQ(Function0 function0) {
                function0.invoke();
                return Unit.INSTANCE;
            }
        }

        j(MutableState mutableState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, qz qzVar) {
            this.f184n = mutableState;
            this.f187t = function0;
            this.f183O = function02;
            this.J2 = function03;
            this.f186r = function04;
            this.f185o = qzVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(MutableState mutableState, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            o.nr(mutableState, Float.intBitsToFloat((int) (LayoutCoordinatesKt.Uo(it) & 4294967295L)));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            rl((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(-2036949142, i2, -1, "com.alightcreative.app.motion.ranking.ui.card.CreatorRankingCardMenu.<anonymous> (CreatorRankingCardMenu.kt:43)");
            }
            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
            composer.eF(-293193316);
            final MutableState mutableState = this.f184n;
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: Ax.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return o.j.t(mutableState, (LayoutCoordinates) obj);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            BoxWithConstraintsKt.n(OnGloballyPositionedModifierKt.n(modifierJ2, (Function1) objIF), null, false, ComposableLambdaKt.nr(-1086866604, true, new C0001j(this.f187t, this.f183O, this.J2, this.f186r, this.f185o, this.f184n), composer, 54), composer, 3078, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(qz qzVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i2, Composer composer, int i3) {
        rl(qzVar, function0, function02, function03, function04, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void rl(final qz state, final Function0 onEditClicked, final Function0 onOptOutClicked, final Function0 onFaqClicked, final Function0 onDismiss, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEditClicked, "onEditClicked");
        Intrinsics.checkNotNullParameter(onOptOutClicked, "onOptOutClicked");
        Intrinsics.checkNotNullParameter(onFaqClicked, "onFaqClicked");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerKN = composer.KN(1304167234);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(state) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onEditClicked) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onOptOutClicked) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onFaqClicked) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onDismiss) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1304167234, i3, -1, "com.alightcreative.app.motion.ranking.ui.card.CreatorRankingCardMenu (CreatorRankingCardMenu.kt:35)");
            }
            composerKN.eF(-545309278);
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Float.valueOf(0.0f), null, 2, null);
                composerKN.o(objIF);
            }
            composerKN.Xw();
            AnimatedVisibilityKt.mUb(true, null, EnterExitTransitionKt.HI(AnimationSpecKt.ty(200, 0, null, 6, null), 0.0f, 2, null), ExitTransition.INSTANCE.n(), null, ComposableLambdaKt.nr(-2036949142, true, new j((MutableState) objIF, onEditClicked, onOptOutClicked, onFaqClicked, onDismiss, state), composerKN, 54), composerKN, 196998, 18);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Ax.Ml
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.O(state, onEditClicked, onOptOutClicked, onFaqClicked, onDismiss, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(MutableState mutableState, float f3) {
        mutableState.setValue(Float.valueOf(f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(MutableState mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }
}
