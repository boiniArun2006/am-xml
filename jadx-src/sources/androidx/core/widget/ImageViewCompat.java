package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class ImageViewCompat {

    @RequiresApi
    static class Api21Impl {
        static ColorStateList n(ImageView imageView) {
            return imageView.getImageTintList();
        }

        static void nr(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }

        static PorterDuff.Mode rl(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        static void t(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }
    }

    public static ColorStateList n(ImageView imageView) {
        return Api21Impl.n(imageView);
    }

    public static void nr(ImageView imageView, PorterDuff.Mode mode) {
        Api21Impl.nr(imageView, mode);
    }

    public static PorterDuff.Mode rl(ImageView imageView) {
        return Api21Impl.rl(imageView);
    }

    public static void t(ImageView imageView, ColorStateList colorStateList) {
        Api21Impl.t(imageView, colorStateList);
    }
}
