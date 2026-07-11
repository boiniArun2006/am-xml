package pBD;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.CardKt;
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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pBD.QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class QJ {

    static final class j implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f71652O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ MutableState f71653n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f71654t;

        j(MutableState mutableState, int i2, int i3, Function0 function0) {
            this.f71653n = mutableState;
            this.f71654t = i2;
            this.f71652O = i3;
            this.J2 = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(MutableState mutableState, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            QJ.nr(mutableState, (int) (it.n() & 4294967295L));
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
                ComposerKt.p5(-23858624, i2, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.MyAccountActivityTimedDiscountCard.<anonymous> (MyAccountActivityTimedDiscountCard.kt:49)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierKN = SizeKt.KN(companion, 0.0f, 1, null);
            final MutableState mutableState = this.f71653n;
            int i3 = this.f71654t;
            int i5 = this.f71652O;
            Function0 function0 = this.J2;
            Arrangement arrangement = Arrangement.f17400n;
            Arrangement.Horizontal horizontalJ2 = arrangement.J2();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(horizontalJ2, companion2.qie(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierKN);
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
            Updater.O(composerN, measurePolicyRl, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            ImageKt.n(PainterResources_androidKt.t(2131232076, composer, 6), "Countdown paywall visual", RowScope.rl(rowScopeInstance, SizeKt.xMQ(companion, ((Density) composer.ty(CompositionLocalsKt.J2())).rV9(QJ.t(mutableState))), 0.39f, false, 2, null), null, ContentScale.INSTANCE.n(), 0.0f, null, composer, 24624, 104);
            composer.eF(-442793922);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: pBD.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return QJ.j.t(mutableState, (LayoutCoordinates) obj);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            float f3 = 20;
            float f4 = 16;
            Modifier modifierQie = PaddingKt.qie(RowScope.rl(rowScopeInstance, OnGloballyPositionedModifierKt.n(companion, (Function1) objIF), 0.61f, false, 2, null), Dp.KN(f3), Dp.KN(f3), Dp.KN(f4), Dp.KN(f3));
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), companion2.gh(), composer, 48);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierQie);
            Function0 function0N2 = companion3.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N2);
            } else {
                composer.r();
            }
            Composer composerN2 = Updater.n(composer);
            Updater.O(composerN2, measurePolicyN, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            afx.rl(i3, composer, 0);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(8)), composer, 6);
            TextKt.t(StringResources_androidKt.nr(2132017527, new Object[]{Integer.valueOf(i5)}, composer, 6), null, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).g(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            SpacerKt.n(SizeKt.xMQ(companion, Dp.KN(f4)), composer, 6);
            Dj7.eO.J2(function0, StringResources_androidKt.t(2132017524, composer, 6), null, null, Dj7.CN3.f1597n, null, 0, 0, Dp.KN(0), null, null, null, false, composer, 100687872, 0, 7916);
            composer.XQ();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(int i2, int i3, Function0 function0, int i5, Composer composer, int i7) {
        rl(i2, i3, function0, composer, RecomposeScopeImplKt.n(i5 | 1));
        return Unit.INSTANCE;
    }

    public static final void rl(final int i2, final int i3, final Function0 onGetDiscountClicked, Composer composer, final int i5) {
        int i7;
        Intrinsics.checkNotNullParameter(onGetDiscountClicked, "onGetDiscountClicked");
        Composer composerKN = composer.KN(1527867613);
        if ((i5 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= composerKN.t(i3) ? 32 : 16;
        }
        if ((i5 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i7 |= composerKN.E2(onGetDiscountClicked) ? 256 : 128;
        }
        if ((i7 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1527867613, i7, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.MyAccountActivityTimedDiscountCard (MyAccountActivityTimedDiscountCard.kt:41)");
            }
            composerKN.eF(1034681379);
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(0, null, 2, null);
                composerKN.o(objIF);
            }
            composerKN.Xw();
            CardKt.n(PaddingKt.az(Modifier.INSTANCE, 0.0f, Dp.KN(24), 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.t(Dp.KN(12)), aD.w6.az(), 0L, BorderStrokeKt.n(Dp.KN((float) 1.5d), aD.w6.s()), 0.0f, ComposableLambdaKt.nr(-23858624, true, new j((MutableState) objIF, i2, i3, onGetDiscountClicked), composerKN, 54), composerKN, 1597830, 40);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.eO
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QJ.O(i2, i3, onGetDiscountClicked, i5, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(MutableState mutableState, int i2) {
        mutableState.setValue(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }
}
