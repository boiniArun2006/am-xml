package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
public final class TransitionKt$animateRect$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<Rect>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TransitionKt$animateRect$1 f15704n = new TransitionKt$animateRect$1();

    public TransitionKt$animateRect$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ SpringSpec<Rect> invoke(Transition.Segment<Object> segment, Composer composer, Integer num) {
        return n(segment, composer, num.intValue());
    }

    public final SpringSpec n(Transition.Segment segment, Composer composer, int i2) {
        composer.eF(691336298);
        if (ComposerKt.v()) {
            ComposerKt.p5(691336298, i2, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2135)");
        }
        SpringSpec springSpecQie = AnimationSpecKt.qie(0.0f, 0.0f, VisibilityThresholdsKt.Uo(Rect.INSTANCE), 3, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return springSpecQie;
    }
}
