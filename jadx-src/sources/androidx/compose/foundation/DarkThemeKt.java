package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", c.f62177j, "(Landroidx/compose/runtime/Composer;I)Z", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DarkThemeKt {
    public static final boolean n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-1100791446, i2, -1, "androidx.compose.foundation.isSystemInDarkTheme (DarkTheme.kt:36)");
        }
        boolean zN = DarkTheme_androidKt.n(composer, 0);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return zN;
    }
}
