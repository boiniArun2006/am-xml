package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RequiresApi
class ViewUtilsApi21 extends ViewUtilsApi19 {
    private static boolean KN = true;
    private static boolean Uo = true;
    private static boolean xMQ = true;

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static void n(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        @DoNotInline
        static void rl(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        @DoNotInline
        static void t(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void O(View view, Matrix matrix) {
        if (Uo) {
            try {
                Api29Impl.n(view, matrix);
            } catch (NoSuchMethodError unused) {
                Uo = false;
            }
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void mUb(View view, Matrix matrix) {
        if (xMQ) {
            try {
                Api29Impl.t(view, matrix);
            } catch (NoSuchMethodError unused) {
                xMQ = false;
            }
        }
    }

    @Override // androidx.transition.ViewUtilsApi19
    public void xMQ(View view, Matrix matrix) {
        if (KN) {
            try {
                Api29Impl.rl(view, matrix);
            } catch (NoSuchMethodError unused) {
                KN = false;
            }
        }
    }

    ViewUtilsApi21() {
    }
}
