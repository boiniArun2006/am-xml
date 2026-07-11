package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class GravityCompat {
    public static void n(int i2, int i3, int i5, Rect rect, Rect rect2, int i7) {
        Gravity.apply(i2, i3, i5, rect, rect2, i7);
    }

    public static int rl(int i2, int i3) {
        return Gravity.getAbsoluteGravity(i2, i3);
    }
}
