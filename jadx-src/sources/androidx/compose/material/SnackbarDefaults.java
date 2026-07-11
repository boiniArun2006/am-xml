package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/material/SnackbarDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)J", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "rl", "primaryActionColor", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SnackbarDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SnackbarDefaults f23001n = new SnackbarDefaults();

    private SnackbarDefaults() {
    }

    public final long n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(1630911716, i2, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:203)");
        }
        MaterialTheme materialTheme = MaterialTheme.f22169n;
        long jUo = ColorKt.Uo(Color.az(materialTheme.n(composer, 6).xMQ(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.n(composer, 6).ty());
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jUo;
    }

    public final long rl(Composer composer, int i2) {
        long jGh;
        if (ComposerKt.v()) {
            ComposerKt.p5(-810329402, i2, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:223)");
        }
        Colors colorsN = MaterialTheme.f22169n.n(composer, 6);
        if (colorsN.HI()) {
            jGh = ColorKt.Uo(Color.az(colorsN.ty(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), colorsN.mUb());
        } else {
            jGh = colorsN.gh();
        }
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jGh;
    }
}
