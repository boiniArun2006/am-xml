package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.text.font.FontVariation;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a'\u0010\b\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/PlatformTypefaces;", c.f62177j, "()Landroidx/compose/ui/text/font/PlatformTypefaces;", "Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "Landroid/content/Context;", "context", "t", "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "rl", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;)Ljava/lang/String;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PlatformTypefaces_androidKt {
    public static final PlatformTypefaces n() {
        return Build.VERSION.SDK_INT >= 28 ? new PlatformTypefacesApi28() : new PlatformTypefacesApi();
    }

    public static final android.graphics.Typeface t(android.graphics.Typeface typeface, FontVariation.Settings settings, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? TypefaceCompatApi26.f33733n.n(typeface, settings, context) : typeface;
    }

    public static final String rl(String str, FontWeight fontWeight) {
        int iQie = fontWeight.qie() / 100;
        if (iQie >= 0 && iQie < 2) {
            return str + "-thin";
        }
        if (2 <= iQie && iQie < 4) {
            return str + "-light";
        }
        if (iQie == 4) {
            return str;
        }
        if (iQie == 5) {
            return str + "-medium";
        }
        if ((6 > iQie || iQie >= 8) && 8 <= iQie && iQie < 11) {
            return str + "-black";
        }
        return str;
    }
}
