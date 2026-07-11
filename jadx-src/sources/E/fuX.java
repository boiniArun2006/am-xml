package E;

import Dj7.CM;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class fuX {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Modifier modifier, Function0 function0, Function0 function02, int i2, int i3, Composer composer, int i5) {
        t(modifier, function0, function02, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit nr() {
        return Unit.INSTANCE;
    }

    public static final void t(Modifier modifier, final Function0 onBackClicked, final Function0 onEditClicked, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i5;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onEditClicked, "onEditClicked");
        Composer composerKN = composer.KN(1708582131);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (composerKN.p5(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.E2(onBackClicked) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onEditClicked) ? 256 : 128;
        }
        int i8 = i5;
        if ((i8 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.v()) {
                ComposerKt.p5(1708582131, i8, -1, "com.alightcreative.template.importpreview.ui.components.TemplateHeaderButtonsRow (TemplateHeaderButtonsRow.kt:29)");
            }
            Modifier modifierKN = SizeKt.KN(modifier4, 0.0f, 1, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRl = RowKt.rl(Arrangement.f17400n.nr(), companion.xMQ(), composerKN, 54);
            int iN = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk = composerKN.Ik();
            Modifier modifierO = ComposedModifierKt.O(composerKN, modifierKN);
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
            Updater.O(composerN, measurePolicyRl, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            RowScopeInstance rowScopeInstance = RowScopeInstance.f17780n;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyUo = BoxKt.Uo(companion.HI(), false);
            int iN2 = ComposablesKt.n(composerKN, 0);
            CompositionLocalMap compositionLocalMapIk2 = composerKN.Ik();
            Modifier modifierO2 = ComposedModifierKt.O(composerKN, companion3);
            Function0 function0N2 = companion2.n();
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
            Updater.O(composerN2, measurePolicyUo, companion2.t());
            Updater.O(composerN2, compositionLocalMapIk2, companion2.O());
            Function2 function2Rl2 = companion2.rl();
            if (composerN2.getInserting() || !Intrinsics.areEqual(composerN2.iF(), Integer.valueOf(iN2))) {
                composerN2.o(Integer.valueOf(iN2));
                composerN2.az(Integer.valueOf(iN2), function2Rl2);
            }
            Updater.O(composerN2, modifierO2, companion2.nr());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f17448n;
            Modifier modifierN = AlphaKt.n(companion3, 0.0f);
            String strT = StringResources_androidKt.t(2132019778, composerKN, 6);
            composerKN.eF(395968801);
            Object objIF = composerKN.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: E.Wre
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return fuX.nr();
                    }
                };
                composerKN.o(objIF);
            }
            composerKN.Xw();
            I28.rl(modifierN, (Function0) objIF, strT, null, null, false, 0L, 0L, composerKN, 196662, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
            Modifier modifier5 = modifier4;
            composerKN = composerKN;
            I28.rl(SizeKt.ViF(companion3, Dp.KN(24)), onBackClicked, null, 2131232011, null, false, 0L, 0L, composerKN, (i8 & 112) | 3078, 244);
            composerKN.XQ();
            String strT2 = StringResources_androidKt.t(2132020307, composerKN, 6);
            long jEF = aD.w6.EF();
            Modifier modifierRl = RowScope.rl(rowScopeInstance, PaddingKt.gh(SizeKt.mUb(rowScopeInstance.t(companion3, companion.xMQ()), Dp.KN(26), Dp.KN(34)), Dp.KN(6), 0.0f, 2, null), 1.0f, false, 2, null);
            int iN3 = TextAlign.INSTANCE.n();
            H9N.j jVar = H9N.j.f3810n;
            CM.ty(strT2, CollectionsKt.listOf((Object[]) new TextStyle[]{jVar.rl(composerKN, 6).ViF(), jVar.rl(composerKN, 6).nY(), jVar.rl(composerKN, 6).g(), jVar.rl(composerKN, 6).te()}), modifierRl, jEF, null, TextAlign.KN(iN3), 0, false, 0, composerKN, 3072, 464);
            I28.rl(companion3, onEditClicked, StringResources_androidKt.t(2132019778, composerKN, 6), null, null, false, 0L, 0L, composerKN, ((i8 >> 3) & 112) | 6, 248);
            composerKN.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: E.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.O(modifier3, onBackClicked, onEditClicked, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
