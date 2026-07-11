package mb8;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o f70848n = new o();
    public static Function2 rl = ComposableLambdaKt.rl(-914272614, false, j.f70849n);

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f70849n = new j();

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            n((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-914272614, i2, -1, "com.alightcreative.monetization.ui.components.switches.ComposableSingletons$ComparisonSwitchKt.lambda-1.<anonymous> (ComparisonSwitch.kt:236)");
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j() {
        }
    }

    public final Function2 n() {
        return rl;
    }
}
