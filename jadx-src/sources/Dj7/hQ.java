package Dj7;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class hQ {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final String text, Modifier modifier, PaddingValues paddingValues, Composer composer, final int i2, final int i3) {
        int i5;
        Modifier modifier2;
        int i7;
        PaddingValues paddingValues2;
        Composer composer2;
        final PaddingValues paddingValues3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerKN = composer.KN(-1428518686);
        if ((i3 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerKN.p5(text) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerKN.p5(modifier2) ? 32 : 16;
            }
            i7 = i3 & 4;
            if (i7 != 0) {
                if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                    paddingValues2 = paddingValues;
                    i5 |= composerKN.p5(paddingValues2) ? 256 : 128;
                }
                if ((i5 & 147) == 146 && composerKN.xMQ()) {
                    composerKN.wTp();
                    composer2 = composerKN;
                    modifier3 = modifier2;
                    paddingValues3 = paddingValues2;
                } else {
                    Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    PaddingValues paddingValuesRl = i7 == 0 ? PaddingKt.rl(Dp.KN(6), Dp.KN(4)) : paddingValues2;
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1428518686, i5, -1, "com.alightcreative.common.compose.components.AlightTag (Tag.kt:29)");
                    }
                    composer2 = composerKN;
                    Modifier modifier5 = modifier4;
                    PaddingValues paddingValues4 = paddingValuesRl;
                    TextKt.t(text, PaddingKt.KN(BackgroundKt.t(modifier4, aD.w6.XQ(), RoundedCornerShapeKt.t(Dp.KN(4))), paddingValuesRl), aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(H9N.j.f3810n.rl(composerKN, 6).aYN(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null), composer2, (i5 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                    paddingValues3 = paddingValues4;
                    modifier3 = modifier5;
                }
                scopeUpdateScopeGh = composer2.gh();
                if (scopeUpdateScopeGh != null) {
                    scopeUpdateScopeGh.n(new Function2() { // from class: Dj7.kO4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return hQ.t(text, modifier3, paddingValues3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            paddingValues2 = paddingValues;
            if ((i5 & 147) == 146) {
                if (i8 == 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.v()) {
                }
                composer2 = composerKN;
                Modifier modifier52 = modifier4;
                PaddingValues paddingValues42 = paddingValuesRl;
                TextKt.t(text, PaddingKt.KN(BackgroundKt.t(modifier4, aD.w6.XQ(), RoundedCornerShapeKt.t(Dp.KN(4))), paddingValuesRl), aD.w6.s(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(H9N.j.f3810n.rl(composerKN, 6).aYN(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, new PlatformTextStyle(false), null, 0, 0, null, 16252927, null), composer2, (i5 & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65528);
                if (ComposerKt.v()) {
                }
                paddingValues3 = paddingValues42;
                modifier3 = modifier52;
            }
            scopeUpdateScopeGh = composer2.gh();
            if (scopeUpdateScopeGh != null) {
            }
        }
        modifier2 = modifier;
        i7 = i3 & 4;
        if (i7 != 0) {
        }
        paddingValues2 = paddingValues;
        if ((i5 & 147) == 146) {
        }
        scopeUpdateScopeGh = composer2.gh();
        if (scopeUpdateScopeGh != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(String str, Modifier modifier, PaddingValues paddingValues, int i2, int i3, Composer composer, int i5) {
        rl(str, modifier, paddingValues, composer, RecomposeScopeImplKt.n(i2 | 1), i3);
        return Unit.INSTANCE;
    }
}
