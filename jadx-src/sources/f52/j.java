package f52;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f66520n = new j();
    public static Function3 rl = ComposableLambdaKt.rl(543049311, false, C0915j.f66521n);

    /* JADX INFO: renamed from: f52.j$j, reason: collision with other inner class name */
    static final class C0915j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0915j f66521n = new C0915j();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope TextButton, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(543049311, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.templates.ComposableSingletons$TemplatesScreenContentKt.lambda-1.<anonymous> (TemplatesScreenContent.kt:197)");
            }
            TextKt.t(StringResources_androidKt.t(2132020293, composer, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).wTp(), composer, 0, 0, 65534);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C0915j() {
        }
    }

    public final Function3 n() {
        return rl;
    }
}
