package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Deprecated(message = "This path for preloading loading fonts is not supported.")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001J*\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidGenericFontFamilyTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontWeight;", TtmlNode.ATTR_TTS_FONT_WEIGHT, "Landroidx/compose/ui/text/font/FontStyle;", TtmlNode.ATTR_TTS_FONT_STYLE, "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "rl", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", c.f62177j, "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "Landroid/graphics/Typeface;", "nativeTypeface", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Typeface nativeTypeface;

    private final Typeface rl(FontWeight fontWeight, int fontStyle) {
        return Build.VERSION.SDK_INT < 28 ? Typeface.create(this.nativeTypeface, AndroidFontUtils_androidKt.t(fontWeight, fontStyle)) : TypefaceHelperMethodsApi28.f33735n.n(this.nativeTypeface, fontWeight.qie(), FontStyle.J2(fontStyle, FontStyle.INSTANCE.n()));
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    public Typeface n(FontWeight fontWeight, int fontStyle, int synthesis) {
        return rl(fontWeight, fontStyle);
    }
}
