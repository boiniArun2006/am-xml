package androidx.compose.material;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material/RippleDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "", "lightTheme", "rl", "(JZ)J", "Landroidx/compose/material/ripple/RippleAlpha;", c.f62177j, "(JZ)Landroidx/compose/material/ripple/RippleAlpha;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RippleDefaults {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final RippleDefaults f22599n = new RippleDefaults();

    public final RippleAlpha n(long contentColor, boolean lightTheme) {
        return lightTheme ? ((double) ColorKt.xMQ(contentColor)) > 0.5d ? RippleKt.nr : RippleKt.f22600O : RippleKt.J2;
    }

    private RippleDefaults() {
    }

    public final long rl(long contentColor, boolean lightTheme) {
        float fXMQ = ColorKt.xMQ(contentColor);
        if (!lightTheme && fXMQ < 0.5d) {
            return Color.INSTANCE.KN();
        }
        return contentColor;
    }
}
