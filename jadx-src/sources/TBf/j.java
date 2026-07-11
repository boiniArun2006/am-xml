package TBf;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingFunctionsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {
    public static final ContentTransform n(int i2) {
        return AnimatedContentKt.J2(EnterExitTransitionKt.HI(AnimationSpecKt.ty(i2, 0, EasingFunctionsKt.az(), 2, null), 0.0f, 2, null), EnterExitTransitionKt.Ik(AnimationSpecKt.ty(i2, 0, EasingFunctionsKt.ty(), 2, null), 0.0f, 2, null));
    }
}
