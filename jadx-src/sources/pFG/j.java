package pFG;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f71796n = new j();
    public static Function2 rl = ComposableLambdaKt.rl(1178868021, false, C1096j.f71798n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function2 f71797t = ComposableLambdaKt.rl(-406451758, false, n.f71799n);
    public static Function3 nr = ComposableLambdaKt.rl(246470512, false, w6.f71800n);

    /* JADX INFO: renamed from: pFG.j$j, reason: collision with other inner class name */
    static final class C1096j implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1096j f71798n = new C1096j();

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
                ComposerKt.p5(1178868021, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.ComposableSingletons$ExperimentsScreenContentKt.lambda-1.<anonymous> (ExperimentsScreenContent.kt:105)");
            }
            TextKt.t("Search Experiments", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C1096j() {
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f71799n = new n();

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
                ComposerKt.p5(-406451758, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.ComposableSingletons$ExperimentsScreenContentKt.lambda-2.<anonymous> (ExperimentsScreenContent.kt:106)");
            }
            IconKt.nr(SearchKt.n(Icons.f23855n.n()), "Search", null, 0L, composer, 48, 12);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        n() {
        }
    }

    static final class w6 implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f71800n = new w6();

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
                ComposerKt.p5(246470512, i2, -1, "com.bendingspoons.experiments.secretmenu.items.experiments.ComposableSingletons$ExperimentsScreenContentKt.lambda-3.<anonymous> (ExperimentsScreenContent.kt:136)");
            }
            TextKt.t("Save and Exit", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        w6() {
        }
    }

    public final Function2 n() {
        return rl;
    }

    public final Function2 rl() {
        return f71797t;
    }

    public final Function3 t() {
        return nr;
    }
}
