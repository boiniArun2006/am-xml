package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class j {
    private final mfo.C J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f58946O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f58947n;
    private final ColorStateList nr;
    private final ColorStateList rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ColorStateList f58948t;

    static j n(Context context, int i2) {
        Preconditions.rl(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, Rxk.o.ENe);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(Rxk.o.Ai, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(Rxk.o.F6W, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(Rxk.o.lvn, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(Rxk.o.u2n, 0));
        ColorStateList colorStateListN = X4.w6.n(context, typedArrayObtainStyledAttributes, Rxk.o.f8879q);
        ColorStateList colorStateListN2 = X4.w6.n(context, typedArrayObtainStyledAttributes, Rxk.o.fwz);
        ColorStateList colorStateListN3 = X4.w6.n(context, typedArrayObtainStyledAttributes, Rxk.o.f8864ep);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(Rxk.o.X6, 0);
        mfo.C cAz = mfo.C.rl(context, typedArrayObtainStyledAttributes.getResourceId(Rxk.o.Hq, 0), typedArrayObtainStyledAttributes.getResourceId(Rxk.o.f8878p, 0)).az();
        typedArrayObtainStyledAttributes.recycle();
        return new j(colorStateListN, colorStateListN2, colorStateListN3, dimensionPixelSize, cAz, rect);
    }

    void rl(TextView textView) {
        t(textView, null, null);
    }

    void t(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        mfo.CN3 cn3 = new mfo.CN3();
        mfo.CN3 cn32 = new mfo.CN3();
        cn3.setShapeAppearanceModel(this.J2);
        cn32.setShapeAppearanceModel(this.J2);
        if (colorStateList == null) {
            colorStateList = this.f58948t;
        }
        cn3.p5(colorStateList);
        cn3.B(this.f58946O, this.nr);
        if (colorStateList2 == null) {
            colorStateList2 = this.rl;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.rl.withAlpha(30), cn3, cn32);
        Rect rect = this.f58947n;
        ViewCompat.C(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    private j(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, mfo.C c2, Rect rect) {
        Preconditions.nr(rect.left);
        Preconditions.nr(rect.top);
        Preconditions.nr(rect.right);
        Preconditions.nr(rect.bottom);
        this.f58947n = rect;
        this.rl = colorStateList2;
        this.f58948t = colorStateList;
        this.nr = colorStateList3;
        this.f58946O = i2;
        this.J2 = c2;
    }
}
