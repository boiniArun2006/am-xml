package androidx.compose.animation;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\b\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"", "friction", "density", "t", "(FF)F", c.f62177j, "F", "DecelerationRate", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FlingCalculatorKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final float f15256n = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(float f3, float f4) {
        return f4 * 386.0878f * 160.0f * f3;
    }
}
