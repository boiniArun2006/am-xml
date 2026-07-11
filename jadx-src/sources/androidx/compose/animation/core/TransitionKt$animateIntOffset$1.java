package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntOffset$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,2141:1\n32#2:2142\n80#3:2143\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntOffset$1\n*L\n2044#1:2142\n2044#1:2143\n*E\n"})
public final class TransitionKt$animateIntOffset$1 extends Lambda implements Function3<Transition.Segment<Object>, Composer, Integer, SpringSpec<IntOffset>> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final TransitionKt$animateIntOffset$1 f15701n = new TransitionKt$animateIntOffset$1();

    public TransitionKt$animateIntOffset$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ SpringSpec<IntOffset> invoke(Transition.Segment<Object> segment, Composer composer, Integer num) {
        return n(segment, composer, num.intValue());
    }

    public final SpringSpec n(Transition.Segment segment, Composer composer, int i2) {
        composer.eF(-1953479610);
        if (ComposerKt.v()) {
            ComposerKt.p5(-1953479610, i2, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2043)");
        }
        long j2 = 1;
        SpringSpec springSpecQie = AnimationSpecKt.qie(0.0f, 0.0f, IntOffset.t(IntOffset.J2((j2 & 4294967295L) | (j2 << 32))), 3, null);
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return springSpecQie;
    }
}
