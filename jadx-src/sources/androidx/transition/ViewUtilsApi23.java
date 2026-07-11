package androidx.transition;

import android.os.Build;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
class ViewUtilsApi23 extends ViewUtilsApi22 {
    private static boolean gh = true;

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static void n(View view, int i2) {
            view.setTransitionVisibility(i2);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void KN(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.KN(view, i2);
        } else if (gh) {
            try {
                Api29Impl.n(view, i2);
            } catch (NoSuchMethodError unused) {
                gh = false;
            }
        }
    }

    ViewUtilsApi23() {
    }
}
