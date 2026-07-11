package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f14168O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f14169n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f14170t;

    private boolean rl() {
        return this.f14170t;
    }

    private void setStacked(boolean z2) {
        if (this.f14170t != z2) {
            if (!z2 || this.f14169n) {
                this.f14170t = z2;
                setOrientation(z2 ? 1 : 0);
                setGravity(z2 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.E2);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z2 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f14169n != z2) {
            this.f14169n = z2;
            if (!z2 && rl()) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    public ButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14168O = -1;
        int[] iArr = R.styleable.kSg;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.ijL(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f14169n = typedArrayObtainStyledAttributes.getBoolean(R.styleable.f13513W, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f14169n);
        }
    }

    private int n(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec;
        boolean z2;
        int size = View.MeasureSpec.getSize(i2);
        int paddingBottom = 0;
        if (this.f14169n) {
            if (size > this.f14168O && rl()) {
                setStacked(false);
            }
            this.f14168O = size;
        }
        if (!rl() && View.MeasureSpec.getMode(i2) == 1073741824) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        } else {
            iMakeMeasureSpec = i2;
            z2 = false;
        }
        super.onMeasure(iMakeMeasureSpec, i3);
        if (this.f14169n && !rl() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z2 = true;
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int iN = n(0);
        if (iN >= 0) {
            View childAt = getChildAt(iN);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (rl()) {
                int iN2 = n(iN + 1);
                if (iN2 >= 0) {
                    paddingTop += getChildAt(iN2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (ViewCompat.g(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i3 == 0) {
                super.onMeasure(i2, i3);
            }
        }
    }
}
