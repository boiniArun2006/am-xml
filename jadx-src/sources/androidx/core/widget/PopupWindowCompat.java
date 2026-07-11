package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class PopupWindowCompat {

    @RequiresApi
    static class Api23Impl {
        static void n(PopupWindow popupWindow, boolean z2) {
            popupWindow.setOverlapAnchor(z2);
        }

        static void rl(PopupWindow popupWindow, int i2) {
            popupWindow.setWindowLayoutType(i2);
        }
    }

    public static void n(PopupWindow popupWindow, boolean z2) {
        Api23Impl.n(popupWindow, z2);
    }

    public static void rl(PopupWindow popupWindow, int i2) {
        Api23Impl.rl(popupWindow, i2);
    }

    public static void t(PopupWindow popupWindow, View view, int i2, int i3, int i5) {
        popupWindow.showAsDropDown(view, i2, i3, i5);
    }
}
