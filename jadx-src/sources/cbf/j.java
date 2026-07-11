package cbf;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import cbf.j;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f43684n = new j();
    public static Function3 rl = ComposableLambdaKt.rl(-778357735, false, C0593j.f43687n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function2 f43685t = ComposableLambdaKt.rl(749987438, false, n.f43688n);
    public static Function3 nr = ComposableLambdaKt.rl(-831156158, false, w6.f43689n);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static Function2 f43683O = ComposableLambdaKt.rl(-1010024784, false, Ml.f43686n);

    static final class Ml implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Ml f43686n = new Ml();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O() {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit nr(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            t((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void t(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1010024784, i2, -1, "com.bendingspoons.secretmenu.spidersense.ComposableSingletons$SpiderSenseUserRecognizerScreenKt.lambda-4.<anonymous> (SpiderSenseUserRecognizerScreen.kt:172)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"exp/1", "exp/2", "exp/3"});
            composer.eF(376984459);
            Object objIF = composer.iF();
            Composer.Companion companion = Composer.INSTANCE;
            if (objIF == companion.n()) {
                objIF = new Function1() { // from class: cbf.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j.Ml.nr((String) obj);
                    }
                };
                composer.o(objIF);
            }
            Function1 function1 = (Function1) objIF;
            composer.Xw();
            composer.eF(376985515);
            Object objIF2 = composer.iF();
            if (objIF2 == companion.n()) {
                objIF2 = new Function0() { // from class: cbf.w6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.Ml.O();
                    }
                };
                composer.o(objIF2);
            }
            composer.Xw();
            Dsr.xMQ(function1, (Function0) objIF2, false, true, listListOf, composer, 28086);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        Ml() {
        }
    }

    /* JADX INFO: renamed from: cbf.j$j, reason: collision with other inner class name */
    static final class C0593j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0593j f43687n = new C0593j();

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
                ComposerKt.p5(-778357735, i2, -1, "com.bendingspoons.secretmenu.spidersense.ComposableSingletons$SpiderSenseUserRecognizerScreenKt.lambda-1.<anonymous> (SpiderSenseUserRecognizerScreen.kt:93)");
            }
            TextKt.t("Present User ID", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C0593j() {
        }
    }

    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f43688n = new n();

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
                ComposerKt.p5(749987438, i2, -1, "com.bendingspoons.secretmenu.spidersense.ComposableSingletons$SpiderSenseUserRecognizerScreenKt.lambda-2.<anonymous> (SpiderSenseUserRecognizerScreen.kt:133)");
            }
            TextKt.t("Custom string", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        n() {
        }
    }

    static final class w6 implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f43689n = new w6();

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
                ComposerKt.p5(-831156158, i2, -1, "com.bendingspoons.secretmenu.spidersense.ComposableSingletons$SpiderSenseUserRecognizerScreenKt.lambda-3.<anonymous> (SpiderSenseUserRecognizerScreen.kt:144)");
            }
            TextKt.t("Send event", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 131070);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        w6() {
        }
    }

    public final Function3 n() {
        return rl;
    }

    public final Function2 rl() {
        return f43685t;
    }

    public final Function3 t() {
        return nr;
    }
}
