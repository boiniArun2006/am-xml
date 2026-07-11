package SNU;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f9748n = new j();
    public static Function3 rl = ComposableLambdaKt.rl(211186043, false, C0312j.f9750n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Function3 f9749t = ComposableLambdaKt.rl(-800041692, false, n.f9751n);

    /* JADX INFO: renamed from: SNU.j$j, reason: collision with other inner class name */
    static final class C0312j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0312j f9750n = new C0312j();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope item, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(211186043, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.rewardlist.ComposableSingletons$CreatorRewardListScreenKt.lambda-1.<anonymous> (CreatorRewardListScreen.kt:96)");
            }
            SpacerKt.n(SizeKt.Z(Modifier.INSTANCE, Dp.KN(0)), composer, 6);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C0312j() {
        }
    }

    static final class n implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final n f9751n = new n();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((LazyItemScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(LazyItemScope item, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(-800041692, i2, -1, "com.alightcreative.app.motion.activities.creatorprogram.rewardlist.ComposableSingletons$CreatorRewardListScreenKt.lambda-2.<anonymous> (CreatorRewardListScreen.kt:109)");
            }
            SpacerKt.n(SizeKt.Z(Modifier.INSTANCE, Dp.KN(4)), composer, 6);
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
        return f9749t;
    }
}
