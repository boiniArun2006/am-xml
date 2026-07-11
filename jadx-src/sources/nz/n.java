package nz;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f71298n = new n();
    public static Function2 rl = ComposableLambdaKt.rl(-986602291, false, j.f71299n);

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f71299n = new j();

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
                ComposerKt.p5(-986602291, i2, -1, "com.alightcreative.app.motion.activities.main.templatepreview.composables.ComposableSingletons$HeaderSectionKt.lambda-1.<anonymous> (HeaderSection.kt:49)");
            }
            IconKt.t(PainterResources_androidKt.t(2131231979, composer, 6), StringResources_androidKt.t(2132017295, composer, 6), null, Color.INSTANCE.KN(), composer, 3072, 4);
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
