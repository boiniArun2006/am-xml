package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets$Companion;", "Landroidx/compose/foundation/layout/WindowInsets;", c.f62177j, "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "systemBarsForVisualComponents", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SystemBarsDefaultInsets_androidKt {
    public static final WindowInsets n(WindowInsets.Companion companion, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(2011811170, i2, -1, "androidx.compose.material3.internal.<get-systemBarsForVisualComponents> (SystemBarsDefaultInsets.android.kt:23)");
        }
        WindowInsets windowInsetsNr = WindowInsets_androidKt.nr(companion, composer, i2 & 14);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return windowInsetsNr;
    }
}
