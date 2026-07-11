package androidx.core.view;

import android.view.WindowInsetsAnimationController;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class WindowInsetsAnimationControllerCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Impl f36818n;

    private static class Impl {
        Impl() {
        }
    }

    @RequiresApi
    private static class Impl30 extends Impl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WindowInsetsAnimationController f36819n;

        Impl30(WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f36819n = windowInsetsAnimationController;
        }
    }

    WindowInsetsAnimationControllerCompat(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f36818n = new Impl30(windowInsetsAnimationController);
    }
}
