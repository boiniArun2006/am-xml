package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.ListUtilsKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceCompatApi26;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Landroid/content/Context;", "context", "", "rl", "(Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Ljava/lang/String;", "Landroid/graphics/Typeface;", "typeface", "variationSettings", c.f62177j, "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/FontVariation$Settings;Landroid/content/Context;)Landroid/graphics/Typeface;", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "Ljava/lang/ThreadLocal;", "threadLocalPaint", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class TypefaceCompatApi26 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TypefaceCompatApi26 f33733n = new TypefaceCompatApi26();

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private static ThreadLocal threadLocalPaint = new ThreadLocal();

    public final android.graphics.Typeface n(android.graphics.Typeface typeface, FontVariation.Settings variationSettings, Context context) {
        if (typeface == null) {
            return null;
        }
        if (variationSettings.getSettings().isEmpty()) {
            return typeface;
        }
        Paint paint = (Paint) threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(rl(variationSettings, context));
        return paint.getTypeface();
    }

    private TypefaceCompatApi26() {
    }

    private final String rl(FontVariation.Settings settings, Context context) {
        final Density densityN = AndroidDensity_androidKt.n(context);
        return ListUtilsKt.O(settings.getSettings(), null, null, null, 0, null, new Function1<FontVariation.Setting, CharSequence>() { // from class: androidx.compose.ui.text.font.TypefaceCompatApi26$toAndroidString$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(FontVariation.Setting setting) {
                return '\'' + setting.getAxisName() + "' " + setting.rl(densityN);
            }
        }, 31, null);
    }
}
