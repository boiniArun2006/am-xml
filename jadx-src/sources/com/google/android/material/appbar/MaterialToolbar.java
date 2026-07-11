package com.google.android.material.appbar;

import Rxk.C;
import Rxk.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.eO;
import com.google.android.material.internal.z;
import mfo.CN3;
import mfo.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class MaterialToolbar extends Toolbar {
    private boolean Jk;
    private boolean Rl;
    private Boolean mYa;
    private Integer n1;
    private ImageView.ScaleType qm;
    private static final int Org = C.te;
    private static final ImageView.ScaleType[] HV = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.f8796J);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i2) {
        int i3 = Org;
        super(scw.j.t(context, attributeSet, i2, i3), attributeSet, i2);
        Context context2 = getContext();
        TypedArray typedArrayXMQ = eO.xMQ(context2, attributeSet, o.xSy, i2, i3, new int[0]);
        int i5 = o.stS;
        if (typedArrayXMQ.hasValue(i5)) {
            setNavigationIconTint(typedArrayXMQ.getColor(i5, -1));
        }
        this.Jk = typedArrayXMQ.getBoolean(o.Mfw, false);
        this.Rl = typedArrayXMQ.getBoolean(o.VmZ, false);
        int i7 = typedArrayXMQ.getInt(o.NUo, -1);
        if (i7 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = HV;
            if (i7 < scaleTypeArr.length) {
                this.qm = scaleTypeArr[i7];
            }
        }
        int i8 = o.kW;
        if (typedArrayXMQ.hasValue(i8)) {
            this.mYa = Boolean.valueOf(typedArrayXMQ.getBoolean(i8, false));
        }
        typedArrayXMQ.recycle();
        p5(context2);
    }

    private void E() {
        if (this.Jk || this.Rl) {
            TextView textViewO = z.O(this);
            TextView textViewT = z.t(this);
            if (textViewO == null && textViewT == null) {
                return;
            }
            Pair pairM7 = M7(textViewO, textViewT);
            if (this.Jk && textViewO != null) {
                eF(textViewO, pairM7);
            }
            if (!this.Rl || textViewT == null) {
                return;
            }
            eF(textViewT, pairM7);
        }
    }

    private Drawable M(Drawable drawable) {
        if (drawable == null || this.n1 == null) {
            return drawable;
        }
        Drawable drawableR = DrawableCompat.r(drawable.mutate());
        DrawableCompat.ty(drawableR, this.n1.intValue());
        return drawableR;
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.qm;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.n1;
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.mYa;
        if (bool == null || bool.booleanValue() != z2) {
            this.mYa = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.qm != scaleType) {
            this.qm = scaleType;
            requestLayout();
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.Rl != z2) {
            this.Rl = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.Jk != z2) {
            this.Jk = z2;
            requestLayout();
        }
    }

    private void FX() {
        ImageView imageViewRl = z.rl(this);
        if (imageViewRl != null) {
            Boolean bool = this.mYa;
            if (bool != null) {
                imageViewRl.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.qm;
            if (scaleType != null) {
                imageViewRl.setScaleType(scaleType);
            }
        }
    }

    private Pair M7(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i2 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i2 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i2 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void eF(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i2 += iMax;
            i3 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i2, view.getTop(), i3, view.getBottom());
    }

    private void p5(Context context) {
        ColorStateList colorStateListJ2;
        Drawable background = getBackground();
        if (background == null) {
            colorStateListJ2 = ColorStateList.valueOf(0);
        } else {
            colorStateListJ2 = com.google.android.material.drawable.Ml.J2(background);
        }
        if (colorStateListJ2 != null) {
            CN3 cn3 = new CN3();
            cn3.p5(colorStateListJ2);
            cn3.nHg(context);
            cn3.M7(ViewCompat.XQ(this));
            ViewCompat.C(this, cn3);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void ViF(int i2) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof MenuBuilder;
        if (z2) {
            ((MenuBuilder) menu).dR0();
        }
        super.ViF(i2);
        if (z2) {
            ((MenuBuilder) menu).k();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fuX.O(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        super.onLayout(z2, i2, i3, i5, i7);
        E();
        FX();
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f3) {
        super.setElevation(f3);
        fuX.nr(this, f3);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(M(drawable));
    }

    public void setNavigationIconTint(@ColorInt int i2) {
        this.n1 = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }
}
