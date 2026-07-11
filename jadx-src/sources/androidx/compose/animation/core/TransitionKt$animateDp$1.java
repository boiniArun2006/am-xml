package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
public final class TransitionKt$animateDp$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<Dp>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TransitionKt$animateDp$1 f15698n = new TransitionKt$animateDp$1();

    public TransitionKt$animateDp$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ SpringSpec<Dp> invoke(Transition.Segment<Object> segment, Composer composer, Integer num) {
        return n(segment, composer, num.intValue());
    }

    public final SpringSpec n(Transition.Segment segment, Composer composer, int i2) {
        composer.eF(-575880366);
        if (ComposerKt.v()) {
            ComposerKt.p5(-575880366, i2, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1950)");
        }
        SpringSpec springSpecQie = AnimationSpecKt.qie(0.0f, 0.0f, Dp.nr(VisibilityThresholdsKt.n(Dp.INSTANCE)), 3, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return springSpecQie;
    }
}
