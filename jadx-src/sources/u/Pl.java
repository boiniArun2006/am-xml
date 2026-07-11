package u;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pl f74095n = new Pl();
    public static Function3 rl = ComposableLambdaKt.rl(1194195399, false, j.f74096n);

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f74096n = new j();

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
                ComposerKt.p5(1194195399, i2, -1, "com.alightcreative.maineditor.templateimport.ui.components.ComposableSingletons$ProjectTypeRowKt.lambda-1.<anonymous> (ProjectTypeRow.kt:50)");
            }
            ImageKt.n(PainterResources_androidKt.t(2131231603, composer, 6), null, null, null, ContentScale.INSTANCE.O(), 0.0f, null, composer, 24624, 108);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j() {
        }
    }

    public final Function3 n() {
        return rl;
    }
}
