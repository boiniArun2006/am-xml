package LD;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import iyp.C;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f5924n = new j();
    public static Function3 rl = ComposableLambdaKt.rl(1954225262, false, C0203j.f5925n);

    /* JADX INFO: renamed from: LD.j$j, reason: collision with other inner class name */
    static final class C0203j implements Function3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0203j f5925n = new C0203j();

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            n((Function1) obj, (Composer) obj2, ((Number) obj3).intValue());
            return Unit.INSTANCE;
        }

        public final void n(Function1 it, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i2 & 17) == 16 && composer.xMQ()) {
                composer.wTp();
                return;
            }
            if (ComposerKt.v()) {
                ComposerKt.p5(1954225262, i2, -1, "com.alightcreative.monorepo.sercretmenu.internal.ComposableSingletons$InstallSecretMenuUseCaseImplKt.lambda-1.<anonymous> (InstallSecretMenuUseCaseImpl.kt:41)");
            }
            C.ty(composer, 0);
            if (ComposerKt.v()) {
                ComposerKt.M7();
            }
        }

        C0203j() {
        }
    }

    public final Function3 n() {
        return rl;
    }
}
