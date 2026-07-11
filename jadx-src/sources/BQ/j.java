package BQ;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f468n = new j();
    public static Function3 rl = ComposableLambdaKt.rl(814727380, false, C0014j.f469n);

    /* JADX INFO: renamed from: BQ.j$j, reason: collision with other inner class name */
    static final class C0014j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0014j f469n = new C0014j();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(BoxScope PulsingView, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(PulsingView, "$this$PulsingView");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(814727380, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.composables.ComposableSingletons$FilterButtonKt.lambda-1.<anonymous> (FilterButton.kt:69)");
            }
            BoxKt.n(BackgroundKt.t(SizeKt.ViF(SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(40)), Dp.KN(100)), ((aF1.j) composer.ty(aF1.w6.t())).J2(), RoundedCornerShapeKt.t(Dp.KN(12))), composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C0014j() {
        }
    }

    public final Function3 n() {
        return rl;
    }
}
