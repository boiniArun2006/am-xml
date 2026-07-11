package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@RestrictTo
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final Interpolator f14273T = new DecelerateInterpolator();
    private int E2;
    private Spinner J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    LinearLayoutCompat f14274O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    int f14275S;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ViewPropertyAnimator f14276e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14277g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Runnable f14278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f14279o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f14280r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TabClickListener f14281t;

    private class TabAdapter extends BaseAdapter {
        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        TabAdapter() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView.this.f14274O.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            return ((TabView) ScrollingTabContainerView.this.f14274O.getChildAt(i2)).rl();
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.t((ActionBar.Tab) getItem(i2), true);
            }
            ((TabView) view).n((ActionBar.Tab) getItem(i2));
            return view;
        }
    }

    private class TabClickListener implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((TabView) view).rl().J2();
            int childCount = ScrollingTabContainerView.this.f14274O.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = ScrollingTabContainerView.this.f14274O.getChildAt(i2);
                childAt.setSelected(childAt == view);
            }
        }

        TabClickListener() {
        }
    }

    private class TabView extends LinearLayout {
        private ImageView J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private TextView f14286O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int[] f14287n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private View f14289r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private ActionBar.Tab f14290t;

        /* JADX WARN: Illegal instructions before constructor call */
        public TabView(Context context, ActionBar.Tab tab, boolean z2) {
            int i2 = R.attr.nr;
            super(context, null, i2);
            int[] iArr = {android.R.attr.background};
            this.f14287n = iArr;
            this.f14290t = tab;
            TintTypedArray tintTypedArrayS = TintTypedArray.S(context, null, iArr, i2, 0);
            if (tintTypedArrayS.o(0)) {
                setBackgroundDrawable(tintTypedArrayS.Uo(0));
            }
            tintTypedArrayS.aYN();
            if (z2) {
                setGravity(8388627);
            }
            t();
        }

        public void n(ActionBar.Tab tab) {
            this.f14290t = tab;
            t();
        }

        public ActionBar.Tab rl() {
            return this.f14290t;
        }

        public void t() {
            ActionBar.Tab tab = this.f14290t;
            View viewRl = tab.rl();
            if (viewRl != null) {
                ViewParent parent = viewRl.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewRl);
                    }
                    addView(viewRl);
                }
                this.f14289r = viewRl;
                TextView textView = this.f14286O;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.J2;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.J2.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f14289r;
            if (view != null) {
                removeView(view);
                this.f14289r = null;
            }
            Drawable drawableT = tab.t();
            CharSequence charSequenceO = tab.O();
            if (drawableT != null) {
                if (this.J2 == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.J2 = appCompatImageView;
                }
                this.J2.setImageDrawable(drawableT);
                this.J2.setVisibility(0);
            } else {
                ImageView imageView2 = this.J2;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.J2.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceO);
            if (zIsEmpty) {
                TextView textView2 = this.f14286O;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f14286O.setText((CharSequence) null);
                }
            } else {
                if (this.f14286O == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.f13426O);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f14286O = appCompatTextView;
                }
                this.f14286O.setText(charSequenceO);
                this.f14286O.setVisibility(0);
            }
            ImageView imageView3 = this.J2;
            if (imageView3 != null) {
                imageView3.setContentDescription(tab.n());
            }
            TooltipCompat.n(this, zIsEmpty ? tab.n() : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (ScrollingTabContainerView.this.f14279o > 0) {
                int measuredWidth = getMeasuredWidth();
                int i5 = ScrollingTabContainerView.this.f14279o;
                if (measuredWidth > i5) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i3);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z2) {
            boolean z3;
            if (isSelected() != z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            super.setSelected(z2);
            if (z3 && z2) {
                sendAccessibilityEvent(4);
            }
        }
    }

    protected class VisibilityAnimListener extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14291n;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ScrollingTabContainerView f14292t;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f14291n = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f14291n) {
                return;
            }
            ScrollingTabContainerView scrollingTabContainerView = this.f14292t;
            scrollingTabContainerView.f14276e = null;
            scrollingTabContainerView.setVisibility(this.rl);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f14292t.setVisibility(0);
            this.f14291n = false;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    private boolean nr() {
        Spinner spinner = this.J2;
        return spinner != null && spinner.getParent() == this;
    }

    private Spinner rl() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.KN);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public void n(int i2) {
        final View childAt = this.f14274O.getChildAt(i2);
        Runnable runnable = this.f14278n;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: androidx.appcompat.widget.ScrollingTabContainerView.1
            @Override // java.lang.Runnable
            public void run() {
                ScrollingTabContainerView.this.smoothScrollTo(childAt.getLeft() - ((ScrollingTabContainerView.this.getWidth() - childAt.getWidth()) / 2), 0);
                ScrollingTabContainerView.this.f14278n = null;
            }
        };
        this.f14278n = runnable2;
        post(runnable2);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        ((TabView) view).rl().J2();
    }

    public void setAllowCollapse(boolean z2) {
        this.f14280r = z2;
    }

    public void setContentHeight(int i2) {
        this.f14277g = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.E2 = i2;
        int childCount = this.f14274O.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = this.f14274O.getChildAt(i3);
            boolean z2 = i3 == i2;
            childAt.setSelected(z2);
            if (z2) {
                n(i2);
            }
            i3++;
        }
        Spinner spinner = this.J2;
        if (spinner == null || i2 < 0) {
            return;
        }
        spinner.setSelection(i2);
    }

    TabView t(ActionBar.Tab tab, boolean z2) {
        TabView tabView = new TabView(getContext(), tab, z2);
        if (z2) {
            tabView.setBackgroundDrawable(null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.f14277g));
            return tabView;
        }
        tabView.setFocusable(true);
        if (this.f14281t == null) {
            this.f14281t = new TabClickListener();
        }
        tabView.setOnClickListener(this.f14281t);
        return tabView;
    }

    private boolean J2() {
        if (!nr()) {
            return false;
        }
        removeView(this.J2);
        addView(this.f14274O, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.J2.getSelectedItemPosition());
        return false;
    }

    private void O() {
        if (nr()) {
            return;
        }
        if (this.J2 == null) {
            this.J2 = rl();
        }
        removeView(this.f14274O);
        addView(this.J2, new ViewGroup.LayoutParams(-2, -1));
        if (this.J2.getAdapter() == null) {
            this.J2.setAdapter((SpinnerAdapter) new TabAdapter());
        }
        Runnable runnable = this.f14278n;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f14278n = null;
        }
        this.J2.setSelection(this.E2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f14278n;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionBarPolicy actionBarPolicyRl = ActionBarPolicy.rl(getContext());
        setContentHeight(actionBarPolicyRl.J2());
        this.f14275S = actionBarPolicyRl.O();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f14278n;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        boolean z2;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            z2 = true;
        } else {
            z2 = false;
        }
        setFillViewport(z2);
        int childCount = this.f14274O.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f14279o = (int) (View.MeasureSpec.getSize(i2) * 0.4f);
            } else {
                this.f14279o = View.MeasureSpec.getSize(i2) / 2;
            }
            this.f14279o = Math.min(this.f14279o, this.f14275S);
        } else {
            this.f14279o = -1;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f14277g, 1073741824);
        if (!z2 && this.f14280r) {
            this.f14274O.measure(0, iMakeMeasureSpec);
            if (this.f14274O.getMeasuredWidth() > View.MeasureSpec.getSize(i2)) {
                O();
            } else {
                J2();
            }
        } else {
            J2();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.E2);
        }
    }
}
