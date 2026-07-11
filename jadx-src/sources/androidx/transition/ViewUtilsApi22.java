package androidx.transition;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
class ViewUtilsApi22 extends ViewUtilsApi21 {
    private static boolean mUb = true;

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static void n(View view, int i2, int i3, int i5, int i7) {
            view.setLeftTopRightBottom(i2, i3, i5, i7);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void J2(View view, int i2, int i3, int i5, int i7) {
        if (mUb) {
            try {
                Api29Impl.n(view, i2, i3, i5, i7);
            } catch (NoSuchMethodError unused) {
                mUb = false;
            }
        }
    }

    ViewUtilsApi22() {
    }
}
