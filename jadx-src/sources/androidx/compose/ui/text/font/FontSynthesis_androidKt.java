package androidx.compose.ui.text.font;

import android.os.Build;
import androidx.compose.ui.text.font.FontWeight;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/font/FontSynthesis;", "", "typeface", "Landroidx/compose/ui/text/font/Font;", "font", "Landroidx/compose/ui/text/font/FontWeight;", "requestedWeight", "Landroidx/compose/ui/text/font/FontStyle;", "requestedStyle", c.f62177j, "(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FontSynthesis_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(int i2, Object obj, Font font, FontWeight fontWeight, int i3) {
        boolean z2;
        if (!(obj instanceof android.graphics.Typeface)) {
            return obj;
        }
        boolean z3 = false;
        if (!FontSynthesis.gh(i2) || Intrinsics.areEqual(font.getWeight(), fontWeight)) {
            z2 = false;
        } else {
            FontWeight.Companion companion = FontWeight.INSTANCE;
            if (fontWeight.compareTo(AndroidFontUtils_androidKt.n(companion)) >= 0 && font.getWeight().compareTo(AndroidFontUtils_androidKt.n(companion)) < 0) {
                z2 = true;
            }
        }
        boolean z4 = FontSynthesis.mUb(i2) && !FontStyle.J2(i3, font.getStyle());
        if (!z4 && !z2) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return TypefaceHelperMethodsApi28.f33735n.n((android.graphics.Typeface) obj, z2 ? fontWeight.qie() : font.getWeight().qie(), z4 ? FontStyle.J2(i3, FontStyle.INSTANCE.n()) : FontStyle.J2(font.getStyle(), FontStyle.INSTANCE.n()));
        }
        if (z4 && FontStyle.J2(i3, FontStyle.INSTANCE.n())) {
            z3 = true;
        }
        return android.graphics.Typeface.create((android.graphics.Typeface) obj, AndroidFontUtils_androidKt.rl(z2, z3));
    }
}
