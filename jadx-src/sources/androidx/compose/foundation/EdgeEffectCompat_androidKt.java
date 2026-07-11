package androidx.compose.foundation;

import android.view.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n\"\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/unit/Density;", "density", "", "velocity", "rl", "(Landroidx/compose/ui/unit/Density;F)F", c.f62177j, "F", "PlatformFlingScrollFriction", "", "D", "DecelerationRate", "t", "DecelMinusOne", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class EdgeEffectCompat_androidKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f16104n = ViewConfiguration.getScrollFriction();
    private static final double rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final double f16105t;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        rl = dLog;
        f16105t = dLog - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float rl(Density density, float f3) {
        double density2 = density.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f3) * 0.35f;
        float f4 = f16104n;
        return (float) (((double) f4) * density2 * Math.exp((rl / f16105t) * Math.log(dAbs / (((double) f4) * density2))));
    }
}
