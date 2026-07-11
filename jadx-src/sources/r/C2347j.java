package r;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: r.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class C2347j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C2347j f72693n = new C2347j();
    public static Function3 rl = ComposableLambdaKt.rl(-1825595920, false, C1143j.f72694n);

    /* JADX INFO: renamed from: r.j$j, reason: collision with other inner class name */
    static final class C1143j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1143j f72694n = new C1143j();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope rowScope, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(rowScope, "<this>");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1825595920, i2, -1, "com.alightcreative.app.motion.numerickeypad.ComposableSingletons$KeypadKeysKt.lambda-1.<anonymous> (KeypadKeys.kt:69)");
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C1143j() {
        }
    }

    public final Function3 n() {
        return rl;
    }
}
