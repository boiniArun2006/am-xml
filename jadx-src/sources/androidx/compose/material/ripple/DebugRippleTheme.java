package androidx.compose.material.ripple;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Immutable
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u0004H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/DebugRippleTheme;", "Landroidx/compose/material/ripple/RippleTheme;", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)J", "Landroidx/compose/material/ripple/RippleAlpha;", "rl", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/ripple/RippleAlpha;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DebugRippleTheme implements RippleTheme {
    public static final DebugRippleTheme rl = new DebugRippleTheme();

    private DebugRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    public long n(Composer composer, int i2) {
        composer.eF(2042140174);
        if (ComposerKt.v()) {
            ComposerKt.p5(2042140174, i2, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:237)");
        }
        long jRl = RippleTheme.INSTANCE.rl(Color.INSTANCE.n(), true);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return jRl;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    public RippleAlpha rl(Composer composer, int i2) {
        composer.eF(-1629816343);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1629816343, i2, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:242)");
        }
        RippleAlpha rippleAlphaN = RippleTheme.INSTANCE.n(Color.INSTANCE.n(), true);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return rippleAlphaN;
    }
}
