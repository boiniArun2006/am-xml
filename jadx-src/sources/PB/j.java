package PB;

import PB.Wre;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.painter.ColorPainter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.alightcreative.app.motion.templates.Template;
import com.alightcreative.time.Kw.znsSxz;
import com.safedk.android.analytics.brandsafety.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f7640n = new j();
    public static Function3 rl = ComposableLambdaKt.rl(-613516594, false, C0265j.f7642n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function2 f7641t = ComposableLambdaKt.rl(896209275, false, n.f7643n);
    public static Function2 nr = ComposableLambdaKt.rl(382807689, false, w6.f7645n);

    /* JADX INFO: renamed from: PB.j$j, reason: collision with other inner class name */
    static final class C0265j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0265j f7642n = new C0265j();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(BoxScope PulsingView, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(PulsingView, "$this$PulsingView");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-613516594, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.composables.ComposableSingletons$TemplatesTagCarouselKt.lambda-1.<anonymous> (TemplatesTagCarousel.kt:123)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalTy = Arrangement.f17400n.ty(Dp.KN(4));
            Alignment.Horizontal horizontalUo = Alignment.INSTANCE.Uo();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyN = ColumnKt.n(horizontalOrVerticalTy, horizontalUo, composer, 54);
            int iN = ComposablesKt.n(composer, 0);
            CompositionLocalMap compositionLocalMapIk = composer.Ik();
            Modifier modifierO = ComposedModifierKt.O(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0 function0N = companion2.n();
            if (composer.getApplier() == null) {
                ComposablesKt.t();
            }
            composer.T();
            if (composer.getInserting()) {
                composer.s7N(function0N);
            } else {
                composer.r();
            }
            Composer composerN = Updater.n(composer);
            Updater.O(composerN, measurePolicyN, companion2.t());
            Updater.O(composerN, compositionLocalMapIk, companion2.O());
            Function2 function2Rl = companion2.rl();
            if (composerN.getInserting() || !Intrinsics.areEqual(composerN.iF(), Integer.valueOf(iN))) {
                composerN.o(Integer.valueOf(iN));
                composerN.az(Integer.valueOf(iN), function2Rl);
            }
            Updater.O(composerN, modifierO, companion2.nr());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f17468n;
            ImageKt.n(new ColorPainter(((aF1.j) composer.ty(aF1.w6.t())).J2(), null), "Placeholder", ClipKt.n(SizeKt.Z(companion, Dp.KN(72)), RoundedCornerShapeKt.J2()), null, null, 0.0f, null, composer, 48, b.f61769v);
            ImageKt.n(new ColorPainter(((aF1.j) composer.ty(aF1.w6.t())).J2(), null), "Placeholder", ClipKt.n(SizeKt.S(companion, Dp.KN(44), Dp.KN(16)), RoundedCornerShapeKt.t(Dp.KN(5))), null, null, 0.0f, null, composer, 48, b.f61769v);
            composer.XQ();
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C0265j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    static final class n implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f7643n = new n();

        /* JADX INFO: renamed from: PB.j$n$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
        static final class C0266j implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0266j f7644n = new C0266j();

            public final void n(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Template.Tag) obj).getValue());
                return Unit.INSTANCE;
            }

            C0266j() {
            }
        }

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
                ComposerKt.p5(896209275, i2, -1, znsSxz.SXLWMVDtUb);
            }
            List listListOf = CollectionsKt.listOf((Object[]) new Wre.j[]{new Wre.j(Template.Tag.t("For you"), "", false, 4, null), new Wre.j(Template.Tag.t("Anime"), "", false, 4, null), new Wre.j(Template.Tag.t("Transitions"), "", true, null)});
            composer.eF(-2004110304);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = C0266j.f7644n;
                composer.o(objIF);
            }
            composer.Xw();
            C.Uo(listListOf, (Function1) objIF, null, null, null, composer, 48, 28);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        n() {
        }
    }

    static final class w6 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f7645n = new w6();

        /* JADX INFO: renamed from: PB.j$w6$j, reason: collision with other inner class name */
        static final class C0267j implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0267j f7646n = new C0267j();

            public final void n(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                n(((Template.Tag) obj).getValue());
                return Unit.INSTANCE;
            }

            C0267j() {
            }
        }

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
                ComposerKt.p5(382807689, i2, -1, "com.alightcreative.app.motion.activities.main.maintabs.composables.ComposableSingletons$TemplatesTagCarouselKt.lambda-3.<anonymous> (TemplatesTagCarousel.kt:171)");
            }
            ArrayList arrayList = new ArrayList(5);
            for (int i3 = 0; i3 < 5; i3++) {
                arrayList.add(Wre.n.f7626n);
            }
            composer.eF(-496551295);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = C0267j.f7646n;
                composer.o(objIF);
            }
            composer.Xw();
            C.Uo(arrayList, (Function1) objIF, null, null, null, composer, 48, 28);
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
}
