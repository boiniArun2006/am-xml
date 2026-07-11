package androidx.compose.ui.unit;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "density", "fontScale", "Landroidx/compose/ui/unit/Density;", c.f62177j, "(FF)Landroidx/compose/ui/unit/Density;", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DensityKt {
    public static final Density n(float f3, float f4) {
        return new DensityImpl(f3, f4);
    }

    public static /* synthetic */ Density rl(float f3, float f4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f4 = 1.0f;
        }
        return n(f3, f4);
    }
}
