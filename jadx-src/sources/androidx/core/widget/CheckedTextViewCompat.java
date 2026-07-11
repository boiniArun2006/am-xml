package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CheckedTextViewCompat {

    @RequiresApi
    private static class Api21Impl {
        static void n(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void rl(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    public static Drawable n(CheckedTextView checkedTextView) {
        return checkedTextView.getCheckMarkDrawable();
    }

    public static void rl(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        Api21Impl.n(checkedTextView, colorStateList);
    }

    public static void t(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        Api21Impl.rl(checkedTextView, mode);
    }
}
