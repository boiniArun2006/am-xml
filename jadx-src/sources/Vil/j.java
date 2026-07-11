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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f11159n = new j();
    public static Function3 rl = ComposableLambdaKt.rl(148082074, false, C0397j.f11161n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function3 f11160t = ComposableLambdaKt.rl(297555267, false, n.f11162n);

    /* JADX INFO: renamed from: Vil.j$j, reason: collision with other inner class name */
    static final class C0397j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0397j f11161n = new C0397j();

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
                ComposerKt.p5(148082074, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.ComposableSingletons$PresetDeleteDialogKt.lambda-1.<anonymous> (PresetDeleteDialog.kt:83)");
            }
            TextKt.t(StringResources_androidKt.t(2132017650, composer, 6), null, aD.w6.n1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).mUb(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C0397j() {
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f11162n = new n();

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
                ComposerKt.p5(297555267, i2, -1, "com.alightcreative.maineditor.presetpreview.ui.components.ComposableSingletons$PresetDeleteDialogKt.lambda-2.<anonymous> (PresetDeleteDialog.kt:101)");
            }
            TextKt.t(StringResources_androidKt.t(2132017396, composer, 6), null, aD.w6.Jk(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.t(H9N.j.f3810n.rl(composer, 6).mUb(), 0L, 0L, FontWeight.INSTANCE.O(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        n() {
        }
    }

    public final Function3 n() {
        return rl;
    }

    public final Function3 rl() {
        return f11160t;
    }
}
