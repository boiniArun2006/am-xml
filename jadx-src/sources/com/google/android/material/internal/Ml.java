package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Ml {
    public static void n(Window window, boolean z2, Integer num, Integer num2) {
        boolean z3 = num == null || num.intValue() == 0;
        boolean z4 = num2 == null || num2.intValue() == 0;
        if (z3 || z4) {
            int iRl = W3.j.rl(window.getContext(), R.attr.colorBackground, -16777216);
            if (z3) {
                num = Integer.valueOf(iRl);
            }
            if (z4) {
                num2 = Integer.valueOf(iRl);
            }
        }
        WindowCompat.rl(window, !z2);
        int iT = t(window.getContext(), z2);
        int iRl2 = rl(window.getContext(), z2);
        window.setStatusBarColor(iT);
        window.setNavigationBarColor(iRl2);
        J2(window, nr(iT, W3.j.KN(num.intValue())));
        O(window, nr(iRl2, W3.j.KN(num2.intValue())));
    }

    private static int rl(Context context, boolean z2) {
        if (z2 && Build.VERSION.SDK_INT < 27) {
            return ColorUtils.ck(W3.j.rl(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z2) {
            return 0;
        }
        return W3.j.rl(context, R.attr.navigationBarColor, -16777216);
    }

    private static int t(Context context, boolean z2) {
        if (z2) {
            return 0;
        }
        return W3.j.rl(context, R.attr.statusBarColor, -16777216);
    }

    public static void J2(Window window, boolean z2) {
        WindowCompat.n(window, window.getDecorView()).t(z2);
    }

    public static void O(Window window, boolean z2) {
        WindowCompat.n(window, window.getDecorView()).rl(z2);
    }

    private static boolean nr(int i2, boolean z2) {
        if (!W3.j.KN(i2)) {
            if (i2 != 0 || !z2) {
                return false;
            }
            return true;
        }
        return true;
    }
}
