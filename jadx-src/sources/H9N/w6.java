package H9N;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ColorScheme f3813n;

    public static final void rl(Function2 content, Composer composer, final int i2) {
        int i3;
        final Function2 function2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerKN = composer.KN(-1351751209);
        if ((i2 & 6) == 0) {
            i3 = (composerKN.E2(content) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerKN.xMQ()) {
            composerKN.wTp();
            function2 = content;
        } else {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1351751209, i3, -1, "com.alightcreative.common.compose.theme.AlightTheme3 (Theme3.kt:23)");
            }
            function2 = content;
            MaterialThemeKt.rl(f3813n, null, null, function2, composerKN, ((i3 << 9) & 7168) | 6, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
        ScopeUpdateScope scopeUpdateScopeGh = composerKN.gh();
        if (scopeUpdateScopeGh != null) {
            scopeUpdateScopeGh.n(new Function2() { // from class: H9N.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w6.t(function2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function2 function2, int i2, Composer composer, int i3) {
        rl(function2, composer, RecomposeScopeImplKt.n(i2 | 1));
        return Unit.INSTANCE;
    }

    static {
        long jNr = ColorKt.nr(4278242477L);
        Color.Companion companion = Color.INSTANCE;
        f3813n = ColorSchemeKt.O(jNr, companion.n(), 0L, 0L, 0L, companion.KN(), companion.n(), 0L, 0L, 0L, 0L, 0L, 0L, companion.n(), companion.KN(), aD.w6.nY(), companion.KN(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -122980, 15, null);
    }
}
