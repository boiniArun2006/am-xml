package nz;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f71294n = new j();
    public static Function3 rl = ComposableLambdaKt.rl(1589585275, false, C1075j.f71296n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function3 f71295t = ComposableLambdaKt.rl(1161660067, false, n.f71297n);

    /* JADX INFO: renamed from: nz.j$j, reason: collision with other inner class name */
    static final class C1075j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C1075j f71296n = new C1075j();

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
                ComposerKt.p5(1589585275, i3, -1, "com.alightcreative.app.motion.activities.main.templatepreview.composables.ComposableSingletons$FooterSectionKt.lambda-1.<anonymous> (FooterSection.kt:60)");
            }
            IconKt.t(PainterResources_androidKt.t(2131231552, composer, 6), null, null, ((aF1.j) composer.ty(aF1.w6.t())).ck(), composer, 48, 4);
            String strT = StringResources_androidKt.t(2132017215, composer, 6);
            H9N.j jVar = H9N.j.f3810n;
            TextKt.t(strT, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).T(), composer, 0, 0, 65534);
            Modifier.Companion companion = Modifier.INSTANCE;
            SpacerKt.n(RowScope.rl(Button, companion, 1.0f, false, 2, null), composer, 0);
            TextKt.t(StringResources_androidKt.t(2132020107, composer, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.rl(composer, 6).X(), composer, 0, 0, 65534);
            IconKt.t(PainterResources_androidKt.t(2131231595, composer, 6), null, PaddingKt.xMQ(SizeKt.Z(companion, Dp.KN(16)), Dp.KN(1)), 0L, composer, 432, 8);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C1075j() {
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f71297n = new n();

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
                ComposerKt.p5(1161660067, i2, -1, "com.alightcreative.app.motion.activities.main.templatepreview.composables.ComposableSingletons$FooterSectionKt.lambda-2.<anonymous> (FooterSection.kt:94)");
            }
            IconKt.t(PainterResources_androidKt.t(2131232015, composer, 6), null, null, 0L, composer, 48, 12);
            SpacerKt.n(SizeKt.ViF(Modifier.INSTANCE, Dp.KN(8)), composer, 6);
            TextKt.t(StringResources_androidKt.t(2132020410, composer, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, H9N.j.f3810n.rl(composer, 6).nY(), composer, 0, 0, 65534);
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
        return f71295t;
    }
}
