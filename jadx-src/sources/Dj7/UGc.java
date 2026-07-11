package Dj7;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final UGc f1707n = new UGc();
    public static Function2 rl = ComposableLambdaKt.rl(-767948977, false, j.f1708n);

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f1708n = new j();

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
                ComposerKt.p5(-767948977, i2, -1, "com.alightcreative.common.compose.components.ComposableSingletons$ActivityBottomSheetKt.lambda-1.<anonymous> (ActivityBottomSheet.kt:24)");
            }
            BoxKt.n(SizeKt.J2(Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
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
