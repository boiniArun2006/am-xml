package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class WindowCompat {

    @RequiresApi
    static class Api28Impl {
    }

    static class Api16Impl {
        static void n(Window window, boolean z2) {
            int i2;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z2) {
                i2 = systemUiVisibility & (-1793);
            } else {
                i2 = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i2);
        }
    }

    @RequiresApi
    static class Api30Impl {
        static void n(Window window, boolean z2) {
            int i2;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z2) {
                i2 = systemUiVisibility & (-257);
            } else {
                i2 = systemUiVisibility | 256;
            }
            decorView.setSystemUiVisibility(i2);
            window.setDecorFitsSystemWindows(z2);
        }
    }

    @RequiresApi
    static class Api35Impl {
        static void n(Window window, boolean z2) {
            window.setDecorFitsSystemWindows(z2);
        }
    }

    public static WindowInsetsControllerCompat n(Window window, View view) {
        return new WindowInsetsControllerCompat(window, view);
    }

    public static void rl(Window window, boolean z2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            Api35Impl.n(window, z2);
        } else if (i2 >= 30) {
            Api30Impl.n(window, z2);
        } else {
            Api16Impl.n(window, z2);
        }
    }
}
