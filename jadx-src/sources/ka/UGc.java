package ka;

import Dj7.CM;
import Dj7.QaP;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.safedk.android.analytics.brandsafety.b;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class UGc {
    public static final void rl(Function0 function0, final Function0 onTermsOfServiceLinkClick, final Function0 onPrivacyPolicyLinkClick, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        final Function0 onAcceptButtonClick = function0;
        Intrinsics.checkNotNullParameter(onAcceptButtonClick, "onAcceptButtonClick");
        Intrinsics.checkNotNullParameter(onTermsOfServiceLinkClick, "onTermsOfServiceLinkClick");
        Intrinsics.checkNotNullParameter(onPrivacyPolicyLinkClick, "onPrivacyPolicyLinkClick");
        Composer composerKN = composer.KN(982292308);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(onAcceptButtonClick) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onTermsOfServiceLinkClick) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.E2(onPrivacyPolicyLinkClick) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(982292308, i3, -1, "com.alightcreative.app.motion.ranking.ui.RankingOptInBottomSheetContent (RankingOptInBottomSheetContent.kt:30)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f3 = 16;
            Modifier modifierMUb = PaddingKt.mUb(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f3), Dp.KN(44));
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), Alignment.INSTANCE.Uo(), composerKN, 48);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierMUb);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
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
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            ImageKt.n(PainterResources_androidKt.t(2131231319, composerKN, 6), null, SizeKt.Z(companion, Dp.KN(80)), null, null, 0.0f, null, composerKN, 432, b.f61769v);
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(f3)), composerKN, 6);
            String strT = StringResources_androidKt.t(2132017635, composerKN, 6);
            Modifier modifierGh = PaddingKt.gh(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f3), 0.0f, 2, null);
            H9N.j jVar = H9N.j.f3810n;
            TextStyle textStyleIF = jVar.rl(composerKN, 6).iF();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            TextKt.t(strT, modifierGh, aD.w6.s(), 0L, null, null, null, 0L, null, TextAlign.KN(companion3.n()), 0L, 0, false, 0, 0, null, textStyleIF, composerKN, 432, 0, 65016);
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(f3)), composerKN, 6);
            TextKt.t(StringResources_androidKt.t(2132017634, composerKN, 6), PaddingKt.gh(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f3), 0.0f, 2, null), aD.w6.s(), 0L, null, null, null, 0L, null, TextAlign.KN(companion3.n()), 0L, 0, false, 0, 0, null, jVar.rl(composerKN, 6).wTp(), composerKN, 432, 0, 65016);
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(f3)), composerKN, 6);
            CM.xMQ(StringResources_androidKt.t(2132017633, composerKN, 6), PaddingKt.gh(SizeKt.KN(companion, 0.0f, 1, null), Dp.KN(f3), 0.0f, 2, null), aD.w6.s(), TextAlign.KN(companion3.n()), jVar.rl(composerKN, 6).wTp(), CollectionsKt.listOf((Object[]) new QaP[]{new QaP("tos", new P0j.Dsr(true, false, false, true, false, null, 0L, onTermsOfServiceLinkClick, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null)), new QaP("pp", new P0j.Dsr(true, false, false, true, false, null, 0L, onPrivacyPolicyLinkClick, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, null))}), composerKN, 432, 0);
            SpacerKt.n(SizeKt.Z(companion, Dp.KN(32)), composerKN, 6);
            onAcceptButtonClick = function0;
            Dj7.eO.J2(onAcceptButtonClick, StringResources_androidKt.t(2132017193, composerKN, 6), SizeKt.KN(companion, 0.0f, 1, null), null, null, null, 0, 0, 0.0f, null, null, null, false, composerKN, (i3 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 8184);
            composer2 = composerKN;
            composer2.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: ka.s4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UGc.t(onAcceptButtonClick, onTermsOfServiceLinkClick, onPrivacyPolicyLinkClick, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function0 function0, Function0 function02, Function0 function03, int i2, Composer composer, int i3) {
        rl(function0, function02, function03, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
