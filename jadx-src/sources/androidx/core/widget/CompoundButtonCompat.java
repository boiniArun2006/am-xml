package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class CompoundButtonCompat {

    @RequiresApi
    static class Api21Impl {
        static ColorStateList n(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        static void nr(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }

        static PorterDuff.Mode rl(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        static void t(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }
    }

    @RequiresApi
    static class Api23Impl {
        static Drawable n(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static void O(CompoundButton compoundButton, PorterDuff.Mode mode) {
        Api21Impl.nr(compoundButton, mode);
    }

    public static Drawable n(CompoundButton compoundButton) {
        return Api23Impl.n(compoundButton);
    }

    public static void nr(CompoundButton compoundButton, ColorStateList colorStateList) {
        Api21Impl.t(compoundButton, colorStateList);
    }

    public static ColorStateList rl(CompoundButton compoundButton) {
        return Api21Impl.n(compoundButton);
    }

    public static PorterDuff.Mode t(CompoundButton compoundButton) {
        return Api21Impl.rl(compoundButton);
    }
}
