package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", c.f62177j, "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
final class AnimatedVisibilityScope$animateEnterExit$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ ExitTransition f15112O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ AnimatedVisibilityScope f15113n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ EnterTransition f15114t;

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return n(modifier, composer, num.intValue());
    }

    public final Modifier n(Modifier modifier, Composer composer, int i2) {
        composer.eF(1840112047);
        if (ComposerKt.v()) {
            ComposerKt.p5(1840112047, i2, -1, "androidx.compose.animation.AnimatedVisibilityScope.animateEnterExit.<anonymous> (AnimatedVisibility.kt:654)");
        }
        Modifier modifierZmq = modifier.Zmq(EnterExitTransitionKt.Uo(this.f15113n.getTransition(), this.f15114t, this.f15112O, null, this.J2, composer, 0, 4));
        if (ComposerKt.v()) {
            ComposerKt.M7();
        }
        composer.Xw();
        return modifierZmq;
    }
}
