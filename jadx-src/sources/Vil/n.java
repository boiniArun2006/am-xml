package Vil;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.media3.exoplayer.RendererCapabilities;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n f11253n = new n();
    public static Function3 rl = ComposableLambdaKt.rl(-1876082365, false, j.f11255n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function3 f11254t = ComposableLambdaKt.rl(-1689870982, false, C0402n.f11256n);

    static final class j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f11255n = new j();

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
                ComposerKt.p5(-1876082365, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.ComposableSingletons$PresetRenameDialogKt.lambda-1.<anonymous> (PresetRenameDialog.kt:83)");
            }
            TextKt.t(StringResources_androidKt.t(2132017396, composer, 6), null, aD.w6.Jk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(H9N.j.f3810n.rl(composer, 6).mUb(), 0L, 0L, FontWeight.INSTANCE.O(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j() {
        }
    }

    /* JADX INFO: renamed from: Vil.n$n, reason: collision with other inner class name */
    static final class C0402n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0402n f11256n = new C0402n();

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
                ComposerKt.p5(-1689870982, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.ComposableSingletons$PresetRenameDialogKt.lambda-2.<anonymous> (PresetRenameDialog.kt:104)");
            }
            TextKt.t(StringResources_androidKt.t(2132020303, composer, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(H9N.j.f3810n.rl(composer, 6).mUb(), 0L, 0L, FontWeight.INSTANCE.n(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 65534);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C0402n() {
        }
    }

    public final Function3 n() {
        return rl;
    }

    public final Function3 rl() {
        return f11254t;
    }
}
