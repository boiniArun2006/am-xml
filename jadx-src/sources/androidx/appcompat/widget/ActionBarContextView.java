package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public class ActionBarContextView extends AbsActionBarView {
    private CharSequence E2;
    private int M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private View f13939N;
    private int P5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private View f13940T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private TextView f13941U;
    private LinearLayout Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f13942e;
    private int eF;
    private TextView jB;
    private boolean p5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f13943v;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.gh);
    }

    private void mUb() {
        if (this.Xw == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.f13481n, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.Xw = linearLayout;
            this.jB = (TextView) linearLayout.findViewById(R.id.f13467O);
            this.f13941U = (TextView) this.Xw.findViewById(R.id.nr);
            if (this.P5 != 0) {
                this.jB.setTextAppearance(getContext(), this.P5);
            }
            if (this.M7 != 0) {
                this.f13941U.setTextAppearance(getContext(), this.M7);
            }
        }
        this.jB.setText(this.E2);
        this.f13941U.setText(this.f13942e);
        boolean zIsEmpty = TextUtils.isEmpty(this.E2);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f13942e);
        this.f13941U.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.Xw.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.Xw.getParent() == null) {
            addView(this.Xw);
        }
    }

    public void KN() {
        if (this.f13940T == null) {
            qie();
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean Uo() {
        ActionMenuPresenter actionMenuPresenter = this.J2;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.rV9();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public CharSequence getSubtitle() {
        return this.f13942e;
    }

    public CharSequence getTitle() {
        return this.E2;
    }

    public boolean gh() {
        return this.p5;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i2) {
        this.f13925r = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f13943v;
        if (view2 != null) {
            removeView(view2);
        }
        this.f13943v = view;
        if (view != null && (linearLayout = this.Xw) != null) {
            removeView(linearLayout);
            this.Xw = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f13942e = charSequence;
        mUb();
    }

    public void setTitle(CharSequence charSequence) {
        this.E2 = charSequence;
        mUb();
        ViewCompat.ofS(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.p5) {
            requestLayout();
        }
        this.p5 = z2;
    }

    public void xMQ(final ActionMode actionMode) {
        View view = this.f13940T;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.eF, (ViewGroup) this, false);
            this.f13940T = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f13940T);
        }
        View viewFindViewById = this.f13940T.findViewById(R.id.xMQ);
        this.f13939N = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.ActionBarContextView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                actionMode.t();
            }
        });
        MenuBuilder menuBuilder = (MenuBuilder) actionMode.O();
        ActionMenuPresenter actionMenuPresenter = this.J2;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.te();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.J2 = actionMenuPresenter2;
        actionMenuPresenter2.v(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuBuilder.t(this.J2, this.f13926t);
        ActionMenuView actionMenuView = (ActionMenuView) this.J2.r(this);
        this.f13920O = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f13920O, layoutParams);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context, attributeSet, R.styleable.ViF, i2, 0);
        setBackground(tintTypedArrayS.Uo(R.styleable.nY));
        this.P5 = tintTypedArrayS.ty(R.styleable.fD, 0);
        this.M7 = tintTypedArrayS.ty(R.styleable.iF, 0);
        this.f13925r = tintTypedArrayS.az(R.styleable.te, 0);
        this.eF = tintTypedArrayS.ty(R.styleable.f13524g, R.layout.nr);
        tintTypedArrayS.aYN();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ ViewPropertyAnimatorCompat J2(int i2, long j2) {
        return super.J2(i2, j2);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.J2;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.E2();
            this.J2.e();
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        int paddingLeft;
        int paddingRight;
        int i8;
        int i9;
        boolean zRl = ViewUtils.rl(this);
        if (zRl) {
            paddingLeft = (i5 - i2) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f13940T;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13940T.getLayoutParams();
            if (zRl) {
                i8 = marginLayoutParams.rightMargin;
            } else {
                i8 = marginLayoutParams.leftMargin;
            }
            if (zRl) {
                i9 = marginLayoutParams.leftMargin;
            } else {
                i9 = marginLayoutParams.rightMargin;
            }
            int i10 = i9;
            int iNr = AbsActionBarView.nr(paddingLeft, i8, zRl);
            paddingLeft = AbsActionBarView.nr(iNr + O(this.f13940T, iNr, paddingTop, paddingTop2, zRl), i10, zRl);
        }
        int iO = paddingLeft;
        LinearLayout linearLayout = this.Xw;
        if (linearLayout != null && this.f13943v == null && linearLayout.getVisibility() != 8) {
            iO += O(this.Xw, iO, paddingTop, paddingTop2, zRl);
        }
        View view2 = this.f13943v;
        if (view2 != null) {
            O(view2, iO, paddingTop, paddingTop2, zRl);
        }
        if (zRl) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i5 - i2) - getPaddingRight();
        }
        int i11 = paddingRight;
        ActionMenuView actionMenuView = this.f13920O;
        if (actionMenuView != null) {
            O(actionMenuView, i11, paddingTop, paddingTop2, !zRl);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int i5;
        boolean z2;
        int i7;
        int i8 = 1073741824;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            if (View.MeasureSpec.getMode(i3) != 0) {
                int size = View.MeasureSpec.getSize(i2);
                int size2 = this.f13925r;
                if (size2 <= 0) {
                    size2 = View.MeasureSpec.getSize(i3);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int iMin = size2 - paddingTop;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
                View view = this.f13940T;
                if (view != null) {
                    int iT = t(view, paddingLeft, iMakeMeasureSpec, 0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13940T.getLayoutParams();
                    paddingLeft = iT - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f13920O;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = t(this.f13920O, paddingLeft, iMakeMeasureSpec, 0);
                }
                LinearLayout linearLayout = this.Xw;
                if (linearLayout != null && this.f13943v == null) {
                    if (this.p5) {
                        this.Xw.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                        int measuredWidth = this.Xw.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.Xw;
                        if (z2) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        linearLayout2.setVisibility(i7);
                    } else {
                        paddingLeft = t(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
                    }
                }
                View view2 = this.f13943v;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i9 = layoutParams.width;
                    if (i9 != -2) {
                        i5 = 1073741824;
                    } else {
                        i5 = Integer.MIN_VALUE;
                    }
                    if (i9 >= 0) {
                        paddingLeft = Math.min(i9, paddingLeft);
                    }
                    int i10 = layoutParams.height;
                    if (i10 == -2) {
                        i8 = Integer.MIN_VALUE;
                    }
                    if (i10 >= 0) {
                        iMin = Math.min(i10, iMin);
                    }
                    this.f13943v.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i8));
                }
                if (this.f13925r <= 0) {
                    int childCount = getChildCount();
                    int i11 = 0;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingTop;
                        if (measuredHeight > i11) {
                            i11 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i11);
                    return;
                }
                setMeasuredDimension(size, size2);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void qie() {
        removeAllViews();
        this.f13943v = null;
        this.f13920O = null;
        this.J2 = null;
        View view = this.f13939N;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }
}
