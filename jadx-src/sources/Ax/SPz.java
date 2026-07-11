package Ax;

import Dj7.hQ;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.Iterator;
import ka.K;
import ka.psW;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class SPz {

    static final class j implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f159O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ FX.n f160n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Function0 f161r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f162t;

        j(FX.n nVar, Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
            this.f160n = nVar;
            this.f162t = function1;
            this.f159O = function12;
            this.J2 = function0;
            this.f161r = function02;
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
                ComposerKt.p5(-162160370, i2, -1, "com.alightcreative.app.motion.ranking.ui.card.CreatorRankingStatusCard.<anonymous> (CreatorRankingStatusCard.kt:55)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal horizontalUo = companion.Uo();
            FX.n nVar = this.f160n;
            Function1 function1 = this.f162t;
            Function1 function12 = this.f159O;
            Function0 function0 = this.J2;
            Function0 function02 = this.f161r;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), horizontalUo, composer, 48);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, companion2);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            float f3 = 24;
            SpacerKt.n(SizeKt.xMQ(companion2, Dp.KN(f3)), composer, 6);
            Modifier modifierKN = SizeKt.KN(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierKN);
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
            Updater.O(composerN2, measurePolicyUo, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            hQ.rl(StringResources_androidKt.t(2132017542, composer, 6), BoxScopeInstance.f17448n.n(companion2, companion.ty()), null, composer, 0, 4);
            composer.XQ();
            float f4 = 4;
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f4)), composer, 6);
            String strT = StringResources_androidKt.t(2132017635, composer, 6);
            Modifier modifierKN2 = SizeKt.KN(companion2, 0.0f, 1, null);
            H9N.j jVar = H9N.j.f3810n;
            TextStyle textStyleG = jVar.rl(composer, 6).g();
            long jS2 = aD.w6.s();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            TextKt.t(strT, modifierKN2, jS2, 0L, null, null, null, 0L, null, TextAlign.KN(companion4.n()), 0L, 0, false, 0, 0, null, textStyleG, composer, 432, 0, 65016);
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f4)), composer, 6);
            TextKt.t(StringResources_androidKt.t(2132017628, composer, 6), SizeKt.KN(companion2, 0.0f, 1, null), aD.w6.s(), 0L, null, null, null, 0L, null, TextAlign.KN(companion4.n()), 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).s7N(), composer, 432, 0, 65016);
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f3)), composer, 6);
            SPz.Uo(nVar, function1, function12, composer, 0);
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f3)), composer, 6);
            Dj7.eO.J2(function0, StringResources_androidKt.t(2132017626, composer, 6), SizeKt.KN(companion2, 0.0f, 1, null), null, Dj7.CN3.f1600t, null, 0, 0, 0.0f, null, null, null, false, composer, 24960, 0, 8168);
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(8)), composer, 6);
            cg.z.t(StringResources_androidKt.t(2132017543, composer, 6), function02, null, composer, 0, 4);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void O(final FX.n creatorRankingData, final Function0 onRankingButtonClick, final Function1 onSocialMediaClick, final Function1 onMenuClick, final Function0 onFaqButtonClick, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(creatorRankingData, "creatorRankingData");
        Intrinsics.checkNotNullParameter(onRankingButtonClick, "onRankingButtonClick");
        Intrinsics.checkNotNullParameter(onSocialMediaClick, "onSocialMediaClick");
        Intrinsics.checkNotNullParameter(onMenuClick, "onMenuClick");
        Intrinsics.checkNotNullParameter(onFaqButtonClick, "onFaqButtonClick");
        Composer composerKN = composer.KN(1115644540);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(creatorRankingData) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onRankingButtonClick) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onSocialMediaClick) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerKN.E2(onMenuClick) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerKN.E2(onFaqButtonClick) ? 16384 : 8192;
        }
        if ((i3 & 9363) == 9362 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1115644540, i3, -1, "com.alightcreative.app.motion.ranking.ui.card.CreatorRankingStatusCard (CreatorRankingStatusCard.kt:53)");
            }
            Dj7.QJ.rl(ComposableLambdaKt.nr(-162160370, true, new j(creatorRankingData, onSocialMediaClick, onMenuClick, onRankingButtonClick, onFaqButtonClick), composerKN, 54), composerKN, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Ax.s4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SPz.J2(creatorRankingData, onRankingButtonClick, onSocialMediaClick, onMenuClick, onFaqButtonClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J2(FX.n nVar, Function0 function0, Function1 function1, Function1 function12, Function0 function02, int i2, Composer composer, int i3) {
        O(nVar, function0, function1, function12, function02, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(Function1 function1, FX.n nVar, MutableState mutableState) {
        function1.invoke(new qz(nVar, mUb(mutableState)));
        return Unit.INSTANCE;
    }

    public static final void Uo(final FX.n creatorRankingData, final Function1 onSocialMediaClick, final Function1 onMenuClick, Composer composer, final int i2) {
        int i3;
        String string;
        Composer composer2;
        Intrinsics.checkNotNullParameter(creatorRankingData, "creatorRankingData");
        Intrinsics.checkNotNullParameter(onSocialMediaClick, "onSocialMediaClick");
        Intrinsics.checkNotNullParameter(onMenuClick, "onMenuClick");
        Composer composerKN = composer.KN(-214778941);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(creatorRankingData) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onSocialMediaClick) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onMenuClick) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-214778941, i3, -1, "com.alightcreative.app.motion.ranking.ui.card.CreatorRankingStatusSection (CreatorRankingStatusCard.kt:108)");
            }
            composerKN.eF(-2068681730);
            Object objIF = composerKN.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = SnapshotStateKt__SnapshotStateKt.O(Float.valueOf(0.0f), null, 2, null);
                composerKN.o(objIF);
            }
            final MutableState mutableState = (MutableState) objIF;
            composerKN.Xw();
            RoundedCornerShape roundedCornerShapeT = RoundedCornerShapeKt.t(Dp.KN(12));
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierKN = SizeKt.KN(companion2, 0.0f, 1, null);
            composerKN.eF(-2068676111);
            Object objIF2 = composerKN.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new Function1() { // from class: Ax.UGc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SPz.qie(mutableState, (LayoutCoordinates) obj);
                    }
                };
                composerKN.o(objIF2);
            }
            composerKN.Xw();
            Modifier modifierN = OnGloballyPositionedModifierKt.n(modifierKN, (Function1) objIF2);
            float f3 = 1;
            int i5 = i3;
            Modifier modifierT = BackgroundKt.t(BorderKt.J2(modifierN, Dp.KN(f3), aD.w6.ty(), roundedCornerShapeT), aD.w6.az(), roundedCornerShapeT);
            float f4 = 16;
            float f5 = 18;
            Modifier modifierQie = PaddingKt.qie(modifierT, Dp.KN(f5), Dp.KN(f4), Dp.KN(f4), Dp.KN(f4));
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Vertical verticalXMQ = companion3.xMQ();
            Arrangement arrangement = Arrangement.f17400n;
            MeasurePolicy measurePolicyRl = RowKt.rl(arrangement.J2(), verticalXMQ, composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierQie);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
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
            Updater.O(composerN, measurePolicyRl, companion4.t());
            Updater.O(composerN, compositionLocalMapIk, companion4.O());
            Function2 function2Rl = companion4.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion4.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Modifier modifierJ2 = BorderKt.J2(SizeKt.Z(companion2, Dp.KN(44)), Dp.KN(f3), aD.w6.ty(), RoundedCornerShapeKt.J2());
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion3.O(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, modifierJ2);
            Function0 function0N2 = companion4.n();
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
            Updater.O(composerN2, measurePolicyUo, companion4.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion4.O());
            Function2 function2Rl2 = companion4.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion4.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Integer numRl = creatorRankingData.rl();
            if (numRl == null || (string = numRl.toString()) == null) {
                string = "999+";
            }
            String str = string;
            H9N.j jVar = H9N.j.f3810n;
            boolean z2 = false;
            TextKt.t(str, null, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).ViF(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            composerKN.XQ();
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f5)), composerKN, 6);
            Modifier modifierRl = RowScope.rl(rowScopeInstance, companion2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyN = ColumnKt.n(arrangement.Uo(), companion3.gh(), composerKN, 0);
            int iN3 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk3 = composerKN.Ik();
            Modifier modifierO3 = ComposedModifierKt.O(composerKN, modifierRl);
            Function0 function0N3 = companion4.n();
            if (composerKN.getApplier() == null) {
                ComposablesKt.t();
            }
            composerKN.T();
            if (composerKN.getInserting()) {
                composerKN.s7N(function0N3);
            } else {
                composerKN.r();
            }
            Composer composerN3 = Updater.n(composerKN);
            Updater.O(composerN3, measurePolicyN, companion4.t());
            Updater.O(composerN3, compositionLocalMapIk3, companion4.O());
            Function2 function2Rl3 = companion4.rl();
            if (composerN3.getInserting() || !Intrinsics.areEqual(composerN3.iF(), Integer.valueOf(iN3))) {
                composerN3.o(Integer.valueOf(iN3));
                composerN3.az(Integer.valueOf(iN3), function2Rl3);
            }
            Updater.O(composerN3, modifierO3, companion4.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            TextKt.t(creatorRankingData.n().rl(), null, aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).ViF(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            TextKt.t(StringResources_androidKt.nr(2132017632, new Object[]{Integer.valueOf(creatorRankingData.n().n())}, composerKN, 6), null, aD.w6.Lp6(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).s7N(), composerKN, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            Composer composer3 = composerKN;
            float f6 = 8;
            SpacerKt.n(SizeKt.Z(companion2, Dp.KN(f6)), composer3, 6);
            MeasurePolicy measurePolicyRl2 = RowKt.rl(arrangement.J2(), companion3.qie(), composer3, 0);
            int iN4 = ComposablesKt.n(composer3, 0);
            CompositionLocalMap compositionLocalMapIk4 = composer3.Ik();
            Modifier modifierO4 = ComposedModifierKt.O(composer3, companion2);
            Function0 function0N4 = companion4.n();
            if (composer3.getApplier() == null) {
                ComposablesKt.t();
            }
            composer3.T();
            if (composer3.getInserting()) {
                composer3.s7N(function0N4);
            } else {
                composer3.r();
            }
            Composer composerN4 = Updater.n(composer3);
            Updater.O(composerN4, measurePolicyRl2, companion4.t());
            Updater.O(composerN4, compositionLocalMapIk4, companion4.O());
            Function2 function2Rl4 = companion4.rl();
            if (composerN4.getInserting() || !Intrinsics.areEqual(composerN4.iF(), Integer.valueOf(iN4))) {
                composerN4.o(Integer.valueOf(iN4));
                composerN4.az(Integer.valueOf(iN4), function2Rl4);
            }
            Updater.O(composerN4, modifierO4, companion4.nr());
            composer3.eF(398216657);
            Iterator it = creatorRankingData.n().t().iterator();
            while (it.hasNext()) {
                Composer composer4 = composer3;
                K.t((FX.Ml) it.next(), onSocialMediaClick, psW.f70027t, composer4, (i5 & 112) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                SpacerKt.n(SizeKt.Z(Modifier.INSTANCE, Dp.KN(f6)), composer4, 6);
                mutableState = mutableState;
                z2 = z2;
                composer3 = composer4;
            }
            boolean z3 = z2;
            Composer composer5 = composer3;
            final MutableState mutableState2 = mutableState;
            composer5.Xw();
            composer5.XQ();
            composer5.XQ();
            SpacerKt.n(SizeKt.Z(Modifier.INSTANCE, Dp.KN(f5)), composer5, 6);
            long jLp6 = aD.w6.Lp6();
            composer5.eF(1250395478);
            if ((i5 & 896) == 256) {
                z3 = true;
            }
            boolean zE2 = z3 | composer5.E2(creatorRankingData);
            Object objIF3 = composer5.iF();
            if (zE2 || objIF3 == Composer.INSTANCE.n()) {
                objIF3 = new Function0() { // from class: Ax.Q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SPz.KN(onMenuClick, creatorRankingData, mutableState2);
                    }
                };
                composer5.o(objIF3);
            }
            composer5.Xw();
            KA9.UGc.Ik(rowScopeInstance, jLp6, false, (Function0) objIF3, composer5, 54, 2);
            composer2 = composer5;
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Ax.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SPz.xMQ(creatorRankingData, onSocialMediaClick, onMenuClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit qie(MutableState mutableState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        gh(mutableState, Float.intBitsToFloat((int) (LayoutCoordinatesKt.Uo(it) & 4294967295L)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(FX.n nVar, Function1 function1, Function1 function12, int i2, Composer composer, int i3) {
        Uo(nVar, function1, function12, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    private static final void gh(MutableState mutableState, float f3) {
        mutableState.setValue(Float.valueOf(f3));
    }

    private static final float mUb(MutableState mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }
}
