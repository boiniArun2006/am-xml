package androidx.compose.animation.core;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\n\u001a?\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\t\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"", CmcdData.STREAMING_FORMAT_HLS, "x", "y1", "y2", "t1", "t2", "rl", "(FFFFFF)F", c.f62177j, "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class MonoSplineKt {
    public static final float n(float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f4 * f4;
        float f10 = 2;
        return (f3 * ((f7 - ((f10 * f4) * ((f10 * f7) + f8))) + ((3 * (f7 + f8)) * f9))) - ((6 * (f4 - f9)) * (f5 - f6));
    }

    public static final float rl(float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f4 * f4;
        float f10 = f9 * f4;
        float f11 = 2;
        return ((((f7 * f3) * ((f4 - (f11 * f9)) + f10)) + ((f3 * f8) * (f10 - f9))) + f5) - (((3 * f9) - (f11 * f10)) * (f5 - f6));
    }
}
