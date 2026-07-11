package g8;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.exoplayer.RendererCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class fuX {

    static final class j implements Function4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f67099n;

        j(boolean z2) {
            this.f67099n = z2;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((RowScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope CheckableCard, boolean z2, Composer composer, int i2) {
            int i3;
            String strT;
            Intrinsics.checkNotNullParameter(CheckableCard, "$this$CheckableCard");
            if ((i2 & 6) == 0) {
                i3 = i2 | (composer.p5(CheckableCard) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i3 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) == 130 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1580023085, i3, -1, "com.alightcreative.monetization.stackedintro.components.EnableFreeAccess.<anonymous> (EnableFreeAccess.kt:33)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierT = CheckableCard.t(companion, companion2.xMQ());
            boolean z3 = this.f67099n;
            MeasurePolicy measurePolicyN = ColumnKt.n(Arrangement.f17400n.Uo(), companion2.gh(), composer, 0);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, modifierT);
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
            if (z3) {
                composer.eF(1088992257);
                strT = StringResources_androidKt.t(2132020194, composer, 6);
                composer.Xw();
            } else {
                composer.eF(1089118148);
                strT = StringResources_androidKt.t(2132020196, composer, 6);
                composer.Xw();
            }
            MaterialTheme materialTheme = MaterialTheme.f26164n;
            int i5 = MaterialTheme.rl;
            TextKt.t(strT, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(materialTheme.t(composer, i5).getTitleMedium(), 0L, TextUnitKt.KN(18), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer, 0, 0, 65534);
            composer.eF(-1488879802);
            if (!z3) {
                TextKt.t(StringResources_androidKt.t(2132020195, composer, 6), null, 0L, 0L, null, FontWeight.INSTANCE.t(), null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(materialTheme.t(composer, i5).getTitleSmall(), 0L, TextUnitKt.KN(14), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer, 196608, 0, 65502);
            }
            composer.Xw();
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void rl(Modifier modifier, final boolean z2, final Function1 onSelectionChanged, Composer composer, final int i2, final int i3) {
        int i5;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(onSelectionChanged, "onSelectionChanged");
        Composer composerKN = composer.KN(-66702795);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerKN.n(z2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= composerKN.E2(onSelectionChanged) ? 256 : 128;
        }
        if ((i5 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i7 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.v()) {
                ComposerKt.p5(-66702795, i5, -1, "com.alightcreative.monetization.stackedintro.components.EnableFreeAccess (EnableFreeAccess.kt:27)");
            }
            Modifier modifier4 = modifier3;
            w6.t(modifier4, z2, onSelectionChanged, ComposableLambdaKt.nr(-1580023085, true, new j(z2), composerKN, 54), composerKN, (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896), 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: g8.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return fuX.t(modifier2, z2, onSelectionChanged, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Modifier modifier, boolean z2, Function1 function1, int i2, int i3, Composer composer, int i5) {
        rl(modifier, z2, function1, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
