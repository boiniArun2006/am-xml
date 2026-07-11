package zRY;

import Dj7.CM;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f76521n = new j();
    public static Function3 rl = ComposableLambdaKt.rl(-655085100, false, C1299j.f76522n);

    /* JADX INFO: renamed from: zRY.j$j, reason: collision with other inner class name */
    static final class C1299j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1299j f76522n = new C1299j();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope Button, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-655085100, i2, -1, "com.alightcreative.app.motion.premade.ui.ComposableSingletons$PremadeContentHorizontalListKt.lambda-1.<anonymous> (PremadeContentHorizontalList.kt:99)");
            }
            CM.S(StringResources_androidKt.t(2132020425, composer, 6), H9N.j.f3810n.rl(composer, 6).wTp(), null, 0L, null, null, null, 0, false, 0, null, composer, 0, 0, 2044);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C1299j() {
        }
    }

    public final Function3 n() {
        return rl;
    }
}
