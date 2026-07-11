package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.material.textfield.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
abstract class AbstractC1892c {
    static void O(CheckableImageButton checkableImageButton) {
    }

    static ImageView.ScaleType rl(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    private static void J2(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z2;
        boolean zBzg = ViewCompat.bzg(checkableImageButton);
        boolean z3 = false;
        int i2 = 1;
        if (onLongClickListener != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (zBzg || z2) {
            z3 = true;
        }
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(zBzg);
        checkableImageButton.setPressable(zBzg);
        checkableImageButton.setLongClickable(z2);
        if (!z3) {
            i2 = 2;
        }
        ViewCompat.ul(checkableImageButton, i2);
    }

    static void KN(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        J2(checkableImageButton, onLongClickListener);
    }

    static void Uo(CheckableImageButton checkableImageButton, int i2) {
        checkableImageButton.setMinimumWidth(i2);
        checkableImageButton.setMinimumHeight(i2);
    }

    static void mUb(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }

    static void n(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = DrawableCompat.r(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                DrawableCompat.HI(drawable, ColorStateList.valueOf(colorStateList.getColorForState(t(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                DrawableCompat.HI(drawable, colorStateList);
            }
            if (mode != null) {
                DrawableCompat.ck(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    static void nr(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(t(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable drawableMutate = DrawableCompat.r(drawable).mutate();
            DrawableCompat.HI(drawableMutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(drawableMutate);
        }
    }

    private static int[] t(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    static void xMQ(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        J2(checkableImageButton, onLongClickListener);
    }
}
