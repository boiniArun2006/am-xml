package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class AlertDialogLayout extends LinearLayoutCompat {
    private void iF(View view, int i2, int i3, int i5, int i7) {
        view.layout(i2, i3, i5 + i2, i7 + i3);
    }

    private boolean E2(int i2, int i3) {
        int iCombineMeasuredStates;
        int iFD;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.f13478v) {
                    view = childAt;
                } else if (id == R.id.qie) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.ty && id != R.id.ck) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i2, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i2, 0);
            iFD = fD(view2);
            measuredHeight = view2.getMeasuredHeight() - iFD;
            paddingTop += iFD;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iFD = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i2, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i7 = size - paddingTop;
        if (view2 != null) {
            int i8 = paddingTop - iFD;
            int iMin = Math.min(i7, measuredHeight);
            if (iMin > 0) {
                i7 -= iMin;
                iFD += iMin;
            }
            view2.measure(i2, View.MeasureSpec.makeMeasureSpec(iFD, 1073741824));
            paddingTop = i8 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i7 > 0) {
            view3.measure(i2, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i7, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i2, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i3, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        qie(childCount, i3);
        return true;
    }

    public AlertDialogLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private static int fD(View view) {
        int iG = ViewCompat.g(view);
        if (iG > 0) {
            return iG;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return fD(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void qie(int i2, int i3) {
        int i5;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i7 = 0;
        while (i7 < i2) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i8 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = childAt.getMeasuredHeight();
                    i5 = i3;
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i5, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i8;
                } else {
                    i5 = i3;
                }
            }
            i7++;
            i3 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        int paddingTop;
        int intrinsicHeight;
        int i8;
        int i9;
        int i10;
        int paddingLeft = getPaddingLeft();
        int i11 = i5 - i2;
        int paddingRight = i11 - getPaddingRight();
        int paddingRight2 = (i11 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i12 = gravity & 112;
        int i13 = gravity & 8388615;
        if (i12 != 16) {
            if (i12 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i7) - i3) - measuredHeight;
            }
        } else {
            paddingTop = getPaddingTop() + (((i7 - i3) - measuredHeight) / 2);
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = dividerDrawable.getIntrinsicHeight();
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                int i15 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i15 < 0) {
                    i15 = i13;
                }
                int iRl = GravityCompat.rl(i15, getLayoutDirection()) & 7;
                if (iRl != 1) {
                    if (iRl != 5) {
                        i10 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                        int i16 = i10;
                        if (Z(i14)) {
                            paddingTop += intrinsicHeight;
                        }
                        int i17 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                        iF(childAt, i16, i17, measuredWidth, measuredHeight2);
                        paddingTop = i17 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                    } else {
                        i8 = paddingRight - measuredWidth;
                        i9 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                } else {
                    i8 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    i9 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                }
                i10 = i8 - i9;
                int i162 = i10;
                if (Z(i14)) {
                }
                int i172 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                iF(childAt, i162, i172, measuredWidth, measuredHeight2);
                paddingTop = i172 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (!E2(i2, i3)) {
            super.onMeasure(i2, i3);
        }
    }
}
