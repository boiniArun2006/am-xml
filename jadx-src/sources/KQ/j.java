package KQ;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f5344n = new j();
    public static Function4 rl = ComposableLambdaKt.rl(3410763, false, C0177j.f5345n);

    /* JADX INFO: renamed from: KQ.j$j, reason: collision with other inner class name */
    static final class C0177j implements Function4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0177j f5345n = new C0177j();

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            n((AnimatedContentScope) obj, (eO) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return Unit.INSTANCE;
        }

        public final void n(AnimatedContentScope AnimatedContent, eO it, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.v()) {
                ComposerKt.p5(3410763, i2, -1, "com.alightcreative.app.motion.activities.survey.ui.ComposableSingletons$QuestionAndAnswersKt.lambda-1.<anonymous> (QuestionAndAnswers.kt:123)");
            }
            qz.aYN(it.mUb(), it.t(), it.O(), composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C0177j() {
        }
    }

    public final Function4 n() {
        return rl;
    }
}
