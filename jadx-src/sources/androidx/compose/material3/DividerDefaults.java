package androidx.compose.material3;

import androidx.compose.material3.tokens.DividerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\f\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/material3/DividerDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "rl", "F", "()F", "Thickness", "Landroidx/compose/ui/graphics/Color;", c.f62177j, "(Landroidx/compose/runtime/Composer;I)J", TtmlNode.ATTR_TTS_COLOR, "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DividerDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DividerDefaults f25669n = new DividerDefaults();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static final float Thickness = DividerTokens.f29498n.rl();

    public final float rl() {
        return Thickness;
    }

    private DividerDefaults() {
    }

    public final long n(Composer composer, int i2) {
        if (ComposerKt.v()) {
            ComposerKt.p5(77461041, i2, -1, "androidx.compose.material3.DividerDefaults.<get-color> (Divider.kt:118)");
        }
        long jXMQ = ColorSchemeKt.xMQ(DividerTokens.f29498n.n(), composer, 6);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        return jXMQ;
    }
}
