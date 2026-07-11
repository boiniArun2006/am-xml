package TBf;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Ml {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int J2(int i2, int i3) {
        return (-i3) * i2;
    }

    private static final ExitTransition O(final int i2, int i3, int i5) {
        return EnterExitTransitionKt.e(AnimationSpecKt.ty(i3, i5, null, 4, null), new Function1() { // from class: TBf.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(Ml.J2(i2, ((Integer) obj).intValue()));
            }
        }).t(EnterExitTransitionKt.Ik(AnimationSpecKt.ty(i3, i5, null, 4, null), 0.0f, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nr(int i2, int i3) {
        return i3 * i2;
    }

    private static final EnterTransition t(final int i2, int i3, int i5) {
        return EnterExitTransitionKt.g(AnimationSpecKt.ty(i3, i5, null, 4, null), new Function1() { // from class: TBf.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(Ml.nr(i2, ((Integer) obj).intValue()));
            }
        }).t(EnterExitTransitionKt.HI(AnimationSpecKt.ty(i3, i5, null, 4, null), 0.0f, 2, null));
    }

    public static final ContentTransform Uo(int i2, int i3, int i5) {
        return AnimatedContentKt.J2(t(i2, i3, i5), O(i2, i3, i5));
    }
}
