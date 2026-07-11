package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.AndroidTypefaceWrapper;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/graphics/Typeface;", "typeface", "Landroidx/compose/ui/text/font/Typeface;", "rl", "(Landroid/graphics/Typeface;)Landroidx/compose/ui/text/font/Typeface;", "Landroidx/compose/ui/text/font/FontFamily;", c.f62177j, "(Landroid/graphics/Typeface;)Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidTypeface_androidKt {
    public static final Typeface rl(android.graphics.Typeface typeface) {
        return new AndroidTypefaceWrapper(typeface);
    }

    public static final FontFamily n(android.graphics.Typeface typeface) {
        return FontFamilyKt.n(rl(typeface));
    }
}
