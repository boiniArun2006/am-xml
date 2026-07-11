package HI0;

import android.os.Build;
import android.view.Window;
import android.view.WindowInsetsController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class M5 {
    public static final void n(Window window, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        window.setStatusBarColor(i2);
        window.setNavigationBarColor(i3);
        if (Build.VERSION.SDK_INT < 30) {
            if (z2) {
                window.getDecorView().setSystemUiVisibility(8192);
                return;
            } else {
                window.getDecorView().setSystemUiVisibility(0);
                return;
            }
        }
        if (z2) {
            WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            return;
        }
        WindowInsetsController windowInsetsController2 = window.getDecorView().getWindowInsetsController();
        if (windowInsetsController2 != null) {
            windowInsetsController2.setSystemBarsAppearance(0, 8);
        }
    }

    public static /* synthetic */ void rl(Window window, int i2, int i3, boolean z2, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z2 = false;
        }
        n(window, i2, i3, z2);
    }
}
