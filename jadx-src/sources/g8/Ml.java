package g8;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.vungle.ads.internal.protos.Sdk;
import g8.Ml;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Ml f67066n = new Ml();
    public static Function4 rl = ComposableLambdaKt.rl(1550844009, false, j.f67069n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function4 f67067t = ComposableLambdaKt.rl(387124852, false, n.f67070n);
    public static Function2 nr = ComposableLambdaKt.rl(-1916336912, false, w6.f67071n);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static Function2 f67065O = ComposableLambdaKt.rl(-1896415957, false, C0935Ml.f67068n);

    /* JADX INFO: renamed from: g8.Ml$Ml, reason: collision with other inner class name */
    static final class C0935Ml implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0935Ml f67068n = new C0935Ml();

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
                ComposerKt.p5(-1896415957, i2, -1, "com.alightcreative.monetization.stackedintro.components.ComposableSingletons$CheckableCardKt.lambda-4.<anonymous> (CheckableCard.kt:81)");
            }
            SurfaceKt.n(null, null, 0L, 0L, 0.0f, 0.0f, null, Ml.f67066n.t(), composer, 12582912, 127);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C0935Ml() {
        }
    }

    static final class j implements Function4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final j f67069n = new j();

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((RowScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(RowScope rowScope, boolean z2, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(rowScope, "<this>");
            if ((i2 & 129) == 128 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1550844009, i2, -1, "com.alightcreative.monetization.stackedintro.components.ComposableSingletons$CheckableCardKt.lambda-1.<anonymous> (CheckableCard.kt:31)");
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        j() {
        }
    }

    static final class n implements Function4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f67070n = new n();

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedContentScope AnimatedContent, boolean z2, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.v()) {
                ComposerKt.p5(387124852, i2, -1, "com.alightcreative.monetization.stackedintro.components.ComposableSingletons$CheckableCardKt.lambda-2.<anonymous> (CheckableCard.kt:58)");
            }
            if (z2) {
                composer.eF(-484360392);
                ImageKt.n(PainterResources_androidKt.t(2131231976, composer, 6), null, null, null, null, 0.0f, null, composer, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                composer.Xw();
            } else {
                composer.eF(-484112330);
                ImageKt.n(PainterResources_androidKt.t(2131231977, composer, 6), null, null, null, null, 0.0f, null, composer, 48, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                composer.Xw();
            }
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        n() {
        }
    }

    static final class w6 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f67071n = new w6();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(boolean z2) {
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            rl((Composer) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }

        public final void rl(Composer composer, int i2) {
            if ((i2 & 3) == 2 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-1916336912, i2, -1, "com.alightcreative.monetization.stackedintro.components.ComposableSingletons$CheckableCardKt.lambda-3.<anonymous> (CheckableCard.kt:82)");
            }
            Modifier modifierXMQ = SizeKt.xMQ(Modifier.INSTANCE, Dp.KN(200));
            composer.eF(245029605);
            Object objIF = composer.iF();
            if (objIF == Composer.INSTANCE.n()) {
                objIF = new Function1() { // from class: g8.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Ml.w6.t(((Boolean) obj).booleanValue());
                    }
                };
                composer.o(objIF);
            }
            composer.Xw();
            g8.w6.t(modifierXMQ, true, (Function1) objIF, null, composer, 438, 8);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        w6() {
        }
    }

    public final Function4 n() {
        return rl;
    }

    public final Function4 rl() {
        return f67067t;
    }

    public final Function2 t() {
        return nr;
    }
}
