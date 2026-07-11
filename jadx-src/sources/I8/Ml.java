package I8;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Ml {
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(final int i2, final Shape shape, Modifier modifier, Composer composer, final int i3, final int i5) {
        int i7;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeGh;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Composer composerKN = composer.KN(-1975028763);
        if ((i5 & 1) != 0) {
            i7 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i7 = (composerKN.t(i2) ? 4 : 2) | i3;
        } else {
            i7 = i3;
        }
        if ((i5 & 2) != 0) {
            i7 |= 48;
        } else if ((i3 & 48) == 0) {
            i7 |= composerKN.p5(shape) ? 32 : 16;
        }
        int i8 = i5 & 4;
        if (i8 == 0) {
            if ((i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i7 |= composerKN.p5(modifier2) ? 256 : 128;
            }
            if ((i7 & 147) == 146 || !composerKN.xMQ()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.v()) {
                    ComposerKt.p5(-1975028763, i7, -1, "com.bendingspoons.legal.privacy.ui.banner.internal.HeaderImage (HeaderImage.kt:18)");
                }
                ImageKt.n(PainterResources_androidKt.t(i2, composerKN, i7 & 14), "", ClipKt.n(modifier4, shape), null, ContentScale.INSTANCE.nr(), 0.0f, null, composerKN, 24624, 104);
                if (ComposerKt.v()) {
                    ComposerKt.M7();
                }
                modifier3 = modifier4;
            } else {
                composerKN.wTp();
                modifier3 = modifier2;
            }
            scopeUpdateScopeGh = composerKN.gh();
            if (scopeUpdateScopeGh == null) {
                scopeUpdateScopeGh.n(new Function2() { // from class: I8.w6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Ml.t(i2, shape, modifier3, i3, i5, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i7 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        modifier2 = modifier;
        if ((i7 & 147) == 146) {
            if (i8 == 0) {
            }
            if (ComposerKt.v()) {
            }
            ImageKt.n(PainterResources_androidKt.t(i2, composerKN, i7 & 14), "", ClipKt.n(modifier4, shape), null, ContentScale.INSTANCE.nr(), 0.0f, null, composerKN, 24624, 104);
            if (ComposerKt.v()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(int i2, Shape shape, Modifier modifier, int i3, int i5, Composer composer, int i7) {
        rl(i2, shape, modifier, composer, RecomposeScopeImplKt.n(i3 | 1), i5);
        return Unit.INSTANCE;
    }
}
