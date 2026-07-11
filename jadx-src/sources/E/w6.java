package E;

import Dj7.crp;
import Dj7.h6y;
import E.w6;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.RendererCapabilities;
import com.alightcreative.app.motion.scene.rendering.TextureCropMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class w6 {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0 f2238n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function0 f2239t;

        j(Function0 function0, Function0 function02) {
            this.f2238n = function0;
            this.f2239t = function02;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            rl((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(ColumnScope TooltipWithHighlightedTarget, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(TooltipWithHighlightedTarget, "$this$TooltipWithHighlightedTarget");
            if ((i2 & 6) == 0) {
                i2 |= composer.p5(TooltipWithHighlightedTarget) ? 4 : 2;
            }
            if ((i2 & 19) == 18 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1982520878, i2, -1, "com.alightcreative.template.importpreview.ui.components.MediaCropTooltip.<anonymous> (MediaCropTooltip.kt:28)");
            }
            TextureCropMode textureCropMode = TextureCropMode.FILL;
            composer.eF(1613686233);
            boolean zP5 = composer.p5(this.f2238n) | composer.p5(this.f2239t);
            final Function0 function0 = this.f2238n;
            final Function0 function02 = this.f2239t;
            Object objIF = composer.iF();
            if (zP5 || objIF == Composer.INSTANCE.n()) {
                objIF = new Function0() { // from class: E.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w6.j.t(function0, function02);
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            s.Wre.qie(textureCropMode, (Function0) objIF, TooltipWithHighlightedTarget.t(Modifier.INSTANCE, Alignment.INSTANCE.mUb()), composer, 6, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(Function0 function0, Function0 function02) {
            function0.invoke();
            function02.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final void rl(final Function0 onDismissRequest, final Function0 onTextureCropButtonClicked, final float f3, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(onTextureCropButtonClicked, "onTextureCropButtonClicked");
        Composer composerKN = composer.KN(705386330);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(onDismissRequest) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerKN.E2(onTextureCropButtonClicked) ? 32 : 16;
        }
        if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= composerKN.rl(f3) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerKN.xMQ()) {
            composerKN.wTp();
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(705386330, i3, -1, "com.alightcreative.template.importpreview.ui.components.MediaCropTooltip (MediaCropTooltip.kt:25)");
            }
            ComposableLambda composableLambdaNr = ComposableLambdaKt.nr(-1982520878, true, new j(onTextureCropButtonClicked, onDismissRequest), composerKN, 54);
            int i5 = i3;
            crp crpVar = crp.f1752n;
            String strT = StringResources_androidKt.t(2132020310, composerKN, 6);
            String strT2 = StringResources_androidKt.t(2132017378, composerKN, 6);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment alignmentTy = companion.ty();
            Alignment.Horizontal horizontalMUb = companion.mUb();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            h6y.az(composableLambdaNr, f3, crpVar, onDismissRequest, strT, strT2, alignmentTy, horizontalMUb, SizeKt.ViF(companion2, Dp.KN(234)), PaddingKt.az(companion2, 0.0f, 0.0f, Dp.KN(14), 0.0f, 11, null), composerKN, ((i5 << 9) & 7168) | ((i5 >> 3) & 112) | 920125830, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: E.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w6.t(onDismissRequest, onTextureCropButtonClicked, f3, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function0 function0, Function0 function02, float f3, int i2, Composer composer, int i3) {
        rl(function0, function02, f3, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }
}
