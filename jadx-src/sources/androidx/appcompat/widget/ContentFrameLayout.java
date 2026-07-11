package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class ContentFrameLayout extends FrameLayout {
    private TypedValue J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private TypedValue f14171O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Rect f14172S;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OnAttachListener f14173g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TypedValue f14174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TypedValue f14175o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TypedValue f14176r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TypedValue f14177t;

    public interface OnAttachListener {
        void n();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f14176r == null) {
            this.f14176r = new TypedValue();
        }
        return this.f14176r;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f14175o == null) {
            this.f14175o = new TypedValue();
        }
        return this.f14175o;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f14171O == null) {
            this.f14171O = new TypedValue();
        }
        return this.f14171O;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.J2 == null) {
            this.J2 = new TypedValue();
        }
        return this.J2;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f14174n == null) {
            this.f14174n = new TypedValue();
        }
        return this.f14174n;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f14177t == null) {
            this.f14177t = new TypedValue();
        }
        return this.f14177t;
    }

    public void n(int i2, int i3, int i5, int i7) {
        this.f14172S.set(i2, i3, i5, i7);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public void setAttachListener(OnAttachListener onAttachListener) {
        this.f14173g = onAttachListener;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f14172S = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        OnAttachListener onAttachListener = this.f14173g;
        if (onAttachListener != null) {
            onAttachListener.n();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OnAttachListener onAttachListener = this.f14173g;
        if (onAttachListener != null) {
            onAttachListener.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i2, int i3) {
        boolean z2;
        boolean z3;
        TypedValue typedValue;
        int i5;
        int i7;
        float fraction;
        TypedValue typedValue2;
        int i8;
        int i9;
        float fraction2;
        TypedValue typedValue3;
        int i10;
        int i11;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z4 = true;
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z2 = true;
        } else {
            z2 = false;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode == Integer.MIN_VALUE) {
            if (z2) {
                typedValue3 = this.J2;
            } else {
                typedValue3 = this.f14171O;
            }
            if (typedValue3 != null && (i10 = typedValue3.type) != 0) {
                if (i10 == 5) {
                    fraction3 = typedValue3.getDimension(displayMetrics);
                } else if (i10 == 6) {
                    int i12 = displayMetrics.widthPixels;
                    fraction3 = typedValue3.getFraction(i12, i12);
                } else {
                    i11 = 0;
                    if (i11 <= 0) {
                        Rect rect = this.f14172S;
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i11 - (rect.left + rect.right), View.MeasureSpec.getSize(i2)), 1073741824);
                        z3 = true;
                    }
                }
                i11 = (int) fraction3;
                if (i11 <= 0) {
                }
            }
        } else {
            z3 = false;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (z2) {
                typedValue2 = this.f14176r;
            } else {
                typedValue2 = this.f14175o;
            }
            if (typedValue2 != null && (i8 = typedValue2.type) != 0) {
                if (i8 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else if (i8 == 6) {
                    int i13 = displayMetrics.heightPixels;
                    fraction2 = typedValue2.getFraction(i13, i13);
                } else {
                    i9 = 0;
                    if (i9 > 0) {
                        Rect rect2 = this.f14172S;
                        i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i9 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i3)), 1073741824);
                    }
                }
                i9 = (int) fraction2;
                if (i9 > 0) {
                }
            }
        }
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z3 && mode == Integer.MIN_VALUE) {
            if (z2) {
                typedValue = this.f14177t;
            } else {
                typedValue = this.f14174n;
            }
            if (typedValue != null && (i5 = typedValue.type) != 0) {
                if (i5 == 5) {
                    fraction = typedValue.getDimension(displayMetrics);
                } else if (i5 == 6) {
                    int i14 = displayMetrics.widthPixels;
                    fraction = typedValue.getFraction(i14, i14);
                } else {
                    i7 = 0;
                    if (i7 > 0) {
                        Rect rect3 = this.f14172S;
                        i7 -= rect3.left + rect3.right;
                    }
                    if (measuredWidth >= i7) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                    }
                }
                i7 = (int) fraction;
                if (i7 > 0) {
                }
                if (measuredWidth >= i7) {
                }
            }
        } else {
            z4 = false;
        }
        if (z4) {
            super.onMeasure(iMakeMeasureSpec, i3);
        }
    }
}
