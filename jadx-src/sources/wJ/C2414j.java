package wJ;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: wJ.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C2414j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2414j f74916n = new C2414j();
    public static Function2 rl = ComposableLambdaKt.rl(-978658061, false, C1249j.f74918n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function2 f74917t = ComposableLambdaKt.rl(-1940283276, false, n.f74919n);

    /* JADX INFO: renamed from: wJ.j$j, reason: collision with other inner class name */
    static final class C1249j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1249j f74918n = new C1249j();

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
                ComposerKt.p5(-978658061, i2, -1, "com.alightcreative.monetization.ui.components.dialogs.ComposableSingletons$FreeTrialAlertDialogKt.lambda-1.<anonymous> (FreeTrialAlertDialog.kt:30)");
            }
            TextKt.t(StringResources_androidKt.t(2132019880, composer, 6), null, Color.INSTANCE.n(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).n(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C1249j() {
        }
    }

    /* JADX INFO: renamed from: wJ.j$n */
    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f74919n = new n();

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
                ComposerKt.p5(-1940283276, i2, -1, "com.alightcreative.monetization.ui.components.dialogs.ComposableSingletons$FreeTrialAlertDialogKt.lambda-2.<anonymous> (FreeTrialAlertDialog.kt:37)");
            }
            TextKt.t(StringResources_androidKt.t(2132019879, composer, 6), null, Color.INSTANCE.n(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).r(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        n() {
        }
    }

    public final Function2 n() {
        return rl;
    }

    public final Function2 rl() {
        return f74917t;
    }
}
