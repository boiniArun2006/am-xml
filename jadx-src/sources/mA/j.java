package mA;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f70642n = new j();
    public static Function2 rl = ComposableLambdaKt.rl(-265932816, false, C1052j.f70643n);

    /* JADX INFO: renamed from: mA.j$j, reason: collision with other inner class name */
    static final class C1052j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1052j f70643n = new C1052j();

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
                ComposerKt.p5(-265932816, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.home.composables.ComposableSingletons$HomeScreenSectionKt.lambda-1.<anonymous> (HomeScreenSection.kt:18)");
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C1052j() {
        }
    }

    public final Function2 n() {
        return rl;
    }
}
