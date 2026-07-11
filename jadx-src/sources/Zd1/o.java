package Zd1;

import R5.I28;
import Zd1.o;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
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

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f12530n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f12531t;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function0 function0, MutableState mutableState) {
            o.Z(mutableState, false);
            function0.invoke();
            return Unit.INSTANCE;
        }

        j(Function0 function0, MutableState mutableState) {
            this.f12530n = function0;
            this.f12531t = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            rl((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(-1597695718, i2, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulAnimation.<anonymous> (PlayfulAnimation.kt:120)");
            }
            composer.eF(1713834143);
            boolean zP5 = composer.p5(this.f12530n);
            final Function0 function0 = this.f12530n;
            final MutableState mutableState = this.f12531t;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: Zd1.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o.j.t(function0, mutableState);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            Dj7.eO.J2((Function0) objIF, StringResources_androidKt.t(2132019873, composer, 6), null, null, Dj7.CN3.f1597n, null, 0, 0, 0.0f, null, null, null, false, composer, 24576, 0, 8172);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f12532n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ MutableState f12533t;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit J2(Function1 function1, MutableState mutableState) {
            o.g(mutableState, false);
            function1.invoke(I28.n.j.EnumC0293j.f8651t);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(Function1 function1, MutableState mutableState) {
            o.g(mutableState, false);
            function1.invoke(I28.n.j.EnumC0293j.f8649n);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Uo(Function1 function1, MutableState mutableState) {
            o.g(mutableState, false);
            function1.invoke(I28.n.j.EnumC0293j.f8648O);
            return Unit.INSTANCE;
        }

        n(Function1 function1, MutableState mutableState) {
            this.f12532n = function1;
            this.f12533t = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            nr((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void nr(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.v()) {
                ComposerKt.p5(1791228945, i2, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulAnimation.<anonymous> (PlayfulAnimation.kt:140)");
            }
            Modifier modifierJ2 = SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null);
            final Function1 function1 = this.f12532n;
            final MutableState mutableState = this.f12533t;
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), Alignment.INSTANCE.qie(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierJ2);
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
            Updater.O(composerN, measurePolicyRl, companion.t());
            Updater.O(composerN, compositionLocalMapIk, companion.O());
            Function2 function2Rl = companion.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            composer.eF(1149438316);
            boolean zP5 = composer.p5(function1);
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: Zd1.qz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o.n.O(function1, mutableState);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            o.mUb(rowScopeInstance, (Function0) objIF, composer, 6);
            composer.eF(1149442542);
            boolean zP52 = composer.p5(function1);
            Object objIF2 = composer.iF();
            if (zP52 || objIF2 == Composer.INSTANCE.n()) {
                objIF2 = new Function0() { // from class: Zd1.Pl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o.n.J2(function1, mutableState);
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            o.mUb(rowScopeInstance, (Function0) objIF2, composer, 6);
            composer.eF(1149446829);
            boolean zP53 = composer.p5(function1);
            Object objIF3 = composer.iF();
            if (zP53 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function0() { // from class: Zd1.Xo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o.n.Uo(function1, mutableState);
                    }
                };
                composer.o(objIF3);
            }
            composer.Xw();
            o.mUb(rowScopeInstance, (Function0) objIF3, composer, 6);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(MutableState mutableState, MutableState mutableState2) {
        Z(mutableState, true);
        ViF(mutableState2, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(MutableState mutableState, MutableState mutableState2) {
        g(mutableState, true);
        ck(mutableState2, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(BoxScope boxScope, I28.n nVar, float f3, boolean z2, Function0 function0, Function1 function1, Function0 function02, int i2, Composer composer, int i3) {
        az(boxScope, nVar, f3, z2, function0, function1, function02, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void az(final BoxScope PlayfulAnimation, final I28.n playfulState, final float f3, final boolean z2, final Function0 onPhaseEnded, final Function1 onBoxChosen, final Function0 onCloseIconClicked, Composer composer, final int i2) {
        int i3;
        MutableState mutableState;
        MutableState mutableState2;
        int i5;
        final MutableState mutableState3;
        final MutableState mutableState4;
        BoxScope boxScope;
        Intrinsics.checkNotNullParameter(PlayfulAnimation, "$this$PlayfulAnimation");
        Intrinsics.checkNotNullParameter(playfulState, "playfulState");
        Intrinsics.checkNotNullParameter(onPhaseEnded, "onPhaseEnded");
        Intrinsics.checkNotNullParameter(onBoxChosen, "onBoxChosen");
        Intrinsics.checkNotNullParameter(onCloseIconClicked, "onCloseIconClicked");
        Composer composerKN = composer.KN(499089986);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(PlayfulAnimation) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.p5(playfulState) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.rl(f3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.n(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onPhaseEnded) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerKN.E2(onBoxChosen) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerKN.E2(onCloseIconClicked) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(499089986, i3, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulAnimation (PlayfulAnimation.kt:61)");
            }
            composerKN.eF(-872899004);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composerKN.o(objIF);
            }
            final MutableState mutableState5 = (MutableState) objIF;
            composerKN.Xw();
            composerKN.eF(-872896860);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composerKN.o(objIF2);
            }
            final MutableState mutableState6 = (MutableState) objIF2;
            composerKN.Xw();
            composerKN.eF(-872894588);
            Object objIF3 = composerKN.iF();
            if (objIF3 == companion.n()) {
                objIF3 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composerKN.o(objIF3);
            }
            MutableState mutableState7 = (MutableState) objIF3;
            composerKN.Xw();
            composerKN.eF(-872892444);
            Object objIF4 = composerKN.iF();
            if (objIF4 == companion.n()) {
                objIF4 = SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null);
                composerKN.o(objIF4);
            }
            MutableState mutableState8 = (MutableState) objIF4;
            composerKN.Xw();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierAz = PaddingKt.az(companion2, 0.0f, Dp.KN(72), 0.0f, 0.0f, 13, null);
            Arrangement.Vertical verticalUo = Arrangement.f17400n.Uo();
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(verticalUo, companion3.gh(), composerKN, 0);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierAz);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            int i7 = i3;
            Function0 function0N = companion4.n();
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
            Updater.O(composerN, measurePolicyN, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            String strT = StringResources_androidKt.t(2132019874, composerKN, 6);
            float f4 = 25;
            Modifier modifierT = columnScopeInstance.t(PaddingKt.gh(companion2, Dp.KN(f4), 0.0f, 2, null), companion3.Uo());
            long jY = aD.w6.Y();
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            TextAlign textAlignKN = TextAlign.KN(companion5.n());
            H9N.j jVar = H9N.j.f3810n;
            TextKt.t(strT, modifierT, jY, 0L, null, null, null, 0L, null, textAlignKN, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).fD(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65016);
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(16)), composerKN, 6);
            TextKt.t(StringResources_androidKt.t(2132019875, composerKN, 6), columnScopeInstance.t(PaddingKt.gh(companion2, Dp.KN(f4), 0.0f, 2, null), companion3.Uo()), aD.w6.dR0(), 0L, null, null, null, 0L, null, TextAlign.KN(companion5.n()), 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).N(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65016);
            composerKN = composerKN;
            composerKN.XQ();
            composerKN.eF(-872863316);
            I28.n.C0295n c0295n = I28.n.C0295n.rl;
            if (Intrinsics.areEqual(playfulState, c0295n)) {
                int iN2 = c0295n.n();
                composerKN.eF(-872859881);
                Object objIF5 = composerKN.iF();
                if (objIF5 == companion.n()) {
                    objIF5 = new Function0() { // from class: Zd1.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.Ik(mutableState5, mutableState6);
                        }
                    };
                    composerKN.o(objIF5);
                }
                composerKN.Xw();
                i5 = 4;
                mutableState2 = mutableState6;
                mutableState = mutableState5;
                te(PlayfulAnimation, playfulState, iN2, (Function0) objIF5, composerKN, (i7 & 14) | 3072 | (i7 & 112));
            } else {
                mutableState = mutableState5;
                mutableState2 = mutableState6;
                i5 = 4;
            }
            composerKN.Xw();
            composerKN.eF(-872854571);
            if ((Intrinsics.areEqual(playfulState, c0295n) && aYN(mutableState2)) || Intrinsics.areEqual(playfulState, I28.n.w6.rl)) {
                int iN3 = I28.n.w6.rl.n();
                composerKN.eF(-872848904);
                Object objIF6 = composerKN.iF();
                if (objIF6 == companion.n()) {
                    mutableState3 = mutableState7;
                    mutableState4 = mutableState8;
                    objIF6 = new Function0() { // from class: Zd1.w6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.r(mutableState3, mutableState4);
                        }
                    };
                    composerKN.o(objIF6);
                } else {
                    mutableState3 = mutableState7;
                    mutableState4 = mutableState8;
                }
                composerKN.Xw();
                te(PlayfulAnimation, playfulState, iN3, (Function0) objIF6, composerKN, (i7 & 112) | (i7 & 14) | 3072);
            } else {
                mutableState3 = mutableState7;
                mutableState4 = mutableState8;
            }
            composerKN.Xw();
            composerKN.eF(-872843491);
            if ((Intrinsics.areEqual(playfulState, I28.n.w6.rl) && HI(mutableState4)) || (playfulState instanceof I28.n.j)) {
                int iN4 = new I28.n.j(I28.n.j.EnumC0293j.f8649n).n();
                composerKN.eF(-872837804);
                int i8 = i7 & 57344;
                boolean z3 = i8 == 16384;
                Object objIF7 = composerKN.iF();
                if (z3 || objIF7 == companion.n()) {
                    objIF7 = new Function0() { // from class: Zd1.Ml
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.o(onPhaseEnded);
                        }
                    };
                    composerKN.o(objIF7);
                }
                Function0 function0 = (Function0) objIF7;
                composerKN.Xw();
                int i9 = i7 & 126;
                te(PlayfulAnimation, playfulState, iN4, function0, composerKN, i9);
                int iN5 = new I28.n.j(I28.n.j.EnumC0293j.f8651t).n();
                composerKN.eF(-872834636);
                boolean z4 = i8 == 16384;
                Object objIF8 = composerKN.iF();
                if (z4 || objIF8 == companion.n()) {
                    objIF8 = new Function0() { // from class: Zd1.I28
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.XQ(onPhaseEnded);
                        }
                    };
                    composerKN.o(objIF8);
                }
                composerKN.Xw();
                te(PlayfulAnimation, playfulState, iN5, (Function0) objIF8, composerKN, i9);
                int iN6 = new I28.n.j(I28.n.j.EnumC0293j.f8648O).n();
                composerKN.eF(-872831500);
                boolean z5 = i8 == 16384;
                Object objIF9 = composerKN.iF();
                if (z5 || objIF9 == companion.n()) {
                    objIF9 = new Function0() { // from class: Zd1.Wre
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return o.S(onPhaseEnded);
                        }
                    };
                    composerKN.o(objIF9);
                }
                composerKN.Xw();
                boxScope = PlayfulAnimation;
                te(boxScope, playfulState, iN6, (Function0) objIF9, composerKN, i9);
            } else {
                boxScope = PlayfulAnimation;
            }
            composerKN.Xw();
            boolean zTy = ty(mutableState);
            Modifier modifierGh = PaddingKt.gh(PaddingKt.az(SizeKt.KN(boxScope.n(companion2, companion3.rl()), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.KN(32), 7, null), Dp.KN(14), 0.0f, 2, null);
            EnterTransition enterTransitionHI = EnterExitTransitionKt.HI(AnimationSpecKt.ty(200, 0, null, 6, null), 0.0f, 2, null);
            ExitTransition.Companion companion6 = ExitTransition.INSTANCE;
            int i10 = i5;
            AnimatedVisibilityKt.mUb(zTy, modifierGh, enterTransitionHI, companion6.n(), null, ComposableLambdaKt.nr(-1597695718, true, new j(onPhaseEnded, mutableState), composerKN, 54), composerKN, 196992, 16);
            float f5 = f3 / 3;
            AnimatedVisibilityKt.mUb(nY(mutableState3), SizeKt.xMQ(PaddingKt.az(SizeKt.KN(boxScope.n(companion2, companion3.O()), 0.0f, 1, null), 0.0f, Dp.KN(Dp.KN(f5) * 0.9f), 0.0f, 0.0f, 13, null), Dp.KN(Dp.KN(f5) * 1.1f)), EnterTransition.INSTANCE.n(), companion6.n(), null, ComposableLambdaKt.nr(1791228945, true, new n(onBoxChosen, mutableState3), composerKN, 54), composerKN, 196608, 16);
            if (z2) {
                o.CN3.t(onCloseIconClicked, PaddingKt.az(WindowInsetsPadding_androidKt.nr(companion2), Dp.KN(8), Dp.KN(i10), 0.0f, 0.0f, 12, null), PaddingKt.n(Dp.KN(12)), composerKN, ((i7 >> 18) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                composerKN = composerKN;
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.WPU(PlayfulAnimation, playfulState, f3, z2, onPhaseEnded, onBoxChosen, onCloseIconClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit iF(BoxScope boxScope, I28.n nVar, int i2, Function0 function0, int i3, Composer composer, int i5) {
        te(boxScope, nVar, i2, function0, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(final RowScope rowScope, final Function0 function0, Composer composer, final int i2) {
        int i3;
        Composer composerKN = composer.KN(-1358313196);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.p5(rowScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(function0) ? 32 : 16;
        }
        int i5 = i3;
        if ((i5 & 19) == 18 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1358313196, i5, -1, "com.alightcreative.monetization.ui.components.playfulunlock.GiftHitbox (PlayfulAnimation.kt:188)");
            }
            composerKN.eF(-348516170);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = InteractionSourceKt.n();
                composerKN.o(objIF);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objIF;
            composerKN.Xw();
            Modifier modifierRl = RowScope.rl(rowScope, SizeKt.nr(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
            composerKN.eF(-348510082);
            boolean z2 = (i5 & 112) == 32;
            Object objIF2 = composerKN.iF();
            if (z2 || objIF2 == companion.n()) {
                objIF2 = new Function0() { // from class: Zd1.Dsr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return o.gh(function0);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            BoxKt.n(ClickableKt.nr(modifierRl, mutableInteractionSource, null, false, null, null, (Function0) objIF2, 28, null), composerKN, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.aC
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.qie(rowScope, function0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(RowScope rowScope, Function0 function0, int i2, Composer composer, int i3) {
        mUb(rowScope, function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final boolean HI(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void ViF(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XQ(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    private static final boolean aYN(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    private static final void ck(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final boolean nY(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void te(final BoxScope boxScope, final I28.n nVar, int i2, Function0 function0, Composer composer, final int i3) {
        int i5;
        boolean z2;
        float f3;
        final int i7;
        final Function0 function02;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composerKN = composer.KN(1381540467);
        if ((i3 & 6) == 0) {
            if (composerKN.p5(boxScope)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            if (composerKN.p5(nVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            if (composerKN.t(i2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i5 |= i9;
        }
        if ((i3 & 3072) == 0) {
            if (composerKN.E2(function0)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i5 |= i8;
        }
        if ((i5 & 1171) == 1170 && composerKN.xMQ()) {
            composerKN.wTp();
            function02 = function0;
            i7 = i2;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1381540467, i5, -1, "com.alightcreative.monetization.ui.components.playfulunlock.PlayfulLottie (PlayfulAnimation.kt:172)");
            }
            if (nVar.n() == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = z2;
            Modifier modifierN = boxScope.n(Modifier.INSTANCE, Alignment.INSTANCE.O());
            if (z3) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            Dj7.lej.t(i2, AlphaKt.n(modifierN, f3), false, z3, null, function0, composerKN, ((i5 >> 6) & 14) | RendererCapabilities.DECODER_SUPPORT_MASK | ((i5 << 6) & 458752), 16);
            i7 = i2;
            function02 = function0;
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Zd1.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return o.iF(boxScope, nVar, i7, function02, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean ty(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }
}
