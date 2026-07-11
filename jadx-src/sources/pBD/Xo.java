package pBD;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Xo {
    public static final void rl(final int i2, Composer composer, final int i3) {
        int i5;
        Composer composer2;
        Composer composerKN = composer.KN(-1294008010);
        if ((i3 & 6) == 0) {
            i5 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i5 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            composer2 = composerKN;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1294008010, i5, -1, "com.alightcreative.monetization.ui.components.timeddiscounts.DiscountedPaywallHeader (DiscountedPaywallHeader.kt:22)");
            }
            List listSplit$default = StringsKt.split$default((CharSequence) StringResources_androidKt.nr(2132017530, new Object[]{Integer.valueOf(i2)}, composerKN, 6), new String[]{"\n\n"}, false, 0, 6, (Object) null);
            String str = (String) listSplit$default.get(0);
            String str2 = (String) listSplit$default.get(1);
            H9N.j jVar = H9N.j.f3810n;
            TextStyle textStyleRl = jVar.rl(composerKN, 6).rl();
            long jKN = Color.INSTANCE.KN();
            TextAlign.Companion companion = TextAlign.INSTANCE;
            composer2 = composerKN;
            TextKt.t(str, null, jKN, 0L, null, null, null, 0L, null, TextAlign.KN(companion.n()), 0L, 0, false, 0, 0, null, textStyleRl, composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65018);
            SpacerKt.n(SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(4)), composer2, 6);
            TextKt.t(str2, null, aD.w6.I(), 0L, null, null, null, 0L, null, TextAlign.KN(companion.n()), 0L, 0, false, 0, 0, null, jVar.rl(composer2, 6).rl(), composer2, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65018);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: pBD.Pl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Xo.t(i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(int i2, int i3, Composer composer, int i5) {
        rl(i2, composer, RecomposeScopeImplKt.n(i3 | 1));
        return Unit.INSTANCE;
    }
}
