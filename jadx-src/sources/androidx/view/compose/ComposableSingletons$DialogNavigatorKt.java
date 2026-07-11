package androidx.view.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.view.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$DialogNavigatorKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ComposableSingletons$DialogNavigatorKt f40193n = new ComposableSingletons$DialogNavigatorKt();
    public static Function3 rl = ComposableLambdaKt.rl(-1092249270, false, new Function3<NavBackStackEntry, Composer, Integer, Unit>() { // from class: androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            n(navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void n(NavBackStackEntry navBackStackEntry, Composer composer, int i2) {
            if (ComposerKt.v()) {
                ComposerKt.p5(-1092249270, i2, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda-1.<anonymous> (DialogNavigator.kt:58)");
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    });

    public final Function3 n() {
        return rl;
    }
}
