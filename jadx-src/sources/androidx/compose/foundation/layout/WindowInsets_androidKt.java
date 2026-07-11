package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.core.graphics.Insets;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0010\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r\"\u0015\u0010\u0012\u001a\u00020\u000b*\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Landroidx/core/graphics/Insets;", "Landroidx/compose/foundation/layout/InsetsValues;", "O", "(Landroidx/core/graphics/Insets;)Landroidx/compose/foundation/layout/InsetsValues;", "insets", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/compose/foundation/layout/ValueInsets;", c.f62177j, "(Landroidx/core/graphics/Insets;Ljava/lang/String;)Landroidx/compose/foundation/layout/ValueInsets;", "Landroidx/compose/foundation/layout/WindowInsets$Companion;", "Landroidx/compose/foundation/layout/WindowInsets;", "t", "(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "statusBars", "nr", "systemBars", "rl", "safeDrawing", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class WindowInsets_androidKt {
    public static final InsetsValues O(Insets insets) {
        return new InsetsValues(insets.f36410n, insets.rl, insets.f36411t, insets.nr);
    }

    public static final ValueInsets n(Insets insets, String str) {
        return new ValueInsets(O(insets), str);
    }

    public static final WindowInsets nr(WindowInsets.Companion companion, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-282936756, i2, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:179)");
        }
        AndroidWindowInsets androidWindowInsetsAz = WindowInsetsHolder.INSTANCE.t(composer, 6).getSystemBars();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return androidWindowInsetsAz;
    }

    public static final WindowInsets rl(WindowInsets.Companion companion, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-49441252, i2, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:198)");
        }
        WindowInsets windowInsetsMUb = WindowInsetsHolder.INSTANCE.t(composer, 6).getSafeDrawing();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return windowInsetsMUb;
    }

    public static final WindowInsets t(WindowInsets.Companion companion, Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(-675090670, i2, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:175)");
        }
        AndroidWindowInsets androidWindowInsetsQie = WindowInsetsHolder.INSTANCE.t(composer, 6).getStatusBars();
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return androidWindowInsetsQie;
    }
}
