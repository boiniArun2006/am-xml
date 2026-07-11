package androidx.compose.ui.unit;

import android.content.Context;
import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.ui.unit.fontscaling.FontScaleConverterFactory;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/compose/ui/unit/Density;", c.f62177j, "(Landroid/content/Context;)Landroidx/compose/ui/unit/Density;", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class AndroidDensity_androidKt {
    public static final Density n(Context context) {
        float f3 = context.getResources().getConfiguration().fontScale;
        float f4 = context.getResources().getDisplayMetrics().density;
        FontScaleConverter fontScaleConverterRl = FontScaleConverterFactory.f34171n.rl(f3);
        if (fontScaleConverterRl == null) {
            fontScaleConverterRl = new LinearFontScaleConverter(f3);
        }
        return new DensityWithConverter(f4, f3, fontScaleConverterRl);
    }
}
