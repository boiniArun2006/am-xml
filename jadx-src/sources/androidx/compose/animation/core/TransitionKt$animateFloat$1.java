package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
public final class TransitionKt$animateFloat$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<Float>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TransitionKt$animateFloat$1 f15699n = new TransitionKt$animateFloat$1();

    public TransitionKt$animateFloat$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ SpringSpec<Float> invoke(Transition.Segment<Object> segment, Composer composer, Integer num) {
        return n(segment, composer, num.intValue());
    }

    public final SpringSpec n(Transition.Segment segment, Composer composer, int i2) {
        composer.eF(-522164544);
        if (ComposerKt.v()) {
            ComposerKt.p5(-522164544, i2, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1920)");
        }
        SpringSpec springSpecQie = AnimationSpecKt.qie(0.0f, 0.0f, null, 7, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return springSpecQie;
    }
}
