package o;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.safedk.android.analytics.brandsafety.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C2306j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2306j f71333n = new C2306j();
    public static Function3 rl = ComposableLambdaKt.rl(363227585, false, C1076j.f71334n);

    /* JADX INFO: renamed from: o.j$j, reason: collision with other inner class name */
    static final class C1076j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1076j f71334n = new C1076j();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope Button, Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i2 & 6) == 0) {
                i3 = i2 | (composer.p5(Button) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i3 & 19) == 18 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(363227585, i3, -1, "com.alightcreative.monetization.ui.components.buttons.ComposableSingletons$PaywallCloseWithAdButtonKt.lambda-1.<anonymous> (PaywallCloseWithAdButton.kt:63)");
            }
            Painter painterT = PainterResources_androidKt.t(2131231605, composer, 6);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            ImageKt.n(painterT, null, Button.t(companion, companion2.xMQ()), null, null, 0.0f, null, composer, 48, b.f61769v);
            SpacerKt.n(SizeKt.ViF(companion, Dp.KN(8)), composer, 6);
            TextKt.t(StringResources_androidKt.t(2132020437, composer, 6), Button.t(companion, companion2.xMQ()), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).J2(), composer, 0, 0, 65532);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C1076j() {
        }
    }

    public final Function3 n() {
        return rl;
    }
}
