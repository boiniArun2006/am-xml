package UX1;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final CN3 f10765n = new CN3();
    public static Function2 rl = ComposableLambdaKt.rl(722388448, false, j.f10766n);

    static final class j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f10766n = new j();

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
                ComposerKt.p5(722388448, i2, -1, "com.bendingspoons.secretmenu.backendoverride.ComposableSingletons$BackendOverrideScreenKt.lambda-1.<anonymous> (BackendOverrideScreen.kt:34)");
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
