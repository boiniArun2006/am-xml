package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class ActionBarContainer extends FrameLayout {
    boolean E2;
    private View J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private View f13931O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    Drawable f13932S;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f13933e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f13934g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f13935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f13936o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Drawable f13937r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f13938t;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @RequiresApi
    private static class Api21Impl {
        public static void n(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    private boolean rl(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public View getTabContainer() {
        return this.f13938t;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f13935n || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i5;
        if (this.f13931O == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i5 = this.f13933e) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f13931O == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        View view = this.f13938t;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!rl(this.f13931O) ? n(this.f13931O) : !rl(this.J2) ? n(this.J2) : 0) + n(this.f13938t), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f13937r;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f13937r);
        }
        this.f13937r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f13931O;
            if (view != null) {
                this.f13937r.setBounds(view.getLeft(), this.f13931O.getTop(), this.f13931O.getRight(), this.f13931O.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f13934g ? !(this.f13937r != null || this.f13936o != null) : this.f13932S == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        Api21Impl.n(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f13932S;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f13932S);
        }
        this.f13932S = drawable;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f13934g && (drawable2 = this.f13932S) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f13934g ? !(this.f13937r != null || this.f13936o != null) : this.f13932S == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        Api21Impl.n(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f13936o;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f13936o);
        }
        this.f13936o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.E2 && (drawable2 = this.f13936o) != null) {
                drawable2.setBounds(this.f13938t.getLeft(), this.f13938t.getTop(), this.f13938t.getRight(), this.f13938t.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f13934g ? !(this.f13937r != null || this.f13936o != null) : this.f13932S == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        Api21Impl.n(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f13938t;
        if (view != null) {
            removeView(view);
        }
        this.f13938t = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z2) {
        this.f13935n = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f13937r && !this.f13934g) {
            return true;
        }
        if (drawable == this.f13936o && this.E2) {
            return true;
        }
        return (drawable == this.f13932S && this.f13934g) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new ActionBarBackgroundDrawable(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f13531n);
        this.f13937r = typedArrayObtainStyledAttributes.getDrawable(R.styleable.rl);
        this.f13936o = typedArrayObtainStyledAttributes.getDrawable(R.styleable.nr);
        this.f13933e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.mUb, -1);
        boolean z2 = true;
        if (getId() == R.id.f13472e) {
            this.f13934g = true;
            this.f13932S = typedArrayObtainStyledAttributes.getDrawable(R.styleable.f13535t);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f13934g ? this.f13937r != null || this.f13936o != null : this.f13932S != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
    }

    private int n(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13937r;
        if (drawable != null && drawable.isStateful()) {
            this.f13937r.setState(getDrawableState());
        }
        Drawable drawable2 = this.f13936o;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f13936o.setState(getDrawableState());
        }
        Drawable drawable3 = this.f13932S;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f13932S.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13937r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f13936o;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f13932S;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f13931O = findViewById(R.id.f13474n);
        this.J2 = findViewById(R.id.J2);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        boolean z3;
        Drawable drawable;
        super.onLayout(z2, i2, i3, i5, i7);
        View view = this.f13938t;
        boolean z4 = true;
        boolean z5 = false;
        if (view != null && view.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i8 = layoutParams.bottomMargin;
            view.layout(i2, measuredHeight2 - i8, i5, measuredHeight - i8);
        }
        if (this.f13934g) {
            Drawable drawable2 = this.f13932S;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = z5;
            }
        } else {
            if (this.f13937r != null) {
                if (this.f13931O.getVisibility() == 0) {
                    this.f13937r.setBounds(this.f13931O.getLeft(), this.f13931O.getTop(), this.f13931O.getRight(), this.f13931O.getBottom());
                } else {
                    View view2 = this.J2;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f13937r.setBounds(this.J2.getLeft(), this.J2.getTop(), this.J2.getRight(), this.J2.getBottom());
                    } else {
                        this.f13937r.setBounds(0, 0, 0, 0);
                    }
                }
                z5 = true;
            }
            this.E2 = z3;
            if (z3 && (drawable = this.f13936o) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        boolean z2;
        super.setVisibility(i2);
        if (i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.f13937r;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f13936o;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f13932S;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }
}
