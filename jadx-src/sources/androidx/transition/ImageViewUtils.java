package androidx.transition;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class ImageViewUtils {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f42191n = true;

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static void n(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    static void n(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.n(imageView, matrix);
            return;
        }
        if (matrix != null) {
            rl(imageView, matrix);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    private static void rl(ImageView imageView, Matrix matrix) {
        if (f42191n) {
            try {
                Api29Impl.n(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f42191n = false;
            }
        }
    }
}
