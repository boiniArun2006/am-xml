package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "splinePositions", "splineTimes", "", "nbSamples", "", "rl", "([F[FI)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/animation/core/DecayAnimationSpec;", "t", "(Landroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/DecayAnimationSpec;", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SplineBasedDecayKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void rl(float[] fArr, float[] fArr2, int i2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = 0.0f;
        int i3 = 0;
        float f13 = 0.0f;
        while (true) {
            float f14 = 1.0f;
            if (i3 >= i2) {
                fArr2[i2] = 1.0f;
                fArr[i2] = 1.0f;
                return;
            }
            float f15 = i3 / i2;
            float f16 = 1.0f;
            while (true) {
                f3 = ((f16 - f12) / 2.0f) + f12;
                f4 = f14 - f3;
                f5 = f3 * 3.0f * f4;
                f6 = f3 * f3 * f3;
                float f17 = (((f4 * 0.175f) + (f3 * 0.35000002f)) * f5) + f6;
                f7 = f14;
                if (Math.abs(f17 - f15) < 1.0E-5d) {
                    break;
                }
                if (f17 > f15) {
                    f16 = f3;
                } else {
                    f12 = f3;
                }
                f14 = f7;
            }
            float f18 = 0.5f;
            fArr[i3] = (f5 * ((f4 * 0.5f) + f3)) + f6;
            float f19 = f7;
            while (true) {
                f8 = ((f19 - f13) / 2.0f) + f13;
                f9 = f7 - f8;
                f10 = f8 * 3.0f * f9;
                f11 = f8 * f8 * f8;
                float f20 = (((f9 * f18) + f8) * f10) + f11;
                float f21 = f15;
                if (Math.abs(f20 - f15) >= 1.0E-5d) {
                    if (f20 > f21) {
                        f19 = f8;
                    } else {
                        f13 = f8;
                    }
                    f15 = f21;
                    f18 = 0.5f;
                }
            }
            fArr2[i3] = (f10 * ((f9 * 0.175f) + (f8 * 0.35000002f))) + f11;
            i3++;
        }
    }

    public static final DecayAnimationSpec t(Density density) {
        return DecayAnimationSpecKt.nr(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
