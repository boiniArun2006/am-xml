package Vil;

import Vil.Pl;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f11079n = Dp.KN(12);

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f11080n;

        j(Function0 function0) {
            this.f11080n = function0;
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
                ComposerKt.p5(277613779, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetDiscoverMore.<anonymous> (PresetDiscoverMore.kt:42)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierN = ClipKt.n(companion, RoundedCornerShapeKt.t(Pl.f11079n));
            composer.eF(-908337431);
            boolean zP5 = composer.p5(this.f11080n);
            final Function0 function0 = this.f11080n;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: Vil.qz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Pl.j.t(function0);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            Modifier modifierJ2 = ClickableKt.J2(modifierN, false, null, null, (Function0) objIF, 7, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion2.HI(), false);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierJ2);
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
            Updater.O(composerN, measurePolicyUo, companion3.t());
            Updater.O(composerN, compositionLocalMapIk, companion3.O());
            Function2 function2Rl = companion3.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion3.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            float f3 = 12;
            Modifier modifierXMQ = PaddingKt.xMQ(ClipKt.n(SizeKt.J2(companion, 0.0f, 1, null), RoundedCornerShapeKt.t(Pl.f11079n)), Dp.KN(f3));
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.J2(), companion2.xMQ(), composer, 48);
            int iN2 = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk2 = composer.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composer, modifierXMQ);
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
            Updater.O(composerN2, measurePolicyRl, companion3.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion3.O());
            Function2 function2Rl2 = companion3.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion3.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            ImageKt.n(PainterResources_androidKt.t(2131231080, composer, 6), null, null, null, null, 0.0f, null, composer, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(f3)), composer, 6);
            String strT = StringResources_androidKt.t(2132017152, composer, 6);
            Modifier modifierRl = RowScope.rl(rowScopeInstance, companion, 1.0f, false, 2, null);
            TextStyle textStyleNY = H9N.j.f3810n.rl(composer, 6).nY();
            TextKt.t(strT, modifierRl, aD.w6.fcU(), 0L, null, null, null, 0L, null, TextAlign.KN(TextAlign.INSTANCE.nr()), 0L, TextOverflow.INSTANCE.rl(), false, 1, 0, null, textStyleNY, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 3120, 54776);
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(16)), composer, 6);
            ImageKt.n(PainterResources_androidKt.t(2131231535, composer, 6), null, null, null, null, 0.0f, null, composer, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            composer.XQ();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final void rl(final Function0 onDiscoverMoreClicked, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onDiscoverMoreClicked, "onDiscoverMoreClicked");
        Composer composerKN = composer.KN(1684365910);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(onDiscoverMoreClicked) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(1684365910, i3, -1, "com.alightcreative.maineditor.presetpreview.ui.components.PresetDiscoverMore (PresetDiscoverMore.kt:33)");
            }
            CardKt.n(SizeKt.xMQ(SizeKt.KN(Modifier.INSTANCE, 0.0f, 1, null), Dp.KN(48)), RoundedCornerShapeKt.t(f11079n), aD.w6.xg(), 0L, null, Dp.KN(0), ComposableLambdaKt.nr(277613779, true, new j(onDiscoverMoreClicked), composerKN, 54), composerKN, 1769862, 24);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: Vil.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Pl.t(onDiscoverMoreClicked, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function0 function0, int i2, Composer composer, int i3) {
        rl(function0, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
