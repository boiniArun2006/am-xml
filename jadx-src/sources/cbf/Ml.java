package cbf;

import DSG.Wre;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bH.CN3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Ml {

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ rB.Ml f43673n;

        j(rB.Ml ml) {
            this.f43673n = ml;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((Function1) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Function1 it, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(956842869, i2, -1, "com.bendingspoons.secretmenu.spidersense.registerSpiderSenseItems.<anonymous> (SpiderSenseSecretMenuItemsProvider.kt:16)");
            }
            Dsr.O(this.f43673n, composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }
    }

    public static final void n(bH.CN3 cn3, rB.Ml spiderSense) {
        Intrinsics.checkNotNullParameter(cn3, "<this>");
        Intrinsics.checkNotNullParameter(spiderSense, "spiderSense");
        cn3.n(CN3.I28.f43224n, new Wre.w6("SpiderSense", "🕸️", null, ComposableLambdaKt.rl(956842869, true, new j(spiderSense)), 4, null));
    }
}
